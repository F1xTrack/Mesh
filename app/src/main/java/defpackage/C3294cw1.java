package defpackage;

import java.util.Map;

/* renamed from: cw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3294cw1 {
    public final String a;
    public final Map b;

    public C3294cw1(String str, Map map) {
        O90.f(map, "eventData");
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3294cw1)) {
            return false;
        }
        C3294cw1 c3294cw1 = (C3294cw1) obj;
        return O90.a(this.a, c3294cw1.a) && O90.a(this.b, c3294cw1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteConfigAnalyticsEvent(eventName=" + this.a + ", eventData=" + this.b + ')';
    }
}
