package defpackage;

/* renamed from: s41 */
/* loaded from: classes2.dex */
public final class C6962s41 extends AbstractC6689qe1 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public C6962s41(AbstractC0663Ig0 abstractC0663Ig0, EnumC4015gi1 enumC4015gi1) {
        if (enumC4015gi1 == null) {
            e(0);
            throw null;
        }
        if (abstractC0663Ig0 == null) {
            e(1);
            throw null;
        }
        this.b = enumC4015gi1;
        this.c = abstractC0663Ig0;
    }

    public static /* synthetic */ void e(int i) {
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

    @Override // defpackage.AbstractC6689qe1
    public final EnumC4015gi1 a() {
        switch (this.a) {
            case 0:
                return EnumC4015gi1.e;
            default:
                EnumC4015gi1 enumC4015gi1 = (EnumC4015gi1) this.b;
                if (enumC4015gi1 != null) {
                    return enumC4015gi1;
                }
                e(4);
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.AbstractC6689qe1
    public final AbstractC0663Ig0 b() {
        switch (this.a) {
            case 0:
                return (AbstractC0663Ig0) this.c.getValue();
            default:
                AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) this.c;
                if (abstractC0663Ig0 != null) {
                    return abstractC0663Ig0;
                }
                e(5);
                throw null;
        }
    }

    @Override // defpackage.AbstractC6689qe1
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.AbstractC6689qe1
    public final AbstractC6689qe1 d(C1130Og0 c1130Og0) {
        switch (this.a) {
            case 0:
                O90.f(c1130Og0, "kotlinTypeRefiner");
                return this;
            default:
                if (c1130Og0 == null) {
                    e(6);
                    throw null;
                }
                c1130Og0.getClass();
                AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) this.c;
                O90.f(abstractC0663Ig0, "type");
                return new C6962s41(abstractC0663Ig0, (EnumC4015gi1) this.b);
        }
    }

    public C6962s41(InterfaceC5925me1 interfaceC5925me1) {
        O90.f(interfaceC5925me1, "typeParameter");
        this.b = interfaceC5925me1;
        this.c = LB.c(EnumC4205hi0.b, new C6685qd0(28, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6962s41(AbstractC0663Ig0 abstractC0663Ig0) {
        this(abstractC0663Ig0, EnumC4015gi1.c);
        if (abstractC0663Ig0 != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
