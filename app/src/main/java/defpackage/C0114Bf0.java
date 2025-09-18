package defpackage;

/* renamed from: Bf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0114Bf0 {
    public static final C0114Bf0 c = new C0114Bf0(null, null);
    public final EnumC0192Cf0 a;
    public final C7835wf0 b;

    public C0114Bf0(EnumC0192Cf0 enumC0192Cf0, C7835wf0 c7835wf0) {
        String str;
        this.a = enumC0192Cf0;
        this.b = c7835wf0;
        if ((enumC0192Cf0 == null) == (c7835wf0 == null)) {
            return;
        }
        if (enumC0192Cf0 == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC0192Cf0 + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0114Bf0)) {
            return false;
        }
        C0114Bf0 c0114Bf0 = (C0114Bf0) obj;
        return this.a == c0114Bf0.a && O90.a(this.b, c0114Bf0.b);
    }

    public final int hashCode() {
        EnumC0192Cf0 enumC0192Cf0 = this.a;
        int iHashCode = (enumC0192Cf0 == null ? 0 : enumC0192Cf0.hashCode()) * 31;
        C7835wf0 c7835wf0 = this.b;
        return iHashCode + (c7835wf0 != null ? c7835wf0.hashCode() : 0);
    }

    public final String toString() {
        EnumC0192Cf0 enumC0192Cf0 = this.a;
        int i = enumC0192Cf0 == null ? -1 : AbstractC0036Af0.a[enumC0192Cf0.ordinal()];
        if (i == -1) {
            return "*";
        }
        C7835wf0 c7835wf0 = this.b;
        if (i == 1) {
            return String.valueOf(c7835wf0);
        }
        if (i == 2) {
            return "in " + c7835wf0;
        }
        if (i != 3) {
            throw new C7074sg();
        }
        return "out " + c7835wf0;
    }
}
