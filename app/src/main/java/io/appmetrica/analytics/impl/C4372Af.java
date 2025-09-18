package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.Af */
/* loaded from: classes2.dex */
public final class C4372Af implements InterfaceC5499uf {

    /* renamed from: a */
    public final boolean f29856a;

    /* renamed from: b */
    public final C4690Nh f29857b;

    /* renamed from: c */
    public final C5298me f29858c;

    /* renamed from: d */
    public final C4584J7 f29859d;

    /* renamed from: e */
    public final C4568If f29860e;

    /* renamed from: f */
    public final Handler f29861f;

    public C4372Af(C4690Nh c4690Nh, C5298me c5298me, Handler handler) {
        this(c4690Nh, c5298me, handler, c5298me.m20752s());
    }

    /* renamed from: a */
    public final void m19200a() {
        if (this.f29856a) {
            return;
        }
        C4690Nh c4690Nh = this.f29857b;
        ResultReceiverC4616Kf resultReceiverC4616Kf = new ResultReceiverC4616Kf(this.f29861f, this);
        c4690Nh.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC4616Kf);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC5443s9.f32553a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        C5013b4 c5013b4 = new C5013b4("", "", 4098, 0, anonymousInstance);
        c5013b4.f30773m = bundle;
        C4820T4 c4820t4 = c4690Nh.f30522a;
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4820t4), c4820t4, 1, null);
    }

    public C4372Af(C4690Nh c4690Nh, C5298me c5298me, Handler handler, boolean z) {
        this(c4690Nh, c5298me, handler, z, new C4584J7(z), new C4568If());
    }

    public C4372Af(C4690Nh c4690Nh, C5298me c5298me, Handler handler, boolean z, C4584J7 c4584j7, C4568If c4568If) {
        this.f29857b = c4690Nh;
        this.f29858c = c5298me;
        this.f29856a = z;
        this.f29859d = c4584j7;
        this.f29860e = c4568If;
        this.f29861f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5499uf
    /* renamed from: a */
    public final void mo19203a(C4472Ef c4472Ef) {
        String str = c4472Ef == null ? null : c4472Ef.f30076a;
        if (this.f29856a) {
            return;
        }
        synchronized (this) {
            C4584J7 c4584j7 = this.f29859d;
            this.f29860e.getClass();
            c4584j7.f30336d = C4568If.m19507a(str);
            c4584j7.m19529a();
        }
    }

    /* renamed from: a */
    public final synchronized void m19202a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            C4584J7 c4584j7 = this.f29859d;
            c4584j7.f30335c = deferredDeeplinkParametersListener;
            if (c4584j7.f30333a) {
                c4584j7.m19530a(1);
            } else {
                c4584j7.m19529a();
            }
            this.f29858c.m20754u();
        } catch (Throwable th) {
            this.f29858c.m20754u();
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m19201a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            C4584J7 c4584j7 = this.f29859d;
            c4584j7.f30334b = deferredDeeplinkListener;
            if (c4584j7.f30333a) {
                c4584j7.m19530a(1);
            } else {
                c4584j7.m19529a();
            }
            this.f29858c.m20754u();
        } catch (Throwable th) {
            this.f29858c.m20754u();
            throw th;
        }
    }
}
