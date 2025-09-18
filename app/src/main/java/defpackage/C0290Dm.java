package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: Dm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290Dm extends C0390Et0 {
    public WU0 l = new WU0();
    public C0390Et0 m;
    public final Object n;

    public C0290Dm(Object obj) {
        this.n = obj;
    }

    @Override // androidx.lifecycle.b
    public final Object d() {
        C0390Et0 c0390Et0 = this.m;
        return c0390Et0 == null ? this.n : c0390Et0.d();
    }

    @Override // androidx.lifecycle.b
    public final void g() {
        Iterator it = this.l.iterator();
        while (true) {
            SU0 su0 = (SU0) it;
            if (!su0.hasNext()) {
                return;
            } else {
                ((C2015Zp0) ((Map.Entry) su0.next()).getValue()).a();
            }
        }
    }

    @Override // androidx.lifecycle.b
    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            SU0 su0 = (SU0) it;
            if (!su0.hasNext()) {
                return;
            }
            C2015Zp0 c2015Zp0 = (C2015Zp0) ((Map.Entry) su0.next()).getValue();
            c2015Zp0.a.i(c2015Zp0);
        }
    }

    public final void l(C0390Et0 c0390Et0) {
        C2015Zp0 c2015Zp0;
        C0390Et0 c0390Et02 = this.m;
        WU0 wu0 = this.l;
        if (c0390Et02 != null && (c2015Zp0 = (C2015Zp0) wu0.h(c0390Et02)) != null) {
            c2015Zp0.a.i(c2015Zp0);
        }
        this.m = c0390Et0;
        B7 b7 = new B7(6, this);
        if (c0390Et0 == null) {
            throw new NullPointerException("source cannot be null");
        }
        C2015Zp0 c2015Zp02 = new C2015Zp0(c0390Et0, b7);
        C2015Zp0 c2015Zp03 = (C2015Zp0) wu0.d(c0390Et0, c2015Zp02);
        if (c2015Zp03 != null && c2015Zp03.b != b7) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (c2015Zp03 == null && this.c > 0) {
            c2015Zp02.a();
        }
    }
}
