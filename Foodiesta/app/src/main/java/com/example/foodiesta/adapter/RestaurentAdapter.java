package com.example.foodiesta.adapter;

public class RestaurentAdapter {

    private final ActionListener listener;

    public interface ActionListener {
        void onDecrement(int position);
        void onIncrement(int position);
    }
}
