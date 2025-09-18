package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: Ct0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0234Ct0 extends AbstractC7683vs {
    public final EnumC0152Bs g;
    public EnumC6348os0 h;
    public C7575vI i;
    public C0620Hs j;
    public ArrayList k;
    public final ArrayList l;
    public final C1220Pk0 m;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0234Ct0(ON on, C1559Tt0 c1559Tt0, C1220Pk0 c1220Pk0) {
        EnumC0152Bs enumC0152Bs = EnumC0152Bs.b;
        C0162Bv0 c0162Bv0 = W21.O0;
        if (c1559Tt0 == null) {
            r(2);
            throw null;
        }
        if (c1220Pk0 == null) {
            r(4);
            throw null;
        }
        super(c1220Pk0, on, c1559Tt0, c0162Bv0);
        this.l = new ArrayList();
        this.m = c1220Pk0;
        this.g = enumC0152Bs;
    }

    public static /* synthetic */ void r(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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
        EnumC6348os0 enumC6348os0 = this.h;
        if (enumC6348os0 != null) {
            return enumC6348os0;
        }
        r(7);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final Collection g() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        r(13);
        throw null;
    }

    @Override // defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        return S20.b;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        C7575vI c7575vI = this.i;
        if (c7575vI != null) {
            return c7575vI;
        }
        r(10);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final EnumC0152Bs l() {
        EnumC0152Bs enumC0152Bs = this.g;
        if (enumC0152Bs != null) {
            return enumC0152Bs;
        }
        r(8);
        throw null;
    }

    @Override // defpackage.AbstractC8064xs0
    public final InterfaceC5578kq0 n(C1130Og0 c1130Og0) {
        return C5387jq0.b;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC1165Os
    public final List o() {
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            return arrayList;
        }
        r(15);
        throw null;
    }

    public final String toString() {
        return DD.w1(this);
    }

    @Override // defpackage.InterfaceC1087Ns
    public final InterfaceC1200Pd1 v() {
        C0620Hs c0620Hs = this.j;
        if (c0620Hs != null) {
            return c0620Hs;
        }
        r(11);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean w() {
        return false;
    }
}
