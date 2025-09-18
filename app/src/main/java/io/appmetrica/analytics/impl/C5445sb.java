package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import kotlin.Lazy;
import p000.AbstractC0705LB;

/* renamed from: io.appmetrica.analytics.impl.sb */
/* loaded from: classes2.dex */
public final class C5445sb implements ConfigProvider {

    /* renamed from: a */
    public final C5139g5 f32566a;

    /* renamed from: b */
    public final Lazy f32567b = AbstractC0705LB.m4915b(new C5420rb(this));

    public C5445sb(C5139g5 c5139g5) {
        this.f32566a = c5139g5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a */
    public final C4473Eg getConfig() {
        return (C4473Eg) this.f32567b.getValue();
    }
}
