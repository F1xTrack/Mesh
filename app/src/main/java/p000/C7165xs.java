package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: xs */
/* loaded from: classes2.dex */
public class C7165xs extends AbstractC7039vs {

    /* renamed from: g */
    public final EnumC10575os0 f45861g;

    /* renamed from: h */
    public final EnumC0118Bs f45862h;

    /* renamed from: i */
    public final C0496Hs f45863i;

    /* renamed from: j */
    public InterfaceC10059kq0 f45864j;

    /* renamed from: k */
    public Set f45865k;

    /* renamed from: l */
    public C6707qs f45866l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7165xs(InterfaceC0140CD interfaceC0140CD, C8340Tt0 c8340Tt0, EnumC10575os0 enumC10575os0, EnumC0118Bs enumC0118Bs, Collection collection, Z41 z41) {
        C7408Bv0 c7408Bv0 = W21.f12940O0;
        if (interfaceC0140CD == null) {
            m25951r(0);
            throw null;
        }
        if (c8340Tt0 == null) {
            m25951r(1);
            throw null;
        }
        if (z41 == null) {
            m25951r(6);
            throw null;
        }
        super(z41, interfaceC0140CD, c8340Tt0, c7408Bv0);
        this.f45861g = enumC10575os0;
        this.f45862h = enumC0118Bs;
        this.f45863i = new C0496Hs(this, Collections.emptyList(), collection, z41);
    }

    /* renamed from: r */
    public static /* synthetic */ void m25951r(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: A */
    public final boolean mo1427A() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: J */
    public final Collection mo1428J() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m25951r(19);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: J0 */
    public final AbstractC8057Oh1 mo1429J0() {
        return null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: K */
    public final boolean mo1430K() {
        return false;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: M */
    public final boolean mo111M() {
        return false;
    }

    @Override // p000.InterfaceC0936Os
    /* renamed from: N */
    public final boolean mo1431N() {
        return false;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: Q0 */
    public final boolean mo112Q0() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: V */
    public final C6707qs mo1432V() {
        return this.f45866l;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: W */
    public final InterfaceC10059kq0 mo1433W() {
        return C9931jq0.f35419b;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: X0 */
    public final boolean mo1434X0() {
        return false;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC8902bq0
    /* renamed from: f */
    public final EnumC10575os0 mo115f() {
        EnumC10575os0 enumC10575os0 = this.f45861g;
        if (enumC10575os0 != null) {
            return enumC10575os0;
        }
        m25951r(16);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: g */
    public final Collection mo1435g() {
        Set set = this.f45865k;
        if (set != null) {
            return set;
        }
        m25951r(11);
        throw null;
    }

    @Override // p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        return S20.f10539b;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0455HD, p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        C7003vI c7003vI = AbstractC7066wI.f44764e;
        if (c7003vI != null) {
            return c7003vI;
        }
        m25951r(17);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    public final boolean isInline() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: l */
    public final EnumC0118Bs mo1436l() {
        EnumC0118Bs enumC0118Bs = this.f45862h;
        if (enumC0118Bs != null) {
            return enumC0118Bs;
        }
        m25951r(15);
        throw null;
    }

    @Override // p000.AbstractC11725xs0
    /* renamed from: n */
    public final InterfaceC10059kq0 mo1437n(C8054Og0 c8054Og0) {
        InterfaceC10059kq0 interfaceC10059kq0 = this.f45864j;
        if (interfaceC10059kq0 != null) {
            return interfaceC10059kq0;
        }
        m25951r(13);
        throw null;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0936Os
    /* renamed from: o */
    public final List mo1438o() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m25951r(18);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    /* renamed from: u */
    public final void m25952u(InterfaceC10059kq0 interfaceC10059kq0, Set set, C6707qs c6707qs) {
        this.f45864j = interfaceC10059kq0;
        this.f45865k = set;
        this.f45866l = c6707qs;
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: v */
    public final InterfaceC8101Pd1 mo1439v() {
        C0496Hs c0496Hs = this.f45863i;
        if (c0496Hs != null) {
            return c0496Hs;
        }
        m25951r(10);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: w */
    public final boolean mo1440w() {
        return false;
    }
}
