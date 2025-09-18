package p000;

import java.util.Arrays;

/* renamed from: Qc */
/* loaded from: classes.dex */
public final class C1046Qc extends AbstractC7121xA {

    /* renamed from: a */
    public final String f9692a;

    /* renamed from: b */
    public final byte[] f9693b;

    public C1046Qc(String str, byte[] bArr) {
        this.f9692a = str;
        this.f9693b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7121xA)) {
            return false;
        }
        AbstractC7121xA abstractC7121xA = (AbstractC7121xA) obj;
        if (this.f9692a.equals(((C1046Qc) abstractC7121xA).f9692a)) {
            if (Arrays.equals(this.f9693b, (abstractC7121xA instanceof C1046Qc ? (C1046Qc) abstractC7121xA : (C1046Qc) abstractC7121xA).f9693b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9692a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9693b);
    }

    public final String toString() {
        return "File{filename=" + this.f9692a + ", contents=" + Arrays.toString(this.f9693b) + "}";
    }
}
