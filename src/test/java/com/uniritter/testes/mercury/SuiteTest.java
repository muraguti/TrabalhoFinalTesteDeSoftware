package com.uniritter.testes.mercury;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CheckRegister.class,CheckSignOn.class, CheckFlightFinder.class, CheckSelectFlight.class, CheckBookAFlight.class})

public class SuiteTest {
}
