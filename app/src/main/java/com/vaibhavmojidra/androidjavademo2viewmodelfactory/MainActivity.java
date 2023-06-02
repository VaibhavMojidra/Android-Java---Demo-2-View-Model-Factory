package com.vaibhavmojidra.androidjavademo2viewmodelfactory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.vaibhavmojidra.androidjavademo2viewmodelfactory.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;
    private MainActivityViewModelFactory factory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        factory=new MainActivityViewModelFactory(7);
        viewModel= new ViewModelProvider(this,factory).get(MainActivityViewModel.class);

        binding.countTextview.setText(String.valueOf(viewModel.getCount()));
        binding.incrementButton.setOnClickListener(view -> {
            viewModel.incrementCount();
            binding.countTextview.setText(String.valueOf(viewModel.getCount()));
        });
    }
}