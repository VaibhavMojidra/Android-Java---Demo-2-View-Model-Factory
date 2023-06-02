package com.vaibhavmojidra.androidjavademo2viewmodelfactory;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int count=0;

    public MainActivityViewModel(int count) {
        this.count = count;
    }

    int getCount(){
        return count;
    }

    void incrementCount(){
        count++;
    }
}
