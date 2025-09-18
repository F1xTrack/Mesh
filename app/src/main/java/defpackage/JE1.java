package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class JE1 implements Iterable, Serializable {
    public static final GE1 b = new GE1(AbstractC7574vH1.b);
    public int a = 0;

    static {
        int i = PD1.a;
    }

    public static int A(int i, int i2, int i3) {
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

    public static GE1 C(byte[] bArr, int i, int i2) {
        A(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new GE1(bArr2);
    }

    public static JE1 E(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = inputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            GE1 ge1C = i == 0 ? null : C(bArr, 0, i);
            if (ge1C == null) {
                break;
            }
            arrayList.add(ge1C);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? b : h(arrayList.iterator(), size);
    }

    public static void F(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC8235ym.f(i, "Index > length: ", i2, ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC7209tN0.u(i, "Index < 0: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.JE1 h(java.util.Iterator r8, int r9) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JE1.h(java.util.Iterator, int):JE1");
    }

    @Override // java.lang.Iterable
    /* renamed from: B */
    public AbstractC5740lg1 iterator() {
        return new C3925gE1(this);
    }

    public abstract byte b(int i);

    public abstract byte d(int i);

    public final int hashCode() {
        int iS = this.a;
        if (iS == 0) {
            int i = i();
            iS = s(i, 0, i);
            if (iS == 0) {
                iS = 1;
            }
            this.a = iS;
        }
        return iS;
    }

    public abstract int i();

    public abstract void k(int i, byte[] bArr, int i2, int i3);

    public abstract int q();

    public abstract boolean r();

    public abstract int s(int i, int i2, int i3);

    public abstract int t(int i, int i2, int i3);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i = i();
        String strD = i() <= 50 ? AbstractC7337u22.d(this) : AbstractC7337u22.d(u(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(i);
        sb.append(" contents=\"");
        return AbstractC1705Vq.l(sb, strD, "\">");
    }

    public abstract JE1 u(int i, int i2);

    public abstract String v(Charset charset);

    public abstract void y(WE1 we1);

    public abstract boolean z();
}
