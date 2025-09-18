package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Comparator;

/* renamed from: io.appmetrica.analytics.impl.xm */
/* loaded from: classes2.dex */
public final class C5581xm implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Thread thread = (Thread) obj;
        Thread thread2 = (Thread) obj2;
        if (thread == thread2) {
            return 0;
        }
        return StringUtils.compare(thread.getName(), thread2.getName());
    }
}
