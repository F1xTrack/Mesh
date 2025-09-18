package p000;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: v70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11377v70 {
    /* renamed from: a */
    public static void m25363a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    public static String m25364b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i <= -1) {
                    m25363a(base64OutputStream);
                    String string = byteArrayOutputStream.toString();
                    O90.m5967e(string, "toString(...)");
                    return string;
                }
                base64OutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                m25363a(base64OutputStream);
                throw th;
            }
        }
    }
}
