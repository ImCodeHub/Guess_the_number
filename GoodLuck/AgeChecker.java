package GoodLuck;

import CustomException.AgeCheckException;

import java.io.IO;

public class AgeChecker {
    public void checkAge(int age) throws AgeCheckException {
        if (age < 18) {
            throw new AgeCheckException("Access denied - you must be at least 18 years old."); //explicitly throwing the exception

        } else {
            IO.println("Access Granted: you can vote");
        }
    }
}
