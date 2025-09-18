package com.yandex.mapkit.offline_cache.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.logging.Logger;
import p000.AbstractC8008Nj0;
import p000.C6495nX;
import p000.C7904Lj0;
import p000.RunnableC0383G4;
import p000.RunnableC6720r4;

/* loaded from: classes2.dex */
public class BackgroundDownloadJob extends Worker implements BackgroundWorkerListener {
    private static Logger LOGGER = Logger.getLogger(BackgroundDownloadJob.class.getCanonicalName());
    protected static final String TAG = "mapkit_background_download";

    public BackgroundDownloadJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public /* synthetic */ void lambda$doWork$0(BackgroundDownloadInitializer backgroundDownloadInitializer) {
        backgroundDownloadInitializer.setListener(this);
        backgroundDownloadInitializer.initializeMapkit();
    }

    @Override // androidx.work.Worker
    public synchronized AbstractC8008Nj0 doWork() {
        LOGGER.info("Start background download job");
        BackgroundDownloadInitializer initializer = BackgroundDownloadManager.getInitializer();
        if (initializer != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC6720r4(this, 12, initializer));
        }
        try {
            try {
                wait();
                LOGGER.info("Stop background download job");
            } catch (InterruptedException unused) {
                LOGGER.info("Background download job interrupted");
                C7904Lj0 c7904Lj0 = new C7904Lj0();
                if (initializer != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0383G4(6, initializer));
                }
                return c7904Lj0;
            }
        } finally {
            if (initializer != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0383G4(6, initializer));
            }
        }
        return AbstractC8008Nj0.m5818a();
    }

    @Override // p000.AbstractC8060Oj0
    public synchronized void onStopped() {
        notifyAll();
    }

    @Override // com.yandex.mapkit.offline_cache.internal.BackgroundWorkerListener
    public void updateForegroundInfo(C6495nX c6495nX) {
        setForegroundAsync(c6495nX);
    }
}
