package com.example.esoftwarica.ui.addStudent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class addStudentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public addStudentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}