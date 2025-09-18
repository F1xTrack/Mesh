package com.p018my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p000.ExecutorC6585ow;

/* renamed from: com.my.tracker.obfuscated.m */
/* loaded from: classes2.dex */
public abstract class AbstractC2340m {

    /* renamed from: a */
    public static final Handler f20022a;

    /* renamed from: b */
    public static final Executor f20023b;

    /* renamed from: c */
    public static final Executor f20024c;

    /* renamed from: d */
    public static final Executor f20025d;

    /* renamed from: e */
    public static final Executor f20026e;

    /* renamed from: f */
    public static final Executor f20027f;

    /* renamed from: g */
    private static final Executor f20028g;

    /* renamed from: h */
    private static final a f20029h;

    /* renamed from: com.my.tracker.obfuscated.m$a */
    public static final class a {

        /* renamed from: a */
        private final ArrayDeque f20030a = new ArrayDeque();

        /* renamed from: com.my.tracker.obfuscated.m$a$a, reason: collision with other inner class name */
        public static final class RunnableC7299a implements Runnable {

            /* renamed from: a */
            final a f20031a;

            /* renamed from: b */
            volatile Runnable f20032b;

            public RunnableC7299a(a aVar) {
                this.f20031a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Runnable runnable = this.f20032b;
                    if (runnable != null) {
                        runnable.run();
                    }
                    a aVar = this.f20031a;
                    if (aVar == null) {
                    }
                } catch (Throwable th) {
                    try {
                        AbstractC2391y2.m13573b("RunnableThrowableDecorator: exception has been caught", th);
                    } finally {
                        a aVar2 = this.f20031a;
                        if (aVar2 != null) {
                            aVar2.m13297a(this);
                        }
                    }
                }
            }
        }

        public a() {
            for (int i = 0; i < 64; i++) {
                this.f20030a.add(new RunnableC7299a(this));
            }
        }

        /* renamed from: a */
        public void m13297a(RunnableC7299a runnableC7299a) {
            synchronized (this) {
                runnableC7299a.f20032b = null;
                this.f20030a.add(runnableC7299a);
            }
        }

        /* renamed from: a */
        public Runnable m13296a(Runnable runnable) {
            RunnableC7299a runnableC7299a;
            synchronized (this) {
                runnableC7299a = (RunnableC7299a) this.f20030a.pollFirst();
            }
            if (runnableC7299a == null) {
                runnableC7299a = new RunnableC7299a(null);
            }
            runnableC7299a.f20032b = runnable;
            return runnableC7299a;
        }
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f20022a = handler;
        f20023b = Executors.newSingleThreadExecutor();
        f20024c = Executors.newSingleThreadExecutor();
        f20025d = Executors.newSingleThreadExecutor();
        f20026e = Executors.newSingleThreadExecutor();
        f20027f = Executors.newSingleThreadExecutor();
        f20028g = new ExecutorC6585ow(handler);
        f20029h = new a();
    }

    /* renamed from: a */
    public static void m13290a(Runnable runnable) {
        f20023b.execute(f20029h.m13296a(runnable));
    }

    /* renamed from: b */
    public static void m13291b(Runnable runnable) {
        f20024c.execute(f20029h.m13296a(runnable));
    }

    /* renamed from: c */
    public static void m13292c(Runnable runnable) {
        f20025d.execute(f20029h.m13296a(runnable));
    }

    /* renamed from: d */
    public static void m13293d(Runnable runnable) {
        f20026e.execute(f20029h.m13296a(runnable));
    }

    /* renamed from: e */
    public static void m13294e(Runnable runnable) {
        f20027f.execute(f20029h.m13296a(runnable));
    }

    /* renamed from: f */
    public static void m13295f(Runnable runnable) {
        Runnable runnableM13296a = f20029h.m13296a(runnable);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnableM13296a.run();
        } else {
            f20028g.execute(runnableM13296a);
        }
    }
}
