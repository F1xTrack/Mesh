package io.sentry.android.replay;

import java.io.File;
import p000.AbstractC11153tN0;
import p000.O90;

/* renamed from: io.sentry.android.replay.d */
/* loaded from: classes2.dex */
public final class C5942d {

    /* renamed from: a */
    public final File f33963a;

    /* renamed from: b */
    public final int f33964b;

    /* renamed from: c */
    public final long f33965c;

    public C5942d(File file, int i, long j) {
        this.f33963a = file;
        this.f33964b = i;
        this.f33965c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5942d)) {
            return false;
        }
        C5942d c5942d = (C5942d) obj;
        return O90.m5963a(this.f33963a, c5942d.f33963a) && this.f33964b == c5942d.f33964b && this.f33965c == c5942d.f33965c;
    }

    public final int hashCode() {
        int iHashCode = ((this.f33963a.hashCode() * 31) + this.f33964b) * 31;
        long j = this.f33965c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeneratedVideo(video=");
        sb.append(this.f33963a);
        sb.append(", frameCount=");
        sb.append(this.f33964b);
        sb.append(", duration=");
        return AbstractC11153tN0.m24913y(sb, this.f33965c, ')');
    }
}
