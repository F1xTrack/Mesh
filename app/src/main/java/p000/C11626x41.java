package p000;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: x41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11626x41 {

    /* renamed from: h */
    public static C11626x41 f45355h;

    /* renamed from: i */
    public static final long f45356i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b */
    public volatile File f45358b;

    /* renamed from: d */
    public volatile File f45360d;

    /* renamed from: e */
    public long f45361e;

    /* renamed from: a */
    public volatile StatFs f45357a = null;

    /* renamed from: c */
    public volatile StatFs f45359c = null;

    /* renamed from: g */
    public volatile boolean f45363g = false;

    /* renamed from: f */
    public final ReentrantLock f45362f = new ReentrantLock();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* renamed from: b */
    public static StatFs m25756b(StatFs statFs, File file) throws Throwable {
        ?? r0 = 0;
        r0 = 0;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = new StatFs(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            r0 = statFs;
            return r0;
        } catch (IllegalArgumentException unused) {
            return r0;
        } catch (Throwable th) {
            AbstractC11176tY1.m24943b(th);
            throw r0;
        }
    }

    /* renamed from: a */
    public final void m25757a() {
        if (this.f45363g) {
            return;
        }
        this.f45362f.lock();
        try {
            if (!this.f45363g) {
                this.f45358b = Environment.getDataDirectory();
                this.f45360d = Environment.getExternalStorageDirectory();
                this.f45357a = m25756b(this.f45357a, this.f45358b);
                this.f45359c = m25756b(this.f45359c, this.f45360d);
                this.f45361e = SystemClock.uptimeMillis();
                this.f45363g = true;
            }
        } finally {
            this.f45362f.unlock();
        }
    }
}
