package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.u6 */
/* loaded from: classes2.dex */
public class C3642u6 {

    /* renamed from: a */
    private final C2675I8 f24897a;

    public C3642u6(C2675I8 c2675i8) {
        this.f24897a = c2675i8;
    }

    /* renamed from: a */
    public long m16901a() {
        long jM14298j = this.f24897a.m14298j();
        long j = jM14298j >= 10000000000L ? 1 + jM14298j : 10000000000L;
        this.f24897a.m14283a(j);
        return j;
    }
}
