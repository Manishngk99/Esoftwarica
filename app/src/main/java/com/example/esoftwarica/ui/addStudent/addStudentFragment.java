package com.example.esoftwarica.ui.addStudent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.esoftwarica.R;
import com.example.esoftwarica.model.addStudentViewModel;


public class addStudentFragment extends Fragment implements View.OnClickListener {

    private EditText tvName, tvAge, tvAddress;
    private Button Save;
    private RadioGroup RGroup;
    String name, age, address, gender;
    int imageId;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        tvName = root.findViewById(R.id.etEnterName);
        tvAge = root.findViewById(R.id.etEnterAge);
        tvAddress = root.findViewById(R.id.etAddress);
        RGroup = root.findViewById(R.id.rgroup);
        Save = root.findViewById(R.id.btnSave);

     Save.setOnClickListener(this);
        return root;
    }


    @Override
    public void onClick(View v) {

        name = tvName.getText().toString();
        age = tvAge.getText().toString();
        address = tvAddress.getText().toString();

        int selectedId = RGroup.getCheckedRadioButtonId();

        if (selectedId == R.id.rbMale){
            gender = "M";
            imageId = R.drawable.male;
        } else if (selectedId == R.id.rbFemale) {
            gender = "F";
            imageId = R.drawable.female;
        } else if (selectedId == R.id.rbOthers) {
            gender = "O";
            imageId = R.drawable.othericon;
        }


    addStudentViewModel addStudentViewModel1 = new addStudentViewModel();
        addStudentViewModel1.setName(name);
        addStudentViewModel1.setAge(age);
        addStudentViewModel1.setAddress(address);
        addStudentViewModel1.setGender(gender);
        addStudentViewModel1.setImageId(imageId);

        Toast.makeText(getActivity(), "Data Inserted", Toast.LENGTH_SHORT).show();


    }
}