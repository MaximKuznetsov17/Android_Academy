package com.example.maks.lesson_1.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maks.lesson_1.R;
import com.example.maks.lesson_1.Report;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ReportViewHolder> {

    private List<Report> reportList = new ArrayList<>();

    @Override
    public ReportViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main2, parent, false);
        return new ReportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReportViewHolder holder, int position) {
        holder.bind(reportList.get(position));
    }

    @Override
    public int getItemCount() {
        return reportList.size();
    }

    public void setItems(Collection<Report> reports) {
        reportList.addAll(reports);
        notifyDataSetChanged();
    }

    public void clearItems() {
        reportList.clear();
        notifyDataSetChanged();
    }

    class ReportViewHolder extends RecyclerView.ViewHolder {

        private ImageView authorImage;
        private ImageView flagImage;
        private TextView authorName;
        private TextView authorPosition;
        private TextView authorLocation;
        private Button viewProfile;

        public ReportViewHolder(View itemView) {
            super(itemView);
            authorImage = itemView.findViewById(R.id.authorImage);
            flagImage = itemView.findViewById(R.id.flagImage);
            authorName = itemView.findViewById(R.id.authorName);
            authorPosition = itemView.findViewById(R.id.authorPosition);
            authorLocation = itemView.findViewById(R.id.authorLocation);
            viewProfile = (Button) itemView.findViewById(R.id.viewProfile);
        }

        public void bind(Report report) {
            authorName.setText(report.getAuthorName());
            authorPosition.setText(report.getAuthorPosition());
            authorLocation.setText(report.getAuthorLocation());
            authorImage.setImageResource(report.getAuthorImage());
            flagImage.setImageResource(report.getFlagImage());
            viewProfile.setText("View Profile");
        }
    }

}
