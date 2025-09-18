package p000;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: c22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8930c22 {
    /* renamed from: a */
    public static final byte[] m10573a(String str) {
        try {
            Charset charsetForName = Charset.forName("ASCII");
            O90.m5967e(charsetForName, "forName(charsetName)");
            byte[] bytes = str.getBytes(charsetForName);
            O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static final boolean m10574b(int i, byte[] bArr, byte[] bArr2) {
        O90.m5968f(bArr, "byteArray");
        O90.m5968f(bArr2, "pattern");
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        Iterable c9461g90 = new C9461g90(0, bArr2.length - 1, 1);
        if (!(c9461g90 instanceof Collection) || !((Collection) c9461g90).isEmpty()) {
            Iterator it = c9461g90.iterator();
            while (((C9333f90) it).f27092c) {
                int iM18193a = ((C9333f90) it).m18193a();
                if (bArr[i + iM18193a] != bArr2[iM18193a]) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m10575c(byte[] bArr, byte[] bArr2) {
        O90.m5968f(bArr, "byteArray");
        O90.m5968f(bArr2, "pattern");
        return m10574b(0, bArr, bArr2);
    }

    /* renamed from: d */
    public static int m10576d(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iM17480d = AbstractC9063d22.m17480d(obj);
        int i4 = iM17480d & i;
        int iM10577e = m10577e(i4, obj3);
        if (iM10577e != 0) {
            int i5 = ~i;
            int i6 = iM17480d & i5;
            int i7 = -1;
            while (true) {
                i2 = iM10577e - 1;
                int i8 = iArr[i2];
                i3 = i8 & i;
                if ((i8 & i5) != i6 || !O12.m5941b(obj, objArr[i2]) || (objArr2 != null && !O12.m5941b(obj2, objArr2[i2]))) {
                    if (i3 == 0) {
                        break;
                    }
                    i7 = i2;
                    iM10577e = i3;
                } else {
                    break;
                }
            }
            if (i7 == -1) {
                m10579g(i4, i3, obj3);
            } else {
                iArr[i7] = (iArr[i7] & i5) | (i3 & i);
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: e */
    public static int m10577e(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    /* renamed from: f */
    public static Object m10578f(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    /* renamed from: g */
    public static void m10579g(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
