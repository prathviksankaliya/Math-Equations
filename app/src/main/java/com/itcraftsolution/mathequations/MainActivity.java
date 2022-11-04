package com.itcraftsolution.mathequations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.itcraftsolution.mathequations.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    RvCategoryAdapter adapter;
    List<Category> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list = new ArrayList<>();
        list.add(new Category("Areas Formula", "Area is the size of a two-dimensional surface. It is defined as the amount of two-dimensional space occupied by an object."));
        list.add(new Category("Volumes Formula", "The volume of an object is the amount of space occupied by the object or shape, which is in three-dimensional space. It is usually measured in terms of cubic units."));
        list.add(new Category("Sequences Formula", "Sequence formula mainly refers to either geometric sequence formula or arithmetic sequence formula. To recall, all sequences are an ordered list of numbers."));
        list.add(new Category("Interest Formula", "Interest formulas mainly refer to the formulas of simple and compound interests. The simple interest (SI) is a type of interest that is applied to the amount borrowed or invested for the entire duration of the loan, without taking any other factors into account, such as past interest (paid or charged) or any other financial considerations"));
        list.add(new Category("Perimeter Formula", "Area is the size of a two-dimensional surface. It is defined as the amount of two-dimensional space occupied by an object."));
        list.add(new Category("Percentage & Percentile Formula", "Area is the size of a two-dimensional surface. It is defined as the amount of two-dimensional space occupied by an object."));

        adapter = new RvCategoryAdapter(MainActivity.this, list, false);
        binding.rvFormula.setAdapter(adapter);
        binding.rvFormula.setLayoutManager(new LinearLayoutManager(this));
    }
}