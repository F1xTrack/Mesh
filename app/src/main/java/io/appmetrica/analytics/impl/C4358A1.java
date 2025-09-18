package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.A1 */
/* loaded from: classes2.dex */
public final class C4358A1 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C4408C1 f29837a;

    public C4358A1(C4408C1 c4408c1) {
        this.f29837a = c4408c1;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        this.f29837a.m19254a((File) obj);
    }
}
