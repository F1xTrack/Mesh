package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import defpackage.C2171ad1;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4536em {
    public final C4753o0 a;
    public final Cn b;
    public final C4776p c;
    public final Zj d;
    public final I5 e;

    public C4536em(C4753o0 c4753o0, Cn cn, C4776p c4776p, Zj zj, I5 i5) {
        this.a = c4753o0;
        this.b = cn;
        this.c = c4776p;
        this.d = zj;
        this.e = i5;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new C2171ad1(4));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C4536em(C4753o0 c4753o0, Cn cn) {
        this(c4753o0, cn, C4805q4.h().a(), C4805q4.h().l(), C4805q4.h().f());
    }
}
