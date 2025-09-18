package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.V0 */
/* loaded from: classes2.dex */
public final class RunnableC4864V0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f30836a;

    /* renamed from: b */
    public final /* synthetic */ String f30837b;

    /* renamed from: c */
    public final /* synthetic */ C5185i1 f30838c;

    public RunnableC4864V0(C5185i1 c5185i1, String str, String str2) {
        this.f30838c = c5185i1;
        this.f30836a = str;
        this.f30837b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5334o0 c5334o0 = this.f30838c.f31880a;
        String str = this.f30836a;
        String str2 = this.f30837b;
        c5334o0.getClass();
        C5309n0.m20768g().putAppEnvironmentValue(str, str2);
    }
}
