package defpackage;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import io.appmetrica.analytics.impl.C4473c9;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class BZ implements InterfaceC8386zZ {
    public AbstractC7452ue1 a;
    public CD b;
    public EnumC6348os0 c;
    public C7575vI d;
    public AZ e;
    public int f;
    public List g;
    public final List h;
    public C6887rh0 i;
    public C6887rh0 j;
    public AbstractC0663Ig0 k;
    public C1559Tt0 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public MN r;
    public I5 s;
    public boolean t;
    public final LinkedHashMap u;
    public Boolean v;
    public boolean w;
    public final /* synthetic */ CZ x;

    public BZ(CZ cz, AbstractC7452ue1 abstractC7452ue1, CD cd, EnumC6348os0 enumC6348os0, C7575vI c7575vI, int i, List list, List list2, C6887rh0 c6887rh0, AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC7452ue1 == null) {
            b(0);
            throw null;
        }
        if (cd == null) {
            b(1);
            throw null;
        }
        if (enumC6348os0 == null) {
            b(2);
            throw null;
        }
        if (c7575vI == null) {
            b(3);
            throw null;
        }
        if (i == 0) {
            b(4);
            throw null;
        }
        if (list == null) {
            b(5);
            throw null;
        }
        if (list2 == null) {
            b(6);
            throw null;
        }
        if (abstractC0663Ig0 == null) {
            b(7);
            throw null;
        }
        this.x = cz;
        this.e = null;
        this.j = cz.k;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = cz.t;
        this.r = null;
        this.s = null;
        this.t = cz.u;
        this.u = new LinkedHashMap();
        this.v = null;
        this.w = false;
        this.a = abstractC7452ue1;
        this.b = cd;
        this.c = enumC6348os0;
        this.d = c7575vI;
        this.f = i;
        this.g = list;
        this.h = list2;
        this.i = c6887rh0;
        this.k = abstractC0663Ig0;
        this.l = null;
    }

    public static /* synthetic */ void b(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case C4473c9.K /* 38 */:
            case C4473c9.L /* 40 */:
            case 41:
            case C4473c9.M /* 42 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case C4473c9.J /* 35 */:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case C4473c9.K /* 38 */:
            case C4473c9.L /* 40 */:
            case 41:
            case C4473c9.M /* 42 */:
                i2 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case C4473c9.J /* 35 */:
            case 37:
            case 39:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case C4473c9.K /* 38 */:
            case C4473c9.L /* 40 */:
            case 41:
            case C4473c9.M /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case C4473c9.J /* 35 */:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case C4473c9.J /* 35 */:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case C4473c9.K /* 38 */:
                objArr[1] = "setSubstitution";
                break;
            case C4473c9.L /* 40 */:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case C4473c9.M /* 42 */:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case C4473c9.K /* 38 */:
            case C4473c9.L /* 40 */:
            case 41:
            case C4473c9.M /* 42 */:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case C4473c9.J /* 35 */:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
            case C4473c9.K /* 38 */:
            case C4473c9.L /* 40 */:
            case 41:
            case C4473c9.M /* 42 */:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case C4473c9.J /* 35 */:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ A(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 != null) {
            this.k = abstractC0663Ig0;
            return this;
        }
        b(23);
        throw null;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ C() {
        this.q = true;
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ D(C1559Tt0 c1559Tt0) {
        if (c1559Tt0 != null) {
            this.l = c1559Tt0;
            return this;
        }
        b(17);
        throw null;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ E() {
        this.n = true;
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final AZ a() {
        return this.x.B1(this);
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ j(List list) {
        this.g = list;
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ o(int i) {
        if (i != 0) {
            this.f = i;
            return this;
        }
        b(14);
        throw null;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ p(C6887rh0 c6887rh0) {
        this.j = c6887rh0;
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ q(InterfaceC7492us interfaceC7492us) {
        if (interfaceC7492us != null) {
            this.b = interfaceC7492us;
            return this;
        }
        b(8);
        throw null;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ r() {
        this.o = true;
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ s() {
        this.u.put(C3611eb0.H, Boolean.TRUE);
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ t() {
        this.t = true;
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ u(I5 i5) {
        if (i5 != null) {
            this.s = i5;
            return this;
        }
        b(35);
        throw null;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ w(C7575vI c7575vI) {
        if (c7575vI != null) {
            this.d = c7575vI;
            return this;
        }
        b(12);
        throw null;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ x() {
        this.m = false;
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ y(EnumC6348os0 enumC6348os0) {
        if (enumC6348os0 != null) {
            this.c = enumC6348os0;
            return this;
        }
        b(10);
        throw null;
    }

    @Override // defpackage.InterfaceC8386zZ
    public final InterfaceC8386zZ z() {
        this.r = MN.a;
        return this;
    }
}
