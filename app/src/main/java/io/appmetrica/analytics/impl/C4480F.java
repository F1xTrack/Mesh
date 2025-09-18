package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.F */
/* loaded from: classes2.dex */
public final class C4480F implements Provider {

    /* renamed from: a */
    public final /* synthetic */ Context f30112a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC4905Wh f30113b;

    /* renamed from: c */
    public final /* synthetic */ C4504G f30114c;

    public C4480F(C4504G c4504g, Context context, InterfaceC4905Wh interfaceC4905Wh) {
        this.f30114c = c4504g;
        this.f30112a = context;
        this.f30113b = interfaceC4905Wh;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f30114c.f30155a.mo19305a(this.f30112a, this.f30113b);
    }
}
