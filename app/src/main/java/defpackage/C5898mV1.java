package defpackage;

import android.content.Context;
import java.util.HashMap;

/* renamed from: mV1 */
/* loaded from: classes.dex */
public final class C5898mV1 {
    public static C2059a22 j;
    public static final C6614qF1 k;
    public final String a;
    public final String b;
    public final C3594eV1 c;
    public final C6755r01 d;
    public final C3892g32 e;
    public final C3892g32 f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new C6614qF1(1, objArr);
    }

    public C5898mV1(Context context, C6755r01 c6755r01, C3594eV1 c3594eV1) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = AbstractC1639Uu.a(context);
        this.d = c6755r01;
        this.c = c3594eV1;
        NV1.D();
        this.g = "vision-common";
        C1016Mu0 c1016Mu0F = C1016Mu0.f();
        CallableC5290jK callableC5290jK = new CallableC5290jK(6, this);
        c1016Mu0F.getClass();
        this.e = C1016Mu0.O(callableC5290jK);
        C1016Mu0 c1016Mu0F2 = C1016Mu0.f();
        c6755r01.getClass();
        CallableC4358iV1 callableC4358iV1 = new CallableC4358iV1(c6755r01, 0);
        c1016Mu0F2.getClass();
        this.f = C1016Mu0.O(callableC4358iV1);
        C6614qF1 c6614qF1 = k;
        this.h = c6614qF1.containsKey("vision-common") ? MM.d(context, (String) c6614qF1.get("vision-common"), false) : -1;
    }
}
