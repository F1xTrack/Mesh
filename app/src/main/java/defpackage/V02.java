package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class V02 {
    public static final C0954Lz1 b = C0954Lz1.a(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public V02(Context context, C6755r01 c6755r01) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        AbstractC1639Uu.a(context);
        synchronized (C5806m12.class) {
            if (C5806m12.b == null) {
                C5806m12.b = new C5806m12(0);
            }
        }
        this.a = "common";
        C1016Mu0 c1016Mu0F = C1016Mu0.f();
        CallableC5290jK callableC5290jK = new CallableC5290jK(7, this);
        c1016Mu0F.getClass();
        C1016Mu0.O(callableC5290jK);
        C1016Mu0 c1016Mu0F2 = C1016Mu0.f();
        Objects.requireNonNull(c6755r01);
        CallableC4358iV1 callableC4358iV1 = new CallableC4358iV1(c6755r01, 1);
        c1016Mu0F2.getClass();
        C1016Mu0.O(callableC4358iV1);
        C0954Lz1 c0954Lz1 = b;
        if (c0954Lz1.containsKey("common")) {
            MM.d(context, (String) c0954Lz1.get("common"), false);
        }
    }
}
