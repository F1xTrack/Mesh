package defpackage;

import java.util.Arrays;

/* renamed from: pa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6485pa0 {
    public final String a;
    public final byte[] b;

    public C6485pa0(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C6485pa0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.d(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.PersistentMetricsEventDto");
        C6485pa0 c6485pa0 = (C6485pa0) obj;
        return O90.a(this.a, c6485pa0.a) && Arrays.equals(this.b, c6485pa0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
