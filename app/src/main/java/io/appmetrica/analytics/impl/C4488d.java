package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d */
/* loaded from: classes2.dex */
public final class C4488d extends Thread {
    public final AtomicBoolean a = new AtomicBoolean(true);
    public final /* synthetic */ C4513e b;

    public C4488d(C4513e c4513e) {
        this.b = c4513e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        while (!isInterrupted() && this.a.get()) {
            this.b.e.set(false);
            C4513e c4513e = this.b;
            c4513e.c.postAtFrontOfQueue(c4513e.f);
            int i = this.b.b.get();
            while (i > 0) {
                try {
                    Thread.sleep(C4513e.g);
                    if (this.b.e.get()) {
                        break;
                    } else {
                        i--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.b.a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4463c) it.next()).onAppNotResponding();
                }
            }
            while (!this.b.e.get()) {
                try {
                    Thread.sleep(C4513e.g);
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
