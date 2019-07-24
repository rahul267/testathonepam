package StoryRunners;

import Steps.MobileSteps;
import Steps.UIAdminSteps;
import mobileUtlity.MobileContext;
import mobileUtlity.MyConfig;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.parsers.RegexPrefixCapturingPatternParser;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.SilentStepMonitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

public class RunMobileStories extends JUnitStories {


    public RunMobileStories() {
        MobileContext.annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
    }


    @Override
    public Configuration configuration() {

        LoadFromClasspath resourceLoader = new LoadFromClasspath(this.getClass().getClassLoader());
        return new MostUsefulConfiguration()
                .useStoryLoader(resourceLoader)
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        .withDefaultFormats()
                        .withFormats(Format.CONSOLE, Format.STATS, Format.HTML
                        )
                        .withCrossReference(new CrossReference()))
                .useStepMonitor(new SilentStepMonitor());
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new MobileSteps());
    }


    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), "**/MobileStory/*.story", "");

    }
}
