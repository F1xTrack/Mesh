package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.m7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2921m7 {
    public final String a;
    public final int b;
    public final long c;
    public final String d;
    public final Integer e;
    public final List<StackTraceElement> f;

    public C2921m7(String str, int i, long j, String str2, Integer num, List<StackTraceElement> list) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = str2;
        this.e = num;
        this.f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}
