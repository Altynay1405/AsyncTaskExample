package com.example.asynctaskexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
  ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressBar = findViewById(R.id.progressBar);
    }

    public void clickListener(View view) {

        DownloadTask downloadTask = new DownloadTask(mProgressBar);
        downloadTask.execute("HTTP:google.com");
    }
}
