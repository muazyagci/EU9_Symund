package com.Symund.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
//                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"
//                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        } ,
        features = "src/test/resources/features",
        glue = "com/Symund/step_definitions",
        tags = "@wip"



)
public class CukesRunner {
}
