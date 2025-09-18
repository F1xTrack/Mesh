package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Gi */
/* loaded from: classes2.dex */
public final class C4523Gi implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ String f30186a;

    /* renamed from: b */
    public final /* synthetic */ String f30187b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f30188c;

    public C4523Gi(String str, String str2, Throwable th) {
        this.f30186a = str;
        this.f30187b = str2;
        this.f30188c = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.reportError(this.f30186a, this.f30187b, this.f30188c);
    }
}
