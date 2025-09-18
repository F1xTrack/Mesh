package p000;

import java.util.Arrays;

/* renamed from: pa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10667pa0 {

    /* renamed from: a */
    public final String f40219a;

    /* renamed from: b */
    public final byte[] f40220b;

    public C10667pa0(String str, byte[] bArr) {
        this.f40219a = str;
        this.f40220b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C10667pa0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.m5966d(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.PersistentMetricsEventDto");
        C10667pa0 c10667pa0 = (C10667pa0) obj;
        return O90.m5963a(this.f40219a, c10667pa0.f40219a) && Arrays.equals(this.f40220b, c10667pa0.f40220b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40220b) + (this.f40219a.hashCode() * 31);
    }
}
