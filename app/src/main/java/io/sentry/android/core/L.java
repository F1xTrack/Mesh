package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class L {
    public static String a;
    public static final Charset b = Charset.forName("UTF-8");

    public static synchronized String a(Context context) {
        try {
            if (a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String string = UUID.randomUUID().toString();
                            fileOutputStream.write(string.getBytes(b));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            a = string;
                            return string;
                        } finally {
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, b);
                        randomAccessFile.close();
                        a = str;
                    } finally {
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            return a;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
