package p000;

import java.util.Map;

/* renamed from: Dw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7515Dw1 {

    /* renamed from: a */
    public final String f2326a;

    /* renamed from: b */
    public final String f2327b;

    /* renamed from: c */
    public final Map f2328c;

    public C7515Dw1(String str, String str2, Map map) {
        this.f2326a = str;
        this.f2327b = str2;
        this.f2328c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7515Dw1)) {
            return false;
        }
        C7515Dw1 c7515Dw1 = (C7515Dw1) obj;
        return O90.m5963a(this.f2326a, c7515Dw1.f2326a) && O90.m5963a(this.f2327b, c7515Dw1.f2327b) && O90.m5963a(this.f2328c, c7515Dw1.f2328c);
    }

    public final int hashCode() {
        return this.f2328c.hashCode() + AbstractC1374Vq.m8586e(this.f2326a.hashCode() * 31, 31, this.f2327b);
    }

    public final String toString() {
        return "MigrationDtoVer1(uuid=" + ((Object) ("MetricsEventUuid(value=" + this.f2326a + ')')) + ", eventName=" + this.f2327b + ", eventData=" + this.f2328c + ')';
    }
}
