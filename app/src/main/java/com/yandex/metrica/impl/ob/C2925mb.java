package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.mb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2925mb implements InterfaceC2900lb<Bb> {
    private final C2950nb a;
    private final C2826ib b;
    private final Un c;
    private final C3049rb d;

    public C2925mb() {
        this(new C2950nb(), new C2826ib(), new Un(100), new C3049rb());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object a(List<C3099tb<Rf, Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public List<C3099tb<Rf, Fn>> b(Object obj) {
        C3099tb<Rf.i, Fn> c3099tbB;
        Bb bb = (Bb) obj;
        Rf rf = new Rf();
        rf.b = bb.b;
        rf.g = new Rf.h();
        Cb cb = bb.c;
        Rf.f fVar = new Rf.f();
        fVar.b = O2.c(cb.a);
        Qn<String, Fn> qnA = this.c.a(cb.b);
        fVar.c = O2.c(qnA.a);
        fVar.f = cb.c.size();
        Map<String, String> map = cb.d;
        if (map != null) {
            c3099tbB = this.a.b(map);
            fVar.d = c3099tbB.a;
        } else {
            c3099tbB = null;
        }
        rf.g.b = fVar;
        Fn fnA = En.a(qnA, c3099tbB);
        List<Ab> list = cb.c;
        ArrayList arrayList = new ArrayList();
        this.d.getClass();
        int iA = rf.b != new Rf().b ? C2639b.a(1, rf.b) : 0;
        Rf.q qVar = rf.c;
        if (qVar != null) {
            iA += C2639b.a(2, qVar);
        }
        Rf.o oVar = rf.d;
        if (oVar != null) {
            iA += C2639b.a(3, oVar);
        }
        Rf.p pVar = rf.e;
        int i = 4;
        if (pVar != null) {
            iA += C2639b.a(4, pVar);
        }
        Rf.b bVar = rf.f;
        if (bVar != null) {
            iA += C2639b.a(5, bVar);
        }
        Rf.h hVar = rf.g;
        if (hVar != null) {
            iA += C2639b.a(6, hVar);
        }
        ArrayList arrayList2 = new ArrayList();
        Rf rfA = a(rf);
        int i2 = 0;
        Fn fnA2 = fnA;
        int i3 = iA;
        while (i2 < list.size()) {
            Ab ab = list.get(i2);
            Rf.g gVar = new Rf.g();
            gVar.b = i2;
            C3099tb<Rf.c, Fn> c3099tbB2 = this.b.b(ab);
            gVar.c = c3099tbB2.a;
            this.d.getClass();
            int iC = C2639b.c(i);
            int iA2 = C2639b.a(gVar);
            int iB = iC + iA2 + ((iA2 & (-128)) == 0 ? 0 : C2639b.b(iA2));
            if (arrayList2.size() != 0 && i3 + iB > 204800) {
                rfA.g.b.e = (Rf.g[]) arrayList2.toArray(new Rf.g[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new C3099tb(rfA, fnA2));
                fnA2 = fnA;
                i3 = iA;
                rfA = a(rf);
                arrayList2 = arrayList3;
            }
            arrayList2.add(gVar);
            fnA2 = En.a(fnA2, c3099tbB2);
            i3 += iB;
            i2++;
            i = 4;
        }
        rfA.g.b.e = (Rf.g[]) arrayList2.toArray(new Rf.g[arrayList2.size()]);
        arrayList.add(new C3099tb(rfA, fnA2));
        return arrayList;
    }

    public C2925mb(C2950nb c2950nb, C2826ib c2826ib, Un un, C3049rb c3049rb) {
        this.a = c2950nb;
        this.b = c2826ib;
        this.c = un;
        this.d = c3049rb;
    }

    private Rf a(Rf rf) {
        Rf rf2 = new Rf();
        rf2.b = rf.b;
        Rf.h hVar = new Rf.h();
        rf2.g = hVar;
        hVar.b = new Rf.f();
        Rf.f fVar = rf2.g.b;
        Rf.f fVar2 = rf.g.b;
        fVar.c = fVar2.c;
        fVar.b = fVar2.b;
        fVar.f = fVar2.f;
        fVar.d = fVar2.d;
        return rf2;
    }
}
