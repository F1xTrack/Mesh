package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* renamed from: Te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513Te {
    public final String a;
    public final byte[] b;
    public final EnumC7370uD0 c;

    public C1513Te(String str, byte[] bArr, EnumC7370uD0 enumC7370uD0) {
        this.a = str;
        this.b = bArr;
        this.c = enumC7370uD0;
    }

    public static C1857Xo1 a() {
        C1857Xo1 c1857Xo1 = new C1857Xo1(4);
        c1857Xo1.d = EnumC7370uD0.a;
        return c1857Xo1;
    }

    public final C1513Te b(EnumC7370uD0 enumC7370uD0) {
        C1857Xo1 c1857Xo1A = a();
        c1857Xo1A.Q(this.a);
        if (enumC7370uD0 == null) {
            throw new NullPointerException("Null priority");
        }
        c1857Xo1A.d = enumC7370uD0;
        c1857Xo1A.c = this.b;
        return c1857Xo1A.m();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1513Te)) {
            return false;
        }
        C1513Te c1513Te = (C1513Te) obj;
        return this.a.equals(c1513Te.a) && Arrays.equals(this.b, c1513Te.b) && this.c.equals(c1513Te.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        return "TransportContext(" + this.a + ", " + this.c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
