package p000;

/* renamed from: s41 */
/* loaded from: classes2.dex */
public final class C10988s41 extends AbstractC10804qe1 {

    /* renamed from: a */
    public final /* synthetic */ int f42246a = 1;

    /* renamed from: b */
    public final Object f42247b;

    /* renamed from: c */
    public final Object f42248c;

    public C10988s41(AbstractC7742Ig0 abstractC7742Ig0, EnumC9532gi1 enumC9532gi1) {
        if (enumC9532gi1 == null) {
            m24613e(0);
            throw null;
        }
        if (abstractC7742Ig0 == null) {
            m24613e(1);
            throw null;
        }
        this.f42247b = enumC9532gi1;
        this.f42248c = abstractC7742Ig0;
    }

    /* renamed from: e */
    public static /* synthetic */ void m24613e(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p000.AbstractC10804qe1
    /* renamed from: a */
    public final EnumC9532gi1 mo24037a() {
        switch (this.f42246a) {
            case 0:
                return EnumC9532gi1.f27949e;
            default:
                EnumC9532gi1 enumC9532gi1 = (EnumC9532gi1) this.f42247b;
                if (enumC9532gi1 != null) {
                    return enumC9532gi1;
                }
                m24613e(4);
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC10804qe1
    /* renamed from: b */
    public final AbstractC7742Ig0 mo24038b() {
        switch (this.f42246a) {
            case 0:
                return (AbstractC7742Ig0) this.f42248c.getValue();
            default:
                AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) this.f42248c;
                if (abstractC7742Ig0 != null) {
                    return abstractC7742Ig0;
                }
                m24613e(5);
                throw null;
        }
    }

    @Override // p000.AbstractC10804qe1
    /* renamed from: c */
    public final boolean mo24039c() {
        switch (this.f42246a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.AbstractC10804qe1
    /* renamed from: d */
    public final AbstractC10804qe1 mo24040d(C8054Og0 c8054Og0) {
        switch (this.f42246a) {
            case 0:
                O90.m5968f(c8054Og0, "kotlinTypeRefiner");
                return this;
            default:
                if (c8054Og0 == null) {
                    m24613e(6);
                    throw null;
                }
                c8054Og0.getClass();
                AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) this.f42248c;
                O90.m5968f(abstractC7742Ig0, "type");
                return new C10988s41(abstractC7742Ig0, (EnumC9532gi1) this.f42247b);
        }
    }

    public C10988s41(InterfaceC10292me1 interfaceC10292me1) {
        O90.m5968f(interfaceC10292me1, "typeParameter");
        this.f42247b = interfaceC10292me1;
        this.f42248c = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C10801qd0(28, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10988s41(AbstractC7742Ig0 abstractC7742Ig0) {
        this(abstractC7742Ig0, EnumC9532gi1.f27947c);
        if (abstractC7742Ig0 != null) {
        } else {
            m24613e(2);
            throw null;
        }
    }
}
