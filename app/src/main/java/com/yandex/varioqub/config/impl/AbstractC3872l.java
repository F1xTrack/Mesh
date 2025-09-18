package com.yandex.varioqub.config.impl;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.varioqub.config.impl.l */
/* loaded from: classes2.dex */
public abstract class AbstractC3872l {

    /* renamed from: a */
    public static final AtomicLong[] f25624a;

    /* renamed from: b */
    public static final LinkedHashMap f25625b;

    /* renamed from: c */
    public static final Object f25626c;

    static {
        int length = AbstractC3871k.m17397a(3).length;
        AtomicLong[] atomicLongArr = new AtomicLong[length];
        for (int i = 0; i < length; i++) {
            atomicLongArr[i] = new AtomicLong();
        }
        f25624a = atomicLongArr;
        f25625b = new LinkedHashMap();
        f25626c = new Object();
    }

    /* renamed from: a */
    public static void m17398a(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AtomicLong[] atomicLongArr = f25624a;
        if (i == 0) {
            throw null;
        }
        long andSet = atomicLongArr[i - 1].getAndSet(0L);
        if (andSet > 0) {
            long j = jCurrentTimeMillis - andSet;
            AbstractC3870j.m17396a(i);
            synchronized (f25626c) {
                f25625b.put(AbstractC3870j.m17396a(i), Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public static void m17399b(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AtomicLong[] atomicLongArr = f25624a;
        if (i == 0) {
            throw null;
        }
        atomicLongArr[i - 1].set(jCurrentTimeMillis);
        "Start tracking metric - ".concat(AbstractC3870j.m17396a(i));
    }
}
