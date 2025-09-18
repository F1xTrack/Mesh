package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ZN {
    public final C7973xO a;
    public final byte[] b;

    public ZN(C7973xO c7973xO, byte[] bArr) {
        if (c7973xO == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = c7973xO;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZN)) {
            return false;
        }
        ZN zn = (ZN) obj;
        if (this.a.equals(zn.a)) {
            return Arrays.equals(this.b, zn.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
