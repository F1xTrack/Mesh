package p000;

/* renamed from: yt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11855yt1 {

    /* renamed from: a */
    public final long f46534a;

    public C11855yt1(long j) {
        this.f46534a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11855yt1) {
            C11855yt1 c11855yt1 = (C11855yt1) obj;
            c11855yt1.getClass();
            if (this.f46534a == c11855yt1.f46534a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f46534a;
        return ((int) ((j >>> 32) ^ j)) ^ (-724379968);
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.f46534a + "}";
    }
}
