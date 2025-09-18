package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class EE0 extends AbstractC3824fi1 implements CE0 {
    public C3396dT A;
    public final boolean g;
    public C1610Uk0 h;
    public AbstractC1676Vg0 i;
    public final EnumC6348os0 j;
    public C7575vI k;
    public Collection l;
    public final CE0 m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public List t;
    public C6887rh0 u;
    public C6887rh0 v;
    public ArrayList w;
    public FE0 x;
    public JE0 y;
    public C3396dT z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EE0(CD cd, CE0 ce0, I5 i5, EnumC6348os0 enumC6348os0, C7575vI c7575vI, boolean z, C1559Tt0 c1559Tt0, int i, W21 w21, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(cd, i5, c1559Tt0, null, w21);
        if (cd == null) {
            b1(0);
            throw null;
        }
        if (i5 == null) {
            b1(1);
            throw null;
        }
        if (enumC6348os0 == null) {
            b1(2);
            throw null;
        }
        if (c7575vI == null) {
            b1(3);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(4);
            throw null;
        }
        if (i == 0) {
            b1(5);
            throw null;
        }
        if (w21 == null) {
            b1(6);
            throw null;
        }
        this.g = z;
        this.l = null;
        this.t = Collections.emptyList();
        this.j = enumC6348os0;
        this.k = c7575vI;
        this.m = ce0 == null ? this : ce0;
        this.n = i;
        this.o = z2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = z6;
    }

    public static AZ B1(C7833we1 c7833we1, InterfaceC8324zE0 interfaceC8324zE0) {
        if (interfaceC8324zE0 == null) {
            b1(31);
            throw null;
        }
        AZ az = ((AE0) interfaceC8324zE0).m;
        if (az != null) {
            return az.b(c7833we1);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void b1(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EE0.b1(int):void");
    }

    public static EE0 z1(InterfaceC7492us interfaceC7492us, EnumC6348os0 enumC6348os0, C7575vI c7575vI, boolean z, C1559Tt0 c1559Tt0, int i, W21 w21) {
        H5 h5 = S20.b;
        if (interfaceC7492us == null) {
            b1(7);
            throw null;
        }
        if (c7575vI == null) {
            b1(10);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(11);
            throw null;
        }
        if (i == 0) {
            b1(12);
            throw null;
        }
        if (w21 != null) {
            return new EE0(interfaceC7492us, null, h5, enumC6348os0, c7575vI, z, c1559Tt0, i, w21, false, false, false, false, false);
        }
        b1(13);
        throw null;
    }

    @Override // defpackage.InterfaceC3633ei1
    public final boolean A0() {
        return this.o;
    }

    public EE0 A1(CD cd, EnumC6348os0 enumC6348os0, C7575vI c7575vI, CE0 ce0, int i, C1559Tt0 c1559Tt0) {
        C0162Bv0 c0162Bv0 = W21.O0;
        if (cd == null) {
            b1(32);
            throw null;
        }
        if (enumC6348os0 == null) {
            b1(33);
            throw null;
        }
        if (c7575vI == null) {
            b1(34);
            throw null;
        }
        if (i == 0) {
            b1(35);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(36);
            throw null;
        }
        I5 annotations = getAnnotations();
        boolean zX = x();
        boolean zIsExternal = isExternal();
        return new EE0(cd, ce0, annotations, enumC6348os0, c7575vI, this.g, c1559Tt0, i, c0162Bv0, this.o, zX, this.q, zIsExternal, this.s);
    }

    public final void C1(FE0 fe0, JE0 je0, C3396dT c3396dT, C3396dT c3396dT2) {
        this.x = fe0;
        this.y = je0;
        this.z = c3396dT;
        this.A = c3396dT2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D1(C1610Uk0 c1610Uk0, InterfaceC5908mZ interfaceC5908mZ) {
        if (interfaceC5908mZ == 0) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.i = (AbstractC1676Vg0) interfaceC5908mZ;
        if (c1610Uk0 == null) {
            c1610Uk0 = (C1610Uk0) interfaceC5908mZ.invoke();
        }
        this.h = c1610Uk0;
    }

    public void E1(AbstractC0663Ig0 abstractC0663Ig0) {
    }

    public final void F1(AbstractC0663Ig0 abstractC0663Ig0, List list, C6887rh0 c6887rh0, C6887rh0 c6887rh02, List list2) {
        if (abstractC0663Ig0 == null) {
            b1(17);
            throw null;
        }
        if (list == null) {
            b1(18);
            throw null;
        }
        if (list2 == null) {
            b1(19);
            throw null;
        }
        this.f = abstractC0663Ig0;
        this.w = new ArrayList(list);
        this.v = c6887rh02;
        this.u = c6887rh0;
        this.t = list2;
    }

    @Override // defpackage.InterfaceC8042xl
    public final void H0(Collection collection) {
        if (collection != null) {
            this.l = collection;
        } else {
            b1(40);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean M() {
        return this.q;
    }

    @Override // defpackage.CE0
    public final boolean Q() {
        return this.s;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean Q0() {
        return false;
    }

    @Override // defpackage.InterfaceC3633ei1
    public final AbstractC0323Dx Y() {
        C1610Uk0 c1610Uk0 = this.h;
        if (c1610Uk0 != null) {
            return (AbstractC0323Dx) c1610Uk0.invoke();
        }
        return null;
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.o(this, obj);
    }

    @Override // defpackage.CE0
    public final FE0 c() {
        return this.x;
    }

    @Override // defpackage.CE0
    public final JE0 d() {
        return this.y;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final EnumC6348os0 f() {
        EnumC6348os0 enumC6348os0 = this.j;
        if (enumC6348os0 != null) {
            return enumC6348os0;
        }
        b1(24);
        throw null;
    }

    @Override // defpackage.AbstractC3824fi1, defpackage.InterfaceC7662vl
    public final AbstractC0663Ig0 getReturnType() {
        AbstractC0663Ig0 type = getType();
        if (type != null) {
            return type;
        }
        b1(23);
        throw null;
    }

    @Override // defpackage.AbstractC3824fi1, defpackage.InterfaceC7662vl
    public final List getTypeParameters() {
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        C7575vI c7575vI = this.k;
        if (c7575vI != null) {
            return c7575vI;
        }
        b1(25);
        throw null;
    }

    @Override // defpackage.InterfaceC2400bq0
    public boolean isExternal() {
        return this.r;
    }

    @Override // defpackage.InterfaceC7662vl
    public final Collection j() {
        Collection collectionEmptyList = this.l;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        b1(41);
        throw null;
    }

    @Override // defpackage.InterfaceC8042xl
    public final int l() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        b1(39);
        throw null;
    }

    @Override // defpackage.CE0
    public final ArrayList p() {
        ArrayList arrayList = new ArrayList(2);
        FE0 fe0 = this.x;
        if (fe0 != null) {
            arrayList.add(fe0);
        }
        JE0 je0 = this.y;
        if (je0 != null) {
            arrayList.add(je0);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC3824fi1, defpackage.InterfaceC7662vl
    public final C6887rh0 q0() {
        return this.u;
    }

    @Override // defpackage.InterfaceC7662vl
    public Object s(KI ki) {
        return null;
    }

    @Override // defpackage.InterfaceC3633ei1
    public final boolean s0() {
        return this.g;
    }

    @Override // defpackage.AbstractC3824fi1, defpackage.InterfaceC7662vl
    public final C6887rh0 t0() {
        return this.v;
    }

    @Override // defpackage.CE0
    public final C3396dT u0() {
        return this.A;
    }

    @Override // defpackage.CE0
    public final C3396dT w0() {
        return this.z;
    }

    @Override // defpackage.InterfaceC3633ei1
    public boolean x() {
        return this.p;
    }

    @Override // defpackage.InterfaceC7662vl
    public final List x0() {
        List list = this.t;
        if (list != null) {
            return list;
        }
        b1(22);
        throw null;
    }

    @Override // defpackage.InterfaceC8042xl
    /* renamed from: y1 */
    public final EE0 m0(InterfaceC7492us interfaceC7492us, EnumC6348os0 enumC6348os0, C7575vI c7575vI) {
        DE0 de0 = new DE0(this);
        if (interfaceC7492us == null) {
            DE0.a(0);
            throw null;
        }
        de0.a = interfaceC7492us;
        de0.d = null;
        de0.b = enumC6348os0;
        if (c7575vI == null) {
            DE0.a(8);
            throw null;
        }
        de0.c = c7575vI;
        de0.e = 2;
        de0.g = false;
        EE0 ee0B = de0.b();
        if (ee0B != null) {
            return ee0B;
        }
        b1(42);
        throw null;
    }

    @Override // defpackage.R51
    public final CE0 b(C7833we1 c7833we1) {
        if (c7833we1 == null) {
            b1(27);
            throw null;
        }
        if (c7833we1.a.e()) {
            return this;
        }
        DE0 de0 = new DE0(this);
        AbstractC7452ue1 abstractC7452ue1F = c7833we1.f();
        if (abstractC7452ue1F == null) {
            DE0.a(15);
            throw null;
        }
        de0.f = abstractC7452ue1F;
        de0.d = x1();
        return de0.b();
    }

    @Override // defpackage.FD
    /* renamed from: a */
    public final CE0 x1() {
        CE0 ce0 = this.m;
        CE0 ce0X1 = ce0 == this ? this : ce0.x1();
        if (ce0X1 != null) {
            return ce0X1;
        }
        b1(38);
        throw null;
    }
}
