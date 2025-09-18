package defpackage;

import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: zw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8457zw1 {
    public final RemoteConfig a;
    public final String b;

    public C8457zw1(RemoteConfig remoteConfig, String str) {
        this.a = remoteConfig;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8457zw1)) {
            return false;
        }
        C8457zw1 c8457zw1 = (C8457zw1) obj;
        return O90.a(this.a, c8457zw1.a) && O90.a(this.b, c8457zw1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultConfig(config=" + this.a + ", shortSegments=" + ((Object) G12.a(this.b)) + ')';
    }
}
