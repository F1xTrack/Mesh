package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Zw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2036Zw0 extends AbstractC6876rd1 {
    public final C2226aw a;
    public final EnumC1659Va1 b;

    static {
        new C0477Fw0(1, EnumC1659Va1.a);
    }

    public C2036Zw0(C2226aw c2226aw, EnumC1659Va1 enumC1659Va1) {
        this.a = c2226aw;
        this.b = enumC1659Va1;
    }

    @Override // defpackage.AbstractC6876rd1
    public final Object a(C8206yc0 c8206yc0) {
        Object arrayList;
        Serializable arrayList2;
        int iP0 = c8206yc0.p0();
        int iX = AbstractC8235ym.x(iP0);
        if (iX == 0) {
            c8206yc0.m();
            arrayList = new ArrayList();
        } else if (iX != 2) {
            arrayList = null;
        } else {
            c8206yc0.n();
            arrayList = new C5939mj0(true, 0);
        }
        if (arrayList == null) {
            return c(c8206yc0, iP0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c8206yc0.J()) {
                String strE0 = arrayList instanceof Map ? c8206yc0.e0() : null;
                int iP02 = c8206yc0.p0();
                int iX2 = AbstractC8235ym.x(iP02);
                if (iX2 == 0) {
                    c8206yc0.m();
                    arrayList2 = new ArrayList();
                } else if (iX2 != 2) {
                    arrayList2 = null;
                } else {
                    c8206yc0.n();
                    arrayList2 = new C5939mj0(true, 0);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(c8206yc0, iP02);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strE0, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c8206yc0.w();
                } else {
                    c8206yc0.x();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.AbstractC6876rd1
    public final void b(C0807Kc0 c0807Kc0, Object obj) throws IOException {
        if (obj == null) {
            c0807Kc0.J();
            return;
        }
        Class<?> cls = obj.getClass();
        C2226aw c2226aw = this.a;
        c2226aw.getClass();
        AbstractC6876rd1 abstractC6876rd1G = c2226aw.g(new C8023xe1(cls));
        if (!(abstractC6876rd1G instanceof C2036Zw0)) {
            abstractC6876rd1G.b(c0807Kc0, obj);
        } else {
            c0807Kc0.o();
            c0807Kc0.x();
        }
    }

    public final Serializable c(C8206yc0 c8206yc0, int i) {
        int iX = AbstractC8235ym.x(i);
        if (iX == 5) {
            return c8206yc0.n0();
        }
        if (iX == 6) {
            return this.b.a(c8206yc0);
        }
        if (iX == 7) {
            return Boolean.valueOf(c8206yc0.W());
        }
        if (iX != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(NX.t(i)));
        }
        c8206yc0.i0();
        return null;
    }
}
