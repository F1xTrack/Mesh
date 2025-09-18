package defpackage;

import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class CZ extends FD implements AZ {
    public final AZ A;
    public final int B;
    public AZ C;
    public Map D;
    public List f;
    public List g;
    public AbstractC0663Ig0 h;
    public List i;
    public C6887rh0 j;
    public C6887rh0 k;
    public EnumC6348os0 l;
    public C7575vI m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public Collection y;
    public volatile C6185o1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CZ(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21) {
        super(cd, i5, c1559Tt0, w21);
        if (cd == null) {
            b1(0);
            throw null;
        }
        if (i5 == null) {
            b1(1);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(2);
            throw null;
        }
        if (i == 0) {
            b1(3);
            throw null;
        }
        if (w21 == null) {
            b1(4);
            throw null;
        }
        this.m = AbstractC7765wI.i;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = false;
        this.y = null;
        this.z = null;
        this.C = null;
        this.D = null;
        this.A = az == null ? this : az;
        this.B = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [Wh1] */
    public static ArrayList C1(AZ az, List list, C7833we1 c7833we1, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            b1(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1758Wh1 c1758Wh1 = (C1758Wh1) it.next();
            C1758Wh1 c1758Wh12 = c1758Wh1;
            AbstractC0663Ig0 type = c1758Wh12.getType();
            EnumC4015gi1 enumC4015gi1 = EnumC4015gi1.d;
            AbstractC0663Ig0 abstractC0663Ig0I = c7833we1.i(type, enumC4015gi1);
            AbstractC0663Ig0 abstractC0663Ig0 = c1758Wh1.k;
            AbstractC0663Ig0 abstractC0663Ig0I2 = abstractC0663Ig0 == null ? null : c7833we1.i(abstractC0663Ig0, enumC4015gi1);
            if (abstractC0663Ig0I == null) {
                return null;
            }
            if ((abstractC0663Ig0I != c1758Wh12.getType() || abstractC0663Ig0 != abstractC0663Ig0I2) && zArr != null) {
                zArr[0] = true;
            }
            C5994n1 c5994n1 = c1758Wh1 instanceof C1680Vh1 ? new C5994n1(2, (List) ((C1680Vh1) c1758Wh1).m.getValue()) : null;
            C1758Wh1 c1758Wh13 = z ? null : c1758Wh1;
            I5 annotations = c1758Wh1.getAnnotations();
            C1559Tt0 name = c1758Wh1.getName();
            boolean zZ1 = c1758Wh1.z1();
            W21 w21E = z2 ? c1758Wh1.e() : W21.O0;
            O90.f(annotations, "annotations");
            O90.f(name, "name");
            O90.f(w21E, "source");
            int i = c1758Wh1.g;
            boolean z3 = c1758Wh1.i;
            boolean z4 = c1758Wh1.j;
            arrayList.add(c5994n1 == null ? new C1758Wh1(az, c1758Wh13, i, annotations, name, abstractC0663Ig0I, zZ1, z3, z4, abstractC0663Ig0I2, w21E) : new C1680Vh1(az, c1758Wh13, i, annotations, name, abstractC0663Ig0I, zZ1, z3, z4, abstractC0663Ig0I2, w21E, c5994n1));
        }
        return arrayList;
    }

    public static /* synthetic */ void b1(int i) {
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

    public abstract CZ A1(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21);

    public CZ B1(BZ bz) {
        C6887rh0 c6887rh0;
        C6887rh0 c6887rh02;
        AbstractC0663Ig0 abstractC0663Ig0I;
        if (bz == null) {
            b1(25);
            throw null;
        }
        boolean[] zArr = new boolean[1];
        I5 i5B = bz.s != null ? AbstractC7210tN1.b(getAnnotations(), bz.s) : getAnnotations();
        CD cd = bz.b;
        AZ az = bz.e;
        int i = bz.f;
        C1559Tt0 c1559Tt0 = bz.l;
        W21 w21E = bz.o ? ((FD) (az != null ? az : x1())).e() : W21.O0;
        if (w21E == null) {
            b1(27);
            throw null;
        }
        CZ czA1 = A1(i, i5B, cd, az, c1559Tt0, w21E);
        List typeParameters = bz.r;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C7833we1 c7833we1H = HZ1.h(typeParameters, bz.a, czA1, arrayList, zArr);
        if (c7833we1H == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!bz.h.isEmpty()) {
            int i2 = 0;
            for (C6887rh0 c6887rh03 : bz.h) {
                AbstractC0663Ig0 abstractC0663Ig0I2 = c7833we1H.i(c6887rh03.getType(), EnumC4015gi1.d);
                if (abstractC0663Ig0I2 == null) {
                    return null;
                }
                int i3 = i2 + 1;
                arrayList2.add(EZ1.b(czA1, abstractC0663Ig0I2, ((C0716Iy) c6887rh03.y1()).w1(), c6887rh03.getAnnotations(), i2));
                zArr[0] = zArr[0] | (abstractC0663Ig0I2 != c6887rh03.getType());
                i2 = i3;
            }
        }
        C6887rh0 c6887rh04 = bz.i;
        if (c6887rh04 != null) {
            AbstractC0663Ig0 abstractC0663Ig0I3 = c7833we1H.i(c6887rh04.getType(), EnumC4015gi1.d);
            if (abstractC0663Ig0I3 == null) {
                return null;
            }
            bz.i.y1();
            C6887rh0 c6887rh05 = new C6887rh0(czA1, new C8172yR(czA1, abstractC0663Ig0I3), bz.i.getAnnotations());
            zArr[0] = (abstractC0663Ig0I3 != bz.i.getType()) | zArr[0];
            c6887rh0 = c6887rh05;
        } else {
            c6887rh0 = null;
        }
        C6887rh0 c6887rh06 = bz.j;
        if (c6887rh06 != null) {
            C6887rh0 c6887rh0B = c6887rh06.b(c7833we1H);
            if (c6887rh0B == null) {
                return null;
            }
            zArr[0] = zArr[0] | (c6887rh0B != bz.j);
            c6887rh02 = c6887rh0B;
        } else {
            c6887rh02 = null;
        }
        ArrayList arrayListC1 = C1(czA1, bz.g, c7833we1H, bz.p, bz.o, zArr);
        if (arrayListC1 == null || (abstractC0663Ig0I = c7833we1H.i(bz.k, EnumC4015gi1.e)) == null) {
            return null;
        }
        boolean z = zArr[0] | (abstractC0663Ig0I != bz.k);
        zArr[0] = z;
        if (!z && bz.w) {
            return this;
        }
        czA1.D1(c6887rh0, c6887rh02, arrayList2, arrayList, arrayListC1, abstractC0663Ig0I, bz.c, bz.d);
        czA1.n = this.n;
        czA1.o = this.o;
        czA1.p = this.p;
        czA1.q = this.q;
        czA1.r = this.r;
        czA1.v = this.v;
        czA1.s = this.s;
        czA1.G1(this.w);
        czA1.t = bz.q;
        czA1.u = bz.t;
        Boolean bool = bz.v;
        czA1.H1(bool != null ? bool.booleanValue() : this.x);
        if (!bz.u.isEmpty() || this.D != null) {
            LinkedHashMap linkedHashMap = bz.u;
            Map map = this.D;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!linkedHashMap.containsKey(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (linkedHashMap.size() == 1) {
                czA1.D = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
            } else {
                czA1.D = linkedHashMap;
            }
        }
        if (bz.n || this.C != null) {
            AZ az2 = this.C;
            if (az2 == null) {
                az2 = this;
            }
            czA1.C = az2.b(c7833we1H);
        }
        if (bz.m && !x1().j().isEmpty()) {
            if (bz.a.e()) {
                C6185o1 c6185o1 = this.z;
                if (c6185o1 != null) {
                    czA1.z = c6185o1;
                } else {
                    czA1.H0(j());
                }
            } else {
                czA1.z = new C6185o1(this, 1, c7833we1H);
            }
        }
        return czA1;
    }

    public void D1(C6887rh0 c6887rh0, C6887rh0 c6887rh02, List list, List list2, List list3, AbstractC0663Ig0 abstractC0663Ig0, EnumC6348os0 enumC6348os0, C7575vI c7575vI) {
        if (list == null) {
            b1(5);
            throw null;
        }
        if (list2 == null) {
            b1(6);
            throw null;
        }
        if (list3 == null) {
            b1(7);
            throw null;
        }
        if (c7575vI == null) {
            b1(8);
            throw null;
        }
        this.f = AbstractC8069xu.b0(list2);
        this.g = AbstractC8069xu.b0(list3);
        this.h = abstractC0663Ig0;
        this.l = enumC6348os0;
        this.m = c7575vI;
        this.j = c6887rh0;
        this.k = c6887rh02;
        this.i = list;
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC5925me1 interfaceC5925me1 = (InterfaceC5925me1) list2.get(i);
            if (interfaceC5925me1.getIndex() != i) {
                throw new IllegalStateException(interfaceC5925me1 + " index is " + interfaceC5925me1.getIndex() + " but position is " + i);
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            C1758Wh1 c1758Wh1 = (C1758Wh1) list3.get(i2);
            if (c1758Wh1.g != i2) {
                throw new IllegalStateException(c1758Wh1 + "index is " + c1758Wh1.g + " but position is " + i2);
            }
        }
    }

    public final BZ E1(C7833we1 c7833we1) {
        if (c7833we1 != null) {
            return new BZ(this, c7833we1.f(), i(), f(), getVisibility(), l(), f0(), x0(), this.j, getReturnType());
        }
        b1(24);
        throw null;
    }

    @Override // defpackage.InterfaceC7662vl
    public boolean F() {
        return this.x;
    }

    public final void F1(KI ki, Object obj) {
        if (this.D == null) {
            this.D = new LinkedHashMap();
        }
        this.D.put(ki, obj);
    }

    @Override // defpackage.AZ
    public final boolean G0() {
        return this.t;
    }

    public void G1(boolean z) {
        this.w = z;
    }

    @Override // defpackage.InterfaceC8042xl
    public void H0(Collection collection) {
        if (collection == null) {
            b1(17);
            throw null;
        }
        this.y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((AZ) it.next()).L0()) {
                this.u = true;
                return;
            }
        }
    }

    public void H1(boolean z) {
        this.x = z;
    }

    public final void I1(X01 x01) {
        if (x01 != null) {
            this.h = x01;
        } else {
            b1(11);
            throw null;
        }
    }

    @Override // defpackage.AZ
    public final boolean L0() {
        return this.u;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean M() {
        return this.s;
    }

    @Override // defpackage.AZ
    public InterfaceC8386zZ N0() {
        return E1(C7833we1.b);
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean Q0() {
        return false;
    }

    public boolean S() {
        return this.r;
    }

    @Override // defpackage.CD
    public Object Z(GD gd, Object obj) {
        return gd.p(this, obj);
    }

    @Override // defpackage.FD, defpackage.DD, defpackage.CD
    /* renamed from: a */
    public AZ x1() {
        AZ az = this.A;
        AZ azX1 = az == this ? this : az.x1();
        if (azX1 != null) {
            return azX1;
        }
        b1(20);
        throw null;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final EnumC6348os0 f() {
        EnumC6348os0 enumC6348os0 = this.l;
        if (enumC6348os0 != null) {
            return enumC6348os0;
        }
        b1(15);
        throw null;
    }

    @Override // defpackage.InterfaceC7662vl
    public final List f0() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        b1(19);
        throw null;
    }

    @Override // defpackage.InterfaceC7662vl
    public AbstractC0663Ig0 getReturnType() {
        return this.h;
    }

    @Override // defpackage.InterfaceC7662vl
    public final List getTypeParameters() {
        List list = this.f;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        C7575vI c7575vI = this.m;
        if (c7575vI != null) {
            return c7575vI;
        }
        b1(16);
        throw null;
    }

    public boolean isExternal() {
        return this.p;
    }

    @Override // defpackage.AZ
    public final boolean isInfix() {
        if (this.o) {
            return true;
        }
        Iterator it = x1().j().iterator();
        while (it.hasNext()) {
            if (((AZ) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.q;
    }

    @Override // defpackage.AZ
    public final boolean isOperator() {
        if (this.n) {
            return true;
        }
        Iterator it = x1().j().iterator();
        while (it.hasNext()) {
            if (((AZ) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.v;
    }

    @Override // defpackage.InterfaceC8042xl, defpackage.InterfaceC7662vl
    public Collection j() {
        C6185o1 c6185o1 = this.z;
        if (c6185o1 != null) {
            this.y = (Collection) c6185o1.invoke();
            this.z = null;
        }
        Collection collectionEmptyList = this.y;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        b1(14);
        throw null;
    }

    @Override // defpackage.InterfaceC8042xl
    public final int l() {
        int i = this.B;
        if (i != 0) {
            return i;
        }
        b1(21);
        throw null;
    }

    @Override // defpackage.AZ
    public final AZ o0() {
        return this.C;
    }

    @Override // defpackage.InterfaceC7662vl
    public final C6887rh0 q0() {
        return this.k;
    }

    @Override // defpackage.InterfaceC7662vl
    public Object s(KI ki) {
        Map map = this.D;
        if (map == null) {
            return null;
        }
        return map.get(ki);
    }

    @Override // defpackage.InterfaceC7662vl
    public final C6887rh0 t0() {
        return this.j;
    }

    @Override // defpackage.InterfaceC7662vl
    public final List x0() {
        List list = this.i;
        if (list != null) {
            return list;
        }
        b1(13);
        throw null;
    }

    public final AZ y1(InterfaceC7492us interfaceC7492us, EnumC6348os0 enumC6348os0, C7575vI c7575vI) {
        AZ azA = N0().q(interfaceC7492us).y(enumC6348os0).w(c7575vI).o(2).x().a();
        if (azA != null) {
            return azA;
        }
        b1(26);
        throw null;
    }

    @Override // defpackage.InterfaceC8042xl
    /* renamed from: z1 */
    public U01 m0(InterfaceC7492us interfaceC7492us, EnumC6348os0 enumC6348os0, C7575vI c7575vI) {
        return (U01) y1(interfaceC7492us, enumC6348os0, c7575vI);
    }

    @Override // defpackage.R51
    public AZ b(C7833we1 c7833we1) {
        if (c7833we1 == null) {
            b1(22);
            throw null;
        }
        if (c7833we1.a.e()) {
            return this;
        }
        BZ bzE1 = E1(c7833we1);
        bzE1.e = x1();
        bzE1.o = true;
        bzE1.w = true;
        return bzE1.x.B1(bzE1);
    }
}
