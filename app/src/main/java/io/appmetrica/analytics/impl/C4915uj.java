package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.uj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4915uj {
    public final C4891tj a;
    public volatile C4953w9 b;
    public volatile C4953w9 c;
    public volatile C4953w9 d;
    public volatile C4953w9 e;
    public volatile C4953w9 f;
    public volatile C4953w9 g;
    public volatile ExecutorC4867sj h;

    public C4915uj() {
        this(new C4891tj());
    }

    public final IHandlerExecutor a() {
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        this.a.getClass();
                        Xa xaA = C4953w9.a("IAA-SDE");
                        this.g = new C4953w9(xaA, xaA.getLooper(), new Handler(xaA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.g;
    }

    public final IHandlerExecutor b() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.a.getClass();
                        Xa xaA = C4953w9.a("IAA-SC");
                        this.b = new C4953w9(xaA, xaA.getLooper(), new Handler(xaA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final IHandlerExecutor c() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.a.getClass();
                        Xa xaA = C4953w9.a("IAA-SMH-1");
                        this.d = new C4953w9(xaA, xaA.getLooper(), new Handler(xaA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final IHandlerExecutor d() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        this.a.getClass();
                        Xa xaA = C4953w9.a("IAA-SNTPE");
                        this.e = new C4953w9(xaA, xaA.getLooper(), new Handler(xaA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public final IHandlerExecutor e() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.a.getClass();
                        Xa xaA = C4953w9.a("IAA-STE");
                        this.c = new C4953w9(xaA, xaA.getLooper(), new Handler(xaA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final Executor f() {
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        this.a.getClass();
                        this.h = new ExecutorC4867sj(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public C4915uj(C4891tj c4891tj) {
        new HashMap();
        this.a = c4891tj;
    }
}
