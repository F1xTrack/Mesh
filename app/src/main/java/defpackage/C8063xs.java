package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: xs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8063xs extends AbstractC7683vs {
    public final EnumC6348os0 g;
    public final EnumC0152Bs h;
    public final C0620Hs i;
    public InterfaceC5578kq0 j;
    public Set k;
    public C6729qs l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8063xs(CD cd, C1559Tt0 c1559Tt0, EnumC6348os0 enumC6348os0, EnumC0152Bs enumC0152Bs, Collection collection, Z41 z41) {
        C0162Bv0 c0162Bv0 = W21.O0;
        if (cd == null) {
            r(0);
            throw null;
        }
        if (c1559Tt0 == null) {
            r(1);
            throw null;
        }
        if (z41 == null) {
            r(6);
            throw null;
        }
        super(z41, cd, c1559Tt0, c0162Bv0);
        this.g = enumC6348os0;
        this.h = enumC0152Bs;
        this.i = new C0620Hs(this, Collections.emptyList(), collection, z41);
    }

    public static /* synthetic */ void r(int i) {
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
        r(19);
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
        return this.l;
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
        EnumC6348os0 enumC6348os0 = this.g;
        if (enumC6348os0 != null) {
            return enumC6348os0;
        }
        r(16);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final Collection g() {
        Set set = this.k;
        if (set != null) {
            return set;
        }
        r(11);
        throw null;
    }

    @Override // defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        return S20.b;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        C7575vI c7575vI = AbstractC7765wI.e;
        if (c7575vI != null) {
            return c7575vI;
        }
        r(17);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final EnumC0152Bs l() {
        EnumC0152Bs enumC0152Bs = this.h;
        if (enumC0152Bs != null) {
            return enumC0152Bs;
        }
        r(15);
        throw null;
    }

    @Override // defpackage.AbstractC8064xs0
    public final InterfaceC5578kq0 n(C1130Og0 c1130Og0) {
        InterfaceC5578kq0 interfaceC5578kq0 = this.j;
        if (interfaceC5578kq0 != null) {
            return interfaceC5578kq0;
        }
        r(13);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC1165Os
    public final List o() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        r(18);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    public final void u(InterfaceC5578kq0 interfaceC5578kq0, Set set, C6729qs c6729qs) {
        this.j = interfaceC5578kq0;
        this.k = set;
        this.l = c6729qs;
    }

    @Override // defpackage.InterfaceC1087Ns
    public final InterfaceC1200Pd1 v() {
        C0620Hs c0620Hs = this.i;
        if (c0620Hs != null) {
            return c0620Hs;
        }
        r(10);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean w() {
        return false;
    }
}
