package p000;

import java.util.Map;

/* renamed from: Sr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8284Sr0 {

    /* renamed from: a */
    public final String f11010a;

    /* renamed from: b */
    public final Map f11011b;

    /* renamed from: c */
    public final long f11012c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8284Sr0(String str, Map map) {
        this(str, map, System.currentTimeMillis());
        O90.m5968f(str, "eventName");
        O90.m5968f(map, "eventData");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8284Sr0)) {
            return false;
        }
        C8284Sr0 c8284Sr0 = (C8284Sr0) obj;
        return O90.m5963a(this.f11010a, c8284Sr0.f11010a) && O90.m5963a(this.f11011b, c8284Sr0.f11011b);
    }

    public final int hashCode() {
        return this.f11011b.hashCode() + (this.f11010a.hashCode() * 31);
    }

    public C8284Sr0(String str, Map map, long j) {
        O90.m5968f(str, "eventName");
        O90.m5968f(map, "eventData");
        this.f11010a = str;
        this.f11011b = map;
        this.f11012c = j;
    }
}
