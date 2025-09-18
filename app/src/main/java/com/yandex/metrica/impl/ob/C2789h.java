package com.yandex.metrica.impl.ob;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2789h {
    private static final long f = TimeUnit.SECONDS.toMillis(1);
    private final b a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Thread c = new c();
    private final AtomicBoolean d = new AtomicBoolean();
    private final Runnable e = new a();

    /* renamed from: com.yandex.metrica.impl.ob.h$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2789h.this.d.set(true);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.h$b */
    public interface b {
        void a();
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
                    C2789h.this.d.set(false);
                    C2789h.this.b.post(C2789h.this.e);
                    i = 0;
                }
                try {
                    Thread.sleep(C2789h.f);
                    if (C2789h.this.d.get()) {
                        z = false;
                    } else {
                        i++;
                        if (i == 4 && !Debug.isDebuggerConnected()) {
                            C2789h.this.b();
                        }
                        z = true;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public C2789h(b bVar) {
        this.a = bVar;
    }

    public void b() {
        this.a.a();
    }

    public void c() {
        try {
            this.c.setName("CR-WatchDog");
        } catch (SecurityException unused) {
        }
        this.c.start();
    }
}
