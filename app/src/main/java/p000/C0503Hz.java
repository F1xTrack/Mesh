package p000;

/* renamed from: Hz */
/* loaded from: classes2.dex */
public final class C0503Hz extends AbstractC0378G {

    /* renamed from: c */
    public static final C8326Tm0 f4621c = new C8326Tm0(11);

    /* renamed from: b */
    public final String f4622b;

    public C0503Hz(String str) {
        super(f4621c);
        this.f4622b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0503Hz) && O90.m5963a(this.f4622b, ((C0503Hz) obj).f4622b);
    }

    public final int hashCode() {
        return this.f4622b.hashCode();
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("CoroutineName("), this.f4622b, ')');
    }
}
