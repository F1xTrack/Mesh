package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.u6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3119u6 {
    private final I8 a;

    public C3119u6(I8 i8) {
        this.a = i8;
    }

    public long a() {
        long j = this.a.j();
        long j2 = j >= 10000000000L ? 1 + j : 10000000000L;
        this.a.a(j2);
        return j2;
    }
}
