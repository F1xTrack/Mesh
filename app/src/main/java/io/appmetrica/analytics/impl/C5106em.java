package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import p000.C8749ad1;

/* renamed from: io.appmetrica.analytics.impl.em */
/* loaded from: classes2.dex */
public final class C5106em {

    /* renamed from: a */
    public final C5334o0 f31637a;

    /* renamed from: b */
    public final C4430Cn f31638b;

    /* renamed from: c */
    public final C5358p f31639c;

    /* renamed from: d */
    public final C4979Zj f31640d;

    /* renamed from: e */
    public final C4558I5 f31641e;

    public C5106em(C5334o0 c5334o0, C4430Cn c4430Cn, C5358p c5358p, C4979Zj c4979Zj, C4558I5 c4558i5) {
        this.f31637a = c5334o0;
        this.f31638b = c4430Cn;
        this.f31639c = c5358p;
        this.f31640d = c4979Zj;
        this.f31641e = c4558i5;
    }

    /* renamed from: a */
    public static Intent m20351a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new C8749ad1(4));
    }

    /* renamed from: b */
    public static final Intent m20352b(Activity activity) {
        return activity.getIntent();
    }

    public C5106em(C5334o0 c5334o0, C4430Cn c4430Cn) {
        this(c5334o0, c4430Cn, C5388q4.m20928h().m20930a(), C5388q4.m20928h().m20941l(), C5388q4.m20928h().m20936f());
    }
}
