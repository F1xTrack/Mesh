package p000;

import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: Yq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8595Yq1 {

    /* renamed from: a */
    public final RemoteConfig f14557a;

    /* renamed from: b */
    public final String f14558b;

    public C8595Yq1(RemoteConfig remoteConfig, String str) {
        this.f14557a = remoteConfig;
        this.f14558b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8595Yq1)) {
            return false;
        }
        C8595Yq1 c8595Yq1 = (C8595Yq1) obj;
        return O90.m5963a(this.f14557a, c8595Yq1.f14557a) && O90.m5963a(this.f14558b, c8595Yq1.f14558b);
    }

    public final int hashCode() {
        return this.f14558b.hashCode() + (this.f14557a.hashCode() * 31);
    }

    public final String toString() {
        return "ActualConfig(config=" + this.f14557a + ", shortSegments=" + ((Object) G12.m2910a(this.f14558b)) + ')';
    }
}
