package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.S */
/* loaded from: classes2.dex */
public final class C4791S implements InterfaceC5569xa {

    /* renamed from: a */
    public final String f30706a;

    /* renamed from: b */
    public final Object f30707b;

    /* renamed from: c */
    public C5155gl f30708c;

    /* renamed from: d */
    public volatile FutureTask f30709d;

    /* renamed from: e */
    public final InterfaceC4696O f30710e;

    /* renamed from: f */
    public final InterfaceC4696O f30711f;

    /* renamed from: g */
    public final InterfaceC4696O f30712g;

    /* renamed from: h */
    public final InterfaceC4431D f30713h;

    /* renamed from: i */
    public final InterfaceC4431D f30714i;

    /* renamed from: j */
    public final InterfaceC4431D f30715j;

    /* renamed from: k */
    public Context f30716k;

    /* renamed from: l */
    public final ICommonExecutor f30717l;

    /* renamed from: m */
    public volatile AdvertisingIdsHolder f30718m;

    public C4791S(InterfaceC4696O interfaceC4696O, InterfaceC4696O interfaceC4696O2, InterfaceC4696O interfaceC4696O3, ICommonExecutor iCommonExecutor, String str) {
        this(interfaceC4696O, interfaceC4696O2, interfaceC4696O3, iCommonExecutor, new C4504G(new C4760Qf("google")), new C4504G(new C4760Qf("huawei")), new C4504G(new C4760Qf("yandex")), str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5569xa
    /* renamed from: a */
    public final void mo19793a(Context context, C5155gl c5155gl) {
        this.f30708c = c5155gl;
        mo19795b(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5569xa
    /* renamed from: b */
    public final void mo19795b(Context context) {
        this.f30716k = context.getApplicationContext();
        if (this.f30709d == null) {
            synchronized (this.f30707b) {
                try {
                    if (this.f30709d == null) {
                        this.f30709d = new FutureTask(new CallableC4576J(this));
                        this.f30717l.execute(this.f30709d);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public final InterfaceC4696O m19796c() {
        return this.f30711f;
    }

    /* renamed from: d */
    public final String m19797d() {
        return this.f30706a;
    }

    /* renamed from: e */
    public final InterfaceC4696O m19798e() {
        return this.f30712g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final AdvertisingIdsHolder getIdentifiers(Context context) throws ExecutionException, InterruptedException {
        mo19795b(context);
        try {
            this.f30709d.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f30718m;
    }

    public C4791S(InterfaceC4696O interfaceC4696O, InterfaceC4696O interfaceC4696O2, InterfaceC4696O interfaceC4696O3, ICommonExecutor iCommonExecutor, C4504G c4504g, C4504G c4504g2, C4504G c4504g3, String str) {
        this.f30707b = new Object();
        this.f30710e = interfaceC4696O;
        this.f30711f = interfaceC4696O2;
        this.f30712g = interfaceC4696O3;
        this.f30713h = c4504g;
        this.f30714i = c4504g2;
        this.f30715j = c4504g3;
        this.f30717l = iCommonExecutor;
        this.f30718m = new AdvertisingIdsHolder();
        this.f30706a = AbstractC7222ym.m26234k("[AdvertisingIdGetter", str, "]");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5569xa, io.appmetrica.analytics.impl.InterfaceC5280ll
    /* renamed from: a */
    public final void mo19206a(C5155gl c5155gl) {
        this.f30708c = c5155gl;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5569xa
    /* renamed from: a */
    public final AdvertisingIdsHolder mo19791a(Context context) {
        return mo19792a(context, new C5447sd());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5569xa
    /* renamed from: a */
    public final AdvertisingIdsHolder mo19792a(Context context, InterfaceC4905Wh interfaceC4905Wh) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new CallableC4600K(this, context.getApplicationContext(), interfaceC4905Wh));
        this.f30717l.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f30718m;
    }

    /* renamed from: b */
    public static AdTrackingInfoResult m19789b(C4791S c4791s, Context context) {
        if (c4791s.f30711f.mo19560a(c4791s.f30708c)) {
            return c4791s.f30714i.mo19304a(context);
        }
        C5155gl c5155gl = c4791s.f30708c;
        if (c5155gl != null && c5155gl.f31797p) {
            if (!c5155gl.f31795n.f32911e) {
                return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, "startup forbade advertising identifiers collecting");
            }
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new AdTrackingInfoResult(null, IdentifierStatus.NO_STARTUP, "startup has not been received yet");
    }

    /* renamed from: a */
    public static AdTrackingInfoResult m19788a(C4791S c4791s, Context context) {
        if (c4791s.f30710e.mo19560a(c4791s.f30708c)) {
            return c4791s.f30713h.mo19304a(context);
        }
        C5155gl c5155gl = c4791s.f30708c;
        if (c5155gl != null && c5155gl.f31797p) {
            if (!c5155gl.f31795n.f32909c) {
                return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, "startup forbade advertising identifiers collecting");
            }
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new AdTrackingInfoResult(null, IdentifierStatus.NO_STARTUP, "startup has not been received yet");
    }

    /* renamed from: b */
    public final InterfaceC4696O m19794b() {
        return this.f30710e;
    }

    /* renamed from: a */
    public final ICommonExecutor m19790a() {
        return this.f30717l;
    }
}
