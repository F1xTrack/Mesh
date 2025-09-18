package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: vZ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7626vZ extends E {
    public final /* synthetic */ C7816wZ c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7626vZ(C7816wZ c7816wZ) {
        super(c7816wZ.e);
        this.c = c7816wZ;
    }

    @Override // defpackage.E, defpackage.InterfaceC1200Pd1
    public final InterfaceC1087Ns a() {
        return this.c;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.AbstractC5612l1
    public final Collection e() {
        List listF;
        C7816wZ c7816wZ = this.c;
        KZ kz = c7816wZ.g;
        GZ gz = GZ.c;
        if (O90.a(kz, gz)) {
            listF = AbstractC8259yu.e(C7816wZ.l);
        } else {
            boolean zA = O90.a(kz, HZ.c);
            int i = c7816wZ.h;
            if (zA) {
                listF = AbstractC8259yu.f(C7816wZ.m, new C0074As(AbstractC6581q41.l, gz.a(i)));
            } else {
                JZ jz = JZ.c;
                if (O90.a(kz, jz)) {
                    listF = AbstractC8259yu.e(C7816wZ.l);
                } else {
                    if (!O90.a(kz, IZ.c)) {
                        int i2 = AbstractC6002n3.a;
                        throw new IllegalStateException("should not be called");
                    }
                    listF = AbstractC8259yu.f(C7816wZ.m, new C0074As(AbstractC6581q41.f, jz.a(i)));
                }
            }
        }
        InterfaceC0153Bs0 interfaceC0153Bs0I = c7816wZ.f.i();
        List<C0074As> list = listF;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
        for (C0074As c0074As : list) {
            InterfaceC7492us interfaceC7492usB = AbstractC3312d12.b(interfaceC0153Bs0I, c0074As);
            if (interfaceC7492usB == null) {
                throw new IllegalStateException(("Built-in class " + c0074As + " not found").toString());
            }
            List listY = AbstractC8069xu.Y(interfaceC7492usB.v().getParameters().size(), c7816wZ.k);
            ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(listY));
            Iterator it = listY.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C6962s41(((InterfaceC5925me1) it.next()).m()));
            }
            C0733Jd1.b.getClass();
            arrayList.add(NV1.y(C0733Jd1.c, interfaceC7492usB, arrayList2));
        }
        return AbstractC8069xu.b0(arrayList);
    }

    @Override // defpackage.AbstractC5612l1
    public final C0396Ev0 g() {
        return C0396Ev0.h;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final List getParameters() {
        return this.c.k;
    }

    @Override // defpackage.E
    /* renamed from: m */
    public final InterfaceC7492us a() {
        return this.c;
    }

    public final String toString() {
        return this.c.toString();
    }
}
