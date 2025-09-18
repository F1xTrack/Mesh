package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Gi implements Na {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;

    public Gi(String str, String str2, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.reportError(this.a, this.b, this.c);
    }
}
