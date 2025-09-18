package io.sentry;

/* renamed from: io.sentry.V1 */
/* loaded from: classes2.dex */
public final class C5812V1 {

    /* renamed from: a */
    public final C5759D1 f33431a;

    /* renamed from: b */
    public volatile C5820Y0 f33432b;

    /* renamed from: c */
    public volatile C5782L0 f33433c;

    public C5812V1(C5759D1 c5759d1, C5820Y0 c5820y0, C5782L0 c5782l0) {
        this.f33432b = c5820y0;
        this.f33433c = c5782l0;
        this.f33431a = c5759d1;
    }

    public C5812V1(C5812V1 c5812v1) {
        this.f33431a = c5812v1.f33431a;
        this.f33432b = c5812v1.f33432b;
        C5782L0 c5782l0 = c5812v1.f33433c;
        c5782l0.getClass();
        this.f33433c = new C5782L0(c5782l0);
    }
}
