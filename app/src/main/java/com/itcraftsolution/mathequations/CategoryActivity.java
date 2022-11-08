package com.itcraftsolution.mathequations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.hardware.lights.LightState;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.itcraftsolution.mathequations.databinding.ActivityCategoryBinding;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    ActivityCategoryBinding binding;
    RvCategoryAdapter adapter;
    List<Category> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list = new ArrayList<>();
        showData();

        binding.igBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
    private void showData()
    {
        String isCategory = getIntent().getStringExtra("Category");
        binding.txFormulaTitle.setText(String.valueOf(isCategory +" Category"));
        if(isCategory.equals("Areas Formula"))
        {
            list.add(new Category("Square", "A = l²"));
            list.add(new Category("Rectangle", "A = w * h"));
            list.add(new Category("Triangle", "A = (b * h)/2"));
            list.add(new Category("Circle", "A = πr²"));
            setRecyclerView(list);
        }else if(isCategory.equals("Volumes Formula")){
            list.add(new Category("Cube", "V = s^3"));
            list.add(new Category("Cylinder", "V = πr² * h"));
            list.add(new Category("Pyramid", "V = 3 * b * h"));
            list.add(new Category("Regular prism", "V = b * h"));
            setRecyclerView(list);
        }else if(isCategory.equals("Sequences Formula")){
            list.add(new Category("Arithmetic Sequence", "an = a1 + (n − 1)d"));
            list.add(new Category("Geometric Sequence", "an = a1 * r^(n − 1)"));
            setRecyclerView(list);
        }else if(isCategory.equals("Interest Formula")){
            list.add(new Category("Simple Interest", "FV = P * (1 + r + t)"));
            list.add(new Category("Compound Interest", "FV = P * (1 + r) ^ t"));
            setRecyclerView(list);
        }else if(isCategory.equals("Perimeter Formula")){
            list.add(new Category("Perimeter of Rectangle", "PR = 2(length + width)"));
            list.add(new Category("Perimeter of Triangle", "PT = a + b + c"));
            list.add(new Category("Perimeter of Square", "PS = a + b + c + d"));
            setRecyclerView(list);
        }else{
            list.add(new Category("Percentage", "Percentage = (Value ⁄ Total Value) × 100"));
            list.add(new Category("Percentile", "(Number of Values Below “x” / Total Number of Values) × 100"));
            setRecyclerView(list);
        }
    }
    private void setRecyclerView(List<Category> list)
    {
        adapter = new RvCategoryAdapter(CategoryActivity.this, list, true);
        binding.rvCategory.setAdapter(adapter);
        binding.rvCategory.setLayoutManager(new LinearLayoutManager(CategoryActivity.this));
    }
}