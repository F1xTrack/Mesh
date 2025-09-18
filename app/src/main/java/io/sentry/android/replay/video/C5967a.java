package io.sentry.android.replay.video;

import java.io.File;
import p000.F91;
import p000.O90;

/* renamed from: io.sentry.android.replay.video.a */
/* loaded from: classes2.dex */
public final class C5967a {

    /* renamed from: a */
    public final File f34042a;

    /* renamed from: b */
    public final int f34043b;

    /* renamed from: c */
    public final int f34044c;

    /* renamed from: d */
    public final int f34045d;

    /* renamed from: e */
    public final int f34046e;

    /* renamed from: f */
    public final String f34047f = "video/avc";

    public C5967a(File file, int i, int i2, int i3, int i4) {
        this.f34042a = file;
        this.f34043b = i;
        this.f34044c = i2;
        this.f34045d = i3;
        this.f34046e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5967a)) {
            return false;
        }
        C5967a c5967a = (C5967a) obj;
        return O90.m5963a(this.f34042a, c5967a.f34042a) && this.f34043b == c5967a.f34043b && this.f34044c == c5967a.f34044c && this.f34045d == c5967a.f34045d && this.f34046e == c5967a.f34046e && O90.m5963a(this.f34047f, c5967a.f34047f);
    }

    public final int hashCode() {
        return this.f34047f.hashCode() + (((((((((this.f34042a.hashCode() * 31) + this.f34043b) * 31) + this.f34044c) * 31) + this.f34045d) * 31) + this.f34046e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MuxerConfig(file=");
        sb.append(this.f34042a);
        sb.append(", recordingWidth=");
        sb.append(this.f34043b);
        sb.append(", recordingHeight=");
        sb.append(this.f34044c);
        sb.append(", frameRate=");
        sb.append(this.f34045d);
        sb.append(", bitRate=");
        sb.append(this.f34046e);
        sb.append(", mimeType=");
        return F91.m2539v(sb, this.f34047f, ')');
    }
}
