package com.example.smart_job_finder.ui.home;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smart_job_finder.Job;
import com.example.smart_job_finder.JobList;
import com.example.smart_job_finder.R;
import com.example.smart_job_finder.ui.detail.DetailsActivity;
import com.example.smart_job_finder.ui.send.SendActivity;


import java.util.List;


public class JobListAdapter extends RecyclerView.Adapter<JobListAdapter.ViewHolder> {
    private final List<Job> jobs;
    private final Context context;

    public JobListAdapter(Context context, List<Job> jobs) {
        this.context = context;
        this.jobs = jobs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.job_item, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Job job = jobs.get(position);
        holder.jobImg.setImageResource(job.getImageResource());
        holder.likeImg.setImageResource(job.getLikeImgResource());
        holder.jobTitle.setText(job.getTitle());
        holder.jobLocation.setText(job.getLocation());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("job", job);
            startActivity(context, intent, null);
        });

        holder.likeImg.setOnClickListener(v -> {
            if (job.getLikeImgResource() == R.drawable.ic_heart) {
                job.setLikeImgResource(R.drawable.ic_heart_filled_foreground);
                holder.likeImg.setImageResource(R.drawable.ic_heart_filled_foreground);
                job.setLiked(true);
                JobList.setJobList(jobs);
            } else {
                job.setLikeImgResource(R.drawable.ic_heart);
                holder.likeImg.setImageResource(R.drawable.ic_heart);
                job.setLiked(false);


            }

        });

    }

    @Override
    public int getItemCount() {
        return jobs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView jobImg;

        ImageButton likeImg;
        TextView jobTitle, jobLocation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jobImg = itemView.findViewById(R.id.jobImg);
            likeImg = itemView.findViewById(R.id.likeIcon);
            jobTitle = itemView.findViewById(R.id.jobTitel);
            jobLocation = itemView.findViewById(R.id.jobLocation);



        }
    }
}
