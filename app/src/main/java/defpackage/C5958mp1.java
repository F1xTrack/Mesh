package defpackage;

import android.content.Context;

/* renamed from: mp1 */
/* loaded from: classes2.dex */
public final class C5958mp1 {
    public static final C0318Dv0 c = new C0318Dv0(23);
    public static C5958mp1 d;
    public final N8 a;
    public final C1397Rr0 b;

    public C5958mp1(Context context) {
        EK ek = new EK();
        C0396Ev0 c0396Ev0 = new C0396Ev0(23);
        C7409uQ0 c7409uQ0 = new C7409uQ0();
        c7409uQ0.a = context.getSharedPreferences("metrics_sdk_sp", 0);
        C1304Qm0 c1304Qm0 = new C1304Qm0(new C3383dO1(new C3675ew1(context, new C6518pl0(new C0474Fv0(25), new OJ1(25), new C7304tt(26, new C7532v32(23)), new C0240Cv0(7))), c0396Ev0), new C0162Bv0(new C0318Dv0(25), new C0318Dv0(24)), new C0396Ev0(16, new C0318Dv0(25)), c0396Ev0);
        N8 n8 = new N8(c1304Qm0, 2, new N8(c1304Qm0, 23, new T71(new G10(c7409uQ0, 1, new C0318Dv0(24)), new C1304Qm0(5, context), new C0136Bm1(25, new C1632Ur1(new C3759fN(24), new C0474Fv0(19), c0396Ev0)), new C2192ak1(context))));
        this.a = n8;
        this.b = new C1397Rr0(new C2226aw(n8, new A61(5, c1304Qm0), new A90(context, new OL0(new NV1(new OJ1(24)))), ek, c0396Ev0));
    }
}
