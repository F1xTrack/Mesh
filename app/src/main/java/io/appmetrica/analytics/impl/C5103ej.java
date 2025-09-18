package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ej */
/* loaded from: classes2.dex */
public final class C5103ej implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ String f31609a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f31610b;

    public C5103ej(String str, Throwable th) {
        this.f31609a = str;
        this.f31610b = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.reportError(this.f31609a, this.f31610b);
    }
}
