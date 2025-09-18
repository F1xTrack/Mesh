package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/* renamed from: d50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9069d50 {

    /* renamed from: a */
    public static final /* synthetic */ int f25808a = 0;

    static {
        char c = File.separatorChar;
        C10862r51 c10862r51 = new C10862r51(0);
        PrintWriter printWriter = new PrintWriter(c10862r51);
        try {
            printWriter.println();
            c10862r51.toString();
            printWriter.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    printWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public static int m17491a(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                break;
            }
            fileOutputStream.write(bArr, 0, i);
            j += i;
        }
        if (j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }

    /* renamed from: b */
    public static String m17492b(InputStream inputStream, Charset charset) throws IOException {
        C10862r51 c10862r51 = new C10862r51();
        int i = AbstractC7164xr.f45850a;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        char[] cArr = new char[4096];
        while (true) {
            int i2 = inputStreamReader.read(cArr);
            if (-1 == i2) {
                return c10862r51.f41335a.toString();
            }
            c10862r51.write(cArr, 0, i2);
        }
    }
}
