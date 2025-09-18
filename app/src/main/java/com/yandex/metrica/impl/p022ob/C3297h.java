package com.yandex.metrica.impl.p022ob;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.h */
/* loaded from: classes2.dex */
public class C3297h {

    /* renamed from: f */
    private static final long f23540f = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    private final b f23541a;

    /* renamed from: b */
    private final Handler f23542b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Thread f23543c = new c();

    /* renamed from: d */
    private final AtomicBoolean f23544d = new AtomicBoolean();

    /* renamed from: e */
    private final Runnable f23545e = new a();

    /* renamed from: com.yandex.metrica.impl.ob.h$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3297h.this.f23544d.set(true);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.h$b */
    public interface b {
        /* renamed from: a */
        void mo16024a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.h$c */
    public class c extends Thread {
        public c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException {
            boolean z = false;
            int i = 0;
            while (!isInterrupted()) {
                if (!z) {
                    C3297h.this.f23544d.set(false);
                    C3297h.this.f23542b.post(C3297h.this.f23545e);
                    i = 0;
                }
                try {
                    Thread.sleep(C3297h.f23540f);
                    if (C3297h.this.f23544d.get()) {
                        z = false;
                    } else {
                        i++;
                        if (i == 4 && !Debug.isDebuggerConnected()) {
                            C3297h.this.m16022b();
                        }
                        z = true;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public C3297h(b bVar) {
        this.f23541a = bVar;
    }

    /* renamed from: b */
    public void m16022b() {
        this.f23541a.mo16024a();
    }

    /* renamed from: c */
    public void m16023c() {
        try {
            this.f23543c.setName("CR-WatchDog");
        } catch (SecurityException unused) {
        }
        this.f23543c.start();
    }
}
