package p000;

/* renamed from: AV */
/* loaded from: classes.dex */
public final class C0032AV {

    /* renamed from: a */
    public final String f211a;

    public C0032AV(String str) {
        this.f211a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0032AV) && O90.m5963a(this.f211a, ((C0032AV) obj).f211a);
    }

    public final int hashCode() {
        String str = this.f211a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("FirebaseSessionsData(sessionId="), this.f211a, ')');
    }
}
