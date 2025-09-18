package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Ma;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.z5 */
/* loaded from: classes2.dex */
public class C3248z5 extends AbstractC3068s5 {
    private final C2853je b;
    private final Q9 c;
    private final I d;
    private final D e;
    private final F f;

    public C3248z5(C2744f4 c2744f4, C2853je c2853je) {
        this(c2744f4, c2853je, Ma.b.a(C2629ae.class).a(c2744f4.g()), new I(c2744f4.g()), new D(), new F(c2744f4.g()));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        C2629ae c2629ae;
        C2744f4 c2744f4A = a();
        c2744f4A.e().toString();
        if (!c2744f4A.w().m() || !c2744f4A.z()) {
            return false;
        }
        C2629ae c2629ae2 = (C2629ae) this.c.b();
        List<C2829ie> list = c2629ae2.a;
        H h = c2629ae2.b;
        H hA = this.d.a();
        List<String> list2 = c2629ae2.c;
        List<String> listA = this.f.a();
        List<C2829ie> listA2 = this.b.a(a().g(), list);
        if (listA2 == null && U2.a(h, hA) && C2814i.a(list2, listA)) {
            c2629ae = null;
        } else {
            if (listA2 != null) {
                list = listA2;
            }
            c2629ae = new C2629ae(list, hA, listA);
        }
        if (c2629ae != null) {
            c2744f4A.r().e(C2864k0.a(c2864k0, c2629ae.a, c2629ae.b, this.e, c2629ae.c));
            this.c.a(c2629ae);
            return false;
        }
        if (!c2744f4A.D()) {
            return false;
        }
        c2744f4A.r().e(C2864k0.a(c2864k0, c2629ae2.a, c2629ae2.b, this.e, c2629ae2.c));
        return false;
    }

    public C3248z5(C2744f4 c2744f4, C2853je c2853je, Q9 q9, I i, D d, F f) {
        super(c2744f4);
        this.b = c2853je;
        this.c = q9;
        this.d = i;
        this.e = d;
        this.f = f;
    }
}
