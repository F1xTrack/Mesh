package p000;

import java.util.ArrayList;

/* renamed from: Kd */
/* loaded from: classes.dex */
public final class C0670Kd {

    /* renamed from: a */
    public final String f6235a;

    /* renamed from: b */
    public final ArrayList f6236b;

    public C0670Kd(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f6235a = str;
        this.f6236b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0670Kd)) {
            return false;
        }
        C0670Kd c0670Kd = (C0670Kd) obj;
        return this.f6235a.equals(c0670Kd.f6235a) && this.f6236b.equals(c0670Kd.f6236b);
    }

    public final int hashCode() {
        return ((this.f6235a.hashCode() ^ 1000003) * 1000003) ^ this.f6236b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f6235a + ", usedDates=" + this.f6236b + "}";
    }
}
