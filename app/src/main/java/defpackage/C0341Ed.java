package defpackage;

import java.util.Arrays;

/* renamed from: Ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341Ed extends AbstractC5502kR {
    public final byte[] a;
    public final byte[] b;

    public C0341Ed(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5502kR)) {
            return false;
        }
        AbstractC5502kR abstractC5502kR = (AbstractC5502kR) obj;
        boolean z = abstractC5502kR instanceof C0341Ed;
        if (Arrays.equals(this.a, z ? ((C0341Ed) abstractC5502kR).a : ((C0341Ed) abstractC5502kR).a)) {
            if (Arrays.equals(this.b, z ? ((C0341Ed) abstractC5502kR).b : ((C0341Ed) abstractC5502kR).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
