package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.th, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4889th implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C5009yh c;

    public RunnableC4889th(C5009yh c5009yh, String str, String str2) {
        this.c = c5009yh;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.c;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).putAppEnvironmentValue(this.a, this.b);
    }
}
