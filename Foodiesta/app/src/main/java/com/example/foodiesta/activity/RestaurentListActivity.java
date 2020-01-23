package com.example.foodiesta.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.foodiesta.R;

import java.util.ArrayList;

public class RestaurentListActivity extends AppCompatActivity  {

    RecyclerView recyclerView;
    RestaurentGridAdapter adapter;
    ArrayList<Restaurent> restaurents = new ArrayList<>();

}

