package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.T */
/* loaded from: classes2.dex */
public final class C4815T {

    /* renamed from: a */
    public final C5456sm f30752a;

    /* renamed from: b */
    public final List f30753b;

    /* renamed from: c */
    public final String f30754c;

    public C4815T(C5456sm c5456sm, ArrayList arrayList, String str) {
        this.f30752a = c5456sm;
        this.f30753b = arrayList == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f30754c = str;
    }
}
