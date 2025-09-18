package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes2.dex */
public final class T8 extends U8 {
    public final List a;

    public T8(List<Object> list) {
        this.a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.a;
    }
}
