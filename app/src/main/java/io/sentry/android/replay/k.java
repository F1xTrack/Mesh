package io.sentry.android.replay;

import defpackage.F91;
import defpackage.O90;
import java.io.File;

/* loaded from: classes2.dex */
public final class k {
    public final File a;
    public final long b;
    public final String c;

    public k(File file, long j, String str) {
        this.a = file;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return O90.a(this.a, kVar.a) && this.b == kVar.b && O90.a(this.c, kVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplayFrame(screenshot=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", screen=");
        return F91.v(sb, this.c, ')');
    }
}
