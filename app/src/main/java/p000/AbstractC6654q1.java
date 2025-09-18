package p000;

import java.util.List;

/* renamed from: q1 */
/* loaded from: classes2.dex */
public abstract class AbstractC6654q1 extends AbstractC0329FD implements InterfaceC10292me1 {

    /* renamed from: f */
    public final EnumC9532gi1 f40491f;

    /* renamed from: g */
    public final boolean f40492g;

    /* renamed from: h */
    public final int f40493h;

    /* renamed from: i */
    public final C8426Vk0 f40494i;

    /* renamed from: j */
    public final C8426Vk0 f40495j;

    /* renamed from: k */
    public final C8582Yk0 f40496k;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6654q1(Z41 z41, InterfaceC0140CD interfaceC0140CD, InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0, EnumC9532gi1 enumC9532gi1, boolean z, int i, C7564Ev0 c7564Ev0) {
        C7408Bv0 c7408Bv0 = W21.f12940O0;
        if (z41 == null) {
            m23923b1(0);
            throw null;
        }
        if (interfaceC0140CD == null) {
            m23923b1(1);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m23923b1(2);
            throw null;
        }
        if (c8340Tt0 == null) {
            m23923b1(3);
            throw null;
        }
        if (enumC9532gi1 == null) {
            m23923b1(4);
            throw null;
        }
        if (c7564Ev0 == null) {
            m23923b1(6);
            throw null;
        }
        super(interfaceC0140CD, interfaceC0510I5, c8340Tt0, c7408Bv0);
        this.f40491f = enumC9532gi1;
        this.f40492g = z;
        this.f40493h = i;
        C6400m1 c6400m1 = new C6400m1(this, z41, c7564Ev0);
        C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
        this.f40494i = new C8426Vk0(c8582Yk0, c6400m1);
        this.f40495j = new C8426Vk0(c8582Yk0, new C6526o1(this, 0, c8340Tt0));
        this.f40496k = c8582Yk0;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m23923b1(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p000.InterfaceC10292me1
    /* renamed from: D */
    public final boolean mo22917D() {
        return this.f40492g;
    }

    @Override // p000.InterfaceC10292me1
    /* renamed from: O */
    public final EnumC9532gi1 mo22918O() {
        EnumC9532gi1 enumC9532gi1 = this.f40491f;
        if (enumC9532gi1 != null) {
            return enumC9532gi1;
        }
        m23923b1(7);
        throw null;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2844g(this, obj);
    }

    @Override // p000.AbstractC0329FD, p000.AbstractC0203DD, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC0873Ns mo2089x1() {
        return this;
    }

    @Override // p000.InterfaceC10292me1
    public final int getIndex() {
        return this.f40493h;
    }

    @Override // p000.InterfaceC10292me1
    public final Z41 getStorageManager() {
        C8582Yk0 c8582Yk0 = this.f40496k;
        if (c8582Yk0 != null) {
            return c8582Yk0;
        }
        m23923b1(14);
        throw null;
    }

    @Override // p000.InterfaceC10292me1
    public final List getUpperBounds() {
        List listMo5276b = ((C6591p1) mo1439v()).mo5276b();
        if (listMo5276b != null) {
            return listMo5276b;
        }
        m23923b1(8);
        throw null;
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: m */
    public final X01 mo1492m() {
        X01 x01 = (X01) this.f40495j.invoke();
        if (x01 != null) {
            return x01;
        }
        m23923b1(10);
        throw null;
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: v */
    public final InterfaceC8101Pd1 mo1439v() {
        InterfaceC8101Pd1 interfaceC8101Pd1 = (InterfaceC8101Pd1) this.f40494i.invoke();
        if (interfaceC8101Pd1 != null) {
            return interfaceC8101Pd1;
        }
        m23923b1(9);
        throw null;
    }

    @Override // p000.InterfaceC10292me1
    /* renamed from: v0 */
    public final boolean mo22919v0() {
        return false;
    }

    /* renamed from: y1 */
    public List mo8119y1(List list) {
        return list;
    }

    /* renamed from: z1 */
    public abstract List mo8120z1();

    @Override // p000.AbstractC0329FD, p000.AbstractC0203DD, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC0140CD mo2089x1() {
        return this;
    }

    @Override // p000.AbstractC0329FD, p000.AbstractC0203DD, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC10292me1 mo2089x1() {
        return this;
    }

    @Override // p000.AbstractC0329FD
    /* renamed from: x1 */
    public final InterfaceC0266ED mo2089x1() {
        return this;
    }
}
