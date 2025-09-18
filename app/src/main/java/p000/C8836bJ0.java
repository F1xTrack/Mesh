package p000;

import java.util.HashMap;

/* renamed from: bJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8836bJ0 extends C11969zn0 {

    /* renamed from: d */
    public static final HashMap f16971d = new HashMap();

    @Override // p000.C11969zn0
    /* renamed from: a */
    public final C11715xn0 mo10446a(C6911tq c6911tq) {
        C11715xn0 c11715xn0Mo10446a = super.mo10446a(c6911tq.m24995a());
        C6911tq c6911tqM24995a = c11715xn0Mo10446a.f45787a.m24995a();
        String str = c11715xn0Mo10446a.f45788b;
        if (str != null) {
            return new C11715xn0(c6911tqM24995a, AbstractC11374v51.m25338M(str).toString(), c11715xn0Mo10446a.f45789c, c11715xn0Mo10446a.f45790d);
        }
        throw new C7841Kd1("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @Override // p000.C11969zn0
    /* renamed from: b */
    public final C0986Pf mo10447b(C6911tq c6911tq) {
        return new C8708aJ0(3, c6911tq);
    }
}
