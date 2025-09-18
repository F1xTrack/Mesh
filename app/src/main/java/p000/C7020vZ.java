package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: vZ */
/* loaded from: classes2.dex */
public final class C7020vZ extends AbstractC0252E {

    /* renamed from: c */
    public final /* synthetic */ C7083wZ f44411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7020vZ(C7083wZ c7083wZ) {
        super(c7083wZ.f44959e);
        this.f44411c = c7083wZ;
    }

    @Override // p000.AbstractC0252E, p000.InterfaceC8101Pd1
    /* renamed from: a */
    public final InterfaceC0873Ns mo1962a() {
        return this.f44411c;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: c */
    public final boolean mo3023c() {
        return true;
    }

    @Override // p000.AbstractC6337l1
    /* renamed from: e */
    public final Collection mo3024e() {
        List listM26275f;
        C7083wZ c7083wZ = this.f44411c;
        AbstractC0666KZ abstractC0666KZ = c7083wZ.f44961g;
        C0414GZ c0414gz = C0414GZ.f3802c;
        if (O90.m5963a(abstractC0666KZ, c0414gz)) {
            listM26275f = AbstractC7230yu.m26274e(C7083wZ.f44957l);
        } else {
            boolean zM5963a = O90.m5963a(abstractC0666KZ, C0477HZ.f4350c);
            int i = c7083wZ.f44962h;
            if (zM5963a) {
                listM26275f = AbstractC7230yu.m26275f(C7083wZ.f44958m, new C0055As(AbstractC10732q41.f40588l, c0414gz.m4673a(i)));
            } else {
                C0603JZ c0603jz = C0603JZ.f5603c;
                if (O90.m5963a(abstractC0666KZ, c0603jz)) {
                    listM26275f = AbstractC7230yu.m26274e(C7083wZ.f44957l);
                } else {
                    if (!O90.m5963a(abstractC0666KZ, C0540IZ.f4983c)) {
                        int i2 = AbstractC6465n3.f38064a;
                        throw new IllegalStateException("should not be called");
                    }
                    listM26275f = AbstractC7230yu.m26275f(C7083wZ.f44958m, new C0055As(AbstractC10732q41.f40582f, c0603jz.m4673a(i)));
                }
            }
        }
        InterfaceC7402Bs0 interfaceC7402Bs0Mo423i = c7083wZ.f44960f.mo423i();
        List<C0055As> list = listM26275f;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        for (C0055As c0055As : list) {
            InterfaceC6976us interfaceC6976usM17465b = AbstractC9060d12.m17465b(interfaceC7402Bs0Mo423i, c0055As);
            if (interfaceC6976usM17465b == null) {
                throw new IllegalStateException(("Built-in class " + c0055As + " not found").toString());
            }
            List listM25979Y = AbstractC7167xu.m25979Y(interfaceC6976usM17465b.mo1439v().getParameters().size(), c7083wZ.f44965k);
            ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(listM25979Y));
            Iterator it = listM25979Y.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C10988s41(((InterfaceC10292me1) it.next()).mo1492m()));
            }
            C7789Jd1.f5652b.getClass();
            arrayList.add(NV1.m5741y(C7789Jd1.f5653c, interfaceC6976usM17465b, arrayList2));
        }
        return AbstractC7167xu.m25982b0(arrayList);
    }

    @Override // p000.AbstractC6337l1
    /* renamed from: g */
    public final C7564Ev0 mo3025g() {
        return C7564Ev0.f2965h;
    }

    @Override // p000.InterfaceC8101Pd1
    public final List getParameters() {
        return this.f44411c.f44965k;
    }

    @Override // p000.AbstractC0252E
    /* renamed from: m */
    public final InterfaceC6976us mo1962a() {
        return this.f44411c;
    }

    public final String toString() {
        return this.f44411c.toString();
    }
}
