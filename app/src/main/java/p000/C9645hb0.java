package p000;

import java.util.ArrayList;
import kotlin.Pair;

/* renamed from: hb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9645hb0 extends EE0 implements InterfaceC8406Va0 {

    /* renamed from: B */
    public final boolean f28470B;

    /* renamed from: C */
    public final Pair f28471C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9645hb0(InterfaceC0140CD interfaceC0140CD, InterfaceC0510I5 interfaceC0510I5, EnumC10575os0 enumC10575os0, C7003vI c7003vI, boolean z, C8340Tt0 c8340Tt0, W21 w21, CE0 ce0, int i, boolean z2, Pair pair) {
        super(interfaceC0140CD, ce0, interfaceC0510I5, enumC10575os0, c7003vI, z, c8340Tt0, i, w21, false, false, false, false, false);
        if (interfaceC0140CD == null) {
            m18839b1(0);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m18839b1(1);
            throw null;
        }
        if (enumC10575os0 == null) {
            m18839b1(2);
            throw null;
        }
        if (c7003vI == null) {
            m18839b1(3);
            throw null;
        }
        if (c8340Tt0 == null) {
            m18839b1(4);
            throw null;
        }
        if (w21 == null) {
            m18839b1(5);
            throw null;
        }
        if (i == 0) {
            m18839b1(6);
            throw null;
        }
        this.f28470B = z2;
        this.f28471C = pair;
    }

    /* renamed from: G1 */
    public static C9645hb0 m18838G1(InterfaceC0140CD interfaceC0140CD, C11703xh0 c11703xh0, C7003vI c7003vI, boolean z, C8340Tt0 c8340Tt0, C10399nU0 c10399nU0, boolean z2) {
        EnumC10575os0 enumC10575os0 = EnumC10575os0.f39323b;
        if (interfaceC0140CD == null) {
            m18839b1(7);
            throw null;
        }
        if (c8340Tt0 != null) {
            return new C9645hb0(interfaceC0140CD, c11703xh0, enumC10575os0, c7003vI, z, c8340Tt0, c10399nU0, null, 1, z2, null);
        }
        m18839b1(11);
        throw null;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m18839b1(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p000.EE0
    /* renamed from: A1 */
    public final EE0 mo2081A1(InterfaceC0140CD interfaceC0140CD, EnumC10575os0 enumC10575os0, C7003vI c7003vI, CE0 ce0, int i, C8340Tt0 c8340Tt0) {
        C7408Bv0 c7408Bv0 = W21.f12940O0;
        if (interfaceC0140CD == null) {
            m18839b1(13);
            throw null;
        }
        if (enumC10575os0 == null) {
            m18839b1(14);
            throw null;
        }
        if (c7003vI == null) {
            m18839b1(15);
            throw null;
        }
        if (i == 0) {
            m18839b1(16);
            throw null;
        }
        if (c8340Tt0 == null) {
            m18839b1(17);
            throw null;
        }
        return new C9645hb0(interfaceC0140CD, getAnnotations(), enumC10575os0, c7003vI, this.f2545g, c8340Tt0, c7408Bv0, ce0, i, this.f28470B, this.f28471C);
    }

    @Override // p000.EE0
    /* renamed from: E1 */
    public final void mo2084E1(AbstractC7742Ig0 abstractC7742Ig0) {
    }

    @Override // p000.AbstractC9404fi1, p000.InterfaceC7032vl
    /* renamed from: F */
    public final boolean mo107F() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [Vg0, mZ] */
    @Override // p000.InterfaceC8406Va0
    /* renamed from: Y0 */
    public final InterfaceC8406Va0 mo8511Y0(AbstractC7742Ig0 abstractC7742Ig0, ArrayList arrayList, AbstractC7742Ig0 abstractC7742Ig02, Pair pair) {
        FE0 fe0;
        C10937rh0 c10937rh0;
        JE0 je0;
        CE0 ce0Mo2089x1 = mo2089x1() == this ? null : mo2089x1();
        C9645hb0 c9645hb0 = new C9645hb0(mo423i(), getAnnotations(), mo115f(), getVisibility(), this.f2545g, getName(), mo422e(), ce0Mo2089x1, mo116l(), this.f28470B, pair);
        FE0 fe02 = this.f2562x;
        if (fe02 != null) {
            fe0 = fe0;
            FE0 fe03 = new FE0(c9645hb0, fe02.getAnnotations(), fe02.mo115f(), fe02.getVisibility(), fe02.f112f, fe02.f113g, fe02.f116j, mo116l(), ce0Mo2089x1 == null ? null : ce0Mo2089x1.mo1121c(), fe02.mo422e());
            fe0.f119m = fe02.f119m;
            fe0.f3093n = abstractC7742Ig02;
        } else {
            fe0 = null;
        }
        JE0 je02 = this.f2563y;
        if (je02 != null) {
            je0 = je0;
            JE0 je03 = new JE0(c9645hb0, je02.getAnnotations(), je02.mo115f(), je02.getVisibility(), je02.f112f, je02.f113g, je02.f116j, mo116l(), ce0Mo2089x1 == null ? null : ce0Mo2089x1.mo1122d(), je02.mo422e());
            je0.f119m = je0.f119m;
            C8473Wh1 c8473Wh1 = (C8473Wh1) je02.mo1221f0().get(0);
            if (c8473Wh1 == null) {
                JE0.m4255b1(6);
                throw null;
            }
            je0.f5400n = c8473Wh1;
            c10937rh0 = null;
        } else {
            c10937rh0 = null;
            je0 = null;
        }
        c9645hb0.m2082C1(fe0, je0, this.f2564z, this.f2544A);
        ?? r2 = this.f2547i;
        if (r2 != 0) {
            c9645hb0.m2083D1(this.f2546h, r2);
        }
        c9645hb0.mo109H0(mo1222j());
        c9645hb0.m2085F1(abstractC7742Ig02, getTypeParameters(), this.f2559u, abstractC7742Ig0 == null ? c10937rh0 : EZ1.m2348h(this, abstractC7742Ig0, S20.f10539b), C0779MN.f7117a);
        return c9645hb0;
    }

    @Override // p000.EE0, p000.InterfaceC7032vl
    /* renamed from: s */
    public final Object mo120s(C0649KI c0649ki) {
        Pair pair = this.f28471C;
        if (pair == null || !((C0649KI) pair.f36702a).equals(c0649ki)) {
            return null;
        }
        return pair.f36703b;
    }

    @Override // p000.EE0, p000.InterfaceC9276ei1
    /* renamed from: x */
    public final boolean mo2088x() {
        AbstractC7742Ig0 type = getType();
        if (this.f28470B) {
            O90.m5968f(type, "type");
            if (((AbstractC11955zg0.m26487F(type) || AbstractC8211Rg1.m7086a(type)) && !AbstractC7375Be1.m787e(type)) || AbstractC11955zg0.m26485D(type, AbstractC10604p41.f39808f)) {
                C0636K5 c0636k5 = AbstractC9007ce1.f17674a;
                C0664KX c0664kx = AbstractC8046Oc0.f8534p;
                O90.m5967e(c0664kx, "ENHANCED_NULLABILITY_ANNOTATION");
                if (!US1.m8057q(type, c0664kx) || AbstractC11955zg0.m26485D(type, AbstractC10604p41.f39808f)) {
                    return true;
                }
            }
        }
        return false;
    }
}
