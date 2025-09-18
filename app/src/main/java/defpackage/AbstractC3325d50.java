package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/* renamed from: d50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3325d50 {
    public static final /* synthetic */ int a = 0;

    static {
        char c = File.separatorChar;
        C6774r51 c6774r51 = new C6774r51(0);
        PrintWriter printWriter = new PrintWriter(c6774r51);
        try {
            printWriter.println();
            c6774r51.toString();
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

    public static int a(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
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

    public static String b(InputStream inputStream, Charset charset) throws IOException {
        C6774r51 c6774r51 = new C6774r51();
        int i = AbstractC8060xr.a;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        char[] cArr = new char[4096];
        while (true) {
            int i2 = inputStreamReader.read(cArr);
            if (-1 == i2) {
                return c6774r51.a.toString();
            }
            c6774r51.write(cArr, 0, i2);
        }
    }
}
