package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* renamed from: io.appmetrica.analytics.impl.q6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4807q6 implements Function {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4870sm apply(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C4870sm(name, priority, id, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
