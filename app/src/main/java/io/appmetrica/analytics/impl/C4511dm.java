package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4511dm implements Hm {
    public final Hm a;
    public final Object b;

    public C4511dm(Hm hm, Object obj) {
        this.a = hm;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Hm
    public final Object a(Object obj) {
        return obj != this.a.a(obj) ? this.b : obj;
    }
}
