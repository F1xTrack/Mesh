package defpackage;

import android.location.Location;
import java.io.File;

/* renamed from: Id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653Id {
    public final long a;
    public final long b;
    public final Location c;
    public final File d;

    public C0653Id(long j, long j2, Location location, File file) {
        this.a = j;
        this.b = j2;
        this.c = location;
        this.d = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0653Id)) {
            return false;
        }
        C0653Id c0653Id = (C0653Id) obj;
        if (this.a == c0653Id.a && this.b == c0653Id.b) {
            Location location = c0653Id.c;
            Location location2 = this.c;
            if (location2 != null ? location2.equals(location) : location == null) {
                if (this.d.equals(c0653Id.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Location location = this.c;
        return ((i ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.a + ", durationLimitMillis=" + this.b + ", location=" + this.c + ", file=" + this.d + "}";
    }
}
