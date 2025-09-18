package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Hi implements Na {
    public final /* synthetic */ Throwable a;

    public Hi(Throwable th) {
        this.a = th;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.reportUnhandledException(this.a);
    }
}
