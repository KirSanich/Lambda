package com.company;

import java.util.List;

@FunctionalInterface
public interface Summable<T> {

     T sum(List<T> list);
}
