package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Oh */
/* loaded from: classes2.dex */
public final class C4714Oh implements InterfaceC5353oj {

    /* renamed from: a */
    public final C5134g0 f30581a;

    /* renamed from: b */
    public final C5278lj f30582b;

    /* renamed from: c */
    public final ICommonExecutor f30583c;

    public C4714Oh(C5134g0 c5134g0, C5278lj c5278lj) {
        this(c5134g0, c5278lj, C5388q4.m20928h().m20935e().m20408b());
    }

    /* renamed from: a */
    public final void m19695a(C4737Pg c4737Pg) {
        Callable c5150gg;
        ICommonExecutor iCommonExecutor = this.f30583c;
        if (c4737Pg.f30621b) {
            C5278lj c5278lj = this.f30582b;
            c5150gg = new C5140g6(c5278lj.f32153a, c5278lj.f32154b, c5278lj.f32155c, c4737Pg);
        } else {
            C5278lj c5278lj2 = this.f30582b;
            c5150gg = new C5150gg(c5278lj2.f32154b, c5278lj2.f32155c, c4737Pg);
        }
        iCommonExecutor.submit(c5150gg);
    }

    /* renamed from: b */
    public final void m19697b(C4737Pg c4737Pg) {
        C5278lj c5278lj = this.f30582b;
        C5140g6 c5140g6 = new C5140g6(c5278lj.f32153a, c5278lj.f32154b, c5278lj.f32155c, c4737Pg);
        if (this.f30581a.m20402a()) {
            try {
                this.f30583c.submit(c5140g6).get(4L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c5140g6.f30701c) {
            return;
        }
        try {
            c5140g6.mo19777a();
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5353oj
    public final void reportData(int i, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f30583c;
        C5278lj c5278lj = this.f30582b;
        iCommonExecutor.submit(new C4599Jm(c5278lj.f32154b, c5278lj.f32155c, i, bundle));
    }

    public C4714Oh(C5134g0 c5134g0, C5278lj c5278lj, ICommonExecutor iCommonExecutor) {
        this.f30583c = iCommonExecutor;
        this.f30582b = c5278lj;
        this.f30581a = c5134g0;
    }

    /* renamed from: b */
    public final void m19698b(C4782Re c4782Re) {
        ICommonExecutor iCommonExecutor = this.f30583c;
        C5278lj c5278lj = this.f30582b;
        iCommonExecutor.submit(new C4857Uh(c5278lj.f32154b, c5278lj.f32155c, c4782Re));
    }

    /* renamed from: a */
    public final void m19696a(C4782Re c4782Re) {
        ICommonExecutor iCommonExecutor = this.f30583c;
        C5278lj c5278lj = this.f30582b;
        iCommonExecutor.submit(new C4638Ld(c5278lj.f32154b, c5278lj.f32155c, c4782Re));
    }
}
