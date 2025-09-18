package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.InterfaceC2777Ma;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.z5 */
/* loaded from: classes2.dex */
public class C3771z5 extends AbstractC3589s5 {

    /* renamed from: b */
    private final C3364je f25401b;

    /* renamed from: c */
    private final C2876Q9 f25402c;

    /* renamed from: d */
    private final C2666I f25403d;

    /* renamed from: e */
    private final C2541D f25404e;

    /* renamed from: f */
    private final C2591F f25405f;

    public C3771z5(C3250f4 c3250f4, C3364je c3364je) {
        this(c3250f4, c3364je, InterfaceC2777Ma.b.m14608a(C3130ae.class).mo14606a(c3250f4.m15908g()), new C2666I(c3250f4.m15908g()), new C2541D(), new C2591F(c3250f4.m15908g()));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3459n5
    /* renamed from: a */
    public boolean mo13844a(C3376k0 c3376k0) {
        C3130ae c3130ae;
        C3250f4 c3250f4M16718a = m16718a();
        c3250f4M16718a.m15906e().toString();
        if (!c3250f4M16718a.m15923w().m14301m() || !c3250f4M16718a.m15925z()) {
            return false;
        }
        C3130ae c3130ae2 = (C3130ae) this.f25402c.m14814b();
        List<C3338ie> list = c3130ae2.f23048a;
        C2641H c2641h = c3130ae2.f23049b;
        C2641H c2641hM14272a = this.f25403d.m14272a();
        List<String> list2 = c3130ae2.f23050c;
        List<String> listM14052a = this.f25405f.m14052a();
        List<C3338ie> listM16124a = this.f25401b.m16124a(m16718a().m15908g(), list);
        if (listM16124a == null && C2968U2.m15245a(c2641h, c2641hM14272a) && C3323i.m16069a(list2, listM14052a)) {
            c3130ae = null;
        } else {
            if (listM16124a != null) {
                list = listM16124a;
            }
            c3130ae = new C3130ae(list, c2641hM14272a, listM14052a);
        }
        if (c3130ae != null) {
            c3250f4M16718a.m15919r().m16898e(C3376k0.m16215a(c3376k0, c3130ae.f23048a, c3130ae.f23049b, this.f25404e, c3130ae.f23050c));
            this.f25402c.m14813a(c3130ae);
            return false;
        }
        if (!c3250f4M16718a.m15897D()) {
            return false;
        }
        c3250f4M16718a.m15919r().m16898e(C3376k0.m16215a(c3376k0, c3130ae2.f23048a, c3130ae2.f23049b, this.f25404e, c3130ae2.f23050c));
        return false;
    }

    public C3771z5(C3250f4 c3250f4, C3364je c3364je, C2876Q9 c2876q9, C2666I c2666i, C2541D c2541d, C2591F c2591f) {
        super(c3250f4);
        this.f25401b = c3364je;
        this.f25402c = c2876q9;
        this.f25403d = c2666i;
        this.f25404e = c2541d;
        this.f25405f = c2591f;
    }
}
