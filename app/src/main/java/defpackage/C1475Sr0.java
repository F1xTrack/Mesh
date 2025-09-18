package defpackage;

import java.util.Map;

/* renamed from: Sr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1475Sr0 {
    public final String a;
    public final Map b;
    public final long c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1475Sr0(String str, Map map) {
        this(str, map, System.currentTimeMillis());
        O90.f(str, "eventName");
        O90.f(map, "eventData");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1475Sr0)) {
            return false;
        }
        C1475Sr0 c1475Sr0 = (C1475Sr0) obj;
        return O90.a(this.a, c1475Sr0.a) && O90.a(this.b, c1475Sr0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public C1475Sr0(String str, Map map, long j) {
        O90.f(str, "eventName");
        O90.f(map, "eventData");
        this.a = str;
        this.b = map;
        this.c = j;
    }
}
