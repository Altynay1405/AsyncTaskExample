package com.example.asynctaskexample;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

class DownloadTask extends AsyncTask <String, Integer, Boolean> {
 static String TAG = DownloadTask.class.getSimpleName();
 ProgressBar mProgressBar;

    public DownloadTask(ProgressBar mProgressBar) {
        this.mProgressBar = mProgressBar;

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected Boolean doInBackground(String... strings) {
        Log.i(TAG,"url=" + strings[0]);

        try {

            for (int i = 1; i < 21; i++){
                Thread.sleep(500);
                publishProgress(i *5);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        mProgressBar.setProgress(values[0]);
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
        mProgressBar.setVisibility(View.INVISIBLE);
    }
}
