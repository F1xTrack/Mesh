package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: Ek, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0362Ek implements Iterable, Serializable {
    public static final C0362Ek c = new C0362Ek(AbstractC7929x90.b);
    public int a = 0;
    public final byte[] b;

    static {
        Class cls = AbstractC2445c4.a;
    }

    public C0362Ek(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int d(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.g(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "Beginning index larger than ending index: ", i2, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC8235ym.f(i2, "End index: ", i3, " >= "));
    }

    public byte b(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0362Ek) || size() != ((C0362Ek) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0362Ek)) {
            return obj.equals(this);
        }
        C0362Ek c0362Ek = (C0362Ek) obj;
        int i = this.a;
        int i2 = c0362Ek.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c0362Ek.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0362Ek.size()) {
            StringBuilder sbN = AbstractC8235ym.n(size, "Ran off end of other: 0, ", ", ");
            sbN.append(c0362Ek.size());
            throw new IllegalArgumentException(sbN.toString());
        }
        int iH = h() + size;
        int iH2 = h();
        int iH3 = c0362Ek.h();
        while (iH2 < iH) {
            if (this.b[iH2] != c0362Ek.b[iH3]) {
                return false;
            }
            iH2++;
            iH3++;
        }
        return true;
    }

    public int h() {
        return 0;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            int iH = h();
            int i2 = size;
            for (int i3 = iH; i3 < iH + size; i3++) {
                i2 = (i2 * 31) + this.b[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.a = i;
        }
        return i;
    }

    public byte i(int i) {
        return this.b[i];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0128Bk(this);
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        C0362Ek c0206Ck;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC6659qU1.a(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iD = d(0, 47, size());
            if (iD == 0) {
                c0206Ck = c;
            } else {
                c0206Ck = new C0206Ck(this.b, h(), iD);
            }
            sb.append(AbstractC6659qU1.a(c0206Ck));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return AbstractC1705Vq.l(sb2, string, "\">");
    }
}
