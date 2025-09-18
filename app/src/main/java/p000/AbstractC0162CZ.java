package p000;

import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: CZ */
/* loaded from: classes2.dex */
public abstract class AbstractC0162CZ extends AbstractC0329FD implements InterfaceC0036AZ {

    /* renamed from: A */
    public final InterfaceC0036AZ f1426A;

    /* renamed from: B */
    public final int f1427B;

    /* renamed from: C */
    public InterfaceC0036AZ f1428C;

    /* renamed from: D */
    public Map f1429D;

    /* renamed from: f */
    public List f1430f;

    /* renamed from: g */
    public List f1431g;

    /* renamed from: h */
    public AbstractC7742Ig0 f1432h;

    /* renamed from: i */
    public List f1433i;

    /* renamed from: j */
    public C10937rh0 f1434j;

    /* renamed from: k */
    public C10937rh0 f1435k;

    /* renamed from: l */
    public EnumC10575os0 f1436l;

    /* renamed from: m */
    public C7003vI f1437m;

    /* renamed from: n */
    public boolean f1438n;

    /* renamed from: o */
    public boolean f1439o;

    /* renamed from: p */
    public boolean f1440p;

    /* renamed from: q */
    public boolean f1441q;

    /* renamed from: r */
    public boolean f1442r;

    /* renamed from: s */
    public boolean f1443s;

    /* renamed from: t */
    public boolean f1444t;

    /* renamed from: u */
    public boolean f1445u;

    /* renamed from: v */
    public boolean f1446v;

    /* renamed from: w */
    public boolean f1447w;

    /* renamed from: x */
    public boolean f1448x;

    /* renamed from: y */
    public Collection f1449y;

    /* renamed from: z */
    public volatile C6526o1 f1450z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0162CZ(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21) {
        super(interfaceC0140CD, interfaceC0510I5, c8340Tt0, w21);
        if (interfaceC0140CD == null) {
            m1213b1(0);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m1213b1(1);
            throw null;
        }
        if (c8340Tt0 == null) {
            m1213b1(2);
            throw null;
        }
        if (i == 0) {
            m1213b1(3);
            throw null;
        }
        if (w21 == null) {
            m1213b1(4);
            throw null;
        }
        this.f1437m = AbstractC7066wI.f44768i;
        this.f1438n = false;
        this.f1439o = false;
        this.f1440p = false;
        this.f1441q = false;
        this.f1442r = false;
        this.f1443s = false;
        this.f1444t = false;
        this.f1445u = false;
        this.f1446v = false;
        this.f1447w = true;
        this.f1448x = false;
        this.f1449y = null;
        this.f1450z = null;
        this.f1428C = null;
        this.f1429D = null;
        this.f1426A = interfaceC0036AZ == null ? this : interfaceC0036AZ;
        this.f1427B = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [Wh1] */
    /* renamed from: C1 */
    public static ArrayList m1212C1(InterfaceC0036AZ interfaceC0036AZ, List list, C11571we1 c11571we1, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            m1213b1(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8473Wh1 c8473Wh1 = (C8473Wh1) it.next();
            C8473Wh1 c8473Wh12 = c8473Wh1;
            AbstractC7742Ig0 type = c8473Wh12.getType();
            EnumC9532gi1 enumC9532gi1 = EnumC9532gi1.f27948d;
            AbstractC7742Ig0 abstractC7742Ig0M25667i = c11571we1.m25667i(type, enumC9532gi1);
            AbstractC7742Ig0 abstractC7742Ig0 = c8473Wh1.f13327k;
            AbstractC7742Ig0 abstractC7742Ig0M25667i2 = abstractC7742Ig0 == null ? null : c11571we1.m25667i(abstractC7742Ig0, enumC9532gi1);
            if (abstractC7742Ig0M25667i == null) {
                return null;
            }
            if ((abstractC7742Ig0M25667i != c8473Wh12.getType() || abstractC7742Ig0 != abstractC7742Ig0M25667i2) && zArr != null) {
                zArr[0] = true;
            }
            C6463n1 c6463n1 = c8473Wh1 instanceof C8421Vh1 ? new C6463n1(2, (List) ((C8421Vh1) c8473Wh1).f12697m.getValue()) : null;
            C8473Wh1 c8473Wh13 = z ? null : c8473Wh1;
            InterfaceC0510I5 annotations = c8473Wh1.getAnnotations();
            C8340Tt0 name = c8473Wh1.getName();
            boolean zM8832z1 = c8473Wh1.m8832z1();
            W21 w21Mo422e = z2 ? c8473Wh1.mo422e() : W21.f12940O0;
            O90.m5968f(annotations, "annotations");
            O90.m5968f(name, "name");
            O90.m5968f(w21Mo422e, "source");
            int i = c8473Wh1.f13323g;
            boolean z3 = c8473Wh1.f13325i;
            boolean z4 = c8473Wh1.f13326j;
            arrayList.add(c6463n1 == null ? new C8473Wh1(interfaceC0036AZ, c8473Wh13, i, annotations, name, abstractC7742Ig0M25667i, zM8832z1, z3, z4, abstractC7742Ig0M25667i2, w21Mo422e) : new C8421Vh1(interfaceC0036AZ, c8473Wh13, i, annotations, name, abstractC7742Ig0M25667i, zM8832z1, z3, z4, abstractC7742Ig0M25667i2, w21Mo422e, c6463n1));
        }
        return arrayList;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m1213b1(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: A1 */
    public abstract AbstractC0162CZ mo148A1(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21);

    /* renamed from: B1 */
    public AbstractC0162CZ mo1214B1(C0099BZ c0099bz) {
        C10937rh0 c10937rh0;
        C10937rh0 c10937rh02;
        AbstractC7742Ig0 abstractC7742Ig0M25667i;
        if (c0099bz == null) {
            m1213b1(25);
            throw null;
        }
        boolean[] zArr = new boolean[1];
        InterfaceC0510I5 interfaceC0510I5M24916b = c0099bz.f898s != null ? AbstractC11154tN1.m24916b(getAnnotations(), c0099bz.f898s) : getAnnotations();
        InterfaceC0140CD interfaceC0140CD = c0099bz.f881b;
        InterfaceC0036AZ interfaceC0036AZ = c0099bz.f884e;
        int i = c0099bz.f885f;
        C8340Tt0 c8340Tt0 = c0099bz.f891l;
        W21 w21Mo422e = c0099bz.f894o ? ((AbstractC0329FD) (interfaceC0036AZ != null ? interfaceC0036AZ : mo2089x1())).mo422e() : W21.f12940O0;
        if (w21Mo422e == null) {
            m1213b1(27);
            throw null;
        }
        AbstractC0162CZ abstractC0162CZMo148A1 = mo148A1(i, interfaceC0510I5M24916b, interfaceC0140CD, interfaceC0036AZ, c8340Tt0, w21Mo422e);
        List typeParameters = c0099bz.f897r;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C11571we1 c11571we1M3512h = HZ1.m3512h(typeParameters, c0099bz.f880a, abstractC0162CZMo148A1, arrayList, zArr);
        if (c11571we1M3512h == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!c0099bz.f887h.isEmpty()) {
            int i2 = 0;
            for (C10937rh0 c10937rh03 : c0099bz.f887h) {
                AbstractC7742Ig0 abstractC7742Ig0M25667i2 = c11571we1M3512h.m25667i(c10937rh03.getType(), EnumC9532gi1.f27948d);
                if (abstractC7742Ig0M25667i2 == null) {
                    return null;
                }
                int i3 = i2 + 1;
                arrayList2.add(EZ1.m2342b(abstractC0162CZMo148A1, abstractC7742Ig0M25667i2, ((C0565Iy) c10937rh03.m24452y1()).m4089w1(), c10937rh03.getAnnotations(), i2));
                zArr[0] = zArr[0] | (abstractC7742Ig0M25667i2 != c10937rh03.getType());
                i2 = i3;
            }
        }
        C10937rh0 c10937rh04 = c0099bz.f888i;
        if (c10937rh04 != null) {
            AbstractC7742Ig0 abstractC7742Ig0M25667i3 = c11571we1M3512h.m25667i(c10937rh04.getType(), EnumC9532gi1.f27948d);
            if (abstractC7742Ig0M25667i3 == null) {
                return null;
            }
            c0099bz.f888i.m24452y1();
            C10937rh0 c10937rh05 = new C10937rh0(abstractC0162CZMo148A1, new C7201yR(abstractC0162CZMo148A1, abstractC7742Ig0M25667i3), c0099bz.f888i.getAnnotations());
            zArr[0] = (abstractC7742Ig0M25667i3 != c0099bz.f888i.getType()) | zArr[0];
            c10937rh0 = c10937rh05;
        } else {
            c10937rh0 = null;
        }
        C10937rh0 c10937rh06 = c0099bz.f889j;
        if (c10937rh06 != null) {
            C10937rh0 c10937rh0Mo114b = c10937rh06.mo114b(c11571we1M3512h);
            if (c10937rh0Mo114b == null) {
                return null;
            }
            zArr[0] = zArr[0] | (c10937rh0Mo114b != c0099bz.f889j);
            c10937rh02 = c10937rh0Mo114b;
        } else {
            c10937rh02 = null;
        }
        ArrayList arrayListM1212C1 = m1212C1(abstractC0162CZMo148A1, c0099bz.f886g, c11571we1M3512h, c0099bz.f895p, c0099bz.f894o, zArr);
        if (arrayListM1212C1 == null || (abstractC7742Ig0M25667i = c11571we1M3512h.m25667i(c0099bz.f890k, EnumC9532gi1.f27949e)) == null) {
            return null;
        }
        boolean z = zArr[0] | (abstractC7742Ig0M25667i != c0099bz.f890k);
        zArr[0] = z;
        if (!z && c0099bz.f902w) {
            return this;
        }
        abstractC0162CZMo148A1.mo1215D1(c10937rh0, c10937rh02, arrayList2, arrayList, arrayListM1212C1, abstractC7742Ig0M25667i, c0099bz.f882c, c0099bz.f883d);
        abstractC0162CZMo148A1.f1438n = this.f1438n;
        abstractC0162CZMo148A1.f1439o = this.f1439o;
        abstractC0162CZMo148A1.f1440p = this.f1440p;
        abstractC0162CZMo148A1.f1441q = this.f1441q;
        abstractC0162CZMo148A1.f1442r = this.f1442r;
        abstractC0162CZMo148A1.f1446v = this.f1446v;
        abstractC0162CZMo148A1.f1443s = this.f1443s;
        abstractC0162CZMo148A1.mo1218G1(this.f1447w);
        abstractC0162CZMo148A1.f1444t = c0099bz.f896q;
        abstractC0162CZMo148A1.f1445u = c0099bz.f899t;
        Boolean bool = c0099bz.f901v;
        abstractC0162CZMo148A1.mo1219H1(bool != null ? bool.booleanValue() : this.f1448x);
        if (!c0099bz.f900u.isEmpty() || this.f1429D != null) {
            LinkedHashMap linkedHashMap = c0099bz.f900u;
            Map map = this.f1429D;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!linkedHashMap.containsKey(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (linkedHashMap.size() == 1) {
                abstractC0162CZMo148A1.f1429D = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
            } else {
                abstractC0162CZMo148A1.f1429D = linkedHashMap;
            }
        }
        if (c0099bz.f893n || this.f1428C != null) {
            InterfaceC0036AZ interfaceC0036AZ2 = this.f1428C;
            if (interfaceC0036AZ2 == null) {
                interfaceC0036AZ2 = this;
            }
            abstractC0162CZMo148A1.f1428C = interfaceC0036AZ2.mo114b(c11571we1M3512h);
        }
        if (c0099bz.f892m && !mo2089x1().mo1222j().isEmpty()) {
            if (c0099bz.f880a.mo7050e()) {
                C6526o1 c6526o1 = this.f1450z;
                if (c6526o1 != null) {
                    abstractC0162CZMo148A1.f1450z = c6526o1;
                } else {
                    abstractC0162CZMo148A1.mo109H0(mo1222j());
                }
            } else {
                abstractC0162CZMo148A1.f1450z = new C6526o1(this, 1, c11571we1M3512h);
            }
        }
        return abstractC0162CZMo148A1;
    }

    /* renamed from: D1 */
    public void mo1215D1(C10937rh0 c10937rh0, C10937rh0 c10937rh02, List list, List list2, List list3, AbstractC7742Ig0 abstractC7742Ig0, EnumC10575os0 enumC10575os0, C7003vI c7003vI) {
        if (list == null) {
            m1213b1(5);
            throw null;
        }
        if (list2 == null) {
            m1213b1(6);
            throw null;
        }
        if (list3 == null) {
            m1213b1(7);
            throw null;
        }
        if (c7003vI == null) {
            m1213b1(8);
            throw null;
        }
        this.f1430f = AbstractC7167xu.m25982b0(list2);
        this.f1431g = AbstractC7167xu.m25982b0(list3);
        this.f1432h = abstractC7742Ig0;
        this.f1436l = enumC10575os0;
        this.f1437m = c7003vI;
        this.f1434j = c10937rh0;
        this.f1435k = c10937rh02;
        this.f1433i = list;
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC10292me1 interfaceC10292me1 = (InterfaceC10292me1) list2.get(i);
            if (interfaceC10292me1.getIndex() != i) {
                throw new IllegalStateException(interfaceC10292me1 + " index is " + interfaceC10292me1.getIndex() + " but position is " + i);
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            C8473Wh1 c8473Wh1 = (C8473Wh1) list3.get(i2);
            if (c8473Wh1.f13323g != i2) {
                throw new IllegalStateException(c8473Wh1 + "index is " + c8473Wh1.f13323g + " but position is " + i2);
            }
        }
    }

    /* renamed from: E1 */
    public final C0099BZ m1216E1(C11571we1 c11571we1) {
        if (c11571we1 != null) {
            return new C0099BZ(this, c11571we1.m25665f(), mo423i(), mo115f(), getVisibility(), mo116l(), mo1221f0(), mo122x0(), this.f1434j, getReturnType());
        }
        m1213b1(24);
        throw null;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: F */
    public boolean mo107F() {
        return this.f1448x;
    }

    /* renamed from: F1 */
    public final void m1217F1(C0649KI c0649ki, Object obj) {
        if (this.f1429D == null) {
            this.f1429D = new LinkedHashMap();
        }
        this.f1429D.put(c0649ki, obj);
    }

    @Override // p000.InterfaceC0036AZ
    /* renamed from: G0 */
    public final boolean mo108G0() {
        return this.f1444t;
    }

    /* renamed from: G1 */
    public void mo1218G1(boolean z) {
        this.f1447w = z;
    }

    @Override // p000.InterfaceC7158xl
    /* renamed from: H0 */
    public void mo109H0(Collection collection) {
        if (collection == null) {
            m1213b1(17);
            throw null;
        }
        this.f1449y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0036AZ) it.next()).mo110L0()) {
                this.f1445u = true;
                return;
            }
        }
    }

    /* renamed from: H1 */
    public void mo1219H1(boolean z) {
        this.f1448x = z;
    }

    /* renamed from: I1 */
    public final void m1220I1(X01 x01) {
        if (x01 != null) {
            this.f1432h = x01;
        } else {
            m1213b1(11);
            throw null;
        }
    }

    @Override // p000.InterfaceC0036AZ
    /* renamed from: L0 */
    public final boolean mo110L0() {
        return this.f1445u;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: M */
    public final boolean mo111M() {
        return this.f1443s;
    }

    @Override // p000.InterfaceC0036AZ
    /* renamed from: N0 */
    public InterfaceC7272zZ mo228N0() {
        return m1216E1(C11571we1.f45010b);
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: Q0 */
    public final boolean mo112Q0() {
        return false;
    }

    /* renamed from: S */
    public boolean mo113S() {
        return this.f1442r;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2853p(this, obj);
    }

    @Override // p000.AbstractC0329FD, p000.AbstractC0203DD, p000.InterfaceC0140CD
    /* renamed from: a */
    public InterfaceC0036AZ mo2089x1() {
        InterfaceC0036AZ interfaceC0036AZ = this.f1426A;
        InterfaceC0036AZ interfaceC0036AZMo2089x1 = interfaceC0036AZ == this ? this : interfaceC0036AZ.mo2089x1();
        if (interfaceC0036AZMo2089x1 != null) {
            return interfaceC0036AZMo2089x1;
        }
        m1213b1(20);
        throw null;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: f */
    public final EnumC10575os0 mo115f() {
        EnumC10575os0 enumC10575os0 = this.f1436l;
        if (enumC10575os0 != null) {
            return enumC10575os0;
        }
        m1213b1(15);
        throw null;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: f0 */
    public final List mo1221f0() {
        List list = this.f1431g;
        if (list != null) {
            return list;
        }
        m1213b1(19);
        throw null;
    }

    @Override // p000.InterfaceC7032vl
    public AbstractC7742Ig0 getReturnType() {
        return this.f1432h;
    }

    @Override // p000.InterfaceC7032vl
    public final List getTypeParameters() {
        List list = this.f1430f;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // p000.InterfaceC0455HD, p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        C7003vI c7003vI = this.f1437m;
        if (c7003vI != null) {
            return c7003vI;
        }
        m1213b1(16);
        throw null;
    }

    public boolean isExternal() {
        return this.f1440p;
    }

    @Override // p000.InterfaceC0036AZ
    public final boolean isInfix() {
        if (this.f1439o) {
            return true;
        }
        Iterator it = mo2089x1().mo1222j().iterator();
        while (it.hasNext()) {
            if (((InterfaceC0036AZ) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f1441q;
    }

    @Override // p000.InterfaceC0036AZ
    public final boolean isOperator() {
        if (this.f1438n) {
            return true;
        }
        Iterator it = mo2089x1().mo1222j().iterator();
        while (it.hasNext()) {
            if (((InterfaceC0036AZ) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f1446v;
    }

    @Override // p000.InterfaceC7158xl, p000.InterfaceC7032vl
    /* renamed from: j */
    public Collection mo1222j() {
        C6526o1 c6526o1 = this.f1450z;
        if (c6526o1 != null) {
            this.f1449y = (Collection) c6526o1.invoke();
            this.f1450z = null;
        }
        Collection collectionEmptyList = this.f1449y;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        m1213b1(14);
        throw null;
    }

    @Override // p000.InterfaceC7158xl
    /* renamed from: l */
    public final int mo116l() {
        int i = this.f1427B;
        if (i != 0) {
            return i;
        }
        m1213b1(21);
        throw null;
    }

    @Override // p000.InterfaceC0036AZ
    /* renamed from: o0 */
    public final InterfaceC0036AZ mo118o0() {
        return this.f1428C;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: q0 */
    public final C10937rh0 mo119q0() {
        return this.f1435k;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: s */
    public Object mo120s(C0649KI c0649ki) {
        Map map = this.f1429D;
        if (map == null) {
            return null;
        }
        return map.get(c0649ki);
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: t0 */
    public final C10937rh0 mo121t0() {
        return this.f1434j;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: x0 */
    public final List mo122x0() {
        List list = this.f1433i;
        if (list != null) {
            return list;
        }
        m1213b1(13);
        throw null;
    }

    /* renamed from: y1 */
    public final InterfaceC0036AZ m1223y1(InterfaceC6976us interfaceC6976us, EnumC10575os0 enumC10575os0, C7003vI c7003vI) {
        InterfaceC0036AZ interfaceC0036AZMo759a = mo228N0().mo763q(interfaceC6976us).mo770y(enumC10575os0).mo768w(c7003vI).mo761o(2).mo769x().mo759a();
        if (interfaceC0036AZMo759a != null) {
            return interfaceC0036AZMo759a;
        }
        m1213b1(26);
        throw null;
    }

    @Override // p000.InterfaceC7158xl
    /* renamed from: z1 */
    public U01 mo117m0(InterfaceC6976us interfaceC6976us, EnumC10575os0 enumC10575os0, C7003vI c7003vI) {
        return (U01) m1223y1(interfaceC6976us, enumC10575os0, c7003vI);
    }

    @Override // p000.R51
    /* renamed from: b */
    public InterfaceC0036AZ mo114b(C11571we1 c11571we1) {
        if (c11571we1 == null) {
            m1213b1(22);
            throw null;
        }
        if (c11571we1.f45011a.mo7050e()) {
            return this;
        }
        C0099BZ c0099bzM1216E1 = m1216E1(c11571we1);
        c0099bzM1216E1.f884e = mo2089x1();
        c0099bzM1216E1.f894o = true;
        c0099bzM1216E1.f902w = true;
        return c0099bzM1216E1.f903x.mo1214B1(c0099bzM1216E1);
    }
}
