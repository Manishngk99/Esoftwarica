package com.example.esoftwarica.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esoftwarica.R;
import com.example.esoftwarica.ui.home.HomeFragment;
import com.example.esoftwarica.ui.home.HomeViewModel;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder>{

    Context mContext;
    List<HomeViewModel> studentsList;

    public StudentAdapter(Context mContext, List<HomeViewModel> studentsList) {
        this.mContext = mContext;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_view,parent,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        HomeViewModel homeViewModel = studentsList.get(position);
        holder.tvName.setText(homeViewModel.getImageId());
        holder.tvAge.setText(homeViewModel.getImageId());
        holder.tvAddress.setText(homeViewModel.getImageId());

    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageView;
        TextView tvName, tvAge, tvAddress, gender, btnDelete;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.tvName);
            tvAge = itemView.findViewById(R.id.tvAge);
            tvAddress = itemView.findViewById(R.id.tvAddress);
            gender = itemView.findViewById(R.id.tvGender);
            btnDelete = itemView.findViewById(R.id.btnDelete);
        }
    }

}
