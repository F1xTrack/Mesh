package p000;

import java.util.Map;

/* renamed from: cw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9048cw1 {

    /* renamed from: a */
    public final String f25727a;

    /* renamed from: b */
    public final Map f25728b;

    public C9048cw1(String str, Map map) {
        O90.m5968f(map, "eventData");
        this.f25727a = str;
        this.f25728b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9048cw1)) {
            return false;
        }
        C9048cw1 c9048cw1 = (C9048cw1) obj;
        return O90.m5963a(this.f25727a, c9048cw1.f25727a) && O90.m5963a(this.f25728b, c9048cw1.f25728b);
    }

    public final int hashCode() {
        return this.f25728b.hashCode() + (this.f25727a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteConfigAnalyticsEvent(eventName=" + this.f25727a + ", eventData=" + this.f25728b + ')';
    }
}
