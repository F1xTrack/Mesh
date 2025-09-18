package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class JQ1 implements Serializable, Iterable {
    public static final JQ1 c = new JQ1(BS1.b);
    public static final C3552eH1 d = new C3552eH1(3);
    public int a = 0;
    public final byte[] b;

    public JQ1(byte[] bArr) {
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

    public static JQ1 h(byte[] bArr, int i, int i2) {
        d(i, i + i2, bArr.length);
        d.getClass();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new JQ1(bArr2);
    }

    public byte b(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JQ1) || k() != ((JQ1) obj).k()) {
            return false;
        }
        if (k() == 0) {
            return true;
        }
        if (!(obj instanceof JQ1)) {
            return obj.equals(this);
        }
        JQ1 jq1 = (JQ1) obj;
        int i = this.a;
        int i2 = jq1.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iK = k();
        if (iK > jq1.k()) {
            throw new IllegalArgumentException("Length too large: " + iK + k());
        }
        if (iK > jq1.k()) {
            throw new IllegalArgumentException(AbstractC8235ym.f(iK, "Ran off end of other: 0, ", jq1.k(), ", "));
        }
        int iQ = q() + iK;
        int iQ2 = q();
        int iQ3 = jq1.q();
        while (iQ2 < iQ) {
            if (this.b[iQ2] != jq1.b[iQ3]) {
                return false;
            }
            iQ2++;
            iQ3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int iK = k();
            int iQ = q();
            int i2 = iK;
            for (int i3 = iQ; i3 < iQ + iK; i3++) {
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
    public final /* synthetic */ Iterator iterator() {
        return new C0128Bk(this);
    }

    public int k() {
        return this.b.length;
    }

    public int q() {
        return 0;
    }

    public final String toString() {
        String strI;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iK = k();
        if (k() <= 50) {
            strI = M22.d(this);
        } else {
            int iD = d(0, 47, k());
            strI = AbstractC8235ym.i(M22.d(iD == 0 ? c : new C8361zQ1(this.b, q(), iD)), "...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iK);
        sb.append(" contents=\"");
        return AbstractC1705Vq.l(sb, strI, "\">");
    }
}
