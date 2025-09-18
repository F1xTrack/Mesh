package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.e1 */
/* loaded from: classes2.dex */
public final class RunnableC5085e1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31514a;

    /* renamed from: b */
    public final /* synthetic */ List f31515b;

    /* renamed from: c */
    public final /* synthetic */ C5185i1 f31516c;

    public RunnableC5085e1(C5185i1 c5185i1, String str, List list) {
        this.f31516c = c5185i1;
        this.f31514a = str;
        this.f31515b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f31516c).reportEvent(this.f31514a, CollectionUtils.getMapFromList(this.f31515b));
    }
}
