package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z4 */
/* loaded from: classes2.dex */
public final class C5613z4 {

    /* renamed from: a */
    public final boolean f32907a;

    /* renamed from: b */
    public final boolean f32908b;

    /* renamed from: c */
    public final boolean f32909c;

    /* renamed from: d */
    public final boolean f32910d;

    /* renamed from: e */
    public final boolean f32911e;

    /* renamed from: f */
    public final Boolean f32912f;

    public C5613z4(C5563x4 c5563x4) {
        this.f32907a = c5563x4.f32796a;
        this.f32908b = c5563x4.f32797b;
        this.f32909c = c5563x4.f32798c;
        this.f32910d = c5563x4.f32799d;
        this.f32911e = c5563x4.f32800e;
        this.f32912f = c5563x4.f32801f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5613z4.class != obj.getClass()) {
            return false;
        }
        C5613z4 c5613z4 = (C5613z4) obj;
        if (this.f32907a != c5613z4.f32907a || this.f32908b != c5613z4.f32908b || this.f32909c != c5613z4.f32909c || this.f32910d != c5613z4.f32910d || this.f32911e != c5613z4.f32911e) {
            return false;
        }
        Boolean bool = this.f32912f;
        Boolean bool2 = c5613z4.f32912f;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public final int hashCode() {
        int i = (((((((((this.f32907a ? 1 : 0) * 31) + (this.f32908b ? 1 : 0)) * 31) + (this.f32909c ? 1 : 0)) * 31) + (this.f32910d ? 1 : 0)) * 31) + (this.f32911e ? 1 : 0)) * 31;
        Boolean bool = this.f32912f;
        return i + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f32907a + ", featuresCollectingEnabled=" + this.f32908b + ", googleAid=" + this.f32909c + ", simInfo=" + this.f32910d + ", huaweiOaid=" + this.f32911e + ", sslPinning=" + this.f32912f + '}';
    }
}
