package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.Ri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class Ea implements InterfaceC2725ea {
    private C3073sa a = new C3073sa();
    private C3123ua b = new C3123ua();
    private Da c = new Da();
    private C3203xa d = new C3203xa();
    private C3253za e = new C3253za();
    private C2874ka f = new C2874ka();
    private C3148va g = new C3148va();
    private Ga h = new Ga();
    private Ba i = new Ba();
    private C2999pa j = new C2999pa();
    private Ka k = new Ka();
    private Ja l = new Ja();
    private Z9 m = new Z9();
    private Ha n = new Ha();
    private C2675ca o = new C2675ca();
    private C2800ha p = new C2800ha();
    private Y9 q = new Y9();
    private C2825ia r = new C2825ia();
    private C2849ja s = new C2849ja();
    private C2750fa t = new C2750fa();
    private Fa u = new Fa();

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object a(Object obj) {
        C2880kg c2880kg = (C2880kg) obj;
        Ri.b bVarA = new Ri.b(this.f.a(c2880kg.l)).l(c2880kg.b).c(c2880kg.A).d(c2880kg.C).e(c2880kg.B).f(c2880kg.q).g(c2880kg.e).i(Arrays.asList(c2880kg.d)).e(Arrays.asList(c2880kg.g)).b(Arrays.asList(c2880kg.i)).c(Arrays.asList(c2880kg.h)).j(c2880kg.f).k(c2880kg.D).a(c2880kg.E).a(Arrays.asList(c2880kg.v)).g(Arrays.asList(c2880kg.j)).i(c2880kg.r).h(c2880kg.s).c(c2880kg.t).c(c2880kg.c).a(c2880kg.x);
        C2880kg.n[] nVarArr = c2880kg.p;
        ArrayList arrayList = new ArrayList(nVarArr.length);
        int i = 0;
        for (C2880kg.n nVar : nVarArr) {
            arrayList.add(this.e.a(nVar));
        }
        Ri.b bVarA2 = bVarA.j(arrayList).b(c2880kg.F).a(c2880kg.G).b(c2880kg.u).b(c2880kg.H).a(new Ci(c2880kg.K, c2880kg.L)).f(Arrays.asList(c2880kg.T)).a(this.t.a(c2880kg.k));
        if (c2880kg.m != null) {
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                C2880kg.k[] kVarArr = c2880kg.m;
                if (i >= kVarArr.length) {
                    break;
                }
                arrayList2.add(this.a.a(kVarArr[i]));
                i++;
            }
            bVarA2.d(arrayList2);
        }
        C2880kg.y yVar = c2880kg.n;
        if (yVar != null) {
            bVarA2.a(this.b.a(yVar));
        }
        C2880kg.p pVar = c2880kg.o;
        if (pVar != null) {
            bVarA2.a(this.c.a(pVar));
        }
        C2880kg.m mVar = c2880kg.I;
        if (mVar != null) {
            this.d.getClass();
            bVarA2.a(new Ai(mVar.b, mVar.c));
        }
        C2880kg.l[] lVarArr = c2880kg.y;
        if (lVarArr != null) {
            bVarA2.h(this.g.a(lVarArr));
        }
        C2880kg.o oVar = c2880kg.z;
        if (oVar != null) {
            bVarA2.a(this.i.a(oVar));
        }
        C2880kg.r rVar = c2880kg.w;
        if (rVar != null) {
            bVarA2.a(this.h.a(rVar));
        }
        C2880kg.j jVar = c2880kg.J;
        if (jVar != null) {
            bVarA2.a(this.j.a(jVar));
        }
        C2880kg.v vVar = c2880kg.M;
        if (vVar != null) {
            bVarA2.a(this.k.a(vVar));
        }
        C2880kg.u uVar = c2880kg.O;
        if (uVar != null) {
            bVarA2.b(this.l.a(uVar));
        }
        C2880kg.u uVar2 = c2880kg.P;
        if (uVar2 != null) {
            bVarA2.c(this.l.a(uVar2));
        }
        C2880kg.u uVar3 = c2880kg.N;
        if (uVar3 != null) {
            bVarA2.a(this.l.a(uVar3));
        }
        C2880kg.b bVar = c2880kg.U;
        if (bVar != null) {
            bVarA2.a(this.m.a(bVar));
        }
        C2880kg.s sVar = c2880kg.Q;
        if (sVar != null) {
            bVarA2.a(this.n.a(sVar));
        }
        C2880kg.c cVar = c2880kg.R;
        if (cVar != null) {
            bVarA2.a(this.o.a(cVar));
        }
        C2880kg.f fVar = c2880kg.S;
        if (fVar != null) {
            bVarA2.a(this.p.a(fVar));
        }
        C2880kg.a aVar = c2880kg.V;
        if (aVar != null) {
            bVarA2.a(this.q.a(aVar));
        }
        C2880kg.h hVar = c2880kg.W;
        if (hVar != null) {
            bVarA2.a(this.s.a(hVar));
        }
        C2880kg.g gVar = c2880kg.X;
        if (gVar != null) {
            bVarA2.a(this.r.a(gVar));
        }
        C2880kg.q qVar = c2880kg.Y;
        if (qVar != null) {
            bVarA2.a(this.u.a(qVar));
        }
        return bVarA2.a();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object b(Object obj) {
        Ri ri = (Ri) obj;
        C2880kg c2880kg = new C2880kg();
        c2880kg.F = ri.I;
        c2880kg.G = ri.J;
        c2880kg.m = new C2880kg.k[ri.t.size()];
        Iterator<Wc> it = ri.t.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            c2880kg.m[i2] = this.a.b(it.next());
            i2++;
        }
        String str = ri.a;
        if (str != null) {
            c2880kg.b = str;
        }
        String str2 = ri.b;
        if (str2 != null) {
            c2880kg.A = str2;
        }
        String str3 = ri.c;
        if (str3 != null) {
            c2880kg.C = str3;
        }
        String str4 = ri.d;
        if (str4 != null) {
            c2880kg.B = str4;
        }
        List<String> list = ri.k;
        if (list != null) {
            c2880kg.h = (String[]) list.toArray(new String[list.size()]);
        }
        List<String> list2 = ri.l;
        if (list2 != null) {
            c2880kg.i = (String[]) list2.toArray(new String[list2.size()]);
        }
        List<String> list3 = ri.e;
        if (list3 != null) {
            c2880kg.d = (String[]) list3.toArray(new String[list3.size()]);
        }
        List<String> list4 = ri.j;
        if (list4 != null) {
            c2880kg.g = (String[]) list4.toArray(new String[list4.size()]);
        }
        List<String> list5 = ri.m;
        if (list5 != null) {
            c2880kg.v = (String[]) list5.toArray(new String[list5.size()]);
        }
        List<String> list6 = ri.n;
        if (list6 != null) {
            c2880kg.j = (String[]) list6.toArray(new String[list6.size()]);
        }
        Map<String, List<String>> map = ri.o;
        if (map != null) {
            c2880kg.k = this.t.a((Map<String, ? extends List<String>>) map);
        }
        Ed ed = ri.u;
        if (ed != null) {
            c2880kg.n = this.b.b(ed);
        }
        Ei ei = ri.v;
        if (ei != null) {
            c2880kg.o = this.c.b(ei);
        }
        Ai ai = ri.C;
        if (ai != null) {
            this.d.getClass();
            C2880kg.m mVar = new C2880kg.m();
            mVar.b = ai.a;
            mVar.c = ai.b;
            c2880kg.I = mVar;
        }
        String str5 = ri.p;
        if (str5 != null) {
            c2880kg.q = str5;
        }
        String str6 = ri.f;
        if (str6 != null) {
            c2880kg.e = str6;
        }
        String str7 = ri.g;
        if (str7 != null) {
            c2880kg.f = str7;
        }
        String str8 = ri.h;
        if (str8 != null) {
            c2880kg.D = str8;
        }
        String str9 = ri.i;
        if (str9 != null) {
            c2880kg.E = str9;
        }
        c2880kg.l = this.f.b(ri.s);
        String str10 = ri.q;
        if (str10 != null) {
            c2880kg.r = str10;
        }
        String str11 = ri.r;
        if (str11 != null) {
            c2880kg.s = str11;
        }
        c2880kg.t = ri.y;
        c2880kg.c = ri.w;
        c2880kg.x = ri.x;
        Ci ci = ri.G;
        c2880kg.K = ci.a;
        c2880kg.L = ci.b;
        List<Bi> list7 = ri.z;
        if (list7 != null) {
            C2880kg.n[] nVarArr = new C2880kg.n[list7.size()];
            Iterator<Bi> it2 = list7.iterator();
            while (it2.hasNext()) {
                nVarArr[i] = this.e.b(it2.next());
                i++;
            }
            c2880kg.p = nVarArr;
        }
        String str12 = ri.A;
        if (str12 != null) {
            c2880kg.u = str12;
        }
        List<String> list8 = ri.S;
        c2880kg.T = (String[]) list8.toArray(new String[list8.size()]);
        List<C2829ie> list9 = ri.D;
        if (list9 != null) {
            c2880kg.y = this.g.b(list9);
        }
        Di di = ri.E;
        if (di != null) {
            c2880kg.z = this.i.b(di);
        }
        Ui ui = ri.B;
        if (ui != null) {
            this.h.getClass();
            C2880kg.r rVar = new C2880kg.r();
            rVar.b = ui.a;
            c2880kg.w = rVar;
        }
        c2880kg.H = ri.K;
        C3261zi c3261zi = ri.F;
        if (c3261zi != null) {
            this.j.getClass();
            C2880kg.j jVar = new C2880kg.j();
            jVar.b = c3261zi.a;
            c2880kg.J = jVar;
        }
        C2662bm c2662bm = ri.L;
        if (c2662bm != null) {
            c2880kg.M = this.k.b(c2662bm);
        }
        Kl kl = ri.M;
        if (kl != null) {
            c2880kg.O = this.l.b(kl);
        }
        Kl kl2 = ri.N;
        if (kl2 != null) {
            c2880kg.P = this.l.b(kl2);
        }
        Kl kl3 = ri.O;
        if (kl3 != null) {
            c2880kg.N = this.l.b(kl3);
        }
        C2988p c2988p = ri.P;
        if (c2988p != null) {
            this.m.getClass();
            C2880kg.b bVar = new C2880kg.b();
            bVar.b = c2988p.a;
            bVar.c = c2988p.b;
            c2880kg.U = bVar;
        }
        Vi vi = ri.H;
        if (vi != null) {
            c2880kg.Q = this.n.b(vi);
        }
        C3007pi c3007pi = ri.Q;
        if (c3007pi != null) {
            c2880kg.R = this.o.b(c3007pi);
        }
        c2880kg.S = this.p.b(ri.R);
        C2982oi c2982oi = ri.T;
        if (c2982oi != null) {
            c2880kg.V = this.q.b(c2982oi);
        }
        G0 g0 = ri.U;
        if (g0 != null) {
            this.r.getClass();
            C2880kg.g gVar = new C2880kg.g();
            gVar.b = g0.a();
            c2880kg.X = gVar;
        }
        C3131ui c3131ui = ri.V;
        if (c3131ui != null) {
            c2880kg.W = this.s.b(c3131ui);
        }
        Fa fa = this.u;
        Ti ti = ri.W;
        fa.getClass();
        C2880kg.q qVar = new C2880kg.q();
        qVar.b = ti.a();
        c2880kg.Y = qVar;
        return c2880kg;
    }
}
