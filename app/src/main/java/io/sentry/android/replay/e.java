package io.sentry.android.replay;

import defpackage.AbstractC7209tN0;
import defpackage.O90;
import io.sentry.E1;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class e {
    public final u a;
    public final j b;
    public final Date c;
    public final int d;
    public final long e;
    public final E1 f;
    public final String g;
    public final List h;

    public e(u uVar, j jVar, Date date, int i, long j, E1 e1, String str, List list) {
        this.a = uVar;
        this.b = jVar;
        this.c = date;
        this.d = i;
        this.e = j;
        this.f = e1;
        this.g = str;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return O90.a(this.a, eVar.a) && O90.a(this.b, eVar.b) && O90.a(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && O90.a(this.g, eVar.g) && O90.a(this.h, eVar.h);
    }

    public final int hashCode() {
        int iHashCode = (((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + this.d) * 31;
        long j = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        String str = this.g;
        return this.h.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastSegmentData(recorderConfig=");
        sb.append(this.a);
        sb.append(", cache=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", duration=");
        sb.append(this.e);
        sb.append(", replayType=");
        sb.append(this.f);
        sb.append(", screenAtStart=");
        sb.append(this.g);
        sb.append(", events=");
        return AbstractC7209tN0.A(sb, this.h, ')');
    }
}
