package defpackage;

/* renamed from: nu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6164nu1 {
    public final String a;
    public final String b;

    public C6164nu1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6164nu1)) {
            return false;
        }
        C6164nu1 c6164nu1 = (C6164nu1) obj;
        return O90.a(this.a, c6164nu1.a) && O90.a(this.b, c6164nu1.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageKey(id=");
        sb.append(this.a);
        sb.append(", token=");
        return F91.v(sb, this.b, ')');
    }
}
