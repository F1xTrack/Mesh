package defpackage;

import java.util.Map;

/* renamed from: yu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8261yu1 {
    public final Map a;

    public C8261yu1(Map map) {
        O90.f(map, "eventData");
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8261yu1)) {
            return false;
        }
        C8261yu1 c8261yu1 = (C8261yu1) obj;
        c8261yu1.getClass();
        return O90.a(this.a, c8261yu1.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 249895160;
    }

    public final String toString() {
        return "ReviewAnalyticsEvent(eventName=sdkInfo, eventData=" + this.a + ')';
    }
}
