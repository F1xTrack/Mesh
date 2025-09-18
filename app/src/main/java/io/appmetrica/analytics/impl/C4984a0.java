package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a0 */
/* loaded from: classes2.dex */
public final class C4984a0 {

    /* renamed from: a */
    public final String f31232a;

    /* renamed from: b */
    public final long f31233b;

    public C4984a0(String str, long j) {
        this.f31232a = str;
        this.f31233b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4984a0.class != obj.getClass()) {
            return false;
        }
        C4984a0 c4984a0 = (C4984a0) obj;
        if (this.f31233b != c4984a0.f31233b) {
            return false;
        }
        String str = this.f31232a;
        String str2 = c4984a0.f31232a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f31232a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.f31233b;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
