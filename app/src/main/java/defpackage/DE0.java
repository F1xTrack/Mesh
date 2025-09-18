package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class DE0 {
    public CD a;
    public EnumC6348os0 b;
    public C7575vI c;
    public int e;
    public final C6887rh0 h;
    public final C1559Tt0 i;
    public final AbstractC0663Ig0 j;
    public final /* synthetic */ EE0 k;
    public CE0 d = null;
    public AbstractC7452ue1 f = AbstractC7452ue1.a;
    public boolean g = true;

    public DE0(EE0 ee0) {
        this.k = ee0;
        this.a = ee0.i();
        this.b = ee0.f();
        this.c = ee0.getVisibility();
        this.e = ee0.l();
        this.h = ee0.u;
        this.i = ee0.getName();
        this.j = ee0.getType();
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i == 1) {
            objArr[1] = "setOwner";
        } else if (i == 2) {
            objArr[1] = "setOriginal";
        } else if (i == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i == 5) {
            objArr[1] = "setReturnType";
        } else if (i == 7) {
            objArr[1] = "setModality";
        } else if (i == 9) {
            objArr[1] = "setVisibility";
        } else if (i == 11) {
            objArr[1] = "setKind";
        } else if (i == 19) {
            objArr[1] = "setName";
        } else if (i == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i == 16) {
            objArr[1] = "setSubstitution";
        } else if (i != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [Vg0, mZ] */
    public final EE0 b() {
        C6887rh0 c6887rh0;
        C6887rh0 c6887rh02;
        FE0 fe0;
        JE0 je0;
        ?? r2;
        C6887rh0 c6887rh03;
        C6887rh0 c6887rh04;
        EE0 ee0 = this.k;
        ee0.getClass();
        CD cd = this.a;
        EnumC6348os0 enumC6348os0 = this.b;
        C7575vI c7575vI = this.c;
        CE0 ce0 = this.d;
        int i = this.e;
        C0162Bv0 c0162Bv0 = W21.O0;
        EE0 ee0A1 = ee0.A1(cd, enumC6348os0, c7575vI, ce0, i, this.i);
        List typeParameters = ee0.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        C7833we1 c7833we1G = HZ1.g(typeParameters, this.f, ee0A1, arrayList);
        EnumC4015gi1 enumC4015gi1 = EnumC4015gi1.e;
        AbstractC0663Ig0 abstractC0663Ig0 = this.j;
        AbstractC0663Ig0 abstractC0663Ig0I = c7833we1G.i(abstractC0663Ig0, enumC4015gi1);
        if (abstractC0663Ig0I != null) {
            EnumC4015gi1 enumC4015gi12 = EnumC4015gi1.d;
            AbstractC0663Ig0 abstractC0663Ig0I2 = c7833we1G.i(abstractC0663Ig0, enumC4015gi12);
            if (abstractC0663Ig0I2 != null) {
                ee0A1.E1(abstractC0663Ig0I2);
            }
            C6887rh0 c6887rh05 = this.h;
            if (c6887rh05 != null) {
                C6887rh0 c6887rh0B = c6887rh05.b(c7833we1G);
                c6887rh0 = c6887rh0B != null ? c6887rh0B : null;
            }
            C6887rh0 c6887rh06 = ee0.v;
            if (c6887rh06 != null) {
                AbstractC0663Ig0 abstractC0663Ig0I3 = c7833we1G.i(c6887rh06.getType(), enumC4015gi12);
                if (abstractC0663Ig0I3 == null) {
                    c6887rh04 = null;
                } else {
                    c6887rh06.y1();
                    c6887rh04 = new C6887rh0(ee0A1, new C8172yR(ee0A1, abstractC0663Ig0I3), c6887rh06.getAnnotations());
                }
                c6887rh02 = c6887rh04;
            } else {
                c6887rh02 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C6887rh0 c6887rh07 : ee0.t) {
                AbstractC0663Ig0 abstractC0663Ig0I4 = c7833we1G.i(c6887rh07.getType(), EnumC4015gi1.d);
                if (abstractC0663Ig0I4 == null) {
                    c6887rh03 = null;
                } else {
                    C1559Tt0 c1559Tt0W1 = ((C0716Iy) c6887rh07.y1()).w1();
                    c6887rh07.y1();
                    c6887rh03 = new C6887rh0(ee0A1, new C0716Iy(ee0A1, abstractC0663Ig0I4, c1559Tt0W1), c6887rh07.getAnnotations());
                }
                if (c6887rh03 != null) {
                    arrayList2.add(c6887rh03);
                }
            }
            ee0A1.F1(abstractC0663Ig0I, arrayList, c6887rh0, c6887rh02, arrayList2);
            FE0 fe02 = ee0.x;
            if (fe02 == null) {
                fe0 = null;
            } else {
                I5 annotations = fe02.getAnnotations();
                EnumC6348os0 enumC6348os02 = this.b;
                C7575vI visibility = ee0.x.getVisibility();
                if (this.e == 2 && AbstractC7765wI.e(AbstractC7765wI.f(visibility.a.m()))) {
                    visibility = AbstractC7765wI.h;
                }
                C7575vI c7575vI2 = visibility;
                FE0 fe03 = ee0.x;
                boolean z = fe03.f;
                int i2 = this.e;
                CE0 ce02 = this.d;
                fe0 = new FE0(ee0A1, annotations, enumC6348os02, c7575vI2, z, fe03.g, fe03.j, i2, ce02 == null ? null : ce02.c(), c0162Bv0);
            }
            if (fe0 != null) {
                FE0 fe04 = ee0.x;
                AbstractC0663Ig0 abstractC0663Ig02 = fe04.n;
                fe0.m = EE0.B1(c7833we1G, fe04);
                fe0.B1(abstractC0663Ig02 != null ? c7833we1G.i(abstractC0663Ig02, EnumC4015gi1.e) : null);
            }
            JE0 je02 = ee0.y;
            if (je02 == null) {
                je0 = null;
            } else {
                I5 annotations2 = je02.getAnnotations();
                EnumC6348os0 enumC6348os03 = this.b;
                C7575vI visibility2 = ee0.y.getVisibility();
                if (this.e == 2 && AbstractC7765wI.e(AbstractC7765wI.f(visibility2.a.m()))) {
                    visibility2 = AbstractC7765wI.h;
                }
                C7575vI c7575vI3 = visibility2;
                JE0 je03 = ee0.y;
                boolean z2 = je03.f;
                int i3 = this.e;
                CE0 ce03 = this.d;
                je0 = new JE0(ee0A1, annotations2, enumC6348os03, c7575vI3, z2, je03.g, je03.j, i3, ce03 == null ? null : ce03.d(), c0162Bv0);
            }
            if (je0 != null) {
                List listC1 = CZ.C1(je0, ee0.y.f0(), c7833we1G, false, false, null);
                if (listC1 == null) {
                    listC1 = Collections.singletonList(JE0.A1(je0, AbstractC7384uI.e(this.a).n(), ((C1758Wh1) ee0.y.f0().get(0)).getAnnotations()));
                }
                if (listC1.size() != 1) {
                    throw new IllegalStateException();
                }
                je0.m = EE0.B1(c7833we1G, ee0.y);
                C1758Wh1 c1758Wh1 = (C1758Wh1) listC1.get(0);
                if (c1758Wh1 == null) {
                    JE0.b1(6);
                    throw null;
                }
                je0.n = c1758Wh1;
            }
            C3396dT c3396dT = ee0.z;
            C3396dT c3396dT2 = c3396dT == null ? null : new C3396dT(c3396dT.getAnnotations(), ee0A1);
            C3396dT c3396dT3 = ee0.A;
            ee0A1.C1(fe0, je0, c3396dT2, c3396dT3 != null ? new C3396dT(c3396dT3.getAnnotations(), ee0A1) : null);
            if (this.g) {
                C8098y21 c8098y21 = new C8098y21();
                Iterator it = ee0.j().iterator();
                while (it.hasNext()) {
                    c8098y21.add(((CE0) it.next()).b(c7833we1G));
                }
                ee0A1.l = c8098y21;
            }
            if (!ee0.x() || (r2 = ee0.i) == 0) {
                return ee0A1;
            }
            ee0A1.D1(ee0.h, r2);
            return ee0A1;
        }
        return null;
    }
}
