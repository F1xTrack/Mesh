package defpackage;

import java.util.ArrayList;
import kotlin.Pair;

/* renamed from: Wa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1736Wa0 extends C6729qs implements InterfaceC1658Va0 {
    public Boolean F;
    public Boolean G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1736Wa0(InterfaceC7492us interfaceC7492us, C1736Wa0 c1736Wa0, I5 i5, boolean z, int i, W21 w21) {
        super(interfaceC7492us, c1736Wa0, i5, z, i, w21);
        if (interfaceC7492us == null) {
            b1(0);
            throw null;
        }
        if (i5 == null) {
            b1(1);
            throw null;
        }
        if (i == 0) {
            b1(2);
            throw null;
        }
        if (w21 == null) {
            b1(3);
            throw null;
        }
        this.F = null;
        this.G = null;
    }

    public static C1736Wa0 P1(InterfaceC7492us interfaceC7492us, I5 i5, boolean z, C6085nU0 c6085nU0) {
        if (interfaceC7492us != null) {
            return new C1736Wa0(interfaceC7492us, null, i5, z, 1, c6085nU0);
        }
        b1(4);
        throw null;
    }

    public static /* synthetic */ void b1(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.C6729qs, defpackage.CZ
    public final /* bridge */ /* synthetic */ CZ A1(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21) {
        return Q1(cd, az, i, i5, w21);
    }

    @Override // defpackage.CZ, defpackage.InterfaceC7662vl
    public final boolean F() {
        return this.G.booleanValue();
    }

    @Override // defpackage.CZ
    public final void G1(boolean z) {
        this.F = Boolean.valueOf(z);
    }

    @Override // defpackage.CZ
    public final void H1(boolean z) {
        this.G = Boolean.valueOf(z);
    }

    @Override // defpackage.C6729qs
    /* renamed from: J1 */
    public final /* bridge */ /* synthetic */ C6729qs A1(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21) {
        return Q1(cd, az, i, i5, w21);
    }

    public final C1736Wa0 Q1(CD cd, AZ az, int i, I5 i5, W21 w21) {
        if (cd == null) {
            b1(7);
            throw null;
        }
        if (i == 0) {
            b1(8);
            throw null;
        }
        if (i5 == null) {
            b1(9);
            throw null;
        }
        if (w21 == null) {
            b1(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + cd + "\nkind: " + AbstractC8235ym.y(i));
        }
        InterfaceC7492us interfaceC7492us = (InterfaceC7492us) cd;
        C1736Wa0 c1736Wa0 = (C1736Wa0) az;
        if (i == 0) {
            b1(13);
            throw null;
        }
        C1736Wa0 c1736Wa02 = new C1736Wa0(interfaceC7492us, c1736Wa0, i5, this.E, i, w21);
        Boolean bool = this.F;
        bool.getClass();
        c1736Wa02.F = bool;
        Boolean bool2 = this.G;
        bool2.getClass();
        c1736Wa02.G = bool2;
        return c1736Wa02;
    }

    @Override // defpackage.InterfaceC1658Va0
    public final InterfaceC1658Va0 Y0(AbstractC0663Ig0 abstractC0663Ig0, ArrayList arrayList, AbstractC0663Ig0 abstractC0663Ig02, Pair pair) {
        C1736Wa0 c1736Wa0Q1 = Q1(i(), null, l(), getAnnotations(), e());
        c1736Wa0Q1.D1(abstractC0663Ig0 == null ? null : EZ1.h(c1736Wa0Q1, abstractC0663Ig0, S20.b), this.k, MN.a, getTypeParameters(), AbstractC3498e02.a(arrayList, f0(), c1736Wa0Q1), abstractC0663Ig02, f(), getVisibility());
        if (pair != null) {
            c1736Wa0Q1.F1((KI) pair.a, pair.b);
        }
        return c1736Wa0Q1;
    }
}
