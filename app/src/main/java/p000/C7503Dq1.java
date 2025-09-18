package p000;

/* renamed from: Dq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7503Dq1 {

    /* renamed from: a */
    public final String f2271a;

    /* renamed from: b */
    public final boolean f2272b;

    public C7503Dq1(String str, boolean z) {
        O90.m5968f(str, "masterPackageName");
        this.f2271a = str;
        this.f2272b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7503Dq1)) {
            return false;
        }
        C7503Dq1 c7503Dq1 = (C7503Dq1) obj;
        return O90.m5963a(this.f2271a, c7503Dq1.f2271a) && this.f2272b == c7503Dq1.f2272b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f2271a.hashCode() * 31;
        boolean z = this.f2272b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasterHostRequest(masterPackageName=");
        sb.append(this.f2271a);
        sb.append(", isFromArbiter=");
        return F91.m2540w(sb, this.f2272b, ')');
    }
}
