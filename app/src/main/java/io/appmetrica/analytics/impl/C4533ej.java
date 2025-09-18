package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ej */
/* loaded from: classes2.dex */
public final class C4533ej implements Na {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;

    public C4533ej(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.reportError(this.a, this.b);
    }
}
