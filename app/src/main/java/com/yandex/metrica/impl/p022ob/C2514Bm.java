package com.yandex.metrica.impl.p022ob;

import java.util.Random;

/* renamed from: com.yandex.metrica.impl.ob.Bm */
/* loaded from: classes2.dex */
public class C2514Bm {

    /* renamed from: a */
    private final Random f20945a;

    public C2514Bm() {
        this(new Random());
    }

    /* renamed from: a */
    public long m13938a(long j, long j2) {
        if (j >= j2) {
            throw new IllegalArgumentException("min should be less than max");
        }
        long jNextLong = this.f20945a.nextLong();
        if (jNextLong == Long.MIN_VALUE) {
            jNextLong = 0;
        } else if (jNextLong < 0) {
            jNextLong = -jNextLong;
        }
        return (jNextLong % (j2 - j)) + j;
    }

    public C2514Bm(Random random) {
        this.f20945a = random;
    }
}
