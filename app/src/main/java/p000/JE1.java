package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class JE1 implements Iterable, Serializable {

    /* renamed from: b */
    public static final GE1 f5402b = new GE1(AbstractC11398vH1.f44321b);

    /* renamed from: a */
    public int f5403a = 0;

    static {
        int i = PD1.f8909a;
    }

    /* renamed from: A */
    public static int m4257A(int i, int i2, int i3) {
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

    /* renamed from: C */
    public static GE1 m4258C(byte[] bArr, int i, int i2) {
        m4257A(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new GE1(bArr2);
    }

    /* renamed from: E */
    public static JE1 m4259E(InputStream inputStream) throws IOException {
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
            GE1 ge1M4258C = i == 0 ? null : m4258C(bArr, 0, i);
            if (ge1M4258C == null) {
                break;
            }
            arrayList.add(ge1M4258C);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? f5402b : m4261h(arrayList.iterator(), size);
    }

    /* renamed from: F */
    public static void m4260F(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index > length: ", i2, ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC11153tN0.m24909u(i, "Index < 0: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f9  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.JE1 m4261h(java.util.Iterator r8, int r9) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.JE1.m4261h(java.util.Iterator, int):JE1");
    }

    @Override // java.lang.Iterable
    /* renamed from: B */
    public AbstractC10168lg1 iterator() {
        return new C9472gE1(this);
    }

    /* renamed from: b */
    public abstract byte mo3004b(int i);

    /* renamed from: d */
    public abstract byte mo3005d(int i);

    public final int hashCode() {
        int iMo3010s = this.f5403a;
        if (iMo3010s == 0) {
            int iMo3006i = mo3006i();
            iMo3010s = mo3010s(iMo3006i, 0, iMo3006i);
            if (iMo3010s == 0) {
                iMo3010s = 1;
            }
            this.f5403a = iMo3010s;
        }
        return iMo3010s;
    }

    /* renamed from: i */
    public abstract int mo3006i();

    /* renamed from: k */
    public abstract void mo3007k(int i, byte[] bArr, int i2, int i3);

    /* renamed from: q */
    public abstract int mo3008q();

    /* renamed from: r */
    public abstract boolean mo3009r();

    /* renamed from: s */
    public abstract int mo3010s(int i, int i2, int i3);

    /* renamed from: t */
    public abstract int mo3011t(int i, int i2, int i3);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo3006i = mo3006i();
        String strM25081d = mo3006i() <= 50 ? AbstractC11239u22.m25081d(this) : AbstractC11239u22.m25081d(mo3012u(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo3006i);
        sb.append(" contents=\"");
        return AbstractC1374Vq.m8593l(sb, strM25081d, "\">");
    }

    /* renamed from: u */
    public abstract JE1 mo3012u(int i, int i2);

    /* renamed from: v */
    public abstract String mo3013v(Charset charset);

    /* renamed from: y */
    public abstract void mo3014y(WE1 we1);

    /* renamed from: z */
    public abstract boolean mo3015z();
}
