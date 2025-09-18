package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.bn */
/* loaded from: classes2.dex */
public class C3165bn {

    /* renamed from: a */
    private final Context f23156a;

    /* renamed from: b */
    private final String f23157b;

    /* renamed from: c */
    private final C2742L0 f23158c;

    /* renamed from: d */
    private File f23159d;

    /* renamed from: e */
    private FileLock f23160e;

    /* renamed from: f */
    private RandomAccessFile f23161f;

    /* renamed from: g */
    private FileChannel f23162g;

    /* renamed from: h */
    private int f23163h;

    public C3165bn(Context context, String str) {
        this(context, str, new C2742L0());
    }

    /* renamed from: a */
    public synchronized void m15695a() throws Throwable {
        try {
            File fileM14503b = this.f23158c.m14503b(this.f23156a.getFilesDir(), this.f23157b);
            this.f23159d = fileM14503b;
            if (fileM14503b == null) {
                throw new IllegalStateException("Cannot create lock file");
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f23159d, "rw");
            this.f23161f = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f23162g = channel;
            if (this.f23163h == 0) {
                this.f23160e = channel.lock();
            }
            this.f23163h++;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized void m15696b() {
        try {
            File file = this.f23159d;
            if (file != null) {
                file.getAbsolutePath();
            }
            int i = this.f23163h - 1;
            this.f23163h = i;
            if (i == 0) {
                C2991V0.m15296a(this.f23160e);
            }
            C2968U2.m15241a((Closeable) this.f23161f);
            C2968U2.m15241a((Closeable) this.f23162g);
            this.f23161f = null;
            this.f23160e = null;
            this.f23162g = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public synchronized void m15697c() {
        m15696b();
        File file = this.f23159d;
        if (file != null) {
            file.delete();
        }
    }

    public C3165bn(Context context, String str, C2742L0 c2742l0) {
        this.f23163h = 0;
        this.f23156a = context;
        this.f23157b = AbstractC7222ym.m26232i(str, ".lock");
        this.f23158c = c2742l0;
    }
}
