package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.T0 */
/* loaded from: classes2.dex */
public final class RunnableC4816T0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f30755a;

    /* renamed from: b */
    public final /* synthetic */ String f30756b;

    /* renamed from: c */
    public final /* synthetic */ C5185i1 f30757c;

    public RunnableC4816T0(C5185i1 c5185i1, String str, String str2) {
        this.f30757c = c5185i1;
        this.f30755a = str;
        this.f30756b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f30757c).mo19187b(this.f30755a, this.f30756b);
    }
}
