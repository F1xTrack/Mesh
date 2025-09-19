package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import p000.AbstractC0259E6;
import p000.C1482XY;
import p000.J71;
import p000.O90;

/* renamed from: com.facebook.soloader.e */
/* loaded from: classes.dex */
public abstract class AbstractC1937e implements Closeable {
    /* renamed from: a */
    public static void m11090a(C1482XY c1482xy, byte[] bArr, File file) {
        int i;
        InputStream inputStream = (InputStream) c1482xy.f13845c;
        O90.m5973k(4, "fb-UnpackingSoSource");
        File file2 = new File(file, (String) ((AbstractC0259E6) c1482xy.f13844b).f2473a);
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
                J71.m4167b(file2);
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

    /* renamed from: m */
    public abstract AbstractC0259E6[] mo11079m();

    /* renamed from: n */
    public abstract void mo11080n(File file);
}
