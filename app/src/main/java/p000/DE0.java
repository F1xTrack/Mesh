package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class DE0 {

    /* renamed from: a */
    public InterfaceC0140CD f1904a;

    /* renamed from: b */
    public EnumC10575os0 f1905b;

    /* renamed from: c */
    public C7003vI f1906c;

    /* renamed from: e */
    public int f1908e;

    /* renamed from: h */
    public final C10937rh0 f1911h;

    /* renamed from: i */
    public final C8340Tt0 f1912i;

    /* renamed from: j */
    public final AbstractC7742Ig0 f1913j;

    /* renamed from: k */
    public final /* synthetic */ EE0 f1914k;

    /* renamed from: d */
    public CE0 f1907d = null;

    /* renamed from: f */
    public AbstractC11316ue1 f1909f = AbstractC11316ue1.f43786a;

    /* renamed from: g */
    public boolean f1910g = true;

    public DE0(EE0 ee0) {
        this.f1914k = ee0;
        this.f1904a = ee0.mo423i();
        this.f1905b = ee0.mo115f();
        this.f1906c = ee0.getVisibility();
        this.f1908e = ee0.mo116l();
        this.f1911h = ee0.f2559u;
        this.f1912i = ee0.getName();
        this.f1913j = ee0.getType();
    }

    /* renamed from: a */
    public static /* synthetic */ void m1599a(int i) {
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
    /* renamed from: b */
    public final EE0 m1600b() {
        C10937rh0 c10937rh0;
        C10937rh0 c10937rh02;
        FE0 fe0;
        JE0 je0;
        ?? r2;
        C10937rh0 c10937rh03;
        C10937rh0 c10937rh04;
        EE0 ee0 = this.f1914k;
        ee0.getClass();
        InterfaceC0140CD interfaceC0140CD = this.f1904a;
        EnumC10575os0 enumC10575os0 = this.f1905b;
        C7003vI c7003vI = this.f1906c;
        CE0 ce0 = this.f1907d;
        int i = this.f1908e;
        C7408Bv0 c7408Bv0 = W21.f12940O0;
        EE0 ee0Mo2081A1 = ee0.mo2081A1(interfaceC0140CD, enumC10575os0, c7003vI, ce0, i, this.f1912i);
        List typeParameters = ee0.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        C11571we1 c11571we1M3511g = HZ1.m3511g(typeParameters, this.f1909f, ee0Mo2081A1, arrayList);
        EnumC9532gi1 enumC9532gi1 = EnumC9532gi1.f27949e;
        AbstractC7742Ig0 abstractC7742Ig0 = this.f1913j;
        AbstractC7742Ig0 abstractC7742Ig0M25667i = c11571we1M3511g.m25667i(abstractC7742Ig0, enumC9532gi1);
        if (abstractC7742Ig0M25667i != null) {
            EnumC9532gi1 enumC9532gi12 = EnumC9532gi1.f27948d;
            AbstractC7742Ig0 abstractC7742Ig0M25667i2 = c11571we1M3511g.m25667i(abstractC7742Ig0, enumC9532gi12);
            if (abstractC7742Ig0M25667i2 != null) {
                ee0Mo2081A1.mo2084E1(abstractC7742Ig0M25667i2);
            }
            C10937rh0 c10937rh05 = this.f1911h;
            if (c10937rh05 != null) {
                C10937rh0 c10937rh0Mo114b = c10937rh05.mo114b(c11571we1M3511g);
                c10937rh0 = c10937rh0Mo114b != null ? c10937rh0Mo114b : null;
            }
            C10937rh0 c10937rh06 = ee0.f2560v;
            if (c10937rh06 != null) {
                AbstractC7742Ig0 abstractC7742Ig0M25667i3 = c11571we1M3511g.m25667i(c10937rh06.getType(), enumC9532gi12);
                if (abstractC7742Ig0M25667i3 == null) {
                    c10937rh04 = null;
                } else {
                    c10937rh06.m24452y1();
                    c10937rh04 = new C10937rh0(ee0Mo2081A1, new C7201yR(ee0Mo2081A1, abstractC7742Ig0M25667i3), c10937rh06.getAnnotations());
                }
                c10937rh02 = c10937rh04;
            } else {
                c10937rh02 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C10937rh0 c10937rh07 : ee0.f2558t) {
                AbstractC7742Ig0 abstractC7742Ig0M25667i4 = c11571we1M3511g.m25667i(c10937rh07.getType(), EnumC9532gi1.f27948d);
                if (abstractC7742Ig0M25667i4 == null) {
                    c10937rh03 = null;
                } else {
                    C8340Tt0 c8340Tt0M4089w1 = ((C0565Iy) c10937rh07.m24452y1()).m4089w1();
                    c10937rh07.m24452y1();
                    c10937rh03 = new C10937rh0(ee0Mo2081A1, new C0565Iy(ee0Mo2081A1, abstractC7742Ig0M25667i4, c8340Tt0M4089w1), c10937rh07.getAnnotations());
                }
                if (c10937rh03 != null) {
                    arrayList2.add(c10937rh03);
                }
            }
            ee0Mo2081A1.m2085F1(abstractC7742Ig0M25667i, arrayList, c10937rh0, c10937rh02, arrayList2);
            FE0 fe02 = ee0.f2562x;
            if (fe02 == null) {
                fe0 = null;
            } else {
                InterfaceC0510I5 annotations = fe02.getAnnotations();
                EnumC10575os0 enumC10575os02 = this.f1905b;
                C7003vI visibility = ee0.f2562x.getVisibility();
                if (this.f1908e == 2 && AbstractC7066wI.m25591e(AbstractC7066wI.m25592f(visibility.f44322a.mo3952m()))) {
                    visibility = AbstractC7066wI.f44767h;
                }
                C7003vI c7003vI2 = visibility;
                FE0 fe03 = ee0.f2562x;
                boolean z = fe03.f112f;
                int i2 = this.f1908e;
                CE0 ce02 = this.f1907d;
                fe0 = new FE0(ee0Mo2081A1, annotations, enumC10575os02, c7003vI2, z, fe03.f113g, fe03.f116j, i2, ce02 == null ? null : ce02.mo1121c(), c7408Bv0);
            }
            if (fe0 != null) {
                FE0 fe04 = ee0.f2562x;
                AbstractC7742Ig0 abstractC7742Ig02 = fe04.f3093n;
                fe0.f119m = EE0.m2077B1(c11571we1M3511g, fe04);
                fe0.m2559B1(abstractC7742Ig02 != null ? c11571we1M3511g.m25667i(abstractC7742Ig02, EnumC9532gi1.f27949e) : null);
            }
            JE0 je02 = ee0.f2563y;
            if (je02 == null) {
                je0 = null;
            } else {
                InterfaceC0510I5 annotations2 = je02.getAnnotations();
                EnumC10575os0 enumC10575os03 = this.f1905b;
                C7003vI visibility2 = ee0.f2563y.getVisibility();
                if (this.f1908e == 2 && AbstractC7066wI.m25591e(AbstractC7066wI.m25592f(visibility2.f44322a.mo3952m()))) {
                    visibility2 = AbstractC7066wI.f44767h;
                }
                C7003vI c7003vI3 = visibility2;
                JE0 je03 = ee0.f2563y;
                boolean z2 = je03.f112f;
                int i3 = this.f1908e;
                CE0 ce03 = this.f1907d;
                je0 = new JE0(ee0Mo2081A1, annotations2, enumC10575os03, c7003vI3, z2, je03.f113g, je03.f116j, i3, ce03 == null ? null : ce03.mo1122d(), c7408Bv0);
            }
            if (je0 != null) {
                List listM1212C1 = AbstractC0162CZ.m1212C1(je0, ee0.f2563y.mo1221f0(), c11571we1M3511g, false, false, null);
                if (listM1212C1 == null) {
                    listM1212C1 = Collections.singletonList(JE0.m4254A1(je0, AbstractC6940uI.m25152e(this.f1904a).m26506n(), ((C8473Wh1) ee0.f2563y.mo1221f0().get(0)).getAnnotations()));
                }
                if (listM1212C1.size() != 1) {
                    throw new IllegalStateException();
                }
                je0.f119m = EE0.m2077B1(c11571we1M3511g, ee0.f2563y);
                C8473Wh1 c8473Wh1 = (C8473Wh1) listM1212C1.get(0);
                if (c8473Wh1 == null) {
                    JE0.m4255b1(6);
                    throw null;
                }
                je0.f5400n = c8473Wh1;
            }
            C3930dT c3930dT = ee0.f2564z;
            C3930dT c3930dT2 = c3930dT == null ? null : new C3930dT(c3930dT.getAnnotations(), ee0Mo2081A1);
            C3930dT c3930dT3 = ee0.f2544A;
            ee0Mo2081A1.m2082C1(fe0, je0, c3930dT2, c3930dT3 != null ? new C3930dT(c3930dT3.getAnnotations(), ee0Mo2081A1) : null);
            if (this.f1910g) {
                C11748y21 c11748y21 = new C11748y21();
                Iterator it = ee0.mo1222j().iterator();
                while (it.hasNext()) {
                    c11748y21.add(((CE0) it.next()).mo114b(c11571we1M3511g));
                }
                ee0Mo2081A1.f2550l = c11748y21;
            }
            if (!ee0.mo2088x() || (r2 = ee0.f2547i) == 0) {
                return ee0Mo2081A1;
            }
            ee0Mo2081A1.m2083D1(ee0.f2546h, r2);
            return ee0Mo2081A1;
        }
        return null;
    }
}
