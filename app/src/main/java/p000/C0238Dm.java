package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: Dm */
/* loaded from: classes.dex */
public final class C0238Dm extends C7560Et0 {

    /* renamed from: l */
    public WU0 f2232l = new WU0();

    /* renamed from: m */
    public C7560Et0 f2233m;

    /* renamed from: n */
    public final Object f2234n;

    public C0238Dm(Object obj) {
        this.f2234n = obj;
    }

    @Override // androidx.lifecycle.AbstractC1743b
    /* renamed from: d */
    public final Object mo1868d() {
        C7560Et0 c7560Et0 = this.f2233m;
        return c7560Et0 == null ? this.f2234n : c7560Et0.mo1868d();
    }

    @Override // androidx.lifecycle.AbstractC1743b
    /* renamed from: g */
    public final void mo1869g() {
        Iterator it = this.f2232l.iterator();
        while (true) {
            SU0 su0 = (SU0) it;
            if (!su0.hasNext()) {
                return;
            } else {
                ((C8644Zp0) ((Map.Entry) su0.next()).getValue()).m9612a();
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1743b
    /* renamed from: h */
    public final void mo1870h() {
        Iterator it = this.f2232l.iterator();
        while (true) {
            SU0 su0 = (SU0) it;
            if (!su0.hasNext()) {
                return;
            }
            C8644Zp0 c8644Zp0 = (C8644Zp0) ((Map.Entry) su0.next()).getValue();
            c8644Zp0.f15141a.mo10135i(c8644Zp0);
        }
    }

    /* renamed from: l */
    public final void m1871l(C7560Et0 c7560Et0) {
        C8644Zp0 c8644Zp0;
        C7560Et0 c7560Et02 = this.f2233m;
        WU0 wu0 = this.f2232l;
        if (c7560Et02 != null && (c8644Zp0 = (C8644Zp0) wu0.mo1189h(c7560Et02)) != null) {
            c8644Zp0.f15141a.mo10135i(c8644Zp0);
        }
        this.f2233m = c7560Et0;
        C0071B7 c0071b7 = new C0071B7(6, this);
        if (c7560Et0 == null) {
            throw new NullPointerException("source cannot be null");
        }
        C8644Zp0 c8644Zp02 = new C8644Zp0(c7560Et0, c0071b7);
        C8644Zp0 c8644Zp03 = (C8644Zp0) wu0.mo1188d(c7560Et0, c8644Zp02);
        if (c8644Zp03 != null && c8644Zp03.f15142b != c0071b7) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (c8644Zp03 == null && this.f16318c > 0) {
            c8644Zp02.m9612a();
        }
    }
}
