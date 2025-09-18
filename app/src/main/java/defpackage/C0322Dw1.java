package defpackage;

import java.util.Map;

/* renamed from: Dw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0322Dw1 {
    public final String a;
    public final String b;
    public final Map c;

    public C0322Dw1(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0322Dw1)) {
            return false;
        }
        C0322Dw1 c0322Dw1 = (C0322Dw1) obj;
        return O90.a(this.a, c0322Dw1.a) && O90.a(this.b, c0322Dw1.b) && O90.a(this.c, c0322Dw1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "MigrationDtoVer1(uuid=" + ((Object) ("MetricsEventUuid(value=" + this.a + ')')) + ", eventName=" + this.b + ", eventData=" + this.c + ')';
    }
}
