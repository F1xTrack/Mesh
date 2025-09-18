package io.appmetrica.analytics.identifiers.impl;

import p000.O90;

/* renamed from: io.appmetrica.analytics.identifiers.impl.a */
/* loaded from: classes2.dex */
public final class C4335a {

    /* renamed from: a */
    public final String f29811a;

    /* renamed from: b */
    public final String f29812b;

    /* renamed from: c */
    public final Boolean f29813c;

    public C4335a(String str, String str2, Boolean bool) {
        this.f29811a = str;
        this.f29812b = str2;
        this.f29813c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4335a)) {
            return false;
        }
        C4335a c4335a = (C4335a) obj;
        return O90.m5963a(this.f29811a, c4335a.f29811a) && O90.m5963a(this.f29812b, c4335a.f29812b) && O90.m5963a(this.f29813c, c4335a.f29813c);
    }

    public final int hashCode() {
        int iHashCode = this.f29811a.hashCode() * 31;
        String str = this.f29812b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f29813c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f29811a + ", advId=" + this.f29812b + ", limitedAdTracking=" + this.f29813c + ')';
    }
}
