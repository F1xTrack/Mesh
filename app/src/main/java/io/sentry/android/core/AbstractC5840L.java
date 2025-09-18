package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: io.sentry.android.core.L */
/* loaded from: classes2.dex */
public abstract class AbstractC5840L {

    /* renamed from: a */
    public static String f33550a;

    /* renamed from: b */
    public static final Charset f33551b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static synchronized String m21534a(Context context) {
        try {
            if (f33550a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String string = UUID.randomUUID().toString();
                            fileOutputStream.write(string.getBytes(f33551b));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            f33550a = string;
                            return string;
                        } finally {
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, f33551b);
                        randomAccessFile.close();
                        f33550a = str;
                    } finally {
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            return f33550a;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
