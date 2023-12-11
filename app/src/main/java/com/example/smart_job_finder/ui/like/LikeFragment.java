package com.example.smart_job_finder.ui.like;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.smart_job_finder.JobList;
import com.example.smart_job_finder.R;
import com.example.smart_job_finder.databinding.FragmentLikesBinding;
import com.example.smart_job_finder.Job;

import java.util.List;
import java.util.stream.Collectors;

public class LikeFragment extends Fragment{
    private FragmentLikesBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentLikesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        List<Job> jobs = JobList.getJobList().stream().filter(Job::isLiked).collect(Collectors.toList());

        RecyclerView recyclerView = root.findViewById(R.id.likeList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        LikeListAdapter adapter = new LikeListAdapter(getActivity(), jobs);
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}