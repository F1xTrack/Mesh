package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;

/* renamed from: eb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3611eb0 extends U01 implements InterfaceC1658Va0 {
    public static final KI G = new KI();
    public static final KI H = new KI();
    public int E;
    public final boolean F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3611eb0(CD cd, U01 u01, I5 i5, C1559Tt0 c1559Tt0, int i, W21 w21, boolean z) {
        super(cd, u01, i5, c1559Tt0, i, w21);
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
        this.E = 0;
        this.F = z;
    }

    public static C3611eb0 N1(CD cd, C8031xh0 c8031xh0, C1559Tt0 c1559Tt0, C6085nU0 c6085nU0, boolean z) {
        if (cd == null) {
            b1(5);
            throw null;
        }
        if (c1559Tt0 != null) {
            return new C3611eb0(cd, null, c8031xh0, c1559Tt0, 1, c6085nU0, z);
        }
        b1(7);
        throw null;
    }

    public static /* synthetic */ void b1(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.U01, defpackage.CZ
    public final CZ A1(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21) {
        if (cd == null) {
            b1(14);
            throw null;
        }
        if (i == 0) {
            b1(15);
            throw null;
        }
        if (i5 == null) {
            b1(16);
            throw null;
        }
        U01 u01 = (U01) az;
        if (c1559Tt0 == null) {
            c1559Tt0 = getName();
        }
        C3611eb0 c3611eb0 = new C3611eb0(cd, u01, i5, c1559Tt0, i, w21, this.F);
        int i2 = this.E;
        boolean z = false;
        if (i2 != 1) {
            if (i2 == 2) {
                z = true;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw null;
                }
                z = true;
            }
        }
        c3611eb0.O1(z, NX.e(i2));
        return c3611eb0;
    }

    @Override // defpackage.CZ, defpackage.InterfaceC7662vl
    public final boolean F() {
        return NX.e(this.E);
    }

    @Override // defpackage.U01
    public final U01 M1(C6887rh0 c6887rh0, C6887rh0 c6887rh02, List list, List list2, List list3, AbstractC0663Ig0 abstractC0663Ig0, EnumC6348os0 enumC6348os0, C7575vI c7575vI, NN nn) {
        C0071Ar c0071Ar;
        if (list == null) {
            b1(9);
            throw null;
        }
        if (list2 == null) {
            b1(10);
            throw null;
        }
        if (list3 == null) {
            b1(11);
            throw null;
        }
        if (c7575vI == null) {
            b1(12);
            throw null;
        }
        super.M1(c6887rh0, c6887rh02, list, list2, list3, abstractC0663Ig0, enumC6348os0, c7575vI, nn);
        for (C0305Dr c0305Dr : AbstractC7702vy0.a) {
            c0305Dr.getClass();
            C1559Tt0 c1559Tt0 = c0305Dr.a;
            if (c1559Tt0 == null || O90.a(getName(), c1559Tt0)) {
                C2512cQ0 c2512cQ0 = c0305Dr.b;
                if (c2512cQ0 != null) {
                    String strB = getName().b();
                    O90.e(strB, "asString(...)");
                    if (!c2512cQ0.b(strB)) {
                        continue;
                    }
                }
                Collection collection = c0305Dr.c;
                if (collection == null || collection.contains(getName())) {
                    InterfaceC8440zr[] interfaceC8440zrArr = c0305Dr.e;
                    int length = interfaceC8440zrArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            c0071Ar = ((String) c0305Dr.d.invoke(this)) != null ? new C0071Ar(false) : C0071Ar.c;
                        } else {
                            if (interfaceC8440zrArr[i].b(this) != null) {
                                c0071Ar = new C0071Ar(false);
                                break;
                            }
                            i++;
                        }
                    }
                    this.n = c0071Ar.a;
                    return this;
                }
            }
        }
        c0071Ar = C0071Ar.b;
        this.n = c0071Ar.a;
        return this;
    }

    public final void O1(boolean z, boolean z2) {
        this.E = z ? z2 ? 4 : 2 : z2 ? 3 : 1;
    }

    @Override // defpackage.InterfaceC1658Va0
    public final InterfaceC1658Va0 Y0(AbstractC0663Ig0 abstractC0663Ig0, ArrayList arrayList, AbstractC0663Ig0 abstractC0663Ig02, Pair pair) {
        ArrayList arrayListA = AbstractC3498e02.a(arrayList, f0(), this);
        C6887rh0 c6887rh0H = abstractC0663Ig0 == null ? null : EZ1.h(this, abstractC0663Ig0, S20.b);
        BZ bzE1 = E1(C7833we1.b);
        bzE1.g = arrayListA;
        bzE1.k = abstractC0663Ig02;
        bzE1.i = c6887rh0H;
        bzE1.p = true;
        bzE1.o = true;
        C3611eb0 c3611eb0 = (C3611eb0) bzE1.x.B1(bzE1);
        if (pair != null) {
            c3611eb0.F1((KI) pair.a, pair.b);
        }
        if (c3611eb0 != null) {
            return c3611eb0;
        }
        b1(21);
        throw null;
    }
}
