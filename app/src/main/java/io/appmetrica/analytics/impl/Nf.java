package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Nf {
    public final Context a;
    public final SafePackageManager b;
    public final Oa c;
    public final C4765oc d;
    public final long e;
    public final String f;
    public final String g;

    public Nf(Context context, SafePackageManager safePackageManager, Oa oa) {
        this.a = context;
        this.b = safePackageManager;
        this.c = oa;
        C4765oc c4765oc = new C4765oc(0);
        c4765oc.a(Df.d, 1);
        c4765oc.a(Df.c, 2);
        this.d = c4765oc;
        this.e = TimeUnit.DAYS.toSeconds(1L);
        this.f = "com.android.vending";
        this.g = "com.huawei.appmarket";
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.Ef a(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Nf.a(java.util.List):io.appmetrica.analytics.impl.Ef");
    }

    public /* synthetic */ Nf(Context context) {
        this(context, new SafePackageManager(), AbstractC4658k1.a());
    }

    public static final int a(Nf nf, Ef ef, Ef ef2) {
        int iSignum = Long.signum(ef.c - ef2.c);
        return iSignum == 0 ? ((Number) nf.d.a(ef.d)).intValue() - ((Number) nf.d.a(ef2.d)).intValue() : iSignum;
    }
}
