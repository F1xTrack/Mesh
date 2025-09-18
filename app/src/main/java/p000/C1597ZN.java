package p000;

import java.util.Arrays;

/* renamed from: ZN */
/* loaded from: classes.dex */
public final class C1597ZN {

    /* renamed from: a */
    public final C7135xO f14870a;

    /* renamed from: b */
    public final byte[] f14871b;

    public C1597ZN(C7135xO c7135xO, byte[] bArr) {
        if (c7135xO == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f14870a = c7135xO;
        this.f14871b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1597ZN)) {
            return false;
        }
        C1597ZN c1597zn = (C1597ZN) obj;
        if (this.f14870a.equals(c1597zn.f14870a)) {
            return Arrays.equals(this.f14871b, c1597zn.f14871b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14870a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14871b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f14870a + ", bytes=[...]}";
    }
}
