package defpackage;

import java.util.ArrayList;

/* renamed from: Kd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0809Kd {
    public final String a;
    public final ArrayList b;

    public C0809Kd(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0809Kd)) {
            return false;
        }
        C0809Kd c0809Kd = (C0809Kd) obj;
        return this.a.equals(c0809Kd.a) && this.b.equals(c0809Kd.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
