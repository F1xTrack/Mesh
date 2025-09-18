package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class RO extends AbstractC7683vs {
    public final C0620Hs g;
    public final QO h;
    public final C1688Vk0 i;
    public final I5 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RO(Z41 z41, InterfaceC7492us interfaceC7492us, X01 x01, C1559Tt0 c1559Tt0, C1688Vk0 c1688Vk0, I5 i5, W21 w21) {
        super(z41, interfaceC7492us, c1559Tt0, w21);
        if (z41 == null) {
            r(6);
            throw null;
        }
        if (interfaceC7492us == null) {
            r(7);
            throw null;
        }
        if (x01 == null) {
            r(8);
            throw null;
        }
        if (c1559Tt0 == null) {
            r(9);
            throw null;
        }
        if (c1688Vk0 == null) {
            r(10);
            throw null;
        }
        this.j = i5;
        this.g = new C0620Hs(this, Collections.emptyList(), Collections.singleton(x01), z41);
        this.h = new QO(this, z41);
        this.i = c1688Vk0;
    }

    public static /* synthetic */ void r(int i) {
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

    public static RO u(Z41 z41, InterfaceC7492us interfaceC7492us, C1559Tt0 c1559Tt0, C1688Vk0 c1688Vk0, I5 i5, W21 w21) {
        if (z41 == null) {
            r(0);
            throw null;
        }
        if (interfaceC7492us == null) {
            r(1);
            throw null;
        }
        if (c1559Tt0 == null) {
            r(2);
            throw null;
        }
        if (c1688Vk0 != null) {
            return new RO(z41, interfaceC7492us, interfaceC7492us.m(), c1559Tt0, c1688Vk0, i5, w21);
        }
        r(3);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean A() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final Collection J() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        r(23);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final AbstractC1134Oh1 J0() {
        return null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean K() {
        return false;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean M() {
        return false;
    }

    @Override // defpackage.InterfaceC1165Os
    public final boolean N() {
        return false;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean Q0() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final C6729qs V() {
        return null;
    }

    @Override // defpackage.InterfaceC7492us
    public final InterfaceC5578kq0 W() {
        return C5387jq0.b;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean X0() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC2400bq0
    public final EnumC6348os0 f() {
        return EnumC6348os0.b;
    }

    @Override // defpackage.InterfaceC7492us
    public final Collection g() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        r(16);
        throw null;
    }

    @Override // defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        I5 i5 = this.j;
        if (i5 != null) {
            return i5;
        }
        r(21);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        C7575vI c7575vI = AbstractC7765wI.e;
        if (c7575vI != null) {
            return c7575vI;
        }
        r(20);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final EnumC0152Bs l() {
        return EnumC0152Bs.d;
    }

    @Override // defpackage.AbstractC8064xs0
    public final InterfaceC5578kq0 n(C1130Og0 c1130Og0) {
        QO qo = this.h;
        if (qo != null) {
            return qo;
        }
        r(14);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC1165Os
    public final List o() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        r(22);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // defpackage.InterfaceC1087Ns
    public final InterfaceC1200Pd1 v() {
        C0620Hs c0620Hs = this.g;
        if (c0620Hs != null) {
            return c0620Hs;
        }
        r(17);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean w() {
        return false;
    }
}
