package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class V02 {

    /* renamed from: b */
    public static final C7937Lz1 f12294b = C7937Lz1.m5178a(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);

    /* renamed from: a */
    public final String f12295a;

    public V02(Context context, C10848r01 c10848r01) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        AbstractC1315Uu.m8199a(context);
        synchronized (C10212m12.class) {
            if (C10212m12.f37412b == null) {
                C10212m12.f37412b = new C10212m12(0);
            }
        }
        this.f12295a = "common";
        C7978Mu0 c7978Mu0M5464f = C7978Mu0.m5464f();
        CallableC6230jK callableC6230jK = new CallableC6230jK(7, this);
        c7978Mu0M5464f.getClass();
        C7978Mu0.m5462O(callableC6230jK);
        C7978Mu0 c7978Mu0M5464f2 = C7978Mu0.m5464f();
        Objects.requireNonNull(c10848r01);
        CallableC9762iV1 callableC9762iV1 = new CallableC9762iV1(c10848r01, 1);
        c7978Mu0M5464f2.getClass();
        C7978Mu0.m5462O(callableC9762iV1);
        C7937Lz1 c7937Lz1 = f12294b;
        if (c7937Lz1.containsKey("common")) {
            C0778MM.m5343d(context, (String) c7937Lz1.get("common"), false);
        }
    }
}
