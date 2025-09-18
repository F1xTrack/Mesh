package p000;

import java.util.ArrayList;
import kotlin.Pair;

/* renamed from: Wa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8458Wa0 extends C6707qs implements InterfaceC8406Va0 {

    /* renamed from: F */
    public Boolean f13265F;

    /* renamed from: G */
    public Boolean f13266G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8458Wa0(InterfaceC6976us interfaceC6976us, C8458Wa0 c8458Wa0, InterfaceC0510I5 interfaceC0510I5, boolean z, int i, W21 w21) {
        super(interfaceC6976us, c8458Wa0, interfaceC0510I5, z, i, w21);
        if (interfaceC6976us == null) {
            m8823b1(0);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m8823b1(1);
            throw null;
        }
        if (i == 0) {
            m8823b1(2);
            throw null;
        }
        if (w21 == null) {
            m8823b1(3);
            throw null;
        }
        this.f13265F = null;
        this.f13266G = null;
    }

    /* renamed from: P1 */
    public static C8458Wa0 m8822P1(InterfaceC6976us interfaceC6976us, InterfaceC0510I5 interfaceC0510I5, boolean z, C10399nU0 c10399nU0) {
        if (interfaceC6976us != null) {
            return new C8458Wa0(interfaceC6976us, null, interfaceC0510I5, z, 1, c10399nU0);
        }
        m8823b1(4);
        throw null;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m8823b1(int i) {
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

    @Override // p000.C6707qs, p000.AbstractC0162CZ
    /* renamed from: A1 */
    public final /* bridge */ /* synthetic */ AbstractC0162CZ mo148A1(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21) {
        return m8824Q1(interfaceC0140CD, interfaceC0036AZ, i, interfaceC0510I5, w21);
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC7032vl
    /* renamed from: F */
    public final boolean mo107F() {
        return this.f13266G.booleanValue();
    }

    @Override // p000.AbstractC0162CZ
    /* renamed from: G1 */
    public final void mo1218G1(boolean z) {
        this.f13265F = Boolean.valueOf(z);
    }

    @Override // p000.AbstractC0162CZ
    /* renamed from: H1 */
    public final void mo1219H1(boolean z) {
        this.f13266G = Boolean.valueOf(z);
    }

    @Override // p000.C6707qs
    /* renamed from: J1 */
    public final /* bridge */ /* synthetic */ C6707qs mo148A1(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21) {
        return m8824Q1(interfaceC0140CD, interfaceC0036AZ, i, interfaceC0510I5, w21);
    }

    /* renamed from: Q1 */
    public final C8458Wa0 m8824Q1(InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, int i, InterfaceC0510I5 interfaceC0510I5, W21 w21) {
        if (interfaceC0140CD == null) {
            m8823b1(7);
            throw null;
        }
        if (i == 0) {
            m8823b1(8);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m8823b1(9);
            throw null;
        }
        if (w21 == null) {
            m8823b1(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0140CD + "\nkind: " + AbstractC7222ym.m26248y(i));
        }
        InterfaceC6976us interfaceC6976us = (InterfaceC6976us) interfaceC0140CD;
        C8458Wa0 c8458Wa0 = (C8458Wa0) interfaceC0036AZ;
        if (i == 0) {
            m8823b1(13);
            throw null;
        }
        C8458Wa0 c8458Wa02 = new C8458Wa0(interfaceC6976us, c8458Wa0, interfaceC0510I5, this.f41218E, i, w21);
        Boolean bool = this.f13265F;
        bool.getClass();
        c8458Wa02.f13265F = bool;
        Boolean bool2 = this.f13266G;
        bool2.getClass();
        c8458Wa02.f13266G = bool2;
        return c8458Wa02;
    }

    @Override // p000.InterfaceC8406Va0
    /* renamed from: Y0 */
    public final InterfaceC8406Va0 mo8511Y0(AbstractC7742Ig0 abstractC7742Ig0, ArrayList arrayList, AbstractC7742Ig0 abstractC7742Ig02, Pair pair) {
        C8458Wa0 c8458Wa0M8824Q1 = m8824Q1(mo423i(), null, mo116l(), getAnnotations(), mo422e());
        c8458Wa0M8824Q1.mo1215D1(abstractC7742Ig0 == null ? null : EZ1.m2348h(c8458Wa0M8824Q1, abstractC7742Ig0, S20.f10539b), this.f1435k, C0779MN.f7117a, getTypeParameters(), AbstractC9185e02.m17812a(arrayList, mo1221f0(), c8458Wa0M8824Q1), abstractC7742Ig02, mo115f(), getVisibility());
        if (pair != null) {
            c8458Wa0M8824Q1.m1217F1((C0649KI) pair.f36702a, pair.f36703b);
        }
        return c8458Wa0M8824Q1;
    }
}
