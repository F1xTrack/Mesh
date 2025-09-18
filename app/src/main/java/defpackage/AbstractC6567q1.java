package defpackage;

import java.util.List;

/* renamed from: q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6567q1 extends FD implements InterfaceC5925me1 {
    public final EnumC4015gi1 f;
    public final boolean g;
    public final int h;
    public final C1688Vk0 i;
    public final C1688Vk0 j;
    public final C1922Yk0 k;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6567q1(Z41 z41, CD cd, I5 i5, C1559Tt0 c1559Tt0, EnumC4015gi1 enumC4015gi1, boolean z, int i, C0396Ev0 c0396Ev0) {
        C0162Bv0 c0162Bv0 = W21.O0;
        if (z41 == null) {
            b1(0);
            throw null;
        }
        if (cd == null) {
            b1(1);
            throw null;
        }
        if (i5 == null) {
            b1(2);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(3);
            throw null;
        }
        if (enumC4015gi1 == null) {
            b1(4);
            throw null;
        }
        if (c0396Ev0 == null) {
            b1(6);
            throw null;
        }
        super(cd, i5, c1559Tt0, c0162Bv0);
        this.f = enumC4015gi1;
        this.g = z;
        this.h = i;
        C5803m1 c5803m1 = new C5803m1(this, z41, c0396Ev0);
        C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
        this.i = new C1688Vk0(c1922Yk0, c5803m1);
        this.j = new C1688Vk0(c1922Yk0, new C6185o1(this, 0, c1559Tt0));
        this.k = c1922Yk0;
    }

    public static /* synthetic */ void b1(int i) {
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

    @Override // defpackage.InterfaceC5925me1
    public final boolean D() {
        return this.g;
    }

    @Override // defpackage.InterfaceC5925me1
    public final EnumC4015gi1 O() {
        EnumC4015gi1 enumC4015gi1 = this.f;
        if (enumC4015gi1 != null) {
            return enumC4015gi1;
        }
        b1(7);
        throw null;
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.g(this, obj);
    }

    @Override // defpackage.FD, defpackage.DD, defpackage.CD
    /* renamed from: a */
    public final InterfaceC1087Ns x1() {
        return this;
    }

    @Override // defpackage.InterfaceC5925me1
    public final int getIndex() {
        return this.h;
    }

    @Override // defpackage.InterfaceC5925me1
    public final Z41 getStorageManager() {
        C1922Yk0 c1922Yk0 = this.k;
        if (c1922Yk0 != null) {
            return c1922Yk0;
        }
        b1(14);
        throw null;
    }

    @Override // defpackage.InterfaceC5925me1
    public final List getUpperBounds() {
        List listB = ((C6376p1) v()).b();
        if (listB != null) {
            return listB;
        }
        b1(8);
        throw null;
    }

    @Override // defpackage.InterfaceC1087Ns
    public final X01 m() {
        X01 x01 = (X01) this.j.invoke();
        if (x01 != null) {
            return x01;
        }
        b1(10);
        throw null;
    }

    @Override // defpackage.InterfaceC1087Ns
    public final InterfaceC1200Pd1 v() {
        InterfaceC1200Pd1 interfaceC1200Pd1 = (InterfaceC1200Pd1) this.i.invoke();
        if (interfaceC1200Pd1 != null) {
            return interfaceC1200Pd1;
        }
        b1(9);
        throw null;
    }

    @Override // defpackage.InterfaceC5925me1
    public final boolean v0() {
        return false;
    }

    public List y1(List list) {
        return list;
    }

    public abstract List z1();

    @Override // defpackage.FD, defpackage.DD, defpackage.CD
    /* renamed from: a */
    public final CD x1() {
        return this;
    }

    @Override // defpackage.FD, defpackage.DD, defpackage.CD
    /* renamed from: a */
    public final InterfaceC5925me1 x1() {
        return this;
    }

    @Override // defpackage.FD
    public final ED x1() {
        return this;
    }
}
