package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d */
/* loaded from: classes2.dex */
public final class C5058d extends Thread {

    /* renamed from: a */
    public final AtomicBoolean f31453a = new AtomicBoolean(true);

    /* renamed from: b */
    public final /* synthetic */ C5083e f31454b;

    public C5058d(C5083e c5083e) {
        this.f31454b = c5083e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        while (!isInterrupted() && this.f31453a.get()) {
            this.f31454b.f31511e.set(false);
            C5083e c5083e = this.f31454b;
            c5083e.f31509c.postAtFrontOfQueue(c5083e.f31512f);
            int i = this.f31454b.f31508b.get();
            while (i > 0) {
                try {
                    Thread.sleep(C5083e.f31505g);
                    if (this.f31454b.f31511e.get()) {
                        break;
                    } else {
                        i--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f31454b.f31507a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5033c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f31454b.f31511e.get()) {
                try {
                    Thread.sleep(C5083e.f31505g);
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
