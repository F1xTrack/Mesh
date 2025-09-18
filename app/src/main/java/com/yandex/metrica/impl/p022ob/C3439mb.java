package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.mb */
/* loaded from: classes2.dex */
public class C3439mb implements InterfaceC3413lb<C2503Bb> {

    /* renamed from: a */
    private final C3465nb f24253a;

    /* renamed from: b */
    private final C3335ib f24254b;

    /* renamed from: c */
    private final C2989Un f24255c;

    /* renamed from: d */
    private final C3569rb f24256d;

    public C3439mb() {
        this(new C3465nb(), new C3335ib(), new C2989Un(100), new C3569rb());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public Object mo13846a(List<C3621tb<C2906Rf, InterfaceC2615Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public List<C3621tb<C2906Rf, InterfaceC2615Fn>> mo13847b(Object obj) {
        C3621tb<C2906Rf.i, InterfaceC2615Fn> c3621tbMo13847b;
        C2503Bb c2503Bb = (C2503Bb) obj;
        C2906Rf c2906Rf = new C2906Rf();
        c2906Rf.f22129b = c2503Bb.f20923b;
        c2906Rf.f22134g = new C2906Rf.h();
        C2528Cb c2528Cb = c2503Bb.f20924c;
        C2906Rf.f fVar = new C2906Rf.f();
        fVar.f22146b = C2819O2.m14689c(c2528Cb.f20976a);
        C2890Qn<String, InterfaceC2615Fn> c2890QnMo15090a = this.f24255c.mo15090a(c2528Cb.f20977b);
        fVar.f22147c = C2819O2.m14689c(c2890QnMo15090a.f22084a);
        fVar.f22150f = c2528Cb.f20978c.size();
        Map<String, String> map = c2528Cb.f20979d;
        if (map != null) {
            c3621tbMo13847b = this.f24253a.mo13847b(map);
            fVar.f22148d = c3621tbMo13847b.f24816a;
        } else {
            c3621tbMo13847b = null;
        }
        c2906Rf.f22134g.f22154b = fVar;
        InterfaceC2615Fn interfaceC2615FnM14050a = C2590En.m14050a(c2890QnMo15090a, c3621tbMo13847b);
        List<C2478Ab> list = c2528Cb.f20978c;
        ArrayList arrayList = new ArrayList();
        this.f24256d.getClass();
        int iM15628a = c2906Rf.f22129b != new C2906Rf().f22129b ? C3141b.m15628a(1, c2906Rf.f22129b) : 0;
        C2906Rf.q qVar = c2906Rf.f22130c;
        if (qVar != null) {
            iM15628a += C3141b.m15630a(2, qVar);
        }
        C2906Rf.o oVar = c2906Rf.f22131d;
        if (oVar != null) {
            iM15628a += C3141b.m15630a(3, oVar);
        }
        C2906Rf.p pVar = c2906Rf.f22132e;
        int i = 4;
        if (pVar != null) {
            iM15628a += C3141b.m15630a(4, pVar);
        }
        C2906Rf.b bVar = c2906Rf.f22133f;
        if (bVar != null) {
            iM15628a += C3141b.m15630a(5, bVar);
        }
        C2906Rf.h hVar = c2906Rf.f22134g;
        if (hVar != null) {
            iM15628a += C3141b.m15630a(6, hVar);
        }
        ArrayList arrayList2 = new ArrayList();
        C2906Rf c2906RfM16428a = m16428a(c2906Rf);
        int i2 = 0;
        InterfaceC2615Fn interfaceC2615FnM14050a2 = interfaceC2615FnM14050a;
        int i3 = iM15628a;
        while (i2 < list.size()) {
            C2478Ab c2478Ab = list.get(i2);
            C2906Rf.g gVar = new C2906Rf.g();
            gVar.f22152b = i2;
            C3621tb<C2906Rf.c, InterfaceC2615Fn> c3621tbMo13847b2 = this.f24254b.mo13847b(c2478Ab);
            gVar.f22153c = c3621tbMo13847b2.f24816a;
            this.f24256d.getClass();
            int iM15641c = C3141b.m15641c(i);
            int iM15635a = C3141b.m15635a(gVar);
            int iM15638b = iM15641c + iM15635a + ((iM15635a & (-128)) == 0 ? 0 : C3141b.m15638b(iM15635a));
            if (arrayList2.size() != 0 && i3 + iM15638b > 204800) {
                c2906RfM16428a.f22134g.f22154b.f22149e = (C2906Rf.g[]) arrayList2.toArray(new C2906Rf.g[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new C3621tb(c2906RfM16428a, interfaceC2615FnM14050a2));
                interfaceC2615FnM14050a2 = interfaceC2615FnM14050a;
                i3 = iM15628a;
                c2906RfM16428a = m16428a(c2906Rf);
                arrayList2 = arrayList3;
            }
            arrayList2.add(gVar);
            interfaceC2615FnM14050a2 = C2590En.m14050a(interfaceC2615FnM14050a2, c3621tbMo13847b2);
            i3 += iM15638b;
            i2++;
            i = 4;
        }
        c2906RfM16428a.f22134g.f22154b.f22149e = (C2906Rf.g[]) arrayList2.toArray(new C2906Rf.g[arrayList2.size()]);
        arrayList.add(new C3621tb(c2906RfM16428a, interfaceC2615FnM14050a2));
        return arrayList;
    }

    public C3439mb(C3465nb c3465nb, C3335ib c3335ib, C2989Un c2989Un, C3569rb c3569rb) {
        this.f24253a = c3465nb;
        this.f24254b = c3335ib;
        this.f24255c = c2989Un;
        this.f24256d = c3569rb;
    }

    /* renamed from: a */
    private C2906Rf m16428a(C2906Rf c2906Rf) {
        C2906Rf c2906Rf2 = new C2906Rf();
        c2906Rf2.f22129b = c2906Rf.f22129b;
        C2906Rf.h hVar = new C2906Rf.h();
        c2906Rf2.f22134g = hVar;
        hVar.f22154b = new C2906Rf.f();
        C2906Rf.f fVar = c2906Rf2.f22134g.f22154b;
        C2906Rf.f fVar2 = c2906Rf.f22134g.f22154b;
        fVar.f22147c = fVar2.f22147c;
        fVar.f22146b = fVar2.f22146b;
        fVar.f22150f = fVar2.f22150f;
        fVar.f22148d = fVar2.f22148d;
        return c2906Rf2;
    }
}
