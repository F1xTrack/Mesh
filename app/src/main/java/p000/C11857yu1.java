package p000;

import java.util.Map;

/* renamed from: yu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11857yu1 {

    /* renamed from: a */
    public final Map f46535a;

    public C11857yu1(Map map) {
        O90.m5968f(map, "eventData");
        this.f46535a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11857yu1)) {
            return false;
        }
        C11857yu1 c11857yu1 = (C11857yu1) obj;
        c11857yu1.getClass();
        return O90.m5963a(this.f46535a, c11857yu1.f46535a);
    }

    public final int hashCode() {
        return this.f46535a.hashCode() + 249895160;
    }

    public final String toString() {
        return "ReviewAnalyticsEvent(eventName=sdkInfo, eventData=" + this.f46535a + ')';
    }
}
