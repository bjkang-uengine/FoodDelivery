package fooddelivery.common;

import fooddelivery.DeleveryApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeleveryApplication.class })
public class CucumberSpingConfiguration {}
