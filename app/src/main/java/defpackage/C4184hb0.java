package defpackage;

import java.util.ArrayList;
import kotlin.Pair;

/* renamed from: hb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4184hb0 extends EE0 implements InterfaceC1658Va0 {
    public final boolean B;
    public final Pair C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4184hb0(CD cd, I5 i5, EnumC6348os0 enumC6348os0, C7575vI c7575vI, boolean z, C1559Tt0 c1559Tt0, W21 w21, CE0 ce0, int i, boolean z2, Pair pair) {
        super(cd, ce0, i5, enumC6348os0, c7575vI, z, c1559Tt0, i, w21, false, false, false, false, false);
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
        if (w21 == null) {
            b1(5);
            throw null;
        }
        if (i == 0) {
            b1(6);
            throw null;
        }
        this.B = z2;
        this.C = pair;
    }

    public static C4184hb0 G1(CD cd, C8031xh0 c8031xh0, C7575vI c7575vI, boolean z, C1559Tt0 c1559Tt0, C6085nU0 c6085nU0, boolean z2) {
        EnumC6348os0 enumC6348os0 = EnumC6348os0.b;
        if (cd == null) {
            b1(7);
            throw null;
        }
        if (c1559Tt0 != null) {
            return new C4184hb0(cd, c8031xh0, enumC6348os0, c7575vI, z, c1559Tt0, c6085nU0, null, 1, z2, null);
        }
        b1(11);
        throw null;
    }

    public static /* synthetic */ void b1(int i) {
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

    @Override // defpackage.EE0
    public final EE0 A1(CD cd, EnumC6348os0 enumC6348os0, C7575vI c7575vI, CE0 ce0, int i, C1559Tt0 c1559Tt0) {
        C0162Bv0 c0162Bv0 = W21.O0;
        if (cd == null) {
            b1(13);
            throw null;
        }
        if (enumC6348os0 == null) {
            b1(14);
            throw null;
        }
        if (c7575vI == null) {
            b1(15);
            throw null;
        }
        if (i == 0) {
            b1(16);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(17);
            throw null;
        }
        return new C4184hb0(cd, getAnnotations(), enumC6348os0, c7575vI, this.g, c1559Tt0, c0162Bv0, ce0, i, this.B, this.C);
    }

    @Override // defpackage.EE0
    public final void E1(AbstractC0663Ig0 abstractC0663Ig0) {
    }

    @Override // defpackage.AbstractC3824fi1, defpackage.InterfaceC7662vl
    public final boolean F() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [Vg0, mZ] */
    @Override // defpackage.InterfaceC1658Va0
    public final InterfaceC1658Va0 Y0(AbstractC0663Ig0 abstractC0663Ig0, ArrayList arrayList, AbstractC0663Ig0 abstractC0663Ig02, Pair pair) {
        FE0 fe0;
        C6887rh0 c6887rh0;
        JE0 je0;
        CE0 ce0X1 = x1() == this ? null : x1();
        C4184hb0 c4184hb0 = new C4184hb0(i(), getAnnotations(), f(), getVisibility(), this.g, getName(), e(), ce0X1, l(), this.B, pair);
        FE0 fe02 = this.x;
        if (fe02 != null) {
            fe0 = fe0;
            FE0 fe03 = new FE0(c4184hb0, fe02.getAnnotations(), fe02.f(), fe02.getVisibility(), fe02.f, fe02.g, fe02.j, l(), ce0X1 == null ? null : ce0X1.c(), fe02.e());
            fe0.m = fe02.m;
            fe0.n = abstractC0663Ig02;
        } else {
            fe0 = null;
        }
        JE0 je02 = this.y;
        if (je02 != null) {
            je0 = je0;
            JE0 je03 = new JE0(c4184hb0, je02.getAnnotations(), je02.f(), je02.getVisibility(), je02.f, je02.g, je02.j, l(), ce0X1 == null ? null : ce0X1.d(), je02.e());
            je0.m = je0.m;
            C1758Wh1 c1758Wh1 = (C1758Wh1) je02.f0().get(0);
            if (c1758Wh1 == null) {
                JE0.b1(6);
                throw null;
            }
            je0.n = c1758Wh1;
            c6887rh0 = null;
        } else {
            c6887rh0 = null;
            je0 = null;
        }
        c4184hb0.C1(fe0, je0, this.z, this.A);
        ?? r2 = this.i;
        if (r2 != 0) {
            c4184hb0.D1(this.h, r2);
        }
        c4184hb0.H0(j());
        c4184hb0.F1(abstractC0663Ig02, getTypeParameters(), this.u, abstractC0663Ig0 == null ? c6887rh0 : EZ1.h(this, abstractC0663Ig0, S20.b), MN.a);
        return c4184hb0;
    }

    @Override // defpackage.EE0, defpackage.InterfaceC7662vl
    public final Object s(KI ki) {
        Pair pair = this.C;
        if (pair == null || !((KI) pair.a).equals(ki)) {
            return null;
        }
        return pair.b;
    }

    @Override // defpackage.EE0, defpackage.InterfaceC3633ei1
    public final boolean x() {
        AbstractC0663Ig0 type = getType();
        if (this.B) {
            O90.f(type, "type");
            if (((AbstractC8408zg0.F(type) || AbstractC1365Rg1.a(type)) && !AbstractC0112Be1.e(type)) || AbstractC8408zg0.D(type, AbstractC6390p41.f)) {
                K5 k5 = AbstractC2555ce1.a;
                KX kx = AbstractC1118Oc0.p;
                O90.e(kx, "ENHANCED_NULLABILITY_ANNOTATION");
                if (!US1.q(type, kx) || AbstractC8408zg0.D(type, AbstractC6390p41.f)) {
                    return true;
                }
            }
        }
        return false;
    }
}
