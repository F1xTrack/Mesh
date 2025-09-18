package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.J0 */
/* loaded from: classes2.dex */
public final class RunnableC4577J0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f30326a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f30327b;

    public RunnableC4577J0(C5185i1 c5185i1, String str) {
        this.f30327b = c5185i1;
        this.f30326a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5334o0 c5334o0 = this.f30327b.f31880a;
        String str = this.f30326a;
        c5334o0.getClass();
        C5309n0.m20768g().setUserProfileID(str);
    }
}
