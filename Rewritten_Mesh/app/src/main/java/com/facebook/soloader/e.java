package com.facebook.soloader;

import defpackage.E6;
import defpackage.J71;
import defpackage.O90;
import defpackage.XY;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class e implements Closeable {
    public static void a(XY xy, byte[] bArr, File file) {
        int i;
        InputStream inputStream = (InputStream) xy.c;
        O90.k(4, "fb-UnpackingSoSource");
        File file2 = new File(file, (String) ((E6) xy.b).a);
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    int iAvailable = inputStream.available();
                    if (iAvailable > 1) {
                        SysUtil$LollipopSysdeps.fallocateIfSupported(randomAccessFile.getFD(), iAvailable);
                    }
                    int i2 = 0;
                    while (i2 < Integer.MAX_VALUE && (i = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i2))) != -1) {
                        randomAccessFile.write(bArr, 0, i);
                        i2 += i;
                    }
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    if (file2.setExecutable(true, false)) {
                        randomAccessFile.close();
                    } else {
                        throw new IOException("cannot make file executable: " + file2);
                    }
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                file2.toString();
                e.toString();
                J71.b(file2);
                throw e;
            }
        } finally {
            if (file2.exists() && !file2.setWritable(false)) {
                file2.toString();
                Objects.toString(file);
                file.canWrite();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract E6[] m();

    public abstract void n(File file);
}
