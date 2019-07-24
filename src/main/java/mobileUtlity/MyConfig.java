package mobileUtlity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"mobileUtlity","Steps"})
@PropertySource("mobileApp.properties")
public class MyConfig {
}