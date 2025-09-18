package defpackage;

/* renamed from: yt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8258yt1 {
    public final long a;

    public C8258yt1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8258yt1) {
            C8258yt1 c8258yt1 = (C8258yt1) obj;
            c8258yt1.getClass();
            if (this.a == c8258yt1.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ (-724379968);
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.a + "}";
    }
}
