package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: HI */
/* loaded from: classes2.dex */
public final class C0460HI extends AbstractC0189D implements InterfaceC0140CD {

    /* renamed from: e */
    public final TE0 f4204e;

    /* renamed from: f */
    public final AbstractC6902th f4205f;

    /* renamed from: g */
    public final W21 f4206g;

    /* renamed from: h */
    public final C0055As f4207h;

    /* renamed from: i */
    public final EnumC10575os0 f4208i;

    /* renamed from: j */
    public final C7003vI f4209j;

    /* renamed from: k */
    public final EnumC0118Bs f4210k;

    /* renamed from: l */
    public final C1361Vd f4211l;

    /* renamed from: m */
    public final AbstractC10187lq0 f4212m;

    /* renamed from: n */
    public final C0397GI f4213n;

    /* renamed from: o */
    public final KV0 f4214o;

    /* renamed from: p */
    public final C10919rY0 f4215p;

    /* renamed from: q */
    public final InterfaceC0140CD f4216q;

    /* renamed from: r */
    public final C8374Uk0 f4217r;

    /* renamed from: s */
    public final C8426Vk0 f4218s;

    /* renamed from: t */
    public final C8426Vk0 f4219t;

    /* renamed from: u */
    public final C8374Uk0 f4220u;

    /* renamed from: v */
    public final PF0 f4221v;

    /* renamed from: w */
    public final InterfaceC0510I5 f4222w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0460HI(C1361Vd c1361Vd, TE0 te0, InterfaceC8392Ut0 interfaceC8392Ut0, AbstractC6902th abstractC6902th, W21 w21) {
        EnumC0118Bs enumC0118Bs;
        AbstractC10187lq0 l41;
        super(((C7129xI) c1361Vd.f12662c).f45518a, CB1.m1001a(interfaceC8392Ut0, te0.f11232e).m365i());
        O90.m5968f(c1361Vd, "outerContext");
        O90.m5968f(te0, "classProto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(w21, "sourceElement");
        this.f4204e = te0;
        this.f4205f = abstractC6902th;
        this.f4206g = w21;
        this.f4207h = CB1.m1001a(interfaceC8392Ut0, te0.f11232e);
        this.f4208i = C6914tt.m25026u((EnumC9985kF0) AbstractC1605ZV.f14929e.m9059c(te0.f11231d));
        this.f4209j = YM1.m9269a((OF0) AbstractC1605ZV.f14928d.m9059c(te0.f11231d));
        SE0 se0 = (SE0) AbstractC1605ZV.f14930f.m9059c(te0.f11231d);
        switch (se0 == null ? -1 : UF0.f11707b[se0.ordinal()]) {
            case 1:
                enumC0118Bs = EnumC0118Bs.f1060a;
                break;
            case 2:
                enumC0118Bs = EnumC0118Bs.f1061b;
                break;
            case 3:
                enumC0118Bs = EnumC0118Bs.f1062c;
                break;
            case 4:
                enumC0118Bs = EnumC0118Bs.f1063d;
                break;
            case 5:
                enumC0118Bs = EnumC0118Bs.f1064e;
                break;
            case 6:
            case 7:
                enumC0118Bs = EnumC0118Bs.f1065f;
                break;
            default:
                enumC0118Bs = EnumC0118Bs.f1060a;
                break;
        }
        EnumC0118Bs enumC0118Bs2 = enumC0118Bs;
        this.f4210k = enumC0118Bs2;
        List list = te0.f11234g;
        O90.m5967e(list, "getTypeParameterList(...)");
        GF0 gf0 = te0.f11224E;
        O90.m5967e(gf0, "getTypeTable(...)");
        C10226m71 c10226m71 = new C10226m71(gf0);
        C7383Bi1 c7383Bi1 = C7383Bi1.f979b;
        NF0 nf0 = te0.f11226G;
        O90.m5967e(nf0, "getVersionRequirementTable(...)");
        C1361Vd c1361VdM8517b = c1361Vd.m8517b(this, list, interfaceC8392Ut0, c10226m71, AbstractC11616x02.m25733a(nf0), abstractC6902th);
        this.f4211l = c1361VdM8517b;
        EnumC0118Bs enumC0118Bs3 = EnumC0118Bs.f1062c;
        C7129xI c7129xI = (C7129xI) c1361VdM8517b.f12662c;
        if (enumC0118Bs2 == enumC0118Bs3) {
            l41 = new L41(c7129xI.f45518a, this, AbstractC1605ZV.f14937m.m8799c(te0.f11231d).booleanValue() || O90.m5963a(c7129xI.f45536s.mo5667x(), Boolean.TRUE));
        } else {
            l41 = C9931jq0.f35419b;
        }
        this.f4212m = l41;
        this.f4213n = new C0397GI(this);
        C6914tt c6914tt = KV0.f6128d;
        Z41 z41 = c7129xI.f45518a;
        ((C11604wv0) c7129xI.f45534q).getClass();
        C1367Vj c1367Vj = new C1367Vj(1, this, 3);
        c6914tt.getClass();
        O90.m5968f(z41, "storageManager");
        this.f4214o = new KV0(this, z41, c1367Vj);
        this.f4215p = enumC0118Bs2 == enumC0118Bs3 ? new C10919rY0(this) : null;
        InterfaceC0140CD interfaceC0140CD = (InterfaceC0140CD) c1361Vd.f12664e;
        this.f4216q = interfaceC0140CD;
        C0334FI c0334fi = new C0334FI(this, 4);
        Z41 z412 = c7129xI.f45518a;
        C8582Yk0 c8582Yk0 = (C8582Yk0) z412;
        c8582Yk0.getClass();
        this.f4217r = new C8374Uk0(c8582Yk0, c0334fi);
        C0334FI c0334fi2 = new C0334FI(this, 3);
        C8582Yk0 c8582Yk02 = (C8582Yk0) z412;
        c8582Yk02.getClass();
        this.f4218s = new C8426Vk0(c8582Yk02, c0334fi2);
        C0334FI c0334fi3 = new C0334FI(this, 2);
        C8582Yk0 c8582Yk03 = (C8582Yk0) z412;
        c8582Yk03.getClass();
        new C8374Uk0(c8582Yk03, c0334fi3);
        C0334FI c0334fi4 = new C0334FI(this, 5);
        C8582Yk0 c8582Yk04 = (C8582Yk0) z412;
        c8582Yk04.getClass();
        this.f4219t = new C8426Vk0(c8582Yk04, c0334fi4);
        C0334FI c0334fi5 = new C0334FI(this, 6);
        C8582Yk0 c8582Yk05 = (C8582Yk0) z412;
        c8582Yk05.getClass();
        this.f4220u = new C8374Uk0(c8582Yk05, c0334fi5);
        C0460HI c0460hi = interfaceC0140CD instanceof C0460HI ? (C0460HI) interfaceC0140CD : null;
        this.f4221v = new PF0(te0, (InterfaceC8392Ut0) c1361VdM8517b.f12663d, (C10226m71) c1361VdM8517b.f12661b, w21, c0460hi != null ? c0460hi.f4221v : null);
        this.f4222w = !AbstractC1605ZV.f14927c.m8799c(te0.f11231d).booleanValue() ? S20.f10539b : new C7928Lv0(z412, new C0334FI(this, 1));
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: A */
    public final boolean mo1427A() {
        return AbstractC1605ZV.f14936l.m8799c(this.f4204e.f11231d).booleanValue();
    }

    /* renamed from: B */
    public final X01 m3342B(C8340Tt0 c8340Tt0) {
        Iterator it = m3343u().mo1771e(c8340Tt0, EnumC11985zv0.f47100g).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((CE0) next).mo121t0() == null) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        CE0 ce0 = (CE0) obj;
        return (X01) (ce0 != null ? ce0.getType() : null);
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: J */
    public final Collection mo1428J() {
        return (Collection) this.f4219t.invoke();
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: J0 */
    public final AbstractC8057Oh1 mo1429J0() {
        return (AbstractC8057Oh1) this.f4220u.invoke();
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: K */
    public final boolean mo1430K() {
        return AbstractC1605ZV.f14935k.m8799c(this.f4204e.f11231d).booleanValue() && this.f4205f.m24967a(1, 4, 2);
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: M */
    public final boolean mo111M() {
        return AbstractC1605ZV.f14934j.m8799c(this.f4204e.f11231d).booleanValue();
    }

    @Override // p000.InterfaceC0936Os
    /* renamed from: N */
    public final boolean mo1431N() {
        return AbstractC1605ZV.f14931g.m8799c(this.f4204e.f11231d).booleanValue();
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: Q0 */
    public final boolean mo112Q0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // p000.AbstractC0189D, p000.InterfaceC6976us
    /* renamed from: S0 */
    public final List mo1488S0() {
        C1361Vd c1361Vd = this.f4211l;
        C10226m71 c10226m71 = (C10226m71) c1361Vd.f12661b;
        TE0 te0 = this.f4204e;
        O90.m5968f(te0, "<this>");
        O90.m5968f(c10226m71, "typeTable");
        List list = te0.f11240m;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = te0.f11241n;
            O90.m5967e(list2, "getContextReceiverTypeIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(AbstractC7293zu.m26586k(list3));
            for (Integer num : list3) {
                O90.m5965c(num);
                arrayList.add(c10226m71.m22681h(num.intValue()));
            }
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C10937rh0(mo1489a1(), new C0565Iy(this, ((C8569Yd1) c1361Vd.f12667h).m9332g((AF0) it.next()), (C8340Tt0) null), S20.f10539b));
        }
        return arrayList2;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: V */
    public final C6707qs mo1432V() {
        return (C6707qs) this.f4217r.invoke();
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: W */
    public final InterfaceC10059kq0 mo1433W() {
        return this.f4212m;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: X0 */
    public final boolean mo1434X0() {
        return AbstractC1605ZV.f14932h.m8799c(this.f4204e.f11231d).booleanValue();
    }

    @Override // p000.InterfaceC0266ED
    /* renamed from: e */
    public final W21 mo422e() {
        return this.f4206g;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC8902bq0
    /* renamed from: f */
    public final EnumC10575os0 mo115f() {
        return this.f4208i;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: g */
    public final Collection mo1435g() {
        return (Collection) this.f4218s.invoke();
    }

    @Override // p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        return this.f4222w;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0455HD, p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        return this.f4209j;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: i */
    public final InterfaceC0140CD mo423i() {
        return this.f4216q;
    }

    @Override // p000.InterfaceC8902bq0
    public final boolean isExternal() {
        return AbstractC1605ZV.f14933i.m8799c(this.f4204e.f11231d).booleanValue();
    }

    @Override // p000.InterfaceC6976us
    public final boolean isInline() {
        if (AbstractC1605ZV.f14935k.m8799c(this.f4204e.f11231d).booleanValue()) {
            AbstractC6902th abstractC6902th = this.f4205f;
            int i = abstractC6902th.f43217b;
            if (i < 1) {
                return true;
            }
            if (i <= 1) {
                int i2 = abstractC6902th.f43218c;
                if (i2 < 4) {
                    return true;
                }
                if (i2 <= 4 && abstractC6902th.f43219d <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: l */
    public final EnumC0118Bs mo1436l() {
        return this.f4210k;
    }

    @Override // p000.AbstractC11725xs0
    /* renamed from: n */
    public final InterfaceC10059kq0 mo1437n(C8054Og0 c8054Og0) {
        KV0 kv0 = this.f4214o;
        AbstractC6940uI.m25157j(kv0.f6130a);
        return (InterfaceC10059kq0) WS1.m8763b(kv0.f6132c, KV0.f6129e[0]);
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0936Os
    /* renamed from: o */
    public final List mo1438o() {
        return ((C8569Yd1) this.f4211l.f12667h).m9329b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(mo111M() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    /* renamed from: u */
    public final C0271EI m3343u() {
        ((C11604wv0) ((C7129xI) this.f4211l.f12662c).f45534q).getClass();
        KV0 kv0 = this.f4214o;
        AbstractC6940uI.m25157j(kv0.f6130a);
        return (C0271EI) ((InterfaceC10059kq0) WS1.m8763b(kv0.f6132c, KV0.f6129e[0]));
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: v */
    public final InterfaceC8101Pd1 mo1439v() {
        return this.f4213n;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: w */
    public final boolean mo1440w() {
        return AbstractC1605ZV.f14930f.m9059c(this.f4204e.f11231d) == SE0.COMPANION_OBJECT;
    }
}
