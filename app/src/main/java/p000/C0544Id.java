package p000;

import android.location.Location;
import java.io.File;

/* renamed from: Id */
/* loaded from: classes.dex */
public final class C0544Id {

    /* renamed from: a */
    public final long f5045a;

    /* renamed from: b */
    public final long f5046b;

    /* renamed from: c */
    public final Location f5047c;

    /* renamed from: d */
    public final File f5048d;

    public C0544Id(long j, long j2, Location location, File file) {
        this.f5045a = j;
        this.f5046b = j2;
        this.f5047c = location;
        this.f5048d = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0544Id)) {
            return false;
        }
        C0544Id c0544Id = (C0544Id) obj;
        if (this.f5045a == c0544Id.f5045a && this.f5046b == c0544Id.f5046b) {
            Location location = c0544Id.f5047c;
            Location location2 = this.f5047c;
            if (location2 != null ? location2.equals(location) : location == null) {
                if (this.f5048d.equals(c0544Id.f5048d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5045a;
        long j2 = this.f5046b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Location location = this.f5047c;
        return ((i ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.f5048d.hashCode();
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f5045a + ", durationLimitMillis=" + this.f5046b + ", location=" + this.f5047c + ", file=" + this.f5048d + "}";
    }
}
