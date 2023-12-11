package com.example.smart_job_finder.ui.home;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smart_job_finder.Job;
import com.example.smart_job_finder.JobList;
import com.example.smart_job_finder.R;
import com.example.smart_job_finder.databinding.FragmentHomeBinding;

import java.util.List;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        List<Job> jobs = JobList.getJobList();
        RecyclerView recyclerView = root.findViewById(R.id.jobList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        JobListAdapter adapter = new JobListAdapter(getActivity(), jobs);
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}