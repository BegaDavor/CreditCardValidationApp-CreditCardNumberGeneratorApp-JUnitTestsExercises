package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import creditCard.ValidationTest;
import zadaci.AllTestsZadaci;

@RunWith(Suite.class)
@SuiteClasses({AllTestsZadaci.class, ValidationTest.class})
public class AllTests {

}
