package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.impl.Gm */
/* loaded from: classes2.dex */
public final class C4527Gm {

    /* renamed from: a */
    public final C4867V3 f30202a;

    /* renamed from: b */
    public final C5607yn f30203b;

    /* renamed from: c */
    public final ConjunctiveCompositeThreadSafeToggle f30204c;

    public C4527Gm(Toggle toggle) {
        C4867V3 c4867v3 = new C4867V3(C5244ka.m20614h().m20638w());
        this.f30202a = c4867v3;
        C5607yn c5607yn = new C5607yn();
        this.f30203b = c5607yn;
        this.f30204c = new ConjunctiveCompositeThreadSafeToggle(AbstractC7230yu.m26275f(c4867v3, c5607yn, toggle == null ? new C5432rn() : toggle), "loc-def");
    }
}
