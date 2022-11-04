package com.itcraftsolution.mathequations;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.itcraftsolution.mathequations.databinding.SampleCategoryBinding;

import java.util.List;

public class RvCategoryAdapter extends RecyclerView.Adapter<RvCategoryAdapter.viewHolder> {
    Context context;
    List<Category> list;
    boolean isCategory = false;

    public RvCategoryAdapter(Context context, List<Category> list, boolean isCategory) {
        this.context = context;
        this.list = list;
        this.isCategory = isCategory;
    }

    @NonNull
    @Override
    public RvCategoryAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_category, parent , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RvCategoryAdapter.viewHolder holder, int position) {

        Category category = list.get(position);
        holder.binding.txFormulaName.setText(category.getCatName());
        holder.binding.txFormulaDesc.setText(category.getCatDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isCategory)
                {
                    Intent intent = new Intent(context, SubCategoryActivity.class);
                    intent.putExtra("CategoryName", category.getCatName());
                    intent.putExtra("CategoryDesc", category.getCatDesc());
                    context.startActivity(intent);
                }else{
                    Intent intent = new Intent(context, CategoryActivity.class);
                    intent.putExtra("Category", category.getCatName());
                    context.startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        SampleCategoryBinding binding;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = SampleCategoryBinding.bind(itemView);
        }
    }
}
