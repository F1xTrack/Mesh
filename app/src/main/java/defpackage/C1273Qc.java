package defpackage;

import java.util.Arrays;

/* renamed from: Qc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273Qc extends AbstractC7931xA {
    public final String a;
    public final byte[] b;

    public C1273Qc(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7931xA)) {
            return false;
        }
        AbstractC7931xA abstractC7931xA = (AbstractC7931xA) obj;
        if (this.a.equals(((C1273Qc) abstractC7931xA).a)) {
            if (Arrays.equals(this.b, (abstractC7931xA instanceof C1273Qc ? (C1273Qc) abstractC7931xA : (C1273Qc) abstractC7931xA).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
