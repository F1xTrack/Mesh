package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class JQ1 implements Serializable, Iterable {

    /* renamed from: c */
    public static final JQ1 f5516c = new JQ1(BS1.f827b);

    /* renamed from: d */
    public static final C9222eH1 f5517d = new C9222eH1(3);

    /* renamed from: a */
    public int f5518a = 0;

    /* renamed from: b */
    public final byte[] f5519b;

    public JQ1(byte[] bArr) {
        bArr.getClass();
        this.f5519b = bArr;
    }

    /* renamed from: d */
    public static int m4317d(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26230g(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Beginning index larger than ending index: ", i2, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i2, "End index: ", i3, " >= "));
    }

    /* renamed from: h */
    public static JQ1 m4318h(byte[] bArr, int i, int i2) {
        m4317d(i, i + i2, bArr.length);
        f5517d.getClass();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new JQ1(bArr2);
    }

    /* renamed from: b */
    public byte mo4319b(int i) {
        return this.f5519b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JQ1) || mo4321k() != ((JQ1) obj).mo4321k()) {
            return false;
        }
        if (mo4321k() == 0) {
            return true;
        }
        if (!(obj instanceof JQ1)) {
            return obj.equals(this);
        }
        JQ1 jq1 = (JQ1) obj;
        int i = this.f5518a;
        int i2 = jq1.f5518a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iMo4321k = mo4321k();
        if (iMo4321k > jq1.mo4321k()) {
            throw new IllegalArgumentException("Length too large: " + iMo4321k + mo4321k());
        }
        if (iMo4321k > jq1.mo4321k()) {
            throw new IllegalArgumentException(AbstractC7222ym.m26229f(iMo4321k, "Ran off end of other: 0, ", jq1.mo4321k(), ", "));
        }
        int iMo4322q = mo4322q() + iMo4321k;
        int iMo4322q2 = mo4322q();
        int iMo4322q3 = jq1.mo4322q();
        while (iMo4322q2 < iMo4322q) {
            if (this.f5519b[iMo4322q2] != jq1.f5519b[iMo4322q3]) {
                return false;
            }
            iMo4322q2++;
            iMo4322q3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f5518a;
        if (i == 0) {
            int iMo4321k = mo4321k();
            int iMo4322q = mo4322q();
            int i2 = iMo4321k;
            for (int i3 = iMo4322q; i3 < iMo4322q + iMo4321k; i3++) {
                i2 = (i2 * 31) + this.f5519b[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.f5518a = i;
        }
        return i;
    }

    /* renamed from: i */
    public byte mo4320i(int i) {
        return this.f5519b[i];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0110Bk(this);
    }

    /* renamed from: k */
    public int mo4321k() {
        return this.f5519b.length;
    }

    /* renamed from: q */
    public int mo4322q() {
        return 0;
    }

    public final String toString() {
        String strM26232i;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo4321k = mo4321k();
        if (mo4321k() <= 50) {
            strM26232i = M22.m5250d(this);
        } else {
            int iM4317d = m4317d(0, 47, mo4321k());
            strM26232i = AbstractC7222ym.m26232i(M22.m5250d(iM4317d == 0 ? f5516c : new C11924zQ1(this.f5519b, mo4322q(), iM4317d)), "...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo4321k);
        sb.append(" contents=\"");
        return AbstractC1374Vq.m8593l(sb, strM26232i, "\">");
    }
}
