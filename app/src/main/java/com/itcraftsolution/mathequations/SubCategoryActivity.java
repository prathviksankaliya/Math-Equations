package com.itcraftsolution.mathequations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.itcraftsolution.mathequations.databinding.ActivitySubCategoryBinding;

public class SubCategoryActivity extends AppCompatActivity {

    ActivitySubCategoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fetchData();

        binding.igBackToCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void fetchData()
    {
        String catName = getIntent().getStringExtra("CategoryName");
        String catDesc = getIntent().getStringExtra("CategoryDesc");
        binding.txSubCatName.setText(catName);
        String desc = "";

        if(catName.equals("Square"))
        {
             desc = catDesc + " \n\n l: length of side";

        }else if(catName.equals("Rectangle"))
        {
             desc = catDesc + " \n\n w: width\n h: height";
        }else if(catName.equals("Triangle"))
        {
             desc = catDesc + " \n\n b: base\n h: height";
        }else if(catName.equals("Circle"))
        {
             desc = catDesc + " \n\n r: radius\n p: perimeter";
        }else if(catName.equals("Cube"))
        {
             desc = catDesc + " \n\n s: side";
        }else if(catName.equals("Cylinder"))
        {
             desc = catDesc + " \n\n r: radius\n h: height";
        }else if(catName.equals("Pyramid"))
        {
             desc = catDesc + " \n\n b: base \n h: height";
        }else if(catName.equals("Regular prism"))
        {
             desc = catDesc + " \n\n b: base \n h: height";
        }else if(catName.equals("Arithmetic Sequence"))
        {
             desc = catDesc + " \n\n a = first term" +
                    "\n" +
                    "d = difference" +
                    "\n" +
                    "n = a term which is to be found." +
                    "\n" +
                    "r = common ratio between two terms";
        }else if(catName.equals("Geometric Sequence"))
        {
             desc = catDesc + " \n\n a = first term" +
                    "\n" +
                    "d = difference" +
                    "\n" +
                    "n = a term which is to be found." +
                    "\n" +
                    "r = common ratio between two terms";
        }else if(catName.equals("Simple Interest"))
        {
            desc = catDesc + " \n\n = Principal × Rate × Time";
        }else if(catName.equals("Compound Interest"))
        {
            desc = catDesc + " \n\n Principal (1 + Rate)^Time − Principal";
        }else if(catName.equals("Perimeter of Rectangle"))
        {
             desc = catDesc + " \n\n Perimeter of a rectangle = 2(Length + Width) square units";
        }else if(catName.equals("Perimeter of Triangle"))
        {
             desc = catDesc + " \n\n Perimeter = Sum of the three sides";
        }else if(catName.equals("Perimeter of Square"))
        {
             desc = catDesc + " \n\n Perimeter of Square (P) = 4 × Side";
        }else if(catName.equals("Percentage"))
        {
             desc = catDesc + " \n\n n = Ordinal rank of the given value or value below the number" +
                     "\n" +
                     "N = Number of values in the data set" +
                     "\n" +
                     "P = Percentile " +
                     "\n" +
                     "Rank = Percentile/100";
        }else if(catName.equals("Percentile"))
        {
             desc = catDesc + " \n\n Percentage = (Value ⁄ Total Value) × 100";
        }

        binding.txSubCatDesc.setText(desc);
    }
}