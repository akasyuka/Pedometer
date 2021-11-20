package ru.learnup.javaqa.taxpayer.HW24;

import java.util.HashMap;

public class StepsManager {
    private int MAX_STEPS = 1000;
    private HashMap<Integer, Integer> list = new HashMap<>();

    public void setDay(int day) {
        list.put(day, 0);
    }

    public int add(int day, int steps) {
        list.put(day, steps + list.get(day));
        return (MAX_STEPS - list.get(day));
    }
}