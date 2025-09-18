package defpackage;

/* renamed from: Dq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0304Dq1 {
    public final String a;
    public final boolean b;

    public C0304Dq1(String str, boolean z) {
        O90.f(str, "masterPackageName");
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0304Dq1)) {
            return false;
        }
        C0304Dq1 c0304Dq1 = (C0304Dq1) obj;
        return O90.a(this.a, c0304Dq1.a) && this.b == c0304Dq1.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasterHostRequest(masterPackageName=");
        sb.append(this.a);
        sb.append(", isFromArbiter=");
        return F91.w(sb, this.b, ')');
    }
}
