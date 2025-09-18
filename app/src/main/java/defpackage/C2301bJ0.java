package defpackage;

import java.util.HashMap;

/* renamed from: bJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2301bJ0 extends C8429zn0 {
    public static final HashMap d = new HashMap();

    @Override // defpackage.C8429zn0
    public final C8049xn0 a(C7295tq c7295tq) {
        C8049xn0 c8049xn0A = super.a(c7295tq.a());
        C7295tq c7295tqA = c8049xn0A.a.a();
        String str = c8049xn0A.b;
        if (str != null) {
            return new C8049xn0(c7295tqA, AbstractC7538v51.M(str).toString(), c8049xn0A.c, c8049xn0A.d);
        }
        throw new C0811Kd1("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @Override // defpackage.C8429zn0
    public final C1204Pf b(C7295tq c7295tq) {
        return new C2110aJ0(3, c7295tq);
    }
}
