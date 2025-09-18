package p000;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Zw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8658Zw0 extends AbstractC10930rd1 {

    /* renamed from: a */
    public final C1753aw f15233a;

    /* renamed from: b */
    public final EnumC8407Va1 f15234b;

    static {
        new C7618Fw0(1, EnumC8407Va1.f12624a);
    }

    public C8658Zw0(C1753aw c1753aw, EnumC8407Va1 enumC8407Va1) {
        this.f15233a = c1753aw;
        this.f15234b = enumC8407Va1;
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: a */
    public final Object mo480a(C11820yc0 c11820yc0) {
        Object arrayList;
        Serializable arrayList2;
        int iM26194p0 = c11820yc0.m26194p0();
        int iM26247x = AbstractC7222ym.m26247x(iM26194p0);
        if (iM26247x == 0) {
            c11820yc0.m26187m();
            arrayList = new ArrayList();
        } else if (iM26247x != 2) {
            arrayList = null;
        } else {
            c11820yc0.m26189n();
            arrayList = new C10301mj0(true, 0);
        }
        if (arrayList == null) {
            return m9646c(c11820yc0, iM26194p0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c11820yc0.m26177J()) {
                String strM26184e0 = arrayList instanceof Map ? c11820yc0.m26184e0() : null;
                int iM26194p02 = c11820yc0.m26194p0();
                int iM26247x2 = AbstractC7222ym.m26247x(iM26194p02);
                if (iM26247x2 == 0) {
                    c11820yc0.m26187m();
                    arrayList2 = new ArrayList();
                } else if (iM26247x2 != 2) {
                    arrayList2 = null;
                } else {
                    c11820yc0.m26189n();
                    arrayList2 = new C10301mj0(true, 0);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = m9646c(c11820yc0, iM26194p02);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strM26184e0, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c11820yc0.m26201w();
                } else {
                    c11820yc0.m26203x();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: b */
    public final void mo481b(C7838Kc0 c7838Kc0, Object obj) throws IOException {
        if (obj == null) {
            c7838Kc0.m4680J();
            return;
        }
        Class<?> cls = obj.getClass();
        C1753aw c1753aw = this.f15233a;
        c1753aw.getClass();
        AbstractC10930rd1 abstractC10930rd1M10388g = c1753aw.m10388g(new C11698xe1(cls));
        if (!(abstractC10930rd1M10388g instanceof C8658Zw0)) {
            abstractC10930rd1M10388g.mo481b(c7838Kc0, obj);
        } else {
            c7838Kc0.m4691o();
            c7838Kc0.m4694x();
        }
    }

    /* renamed from: c */
    public final Serializable m9646c(C11820yc0 c11820yc0, int i) {
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 5) {
            return c11820yc0.m26190n0();
        }
        if (iM26247x == 6) {
            return this.f15234b.mo7044a(c11820yc0);
        }
        if (iM26247x == 7) {
            return Boolean.valueOf(c11820yc0.m26180W());
        }
        if (iM26247x != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0852NX.m5771t(i)));
        }
        c11820yc0.m26186i0();
        return null;
    }
}
