package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4985xh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C5009yh c;

    public RunnableC4985xh(C5009yh c5009yh, String str, List list) {
        this.c = c5009yh;
        this.a = str;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.c;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).reportEvent(this.a, CollectionUtils.getMapFromList(this.b));
    }
}
