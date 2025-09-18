package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4705m0 implements Runnable {
    public final /* synthetic */ C4729n0 a;

    public RunnableC4705m0(C4729n0 c4729n0) {
        this.a = c4729n0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a.a;
        C4557fj c4557fj = Fi.a;
        synchronized (c4557fj) {
            try {
                c4557fj.b = Fh.a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                Iterator it = c4557fj.a.iterator();
                while (it.hasNext()) {
                    ((Na) it.next()).a(c4557fj.b);
                }
                c4557fj.a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
