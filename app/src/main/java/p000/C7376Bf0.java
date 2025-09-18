package p000;

/* renamed from: Bf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7376Bf0 {

    /* renamed from: c */
    public static final C7376Bf0 f967c = new C7376Bf0(null, null);

    /* renamed from: a */
    public final EnumC7428Cf0 f968a;

    /* renamed from: b */
    public final C11572wf0 f969b;

    public C7376Bf0(EnumC7428Cf0 enumC7428Cf0, C11572wf0 c11572wf0) {
        String str;
        this.f968a = enumC7428Cf0;
        this.f969b = c11572wf0;
        if ((enumC7428Cf0 == null) == (c11572wf0 == null)) {
            return;
        }
        if (enumC7428Cf0 == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC7428Cf0 + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7376Bf0)) {
            return false;
        }
        C7376Bf0 c7376Bf0 = (C7376Bf0) obj;
        return this.f968a == c7376Bf0.f968a && O90.m5963a(this.f969b, c7376Bf0.f969b);
    }

    public final int hashCode() {
        EnumC7428Cf0 enumC7428Cf0 = this.f968a;
        int iHashCode = (enumC7428Cf0 == null ? 0 : enumC7428Cf0.hashCode()) * 31;
        C11572wf0 c11572wf0 = this.f969b;
        return iHashCode + (c11572wf0 != null ? c11572wf0.hashCode() : 0);
    }

    public final String toString() {
        EnumC7428Cf0 enumC7428Cf0 = this.f968a;
        int i = enumC7428Cf0 == null ? -1 : AbstractC7324Af0.f304a[enumC7428Cf0.ordinal()];
        if (i == -1) {
            return "*";
        }
        C11572wf0 c11572wf0 = this.f969b;
        if (i == 1) {
            return String.valueOf(c11572wf0);
        }
        if (i == 2) {
            return "in " + c11572wf0;
        }
        if (i != 3) {
            throw new C6838sg();
        }
        return "out " + c11572wf0;
    }
}
