package defpackage;

/* renamed from: Ee, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344Ee {
    public final String a;
    public final String b;
    public final boolean c;

    public C0344Ee(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0344Ee)) {
            return false;
        }
        C0344Ee c0344Ee = (C0344Ee) obj;
        return this.a.equals(c0344Ee.a) && this.b.equals(c0344Ee.b) && this.c == c0344Ee.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.a);
        sb.append(", osCodeName=");
        sb.append(this.b);
        sb.append(", isRooted=");
        return AbstractC8235ym.m(sb, this.c, "}");
    }
}
