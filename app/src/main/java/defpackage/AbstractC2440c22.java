package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: c22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2440c22 {
    public static final byte[] a(String str) {
        try {
            Charset charsetForName = Charset.forName("ASCII");
            O90.e(charsetForName, "forName(charsetName)");
            byte[] bytes = str.getBytes(charsetForName);
            O90.e(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static final boolean b(int i, byte[] bArr, byte[] bArr2) {
        O90.f(bArr, "byteArray");
        O90.f(bArr2, "pattern");
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        Iterable c3909g90 = new C3909g90(0, bArr2.length - 1, 1);
        if (!(c3909g90 instanceof Collection) || !((Collection) c3909g90).isEmpty()) {
            Iterator it = c3909g90.iterator();
            while (((C3718f90) it).c) {
                int iA = ((C3718f90) it).a();
                if (bArr[i + iA] != bArr2[iA]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean c(byte[] bArr, byte[] bArr2) {
        O90.f(bArr, "byteArray");
        O90.f(bArr2, "pattern");
        return b(0, bArr, bArr2);
    }

    public static int d(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iD = AbstractC3316d22.d(obj);
        int i4 = iD & i;
        int iE = e(i4, obj3);
        if (iE != 0) {
            int i5 = ~i;
            int i6 = iD & i5;
            int i7 = -1;
            while (true) {
                i2 = iE - 1;
                int i8 = iArr[i2];
                i3 = i8 & i;
                if ((i8 & i5) != i6 || !O12.b(obj, objArr[i2]) || (objArr2 != null && !O12.b(obj2, objArr2[i2]))) {
                    if (i3 == 0) {
                        break;
                    }
                    i7 = i2;
                    iE = i3;
                } else {
                    break;
                }
            }
            if (i7 == -1) {
                g(i4, i3, obj3);
            } else {
                iArr[i7] = (iArr[i7] & i5) | (i3 & i);
            }
            return i2;
        }
        return -1;
    }

    public static int e(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object f(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static void g(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
