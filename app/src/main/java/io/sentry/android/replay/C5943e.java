package io.sentry.android.replay;

import io.sentry.EnumC5762E1;
import java.util.Date;
import java.util.List;
import p000.AbstractC11153tN0;
import p000.O90;

/* renamed from: io.sentry.android.replay.e */
/* loaded from: classes2.dex */
public final class C5943e {

    /* renamed from: a */
    public final C5961u f33966a;

    /* renamed from: b */
    public final C5950j f33967b;

    /* renamed from: c */
    public final Date f33968c;

    /* renamed from: d */
    public final int f33969d;

    /* renamed from: e */
    public final long f33970e;

    /* renamed from: f */
    public final EnumC5762E1 f33971f;

    /* renamed from: g */
    public final String f33972g;

    /* renamed from: h */
    public final List f33973h;

    public C5943e(C5961u c5961u, C5950j c5950j, Date date, int i, long j, EnumC5762E1 enumC5762E1, String str, List list) {
        this.f33966a = c5961u;
        this.f33967b = c5950j;
        this.f33968c = date;
        this.f33969d = i;
        this.f33970e = j;
        this.f33971f = enumC5762E1;
        this.f33972g = str;
        this.f33973h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5943e)) {
            return false;
        }
        C5943e c5943e = (C5943e) obj;
        return O90.m5963a(this.f33966a, c5943e.f33966a) && O90.m5963a(this.f33967b, c5943e.f33967b) && O90.m5963a(this.f33968c, c5943e.f33968c) && this.f33969d == c5943e.f33969d && this.f33970e == c5943e.f33970e && this.f33971f == c5943e.f33971f && O90.m5963a(this.f33972g, c5943e.f33972g) && O90.m5963a(this.f33973h, c5943e.f33973h);
    }

    public final int hashCode() {
        int iHashCode = (((this.f33968c.hashCode() + ((this.f33967b.hashCode() + (this.f33966a.hashCode() * 31)) * 31)) * 31) + this.f33969d) * 31;
        long j = this.f33970e;
        int iHashCode2 = (this.f33971f.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        String str = this.f33972g;
        return this.f33973h.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastSegmentData(recorderConfig=");
        sb.append(this.f33966a);
        sb.append(", cache=");
        sb.append(this.f33967b);
        sb.append(", timestamp=");
        sb.append(this.f33968c);
        sb.append(", id=");
        sb.append(this.f33969d);
        sb.append(", duration=");
        sb.append(this.f33970e);
        sb.append(", replayType=");
        sb.append(this.f33971f);
        sb.append(", screenAtStart=");
        sb.append(this.f33972g);
        sb.append(", events=");
        return AbstractC11153tN0.m24883A(sb, this.f33973h, ')');
    }
}
