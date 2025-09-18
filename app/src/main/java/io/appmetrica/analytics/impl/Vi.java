package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Vi implements Na {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;

    public Vi(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.setSessionExtra(this.a, this.b);
    }
}
