package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.sm */
/* loaded from: classes2.dex */
public final class C5456sm {

    /* renamed from: a */
    public final String f32580a;

    /* renamed from: b */
    public final int f32581b;

    /* renamed from: c */
    public final long f32582c;

    /* renamed from: d */
    public final String f32583d;

    /* renamed from: e */
    public final Integer f32584e;

    /* renamed from: f */
    public final List f32585f;

    public C5456sm(String str, int i, long j, String str2, Integer num, List list) {
        this.f32580a = str;
        this.f32581b = i;
        this.f32582c = j;
        this.f32583d = str2;
        this.f32584e = num;
        this.f32585f = list == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(list);
    }
}
