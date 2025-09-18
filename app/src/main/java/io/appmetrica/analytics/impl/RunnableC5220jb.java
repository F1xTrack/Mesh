package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.jb */
/* loaded from: classes2.dex */
public final class RunnableC5220jb implements Runnable {

    /* renamed from: a */
    public final WeakReference f31973a;

    /* renamed from: b */
    public final WeakReference f31974b;

    public RunnableC5220jb(Handler handler, AbstractC4747Q2 abstractC4747Q2) {
        this.f31973a = new WeakReference(handler);
        this.f31974b = new WeakReference(abstractC4747Q2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f31973a.get();
        AbstractC4747Q2 abstractC4747Q2 = (AbstractC4747Q2) this.f31974b.get();
        if (handler == null || abstractC4747Q2 == null) {
            return;
        }
        boolean zMo19831f = abstractC4747Q2.f30644b.mo19831f();
        if (!zMo19831f) {
            PublicLogger publicLogger = abstractC4747Q2.f30645c;
            Set set = AbstractC5443s9.f32553a;
            EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
            C5013b4 c5013b4 = new C5013b4("", "", 3, 0, publicLogger);
            C4690Nh c4690Nh = abstractC4747Q2.f30650h;
            C4952Yg c4952Yg = abstractC4747Q2.f30644b;
            c4690Nh.getClass();
            c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4952Yg), c4952Yg, 1, null);
        }
        if (zMo19831f) {
            return;
        }
        C5195ib.m20574a(handler, abstractC4747Q2, this);
    }
}
