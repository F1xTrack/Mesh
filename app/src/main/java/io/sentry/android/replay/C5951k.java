package io.sentry.android.replay;

import java.io.File;
import p000.F91;
import p000.O90;

/* renamed from: io.sentry.android.replay.k */
/* loaded from: classes2.dex */
public final class C5951k {

    /* renamed from: a */
    public final File f33997a;

    /* renamed from: b */
    public final long f33998b;

    /* renamed from: c */
    public final String f33999c;

    public C5951k(File file, long j, String str) {
        this.f33997a = file;
        this.f33998b = j;
        this.f33999c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5951k)) {
            return false;
        }
        C5951k c5951k = (C5951k) obj;
        return O90.m5963a(this.f33997a, c5951k.f33997a) && this.f33998b == c5951k.f33998b && O90.m5963a(this.f33999c, c5951k.f33999c);
    }

    public final int hashCode() {
        int iHashCode = this.f33997a.hashCode() * 31;
        long j = this.f33998b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f33999c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplayFrame(screenshot=");
        sb.append(this.f33997a);
        sb.append(", timestamp=");
        sb.append(this.f33998b);
        sb.append(", screen=");
        return F91.m2539v(sb, this.f33999c, ')');
    }
}
