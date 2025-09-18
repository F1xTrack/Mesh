package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: mI */
/* loaded from: classes2.dex */
public final class C6417mI implements InterfaceC6543oI {

    /* renamed from: c */
    public static final C6417mI f37617c;

    /* renamed from: d */
    public static final C6417mI f37618d;

    /* renamed from: e */
    public static final C6417mI f37619e;

    /* renamed from: a */
    public final C6671qI f37620a;

    /* renamed from: b */
    public final F71 f37621b = AbstractC0705LB.m4915b(new C4090g1(11, this));

    static {
        FZ1.m2679e(C4214i.f28716E);
        FZ1.m2679e(C4214i.f28714C);
        FZ1.m2679e(C4214i.f28715D);
        FZ1.m2679e(C4214i.f28717F);
        FZ1.m2679e(C6228jI.f35029g);
        f37617c = FZ1.m2679e(C4214i.f28719H);
        FZ1.m2679e(C4214i.f28720I);
        f37618d = FZ1.m2679e(C6228jI.f35030h);
        f37619e = FZ1.m2679e(C4214i.f28718G);
        FZ1.m2679e(C6228jI.f35028f);
    }

    public C6417mI(C6671qI c6671qI) {
        this.f37620a = c6671qI;
    }

    /* renamed from: W */
    public static void m22710W(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* renamed from: i0 */
    public static boolean m22711i0(AbstractC7742Ig0 abstractC7742Ig0) {
        if (A12.m25h(abstractC7742Ig0)) {
            List listMo3800u = abstractC7742Ig0.mo3800u();
            if (!(listMo3800u instanceof Collection) || !listMo3800u.isEmpty()) {
                Iterator it = listMo3800u.iterator();
                while (it.hasNext()) {
                    if (((AbstractC10804qe1) it.next()).mo24039c()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final void m22712n(C6417mI c6417mI, CE0 ce0, StringBuilder sb) {
        if (!c6417mI.m22763r()) {
            C6671qI c6671qI = c6417mI.f37620a;
            InterfaceC10293mf0[] interfaceC10293mf0Arr = C6671qI.f40719X;
            if (!((Boolean) c6671qI.f40749g.getValue(c6671qI, interfaceC10293mf0Arr[5])).booleanValue()) {
                if (c6417mI.m22762q().contains(EnumC6480nI.f38245g)) {
                    c6417mI.m22769y(sb, ce0, null);
                    C3930dT c3930dTMo1125w0 = ce0.mo1125w0();
                    if (c3930dTMo1125w0 != null) {
                        c6417mI.m22769y(sb, c3930dTMo1125w0, EnumC0258E5.f2459b);
                    }
                    C3930dT c3930dTMo1124u0 = ce0.mo1124u0();
                    if (c3930dTMo1124u0 != null) {
                        c6417mI.m22769y(sb, c3930dTMo1124u0, EnumC0258E5.f2467j);
                    }
                    if (((BE0) c6671qI.f40727H.getValue(c6671qI, interfaceC10293mf0Arr[32])) == BE0.f666b) {
                        FE0 fe0Mo1121c = ce0.mo1121c();
                        if (fe0Mo1121c != null) {
                            c6417mI.m22769y(sb, fe0Mo1121c, EnumC0258E5.f2462e);
                        }
                        JE0 je0Mo1122d = ce0.mo1122d();
                        if (je0Mo1122d != null) {
                            c6417mI.m22769y(sb, je0Mo1122d, EnumC0258E5.f2463f);
                            List listMo1221f0 = je0Mo1122d.mo1221f0();
                            O90.m5967e(listMo1221f0, "getValueParameters(...)");
                            C8473Wh1 c8473Wh1 = (C8473Wh1) AbstractC7167xu.m25972R(listMo1221f0);
                            O90.m5965c(c8473Wh1);
                            c6417mI.m22769y(sb, c8473Wh1, EnumC0258E5.f2466i);
                        }
                    }
                }
                List listMo122x0 = ce0.mo122x0();
                O90.m5967e(listMo122x0, "getContextReceiverParameters(...)");
                c6417mI.m22715B(sb, listMo122x0);
                C7003vI visibility = ce0.getVisibility();
                O90.m5967e(visibility, "getVisibility(...)");
                c6417mI.m22752g0(visibility, sb);
                c6417mI.m22726M(sb, c6417mI.m22762q().contains(EnumC6480nI.f38252n) && ce0.mo2088x(), "const");
                c6417mI.m22723J(ce0, sb);
                c6417mI.m22725L(ce0, sb);
                c6417mI.m22731R(ce0, sb);
                c6417mI.m22726M(sb, c6417mI.m22762q().contains(EnumC6480nI.f38253o) && ce0.mo2080A0(), "lateinit");
                c6417mI.m22722I(ce0, sb);
            }
            c6417mI.m22746d0(ce0, sb, false);
            List typeParameters = ce0.getTypeParameters();
            O90.m5967e(typeParameters, "getTypeParameters(...)");
            c6417mI.m22744c0(typeParameters, sb, true);
            c6417mI.m22734U(ce0, sb);
        }
        c6417mI.m22728O(ce0, sb, true);
        sb.append(": ");
        AbstractC7742Ig0 type = ce0.getType();
        O90.m5967e(type, "getType(...)");
        sb.append(c6417mI.m22736X(type));
        c6417mI.m22735V(ce0, sb);
        c6417mI.m22720G(ce0, sb);
        List typeParameters2 = ce0.getTypeParameters();
        O90.m5967e(typeParameters2, "getTypeParameters(...)");
        c6417mI.m22754h0(sb, typeParameters2);
    }

    /* renamed from: v */
    public static EnumC10575os0 m22713v(InterfaceC8902bq0 interfaceC8902bq0) {
        if (interfaceC8902bq0 instanceof InterfaceC6976us) {
            return ((InterfaceC6976us) interfaceC8902bq0).mo1436l() == EnumC0118Bs.f1061b ? EnumC10575os0.f39326e : EnumC10575os0.f39323b;
        }
        InterfaceC0140CD interfaceC0140CDMo423i = interfaceC8902bq0.mo423i();
        InterfaceC6976us interfaceC6976us = interfaceC0140CDMo423i instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0140CDMo423i : null;
        if (interfaceC6976us == null) {
            return EnumC10575os0.f39323b;
        }
        if (!(interfaceC8902bq0 instanceof InterfaceC7158xl)) {
            return EnumC10575os0.f39323b;
        }
        InterfaceC7158xl interfaceC7158xl = (InterfaceC7158xl) interfaceC8902bq0;
        Collection collectionMo1222j = interfaceC7158xl.mo1222j();
        O90.m5967e(collectionMo1222j, "getOverriddenDescriptors(...)");
        if (!collectionMo1222j.isEmpty() && interfaceC6976us.mo115f() != EnumC10575os0.f39323b) {
            return EnumC10575os0.f39325d;
        }
        if (interfaceC6976us.mo1436l() != EnumC0118Bs.f1061b || O90.m5963a(interfaceC7158xl.getVisibility(), AbstractC7066wI.f44760a)) {
            return EnumC10575os0.f39323b;
        }
        EnumC10575os0 enumC10575os0Mo115f = interfaceC7158xl.mo115f();
        EnumC10575os0 enumC10575os0 = EnumC10575os0.f39326e;
        return enumC10575os0Mo115f == enumC10575os0 ? enumC10575os0 : EnumC10575os0.f39325d;
    }

    /* renamed from: A */
    public final String m22714A(AbstractC0249Dx abstractC0249Dx) {
        C6671qI c6671qI = this.f37620a;
        InterfaceC6497nZ interfaceC6497nZ = (InterfaceC6497nZ) c6671qI.f40764v.getValue(c6671qI, C6671qI.f40719X[20]);
        if (interfaceC6497nZ != null) {
            return (String) interfaceC6497nZ.invoke(abstractC0249Dx);
        }
        if (abstractC0249Dx instanceof C0513I8) {
            Iterable iterable = (Iterable) ((C0513I8) abstractC0249Dx).f2329a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strM22714A = m22714A((AbstractC0249Dx) it.next());
                if (strM22714A != null) {
                    arrayList.add(strM22714A);
                }
            }
            return AbstractC7167xu.m25962H(arrayList, ", ", "{", "}", null, 56);
        }
        if (abstractC0249Dx instanceof C0384G5) {
            return AbstractC11374v51.m25335J("@", m22768x((InterfaceC7116x5) ((C0384G5) abstractC0249Dx).f2329a, null));
        }
        if (!(abstractC0249Dx instanceof C9651he0)) {
            return abstractC0249Dx.toString();
        }
        AbstractC9523ge0 abstractC9523ge0 = (AbstractC9523ge0) ((C9651he0) abstractC0249Dx).f2329a;
        if (abstractC9523ge0 instanceof C9267ee0) {
            return ((C9267ee0) abstractC9523ge0).f26794a + "::class";
        }
        if (!(abstractC9523ge0 instanceof C9395fe0)) {
            throw new C6838sg();
        }
        C9395fe0 c9395fe0 = (C9395fe0) abstractC9523ge0;
        String strM4654b = c9395fe0.f27308a.f1732a.m359b().m4654b();
        for (int i = 0; i < c9395fe0.f27308a.f1733b; i++) {
            strM4654b = "kotlin.Array<" + strM4654b + '>';
        }
        return AbstractC7222ym.m26232i(strM4654b, "::class");
    }

    /* renamed from: B */
    public final void m22715B(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            C10937rh0 c10937rh0 = (C10937rh0) it.next();
            m22769y(sb, c10937rh0, EnumC0258E5.f2464g);
            sb.append(m22719F(c10937rh0.getType()));
            if (i == AbstractC7230yu.m26273d(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0076  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22716C(java.lang.StringBuilder r6, p000.X01 r7) {
        /*
            r5 = this;
            r0 = 0
            r5.m22769y(r6, r7, r0)
            boolean r1 = r7 instanceof p000.C6670qH
            boolean r1 = p000.AbstractC1141S8.m7182b(r7)
            r2 = 0
            if (r1 == 0) goto L8d
            boolean r0 = r7 instanceof p000.C4177hP
            if (r0 == 0) goto L1c
            r1 = r7
            hP r1 = (p000.C4177hP) r1
            jP r1 = r1.f28408d
            boolean r1 = r1.f35143b
            if (r1 == 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = r2
        L1d:
            qI r3 = r5.f37620a
            if (r1 == 0) goto L57
            mf0[] r1 = p000.C6671qI.f40719X
            r4 = 46
            r1 = r1[r4]
            pI r4 = r3.f40740U
            java.lang.Object r1 = r4.getValue(r3, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L57
            kP r1 = p000.C6298kP.f36482a
            if (r0 == 0) goto L40
            r0 = r7
            hP r0 = (p000.C4177hP) r0
            jP r0 = r0.f28408d
            boolean r0 = r0.f35143b
        L40:
            Pd1 r0 = r7.mo3797E()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"
            p000.O90.m5966d(r0, r1)
            iP r0 = (p000.C4240iP) r0
            java.lang.String[] r0 = r0.f29119b
            r0 = r0[r2]
            java.lang.String r0 = r5.m22717D(r0)
            r6.append(r0)
            goto Lbc
        L57:
            if (r0 == 0) goto L76
            mf0[] r0 = p000.C6671qI.f40719X
            r1 = 48
            r0 = r0[r1]
            pI r1 = r3.f40742W
            java.lang.Object r0 = r1.getValue(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L76
            r0 = r7
            hP r0 = (p000.C4177hP) r0
            java.lang.String r0 = r0.f28412h
            r6.append(r0)
            goto L81
        L76:
            Pd1 r0 = r7.mo3797E()
            java.lang.String r0 = r0.toString()
            r6.append(r0)
        L81:
            java.util.List r0 = r7.mo3800u()
            java.lang.String r0 = r5.m22737Y(r0)
            r6.append(r0)
            goto Lbc
        L8d:
            Pd1 r1 = r7.mo3797E()
            Pd1 r3 = r7.mo3797E()
            Ns r3 = r3.mo1962a()
            boolean r4 = r3 instanceof p000.InterfaceC0936Os
            if (r4 == 0) goto La0
            r0 = r3
            Os r0 = (p000.InterfaceC0936Os) r0
        La0:
            rT1 r0 = p000.AbstractC11306uZ1.m25208a(r7, r0, r2)
            if (r0 != 0) goto Lb9
            java.lang.String r0 = r5.m22738Z(r1)
            r6.append(r0)
            java.util.List r0 = r7.mo3800u()
            java.lang.String r0 = r5.m22737Y(r0)
            r6.append(r0)
            goto Lbc
        Lb9:
            r5.m22733T(r6, r0)
        Lbc:
            boolean r0 = r7.mo3798G()
            if (r0 == 0) goto Lc7
            java.lang.String r0 = "?"
            r6.append(r0)
        Lc7:
            boolean r7 = r7 instanceof p000.C6670qH
            if (r7 == 0) goto Ld0
            java.lang.String r7 = " & Any"
            r6.append(r7)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6417mI.m22716C(java.lang.StringBuilder, X01):void");
    }

    /* renamed from: D */
    public final String m22717D(String str) {
        int iOrdinal = m22764s().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return AbstractC7222ym.m26234k("<font color=red><b>", str, "</b></font>");
        }
        throw new C6838sg();
    }

    /* renamed from: E */
    public final String m22718E(String str, String str2, AbstractC11955zg0 abstractC11955zg0) {
        O90.m5968f(str, "lowerRendered");
        O90.m5968f(str2, "upperRendered");
        if (AbstractC9752iQ1.m19036f(str, str2)) {
            return D51.m1556o(str2, "(", false) ? AbstractC7222ym.m26234k("(", str, ")!") : str.concat("!");
        }
        String strM25347V = AbstractC11374v51.m25347V(m22761p().mo6462a(abstractC11955zg0.m26502i(AbstractC10604p41.f39775B), this), "Collection");
        String strM19034d = AbstractC9752iQ1.m19034d(str, strM25347V.concat("Mutable"), str2, strM25347V, strM25347V.concat("(Mutable)"));
        if (strM19034d != null) {
            return strM19034d;
        }
        String strM19034d2 = AbstractC9752iQ1.m19034d(str, strM25347V.concat("MutableMap.MutableEntry"), str2, strM25347V.concat("Map.Entry"), strM25347V.concat("(Mutable)Map.(Mutable)Entry"));
        if (strM19034d2 != null) {
            return strM19034d2;
        }
        String strM25347V2 = AbstractC11374v51.m25347V(m22761p().mo6462a(abstractC11955zg0.m26503j("Array"), this), "Array");
        String strM19034d3 = AbstractC9752iQ1.m19034d(str, strM25347V2.concat(m22760o("Array<")), str2, strM25347V2.concat(m22760o("Array<out ")), strM25347V2.concat(m22760o("Array<(out) ")));
        if (strM19034d3 != null) {
            return strM19034d3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    /* renamed from: F */
    public final String m22719F(AbstractC7742Ig0 abstractC7742Ig0) {
        String strM22736X = m22736X(abstractC7742Ig0);
        if ((!m22711i0(abstractC7742Ig0) || AbstractC7375Be1.m787e(abstractC7742Ig0)) && !(abstractC7742Ig0 instanceof C6670qH)) {
            return strM22736X;
        }
        return "(" + strM22736X + ')';
    }

    /* renamed from: G */
    public final void m22720G(InterfaceC9276ei1 interfaceC9276ei1, StringBuilder sb) {
        AbstractC0249Dx abstractC0249DxMo2086Y;
        String strM22714A;
        C6671qI c6671qI = this.f37620a;
        if (!((Boolean) c6671qI.f40763u.getValue(c6671qI, C6671qI.f40719X[19])).booleanValue() || (abstractC0249DxMo2086Y = interfaceC9276ei1.mo2086Y()) == null || (strM22714A = m22714A(abstractC0249DxMo2086Y)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m22760o(strM22714A));
    }

    /* renamed from: H */
    public final String m22721H(String str) {
        int iOrdinal = m22764s().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal != 1) {
            throw new C6838sg();
        }
        C6671qI c6671qI = this.f37620a;
        return ((Boolean) c6671qI.f40741V.getValue(c6671qI, C6671qI.f40719X[47])).booleanValue() ? str : AbstractC7222ym.m26234k("<b>", str, "</b>");
    }

    /* renamed from: I */
    public final void m22722I(InterfaceC7158xl interfaceC7158xl, StringBuilder sb) {
        String str;
        if (m22762q().contains(EnumC6480nI.f38247i) && m22766u() && interfaceC7158xl.mo116l() != 1) {
            sb.append("/*");
            int iMo116l = interfaceC7158xl.mo116l();
            if (iMo116l == 1) {
                str = "DECLARATION";
            } else if (iMo116l == 2) {
                str = "FAKE_OVERRIDE";
            } else if (iMo116l == 3) {
                str = "DELEGATION";
            } else {
                if (iMo116l != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(AbstractC9244eS1.m17995e(str));
            sb.append("*/ ");
        }
    }

    /* renamed from: J */
    public final void m22723J(InterfaceC8902bq0 interfaceC8902bq0, StringBuilder sb) {
        m22726M(sb, interfaceC8902bq0.isExternal(), "external");
        boolean z = false;
        m22726M(sb, m22762q().contains(EnumC6480nI.f38250l) && interfaceC8902bq0.mo111M(), "expect");
        if (m22762q().contains(EnumC6480nI.f38251m) && interfaceC8902bq0.mo112Q0()) {
            z = true;
        }
        m22726M(sb, z, "actual");
    }

    /* renamed from: K */
    public final void m22724K(EnumC10575os0 enumC10575os0, StringBuilder sb, EnumC10575os0 enumC10575os02) {
        C6671qI c6671qI = this.f37620a;
        if (((Boolean) c6671qI.f40758p.getValue(c6671qI, C6671qI.f40719X[14])).booleanValue() || enumC10575os0 != enumC10575os02) {
            m22726M(sb, m22762q().contains(EnumC6480nI.f38243e), AbstractC9244eS1.m17995e(enumC10575os0.name()));
        }
    }

    /* renamed from: L */
    public final void m22725L(InterfaceC7158xl interfaceC7158xl, StringBuilder sb) {
        if (AbstractC6814sI.m24707s(interfaceC7158xl) && interfaceC7158xl.mo115f() == EnumC10575os0.f39323b) {
            return;
        }
        C6671qI c6671qI = this.f37620a;
        if (((EnumC10973rz0) c6671qI.f40721B.getValue(c6671qI, C6671qI.f40719X[26])) == EnumC10973rz0.f42183a && interfaceC7158xl.mo115f() == EnumC10575os0.f39325d && !interfaceC7158xl.mo1222j().isEmpty()) {
            return;
        }
        EnumC10575os0 enumC10575os0Mo115f = interfaceC7158xl.mo115f();
        O90.m5967e(enumC10575os0Mo115f, "getModality(...)");
        m22724K(enumC10575os0Mo115f, sb, m22713v(interfaceC7158xl));
    }

    /* renamed from: M */
    public final void m22726M(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m22721H(str));
            sb.append(" ");
        }
    }

    /* renamed from: N */
    public final String m22727N(C8340Tt0 c8340Tt0, boolean z) {
        String strM22760o = m22760o(AbstractC9752iQ1.m19032b(c8340Tt0));
        C6671qI c6671qI = this.f37620a;
        return (((Boolean) c6671qI.f40741V.getValue(c6671qI, C6671qI.f40719X[47])).booleanValue() && m22764s() == EnumC8980cR0.f17476b && z) ? AbstractC7222ym.m26234k("<b>", strM22760o, "</b>") : strM22760o;
    }

    /* renamed from: O */
    public final void m22728O(InterfaceC0140CD interfaceC0140CD, StringBuilder sb, boolean z) {
        C8340Tt0 name = interfaceC0140CD.getName();
        O90.m5967e(name, "getName(...)");
        sb.append(m22727N(name, z));
    }

    /* renamed from: P */
    public final void m22729P(StringBuilder sb, AbstractC7742Ig0 abstractC7742Ig0) {
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0.mo3963L();
        C6652q c6652q = abstractC8315Tg1Mo3963L instanceof C6652q ? (C6652q) abstractC8315Tg1Mo3963L : null;
        if (c6652q == null) {
            m22730Q(sb, abstractC7742Ig0);
            return;
        }
        C6671qI c6671qI = this.f37620a;
        InterfaceC10293mf0[] interfaceC10293mf0Arr = C6671qI.f40719X;
        boolean zBooleanValue = ((Boolean) c6671qI.f40737R.getValue(c6671qI, interfaceC10293mf0Arr[42])).booleanValue();
        X01 x01 = c6652q.f40477b;
        if (zBooleanValue) {
            m22730Q(sb, x01);
            return;
        }
        m22730Q(sb, c6652q.f40478c);
        if (((Boolean) c6671qI.f40736Q.getValue(c6671qI, interfaceC10293mf0Arr[41])).booleanValue()) {
            EnumC8980cR0 enumC8980cR0M22764s = m22764s();
            C8724aR0 c8724aR0 = EnumC8980cR0.f17476b;
            if (enumC8980cR0M22764s == c8724aR0) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* = ");
            m22730Q(sb, x01);
            sb.append(" */");
            if (m22764s() == c8724aR0) {
                sb.append("</i></font>");
            }
        }
    }

    /* renamed from: Q */
    public final void m22730Q(StringBuilder sb, AbstractC7742Ig0 abstractC7742Ig0) {
        C8340Tt0 c8340Tt0M20c;
        String strM22760o;
        boolean z = abstractC7742Ig0 instanceof C9787ii0;
        C6671qI c6671qI = this.f37620a;
        if (z && c6671qI.m23964n()) {
            C8426Vk0 c8426Vk0 = ((C9787ii0) abstractC7742Ig0).f29416d;
            if (c8426Vk0.f12018c == EnumC8530Xk0.f13942a || c8426Vk0.f12018c == EnumC8530Xk0.f13943b) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0.mo3963L();
        if (abstractC8315Tg1Mo3963L instanceof AbstractC3933dW) {
            sb.append(((AbstractC3933dW) abstractC8315Tg1Mo3963L).mo17702a0(this, this));
            return;
        }
        if (abstractC8315Tg1Mo3963L instanceof X01) {
            X01 x01 = (X01) abstractC8315Tg1Mo3963L;
            if (x01.equals(AbstractC7375Be1.f964b) || x01.mo3797E() == AbstractC7375Be1.f963a.f28406b) {
                sb.append("???");
                return;
            }
            InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E = x01.mo3797E();
            if ((interfaceC8101Pd1Mo3797E instanceof C4240iP) && ((C4240iP) interfaceC8101Pd1Mo3797E).f29118a == EnumC6235jP.f35125j) {
                if (!((Boolean) c6671qI.f40762t.getValue(c6671qI, C6671qI.f40719X[18])).booleanValue()) {
                    sb.append("???");
                    return;
                }
                InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E2 = x01.mo3797E();
                O90.m5966d(interfaceC8101Pd1Mo3797E2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(m22717D(((C4240iP) interfaceC8101Pd1Mo3797E2).f29119b[0]));
                return;
            }
            if (AbstractC1141S8.m7182b(x01)) {
                m22716C(sb, x01);
                return;
            }
            if (!m22711i0(x01)) {
                m22716C(sb, x01);
                return;
            }
            int length = sb.length();
            ((C6417mI) this.f37621b.getValue()).m22769y(sb, x01, null);
            boolean z2 = sb.length() != length;
            AbstractC7742Ig0 abstractC7742Ig0M23f = A12.m23f(x01);
            List listM21d = A12.m21d(x01);
            if (!listM21d.isEmpty()) {
                sb.append("context(");
                Iterator it = listM21d.subList(0, AbstractC7230yu.m26273d(listM21d)).iterator();
                while (it.hasNext()) {
                    m22729P(sb, (AbstractC7742Ig0) it.next());
                    sb.append(", ");
                }
                m22729P(sb, (AbstractC7742Ig0) AbstractC7167xu.m25964J(listM21d));
                sb.append(") ");
            }
            boolean zM26i = A12.m26i(x01);
            boolean zMo3798G = x01.mo3798G();
            boolean z3 = zMo3798G || (z2 && abstractC7742Ig0M23f != null);
            if (z3) {
                if (zM26i) {
                    sb.insert(length, '(');
                } else {
                    if (z2) {
                        HS1.m3433d(AbstractC11374v51.m25329D(sb));
                        if (sb.charAt(AbstractC11374v51.m25359x(sb) - 1) != ')') {
                            sb.insert(AbstractC11374v51.m25359x(sb), "()");
                        }
                    }
                    sb.append("(");
                }
            }
            m22726M(sb, zM26i, "suspend");
            if (abstractC7742Ig0M23f != null) {
                boolean z4 = (m22711i0(abstractC7742Ig0M23f) && !abstractC7742Ig0M23f.mo3798G()) || A12.m26i(abstractC7742Ig0M23f) || !abstractC7742Ig0M23f.getAnnotations().isEmpty() || (abstractC7742Ig0M23f instanceof C6670qH);
                if (z4) {
                    sb.append("(");
                }
                m22729P(sb, abstractC7742Ig0M23f);
                if (z4) {
                    sb.append(")");
                }
                sb.append(".");
            }
            sb.append("(");
            if (!A12.m25h(x01) || x01.getAnnotations().mo3260D(AbstractC10604p41.f39818p) == null || x01.mo3800u().size() > 1) {
                int i = 0;
                for (AbstractC10804qe1 abstractC10804qe1 : A12.m24g(x01)) {
                    int i2 = i + 1;
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (((Boolean) c6671qI.f40739T.getValue(c6671qI, C6671qI.f40719X[44])).booleanValue()) {
                        AbstractC7742Ig0 abstractC7742Ig0Mo24038b = abstractC10804qe1.mo24038b();
                        O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
                        c8340Tt0M20c = A12.m20c(abstractC7742Ig0Mo24038b);
                    } else {
                        c8340Tt0M20c = null;
                    }
                    if (c8340Tt0M20c != null) {
                        sb.append(m22727N(c8340Tt0M20c, false));
                        sb.append(": ");
                    }
                    O90.m5968f(abstractC10804qe1, "typeProjection");
                    StringBuilder sb2 = new StringBuilder();
                    AbstractC7167xu.m25961G(AbstractC7230yu.m26274e(abstractC10804qe1), sb2, ", ", null, null, new C6354lI(this, 0), 60);
                    String string = sb2.toString();
                    O90.m5967e(string, "toString(...)");
                    sb.append(string);
                    i = i2;
                }
            } else {
                sb.append("???");
            }
            sb.append(") ");
            int iOrdinal = m22764s().ordinal();
            if (iOrdinal == 0) {
                strM22760o = m22760o("->");
            } else {
                if (iOrdinal != 1) {
                    throw new C6838sg();
                }
                strM22760o = "&rarr;";
            }
            sb.append(strM22760o);
            sb.append(" ");
            A12.m25h(x01);
            AbstractC7742Ig0 abstractC7742Ig0Mo24038b2 = ((AbstractC10804qe1) AbstractC7167xu.m25964J(x01.mo3800u())).mo24038b();
            O90.m5967e(abstractC7742Ig0Mo24038b2, "getType(...)");
            m22729P(sb, abstractC7742Ig0Mo24038b2);
            if (z3) {
                sb.append(")");
            }
            if (zMo3798G) {
                sb.append("?");
            }
        }
    }

    /* renamed from: R */
    public final void m22731R(InterfaceC7158xl interfaceC7158xl, StringBuilder sb) {
        if (m22762q().contains(EnumC6480nI.f38244f) && !interfaceC7158xl.mo1222j().isEmpty()) {
            C6671qI c6671qI = this.f37620a;
            if (((EnumC10973rz0) c6671qI.f40721B.getValue(c6671qI, C6671qI.f40719X[26])) != EnumC10973rz0.f42184b) {
                m22726M(sb, true, "override");
                if (m22766u()) {
                    sb.append("/*");
                    sb.append(interfaceC7158xl.mo1222j().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    /* renamed from: S */
    public final void m22732S(C0664KX c0664kx, String str, StringBuilder sb) {
        sb.append(m22721H(str));
        C0789MX c0789mxM4661i = c0664kx.m4661i();
        O90.m5967e(c0789mxM4661i, "toUnsafe(...)");
        String strM22760o = m22760o(AbstractC9752iQ1.m19033c(c0789mxM4661i.m5391e()));
        if (strM22760o.length() > 0) {
            sb.append(" ");
            sb.append(strM22760o);
        }
    }

    /* renamed from: T */
    public final void m22733T(StringBuilder sb, C10910rT1 c10910rT1) {
        C10910rT1 c10910rT12 = (C10910rT1) c10910rT1.f41680d;
        InterfaceC0936Os interfaceC0936Os = (InterfaceC0936Os) c10910rT1.f41678b;
        if (c10910rT12 != null) {
            m22733T(sb, c10910rT12);
            sb.append('.');
            C8340Tt0 name = interfaceC0936Os.getName();
            O90.m5967e(name, "getName(...)");
            sb.append(m22727N(name, false));
        } else {
            InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v = interfaceC0936Os.mo1439v();
            O90.m5967e(interfaceC8101Pd1Mo1439v, "getTypeConstructor(...)");
            sb.append(m22738Z(interfaceC8101Pd1Mo1439v));
        }
        sb.append(m22737Y((List) c10910rT1.f41679c));
    }

    /* renamed from: U */
    public final void m22734U(InterfaceC7158xl interfaceC7158xl, StringBuilder sb) {
        C10937rh0 c10937rh0Mo121t0 = interfaceC7158xl.mo121t0();
        if (c10937rh0Mo121t0 != null) {
            m22769y(sb, c10937rh0Mo121t0, EnumC0258E5.f2464g);
            sb.append(m22719F(c10937rh0Mo121t0.getType()));
            sb.append(".");
        }
    }

    /* renamed from: V */
    public final void m22735V(InterfaceC7158xl interfaceC7158xl, StringBuilder sb) {
        C10937rh0 c10937rh0Mo121t0;
        C6671qI c6671qI = this.f37620a;
        if (((Boolean) c6671qI.f40725F.getValue(c6671qI, C6671qI.f40719X[30])).booleanValue() && (c10937rh0Mo121t0 = interfaceC7158xl.mo121t0()) != null) {
            sb.append(" on ");
            sb.append(m22736X(c10937rh0Mo121t0.getType()));
        }
    }

    /* renamed from: X */
    public final String m22736X(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "type");
        StringBuilder sb = new StringBuilder();
        C6671qI c6671qI = this.f37620a;
        m22729P(sb, (AbstractC7742Ig0) ((InterfaceC6497nZ) c6671qI.f40767y.getValue(c6671qI, C6671qI.f40719X[23])).invoke(abstractC7742Ig0));
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: Y */
    public final String m22737Y(List list) {
        O90.m5968f(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m22760o("<"));
        AbstractC7167xu.m25961G(list, sb, ", ", null, null, new C6354lI(this, 0), 60);
        sb.append(m22760o(">"));
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: Z */
    public final String m22738Z(InterfaceC8101Pd1 interfaceC8101Pd1) {
        O90.m5968f(interfaceC8101Pd1, "typeConstructor");
        InterfaceC0873Ns interfaceC0873NsMo1962a = interfaceC8101Pd1.mo1962a();
        if (interfaceC0873NsMo1962a instanceof InterfaceC10292me1 ? true : interfaceC0873NsMo1962a instanceof InterfaceC6976us ? true : interfaceC0873NsMo1962a instanceof InterfaceC7633Gd1) {
            O90.m5968f(interfaceC0873NsMo1962a, "klass");
            return C6298kP.m22200f(interfaceC0873NsMo1962a) ? interfaceC0873NsMo1962a.mo1439v().toString() : m22761p().mo6462a(interfaceC0873NsMo1962a, this);
        }
        if (interfaceC0873NsMo1962a == null) {
            return interfaceC8101Pd1 instanceof M90 ? ((M90) interfaceC8101Pd1).m5278f(C6228jI.f35033k) : interfaceC8101Pd1.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC0873NsMo1962a.getClass()).toString());
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: a */
    public final void mo22739a() {
        this.f37620a.mo22739a();
    }

    /* renamed from: a0 */
    public final void m22740a0(InterfaceC10292me1 interfaceC10292me1, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(m22760o("<"));
        }
        if (m22766u()) {
            sb.append("/*");
            sb.append(interfaceC10292me1.getIndex());
            sb.append("*/ ");
        }
        m22726M(sb, interfaceC10292me1.mo22917D(), "reified");
        String str = interfaceC10292me1.mo22918O().f27951a;
        boolean z2 = true;
        m22726M(sb, str.length() > 0, str);
        m22769y(sb, interfaceC10292me1, null);
        m22728O(interfaceC10292me1, sb, z);
        int size = interfaceC10292me1.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) interfaceC10292me1.getUpperBounds().iterator().next();
            if (abstractC7742Ig0 == null) {
                AbstractC11955zg0.m26490a(142);
                throw null;
            }
            if (!AbstractC11955zg0.m26494x(abstractC7742Ig0) || !abstractC7742Ig0.mo3798G()) {
                sb.append(" : ");
                sb.append(m22736X(abstractC7742Ig0));
            }
        } else if (z) {
            for (AbstractC7742Ig0 abstractC7742Ig02 : interfaceC10292me1.getUpperBounds()) {
                if (abstractC7742Ig02 == null) {
                    AbstractC11955zg0.m26490a(142);
                    throw null;
                }
                if (!AbstractC11955zg0.m26494x(abstractC7742Ig02) || !abstractC7742Ig02.mo3798G()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(m22736X(abstractC7742Ig02));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(m22760o(">"));
        }
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: b */
    public final void mo22741b() {
        this.f37620a.mo22741b();
    }

    /* renamed from: b0 */
    public final void m22742b0(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m22740a0((InterfaceC10292me1) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: c */
    public final void mo22743c() {
        this.f37620a.mo22743c();
    }

    /* renamed from: c0 */
    public final void m22744c0(List list, StringBuilder sb, boolean z) {
        C6671qI c6671qI = this.f37620a;
        if (((Boolean) c6671qI.f40765w.getValue(c6671qI, C6671qI.f40719X[21])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(m22760o("<"));
        m22742b0(sb, list);
        sb.append(m22760o(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: d */
    public final void mo22745d(Set set) {
        O90.m5968f(set, "<set-?>");
        this.f37620a.mo22745d(set);
    }

    /* renamed from: d0 */
    public final void m22746d0(InterfaceC9276ei1 interfaceC9276ei1, StringBuilder sb, boolean z) {
        if (z || !(interfaceC9276ei1 instanceof C8473Wh1)) {
            sb.append(m22721H(interfaceC9276ei1.mo2087s0() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: e */
    public final void mo22747e(LinkedHashSet linkedHashSet) {
        this.f37620a.mo22747e(linkedHashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0062  */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22748e0(p000.C8473Wh1 r11, boolean r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6417mI.m22748e0(Wh1, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: f */
    public final void mo22749f() {
        this.f37620a.mo22749f();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0027  */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22750f0(java.util.Collection r8, boolean r9, java.lang.StringBuilder r10) {
        /*
            r7 = this;
            qI r0 = r7.f37620a
            mf0[] r1 = p000.C6671qI.f40719X
            r2 = 29
            r1 = r1[r2]
            pI r2 = r0.f40724E
            java.lang.Object r0 = r2.getValue(r0, r1)
            dA0 r0 = (p000.EnumC9079dA0) r0
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L27
            if (r0 == r1) goto L25
            r9 = 2
            if (r0 != r9) goto L1f
        L1d:
            r9 = r2
            goto L28
        L1f:
            sg r8 = new sg
            r8.<init>()
            throw r8
        L25:
            if (r9 != 0) goto L1d
        L27:
            r9 = r1
        L28:
            int r0 = r8.size()
            kI r3 = r7.m22765t()
            r3.getClass()
            java.lang.String r3 = "builder"
            p000.O90.m5968f(r10, r3)
            java.lang.String r3 = "("
            r10.append(r3)
            java.util.Iterator r8 = r8.iterator()
            r3 = r2
        L42:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L71
            int r4 = r3 + 1
            java.lang.Object r5 = r8.next()
            Wh1 r5 = (p000.C8473Wh1) r5
            kI r6 = r7.m22765t()
            r6.getClass()
            java.lang.String r6 = "parameter"
            p000.O90.m5968f(r5, r6)
            r7.m22748e0(r5, r9, r10, r2)
            kI r5 = r7.m22765t()
            r5.getClass()
            int r5 = r0 + (-1)
            if (r3 == r5) goto L6f
            java.lang.String r3 = ", "
            r10.append(r3)
        L6f:
            r3 = r4
            goto L42
        L71:
            kI r8 = r7.m22765t()
            r8.getClass()
            java.lang.String r8 = ")"
            r10.append(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6417mI.m22750f0(java.util.Collection, boolean, java.lang.StringBuilder):void");
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: g */
    public final void mo22751g(InterfaceC1062Qs interfaceC1062Qs) {
        this.f37620a.mo22751g(interfaceC1062Qs);
    }

    /* renamed from: g0 */
    public final boolean m22752g0(C7003vI c7003vI, StringBuilder sb) {
        if (!m22762q().contains(EnumC6480nI.f38242d)) {
            return false;
        }
        C6671qI c6671qI = this.f37620a;
        InterfaceC10293mf0[] interfaceC10293mf0Arr = C6671qI.f40719X;
        if (((Boolean) c6671qI.f40756n.getValue(c6671qI, interfaceC10293mf0Arr[12])).booleanValue()) {
            c7003vI = AbstractC7066wI.m25592f(c7003vI.f44322a.mo3952m());
        }
        if (!((Boolean) c6671qI.f40757o.getValue(c6671qI, interfaceC10293mf0Arr[13])).booleanValue() && O90.m5963a(c7003vI, AbstractC7066wI.f44769j)) {
            return false;
        }
        sb.append(m22721H(c7003vI.f44322a.mo3951d()));
        sb.append(" ");
        return true;
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: h */
    public final void mo22753h(EnumC9079dA0 enumC9079dA0) {
        this.f37620a.mo22753h(enumC9079dA0);
    }

    /* renamed from: h0 */
    public final void m22754h0(StringBuilder sb, List list) {
        C6671qI c6671qI = this.f37620a;
        if (((Boolean) c6671qI.f40765w.getValue(c6671qI, C6671qI.f40719X[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC10292me1 interfaceC10292me1 = (InterfaceC10292me1) it.next();
            List upperBounds = interfaceC10292me1.getUpperBounds();
            O90.m5967e(upperBounds, "getUpperBounds(...)");
            for (AbstractC7742Ig0 abstractC7742Ig0 : AbstractC7167xu.m25995w(upperBounds)) {
                StringBuilder sb2 = new StringBuilder();
                C8340Tt0 name = interfaceC10292me1.getName();
                O90.m5967e(name, "getName(...)");
                sb2.append(m22727N(name, false));
                sb2.append(" : ");
                O90.m5965c(abstractC7742Ig0);
                sb2.append(m22736X(abstractC7742Ig0));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(m22721H("where"));
        sb.append(" ");
        AbstractC7167xu.m25961G(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: i */
    public final void mo22755i() {
        this.f37620a.mo22755i();
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: j */
    public final void mo22756j() {
        this.f37620a.mo22756j();
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: k */
    public final Set mo22757k() {
        return this.f37620a.mo22757k();
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: l */
    public final void mo22758l() {
        C8852bR0 c8852bR0 = EnumC8980cR0.f17475a;
        this.f37620a.mo22758l();
    }

    @Override // p000.InterfaceC6543oI
    /* renamed from: m */
    public final void mo22759m() {
        this.f37620a.mo22759m();
    }

    /* renamed from: o */
    public final String m22760o(String str) {
        return m22764s().mo9740a(str);
    }

    /* renamed from: p */
    public final InterfaceC1062Qs m22761p() {
        C6671qI c6671qI = this.f37620a;
        return (InterfaceC1062Qs) c6671qI.f40744b.getValue(c6671qI, C6671qI.f40719X[0]);
    }

    /* renamed from: q */
    public final Set m22762q() {
        C6671qI c6671qI = this.f37620a;
        return (Set) c6671qI.f40747e.getValue(c6671qI, C6671qI.f40719X[3]);
    }

    /* renamed from: r */
    public final boolean m22763r() {
        C6671qI c6671qI = this.f37620a;
        return ((Boolean) c6671qI.f40748f.getValue(c6671qI, C6671qI.f40719X[4])).booleanValue();
    }

    /* renamed from: s */
    public final EnumC8980cR0 m22764s() {
        C6671qI c6671qI = this.f37620a;
        return (EnumC8980cR0) c6671qI.f40723D.getValue(c6671qI, C6671qI.f40719X[28]);
    }

    /* renamed from: t */
    public final C6291kI m22765t() {
        C6671qI c6671qI = this.f37620a;
        return (C6291kI) c6671qI.f40722C.getValue(c6671qI, C6671qI.f40719X[27]);
    }

    /* renamed from: u */
    public final boolean m22766u() {
        C6671qI c6671qI = this.f37620a;
        return ((Boolean) c6671qI.f40752j.getValue(c6671qI, C6671qI.f40719X[8])).booleanValue();
    }

    /* renamed from: w */
    public final String m22767w(InterfaceC0140CD interfaceC0140CD) {
        InterfaceC0140CD interfaceC0140CDMo423i;
        String str;
        O90.m5968f(interfaceC0140CD, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        interfaceC0140CD.mo421Z(new C7621Fx1(this), sb);
        C6671qI c6671qI = this.f37620a;
        C6608pI c6608pI = c6671qI.f40745c;
        InterfaceC10293mf0[] interfaceC10293mf0Arr = C6671qI.f40719X;
        if (((Boolean) c6608pI.getValue(c6671qI, interfaceC10293mf0Arr[1])).booleanValue() && !(interfaceC0140CD instanceof InterfaceC11993zz0) && !(interfaceC0140CD instanceof InterfaceC7780Iz0) && (interfaceC0140CDMo423i = interfaceC0140CD.mo423i()) != null && !(interfaceC0140CDMo423i instanceof InterfaceC7402Bs0)) {
            sb.append(" ");
            int iOrdinal = m22764s().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    throw new C6838sg();
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            C0789MX c0789mxM24695g = AbstractC6814sI.m24695g(interfaceC0140CDMo423i);
            O90.m5967e(c0789mxM24695g, "getFqName(...)");
            sb.append(c0789mxM24695g.f7212a.isEmpty() ? "root package" : m22760o(AbstractC9752iQ1.m19033c(c0789mxM24695g.m5391e())));
            if (((Boolean) c6671qI.f40746d.getValue(c6671qI, interfaceC10293mf0Arr[2])).booleanValue() && (interfaceC0140CDMo423i instanceof InterfaceC11993zz0) && (interfaceC0140CD instanceof InterfaceC0266ED)) {
                ((InterfaceC0266ED) interfaceC0140CD).mo422e().getClass();
            }
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [MN] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    /* renamed from: x */
    public final String m22768x(InterfaceC7116x5 interfaceC7116x5, EnumC0258E5 enumC0258E5) {
        C6707qs c6707qsMo1432V;
        List listMo1221f0;
        O90.m5968f(interfaceC7116x5, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (enumC0258E5 != null) {
            sb.append(enumC0258E5.f2469a + ':');
        }
        AbstractC7742Ig0 type = interfaceC7116x5.getType();
        sb.append(m22736X(type));
        C6671qI c6671qI = this.f37620a;
        InterfaceC10293mf0[] interfaceC10293mf0Arr = C6671qI.f40719X;
        InterfaceC10293mf0 interfaceC10293mf0 = interfaceC10293mf0Arr[38];
        C6608pI c6608pI = c6671qI.f40733N;
        if (((EnumC6721r5) c6608pI.getValue(c6671qI, interfaceC10293mf0)).f41331a) {
            Map mapMo4961g = interfaceC7116x5.mo4961g();
            Iterable arrayList = 0;
            arrayList = 0;
            arrayList = 0;
            InterfaceC6976us interfaceC6976usM25151d = ((Boolean) c6671qI.f40728I.getValue(c6671qI, interfaceC10293mf0Arr[33])).booleanValue() ? AbstractC6940uI.m25151d(interfaceC7116x5) : null;
            if (interfaceC6976usM25151d != null && (c6707qsMo1432V = interfaceC6976usM25151d.mo1432V()) != null && (listMo1221f0 = c6707qsMo1432V.mo1221f0()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listMo1221f0) {
                    if (((C8473Wh1) obj).m8832z1()) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(AbstractC7293zu.m26586k(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C8473Wh1) it.next()).getName());
                }
            }
            if (arrayList == 0) {
                arrayList = C0779MN.f7117a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                C8340Tt0 c8340Tt0 = (C8340Tt0) obj2;
                O90.m5965c(c8340Tt0);
                if (!mapMo4961g.containsKey(c8340Tt0)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC7293zu.m26586k(arrayList3));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C8340Tt0) it2.next()).m7801b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapMo4961g.entrySet();
            ArrayList arrayList5 = new ArrayList(AbstractC7293zu.m26586k(setEntrySet));
            for (Map.Entry entry : setEntrySet) {
                C8340Tt0 c8340Tt02 = (C8340Tt0) entry.getKey();
                AbstractC0249Dx abstractC0249Dx = (AbstractC0249Dx) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c8340Tt02.m7801b());
                sb2.append(" = ");
                sb2.append(!arrayList.contains(c8340Tt02) ? m22714A(abstractC0249Dx) : "...");
                arrayList5.add(sb2.toString());
            }
            List listM25976V = AbstractC7167xu.m25976V(AbstractC7167xu.m25968N(arrayList4, arrayList5));
            if (((EnumC6721r5) c6608pI.getValue(c6671qI, C6671qI.f40719X[38])).f41332b || !listM25976V.isEmpty()) {
                AbstractC7167xu.m25961G(listM25976V, sb, ", ", "(", ")", null, 112);
            }
        }
        if (m22766u() && (AbstractC1141S8.m7182b(type) || (type.mo3797E().mo1962a() instanceof C8084Ov0))) {
            sb.append(" /* annotation class not found */");
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: y */
    public final void m22769y(StringBuilder sb, InterfaceC6595p5 interfaceC6595p5, EnumC0258E5 enumC0258E5) {
        if (m22762q().contains(EnumC6480nI.f38245g)) {
            boolean z = interfaceC6595p5 instanceof AbstractC7742Ig0;
            C6671qI c6671qI = this.f37620a;
            Set setMo22757k = z ? c6671qI.mo22757k() : (Set) c6671qI.f40730K.getValue(c6671qI, C6671qI.f40719X[35]);
            InterfaceC6497nZ interfaceC6497nZ = (InterfaceC6497nZ) c6671qI.f40732M.getValue(c6671qI, C6671qI.f40719X[37]);
            for (InterfaceC7116x5 interfaceC7116x5 : interfaceC6595p5.getAnnotations()) {
                if (!AbstractC7167xu.m25994v(setMo22757k, interfaceC7116x5.mo4960f()) && !O90.m5963a(interfaceC7116x5.mo4960f(), AbstractC10604p41.f39820r) && (interfaceC6497nZ == null || ((Boolean) interfaceC6497nZ.invoke(interfaceC7116x5)).booleanValue())) {
                    sb.append(m22768x(interfaceC7116x5, enumC0258E5));
                    if (((Boolean) c6671qI.f40729J.getValue(c6671qI, C6671qI.f40719X[34])).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    /* renamed from: z */
    public final void m22770z(InterfaceC0936Os interfaceC0936Os, StringBuilder sb) {
        List listMo1438o = interfaceC0936Os.mo1438o();
        O90.m5967e(listMo1438o, "getDeclaredTypeParameters(...)");
        List parameters = interfaceC0936Os.mo1439v().getParameters();
        O90.m5967e(parameters, "getParameters(...)");
        if (m22766u() && interfaceC0936Os.mo1431N() && parameters.size() > listMo1438o.size()) {
            sb.append(" /*captured type parameters: ");
            m22742b0(sb, parameters.subList(listMo1438o.size(), parameters.size()));
            sb.append("*/");
        }
    }
}
