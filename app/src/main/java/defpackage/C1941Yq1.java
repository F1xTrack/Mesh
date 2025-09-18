package defpackage;

import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: Yq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1941Yq1 {
    public final RemoteConfig a;
    public final String b;

    public C1941Yq1(RemoteConfig remoteConfig, String str) {
        this.a = remoteConfig;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1941Yq1)) {
            return false;
        }
        C1941Yq1 c1941Yq1 = (C1941Yq1) obj;
        return O90.a(this.a, c1941Yq1.a) && O90.a(this.b, c1941Yq1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActualConfig(config=" + this.a + ", shortSegments=" + ((Object) G12.a(this.b)) + ')';
    }
}
