package com.example.nhom4_124tldt01.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.nhom4_124tldt01.Adapter;
import com.example.nhom4_124tldt01.ItemGV;
import com.example.nhom4_124tldt01.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        List<ItemGV> items = new ArrayList<>();
        items.add(new ItemGV(1, "Nguyễn Quang Ninh", "22115053122326"));
        items.add(new ItemGV(2, "Lê Văn Quý", "22115053122333"));
        items.add(new ItemGV(3, "Nguyễn Phước Lộc", "2211505312232"));


        Adapter adapter = new Adapter(getContext(), items);
        binding.gridview.setAdapter(adapter);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}