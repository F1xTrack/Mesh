package p000;

/* renamed from: gJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9481gJ0 {

    /* renamed from: a */
    public final long f27668a;

    /* renamed from: b */
    public final long f27669b;

    /* renamed from: c */
    public final String f27670c;

    /* renamed from: d */
    public int f27671d;

    public C9481gJ0(long j, long j2, String str) {
        this.f27670c = str == null ? "" : str;
        this.f27668a = j;
        this.f27669b = j2;
    }

    /* renamed from: a */
    public final C9481gJ0 m18425a(C9481gJ0 c9481gJ0, String str) {
        long j;
        String strM9659h = AbstractC8668a02.m9659h(str, this.f27670c);
        if (c9481gJ0 == null || !strM9659h.equals(AbstractC8668a02.m9659h(str, c9481gJ0.f27670c))) {
            return null;
        }
        long j2 = this.f27669b;
        long j3 = c9481gJ0.f27669b;
        if (j2 != -1) {
            long j4 = this.f27668a;
            j = j2;
            if (j4 + j2 == c9481gJ0.f27668a) {
                return new C9481gJ0(j4, j3 == -1 ? -1L : j + j3, strM9659h);
            }
        } else {
            j = j2;
        }
        if (j3 != -1) {
            long j5 = c9481gJ0.f27668a;
            if (j5 + j3 == this.f27668a) {
                return new C9481gJ0(j5, j == -1 ? -1L : j3 + j, strM9659h);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9481gJ0.class != obj.getClass()) {
            return false;
        }
        C9481gJ0 c9481gJ0 = (C9481gJ0) obj;
        return this.f27668a == c9481gJ0.f27668a && this.f27669b == c9481gJ0.f27669b && this.f27670c.equals(c9481gJ0.f27670c);
    }

    public final int hashCode() {
        if (this.f27671d == 0) {
            this.f27671d = this.f27670c.hashCode() + ((((527 + ((int) this.f27668a)) * 31) + ((int) this.f27669b)) * 31);
        }
        return this.f27671d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f27670c);
        sb.append(", start=");
        sb.append(this.f27668a);
        sb.append(", length=");
        return AbstractC0852NX.m5760i(sb, this.f27669b, ")");
    }
}
