package com.indeed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
//                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
//                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        } ,
        features = "src/test/resources/features",
        glue = "com/indeed/step_definitions",
        tags = "@SYMU-1607",
        dryRun = false


)
public class CukesRunner {
}
