package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: gq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9547gq0 {

    /* renamed from: a */
    public final C1361Vd f28057a;

    /* renamed from: b */
    public final C9108dO1 f28058b;

    public C9547gq0(C1361Vd c1361Vd) {
        O90.m5968f(c1361Vd, "c");
        this.f28057a = c1361Vd;
        C7129xI c7129xI = (C7129xI) c1361Vd.f12662c;
        this.f28058b = new C9108dO1(c7129xI.f45519b, c7129xI.f45529l);
    }

    /* renamed from: a */
    public final AbstractC7598Fm0 m18662a(InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD instanceof InterfaceC11993zz0) {
            C0664KX c0664kx = ((AbstractC7364Az0) ((InterfaceC11993zz0) interfaceC0140CD)).f494f;
            C1361Vd c1361Vd = this.f28057a;
            return new QF0(c0664kx, (InterfaceC8392Ut0) c1361Vd.f12663d, (C10226m71) c1361Vd.f12661b, (C10673pd0) c1361Vd.f12660a);
        }
        if (interfaceC0140CD instanceof C0460HI) {
            return ((C0460HI) interfaceC0140CD).f4221v;
        }
        return null;
    }

    /* renamed from: b */
    public final InterfaceC0510I5 m18663b(AbstractC11487w00 abstractC11487w00, int i, int i2) {
        return !AbstractC1605ZV.f14927c.m8799c(i).booleanValue() ? S20.f10539b : new C7928Lv0(((C7129xI) this.f28057a.f12662c).f45518a, new C9035cq0(this, abstractC11487w00, i2, 0));
    }

    /* renamed from: c */
    public final InterfaceC0510I5 m18664c(C10753qF0 c10753qF0, boolean z) {
        return !AbstractC1605ZV.f14927c.m8799c(c10753qF0.f40688d).booleanValue() ? S20.f10539b : new C7928Lv0(((C7129xI) this.f28057a.f12662c).f45518a, new C9163dq0(this, z, c10753qF0));
    }

    /* renamed from: d */
    public final C0019AI m18665d(VE0 ve0, boolean z) {
        C1361Vd c1361Vd = this.f28057a;
        InterfaceC0140CD interfaceC0140CD = (InterfaceC0140CD) c1361Vd.f12664e;
        O90.m5966d(interfaceC0140CD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC6976us interfaceC6976us = (InterfaceC6976us) interfaceC0140CD;
        C0019AI c0019ai = new C0019AI(interfaceC6976us, null, m18663b(ve0, ve0.f12454d, 1), z, 1, ve0, (InterfaceC8392Ut0) c1361Vd.f12663d, (C10226m71) c1361Vd.f12661b, (C7383Bi1) c1361Vd.f12665f, (C10673pd0) c1361Vd.f12660a, null);
        C1361Vd c1361VdM8517b = c1361Vd.m8517b(c0019ai, C0779MN.f7117a, (InterfaceC8392Ut0) c1361Vd.f12663d, (C10226m71) c1361Vd.f12661b, (C7383Bi1) c1361Vd.f12665f, (AbstractC6902th) c1361Vd.f12666g);
        List list = ve0.f12455e;
        O90.m5967e(list, "getValueParameterList(...)");
        c0019ai.m24075M1(((C9547gq0) c1361VdM8517b.f12668i).m18668g(list, ve0, 1), YM1.m9269a((OF0) AbstractC1605ZV.f14928d.m9059c(ve0.f12454d)));
        c0019ai.m1220I1(interfaceC6976us.mo1492m());
        c0019ai.f1443s = interfaceC6976us.mo111M();
        c0019ai.f1447w = !AbstractC1605ZV.f14939o.m8799c(ve0.f12454d).booleanValue();
        return c0019ai;
    }

    /* renamed from: e */
    public final C1277UI m18666e(C9729iF0 c9729iF0) {
        int i;
        AbstractC7742Ig0 abstractC7742Ig0M9332g;
        O90.m5968f(c9729iF0, "proto");
        int i2 = 1;
        if ((c9729iF0.f28982c & 1) == 1) {
            i = c9729iF0.f28983d;
        } else {
            int i3 = c9729iF0.f28984e;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        int i4 = i;
        InterfaceC0510I5 interfaceC0510I5M18663b = m18663b(c9729iF0, i4, 1);
        boolean zM18989p = c9729iF0.m18989p();
        InterfaceC0510I5 interfaceC0510I5 = S20.f10539b;
        C1361Vd c1361Vd = this.f28057a;
        InterfaceC0510I5 c7192yI = (zM18989p || (c9729iF0.f28982c & 64) == 64) ? new C7192yI(((C7129xI) c1361Vd.f12662c).f45518a, new C9035cq0(this, c9729iF0, i2, 1)) : interfaceC0510I5;
        C0664KX c0664kxM25154g = AbstractC6940uI.m25154g((InterfaceC0140CD) c1361Vd.f12664e);
        int i5 = c9729iF0.f28985f;
        InterfaceC8392Ut0 interfaceC8392Ut0 = (InterfaceC8392Ut0) c1361Vd.f12663d;
        InterfaceC0510I5 interfaceC0510I52 = c7192yI;
        C1277UI c1277ui = new C1277UI((InterfaceC0140CD) c1361Vd.f12664e, null, interfaceC0510I5M18663b, CB1.m1002b(interfaceC8392Ut0, c9729iF0.f28985f), YM1.m9270b((EnumC9857jF0) AbstractC1605ZV.f14940p.m9059c(i4)), c9729iF0, (InterfaceC8392Ut0) c1361Vd.f12663d, (C10226m71) c1361Vd.f12661b, c0664kxM25154g.m4655c(CB1.m1002b(interfaceC8392Ut0, i5)).equals(AbstractC9458g71.f27576a) ? C7383Bi1.f979b : (C7383Bi1) c1361Vd.f12665f, (C10673pd0) c1361Vd.f12660a, null);
        List list = c9729iF0.f28988i;
        O90.m5967e(list, "getTypeParameterList(...)");
        C1361Vd c1361VdM8517b = c1361Vd.m8517b(c1277ui, list, (InterfaceC8392Ut0) c1361Vd.f12663d, (C10226m71) c1361Vd.f12661b, (C7383Bi1) c1361Vd.f12665f, (AbstractC6902th) c1361Vd.f12666g);
        C10226m71 c10226m71 = (C10226m71) c1361Vd.f12661b;
        AF0 af0M9723c = AbstractC8717aN1.m9723c(c9729iF0, c10226m71);
        C8569Yd1 c8569Yd1 = (C8569Yd1) c1361VdM8517b.f12667h;
        C10937rh0 c10937rh0M2348h = (af0M9723c == null || (abstractC7742Ig0M9332g = c8569Yd1.m9332g(af0M9723c)) == null) ? null : EZ1.m2348h(c1277ui, abstractC7742Ig0M9332g, interfaceC0510I52);
        InterfaceC0140CD interfaceC0140CD = (InterfaceC0140CD) c1361Vd.f12664e;
        InterfaceC6976us interfaceC6976us = interfaceC0140CD instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0140CD : null;
        C10937rh0 c10937rh0Mo1489a1 = interfaceC6976us != null ? interfaceC6976us.mo1489a1() : null;
        O90.m5968f(c10226m71, "typeTable");
        List list2 = c9729iF0.f28991l;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List list3 = c9729iF0.f28992m;
            O90.m5967e(list3, "getContextReceiverTypeIdList(...)");
            List<Integer> list4 = list3;
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list4));
            for (Integer num : list4) {
                O90.m5965c(num);
                arrayList.add(c10226m71.m22681h(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i6 = 0;
        for (Object obj : list2) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            C10937rh0 c10937rh0M2342b = EZ1.m2342b(c1277ui, c8569Yd1.m9332g((AF0) obj), null, interfaceC0510I5, i6);
            if (c10937rh0M2342b != null) {
                arrayList2.add(c10937rh0M2342b);
            }
            i6 = i7;
        }
        List listM9329b = c8569Yd1.m9329b();
        List list5 = c9729iF0.f28994o;
        O90.m5967e(list5, "getValueParameterList(...)");
        c1277ui.mo7857M1(c10937rh0M2348h, c10937rh0Mo1489a1, arrayList2, listM9329b, ((C9547gq0) c1361VdM8517b.f12668i).m18668g(list5, c9729iF0, 1), c8569Yd1.m9332g(AbstractC8717aN1.m9724d(c9729iF0, c10226m71)), C6914tt.m25026u((EnumC9985kF0) AbstractC1605ZV.f14929e.m9059c(i4)), YM1.m9269a((OF0) AbstractC1605ZV.f14928d.m9059c(i4)), C0842NN.f7735a);
        c1277ui.f1438n = AbstractC1605ZV.f14941q.m8799c(i4).booleanValue();
        c1277ui.f1439o = AbstractC1605ZV.f14942r.m8799c(i4).booleanValue();
        c1277ui.f1440p = AbstractC1605ZV.f14945u.m8799c(i4).booleanValue();
        c1277ui.f1441q = AbstractC1605ZV.f14943s.m8799c(i4).booleanValue();
        c1277ui.f1442r = AbstractC1605ZV.f14944t.m8799c(i4).booleanValue();
        c1277ui.f1446v = AbstractC1605ZV.f14946v.m8799c(i4).booleanValue();
        c1277ui.f1443s = AbstractC1605ZV.f14947w.m8799c(i4).booleanValue();
        c1277ui.f1447w = !AbstractC1605ZV.f14948x.m8799c(i4).booleanValue();
        ((C7129xI) c1361Vd.f12662c).f45530m.getClass();
        O90.m5968f(c10226m71, "typeTable");
        return c1277ui;
    }

    /* renamed from: f */
    public final C1214TI m18667f(C10753qF0 c10753qF0) {
        int i;
        C10753qF0 c10753qF02;
        C9547gq0 c9547gq0;
        InterfaceC0510I5 c7192yI;
        C1361Vd c1361Vd;
        AF0 af0M22681h;
        C1416WV c1416wv;
        C1416WV c1416wv2;
        C1479XV c1479xv;
        C1479XV c1479xv2;
        C10753qF0 c10753qF03;
        C1361Vd c1361Vd2;
        C1416WV c1416wv3;
        FE0 fe0;
        C10753qF0 c10753qF04;
        FE0 fe02;
        C9547gq0 c9547gq02;
        JE0 je0M2344d;
        FE0 fe0M2343c;
        AbstractC7742Ig0 abstractC7742Ig0M9332g;
        O90.m5968f(c10753qF0, "proto");
        if ((c10753qF0.f40687c & 1) == 1) {
            i = c10753qF0.f40688d;
        } else {
            int i2 = c10753qF0.f40689e;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        int i3 = i;
        C1361Vd c1361Vd3 = this.f28057a;
        C1214TI c1214ti = new C1214TI((InterfaceC0140CD) c1361Vd3.f12664e, null, m18663b(c10753qF0, i3, 2), C6914tt.m25026u((EnumC9985kF0) AbstractC1605ZV.f14929e.m9059c(i3)), YM1.m9269a((OF0) AbstractC1605ZV.f14928d.m9059c(i3)), AbstractC1605ZV.f14949y.m8799c(i3).booleanValue(), CB1.m1002b((InterfaceC8392Ut0) c1361Vd3.f12663d, c10753qF0.f40690f), YM1.m9270b((EnumC9857jF0) AbstractC1605ZV.f14940p.m9059c(i3)), AbstractC1605ZV.f14913C.m8799c(i3).booleanValue(), AbstractC1605ZV.f14912B.m8799c(i3).booleanValue(), AbstractC1605ZV.f14915E.m8799c(i3).booleanValue(), AbstractC1605ZV.f14916F.m8799c(i3).booleanValue(), AbstractC1605ZV.f14917G.m8799c(i3).booleanValue(), c10753qF0, (InterfaceC8392Ut0) c1361Vd3.f12663d, (C10226m71) c1361Vd3.f12661b, (C7383Bi1) c1361Vd3.f12665f, (C10673pd0) c1361Vd3.f12660a);
        List list = c10753qF0.f40693i;
        O90.m5967e(list, "getTypeParameterList(...)");
        C1361Vd c1361VdM8517b = c1361Vd3.m8517b(c1214ti, list, (InterfaceC8392Ut0) c1361Vd3.f12663d, (C10226m71) c1361Vd3.f12661b, (C7383Bi1) c1361Vd3.f12665f, (AbstractC6902th) c1361Vd3.f12666g);
        boolean zBooleanValue = AbstractC1605ZV.f14950z.m8799c(i3).booleanValue();
        C0447H5 c0447h5 = S20.f10539b;
        int i4 = 3;
        if (zBooleanValue && (c10753qF0.m23957p() || (c10753qF0.f40687c & 64) == 64)) {
            Z41 z41 = ((C7129xI) c1361Vd3.f12662c).f45518a;
            c10753qF02 = c10753qF0;
            c9547gq0 = this;
            c7192yI = new C7192yI(z41, new C9035cq0(c9547gq0, c10753qF02, i4, 1));
        } else {
            c10753qF02 = c10753qF0;
            c9547gq0 = this;
            c7192yI = c0447h5;
        }
        C10226m71 c10226m71 = (C10226m71) c1361Vd3.f12661b;
        AF0 af0M9725e = AbstractC8717aN1.m9725e(c10753qF02, c10226m71);
        C8569Yd1 c8569Yd1 = (C8569Yd1) c1361VdM8517b.f12667h;
        AbstractC7742Ig0 abstractC7742Ig0M9332g2 = c8569Yd1.m9332g(af0M9725e);
        List listM9329b = c8569Yd1.m9329b();
        InterfaceC0140CD interfaceC0140CD = (InterfaceC0140CD) c1361Vd3.f12664e;
        InterfaceC6976us interfaceC6976us = interfaceC0140CD instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0140CD : null;
        C10937rh0 c10937rh0Mo1489a1 = interfaceC6976us != null ? interfaceC6976us.mo1489a1() : null;
        O90.m5968f(c10226m71, "typeTable");
        if (c10753qF0.m23957p()) {
            af0M22681h = c10753qF02.f40694j;
            c1361Vd = c1361Vd3;
        } else {
            c1361Vd = c1361Vd3;
            af0M22681h = (c10753qF02.f40687c & 64) == 64 ? c10226m71.m22681h(c10753qF02.f40695k) : null;
        }
        C10937rh0 c10937rh0M2348h = (af0M22681h == null || (abstractC7742Ig0M9332g = c8569Yd1.m9332g(af0M22681h)) == null) ? null : EZ1.m2348h(c1214ti, abstractC7742Ig0M9332g, c7192yI);
        O90.m5968f(c10226m71, "typeTable");
        List list2 = c10753qF02.f40696l;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List list3 = c10753qF02.f40697m;
            O90.m5967e(list3, "getContextReceiverTypeIdList(...)");
            List<Integer> list4 = list3;
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list4));
            for (Integer num : list4) {
                O90.m5965c(num);
                arrayList.add(c10226m71.m22681h(num.intValue()));
            }
            list2 = arrayList;
        }
        List list5 = list2;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list5));
        Iterator it = list5.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            arrayList2.add(EZ1.m2342b(c1214ti, c8569Yd1.m9332g((AF0) next), null, c0447h5, i5));
            it = it;
            i5 = i6;
        }
        c1214ti.m2085F1(abstractC7742Ig0M9332g2, listM9329b, c10937rh0Mo1489a1, c10937rh0M2348h, arrayList2);
        C1416WV c1416wv4 = AbstractC1605ZV.f14927c;
        boolean zBooleanValue2 = c1416wv4.m8799c(i3).booleanValue();
        C1479XV c1479xv3 = AbstractC1605ZV.f14928d;
        OF0 of0 = (OF0) c1479xv3.m9059c(i3);
        C1479XV c1479xv4 = AbstractC1605ZV.f14929e;
        EnumC9985kF0 enumC9985kF0 = (EnumC9985kF0) c1479xv4.m9059c(i3);
        if (of0 == null) {
            AbstractC1605ZV.m9537a(10);
            throw null;
        }
        if (enumC9985kF0 == null) {
            AbstractC1605ZV.m9537a(11);
            throw null;
        }
        int iMo2106a = (zBooleanValue2 ? 1 << c1416wv4.f14322a : 0) | (enumC9985kF0.mo2106a() << c1479xv4.f14322a) | (of0.mo2106a() << c1479xv3.f14322a);
        C1416WV c1416wv5 = AbstractC1605ZV.f14921K;
        c1416wv5.getClass();
        C1416WV c1416wv6 = AbstractC1605ZV.f14922L;
        c1416wv6.getClass();
        C1416WV c1416wv7 = AbstractC1605ZV.f14923M;
        c1416wv7.getClass();
        C7408Bv0 c7408Bv0 = W21.f12940O0;
        if (zBooleanValue) {
            int i7 = (c10753qF02.f40687c & 256) == 256 ? c10753qF02.f40700p : iMo2106a;
            boolean zBooleanValue3 = c1416wv5.m8799c(i7).booleanValue();
            boolean zBooleanValue4 = c1416wv6.m8799c(i7).booleanValue();
            boolean zBooleanValue5 = c1416wv7.m8799c(i7).booleanValue();
            InterfaceC0510I5 interfaceC0510I5M18663b = c9547gq0.m18663b(c10753qF02, i7, 3);
            if (zBooleanValue3) {
                c1416wv = c1416wv7;
                c1416wv2 = c1416wv5;
                c1479xv = c1479xv4;
                c1361Vd2 = c1361VdM8517b;
                c1416wv3 = c1416wv6;
                c1479xv2 = c1479xv3;
                c10753qF03 = c10753qF02;
                fe0M2343c = new FE0(c1214ti, interfaceC0510I5M18663b, C6914tt.m25026u((EnumC9985kF0) c1479xv4.m9059c(i7)), YM1.m9269a((OF0) c1479xv3.m9059c(i7)), !zBooleanValue3, zBooleanValue4, zBooleanValue5, c1214ti.mo116l(), null, c7408Bv0);
            } else {
                c1416wv = c1416wv7;
                c1416wv2 = c1416wv5;
                c1479xv = c1479xv4;
                c1479xv2 = c1479xv3;
                c10753qF03 = c10753qF02;
                c1361Vd2 = c1361VdM8517b;
                c1416wv3 = c1416wv6;
                fe0M2343c = EZ1.m2343c(c1214ti, interfaceC0510I5M18663b);
            }
            fe0M2343c.m2559B1(c1214ti.getReturnType());
            fe0 = fe0M2343c;
        } else {
            c1416wv = c1416wv7;
            c1416wv2 = c1416wv5;
            c1479xv = c1479xv4;
            c1479xv2 = c1479xv3;
            c10753qF03 = c10753qF02;
            c1361Vd2 = c1361VdM8517b;
            c1416wv3 = c1416wv6;
            fe0 = null;
        }
        if (AbstractC1605ZV.f14911A.m8799c(i3).booleanValue()) {
            int i8 = (c10753qF03.f40687c & 512) == 512 ? c10753qF03.f40701q : iMo2106a;
            boolean zBooleanValue6 = c1416wv2.m8799c(i8).booleanValue();
            boolean zBooleanValue7 = c1416wv3.m8799c(i8).booleanValue();
            boolean zBooleanValue8 = c1416wv.m8799c(i8).booleanValue();
            c10753qF04 = c10753qF03;
            c9547gq02 = this;
            InterfaceC0510I5 interfaceC0510I5M18663b2 = c9547gq02.m18663b(c10753qF04, i8, 4);
            if (zBooleanValue6) {
                fe02 = fe0;
                JE0 je0 = new JE0(c1214ti, interfaceC0510I5M18663b2, C6914tt.m25026u((EnumC9985kF0) c1479xv.m9059c(i8)), YM1.m9269a((OF0) c1479xv2.m9059c(i8)), !zBooleanValue6, zBooleanValue7, zBooleanValue8, c1214ti.mo116l(), null, c7408Bv0);
                C1361Vd c1361Vd4 = c1361Vd2;
                C8473Wh1 c8473Wh1 = (C8473Wh1) AbstractC7167xu.m25972R(((C9547gq0) c1361Vd4.m8517b(je0, C0779MN.f7117a, (InterfaceC8392Ut0) c1361Vd4.f12663d, (C10226m71) c1361Vd4.f12661b, (C7383Bi1) c1361Vd4.f12665f, (AbstractC6902th) c1361Vd4.f12666g).f12668i).m18668g(AbstractC7230yu.m26274e(c10753qF04.f40699o), c10753qF04, 4));
                if (c8473Wh1 == null) {
                    JE0.m4255b1(6);
                    throw null;
                }
                je0.f5400n = c8473Wh1;
                je0M2344d = je0;
            } else {
                fe02 = fe0;
                je0M2344d = EZ1.m2344d(c1214ti, interfaceC0510I5M18663b2);
            }
        } else {
            c10753qF04 = c10753qF03;
            fe02 = fe0;
            c9547gq02 = this;
            je0M2344d = null;
        }
        if (AbstractC1605ZV.f14914D.m8799c(i3).booleanValue()) {
            c1214ti.m2083D1(null, new C9291eq0(c9547gq02, c10753qF04, c1214ti, 1));
        }
        InterfaceC0140CD interfaceC0140CD2 = (InterfaceC0140CD) c1361Vd.f12664e;
        InterfaceC6976us interfaceC6976us2 = interfaceC0140CD2 instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0140CD2 : null;
        if ((interfaceC6976us2 != null ? interfaceC6976us2.mo1436l() : null) == EnumC0118Bs.f1064e) {
            c1214ti.m2083D1(null, new C9291eq0(c9547gq02, c10753qF04, c1214ti, 3));
        }
        c1214ti.m2082C1(fe02, je0M2344d, new C3930dT(c9547gq02.m18664c(c10753qF04, false)), new C3930dT(c9547gq02.m18664c(c10753qF04, true)));
        return c1214ti;
    }

    /* renamed from: g */
    public final List m18668g(List list, AbstractC11487w00 abstractC11487w00, int i) {
        C1361Vd c1361Vd = this.f28057a;
        InterfaceC0140CD interfaceC0140CD = (InterfaceC0140CD) c1361Vd.f12664e;
        O90.m5966d(interfaceC0140CD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC7032vl interfaceC7032vl = (InterfaceC7032vl) interfaceC0140CD;
        InterfaceC0140CD interfaceC0140CDMo423i = interfaceC7032vl.mo423i();
        O90.m5967e(interfaceC0140CDMo423i, "getContainingDeclaration(...)");
        AbstractC7598Fm0 abstractC7598Fm0M18662a = m18662a(interfaceC0140CDMo423i);
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            IF0 if0 = (IF0) obj;
            int i4 = (if0.f4863c & 1) == 1 ? if0.f4864d : 0;
            InterfaceC0510I5 c7928Lv0 = (abstractC7598Fm0M18662a == null || !AbstractC1605ZV.f14927c.m8799c(i4).booleanValue()) ? S20.f10539b : new C7928Lv0(((C7129xI) c1361Vd.f12662c).f45518a, new C9419fq0(this, abstractC7598Fm0M18662a, abstractC11487w00, i, i2, if0));
            C8340Tt0 c8340Tt0M1002b = CB1.m1002b((InterfaceC8392Ut0) c1361Vd.f12663d, if0.f4865e);
            C10226m71 c10226m71 = (C10226m71) c1361Vd.f12661b;
            AF0 af0M9726i = AbstractC8717aN1.m9726i(if0, c10226m71);
            C8569Yd1 c8569Yd1 = (C8569Yd1) c1361Vd.f12667h;
            AbstractC7742Ig0 abstractC7742Ig0M9332g = c8569Yd1.m9332g(af0M9726i);
            boolean zBooleanValue = AbstractC1605ZV.f14918H.m8799c(i4).booleanValue();
            boolean zBooleanValue2 = AbstractC1605ZV.f14919I.m8799c(i4).booleanValue();
            boolean zBooleanValue3 = AbstractC1605ZV.f14920J.m8799c(i4).booleanValue();
            O90.m5968f(c10226m71, "typeTable");
            int i5 = if0.f4863c;
            AF0 af0M22681h = (i5 & 16) == 16 ? if0.f4868h : (i5 & 32) == 32 ? c10226m71.m22681h(if0.f4869i) : null;
            AbstractC7742Ig0 abstractC7742Ig0M9332g2 = af0M22681h != null ? c8569Yd1.m9332g(af0M22681h) : null;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C8473Wh1(interfaceC7032vl, null, i2, c7928Lv0, c8340Tt0M1002b, abstractC7742Ig0M9332g, zBooleanValue, zBooleanValue2, zBooleanValue3, abstractC7742Ig0M9332g2, W21.f12940O0));
            arrayList = arrayList2;
            i2 = i3;
        }
        return AbstractC7167xu.m25982b0(arrayList);
    }
}
