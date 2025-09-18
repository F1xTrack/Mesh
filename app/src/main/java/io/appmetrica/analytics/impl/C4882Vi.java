package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Vi */
/* loaded from: classes2.dex */
public final class C4882Vi implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ String f30866a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f30867b;

    public C4882Vi(String str, byte[] bArr) {
        this.f30866a = str;
        this.f30867b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.setSessionExtra(this.f30866a, this.f30867b);
    }
}
