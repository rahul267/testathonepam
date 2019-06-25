package StoryRunners;

import Steps.* ;
import com.epam.reportportal.jbehave.ReportPortalFormat;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.parsers.RegexPrefixCapturingPatternParser;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.SilentStepMonitor;
import org.jbehave.core.steps.spring.SpringApplicationContextFactory;
import org.jbehave.core.steps.spring.SpringStepsFactory;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import Steps.*;


import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import org.jbehave.core.reporters.Format;

//@RunWith(JUnitReportingRunner.class)

@UsingEmbedder(metaFilters = "skip")

public class
RunAllStories extends JUnitStories {


    @Override
    public Configuration configuration() {
        LoadFromClasspath resourceLoader = new LoadFromClasspath(this.getClass().getClassLoader());
        return new MostUsefulConfiguration()
                .useStoryLoader(resourceLoader)
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        .withDefaultFormats()
                        .withFormats(Format.CONSOLE, Format.STATS, Format.HTML,ReportPortalFormat
                                .INSTANCE)
                        .withCrossReference(new CrossReference()))
                .useStepPatternParser(new RegexPrefixCapturingPatternParser(
                        "%")) // use '%' instead of '$' to identify parameters
                .useStepMonitor(new SilentStepMonitor());
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new MySteps(), new GetApiSteps());
    }

//    @Override
//    public InjectableStepsFactory stepsFactory() {
//        return new SpringStepsFactory(configuration(), createContext());
//    }
//
//    protected ApplicationContext createContext() {
//        return new SpringApplicationContextFactory("steps.xml")
//                .createApplicationContext();
//    }

    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), "**/*.story", "");
    }


}
