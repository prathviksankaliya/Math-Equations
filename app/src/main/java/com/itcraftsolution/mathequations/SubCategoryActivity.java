package com.itcraftsolution.mathequations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.itcraftsolution.mathequations.databinding.ActivitySubCategoryBinding;

public class SubCategoryActivity extends AppCompatActivity {

    ActivitySubCategoryBinding binding;
    String desc = "";
    String catDesc, catName;
    float formulaAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fetchData();

        binding.btnAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(catName.equals("Square"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty())
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of L!!");
                        binding.txFormulaValue1.requestFocus();
                    }else {
                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        formulaAns = res * res;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Rectangle"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of W!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of H!!");
                        binding.txFormulaValue2.requestFocus();
                    }else{

                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        formulaAns = res * res2;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Triangle"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of B!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of H!!");
                        binding.txFormulaValue2.requestFocus();
                    }else{

                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        formulaAns = (res * res2)/2;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }

                }else if(catName.equals("Circle"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of R!!");
                        binding.txFormulaValue1.requestFocus();
                    }else{

                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        formulaAns = 22/7 * res ;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Cube"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of side!!");
                        binding.txFormulaValue1.requestFocus();
                    }else {

                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        formulaAns = res * res * res ;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Cylinder"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of R!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of H!!");
                        binding.txFormulaValue2.requestFocus();
                    }else{

                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        formulaAns = 22/7 * (res * res) * res2;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Pyramid"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of B!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of H!!");
                        binding.txFormulaValue2.requestFocus();
                    }else{

                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        formulaAns = 3*res *res2;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Regular prism"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of B!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of H!!");
                        binding.txFormulaValue2.requestFocus();
                    }else{

                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        formulaAns =  res * res2;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Arithmetic Sequence"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of a!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of n!!");
                        binding.txFormulaValue2.requestFocus();
                    }else if(binding.txFormulaValue3.getText().toString().isEmpty())
                    {
                        binding.txFormulaValue3.setError("Plz Set Value of d");
                        binding.txFormulaValue3.requestFocus();
                    }else {
                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        int res3 = Integer.parseInt(binding.txFormulaValue3.getText().toString().trim());
                        formulaAns = res + (res2 - 1) * res3;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }

                }else if(catName.equals("Geometric Sequence"))//4
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of a!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty())
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of r!!");
                        binding.txFormulaValue2.requestFocus();
                    }else if (binding.txFormulaValue3.getText().toString().isEmpty())
                    {
                        binding.txFormulaValue3.setError("Plz Set Value of n!!");
                        binding.txFormulaValue3.requestFocus();
                    }else {
                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        int res3 = Integer.parseInt(binding.txFormulaValue3.getText().toString().trim());
                        formulaAns = (float) (res * Math.pow(res2, res3));
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }

                }else if(catName.equals("Simple Interest"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of P!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of R!!");
                        binding.txFormulaValue2.requestFocus();
                    }else if(binding.txFormulaValue3.getText().toString().isEmpty())
                    {
                        binding.txFormulaValue3.setError("Plz Set Value of T");
                        binding.txFormulaValue3.requestFocus();
                    }else{
                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        int res3 = Integer.parseInt(binding.txFormulaValue3.getText().toString().trim());
                        formulaAns = (res * res2 * res3)/100;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Compound Interest"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of P!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of R!!");
                        binding.txFormulaValue2.requestFocus();
                    }else if(binding.txFormulaValue3.getText().toString().isEmpty())
                    {
                        binding.txFormulaValue3.setError("Plz Set Value of T");
                        binding.txFormulaValue3.requestFocus();
                    }else {
                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        int res3 = Integer.parseInt(binding.txFormulaValue3.getText().toString().trim());
                        formulaAns = (float) (res * Math.pow(1 + (res2/100),res3) - res);
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Perimeter of Rectangle"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of L!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of W!!");
                        binding.txFormulaValue2.requestFocus();
                    }else{

                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        formulaAns =  2 * (res + res2);
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Perimeter of Triangle"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of a!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of b!!");
                        binding.txFormulaValue2.requestFocus();
                    }else if(binding.txFormulaValue3.getText().toString().isEmpty())
                    {
                        binding.txFormulaValue3.setError("Plz Set Value of c!!");
                        binding.txFormulaValue3.requestFocus();
                    }else{

                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        int res3 = Integer.parseInt(binding.txFormulaValue3.getText().toString().trim());
                        formulaAns = res + res2 + res3;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Perimeter of Square"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of a!!");
                        binding.txFormulaValue1.requestFocus();
                    }else{

                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        formulaAns = 4 * res;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Percentage"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of V!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of Total Value!!");
                        binding.txFormulaValue2.requestFocus();
                    }else{

                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        formulaAns = (res / res2) * 100 ;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }else if(catName.equals("Percentile"))
                {
                    if(binding.txFormulaValue1.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue1.setError("Plz Set Value of x!!");
                        binding.txFormulaValue1.requestFocus();
                    }else if(binding.txFormulaValue2.getText().toString().isEmpty() )
                    {
                        binding.txFormulaValue2.setError("Plz Set Value of Total Value!!");
                        binding.txFormulaValue2.requestFocus();
                    }else{
                        int res = Integer.parseInt(binding.txFormulaValue1.getText().toString().trim());
                        int res2 = Integer.parseInt(binding.txFormulaValue2.getText().toString().trim());
                        formulaAns = (res / res2) * 100 ;
                        binding.txAns.setText(String.valueOf(formulaAns));
                        binding.llTxAns.setVisibility(View.VISIBLE);
                    }
                }

            }
        });

        binding.igBackToCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void fetchData()
    {
        catName = getIntent().getStringExtra("CategoryName");
        catDesc = getIntent().getStringExtra("CategoryDesc");
        binding.txSubCatName.setText(catName);


        if(catName.equals("Square"))
        {
             desc = catDesc + " \n\n l: length of side";//1
            binding.txInput2.setVisibility(View.GONE);
            binding.txInput1.setHint("Set value of L");

        }else if(catName.equals("Rectangle"))
        {
             desc = catDesc + " \n\n w: width\n h: height";//2
            binding.txInput1.setHint("Set value of W");
            binding.txInput2.setHint("Set value of H");

        }else if(catName.equals("Triangle"))
        {
             desc = catDesc + " \n\n b: base\n h: height";//2
            binding.txInput1.setHint("Set value of B");
            binding.txInput2.setHint("Set value of H");

        }else if(catName.equals("Circle"))
        {
             desc = catDesc + " \n\n r: radius\n p: perimeter";//1
            binding.txInput2.setVisibility(View.GONE);
            binding.txInput1.setHint("Set value of R");

        }else if(catName.equals("Cube"))
        {
             desc = catDesc + " \n\n s: side";//1
            binding.txInput2.setVisibility(View.GONE);
            binding.txInput1.setHint("Set value of S");

        }else if(catName.equals("Cylinder"))
        {
             desc = catDesc + " \n\n r: radius\n h: height";//2
            binding.txInput1.setHint("Set value of R");
            binding.txInput2.setHint("Set value of H");

        }else if(catName.equals("Pyramid"))
        {
             desc = catDesc + " \n\n b: base \n h: height";//2
            binding.txInput1.setHint("Set value of B");
            binding.txInput2.setHint("Set value of H");

        }else if(catName.equals("Regular prism"))
        {
             desc = catDesc + " \n\n b: base \n h: height";//2
            binding.txInput1.setHint("Set value of B");
            binding.txInput2.setHint("Set value of H");

        }else if(catName.equals("Arithmetic Sequence"))
        {
             desc = catDesc + " \n\n a = first term" + //3
                    "\n" +
                    "d = difference" +
                    "\n" +
                    "n = a term which is to be found." +
                    "\n" +
                    "r = common ratio between two terms";
             binding.txInput3.setVisibility(View.VISIBLE);
            binding.txInput1.setHint("Set value of a");
            binding.txInput2.setHint("Set value of d");
            binding.txInput3.setHint("Set value of n");

        }else if(catName.equals("Geometric Sequence"))//3
        {
             desc = catDesc + " \n\n a = first term" +
                    "\n" +
                    "d = difference" +
                    "\n" +
                    "n = a term which is to be found." +
                    "\n" +
                    "r = common ratio between two terms";

            binding.txInput3.setVisibility(View.VISIBLE);
            binding.txInput1.setHint("Set value of a");
            binding.txInput2.setHint("Set value of d");
            binding.txInput3.setHint("Set value of r");

        }else if(catName.equals("Simple Interest"))
        {
            desc = catDesc + " \n\n = Principal × Rate × Time";//3
            binding.txInput3.setVisibility(View.VISIBLE);
            binding.txInput1.setHint("Set value of P");
            binding.txInput2.setHint("Set value of R");
            binding.txInput3.setHint("Set value of T");

        }else if(catName.equals("Compound Interest"))
        {
            desc = catDesc + " \n\n Principal (1 + Rate)^Time − Principal";//3
            binding.txInput3.setVisibility(View.VISIBLE);
            binding.txInput1.setHint("Set value of P");
            binding.txInput2.setHint("Set value of R");
            binding.txInput3.setHint("Set value of T");

        }else if(catName.equals("Perimeter of Rectangle"))
        {
             desc = catDesc + " \n\n Perimeter of a rectangle = 2(Length + Width) square units";//2
            binding.txInput1.setHint("Set value of L");
            binding.txInput2.setHint("Set value of W");

        }else if(catName.equals("Perimeter of Triangle"))
        {
             desc = catDesc + " \n\n Perimeter = Sum of the three sides";//3
            binding.txInput3.setVisibility(View.VISIBLE);
            binding.txInput1.setHint("Set value of a");
            binding.txInput2.setHint("Set value of b");
            binding.txInput3.setHint("Set value of c");
        }else if(catName.equals("Perimeter of Square"))
        {
             desc = catDesc + " \n\n Perimeter of Square (P) = 4 × Side";//1
            binding.txInput2.setVisibility(View.GONE);
            binding.txInput1.setHint("Set value of a");
        }else if(catName.equals("Percentage"))
        {
            desc = catDesc + " \n\n Percentage = (Value ⁄ Total Value) × 100";//2
            binding.txInput1.setHint("Set value of V");
            binding.txInput2.setHint("Set value of Total Value");

        }else if(catName.equals("Percentile"))
        {
            desc = catDesc + " \n\n n = Ordinal rank of the given value or value below the number" +//2
                    "\n" +
                    "N = Number of values in the data set" +
                    "\n" +
                    "P = Percentile " +
                    "\n" +
                    "Rank = Percentile/100";
            binding.txInput1.setHint("Set value of x");
            binding.txInput2.setHint("Set value of Total Value");
        }

        binding.txSubCatDesc.setText(desc);
    }
}