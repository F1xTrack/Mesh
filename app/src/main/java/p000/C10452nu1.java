package p000;

/* renamed from: nu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10452nu1 {

    /* renamed from: a */
    public final String f38603a;

    /* renamed from: b */
    public final String f38604b;

    public C10452nu1(String str, String str2) {
        this.f38603a = str;
        this.f38604b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10452nu1)) {
            return false;
        }
        C10452nu1 c10452nu1 = (C10452nu1) obj;
        return O90.m5963a(this.f38603a, c10452nu1.f38603a) && O90.m5963a(this.f38604b, c10452nu1.f38604b);
    }

    public final int hashCode() {
        String str = this.f38603a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38604b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageKey(id=");
        sb.append(this.f38603a);
        sb.append(", token=");
        return F91.m2539v(sb, this.f38604b, ')');
    }
}
