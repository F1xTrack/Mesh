package io.sentry;

/* loaded from: classes2.dex */
public final class V1 {
    public final D1 a;
    public volatile Y0 b;
    public volatile L0 c;

    public V1(D1 d1, Y0 y0, L0 l0) {
        this.b = y0;
        this.c = l0;
        this.a = d1;
    }

    public V1(V1 v1) {
        this.a = v1.a;
        this.b = v1.b;
        L0 l0 = v1.c;
        l0.getClass();
        this.c = new L0(l0);
    }
}
