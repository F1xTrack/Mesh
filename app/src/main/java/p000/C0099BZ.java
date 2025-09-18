package p000;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import io.appmetrica.analytics.impl.C5043c9;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: BZ */
/* loaded from: classes2.dex */
public final class C0099BZ implements InterfaceC7272zZ {

    /* renamed from: a */
    public AbstractC11316ue1 f880a;

    /* renamed from: b */
    public InterfaceC0140CD f881b;

    /* renamed from: c */
    public EnumC10575os0 f882c;

    /* renamed from: d */
    public C7003vI f883d;

    /* renamed from: e */
    public InterfaceC0036AZ f884e;

    /* renamed from: f */
    public int f885f;

    /* renamed from: g */
    public List f886g;

    /* renamed from: h */
    public final List f887h;

    /* renamed from: i */
    public C10937rh0 f888i;

    /* renamed from: j */
    public C10937rh0 f889j;

    /* renamed from: k */
    public AbstractC7742Ig0 f890k;

    /* renamed from: l */
    public C8340Tt0 f891l;

    /* renamed from: m */
    public boolean f892m;

    /* renamed from: n */
    public boolean f893n;

    /* renamed from: o */
    public boolean f894o;

    /* renamed from: p */
    public boolean f895p;

    /* renamed from: q */
    public boolean f896q;

    /* renamed from: r */
    public C0779MN f897r;

    /* renamed from: s */
    public InterfaceC0510I5 f898s;

    /* renamed from: t */
    public boolean f899t;

    /* renamed from: u */
    public final LinkedHashMap f900u;

    /* renamed from: v */
    public Boolean f901v;

    /* renamed from: w */
    public boolean f902w;

    /* renamed from: x */
    public final /* synthetic */ AbstractC0162CZ f903x;

    public C0099BZ(AbstractC0162CZ abstractC0162CZ, AbstractC11316ue1 abstractC11316ue1, InterfaceC0140CD interfaceC0140CD, EnumC10575os0 enumC10575os0, C7003vI c7003vI, int i, List list, List list2, C10937rh0 c10937rh0, AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC11316ue1 == null) {
            m754b(0);
            throw null;
        }
        if (interfaceC0140CD == null) {
            m754b(1);
            throw null;
        }
        if (enumC10575os0 == null) {
            m754b(2);
            throw null;
        }
        if (c7003vI == null) {
            m754b(3);
            throw null;
        }
        if (i == 0) {
            m754b(4);
            throw null;
        }
        if (list == null) {
            m754b(5);
            throw null;
        }
        if (list2 == null) {
            m754b(6);
            throw null;
        }
        if (abstractC7742Ig0 == null) {
            m754b(7);
            throw null;
        }
        this.f903x = abstractC0162CZ;
        this.f884e = null;
        this.f889j = abstractC0162CZ.f1435k;
        this.f892m = true;
        this.f893n = false;
        this.f894o = false;
        this.f895p = false;
        this.f896q = abstractC0162CZ.f1444t;
        this.f897r = null;
        this.f898s = null;
        this.f899t = abstractC0162CZ.f1445u;
        this.f900u = new LinkedHashMap();
        this.f901v = null;
        this.f902w = false;
        this.f880a = abstractC11316ue1;
        this.f881b = interfaceC0140CD;
        this.f882c = enumC10575os0;
        this.f883d = c7003vI;
        this.f885f = i;
        this.f886g = list;
        this.f887h = list2;
        this.f888i = c10937rh0;
        this.f890k = abstractC7742Ig0;
        this.f891l = null;
    }

    /* renamed from: b */
    public static /* synthetic */ void m754b(int i) {
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
            case C5043c9.f31375K /* 38 */:
            case C5043c9.f31376L /* 40 */:
            case 41:
            case C5043c9.f31377M /* 42 */:
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
            case C5043c9.f31374J /* 35 */:
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
            case C5043c9.f31375K /* 38 */:
            case C5043c9.f31376L /* 40 */:
            case 41:
            case C5043c9.f31377M /* 42 */:
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
            case C5043c9.f31374J /* 35 */:
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
            case C5043c9.f31375K /* 38 */:
            case C5043c9.f31376L /* 40 */:
            case 41:
            case C5043c9.f31377M /* 42 */:
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
            case C5043c9.f31374J /* 35 */:
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
            case C5043c9.f31374J /* 35 */:
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
            case C5043c9.f31375K /* 38 */:
                objArr[1] = "setSubstitution";
                break;
            case C5043c9.f31376L /* 40 */:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case C5043c9.f31377M /* 42 */:
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
            case C5043c9.f31375K /* 38 */:
            case C5043c9.f31376L /* 40 */:
            case 41:
            case C5043c9.f31377M /* 42 */:
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
            case C5043c9.f31374J /* 35 */:
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
            case C5043c9.f31375K /* 38 */:
            case C5043c9.f31376L /* 40 */:
            case 41:
            case C5043c9.f31377M /* 42 */:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case C5043c9.f31374J /* 35 */:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: A */
    public final InterfaceC7272zZ mo755A(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 != null) {
            this.f890k = abstractC7742Ig0;
            return this;
        }
        m754b(23);
        throw null;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: C */
    public final InterfaceC7272zZ mo756C() {
        this.f896q = true;
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: D */
    public final InterfaceC7272zZ mo757D(C8340Tt0 c8340Tt0) {
        if (c8340Tt0 != null) {
            this.f891l = c8340Tt0;
            return this;
        }
        m754b(17);
        throw null;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: E */
    public final InterfaceC7272zZ mo758E() {
        this.f893n = true;
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: a */
    public final InterfaceC0036AZ mo759a() {
        return this.f903x.mo1214B1(this);
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: j */
    public final InterfaceC7272zZ mo760j(List list) {
        this.f886g = list;
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: o */
    public final InterfaceC7272zZ mo761o(int i) {
        if (i != 0) {
            this.f885f = i;
            return this;
        }
        m754b(14);
        throw null;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: p */
    public final InterfaceC7272zZ mo762p(C10937rh0 c10937rh0) {
        this.f889j = c10937rh0;
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: q */
    public final InterfaceC7272zZ mo763q(InterfaceC6976us interfaceC6976us) {
        if (interfaceC6976us != null) {
            this.f881b = interfaceC6976us;
            return this;
        }
        m754b(8);
        throw null;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: r */
    public final InterfaceC7272zZ mo764r() {
        this.f894o = true;
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: s */
    public final InterfaceC7272zZ mo765s() {
        this.f900u.put(C9261eb0.f26760H, Boolean.TRUE);
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: t */
    public final InterfaceC7272zZ mo766t() {
        this.f899t = true;
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: u */
    public final InterfaceC7272zZ mo767u(InterfaceC0510I5 interfaceC0510I5) {
        if (interfaceC0510I5 != null) {
            this.f898s = interfaceC0510I5;
            return this;
        }
        m754b(35);
        throw null;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: w */
    public final InterfaceC7272zZ mo768w(C7003vI c7003vI) {
        if (c7003vI != null) {
            this.f883d = c7003vI;
            return this;
        }
        m754b(12);
        throw null;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: x */
    public final InterfaceC7272zZ mo769x() {
        this.f892m = false;
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: y */
    public final InterfaceC7272zZ mo770y(EnumC10575os0 enumC10575os0) {
        if (enumC10575os0 != null) {
            this.f882c = enumC10575os0;
            return this;
        }
        m754b(10);
        throw null;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: z */
    public final InterfaceC7272zZ mo771z() {
        this.f897r = C0779MN.f7117a;
        return this;
    }
}
