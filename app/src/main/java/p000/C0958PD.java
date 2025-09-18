package p000;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: PD */
/* loaded from: classes.dex */
public final class C0958PD {

    /* renamed from: a */
    public final Class f8892a;

    /* renamed from: b */
    public final List f8893b;

    /* renamed from: c */
    public final InterfaceC11800yS0 f8894c;

    /* renamed from: d */
    public final C8539Xo1 f8895d;

    /* renamed from: e */
    public final String f8896e;

    public C0958PD(Class cls, Class cls2, Class cls3, List list, InterfaceC11800yS0 interfaceC11800yS0, C8539Xo1 c8539Xo1) {
        this.f8892a = cls;
        this.f8893b = list;
        this.f8894c = interfaceC11800yS0;
        this.f8895d = c8539Xo1;
        this.f8896e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public final InterfaceC10011kS0 m6255a(int i, int i2, InterfaceC1208TC interfaceC1208TC, C7830Jy0 c7830Jy0, ES1 es1) {
        InterfaceC10011kS0 interfaceC10011kS0Mo8829b;
        InterfaceC11312uc1 interfaceC11312uc1;
        int iMo401r;
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC7740If0 c0139cc;
        C8539Xo1 c8539Xo1 = this.f8895d;
        List list = (List) c8539Xo1.mo4581i();
        try {
            InterfaceC10011kS0 interfaceC10011kS0M6256b = m6256b(interfaceC1208TC, i, i2, c7830Jy0, list);
            c8539Xo1.mo4580d(list);
            RunnableC0895OD runnableC0895OD = (RunnableC0895OD) es1.f2709c;
            runnableC0895OD.getClass();
            Class<?> cls = interfaceC10011kS0M6256b.get().getClass();
            EnumC1460XC enumC1460XC = EnumC1460XC.f13617d;
            EnumC1460XC enumC1460XC2 = (EnumC1460XC) es1.f2708b;
            C0832ND c0832nd = runnableC0895OD.f8278a;
            InterfaceC10907rS0 interfaceC10907rS0M3056a = null;
            if (enumC1460XC2 != enumC1460XC) {
                InterfaceC11312uc1 interfaceC11312uc1M5587e = c0832nd.m5587e(cls);
                interfaceC10011kS0Mo8829b = interfaceC11312uc1M5587e.mo8829b(runnableC0895OD.f8285h, interfaceC10011kS0M6256b, runnableC0895OD.f8289l, runnableC0895OD.f8290m);
                interfaceC11312uc1 = interfaceC11312uc1M5587e;
            } else {
                interfaceC10011kS0Mo8829b = interfaceC10011kS0M6256b;
                interfaceC11312uc1 = null;
            }
            if (!interfaceC10011kS0M6256b.equals(interfaceC10011kS0Mo8829b)) {
                interfaceC10011kS0M6256b.recycle();
            }
            if (c0832nd.f7553c.m25734a().f26700d.m3056a(interfaceC10011kS0Mo8829b.mo4302a()) != null) {
                C9239eQ0 c9239eQ0M25734a = c0832nd.f7553c.m25734a();
                c9239eQ0M25734a.getClass();
                interfaceC10907rS0M3056a = c9239eQ0M25734a.f26700d.m3056a(interfaceC10011kS0Mo8829b.mo4302a());
                if (interfaceC10907rS0M3056a == null) {
                    throw new C9111dQ0(interfaceC10011kS0Mo8829b.mo4302a());
                }
                iMo401r = interfaceC10907rS0M3056a.mo401r(runnableC0895OD.f8292o);
            } else {
                iMo401r = 3;
            }
            InterfaceC7740If0 interfaceC7740If0 = runnableC0895OD.f8298u;
            ArrayList arrayListM5584b = c0832nd.m5584b();
            int size = arrayListM5584b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((C11087ss0) arrayListM5584b.get(i3)).f42647a.equals(interfaceC7740If0)) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (runnableC0895OD.f8291n.mo17910d(!z, enumC1460XC2, iMo401r)) {
                if (interfaceC10907rS0M3056a == null) {
                    throw new C9111dQ0(interfaceC10011kS0Mo8829b.get().getClass());
                }
                int iM26247x = AbstractC7222ym.m26247x(iMo401r);
                if (iM26247x == 0) {
                    z2 = true;
                    z3 = false;
                    c0139cc = new C0139CC(runnableC0895OD.f8298u, runnableC0895OD.f8286i);
                } else {
                    if (iM26247x != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(iMo401r != 1 ? iMo401r != 2 ? iMo401r != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z2 = true;
                    z3 = false;
                    c0139cc = new C10267mS0(c0832nd.f7553c.f45261a, runnableC0895OD.f8298u, runnableC0895OD.f8286i, runnableC0895OD.f8289l, runnableC0895OD.f8290m, interfaceC11312uc1, cls, runnableC0895OD.f8292o);
                }
                C9281el0 c9281el0 = (C9281el0) C9281el0.f26822e.mo4581i();
                c9281el0.f26826d = z3;
                c9281el0.f26825c = z2;
                c9281el0.f26824b = interfaceC10011kS0Mo8829b;
                C10910rT1 c10910rT1 = runnableC0895OD.f8283f;
                c10910rT1.f41678b = c0139cc;
                c10910rT1.f41679c = interfaceC10907rS0M3056a;
                c10910rT1.f41680d = c9281el0;
                interfaceC10011kS0Mo8829b = c9281el0;
            }
            return this.f8894c.mo875t(interfaceC10011kS0Mo8829b, c7830Jy0);
        } catch (Throwable th) {
            c8539Xo1.mo4580d(list);
            throw th;
        }
    }

    /* renamed from: b */
    public final InterfaceC10011kS0 m6256b(InterfaceC1208TC interfaceC1208TC, int i, int i2, C7830Jy0 c7830Jy0, List list) throws C11871z10 {
        List list2 = this.f8893b;
        int size = list2.size();
        InterfaceC10011kS0 interfaceC10011kS0Mo9108b = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC10395nS0 interfaceC10395nS0 = (InterfaceC10395nS0) list2.get(i3);
            try {
                if (interfaceC10395nS0.mo9107a(interfaceC1208TC.mo2902m(), c7830Jy0)) {
                    interfaceC10011kS0Mo9108b = interfaceC10395nS0.mo9108b(interfaceC1208TC.mo2902m(), i, i2, c7830Jy0);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(interfaceC10395nS0);
                }
                list.add(e);
            }
            if (interfaceC10011kS0Mo9108b != null) {
                break;
            }
        }
        if (interfaceC10011kS0Mo9108b != null) {
            return interfaceC10011kS0Mo9108b;
        }
        throw new C11871z10(this.f8896e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f8892a + ", decoders=" + this.f8893b + ", transcoder=" + this.f8894c + '}';
    }
}
