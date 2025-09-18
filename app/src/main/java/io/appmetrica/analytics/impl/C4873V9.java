package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p028io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: io.appmetrica.analytics.impl.V9 */
/* loaded from: classes2.dex */
public final class C4873V9 {

    /* renamed from: a */
    public final File f30851a;

    /* renamed from: b */
    public FileLock f30852b;

    /* renamed from: c */
    public RandomAccessFile f30853c;

    /* renamed from: d */
    public FileChannel f30854d;

    /* renamed from: e */
    public int f30855e;

    public C4873V9(Context context, String str) {
        this(m19914a(context, str));
    }

    /* renamed from: a */
    public final synchronized void m19915a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f30851a, "rw");
            this.f30853c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f30854d = channel;
            if (this.f30855e == 0) {
                this.f30852b = channel.lock();
            }
            this.f30855e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized void m19916b() {
        try {
            this.f30851a.getAbsolutePath();
            int i = this.f30855e - 1;
            this.f30855e = i;
            if (i == 0) {
                AbstractC4515Ga.m19439a(this.f30852b);
            }
            AbstractC5182hn.m20510a((Closeable) this.f30853c);
            AbstractC5182hn.m20510a((Closeable) this.f30854d);
            this.f30853c = null;
            this.f30852b = null;
            this.f30854d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C4873V9(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public C4873V9(File file) {
        this.f30855e = 0;
        this.f30851a = file;
    }

    /* renamed from: a */
    public static File m19914a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
