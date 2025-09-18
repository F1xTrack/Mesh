package p000;

import android.content.Context;
import java.util.HashMap;

/* renamed from: mV1 */
/* loaded from: classes.dex */
public final class C10274mV1 {

    /* renamed from: j */
    public static C8674a22 f37732j;

    /* renamed from: k */
    public static final C10754qF1 f37733k;

    /* renamed from: a */
    public final String f37734a;

    /* renamed from: b */
    public final String f37735b;

    /* renamed from: c */
    public final C9250eV1 f37736c;

    /* renamed from: d */
    public final C10848r01 f37737d;

    /* renamed from: e */
    public final C9450g32 f37738e;

    /* renamed from: f */
    public final C9450g32 f37739f;

    /* renamed from: g */
    public final String f37740g;

    /* renamed from: h */
    public final int f37741h;

    /* renamed from: i */
    public final HashMap f37742i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f37733k = new C10754qF1(1, objArr);
    }

    public C10274mV1(Context context, C10848r01 c10848r01, C9250eV1 c9250eV1) {
        new HashMap();
        this.f37734a = context.getPackageName();
        this.f37735b = AbstractC1315Uu.m8199a(context);
        this.f37737d = c10848r01;
        this.f37736c = c9250eV1;
        NV1.m5729D();
        this.f37740g = "vision-common";
        C7978Mu0 c7978Mu0M5464f = C7978Mu0.m5464f();
        CallableC6230jK callableC6230jK = new CallableC6230jK(6, this);
        c7978Mu0M5464f.getClass();
        this.f37738e = C7978Mu0.m5462O(callableC6230jK);
        C7978Mu0 c7978Mu0M5464f2 = C7978Mu0.m5464f();
        c10848r01.getClass();
        CallableC9762iV1 callableC9762iV1 = new CallableC9762iV1(c10848r01, 0);
        c7978Mu0M5464f2.getClass();
        this.f37739f = C7978Mu0.m5462O(callableC9762iV1);
        C10754qF1 c10754qF1 = f37733k;
        this.f37741h = c10754qF1.containsKey("vision-common") ? C0778MM.m5343d(context, (String) c10754qF1.get("vision-common"), false) : -1;
    }
}
