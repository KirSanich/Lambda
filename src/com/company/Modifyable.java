package com.company;

import java.io.IOException;
import java.util.InputMismatchException;

public interface Modifyable<T extends Number> {

    T modify(T value) throws MyException;
}
