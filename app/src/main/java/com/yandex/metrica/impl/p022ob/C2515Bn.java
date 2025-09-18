package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.concurrent.Semaphore;
import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.Bn */
/* loaded from: classes2.dex */
public final class C2515Bn {

    /* renamed from: g */
    private static final HashMap<String, C2515Bn> f20946g = new HashMap<>();

    /* renamed from: a */
    private final String f20947a;

    /* renamed from: b */
    private FileLock f20948b;

    /* renamed from: c */
    private FileChannel f20949c;

    /* renamed from: d */
    private final File f20950d;

    /* renamed from: e */
    private RandomAccessFile f20951e;

    /* renamed from: f */
    private Semaphore f20952f = new Semaphore(1, true);

    private C2515Bn(Context context, String str) {
        String strM26232i = AbstractC7222ym.m26232i(str, ".lock");
        this.f20947a = strM26232i;
        File cacheDir = context.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, "appmetrica_locks");
        if (file != null) {
            file.mkdirs();
        }
        this.f20950d = file != null ? new File(file, strM26232i) : null;
    }

    /* renamed from: a */
    public static synchronized C2515Bn m13939a(Context context, String str) {
        C2515Bn c2515Bn;
        HashMap<String, C2515Bn> map = f20946g;
        c2515Bn = map.get(str);
        if (c2515Bn == null) {
            c2515Bn = new C2515Bn(context, str);
            map.put(str, c2515Bn);
        }
        return c2515Bn;
    }

    /* renamed from: b */
    public synchronized void m13941b() {
        this.f20952f.release();
        if (this.f20952f.availablePermits() > 0) {
            C2991V0.m15296a(this.f20948b);
            C2968U2.m15241a((Closeable) this.f20949c);
            C2968U2.m15241a((Closeable) this.f20951e);
            this.f20949c = null;
            this.f20951e = null;
        }
    }

    /* renamed from: a */
    public synchronized void m13940a() throws Throwable {
        try {
            this.f20952f.acquire();
            if (this.f20950d != null) {
                if (this.f20949c == null) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.f20950d, "rw");
                    this.f20951e = randomAccessFile;
                    this.f20949c = randomAccessFile.getChannel();
                }
                this.f20948b = this.f20949c.lock();
            } else {
                throw new IllegalStateException("Lock file is null");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
