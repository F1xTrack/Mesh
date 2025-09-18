package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: mI */
/* loaded from: classes2.dex */
public final class C5857mI implements InterfaceC6239oI {
    public static final C5857mI c;
    public static final C5857mI d;
    public static final C5857mI e;
    public final C6621qI a;
    public final F71 b = LB.b(new C3881g1(11, this));

    static {
        FZ1.e(C4258i.E);
        FZ1.e(C4258i.C);
        FZ1.e(C4258i.D);
        FZ1.e(C4258i.F);
        FZ1.e(C5284jI.g);
        c = FZ1.e(C4258i.H);
        FZ1.e(C4258i.I);
        d = FZ1.e(C5284jI.h);
        e = FZ1.e(C4258i.G);
        FZ1.e(C5284jI.f);
    }

    public C5857mI(C6621qI c6621qI) {
        this.a = c6621qI;
    }

    public static void W(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean i0(AbstractC0663Ig0 abstractC0663Ig0) {
        if (A12.h(abstractC0663Ig0)) {
            List listU = abstractC0663Ig0.u();
            if (!(listU instanceof Collection) || !listU.isEmpty()) {
                Iterator it = listU.iterator();
                while (it.hasNext()) {
                    if (((AbstractC6689qe1) it.next()).c()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void n(C5857mI c5857mI, CE0 ce0, StringBuilder sb) {
        if (!c5857mI.r()) {
            C6621qI c6621qI = c5857mI.a;
            InterfaceC5927mf0[] interfaceC5927mf0Arr = C6621qI.X;
            if (!((Boolean) c6621qI.g.getValue(c6621qI, interfaceC5927mf0Arr[5])).booleanValue()) {
                if (c5857mI.q().contains(EnumC6048nI.g)) {
                    c5857mI.y(sb, ce0, null);
                    C3396dT c3396dTW0 = ce0.w0();
                    if (c3396dTW0 != null) {
                        c5857mI.y(sb, c3396dTW0, E5.b);
                    }
                    C3396dT c3396dTU0 = ce0.u0();
                    if (c3396dTU0 != null) {
                        c5857mI.y(sb, c3396dTU0, E5.j);
                    }
                    if (((BE0) c6621qI.H.getValue(c6621qI, interfaceC5927mf0Arr[32])) == BE0.b) {
                        FE0 fe0C = ce0.c();
                        if (fe0C != null) {
                            c5857mI.y(sb, fe0C, E5.e);
                        }
                        JE0 je0D = ce0.d();
                        if (je0D != null) {
                            c5857mI.y(sb, je0D, E5.f);
                            List listF0 = je0D.f0();
                            O90.e(listF0, "getValueParameters(...)");
                            C1758Wh1 c1758Wh1 = (C1758Wh1) AbstractC8069xu.R(listF0);
                            O90.c(c1758Wh1);
                            c5857mI.y(sb, c1758Wh1, E5.i);
                        }
                    }
                }
                List listX0 = ce0.x0();
                O90.e(listX0, "getContextReceiverParameters(...)");
                c5857mI.B(sb, listX0);
                C7575vI visibility = ce0.getVisibility();
                O90.e(visibility, "getVisibility(...)");
                c5857mI.g0(visibility, sb);
                c5857mI.M(sb, c5857mI.q().contains(EnumC6048nI.n) && ce0.x(), "const");
                c5857mI.J(ce0, sb);
                c5857mI.L(ce0, sb);
                c5857mI.R(ce0, sb);
                c5857mI.M(sb, c5857mI.q().contains(EnumC6048nI.o) && ce0.A0(), "lateinit");
                c5857mI.I(ce0, sb);
            }
            c5857mI.d0(ce0, sb, false);
            List typeParameters = ce0.getTypeParameters();
            O90.e(typeParameters, "getTypeParameters(...)");
            c5857mI.c0(typeParameters, sb, true);
            c5857mI.U(ce0, sb);
        }
        c5857mI.O(ce0, sb, true);
        sb.append(": ");
        AbstractC0663Ig0 type = ce0.getType();
        O90.e(type, "getType(...)");
        sb.append(c5857mI.X(type));
        c5857mI.V(ce0, sb);
        c5857mI.G(ce0, sb);
        List typeParameters2 = ce0.getTypeParameters();
        O90.e(typeParameters2, "getTypeParameters(...)");
        c5857mI.h0(sb, typeParameters2);
    }

    public static EnumC6348os0 v(InterfaceC2400bq0 interfaceC2400bq0) {
        if (interfaceC2400bq0 instanceof InterfaceC7492us) {
            return ((InterfaceC7492us) interfaceC2400bq0).l() == EnumC0152Bs.b ? EnumC6348os0.e : EnumC6348os0.b;
        }
        CD cdI = interfaceC2400bq0.i();
        InterfaceC7492us interfaceC7492us = cdI instanceof InterfaceC7492us ? (InterfaceC7492us) cdI : null;
        if (interfaceC7492us == null) {
            return EnumC6348os0.b;
        }
        if (!(interfaceC2400bq0 instanceof InterfaceC8042xl)) {
            return EnumC6348os0.b;
        }
        InterfaceC8042xl interfaceC8042xl = (InterfaceC8042xl) interfaceC2400bq0;
        Collection collectionJ = interfaceC8042xl.j();
        O90.e(collectionJ, "getOverriddenDescriptors(...)");
        if (!collectionJ.isEmpty() && interfaceC7492us.f() != EnumC6348os0.b) {
            return EnumC6348os0.d;
        }
        if (interfaceC7492us.l() != EnumC0152Bs.b || O90.a(interfaceC8042xl.getVisibility(), AbstractC7765wI.a)) {
            return EnumC6348os0.b;
        }
        EnumC6348os0 enumC6348os0F = interfaceC8042xl.f();
        EnumC6348os0 enumC6348os0 = EnumC6348os0.e;
        return enumC6348os0F == enumC6348os0 ? enumC6348os0 : EnumC6348os0.d;
    }

    public final String A(AbstractC0323Dx abstractC0323Dx) {
        C6621qI c6621qI = this.a;
        InterfaceC6099nZ interfaceC6099nZ = (InterfaceC6099nZ) c6621qI.v.getValue(c6621qI, C6621qI.X[20]);
        if (interfaceC6099nZ != null) {
            return (String) interfaceC6099nZ.invoke(abstractC0323Dx);
        }
        if (abstractC0323Dx instanceof I8) {
            Iterable iterable = (Iterable) ((I8) abstractC0323Dx).a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strA = A((AbstractC0323Dx) it.next());
                if (strA != null) {
                    arrayList.add(strA);
                }
            }
            return AbstractC8069xu.H(arrayList, ", ", "{", "}", null, 56);
        }
        if (abstractC0323Dx instanceof G5) {
            return AbstractC7538v51.J("@", x((InterfaceC7916x5) ((G5) abstractC0323Dx).a, null));
        }
        if (!(abstractC0323Dx instanceof C4193he0)) {
            return abstractC0323Dx.toString();
        }
        AbstractC4002ge0 abstractC4002ge0 = (AbstractC4002ge0) ((C4193he0) abstractC0323Dx).a;
        if (abstractC4002ge0 instanceof C3620ee0) {
            return ((C3620ee0) abstractC4002ge0).a + "::class";
        }
        if (!(abstractC4002ge0 instanceof C3811fe0)) {
            throw new C7074sg();
        }
        C3811fe0 c3811fe0 = (C3811fe0) abstractC4002ge0;
        String strB = c3811fe0.a.a.b().b();
        for (int i = 0; i < c3811fe0.a.b; i++) {
            strB = "kotlin.Array<" + strB + '>';
        }
        return AbstractC8235ym.i(strB, "::class");
    }

    public final void B(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            C6887rh0 c6887rh0 = (C6887rh0) it.next();
            y(sb, c6887rh0, E5.g);
            sb.append(F(c6887rh0.getType()));
            if (i == AbstractC8259yu.d(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(java.lang.StringBuilder r6, defpackage.X01 r7) {
        /*
            r5 = this;
            r0 = 0
            r5.y(r6, r7, r0)
            boolean r1 = r7 instanceof defpackage.C6618qH
            boolean r1 = defpackage.S8.b(r7)
            r2 = 0
            if (r1 == 0) goto L8d
            boolean r0 = r7 instanceof defpackage.C4147hP
            if (r0 == 0) goto L1c
            r1 = r7
            hP r1 = (defpackage.C4147hP) r1
            jP r1 = r1.d
            boolean r1 = r1.b
            if (r1 == 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = r2
        L1d:
            qI r3 = r5.a
            if (r1 == 0) goto L57
            mf0[] r1 = defpackage.C6621qI.X
            r4 = 46
            r1 = r1[r4]
            pI r4 = r3.U
            java.lang.Object r1 = r4.getValue(r3, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L57
            kP r1 = defpackage.C5496kP.a
            if (r0 == 0) goto L40
            r0 = r7
            hP r0 = (defpackage.C4147hP) r0
            jP r0 = r0.d
            boolean r0 = r0.b
        L40:
            Pd1 r0 = r7.E()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"
            defpackage.O90.d(r0, r1)
            iP r0 = (defpackage.C4338iP) r0
            java.lang.String[] r0 = r0.b
            r0 = r0[r2]
            java.lang.String r0 = r5.D(r0)
            r6.append(r0)
            goto Lbc
        L57:
            if (r0 == 0) goto L76
            mf0[] r0 = defpackage.C6621qI.X
            r1 = 48
            r0 = r0[r1]
            pI r1 = r3.W
            java.lang.Object r0 = r1.getValue(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L76
            r0 = r7
            hP r0 = (defpackage.C4147hP) r0
            java.lang.String r0 = r0.h
            r6.append(r0)
            goto L81
        L76:
            Pd1 r0 = r7.E()
            java.lang.String r0 = r0.toString()
            r6.append(r0)
        L81:
            java.util.List r0 = r7.u()
            java.lang.String r0 = r5.Y(r0)
            r6.append(r0)
            goto Lbc
        L8d:
            Pd1 r1 = r7.E()
            Pd1 r3 = r7.E()
            Ns r3 = r3.a()
            boolean r4 = r3 instanceof defpackage.InterfaceC1165Os
            if (r4 == 0) goto La0
            r0 = r3
            Os r0 = (defpackage.InterfaceC1165Os) r0
        La0:
            rT1 r0 = defpackage.AbstractC7437uZ1.a(r7, r0, r2)
            if (r0 != 0) goto Lb9
            java.lang.String r0 = r5.Z(r1)
            r6.append(r0)
            java.util.List r0 = r7.u()
            java.lang.String r0 = r5.Y(r0)
            r6.append(r0)
            goto Lbc
        Lb9:
            r5.T(r6, r0)
        Lbc:
            boolean r0 = r7.G()
            if (r0 == 0) goto Lc7
            java.lang.String r0 = "?"
            r6.append(r0)
        Lc7:
            boolean r7 = r7 instanceof defpackage.C6618qH
            if (r7 == 0) goto Ld0
            java.lang.String r7 = " & Any"
            r6.append(r7)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5857mI.C(java.lang.StringBuilder, X01):void");
    }

    public final String D(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return AbstractC8235ym.k("<font color=red><b>", str, "</b></font>");
        }
        throw new C7074sg();
    }

    public final String E(String str, String str2, AbstractC8408zg0 abstractC8408zg0) {
        O90.f(str, "lowerRendered");
        O90.f(str2, "upperRendered");
        if (AbstractC4343iQ1.f(str, str2)) {
            return D51.o(str2, "(", false) ? AbstractC8235ym.k("(", str, ")!") : str.concat("!");
        }
        String strV = AbstractC7538v51.V(p().a(abstractC8408zg0.i(AbstractC6390p41.B), this), "Collection");
        String strD = AbstractC4343iQ1.d(str, strV.concat("Mutable"), str2, strV, strV.concat("(Mutable)"));
        if (strD != null) {
            return strD;
        }
        String strD2 = AbstractC4343iQ1.d(str, strV.concat("MutableMap.MutableEntry"), str2, strV.concat("Map.Entry"), strV.concat("(Mutable)Map.(Mutable)Entry"));
        if (strD2 != null) {
            return strD2;
        }
        String strV2 = AbstractC7538v51.V(p().a(abstractC8408zg0.j("Array"), this), "Array");
        String strD3 = AbstractC4343iQ1.d(str, strV2.concat(o("Array<")), str2, strV2.concat(o("Array<out ")), strV2.concat(o("Array<(out) ")));
        if (strD3 != null) {
            return strD3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String F(AbstractC0663Ig0 abstractC0663Ig0) {
        String strX = X(abstractC0663Ig0);
        if ((!i0(abstractC0663Ig0) || AbstractC0112Be1.e(abstractC0663Ig0)) && !(abstractC0663Ig0 instanceof C6618qH)) {
            return strX;
        }
        return "(" + strX + ')';
    }

    public final void G(InterfaceC3633ei1 interfaceC3633ei1, StringBuilder sb) {
        AbstractC0323Dx abstractC0323DxY;
        String strA;
        C6621qI c6621qI = this.a;
        if (!((Boolean) c6621qI.u.getValue(c6621qI, C6621qI.X[19])).booleanValue() || (abstractC0323DxY = interfaceC3633ei1.Y()) == null || (strA = A(abstractC0323DxY)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(o(strA));
    }

    public final String H(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal != 1) {
            throw new C7074sg();
        }
        C6621qI c6621qI = this.a;
        return ((Boolean) c6621qI.V.getValue(c6621qI, C6621qI.X[47])).booleanValue() ? str : AbstractC8235ym.k("<b>", str, "</b>");
    }

    public final void I(InterfaceC8042xl interfaceC8042xl, StringBuilder sb) {
        String str;
        if (q().contains(EnumC6048nI.i) && u() && interfaceC8042xl.l() != 1) {
            sb.append("/*");
            int iL = interfaceC8042xl.l();
            if (iL == 1) {
                str = "DECLARATION";
            } else if (iL == 2) {
                str = "FAKE_OVERRIDE";
            } else if (iL == 3) {
                str = "DELEGATION";
            } else {
                if (iL != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(AbstractC3585eS1.e(str));
            sb.append("*/ ");
        }
    }

    public final void J(InterfaceC2400bq0 interfaceC2400bq0, StringBuilder sb) {
        M(sb, interfaceC2400bq0.isExternal(), "external");
        boolean z = false;
        M(sb, q().contains(EnumC6048nI.l) && interfaceC2400bq0.M(), "expect");
        if (q().contains(EnumC6048nI.m) && interfaceC2400bq0.Q0()) {
            z = true;
        }
        M(sb, z, "actual");
    }

    public final void K(EnumC6348os0 enumC6348os0, StringBuilder sb, EnumC6348os0 enumC6348os02) {
        C6621qI c6621qI = this.a;
        if (((Boolean) c6621qI.p.getValue(c6621qI, C6621qI.X[14])).booleanValue() || enumC6348os0 != enumC6348os02) {
            M(sb, q().contains(EnumC6048nI.e), AbstractC3585eS1.e(enumC6348os0.name()));
        }
    }

    public final void L(InterfaceC8042xl interfaceC8042xl, StringBuilder sb) {
        if (AbstractC7002sI.s(interfaceC8042xl) && interfaceC8042xl.f() == EnumC6348os0.b) {
            return;
        }
        C6621qI c6621qI = this.a;
        if (((EnumC6941rz0) c6621qI.B.getValue(c6621qI, C6621qI.X[26])) == EnumC6941rz0.a && interfaceC8042xl.f() == EnumC6348os0.d && !interfaceC8042xl.j().isEmpty()) {
            return;
        }
        EnumC6348os0 enumC6348os0F = interfaceC8042xl.f();
        O90.e(enumC6348os0F, "getModality(...)");
        K(enumC6348os0F, sb, v(interfaceC8042xl));
    }

    public final void M(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(H(str));
            sb.append(" ");
        }
    }

    public final String N(C1559Tt0 c1559Tt0, boolean z) {
        String strO = o(AbstractC4343iQ1.b(c1559Tt0));
        C6621qI c6621qI = this.a;
        return (((Boolean) c6621qI.V.getValue(c6621qI, C6621qI.X[47])).booleanValue() && s() == EnumC2515cR0.b && z) ? AbstractC8235ym.k("<b>", strO, "</b>") : strO;
    }

    public final void O(CD cd, StringBuilder sb, boolean z) {
        C1559Tt0 name = cd.getName();
        O90.e(name, "getName(...)");
        sb.append(N(name, z));
    }

    public final void P(StringBuilder sb, AbstractC0663Ig0 abstractC0663Ig0) {
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0.L();
        C6562q c6562q = abstractC1521Tg1L instanceof C6562q ? (C6562q) abstractC1521Tg1L : null;
        if (c6562q == null) {
            Q(sb, abstractC0663Ig0);
            return;
        }
        C6621qI c6621qI = this.a;
        InterfaceC5927mf0[] interfaceC5927mf0Arr = C6621qI.X;
        boolean zBooleanValue = ((Boolean) c6621qI.R.getValue(c6621qI, interfaceC5927mf0Arr[42])).booleanValue();
        X01 x01 = c6562q.b;
        if (zBooleanValue) {
            Q(sb, x01);
            return;
        }
        Q(sb, c6562q.c);
        if (((Boolean) c6621qI.Q.getValue(c6621qI, interfaceC5927mf0Arr[41])).booleanValue()) {
            EnumC2515cR0 enumC2515cR0S = s();
            C2134aR0 c2134aR0 = EnumC2515cR0.b;
            if (enumC2515cR0S == c2134aR0) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* = ");
            Q(sb, x01);
            sb.append(" */");
            if (s() == c2134aR0) {
                sb.append("</i></font>");
            }
        }
    }

    public final void Q(StringBuilder sb, AbstractC0663Ig0 abstractC0663Ig0) {
        C1559Tt0 c1559Tt0C;
        String strO;
        boolean z = abstractC0663Ig0 instanceof C4395ii0;
        C6621qI c6621qI = this.a;
        if (z && c6621qI.n()) {
            C1688Vk0 c1688Vk0 = ((C4395ii0) abstractC0663Ig0).d;
            if (c1688Vk0.c == EnumC1844Xk0.a || c1688Vk0.c == EnumC1844Xk0.b) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0.L();
        if (abstractC1521Tg1L instanceof AbstractC3405dW) {
            sb.append(((AbstractC3405dW) abstractC1521Tg1L).a0(this, this));
            return;
        }
        if (abstractC1521Tg1L instanceof X01) {
            X01 x01 = (X01) abstractC1521Tg1L;
            if (x01.equals(AbstractC0112Be1.b) || x01.E() == AbstractC0112Be1.a.b) {
                sb.append("???");
                return;
            }
            InterfaceC1200Pd1 interfaceC1200Pd1E = x01.E();
            if ((interfaceC1200Pd1E instanceof C4338iP) && ((C4338iP) interfaceC1200Pd1E).a == EnumC5305jP.j) {
                if (!((Boolean) c6621qI.t.getValue(c6621qI, C6621qI.X[18])).booleanValue()) {
                    sb.append("???");
                    return;
                }
                InterfaceC1200Pd1 interfaceC1200Pd1E2 = x01.E();
                O90.d(interfaceC1200Pd1E2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(D(((C4338iP) interfaceC1200Pd1E2).b[0]));
                return;
            }
            if (S8.b(x01)) {
                C(sb, x01);
                return;
            }
            if (!i0(x01)) {
                C(sb, x01);
                return;
            }
            int length = sb.length();
            ((C5857mI) this.b.getValue()).y(sb, x01, null);
            boolean z2 = sb.length() != length;
            AbstractC0663Ig0 abstractC0663Ig0F = A12.f(x01);
            List listD = A12.d(x01);
            if (!listD.isEmpty()) {
                sb.append("context(");
                Iterator it = listD.subList(0, AbstractC8259yu.d(listD)).iterator();
                while (it.hasNext()) {
                    P(sb, (AbstractC0663Ig0) it.next());
                    sb.append(", ");
                }
                P(sb, (AbstractC0663Ig0) AbstractC8069xu.J(listD));
                sb.append(") ");
            }
            boolean zI = A12.i(x01);
            boolean zG = x01.G();
            boolean z3 = zG || (z2 && abstractC0663Ig0F != null);
            if (z3) {
                if (zI) {
                    sb.insert(length, '(');
                } else {
                    if (z2) {
                        HS1.d(AbstractC7538v51.D(sb));
                        if (sb.charAt(AbstractC7538v51.x(sb) - 1) != ')') {
                            sb.insert(AbstractC7538v51.x(sb), "()");
                        }
                    }
                    sb.append("(");
                }
            }
            M(sb, zI, "suspend");
            if (abstractC0663Ig0F != null) {
                boolean z4 = (i0(abstractC0663Ig0F) && !abstractC0663Ig0F.G()) || A12.i(abstractC0663Ig0F) || !abstractC0663Ig0F.getAnnotations().isEmpty() || (abstractC0663Ig0F instanceof C6618qH);
                if (z4) {
                    sb.append("(");
                }
                P(sb, abstractC0663Ig0F);
                if (z4) {
                    sb.append(")");
                }
                sb.append(".");
            }
            sb.append("(");
            if (!A12.h(x01) || x01.getAnnotations().D(AbstractC6390p41.p) == null || x01.u().size() > 1) {
                int i = 0;
                for (AbstractC6689qe1 abstractC6689qe1 : A12.g(x01)) {
                    int i2 = i + 1;
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (((Boolean) c6621qI.T.getValue(c6621qI, C6621qI.X[44])).booleanValue()) {
                        AbstractC0663Ig0 abstractC0663Ig0B = abstractC6689qe1.b();
                        O90.e(abstractC0663Ig0B, "getType(...)");
                        c1559Tt0C = A12.c(abstractC0663Ig0B);
                    } else {
                        c1559Tt0C = null;
                    }
                    if (c1559Tt0C != null) {
                        sb.append(N(c1559Tt0C, false));
                        sb.append(": ");
                    }
                    O90.f(abstractC6689qe1, "typeProjection");
                    StringBuilder sb2 = new StringBuilder();
                    AbstractC8069xu.G(AbstractC8259yu.e(abstractC6689qe1), sb2, ", ", null, null, new C5666lI(this, 0), 60);
                    String string = sb2.toString();
                    O90.e(string, "toString(...)");
                    sb.append(string);
                    i = i2;
                }
            } else {
                sb.append("???");
            }
            sb.append(") ");
            int iOrdinal = s().ordinal();
            if (iOrdinal == 0) {
                strO = o("->");
            } else {
                if (iOrdinal != 1) {
                    throw new C7074sg();
                }
                strO = "&rarr;";
            }
            sb.append(strO);
            sb.append(" ");
            A12.h(x01);
            AbstractC0663Ig0 abstractC0663Ig0B2 = ((AbstractC6689qe1) AbstractC8069xu.J(x01.u())).b();
            O90.e(abstractC0663Ig0B2, "getType(...)");
            P(sb, abstractC0663Ig0B2);
            if (z3) {
                sb.append(")");
            }
            if (zG) {
                sb.append("?");
            }
        }
    }

    public final void R(InterfaceC8042xl interfaceC8042xl, StringBuilder sb) {
        if (q().contains(EnumC6048nI.f) && !interfaceC8042xl.j().isEmpty()) {
            C6621qI c6621qI = this.a;
            if (((EnumC6941rz0) c6621qI.B.getValue(c6621qI, C6621qI.X[26])) != EnumC6941rz0.b) {
                M(sb, true, "override");
                if (u()) {
                    sb.append("/*");
                    sb.append(interfaceC8042xl.j().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void S(KX kx, String str, StringBuilder sb) {
        sb.append(H(str));
        MX mxI = kx.i();
        O90.e(mxI, "toUnsafe(...)");
        String strO = o(AbstractC4343iQ1.c(mxI.e()));
        if (strO.length() > 0) {
            sb.append(" ");
            sb.append(strO);
        }
    }

    public final void T(StringBuilder sb, C6846rT1 c6846rT1) {
        C6846rT1 c6846rT12 = (C6846rT1) c6846rT1.d;
        InterfaceC1165Os interfaceC1165Os = (InterfaceC1165Os) c6846rT1.b;
        if (c6846rT12 != null) {
            T(sb, c6846rT12);
            sb.append('.');
            C1559Tt0 name = interfaceC1165Os.getName();
            O90.e(name, "getName(...)");
            sb.append(N(name, false));
        } else {
            InterfaceC1200Pd1 interfaceC1200Pd1V = interfaceC1165Os.v();
            O90.e(interfaceC1200Pd1V, "getTypeConstructor(...)");
            sb.append(Z(interfaceC1200Pd1V));
        }
        sb.append(Y((List) c6846rT1.c));
    }

    public final void U(InterfaceC8042xl interfaceC8042xl, StringBuilder sb) {
        C6887rh0 c6887rh0T0 = interfaceC8042xl.t0();
        if (c6887rh0T0 != null) {
            y(sb, c6887rh0T0, E5.g);
            sb.append(F(c6887rh0T0.getType()));
            sb.append(".");
        }
    }

    public final void V(InterfaceC8042xl interfaceC8042xl, StringBuilder sb) {
        C6887rh0 c6887rh0T0;
        C6621qI c6621qI = this.a;
        if (((Boolean) c6621qI.F.getValue(c6621qI, C6621qI.X[30])).booleanValue() && (c6887rh0T0 = interfaceC8042xl.t0()) != null) {
            sb.append(" on ");
            sb.append(X(c6887rh0T0.getType()));
        }
    }

    public final String X(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "type");
        StringBuilder sb = new StringBuilder();
        C6621qI c6621qI = this.a;
        P(sb, (AbstractC0663Ig0) ((InterfaceC6099nZ) c6621qI.y.getValue(c6621qI, C6621qI.X[23])).invoke(abstractC0663Ig0));
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public final String Y(List list) {
        O90.f(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(o("<"));
        AbstractC8069xu.G(list, sb, ", ", null, null, new C5666lI(this, 0), 60);
        sb.append(o(">"));
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public final String Z(InterfaceC1200Pd1 interfaceC1200Pd1) {
        O90.f(interfaceC1200Pd1, "typeConstructor");
        InterfaceC1087Ns interfaceC1087NsA = interfaceC1200Pd1.a();
        if (interfaceC1087NsA instanceof InterfaceC5925me1 ? true : interfaceC1087NsA instanceof InterfaceC7492us ? true : interfaceC1087NsA instanceof InterfaceC0499Gd1) {
            O90.f(interfaceC1087NsA, "klass");
            return C5496kP.f(interfaceC1087NsA) ? interfaceC1087NsA.v().toString() : p().a(interfaceC1087NsA, this);
        }
        if (interfaceC1087NsA == null) {
            return interfaceC1200Pd1 instanceof M90 ? ((M90) interfaceC1200Pd1).f(C5284jI.k) : interfaceC1200Pd1.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC1087NsA.getClass()).toString());
    }

    @Override // defpackage.InterfaceC6239oI
    public final void a() {
        this.a.a();
    }

    public final void a0(InterfaceC5925me1 interfaceC5925me1, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(o("<"));
        }
        if (u()) {
            sb.append("/*");
            sb.append(interfaceC5925me1.getIndex());
            sb.append("*/ ");
        }
        M(sb, interfaceC5925me1.D(), "reified");
        String str = interfaceC5925me1.O().a;
        boolean z2 = true;
        M(sb, str.length() > 0, str);
        y(sb, interfaceC5925me1, null);
        O(interfaceC5925me1, sb, z);
        int size = interfaceC5925me1.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) interfaceC5925me1.getUpperBounds().iterator().next();
            if (abstractC0663Ig0 == null) {
                AbstractC8408zg0.a(142);
                throw null;
            }
            if (!AbstractC8408zg0.x(abstractC0663Ig0) || !abstractC0663Ig0.G()) {
                sb.append(" : ");
                sb.append(X(abstractC0663Ig0));
            }
        } else if (z) {
            for (AbstractC0663Ig0 abstractC0663Ig02 : interfaceC5925me1.getUpperBounds()) {
                if (abstractC0663Ig02 == null) {
                    AbstractC8408zg0.a(142);
                    throw null;
                }
                if (!AbstractC8408zg0.x(abstractC0663Ig02) || !abstractC0663Ig02.G()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(X(abstractC0663Ig02));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(o(">"));
        }
    }

    @Override // defpackage.InterfaceC6239oI
    public final void b() {
        this.a.b();
    }

    public final void b0(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0((InterfaceC5925me1) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // defpackage.InterfaceC6239oI
    public final void c() {
        this.a.c();
    }

    public final void c0(List list, StringBuilder sb, boolean z) {
        C6621qI c6621qI = this.a;
        if (((Boolean) c6621qI.w.getValue(c6621qI, C6621qI.X[21])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(o("<"));
        b0(sb, list);
        sb.append(o(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override // defpackage.InterfaceC6239oI
    public final void d(Set set) {
        O90.f(set, "<set-?>");
        this.a.d(set);
    }

    public final void d0(InterfaceC3633ei1 interfaceC3633ei1, StringBuilder sb, boolean z) {
        if (z || !(interfaceC3633ei1 instanceof C1758Wh1)) {
            sb.append(H(interfaceC3633ei1.s0() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // defpackage.InterfaceC6239oI
    public final void e(LinkedHashSet linkedHashSet) {
        this.a.e(linkedHashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(defpackage.C1758Wh1 r11, boolean r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5857mI.e0(Wh1, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // defpackage.InterfaceC6239oI
    public final void f() {
        this.a.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(java.util.Collection r8, boolean r9, java.lang.StringBuilder r10) {
        /*
            r7 = this;
            qI r0 = r7.a
            mf0[] r1 = defpackage.C6621qI.X
            r2 = 29
            r1 = r1[r2]
            pI r2 = r0.E
            java.lang.Object r0 = r2.getValue(r0, r1)
            dA0 r0 = (defpackage.EnumC3340dA0) r0
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
            kI r3 = r7.t()
            r3.getClass()
            java.lang.String r3 = "builder"
            defpackage.O90.f(r10, r3)
            java.lang.String r3 = "("
            r10.append(r3)
            java.util.Iterator r8 = r8.iterator()
            r3 = r2
        L42:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L71
            int r4 = r3 + 1
            java.lang.Object r5 = r8.next()
            Wh1 r5 = (defpackage.C1758Wh1) r5
            kI r6 = r7.t()
            r6.getClass()
            java.lang.String r6 = "parameter"
            defpackage.O90.f(r5, r6)
            r7.e0(r5, r9, r10, r2)
            kI r5 = r7.t()
            r5.getClass()
            int r5 = r0 + (-1)
            if (r3 == r5) goto L6f
            java.lang.String r3 = ", "
            r10.append(r3)
        L6f:
            r3 = r4
            goto L42
        L71:
            kI r8 = r7.t()
            r8.getClass()
            java.lang.String r8 = ")"
            r10.append(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5857mI.f0(java.util.Collection, boolean, java.lang.StringBuilder):void");
    }

    @Override // defpackage.InterfaceC6239oI
    public final void g(InterfaceC1321Qs interfaceC1321Qs) {
        this.a.g(interfaceC1321Qs);
    }

    public final boolean g0(C7575vI c7575vI, StringBuilder sb) {
        if (!q().contains(EnumC6048nI.d)) {
            return false;
        }
        C6621qI c6621qI = this.a;
        InterfaceC5927mf0[] interfaceC5927mf0Arr = C6621qI.X;
        if (((Boolean) c6621qI.n.getValue(c6621qI, interfaceC5927mf0Arr[12])).booleanValue()) {
            c7575vI = AbstractC7765wI.f(c7575vI.a.m());
        }
        if (!((Boolean) c6621qI.o.getValue(c6621qI, interfaceC5927mf0Arr[13])).booleanValue() && O90.a(c7575vI, AbstractC7765wI.j)) {
            return false;
        }
        sb.append(H(c7575vI.a.d()));
        sb.append(" ");
        return true;
    }

    @Override // defpackage.InterfaceC6239oI
    public final void h(EnumC3340dA0 enumC3340dA0) {
        this.a.h(enumC3340dA0);
    }

    public final void h0(StringBuilder sb, List list) {
        C6621qI c6621qI = this.a;
        if (((Boolean) c6621qI.w.getValue(c6621qI, C6621qI.X[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5925me1 interfaceC5925me1 = (InterfaceC5925me1) it.next();
            List upperBounds = interfaceC5925me1.getUpperBounds();
            O90.e(upperBounds, "getUpperBounds(...)");
            for (AbstractC0663Ig0 abstractC0663Ig0 : AbstractC8069xu.w(upperBounds)) {
                StringBuilder sb2 = new StringBuilder();
                C1559Tt0 name = interfaceC5925me1.getName();
                O90.e(name, "getName(...)");
                sb2.append(N(name, false));
                sb2.append(" : ");
                O90.c(abstractC0663Ig0);
                sb2.append(X(abstractC0663Ig0));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(H("where"));
        sb.append(" ");
        AbstractC8069xu.G(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // defpackage.InterfaceC6239oI
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.InterfaceC6239oI
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.InterfaceC6239oI
    public final Set k() {
        return this.a.k();
    }

    @Override // defpackage.InterfaceC6239oI
    public final void l() {
        C2325bR0 c2325bR0 = EnumC2515cR0.a;
        this.a.l();
    }

    @Override // defpackage.InterfaceC6239oI
    public final void m() {
        this.a.m();
    }

    public final String o(String str) {
        return s().a(str);
    }

    public final InterfaceC1321Qs p() {
        C6621qI c6621qI = this.a;
        return (InterfaceC1321Qs) c6621qI.b.getValue(c6621qI, C6621qI.X[0]);
    }

    public final Set q() {
        C6621qI c6621qI = this.a;
        return (Set) c6621qI.e.getValue(c6621qI, C6621qI.X[3]);
    }

    public final boolean r() {
        C6621qI c6621qI = this.a;
        return ((Boolean) c6621qI.f.getValue(c6621qI, C6621qI.X[4])).booleanValue();
    }

    public final EnumC2515cR0 s() {
        C6621qI c6621qI = this.a;
        return (EnumC2515cR0) c6621qI.D.getValue(c6621qI, C6621qI.X[28]);
    }

    public final C5475kI t() {
        C6621qI c6621qI = this.a;
        return (C5475kI) c6621qI.C.getValue(c6621qI, C6621qI.X[27]);
    }

    public final boolean u() {
        C6621qI c6621qI = this.a;
        return ((Boolean) c6621qI.j.getValue(c6621qI, C6621qI.X[8])).booleanValue();
    }

    public final String w(CD cd) {
        CD cdI;
        String str;
        O90.f(cd, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        cd.Z(new C0481Fx1(this), sb);
        C6621qI c6621qI = this.a;
        C6430pI c6430pI = c6621qI.c;
        InterfaceC5927mf0[] interfaceC5927mf0Arr = C6621qI.X;
        if (((Boolean) c6430pI.getValue(c6621qI, interfaceC5927mf0Arr[1])).booleanValue() && !(cd instanceof InterfaceC8465zz0) && !(cd instanceof InterfaceC0720Iz0) && (cdI = cd.i()) != null && !(cdI instanceof InterfaceC0153Bs0)) {
            sb.append(" ");
            int iOrdinal = s().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    throw new C7074sg();
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            MX mxG = AbstractC7002sI.g(cdI);
            O90.e(mxG, "getFqName(...)");
            sb.append(mxG.a.isEmpty() ? "root package" : o(AbstractC4343iQ1.c(mxG.e())));
            if (((Boolean) c6621qI.d.getValue(c6621qI, interfaceC5927mf0Arr[2])).booleanValue() && (cdI instanceof InterfaceC8465zz0) && (cd instanceof ED)) {
                ((ED) cd).e().getClass();
            }
        }
        String string = sb.toString();
        O90.e(string, "toString(...)");
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
    public final String x(InterfaceC7916x5 interfaceC7916x5, E5 e5) {
        C6729qs c6729qsV;
        List listF0;
        O90.f(interfaceC7916x5, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (e5 != null) {
            sb.append(e5.a + ':');
        }
        AbstractC0663Ig0 type = interfaceC7916x5.getType();
        sb.append(X(type));
        C6621qI c6621qI = this.a;
        InterfaceC5927mf0[] interfaceC5927mf0Arr = C6621qI.X;
        InterfaceC5927mf0 interfaceC5927mf0 = interfaceC5927mf0Arr[38];
        C6430pI c6430pI = c6621qI.N;
        if (((EnumC6772r5) c6430pI.getValue(c6621qI, interfaceC5927mf0)).a) {
            Map mapG = interfaceC7916x5.g();
            Iterable arrayList = 0;
            arrayList = 0;
            arrayList = 0;
            InterfaceC7492us interfaceC7492usD = ((Boolean) c6621qI.I.getValue(c6621qI, interfaceC5927mf0Arr[33])).booleanValue() ? AbstractC7384uI.d(interfaceC7916x5) : null;
            if (interfaceC7492usD != null && (c6729qsV = interfaceC7492usD.V()) != null && (listF0 = c6729qsV.f0()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listF0) {
                    if (((C1758Wh1) obj).z1()) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(AbstractC8449zu.k(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1758Wh1) it.next()).getName());
                }
            }
            if (arrayList == 0) {
                arrayList = MN.a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                C1559Tt0 c1559Tt0 = (C1559Tt0) obj2;
                O90.c(c1559Tt0);
                if (!mapG.containsKey(c1559Tt0)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC8449zu.k(arrayList3));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C1559Tt0) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapG.entrySet();
            ArrayList arrayList5 = new ArrayList(AbstractC8449zu.k(setEntrySet));
            for (Map.Entry entry : setEntrySet) {
                C1559Tt0 c1559Tt02 = (C1559Tt0) entry.getKey();
                AbstractC0323Dx abstractC0323Dx = (AbstractC0323Dx) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c1559Tt02.b());
                sb2.append(" = ");
                sb2.append(!arrayList.contains(c1559Tt02) ? A(abstractC0323Dx) : "...");
                arrayList5.add(sb2.toString());
            }
            List listV = AbstractC8069xu.V(AbstractC8069xu.N(arrayList4, arrayList5));
            if (((EnumC6772r5) c6430pI.getValue(c6621qI, C6621qI.X[38])).b || !listV.isEmpty()) {
                AbstractC8069xu.G(listV, sb, ", ", "(", ")", null, 112);
            }
        }
        if (u() && (S8.b(type) || (type.E().a() instanceof C1175Ov0))) {
            sb.append(" /* annotation class not found */");
        }
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public final void y(StringBuilder sb, InterfaceC6391p5 interfaceC6391p5, E5 e5) {
        if (q().contains(EnumC6048nI.g)) {
            boolean z = interfaceC6391p5 instanceof AbstractC0663Ig0;
            C6621qI c6621qI = this.a;
            Set setK = z ? c6621qI.k() : (Set) c6621qI.K.getValue(c6621qI, C6621qI.X[35]);
            InterfaceC6099nZ interfaceC6099nZ = (InterfaceC6099nZ) c6621qI.M.getValue(c6621qI, C6621qI.X[37]);
            for (InterfaceC7916x5 interfaceC7916x5 : interfaceC6391p5.getAnnotations()) {
                if (!AbstractC8069xu.v(setK, interfaceC7916x5.f()) && !O90.a(interfaceC7916x5.f(), AbstractC6390p41.r) && (interfaceC6099nZ == null || ((Boolean) interfaceC6099nZ.invoke(interfaceC7916x5)).booleanValue())) {
                    sb.append(x(interfaceC7916x5, e5));
                    if (((Boolean) c6621qI.J.getValue(c6621qI, C6621qI.X[34])).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final void z(InterfaceC1165Os interfaceC1165Os, StringBuilder sb) {
        List listO = interfaceC1165Os.o();
        O90.e(listO, "getDeclaredTypeParameters(...)");
        List parameters = interfaceC1165Os.v().getParameters();
        O90.e(parameters, "getParameters(...)");
        if (u() && interfaceC1165Os.N() && parameters.size() > listO.size()) {
            sb.append(" /*captured type parameters: ");
            b0(sb, parameters.subList(listO.size(), parameters.size()));
            sb.append("*/");
        }
    }
}
