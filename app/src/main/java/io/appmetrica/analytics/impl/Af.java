package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Af implements InterfaceC4911uf {
    public final boolean a;
    public final Nh b;
    public final C4719me c;
    public final J7 d;
    public final If e;
    public final Handler f;

    public Af(Nh nh, C4719me c4719me, Handler handler) {
        this(nh, c4719me, handler, c4719me.s());
    }

    public final void a() {
        if (this.a) {
            return;
        }
        Nh nh = this.b;
        Kf kf = new Kf(this.f, this);
        nh.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", kf);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC4857s9.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        C4443b4 c4443b4 = new C4443b4("", "", 4098, 0, anonymousInstance);
        c4443b4.m = bundle;
        T4 t4 = nh.a;
        nh.a(Nh.a(c4443b4, t4), t4, 1, null);
    }

    public Af(Nh nh, C4719me c4719me, Handler handler, boolean z) {
        this(nh, c4719me, handler, z, new J7(z), new If());
    }

    public Af(Nh nh, C4719me c4719me, Handler handler, boolean z, J7 j7, If r6) {
        this.b = nh;
        this.c = c4719me;
        this.a = z;
        this.d = j7;
        this.e = r6;
        this.f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4911uf
    public final void a(Ef ef) {
        String str = ef == null ? null : ef.a;
        if (this.a) {
            return;
        }
        synchronized (this) {
            J7 j7 = this.d;
            this.e.getClass();
            j7.d = If.a(str);
            j7.a();
        }
    }

    public final synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            J7 j7 = this.d;
            j7.c = deferredDeeplinkParametersListener;
            if (j7.a) {
                j7.a(1);
            } else {
                j7.a();
            }
            this.c.u();
        } catch (Throwable th) {
            this.c.u();
            throw th;
        }
    }

    public final synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            J7 j7 = this.d;
            j7.b = deferredDeeplinkListener;
            if (j7.a) {
                j7.a(1);
            } else {
                j7.a();
            }
            this.c.u();
        } catch (Throwable th) {
            this.c.u();
            throw th;
        }
    }
}
