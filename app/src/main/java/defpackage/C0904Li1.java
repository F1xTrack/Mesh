package defpackage;

import android.util.Size;

/* renamed from: Li1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0904Li1 {
    public final String a;
    public final long b;
    public final Size c;

    public C0904Li1(String str, long j, Size size) {
        this.a = str;
        this.b = j;
        this.c = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0904Li1)) {
            return false;
        }
        C0904Li1 c0904Li1 = (C0904Li1) obj;
        return O90.a(this.a, c0904Li1.a) && this.b == c0904Li1.b && O90.a(this.c, c0904Li1.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "Video(path=" + this.a + ", durationMs=" + this.b + ", size=" + this.c + ")";
    }
}
