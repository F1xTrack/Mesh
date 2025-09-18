package com.yandex.metrica.impl.ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2668c3 extends P2<List<Z2>> {
    /* JADX WARN: Illegal instructions before constructor call */
    public C2668c3() {
        long j = O.e.c;
        this(j, 2 * j);
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public long b(C3007pi c3007pi) {
        return c3007pi.b;
    }

    public C2668c3(long j, long j2) {
        super(j, j2);
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public long a(C3007pi c3007pi) {
        return c3007pi.b * 2;
    }
}
