package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Nf */
/* loaded from: classes2.dex */
public final class C4688Nf {

    /* renamed from: a */
    public final Context f30512a;

    /* renamed from: b */
    public final SafePackageManager f30513b;

    /* renamed from: c */
    public final InterfaceC4707Oa f30514c;

    /* renamed from: d */
    public final C5346oc f30515d;

    /* renamed from: e */
    public final long f30516e;

    /* renamed from: f */
    public final String f30517f;

    /* renamed from: g */
    public final String f30518g;

    public C4688Nf(Context context, SafePackageManager safePackageManager, InterfaceC4707Oa interfaceC4707Oa) {
        this.f30512a = context;
        this.f30513b = safePackageManager;
        this.f30514c = interfaceC4707Oa;
        C5346oc c5346oc = new C5346oc(0);
        c5346oc.m20863a(EnumC4447Df.f30021d, 1);
        c5346oc.m20863a(EnumC4447Df.f30020c, 2);
        this.f30515d = c5346oc;
        this.f30516e = TimeUnit.DAYS.toSeconds(1L);
        this.f30517f = "com.android.vending";
        this.f30518g = "com.huawei.appmarket";
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x008c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C4472Ef m19659a(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4688Nf.m19659a(java.util.List):io.appmetrica.analytics.impl.Ef");
    }

    public /* synthetic */ C4688Nf(Context context) {
        this(context, new SafePackageManager(), AbstractC5235k1.m20601a());
    }

    /* renamed from: a */
    public static final int m19658a(C4688Nf c4688Nf, C4472Ef c4472Ef, C4472Ef c4472Ef2) {
        int iSignum = Long.signum(c4472Ef.f30078c - c4472Ef2.f30078c);
        return iSignum == 0 ? ((Number) c4688Nf.f30515d.m20862a(c4472Ef.f30079d)).intValue() - ((Number) c4688Nf.f30515d.m20862a(c4472Ef2.f30079d)).intValue() : iSignum;
    }
}
