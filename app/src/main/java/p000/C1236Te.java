package p000;

import android.util.Base64;
import java.util.Arrays;

/* renamed from: Te */
/* loaded from: classes.dex */
public final class C1236Te {

    /* renamed from: a */
    public final String f11450a;

    /* renamed from: b */
    public final byte[] f11451b;

    /* renamed from: c */
    public final EnumC11261uD0 f11452c;

    public C1236Te(String str, byte[] bArr, EnumC11261uD0 enumC11261uD0) {
        this.f11450a = str;
        this.f11451b = bArr;
        this.f11452c = enumC11261uD0;
    }

    /* renamed from: a */
    public static C8539Xo1 m7707a() {
        C8539Xo1 c8539Xo1 = new C8539Xo1(4);
        c8539Xo1.f13983d = EnumC11261uD0.f43594a;
        return c8539Xo1;
    }

    /* renamed from: b */
    public final C1236Te m7708b(EnumC11261uD0 enumC11261uD0) {
        C8539Xo1 c8539Xo1M7707a = m7707a();
        c8539Xo1M7707a.m9134Q(this.f11450a);
        if (enumC11261uD0 == null) {
            throw new NullPointerException("Null priority");
        }
        c8539Xo1M7707a.f13983d = enumC11261uD0;
        c8539Xo1M7707a.f13982c = this.f11451b;
        return c8539Xo1M7707a.m9144m();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1236Te)) {
            return false;
        }
        C1236Te c1236Te = (C1236Te) obj;
        return this.f11450a.equals(c1236Te.f11450a) && Arrays.equals(this.f11451b, c1236Te.f11451b) && this.f11452c.equals(c1236Te.f11452c);
    }

    public final int hashCode() {
        return ((((this.f11450a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11451b)) * 1000003) ^ this.f11452c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f11451b;
        return "TransportContext(" + this.f11450a + ", " + this.f11452c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
