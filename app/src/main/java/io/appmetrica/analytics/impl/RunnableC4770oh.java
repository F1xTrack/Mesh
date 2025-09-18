package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.oh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4770oh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ C5009yh c;

    public RunnableC4770oh(C5009yh c5009yh, String str, byte[] bArr) {
        this.c = c5009yh;
        this.a = str;
        this.b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.c;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).setSessionExtra(this.a, this.b);
    }
}
