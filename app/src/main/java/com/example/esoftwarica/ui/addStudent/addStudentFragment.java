package com.example.esoftwarica.ui.addStudent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.esoftwarica.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class addStudentFragment extends Fragment {

    private addStudentViewModel addStudentViewModel;
    CircleImageView imageView;
    TextView tvName, tvAge, tvAddress, gender, btnSave;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);


        imageView = root.findViewById(R.id.imageView);
        tvName = root.findViewById(R.id.tvName);
        tvAge = root.findViewById(R.id.tvAge);
        tvAddress = root.findViewById(R.id.tvAddress);
        gender = root.findViewById(R.id.tvGender);
        btnSave = root.findViewById(R.id.btnSave);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return root;


    }


}