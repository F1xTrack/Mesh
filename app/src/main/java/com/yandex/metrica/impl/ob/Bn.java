package com.yandex.metrica.impl.ob;

import android.content.Context;
import defpackage.AbstractC8235ym;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class Bn {
    private static final HashMap<String, Bn> g = new HashMap<>();
    private final String a;
    private FileLock b;
    private FileChannel c;
    private final File d;
    private RandomAccessFile e;
    private Semaphore f = new Semaphore(1, true);

    private Bn(Context context, String str) {
        String strI = AbstractC8235ym.i(str, ".lock");
        this.a = strI;
        File cacheDir = context.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, "appmetrica_locks");
        if (file != null) {
            file.mkdirs();
        }
        this.d = file != null ? new File(file, strI) : null;
    }

    public static synchronized Bn a(Context context, String str) {
        Bn bn;
        HashMap<String, Bn> map = g;
        bn = map.get(str);
        if (bn == null) {
            bn = new Bn(context, str);
            map.put(str, bn);
        }
        return bn;
    }

    public synchronized void b() {
        this.f.release();
        if (this.f.availablePermits() > 0) {
            V0.a(this.b);
            U2.a((Closeable) this.c);
            U2.a((Closeable) this.e);
            this.c = null;
            this.e = null;
        }
    }

    public synchronized void a() throws Throwable {
        try {
            this.f.acquire();
            if (this.d != null) {
                if (this.c == null) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.d, "rw");
                    this.e = randomAccessFile;
                    this.c = randomAccessFile.getChannel();
                }
                this.b = this.c.lock();
            } else {
                throw new IllegalStateException("Lock file is null");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
