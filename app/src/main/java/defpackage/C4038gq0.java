package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: gq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4038gq0 {
    public final C1666Vd a;
    public final C3383dO1 b;

    public C4038gq0(C1666Vd c1666Vd) {
        O90.f(c1666Vd, "c");
        this.a = c1666Vd;
        C7955xI c7955xI = (C7955xI) c1666Vd.c;
        this.b = new C3383dO1(c7955xI.b, c7955xI.l);
    }

    public final AbstractC0447Fm0 a(CD cd) {
        if (cd instanceof InterfaceC8465zz0) {
            KX kx = ((AbstractC0096Az0) ((InterfaceC8465zz0) cd)).f;
            C1666Vd c1666Vd = this.a;
            return new QF0(kx, (InterfaceC1637Ut0) c1666Vd.d, (C5826m71) c1666Vd.b, (C6494pd0) c1666Vd.a);
        }
        if (cd instanceof HI) {
            return ((HI) cd).v;
        }
        return null;
    }

    public final I5 b(AbstractC7709w00 abstractC7709w00, int i, int i2) {
        return !ZV.c.c(i).booleanValue() ? S20.b : new C0941Lv0(((C7955xI) this.a.c).a, new C3275cq0(this, abstractC7709w00, i2, 0));
    }

    public final I5 c(C6613qF0 c6613qF0, boolean z) {
        return !ZV.c.c(c6613qF0.d).booleanValue() ? S20.b : new C0941Lv0(((C7955xI) this.a.c).a, new C3465dq0(this, z, c6613qF0));
    }

    public final AI d(VE0 ve0, boolean z) {
        C1666Vd c1666Vd = this.a;
        CD cd = (CD) c1666Vd.e;
        O90.d(cd, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC7492us interfaceC7492us = (InterfaceC7492us) cd;
        AI ai = new AI(interfaceC7492us, null, b(ve0, ve0.d, 1), z, 1, ve0, (InterfaceC1637Ut0) c1666Vd.d, (C5826m71) c1666Vd.b, (C0124Bi1) c1666Vd.f, (C6494pd0) c1666Vd.a, null);
        C1666Vd c1666VdB = c1666Vd.b(ai, MN.a, (InterfaceC1637Ut0) c1666Vd.d, (C5826m71) c1666Vd.b, (C0124Bi1) c1666Vd.f, (AbstractC7268th) c1666Vd.g);
        List list = ve0.e;
        O90.e(list, "getValueParameterList(...)");
        ai.M1(((C4038gq0) c1666VdB.i).g(list, ve0, 1), YM1.a((OF0) ZV.d.c(ve0.d)));
        ai.I1(interfaceC7492us.m());
        ai.s = interfaceC7492us.M();
        ai.w = !ZV.o.c(ve0.d).booleanValue();
        return ai;
    }

    public final UI e(C4309iF0 c4309iF0) {
        int i;
        AbstractC0663Ig0 abstractC0663Ig0G;
        O90.f(c4309iF0, "proto");
        int i2 = 1;
        if ((c4309iF0.c & 1) == 1) {
            i = c4309iF0.d;
        } else {
            int i3 = c4309iF0.e;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        int i4 = i;
        I5 i5B = b(c4309iF0, i4, 1);
        boolean zP = c4309iF0.p();
        I5 i5 = S20.b;
        C1666Vd c1666Vd = this.a;
        I5 c8145yI = (zP || (c4309iF0.c & 64) == 64) ? new C8145yI(((C7955xI) c1666Vd.c).a, new C3275cq0(this, c4309iF0, i2, 1)) : i5;
        KX kxG = AbstractC7384uI.g((CD) c1666Vd.e);
        int i6 = c4309iF0.f;
        InterfaceC1637Ut0 interfaceC1637Ut0 = (InterfaceC1637Ut0) c1666Vd.d;
        I5 i52 = c8145yI;
        UI ui = new UI((CD) c1666Vd.e, null, i5B, CB1.b(interfaceC1637Ut0, c4309iF0.f), YM1.b((EnumC5276jF0) ZV.p.c(i4)), c4309iF0, (InterfaceC1637Ut0) c1666Vd.d, (C5826m71) c1666Vd.b, kxG.c(CB1.b(interfaceC1637Ut0, i6)).equals(AbstractC3904g71.a) ? C0124Bi1.b : (C0124Bi1) c1666Vd.f, (C6494pd0) c1666Vd.a, null);
        List list = c4309iF0.i;
        O90.e(list, "getTypeParameterList(...)");
        C1666Vd c1666VdB = c1666Vd.b(ui, list, (InterfaceC1637Ut0) c1666Vd.d, (C5826m71) c1666Vd.b, (C0124Bi1) c1666Vd.f, (AbstractC7268th) c1666Vd.g);
        C5826m71 c5826m71 = (C5826m71) c1666Vd.b;
        AF0 af0C = AbstractC2123aN1.c(c4309iF0, c5826m71);
        C1902Yd1 c1902Yd1 = (C1902Yd1) c1666VdB.h;
        C6887rh0 c6887rh0H = (af0C == null || (abstractC0663Ig0G = c1902Yd1.g(af0C)) == null) ? null : EZ1.h(ui, abstractC0663Ig0G, i52);
        CD cd = (CD) c1666Vd.e;
        InterfaceC7492us interfaceC7492us = cd instanceof InterfaceC7492us ? (InterfaceC7492us) cd : null;
        C6887rh0 c6887rh0A1 = interfaceC7492us != null ? interfaceC7492us.a1() : null;
        O90.f(c5826m71, "typeTable");
        List list2 = c4309iF0.l;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List list3 = c4309iF0.m;
            O90.e(list3, "getContextReceiverTypeIdList(...)");
            List<Integer> list4 = list3;
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list4));
            for (Integer num : list4) {
                O90.c(num);
                arrayList.add(c5826m71.h(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        for (Object obj : list2) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            C6887rh0 c6887rh0B = EZ1.b(ui, c1902Yd1.g((AF0) obj), null, i5, i7);
            if (c6887rh0B != null) {
                arrayList2.add(c6887rh0B);
            }
            i7 = i8;
        }
        List listB = c1902Yd1.b();
        List list5 = c4309iF0.o;
        O90.e(list5, "getValueParameterList(...)");
        ui.M1(c6887rh0H, c6887rh0A1, arrayList2, listB, ((C4038gq0) c1666VdB.i).g(list5, c4309iF0, 1), c1902Yd1.g(AbstractC2123aN1.d(c4309iF0, c5826m71)), C7304tt.u((EnumC5467kF0) ZV.e.c(i4)), YM1.a((OF0) ZV.d.c(i4)), NN.a);
        ui.n = ZV.q.c(i4).booleanValue();
        ui.o = ZV.r.c(i4).booleanValue();
        ui.p = ZV.u.c(i4).booleanValue();
        ui.q = ZV.s.c(i4).booleanValue();
        ui.r = ZV.t.c(i4).booleanValue();
        ui.v = ZV.v.c(i4).booleanValue();
        ui.s = ZV.w.c(i4).booleanValue();
        ui.w = !ZV.x.c(i4).booleanValue();
        ((C7955xI) c1666Vd.c).m.getClass();
        O90.f(c5826m71, "typeTable");
        return ui;
    }

    public final TI f(C6613qF0 c6613qF0) {
        int i;
        C6613qF0 c6613qF02;
        C4038gq0 c4038gq0;
        I5 c8145yI;
        C1666Vd c1666Vd;
        AF0 af0H;
        WV wv;
        WV wv2;
        XV xv;
        XV xv2;
        C6613qF0 c6613qF03;
        C1666Vd c1666Vd2;
        WV wv3;
        FE0 fe0;
        C6613qF0 c6613qF04;
        FE0 fe02;
        C4038gq0 c4038gq02;
        JE0 je0D;
        FE0 fe0C;
        AbstractC0663Ig0 abstractC0663Ig0G;
        O90.f(c6613qF0, "proto");
        if ((c6613qF0.c & 1) == 1) {
            i = c6613qF0.d;
        } else {
            int i2 = c6613qF0.e;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        int i3 = i;
        C1666Vd c1666Vd3 = this.a;
        TI ti = new TI((CD) c1666Vd3.e, null, b(c6613qF0, i3, 2), C7304tt.u((EnumC5467kF0) ZV.e.c(i3)), YM1.a((OF0) ZV.d.c(i3)), ZV.y.c(i3).booleanValue(), CB1.b((InterfaceC1637Ut0) c1666Vd3.d, c6613qF0.f), YM1.b((EnumC5276jF0) ZV.p.c(i3)), ZV.C.c(i3).booleanValue(), ZV.B.c(i3).booleanValue(), ZV.E.c(i3).booleanValue(), ZV.F.c(i3).booleanValue(), ZV.G.c(i3).booleanValue(), c6613qF0, (InterfaceC1637Ut0) c1666Vd3.d, (C5826m71) c1666Vd3.b, (C0124Bi1) c1666Vd3.f, (C6494pd0) c1666Vd3.a);
        List list = c6613qF0.i;
        O90.e(list, "getTypeParameterList(...)");
        C1666Vd c1666VdB = c1666Vd3.b(ti, list, (InterfaceC1637Ut0) c1666Vd3.d, (C5826m71) c1666Vd3.b, (C0124Bi1) c1666Vd3.f, (AbstractC7268th) c1666Vd3.g);
        boolean zBooleanValue = ZV.z.c(i3).booleanValue();
        H5 h5 = S20.b;
        int i4 = 3;
        if (zBooleanValue && (c6613qF0.p() || (c6613qF0.c & 64) == 64)) {
            Z41 z41 = ((C7955xI) c1666Vd3.c).a;
            c6613qF02 = c6613qF0;
            c4038gq0 = this;
            c8145yI = new C8145yI(z41, new C3275cq0(c4038gq0, c6613qF02, i4, 1));
        } else {
            c6613qF02 = c6613qF0;
            c4038gq0 = this;
            c8145yI = h5;
        }
        C5826m71 c5826m71 = (C5826m71) c1666Vd3.b;
        AF0 af0E = AbstractC2123aN1.e(c6613qF02, c5826m71);
        C1902Yd1 c1902Yd1 = (C1902Yd1) c1666VdB.h;
        AbstractC0663Ig0 abstractC0663Ig0G2 = c1902Yd1.g(af0E);
        List listB = c1902Yd1.b();
        CD cd = (CD) c1666Vd3.e;
        InterfaceC7492us interfaceC7492us = cd instanceof InterfaceC7492us ? (InterfaceC7492us) cd : null;
        C6887rh0 c6887rh0A1 = interfaceC7492us != null ? interfaceC7492us.a1() : null;
        O90.f(c5826m71, "typeTable");
        if (c6613qF0.p()) {
            af0H = c6613qF02.j;
            c1666Vd = c1666Vd3;
        } else {
            c1666Vd = c1666Vd3;
            af0H = (c6613qF02.c & 64) == 64 ? c5826m71.h(c6613qF02.k) : null;
        }
        C6887rh0 c6887rh0H = (af0H == null || (abstractC0663Ig0G = c1902Yd1.g(af0H)) == null) ? null : EZ1.h(ti, abstractC0663Ig0G, c8145yI);
        O90.f(c5826m71, "typeTable");
        List list2 = c6613qF02.l;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List list3 = c6613qF02.m;
            O90.e(list3, "getContextReceiverTypeIdList(...)");
            List<Integer> list4 = list3;
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list4));
            for (Integer num : list4) {
                O90.c(num);
                arrayList.add(c5826m71.h(num.intValue()));
            }
            list2 = arrayList;
        }
        List list5 = list2;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list5));
        Iterator it = list5.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            arrayList2.add(EZ1.b(ti, c1902Yd1.g((AF0) next), null, h5, i5));
            it = it;
            i5 = i6;
        }
        ti.F1(abstractC0663Ig0G2, listB, c6887rh0A1, c6887rh0H, arrayList2);
        WV wv4 = ZV.c;
        boolean zBooleanValue2 = wv4.c(i3).booleanValue();
        XV xv3 = ZV.d;
        OF0 of0 = (OF0) xv3.c(i3);
        XV xv4 = ZV.e;
        EnumC5467kF0 enumC5467kF0 = (EnumC5467kF0) xv4.c(i3);
        if (of0 == null) {
            ZV.a(10);
            throw null;
        }
        if (enumC5467kF0 == null) {
            ZV.a(11);
            throw null;
        }
        int iA = (zBooleanValue2 ? 1 << wv4.a : 0) | (enumC5467kF0.a() << xv4.a) | (of0.a() << xv3.a);
        WV wv5 = ZV.K;
        wv5.getClass();
        WV wv6 = ZV.L;
        wv6.getClass();
        WV wv7 = ZV.M;
        wv7.getClass();
        C0162Bv0 c0162Bv0 = W21.O0;
        if (zBooleanValue) {
            int i7 = (c6613qF02.c & 256) == 256 ? c6613qF02.p : iA;
            boolean zBooleanValue3 = wv5.c(i7).booleanValue();
            boolean zBooleanValue4 = wv6.c(i7).booleanValue();
            boolean zBooleanValue5 = wv7.c(i7).booleanValue();
            I5 i5B = c4038gq0.b(c6613qF02, i7, 3);
            if (zBooleanValue3) {
                wv = wv7;
                wv2 = wv5;
                xv = xv4;
                c1666Vd2 = c1666VdB;
                wv3 = wv6;
                xv2 = xv3;
                c6613qF03 = c6613qF02;
                fe0C = new FE0(ti, i5B, C7304tt.u((EnumC5467kF0) xv4.c(i7)), YM1.a((OF0) xv3.c(i7)), !zBooleanValue3, zBooleanValue4, zBooleanValue5, ti.l(), null, c0162Bv0);
            } else {
                wv = wv7;
                wv2 = wv5;
                xv = xv4;
                xv2 = xv3;
                c6613qF03 = c6613qF02;
                c1666Vd2 = c1666VdB;
                wv3 = wv6;
                fe0C = EZ1.c(ti, i5B);
            }
            fe0C.B1(ti.getReturnType());
            fe0 = fe0C;
        } else {
            wv = wv7;
            wv2 = wv5;
            xv = xv4;
            xv2 = xv3;
            c6613qF03 = c6613qF02;
            c1666Vd2 = c1666VdB;
            wv3 = wv6;
            fe0 = null;
        }
        if (ZV.A.c(i3).booleanValue()) {
            int i8 = (c6613qF03.c & 512) == 512 ? c6613qF03.q : iA;
            boolean zBooleanValue6 = wv2.c(i8).booleanValue();
            boolean zBooleanValue7 = wv3.c(i8).booleanValue();
            boolean zBooleanValue8 = wv.c(i8).booleanValue();
            c6613qF04 = c6613qF03;
            c4038gq02 = this;
            I5 i5B2 = c4038gq02.b(c6613qF04, i8, 4);
            if (zBooleanValue6) {
                fe02 = fe0;
                JE0 je0 = new JE0(ti, i5B2, C7304tt.u((EnumC5467kF0) xv.c(i8)), YM1.a((OF0) xv2.c(i8)), !zBooleanValue6, zBooleanValue7, zBooleanValue8, ti.l(), null, c0162Bv0);
                C1666Vd c1666Vd4 = c1666Vd2;
                C1758Wh1 c1758Wh1 = (C1758Wh1) AbstractC8069xu.R(((C4038gq0) c1666Vd4.b(je0, MN.a, (InterfaceC1637Ut0) c1666Vd4.d, (C5826m71) c1666Vd4.b, (C0124Bi1) c1666Vd4.f, (AbstractC7268th) c1666Vd4.g).i).g(AbstractC8259yu.e(c6613qF04.o), c6613qF04, 4));
                if (c1758Wh1 == null) {
                    JE0.b1(6);
                    throw null;
                }
                je0.n = c1758Wh1;
                je0D = je0;
            } else {
                fe02 = fe0;
                je0D = EZ1.d(ti, i5B2);
            }
        } else {
            c6613qF04 = c6613qF03;
            fe02 = fe0;
            c4038gq02 = this;
            je0D = null;
        }
        if (ZV.D.c(i3).booleanValue()) {
            ti.D1(null, new C3656eq0(c4038gq02, c6613qF04, ti, 1));
        }
        CD cd2 = (CD) c1666Vd.e;
        InterfaceC7492us interfaceC7492us2 = cd2 instanceof InterfaceC7492us ? (InterfaceC7492us) cd2 : null;
        if ((interfaceC7492us2 != null ? interfaceC7492us2.l() : null) == EnumC0152Bs.e) {
            ti.D1(null, new C3656eq0(c4038gq02, c6613qF04, ti, 3));
        }
        ti.C1(fe02, je0D, new C3396dT(c4038gq02.c(c6613qF04, false)), new C3396dT(c4038gq02.c(c6613qF04, true)));
        return ti;
    }

    public final List g(List list, AbstractC7709w00 abstractC7709w00, int i) {
        C1666Vd c1666Vd = this.a;
        CD cd = (CD) c1666Vd.e;
        O90.d(cd, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC7662vl interfaceC7662vl = (InterfaceC7662vl) cd;
        CD cdI = interfaceC7662vl.i();
        O90.e(cdI, "getContainingDeclaration(...)");
        AbstractC0447Fm0 abstractC0447Fm0A = a(cdI);
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            IF0 if0 = (IF0) obj;
            int i4 = (if0.c & 1) == 1 ? if0.d : 0;
            I5 c0941Lv0 = (abstractC0447Fm0A == null || !ZV.c.c(i4).booleanValue()) ? S20.b : new C0941Lv0(((C7955xI) c1666Vd.c).a, new C3847fq0(this, abstractC0447Fm0A, abstractC7709w00, i, i2, if0));
            C1559Tt0 c1559Tt0B = CB1.b((InterfaceC1637Ut0) c1666Vd.d, if0.e);
            C5826m71 c5826m71 = (C5826m71) c1666Vd.b;
            AF0 af0I = AbstractC2123aN1.i(if0, c5826m71);
            C1902Yd1 c1902Yd1 = (C1902Yd1) c1666Vd.h;
            AbstractC0663Ig0 abstractC0663Ig0G = c1902Yd1.g(af0I);
            boolean zBooleanValue = ZV.H.c(i4).booleanValue();
            boolean zBooleanValue2 = ZV.I.c(i4).booleanValue();
            boolean zBooleanValue3 = ZV.J.c(i4).booleanValue();
            O90.f(c5826m71, "typeTable");
            int i5 = if0.c;
            AF0 af0H = (i5 & 16) == 16 ? if0.h : (i5 & 32) == 32 ? c5826m71.h(if0.i) : null;
            AbstractC0663Ig0 abstractC0663Ig0G2 = af0H != null ? c1902Yd1.g(af0H) : null;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C1758Wh1(interfaceC7662vl, null, i2, c0941Lv0, c1559Tt0B, abstractC0663Ig0G, zBooleanValue, zBooleanValue2, zBooleanValue3, abstractC0663Ig0G2, W21.O0));
            arrayList = arrayList2;
            i2 = i3;
        }
        return AbstractC8069xu.b0(arrayList);
    }
}
