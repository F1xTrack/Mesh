package io.appmetrica.analytics.impl;

import defpackage.LB;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import kotlin.Lazy;

/* renamed from: io.appmetrica.analytics.impl.sb */
/* loaded from: classes2.dex */
public final class C4859sb implements ConfigProvider {
    public final C4567g5 a;
    public final Lazy b = LB.b(new C4835rb(this));

    public C4859sb(C4567g5 c4567g5) {
        this.a = c4567g5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a */
    public final Eg getConfig() {
        return (Eg) this.b.getValue();
    }
}
