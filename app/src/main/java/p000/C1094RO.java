package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: RO */
/* loaded from: classes2.dex */
public final class C1094RO extends AbstractC7039vs {

    /* renamed from: g */
    public final C0496Hs f10151g;

    /* renamed from: h */
    public final C1032QO f10152h;

    /* renamed from: i */
    public final C8426Vk0 f10153i;

    /* renamed from: j */
    public final InterfaceC0510I5 f10154j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1094RO(Z41 z41, InterfaceC6976us interfaceC6976us, X01 x01, C8340Tt0 c8340Tt0, C8426Vk0 c8426Vk0, InterfaceC0510I5 interfaceC0510I5, W21 w21) {
        super(z41, interfaceC6976us, c8340Tt0, w21);
        if (z41 == null) {
            m7008r(6);
            throw null;
        }
        if (interfaceC6976us == null) {
            m7008r(7);
            throw null;
        }
        if (x01 == null) {
            m7008r(8);
            throw null;
        }
        if (c8340Tt0 == null) {
            m7008r(9);
            throw null;
        }
        if (c8426Vk0 == null) {
            m7008r(10);
            throw null;
        }
        this.f10154j = interfaceC0510I5;
        this.f10151g = new C0496Hs(this, Collections.emptyList(), Collections.singleton(x01), z41);
        this.f10152h = new C1032QO(this, z41);
        this.f10153i = c8426Vk0;
    }

    /* renamed from: r */
    public static /* synthetic */ void m7008r(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: u */
    public static C1094RO m7009u(Z41 z41, InterfaceC6976us interfaceC6976us, C8340Tt0 c8340Tt0, C8426Vk0 c8426Vk0, InterfaceC0510I5 interfaceC0510I5, W21 w21) {
        if (z41 == null) {
            m7008r(0);
            throw null;
        }
        if (interfaceC6976us == null) {
            m7008r(1);
            throw null;
        }
        if (c8340Tt0 == null) {
            m7008r(2);
            throw null;
        }
        if (c8426Vk0 != null) {
            return new C1094RO(z41, interfaceC6976us, interfaceC6976us.mo1492m(), c8340Tt0, c8426Vk0, interfaceC0510I5, w21);
        }
        m7008r(3);
        throw null;
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
        m7008r(23);
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
        return null;
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
        return EnumC10575os0.f39323b;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: g */
    public final Collection mo1435g() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m7008r(16);
        throw null;
    }

    @Override // p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        InterfaceC0510I5 interfaceC0510I5 = this.f10154j;
        if (interfaceC0510I5 != null) {
            return interfaceC0510I5;
        }
        m7008r(21);
        throw null;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0455HD, p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        C7003vI c7003vI = AbstractC7066wI.f44764e;
        if (c7003vI != null) {
            return c7003vI;
        }
        m7008r(20);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    public final boolean isInline() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: l */
    public final EnumC0118Bs mo1436l() {
        return EnumC0118Bs.f1063d;
    }

    @Override // p000.AbstractC11725xs0
    /* renamed from: n */
    public final InterfaceC10059kq0 mo1437n(C8054Og0 c8054Og0) {
        C1032QO c1032qo = this.f10152h;
        if (c1032qo != null) {
            return c1032qo;
        }
        m7008r(14);
        throw null;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0936Os
    /* renamed from: o */
    public final List mo1438o() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m7008r(22);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: v */
    public final InterfaceC8101Pd1 mo1439v() {
        C0496Hs c0496Hs = this.f10151g;
        if (c0496Hs != null) {
            return c0496Hs;
        }
        m7008r(17);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: w */
    public final boolean mo1440w() {
        return false;
    }
}
