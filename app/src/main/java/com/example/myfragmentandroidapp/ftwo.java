package com.example.myfragmentandroidapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ftwo extends Fragment {
    View rootview;
    Button previousFragmentButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.ftwo,container, false);

        previousFragmentButton = rootview.findViewById(R.id.button2);
        previousFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.Fragment_Container, new fone()).addToBackStack("Main")
                        .commit();
            }
        });


        return rootview;
    }
}
