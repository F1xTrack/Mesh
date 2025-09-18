package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.th */
/* loaded from: classes2.dex */
public final class RunnableC5476th implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f32644a;

    /* renamed from: b */
    public final /* synthetic */ String f32645b;

    /* renamed from: c */
    public final /* synthetic */ C5601yh f32646c;

    public RunnableC5476th(C5601yh c5601yh, String str, String str2) {
        this.f32646c = c5601yh;
        this.f32644a = str;
        this.f32645b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f32646c;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).putAppEnvironmentValue(this.f32644a, this.f32645b);
    }
}
