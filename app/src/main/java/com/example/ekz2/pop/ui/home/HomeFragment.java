package com.example.ekz2.pop.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ekz2.R;
import com.example.ekz2.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    RecyclerView rv;
    View root;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
         root = binding.getRoot();

      //  final TextView textView = binding.textView8;
       // homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
private void findView(){
    RecyclerView rv = root.findViewById(R.id.recyclerView2);

}
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}