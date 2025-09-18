package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;

/* renamed from: eb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9261eb0 extends U01 implements InterfaceC8406Va0 {

    /* renamed from: G */
    public static final C0649KI f26759G = new C0649KI();

    /* renamed from: H */
    public static final C0649KI f26760H = new C0649KI();

    /* renamed from: E */
    public int f26761E;

    /* renamed from: F */
    public final boolean f26762F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9261eb0(InterfaceC0140CD interfaceC0140CD, U01 u01, InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0, int i, W21 w21, boolean z) {
        super(interfaceC0140CD, u01, interfaceC0510I5, c8340Tt0, i, w21);
        if (interfaceC0140CD == null) {
            m18011b1(0);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m18011b1(1);
            throw null;
        }
        if (c8340Tt0 == null) {
            m18011b1(2);
            throw null;
        }
        if (i == 0) {
            m18011b1(3);
            throw null;
        }
        this.f26761E = 0;
        this.f26762F = z;
    }

    /* renamed from: N1 */
    public static C9261eb0 m18010N1(InterfaceC0140CD interfaceC0140CD, C11703xh0 c11703xh0, C8340Tt0 c8340Tt0, C10399nU0 c10399nU0, boolean z) {
        if (interfaceC0140CD == null) {
            m18011b1(5);
            throw null;
        }
        if (c8340Tt0 != null) {
            return new C9261eb0(interfaceC0140CD, null, c11703xh0, c8340Tt0, 1, c10399nU0, z);
        }
        m18011b1(7);
        throw null;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m18011b1(int i) {
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

    @Override // p000.U01, p000.AbstractC0162CZ
    /* renamed from: A1 */
    public final AbstractC0162CZ mo148A1(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21) {
        if (interfaceC0140CD == null) {
            m18011b1(14);
            throw null;
        }
        if (i == 0) {
            m18011b1(15);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m18011b1(16);
            throw null;
        }
        U01 u01 = (U01) interfaceC0036AZ;
        if (c8340Tt0 == null) {
            c8340Tt0 = getName();
        }
        C9261eb0 c9261eb0 = new C9261eb0(interfaceC0140CD, u01, interfaceC0510I5, c8340Tt0, i, w21, this.f26762F);
        int i2 = this.f26761E;
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
        c9261eb0.m18012O1(z, AbstractC0852NX.m5756e(i2));
        return c9261eb0;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC7032vl
    /* renamed from: F */
    public final boolean mo107F() {
        return AbstractC0852NX.m5756e(this.f26761E);
    }

    @Override // p000.U01
    /* renamed from: M1 */
    public final U01 mo7857M1(C10937rh0 c10937rh0, C10937rh0 c10937rh02, List list, List list2, List list3, AbstractC7742Ig0 abstractC7742Ig0, EnumC10575os0 enumC10575os0, C7003vI c7003vI, C0842NN c0842nn) {
        C0054Ar c0054Ar;
        if (list == null) {
            m18011b1(9);
            throw null;
        }
        if (list2 == null) {
            m18011b1(10);
            throw null;
        }
        if (list3 == null) {
            m18011b1(11);
            throw null;
        }
        if (c7003vI == null) {
            m18011b1(12);
            throw null;
        }
        super.mo7857M1(c10937rh0, c10937rh02, list, list2, list3, abstractC7742Ig0, enumC10575os0, c7003vI, c0842nn);
        for (C0243Dr c0243Dr : AbstractC11483vy0.f44621a) {
            c0243Dr.getClass();
            C8340Tt0 c8340Tt0 = c0243Dr.f2273a;
            if (c8340Tt0 == null || O90.m5963a(getName(), c8340Tt0)) {
                C8978cQ0 c8978cQ0 = c0243Dr.f2274b;
                if (c8978cQ0 != null) {
                    String strM7801b = getName().m7801b();
                    O90.m5967e(strM7801b, "asString(...)");
                    if (!c8978cQ0.m10697b(strM7801b)) {
                        continue;
                    }
                }
                Collection collection = c0243Dr.f2275c;
                if (collection == null || collection.contains(getName())) {
                    InterfaceC7290zr[] interfaceC7290zrArr = c0243Dr.f2277e;
                    int length = interfaceC7290zrArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            c0054Ar = ((String) c0243Dr.f2276d.invoke(this)) != null ? new C0054Ar(false) : C0054Ar.f436c;
                        } else {
                            if (interfaceC7290zrArr[i].mo10456b(this) != null) {
                                c0054Ar = new C0054Ar(false);
                                break;
                            }
                            i++;
                        }
                    }
                    this.f1438n = c0054Ar.f1055a;
                    return this;
                }
            }
        }
        c0054Ar = C0054Ar.f435b;
        this.f1438n = c0054Ar.f1055a;
        return this;
    }

    /* renamed from: O1 */
    public final void m18012O1(boolean z, boolean z2) {
        this.f26761E = z ? z2 ? 4 : 2 : z2 ? 3 : 1;
    }

    @Override // p000.InterfaceC8406Va0
    /* renamed from: Y0 */
    public final InterfaceC8406Va0 mo8511Y0(AbstractC7742Ig0 abstractC7742Ig0, ArrayList arrayList, AbstractC7742Ig0 abstractC7742Ig02, Pair pair) {
        ArrayList arrayListM17812a = AbstractC9185e02.m17812a(arrayList, mo1221f0(), this);
        C10937rh0 c10937rh0M2348h = abstractC7742Ig0 == null ? null : EZ1.m2348h(this, abstractC7742Ig0, S20.f10539b);
        C0099BZ c0099bzM1216E1 = m1216E1(C11571we1.f45010b);
        c0099bzM1216E1.f886g = arrayListM17812a;
        c0099bzM1216E1.f890k = abstractC7742Ig02;
        c0099bzM1216E1.f888i = c10937rh0M2348h;
        c0099bzM1216E1.f895p = true;
        c0099bzM1216E1.f894o = true;
        C9261eb0 c9261eb0 = (C9261eb0) c0099bzM1216E1.f903x.mo1214B1(c0099bzM1216E1);
        if (pair != null) {
            c9261eb0.m1217F1((C0649KI) pair.f36702a, pair.f36703b);
        }
        if (c9261eb0 != null) {
            return c9261eb0;
        }
        m18011b1(21);
        throw null;
    }
}
