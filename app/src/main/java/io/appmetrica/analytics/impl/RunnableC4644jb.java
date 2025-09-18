package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.jb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4644jb implements Runnable {
    public final WeakReference a;
    public final WeakReference b;

    public RunnableC4644jb(Handler handler, Q2 q2) {
        this.a = new WeakReference(handler);
        this.b = new WeakReference(q2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.a.get();
        Q2 q2 = (Q2) this.b.get();
        if (handler == null || q2 == null) {
            return;
        }
        boolean zF = q2.b.f();
        if (!zF) {
            PublicLogger publicLogger = q2.c;
            Set set = AbstractC4857s9.a;
            Wa wa = Wa.EVENT_TYPE_UNDEFINED;
            C4443b4 c4443b4 = new C4443b4("", "", 3, 0, publicLogger);
            Nh nh = q2.h;
            Yg yg = q2.b;
            nh.getClass();
            nh.a(Nh.a(c4443b4, yg), yg, 1, null);
        }
        if (zF) {
            return;
        }
        C4621ib.a(handler, q2, this);
    }
}
