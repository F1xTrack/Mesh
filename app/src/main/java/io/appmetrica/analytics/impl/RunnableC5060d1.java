package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d1 */
/* loaded from: classes2.dex */
public final class RunnableC5060d1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31458a;

    /* renamed from: b */
    public final /* synthetic */ String f31459b;

    /* renamed from: c */
    public final /* synthetic */ C5185i1 f31460c;

    public RunnableC5060d1(C5185i1 c5185i1, String str, String str2) {
        this.f31460c = c5185i1;
        this.f31458a = str;
        this.f31459b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f31460c).reportEvent(this.f31458a, this.f31459b);
    }
}
