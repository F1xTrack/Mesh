package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;

/* renamed from: io.appmetrica.analytics.location.impl.h */
/* loaded from: classes2.dex */
public final class C5644h implements Consumer {

    /* renamed from: a */
    public final C5649m f32964a;

    public C5644h(C5649m c5649m) {
        this.f32964a = c5649m;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(Location location) {
        if (location != null) {
            this.f32964a.updateData(location);
        }
    }
}
