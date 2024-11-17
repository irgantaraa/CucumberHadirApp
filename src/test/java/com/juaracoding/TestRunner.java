package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//"src/main/resources/features/IzinPulangCepat.feature","src/main/resources/features/Cuti.feature"src/main/resources/features/IzinPulangCepat.feature","src/main/resources/features/Cuti.feature",src/main/resources/features/SakitMobile.feature
@CucumberOptions(features = {"src/main/resources/features/IzinPulangCepat.feature","src/main/resources/features/Cuti.feature","src/main/resources/features/Jabatan.feature","src/main/resources/features/SakitMobile.feature","src/main/resources/features/CutiMobile.feature"},
        glue = "com.juaracoding",
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
