package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xh */
/* loaded from: classes2.dex */
public final class RunnableC5576xh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f32824a;

    /* renamed from: b */
    public final /* synthetic */ List f32825b;

    /* renamed from: c */
    public final /* synthetic */ C5601yh f32826c;

    public RunnableC5576xh(C5601yh c5601yh, String str, List list) {
        this.f32826c = c5601yh;
        this.f32824a = str;
        this.f32825b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f32826c;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportEvent(this.f32824a, CollectionUtils.getMapFromList(this.f32825b));
    }
}
