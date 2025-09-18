package defpackage;

/* renamed from: gJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3939gJ0 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public C3939gJ0(long j, long j2, String str) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final C3939gJ0 a(C3939gJ0 c3939gJ0, String str) {
        long j;
        String strH = AbstractC2051a02.h(str, this.c);
        if (c3939gJ0 == null || !strH.equals(AbstractC2051a02.h(str, c3939gJ0.c))) {
            return null;
        }
        long j2 = this.b;
        long j3 = c3939gJ0.b;
        if (j2 != -1) {
            long j4 = this.a;
            j = j2;
            if (j4 + j2 == c3939gJ0.a) {
                return new C3939gJ0(j4, j3 == -1 ? -1L : j + j3, strH);
            }
        } else {
            j = j2;
        }
        if (j3 != -1) {
            long j5 = c3939gJ0.a;
            if (j5 + j3 == this.a) {
                return new C3939gJ0(j5, j == -1 ? -1L : j3 + j, strH);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3939gJ0.class != obj.getClass()) {
            return false;
        }
        C3939gJ0 c3939gJ0 = (C3939gJ0) obj;
        return this.a == c3939gJ0.a && this.b == c3939gJ0.b && this.c.equals(c3939gJ0.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return NX.i(sb, this.b, ")");
    }
}
