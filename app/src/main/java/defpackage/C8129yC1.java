package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: yC1 */
/* loaded from: classes.dex */
public class C8129yC1 implements Iterable, Serializable {
    public static final C8129yC1 c = new C8129yC1(AbstractC3356dF1.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i = MB1.a;
    }

    public C8129yC1(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int i(int i, int i2, int i3) {
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

    public static C8129yC1 k(byte[] bArr, int i, int i2) {
        i(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C8129yC1(bArr2);
    }

    public byte b(int i) {
        return this.b[i];
    }

    public byte d(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8129yC1) || h() != ((C8129yC1) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof C8129yC1)) {
            return obj.equals(this);
        }
        C8129yC1 c8129yC1 = (C8129yC1) obj;
        int i = this.a;
        int i2 = c8129yC1.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iH = h();
        if (iH > c8129yC1.h()) {
            throw new IllegalArgumentException("Length too large: " + iH + h());
        }
        if (iH > c8129yC1.h()) {
            throw new IllegalArgumentException(AbstractC8235ym.f(iH, "Ran off end of other: 0, ", c8129yC1.h(), ", "));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < iH) {
            if (this.b[i3] != c8129yC1.b[i4]) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    public int h() {
        return this.b.length;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int iH = h();
        int i2 = iH;
        for (int i3 = 0; i3 < iH; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0128Bk(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iH = h();
        if (h() <= 50) {
            strConcat = AbstractC5810m22.b(this);
        } else {
            int i = i(0, 47, h());
            strConcat = AbstractC5810m22.b(i == 0 ? c : new C6605qC1(this.b, i)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iH);
        sb.append(" contents=\"");
        return AbstractC1705Vq.l(sb, strConcat, "\">");
    }
}
