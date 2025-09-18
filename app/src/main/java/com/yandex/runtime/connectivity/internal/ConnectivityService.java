package com.yandex.runtime.connectivity.internal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.yandex.runtime.Runtime;

/* loaded from: classes2.dex */
public class ConnectivityService extends JobService {
    private static final String TAG = "com.yandex.runtime.connectivity.internal.ConnectivityService";

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        try {
            Runtime.getApplicationContext().sendBroadcast(new Intent(ConnectivitySubscription.ACTION_CONNECTIVITY_CHANGED));
            return false;
        } catch (RuntimeException e) {
            e.getMessage();
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
