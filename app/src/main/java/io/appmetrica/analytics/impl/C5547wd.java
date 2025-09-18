package io.appmetrica.analytics.impl;

import p000.AbstractC1374Vq;

/* renamed from: io.appmetrica.analytics.impl.wd */
/* loaded from: classes2.dex */
public final class C5547wd implements InterfaceC5357on {

    /* renamed from: a */
    public final String f32771a;

    public C5547wd(String str) {
        this.f32771a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357on
    /* renamed from: a */
    public final C5307mn mo19211a(Object obj) {
        return obj == null ? new C5307mn(this, false, AbstractC1374Vq.m8593l(new StringBuilder(), this.f32771a, " is null.")) : new C5307mn(this, true, "");
    }

    /* renamed from: a */
    public final String m21179a() {
        return this.f32771a;
    }
}
