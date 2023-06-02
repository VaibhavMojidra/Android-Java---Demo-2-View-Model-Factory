package com.vaibhavmojidra.androidjavademo2viewmodelfactory;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class MainActivityViewModelFactory implements ViewModelProvider.Factory {

    private int defaulValue;

    public MainActivityViewModelFactory(int defaulValue) {
        this.defaulValue = defaulValue;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(MainActivityViewModel.class)){
            return (T) new MainActivityViewModel(defaulValue);
        }
        throw new IllegalArgumentException("Unknown View Model Class");
    }
}
