package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.networktasks.impl.C5679d;
import io.appmetrica.analytics.networktasks.impl.C5681f;
import io.appmetrica.analytics.networktasks.impl.C5682g;
import io.appmetrica.analytics.networktasks.impl.RunnableC5683h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* renamed from: a */
    private final LinkedBlockingQueue f33118a;

    /* renamed from: b */
    private final Object f33119b;

    /* renamed from: c */
    private final Object f33120c;

    /* renamed from: d */
    private volatile C5679d f33121d;

    /* renamed from: e */
    private final C5682g f33122e;

    public NetworkCore() {
        this(new C5682g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f33120c) {
                }
                this.f33121d = (C5679d) this.f33118a.take();
                networkTask = this.f33121d.f33089a;
                Executor executor = networkTask.getExecutor();
                this.f33122e.getClass();
                executor.execute(new RunnableC5683h(networkTask, this, new C5681f()));
                synchronized (this.f33120c) {
                    this.f33121d = null;
                    networkTask.onTaskFinished();
                    networkTask.onTaskRemoved();
                }
            } catch (InterruptedException unused) {
                synchronized (this.f33120c) {
                    try {
                        this.f33121d = null;
                        if (networkTask != null) {
                            networkTask.onTaskFinished();
                            networkTask.onTaskRemoved();
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f33120c) {
                    try {
                        this.f33121d = null;
                        if (networkTask != null) {
                            networkTask.onTaskFinished();
                            networkTask.onTaskRemoved();
                        }
                        throw th;
                    } finally {
                    }
                }
            }
        }
    }

    public void startTask(NetworkTask networkTask) {
        synchronized (this.f33119b) {
            try {
                C5679d c5679d = new C5679d(networkTask);
                if (isRunning() && !this.f33118a.contains(c5679d) && !c5679d.equals(this.f33121d) && networkTask.onTaskAdded()) {
                    this.f33118a.offer(c5679d);
                }
            } finally {
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f33120c) {
            try {
                C5679d c5679d = this.f33121d;
                if (c5679d != null) {
                    c5679d.f33089a.onTaskRemoved();
                }
                ArrayList arrayList = new ArrayList(this.f33118a.size());
                this.f33118a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C5679d) it.next()).f33089a.onTaskRemoved();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public NetworkCore(C5682g c5682g) {
        this.f33118a = new LinkedBlockingQueue();
        this.f33119b = new Object();
        this.f33120c = new Object();
        this.f33122e = c5682g;
    }
}
