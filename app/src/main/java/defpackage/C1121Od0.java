package defpackage;

import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: Od0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1121Od0 {
    public final RemoteConfig a;
    public final String b;

    public C1121Od0(RemoteConfig remoteConfig, String str) {
        this.a = remoteConfig;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1121Od0)) {
            return false;
        }
        C1121Od0 c1121Od0 = (C1121Od0) obj;
        return O90.a(this.a, c1121Od0.a) && O90.a(this.b, c1121Od0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SnapshotConfig(config=" + this.a + ", shortSegments=" + ((Object) G12.a(this.b)) + ')';
    }
}
