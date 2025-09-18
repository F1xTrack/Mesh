package com.yandex.runtime.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;

/* loaded from: classes2.dex */
public final class Scheduler extends Handler {
    public Scheduler() {
        super(Looper.getMainLooper());
        post(new Runnable() { // from class: com.yandex.runtime.internal.Scheduler.1
            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(-8);
            }
        });
    }

    private static native void run(long j);

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        run(((Long) message.obj).longValue());
    }

    public void schedule(long j, long j2) {
        sendMessageDelayed(Message.obtain(this, 0, new Long(j)), j2);
    }
}
