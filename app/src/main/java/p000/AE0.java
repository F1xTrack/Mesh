package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class AE0 extends AbstractC0329FD implements InterfaceC11899zE0 {

    /* renamed from: f */
    public boolean f112f;

    /* renamed from: g */
    public final boolean f113g;

    /* renamed from: h */
    public final EnumC10575os0 f114h;

    /* renamed from: i */
    public final CE0 f115i;

    /* renamed from: j */
    public final boolean f116j;

    /* renamed from: k */
    public final int f117k;

    /* renamed from: l */
    public C7003vI f118l;

    /* renamed from: m */
    public InterfaceC0036AZ f119m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AE0(EnumC10575os0 enumC10575os0, C7003vI c7003vI, CE0 ce0, InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0, boolean z, boolean z2, boolean z3, int i, W21 w21) {
        super(ce0.mo423i(), interfaceC0510I5, c8340Tt0, w21);
        if (enumC10575os0 == null) {
            m106b1(0);
            throw null;
        }
        if (c7003vI == null) {
            m106b1(1);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m106b1(3);
            throw null;
        }
        if (w21 == null) {
            m106b1(5);
            throw null;
        }
        this.f119m = null;
        this.f114h = enumC10575os0;
        this.f118l = c7003vI;
        this.f115i = ce0;
        this.f112f = z;
        this.f113g = z2;
        this.f116j = z3;
        this.f117k = i;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m106b1(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: F */
    public final boolean mo107F() {
        return false;
    }

    @Override // p000.InterfaceC0036AZ
    /* renamed from: G0 */
    public final boolean mo108G0() {
        return false;
    }

    @Override // p000.InterfaceC7158xl
    /* renamed from: H0 */
    public final void mo109H0(Collection collection) {
        if (collection != null) {
            return;
        }
        m106b1(16);
        throw null;
    }

    @Override // p000.InterfaceC0036AZ
    /* renamed from: L0 */
    public final boolean mo110L0() {
        return false;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: M */
    public final boolean mo111M() {
        return false;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: Q0 */
    public final boolean mo112Q0() {
        return false;
    }

    @Override // p000.InterfaceC0036AZ
    /* renamed from: S */
    public final boolean mo113S() {
        return false;
    }

    @Override // p000.InterfaceC0036AZ, p000.R51
    /* renamed from: b */
    public final InterfaceC0036AZ mo114b(C11571we1 c11571we1) {
        if (c11571we1 != null) {
            return this;
        }
        m106b1(7);
        throw null;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: f */
    public final EnumC10575os0 mo115f() {
        EnumC10575os0 enumC10575os0 = this.f114h;
        if (enumC10575os0 != null) {
            return enumC10575os0;
        }
        m106b1(10);
        throw null;
    }

    @Override // p000.InterfaceC7032vl
    public final List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m106b1(9);
        throw null;
    }

    @Override // p000.InterfaceC0455HD, p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        C7003vI c7003vI = this.f118l;
        if (c7003vI != null) {
            return c7003vI;
        }
        m106b1(11);
        throw null;
    }

    @Override // p000.InterfaceC8902bq0
    public final boolean isExternal() {
        return this.f113g;
    }

    @Override // p000.InterfaceC0036AZ
    public final boolean isInfix() {
        return false;
    }

    @Override // p000.InterfaceC0036AZ
    public final boolean isInline() {
        return this.f116j;
    }

    @Override // p000.InterfaceC0036AZ
    public final boolean isOperator() {
        return false;
    }

    @Override // p000.InterfaceC0036AZ
    public final boolean isSuspend() {
        return false;
    }

    @Override // p000.InterfaceC7158xl
    /* renamed from: l */
    public final int mo116l() {
        int i = this.f117k;
        if (i != 0) {
            return i;
        }
        m106b1(6);
        throw null;
    }

    @Override // p000.InterfaceC7158xl
    /* renamed from: m0 */
    public final InterfaceC7158xl mo117m0(InterfaceC6976us interfaceC6976us, EnumC10575os0 enumC10575os0, C7003vI c7003vI) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // p000.InterfaceC0036AZ
    /* renamed from: o0 */
    public final InterfaceC0036AZ mo118o0() {
        return this.f119m;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: q0 */
    public final C10937rh0 mo119q0() {
        return m123y1().mo119q0();
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: s */
    public final Object mo120s(C0649KI c0649ki) {
        return null;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: t0 */
    public final C10937rh0 mo121t0() {
        return m123y1().mo121t0();
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: x0 */
    public final List mo122x0() {
        List listMo122x0 = m123y1().mo122x0();
        if (listMo122x0 != null) {
            return listMo122x0;
        }
        m106b1(14);
        throw null;
    }

    /* renamed from: y1 */
    public final CE0 m123y1() {
        CE0 ce0 = this.f115i;
        if (ce0 != null) {
            return ce0;
        }
        m106b1(13);
        throw null;
    }

    /* renamed from: z1 */
    public final ArrayList m124z1(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (CE0 ce0 : m123y1().mo1222j()) {
            AbstractC0203DD abstractC0203DDMo1121c = z ? ce0.mo1121c() : ce0.mo1122d();
            if (abstractC0203DDMo1121c != null) {
                arrayList.add(abstractC0203DDMo1121c);
            }
        }
        return arrayList;
    }

    @Override // p000.R51
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC0266ED mo114b(C11571we1 c11571we1) {
        mo114b(c11571we1);
        return this;
    }
}
