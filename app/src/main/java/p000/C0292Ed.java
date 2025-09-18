package p000;

import java.util.Arrays;

/* renamed from: Ed */
/* loaded from: classes.dex */
public final class C0292Ed extends AbstractC6300kR {

    /* renamed from: a */
    public final byte[] f2806a;

    /* renamed from: b */
    public final byte[] f2807b;

    public C0292Ed(byte[] bArr, byte[] bArr2) {
        this.f2806a = bArr;
        this.f2807b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6300kR)) {
            return false;
        }
        AbstractC6300kR abstractC6300kR = (AbstractC6300kR) obj;
        boolean z = abstractC6300kR instanceof C0292Ed;
        if (Arrays.equals(this.f2806a, z ? ((C0292Ed) abstractC6300kR).f2806a : ((C0292Ed) abstractC6300kR).f2806a)) {
            if (Arrays.equals(this.f2807b, z ? ((C0292Ed) abstractC6300kR).f2807b : ((C0292Ed) abstractC6300kR).f2807b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f2806a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2807b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f2806a) + ", encryptedBlob=" + Arrays.toString(this.f2807b) + "}";
    }
}
