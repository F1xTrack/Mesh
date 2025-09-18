package com.yandex.metrica.impl.ob;

import android.content.Context;
import defpackage.AbstractC8235ym;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.yandex.metrica.impl.ob.bn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2663bn {
    private final Context a;
    private final String b;
    private final L0 c;
    private File d;
    private FileLock e;
    private RandomAccessFile f;
    private FileChannel g;
    private int h;

    public C2663bn(Context context, String str) {
        this(context, str, new L0());
    }

    public synchronized void a() throws Throwable {
        try {
            File fileB = this.c.b(this.a.getFilesDir(), this.b);
            this.d = fileB;
            if (fileB == null) {
                throw new IllegalStateException("Cannot create lock file");
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.d, "rw");
            this.f = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.g = channel;
            if (this.h == 0) {
                this.e = channel.lock();
            }
            this.h++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            File file = this.d;
            if (file != null) {
                file.getAbsolutePath();
            }
            int i = this.h - 1;
            this.h = i;
            if (i == 0) {
                V0.a(this.e);
            }
            U2.a((Closeable) this.f);
            U2.a((Closeable) this.g);
            this.f = null;
            this.e = null;
            this.g = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c() {
        b();
        File file = this.d;
        if (file != null) {
            file.delete();
        }
    }

    public C2663bn(Context context, String str, L0 l0) {
        this.h = 0;
        this.a = context;
        this.b = AbstractC8235ym.i(str, ".lock");
        this.c = l0;
    }
}
