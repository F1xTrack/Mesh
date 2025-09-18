package p000;

import android.util.Size;

/* renamed from: Li1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7903Li1 {

    /* renamed from: a */
    public final String f6818a;

    /* renamed from: b */
    public final long f6819b;

    /* renamed from: c */
    public final Size f6820c;

    public C7903Li1(String str, long j, Size size) {
        this.f6818a = str;
        this.f6819b = j;
        this.f6820c = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7903Li1)) {
            return false;
        }
        C7903Li1 c7903Li1 = (C7903Li1) obj;
        return O90.m5963a(this.f6818a, c7903Li1.f6818a) && this.f6819b == c7903Li1.f6819b && O90.m5963a(this.f6820c, c7903Li1.f6820c);
    }

    public final int hashCode() {
        int iHashCode = this.f6818a.hashCode() * 31;
        long j = this.f6819b;
        return this.f6820c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "Video(path=" + this.f6818a + ", durationMs=" + this.f6819b + ", size=" + this.f6820c + ")";
    }
}
