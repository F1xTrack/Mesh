package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.uj */
/* loaded from: classes2.dex */
public final class C5503uj {

    /* renamed from: a */
    public final C5478tj f32697a;

    /* renamed from: b */
    public volatile C5543w9 f32698b;

    /* renamed from: c */
    public volatile C5543w9 f32699c;

    /* renamed from: d */
    public volatile C5543w9 f32700d;

    /* renamed from: e */
    public volatile C5543w9 f32701e;

    /* renamed from: f */
    public volatile C5543w9 f32702f;

    /* renamed from: g */
    public volatile C5543w9 f32703g;

    /* renamed from: h */
    public volatile ExecutorC5453sj f32704h;

    public C5503uj() {
        this(new C5478tj());
    }

    /* renamed from: a */
    public final IHandlerExecutor m21138a() {
        if (this.f32703g == null) {
            synchronized (this) {
                try {
                    if (this.f32703g == null) {
                        this.f32697a.getClass();
                        HandlerThreadC4922Xa handlerThreadC4922XaM21177a = C5543w9.m21177a("IAA-SDE");
                        this.f32703g = new C5543w9(handlerThreadC4922XaM21177a, handlerThreadC4922XaM21177a.getLooper(), new Handler(handlerThreadC4922XaM21177a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f32703g;
    }

    /* renamed from: b */
    public final IHandlerExecutor m21139b() {
        if (this.f32698b == null) {
            synchronized (this) {
                try {
                    if (this.f32698b == null) {
                        this.f32697a.getClass();
                        HandlerThreadC4922Xa handlerThreadC4922XaM21177a = C5543w9.m21177a("IAA-SC");
                        this.f32698b = new C5543w9(handlerThreadC4922XaM21177a, handlerThreadC4922XaM21177a.getLooper(), new Handler(handlerThreadC4922XaM21177a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f32698b;
    }

    /* renamed from: c */
    public final IHandlerExecutor m21140c() {
        if (this.f32700d == null) {
            synchronized (this) {
                try {
                    if (this.f32700d == null) {
                        this.f32697a.getClass();
                        HandlerThreadC4922Xa handlerThreadC4922XaM21177a = C5543w9.m21177a("IAA-SMH-1");
                        this.f32700d = new C5543w9(handlerThreadC4922XaM21177a, handlerThreadC4922XaM21177a.getLooper(), new Handler(handlerThreadC4922XaM21177a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f32700d;
    }

    /* renamed from: d */
    public final IHandlerExecutor m21141d() {
        if (this.f32701e == null) {
            synchronized (this) {
                try {
                    if (this.f32701e == null) {
                        this.f32697a.getClass();
                        HandlerThreadC4922Xa handlerThreadC4922XaM21177a = C5543w9.m21177a("IAA-SNTPE");
                        this.f32701e = new C5543w9(handlerThreadC4922XaM21177a, handlerThreadC4922XaM21177a.getLooper(), new Handler(handlerThreadC4922XaM21177a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f32701e;
    }

    /* renamed from: e */
    public final IHandlerExecutor m21142e() {
        if (this.f32699c == null) {
            synchronized (this) {
                try {
                    if (this.f32699c == null) {
                        this.f32697a.getClass();
                        HandlerThreadC4922Xa handlerThreadC4922XaM21177a = C5543w9.m21177a("IAA-STE");
                        this.f32699c = new C5543w9(handlerThreadC4922XaM21177a, handlerThreadC4922XaM21177a.getLooper(), new Handler(handlerThreadC4922XaM21177a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f32699c;
    }

    /* renamed from: f */
    public final Executor m21143f() {
        if (this.f32704h == null) {
            synchronized (this) {
                try {
                    if (this.f32704h == null) {
                        this.f32697a.getClass();
                        this.f32704h = new ExecutorC5453sj(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f32704h;
    }

    public C5503uj(C5478tj c5478tj) {
        new HashMap();
        this.f32697a = c5478tj;
    }
}
