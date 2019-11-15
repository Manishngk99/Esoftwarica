package com.example.esoftwarica.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esoftwarica.R;
import com.example.esoftwarica.adapter.StudentAdapter;
import com.example.esoftwarica.model.HomeViewModel;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    public static List<HomeViewModel> homeViewModels = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = root.findViewById(R.id.recycleView);
        if (homeViewModels.size() == 0) {
            homeViewModels.add(new HomeViewModel(
                    "manisha", "18", "kathmandu", "female", R.drawable.female));
            homeViewModels.add(new HomeViewModel(
                    "manish", "18", "kathmandu", "male", R.drawable.male));
        }

        StudentAdapter studentAdapter = new StudentAdapter(getActivity(), homeViewModels);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return root;
    }


}