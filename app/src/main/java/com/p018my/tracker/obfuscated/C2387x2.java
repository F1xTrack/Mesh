package com.p018my.tracker.obfuscated;

import android.os.Handler;
import io.sentry.cache.RunnableC5994f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.x2 */
/* loaded from: classes2.dex */
public class C2387x2 {

    /* renamed from: a */
    final Handler f20160a = AbstractC2340m.f20022a;

    /* renamed from: b */
    final AtomicBoolean f20161b;

    /* renamed from: c */
    final Runnable f20162c;

    /* renamed from: d */
    final long f20163d;

    private C2387x2(long j, Runnable runnable) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f20161b = atomicBoolean;
        this.f20163d = j;
        this.f20162c = new RunnableC5994f(this, 12, runnable);
        atomicBoolean.set(false);
    }

    /* renamed from: c */
    private void m13550c() {
        this.f20160a.removeCallbacks(this.f20162c);
        this.f20161b.set(true);
        this.f20160a.postDelayed(this.f20162c, this.f20163d);
    }

    /* renamed from: b */
    public boolean m13552b() {
        boolean z;
        synchronized (this.f20161b) {
            z = !this.f20161b.get();
        }
        return z;
    }

    /* renamed from: d */
    public void m13553d() {
        synchronized (this.f20161b) {
            try {
                if (m13551a()) {
                    m13550c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public void m13554e() {
        synchronized (this.f20161b) {
            try {
                if (this.f20161b.get()) {
                    return;
                }
                m13550c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public void m13555f() {
        synchronized (this.f20161b) {
            this.f20161b.set(false);
            this.f20160a.removeCallbacks(this.f20162c);
        }
    }

    /* renamed from: a */
    public static C2387x2 m13547a(long j, Runnable runnable) {
        return new C2387x2(j, runnable);
    }

    /* renamed from: a */
    public boolean m13551a() {
        boolean z;
        synchronized (this.f20161b) {
            z = !m13552b();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m13549a(Runnable runnable) {
        synchronized (this.f20161b) {
            try {
                if (this.f20161b.get()) {
                    m13550c();
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
