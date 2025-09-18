package p000;

/* renamed from: ze */
/* loaded from: classes.dex */
public final class C7277ze {

    /* renamed from: a */
    public final long f46918a;

    /* renamed from: b */
    public final long f46919b;

    /* renamed from: c */
    public final long f46920c;

    public C7277ze(long j, long j2, long j3) {
        this.f46918a = j;
        this.f46919b = j2;
        this.f46920c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7277ze)) {
            return false;
        }
        C7277ze c7277ze = (C7277ze) obj;
        return this.f46918a == c7277ze.f46918a && this.f46919b == c7277ze.f46919b && this.f46920c == c7277ze.f46920c;
    }

    public final int hashCode() {
        long j = this.f46918a;
        long j2 = this.f46919b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f46920c;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f46918a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f46919b);
        sb.append(", uptimeMillis=");
        return AbstractC0852NX.m5760i(sb, this.f46920c, "}");
    }
}
