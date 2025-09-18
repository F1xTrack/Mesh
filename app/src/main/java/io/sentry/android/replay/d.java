package io.sentry.android.replay;

import defpackage.AbstractC7209tN0;
import defpackage.O90;
import java.io.File;

/* loaded from: classes2.dex */
public final class d {
    public final File a;
    public final int b;
    public final long c;

    public d(File file, int i, long j) {
        this.a = file;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return O90.a(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeneratedVideo(video=");
        sb.append(this.a);
        sb.append(", frameCount=");
        sb.append(this.b);
        sb.append(", duration=");
        return AbstractC7209tN0.y(sb, this.c, ')');
    }
}
