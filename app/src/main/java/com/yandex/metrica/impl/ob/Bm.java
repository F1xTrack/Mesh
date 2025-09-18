package com.yandex.metrica.impl.ob;

import java.util.Random;

/* loaded from: classes2.dex */
public class Bm {
    private final Random a;

    public Bm() {
        this(new Random());
    }

    public long a(long j, long j2) {
        if (j >= j2) {
            throw new IllegalArgumentException("min should be less than max");
        }
        long jNextLong = this.a.nextLong();
        if (jNextLong == Long.MIN_VALUE) {
            jNextLong = 0;
        } else if (jNextLong < 0) {
            jNextLong = -jNextLong;
        }
        return (jNextLong % (j2 - j)) + j;
    }

    public Bm(Random random) {
        this.a = random;
    }
}
