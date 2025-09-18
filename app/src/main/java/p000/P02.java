package p000;

import android.view.View;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public abstract class P02 {
    /* renamed from: a */
    public static String m6196a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m6197b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static long[] m6198c(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* renamed from: d */
    public static void m6199d(C6822sQ c6822sQ, C7157xk c7157xk, int i) {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i2 = c6822sQ.read(bArr, 0, iMin);
            if (i2 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= i2;
            c7157xk.write(bArr, 0, i2);
        }
    }

    /* renamed from: e */
    public static void m6200e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* renamed from: f */
    public static final void m6201f(View view, InterfaceC7880Kx0 interfaceC7880Kx0) {
        O90.m5968f(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC7880Kx0);
    }
}
