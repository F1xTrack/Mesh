package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4515e1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C4611i1 c;

    public RunnableC4515e1(C4611i1 c4611i1, String str, List list) {
        this.c = c4611i1;
        this.a = str;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.c).reportEvent(this.a, CollectionUtils.getMapFromList(this.b));
    }
}
