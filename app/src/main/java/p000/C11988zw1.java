package p000;

import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: zw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11988zw1 {

    /* renamed from: a */
    public final RemoteConfig f47107a;

    /* renamed from: b */
    public final String f47108b;

    public C11988zw1(RemoteConfig remoteConfig, String str) {
        this.f47107a = remoteConfig;
        this.f47108b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11988zw1)) {
            return false;
        }
        C11988zw1 c11988zw1 = (C11988zw1) obj;
        return O90.m5963a(this.f47107a, c11988zw1.f47107a) && O90.m5963a(this.f47108b, c11988zw1.f47108b);
    }

    public final int hashCode() {
        return this.f47108b.hashCode() + (this.f47107a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultConfig(config=" + this.f47107a + ", shortSegments=" + ((Object) G12.m2910a(this.f47108b)) + ')';
    }
}
