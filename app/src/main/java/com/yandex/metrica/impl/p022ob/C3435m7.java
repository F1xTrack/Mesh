package com.yandex.metrica.impl.p022ob;

import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.m7 */
/* loaded from: classes2.dex */
public class C3435m7 {

    /* renamed from: a */
    public final String f24245a;

    /* renamed from: b */
    public final int f24246b;

    /* renamed from: c */
    public final long f24247c;

    /* renamed from: d */
    public final String f24248d;

    /* renamed from: e */
    public final Integer f24249e;

    /* renamed from: f */
    public final List<StackTraceElement> f24250f;

    public C3435m7(String str, int i, long j, String str2, Integer num, List<StackTraceElement> list) {
        this.f24245a = str;
        this.f24246b = i;
        this.f24247c = j;
        this.f24248d = str2;
        this.f24249e = num;
        this.f24250f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}
