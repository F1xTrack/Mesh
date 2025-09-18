package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PD {
    public final Class a;
    public final List b;
    public final InterfaceC8176yS0 c;
    public final C1857Xo1 d;
    public final String e;

    public PD(Class cls, Class cls2, Class cls3, List list, InterfaceC8176yS0 interfaceC8176yS0, C1857Xo1 c1857Xo1) {
        this.a = cls;
        this.b = list;
        this.c = interfaceC8176yS0;
        this.d = c1857Xo1;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final InterfaceC5506kS0 a(int i, int i2, TC tc, C0795Jy0 c0795Jy0, ES1 es1) {
        InterfaceC5506kS0 interfaceC5506kS0B;
        InterfaceC7446uc1 interfaceC7446uc1;
        int iR;
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC0660If0 cc;
        C1857Xo1 c1857Xo1 = this.d;
        List list = (List) c1857Xo1.i();
        try {
            InterfaceC5506kS0 interfaceC5506kS0B2 = b(tc, i, i2, c0795Jy0, list);
            c1857Xo1.d(list);
            OD od = (OD) es1.c;
            od.getClass();
            Class<?> cls = interfaceC5506kS0B2.get().getClass();
            XC xc = XC.d;
            XC xc2 = (XC) es1.b;
            ND nd = od.a;
            InterfaceC6842rS0 interfaceC6842rS0A = null;
            if (xc2 != xc) {
                InterfaceC7446uc1 interfaceC7446uc1E = nd.e(cls);
                interfaceC5506kS0B = interfaceC7446uc1E.b(od.h, interfaceC5506kS0B2, od.l, od.m);
                interfaceC7446uc1 = interfaceC7446uc1E;
            } else {
                interfaceC5506kS0B = interfaceC5506kS0B2;
                interfaceC7446uc1 = null;
            }
            if (!interfaceC5506kS0B2.equals(interfaceC5506kS0B)) {
                interfaceC5506kS0B2.recycle();
            }
            if (nd.c.a().d.a(interfaceC5506kS0B.a()) != null) {
                C3578eQ0 c3578eQ0A = nd.c.a();
                c3578eQ0A.getClass();
                interfaceC6842rS0A = c3578eQ0A.d.a(interfaceC5506kS0B.a());
                if (interfaceC6842rS0A == null) {
                    throw new C3388dQ0(interfaceC5506kS0B.a());
                }
                iR = interfaceC6842rS0A.r(od.o);
            } else {
                iR = 3;
            }
            InterfaceC0660If0 interfaceC0660If0 = od.u;
            ArrayList arrayListB = nd.b();
            int size = arrayListB.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((C7111ss0) arrayListB.get(i3)).a.equals(interfaceC0660If0)) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (od.n.d(!z, xc2, iR)) {
                if (interfaceC6842rS0A == null) {
                    throw new C3388dQ0(interfaceC5506kS0B.get().getClass());
                }
                int iX = AbstractC8235ym.x(iR);
                if (iX == 0) {
                    z2 = true;
                    z3 = false;
                    cc = new CC(od.u, od.i);
                } else {
                    if (iX != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(iR != 1 ? iR != 2 ? iR != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z2 = true;
                    z3 = false;
                    cc = new C5888mS0(nd.c.a, od.u, od.i, od.l, od.m, interfaceC7446uc1, cls, od.o);
                }
                C3641el0 c3641el0 = (C3641el0) C3641el0.e.i();
                c3641el0.d = z3;
                c3641el0.c = z2;
                c3641el0.b = interfaceC5506kS0B;
                C6846rT1 c6846rT1 = od.f;
                c6846rT1.b = cc;
                c6846rT1.c = interfaceC6842rS0A;
                c6846rT1.d = c3641el0;
                interfaceC5506kS0B = c3641el0;
            }
            return this.c.t(interfaceC5506kS0B, c0795Jy0);
        } catch (Throwable th) {
            c1857Xo1.d(list);
            throw th;
        }
    }

    public final InterfaceC5506kS0 b(TC tc, int i, int i2, C0795Jy0 c0795Jy0, List list) throws C8283z10 {
        List list2 = this.b;
        int size = list2.size();
        InterfaceC5506kS0 interfaceC5506kS0B = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC6079nS0 interfaceC6079nS0 = (InterfaceC6079nS0) list2.get(i3);
            try {
                if (interfaceC6079nS0.a(tc.m(), c0795Jy0)) {
                    interfaceC5506kS0B = interfaceC6079nS0.b(tc.m(), i, i2, c0795Jy0);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(interfaceC6079nS0);
                }
                list.add(e);
            }
            if (interfaceC5506kS0B != null) {
                break;
            }
        }
        if (interfaceC5506kS0B != null) {
            return interfaceC5506kS0B;
        }
        throw new C8283z10(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
