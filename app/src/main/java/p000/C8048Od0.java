package p000;

import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: Od0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8048Od0 {

    /* renamed from: a */
    public final RemoteConfig f8541a;

    /* renamed from: b */
    public final String f8542b;

    public C8048Od0(RemoteConfig remoteConfig, String str) {
        this.f8541a = remoteConfig;
        this.f8542b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8048Od0)) {
            return false;
        }
        C8048Od0 c8048Od0 = (C8048Od0) obj;
        return O90.m5963a(this.f8541a, c8048Od0.f8541a) && O90.m5963a(this.f8542b, c8048Od0.f8542b);
    }

    public final int hashCode() {
        return this.f8542b.hashCode() + (this.f8541a.hashCode() * 31);
    }

    public final String toString() {
        return "SnapshotConfig(config=" + this.f8541a + ", shortSegments=" + ((Object) G12.m2910a(this.f8542b)) + ')';
    }
}
