package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.gc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2777gc {
    private final C2652bc a;
    private final C2652bc b;
    private final C2652bc c;

    public C2777gc() {
        this(new C2652bc(), new C2652bc(), new C2652bc());
    }

    public C2652bc a() {
        return this.a;
    }

    public C2652bc b() {
        return this.b;
    }

    public C2652bc c() {
        return this.c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.a + ", mHuawei=" + this.b + ", yandex=" + this.c + '}';
    }

    public C2777gc(C2652bc c2652bc, C2652bc c2652bc2, C2652bc c2652bc3) {
        this.a = c2652bc;
        this.b = c2652bc2;
        this.c = c2652bc3;
    }
}
