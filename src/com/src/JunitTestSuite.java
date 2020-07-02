package com.src;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestJunit1.class,
        TestJunit2.class
})

public class JunitTestSuite {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}