package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import io.appmetrica.analytics.impl.C5094ea;
import io.sentry.AbstractC5802S0;
import io.sentry.C5760E;
import io.sentry.C6017f;
import io.sentry.EnumC6069n1;
import io.sentry.transport.C6152d;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC1526YF;
import p000.InterfaceC7902Li0;

/* loaded from: classes2.dex */
final class LifecycleWatcher implements DefaultLifecycleObserver {

    /* renamed from: a */
    public final AtomicLong f33552a;

    /* renamed from: b */
    public final AtomicBoolean f33553b;

    /* renamed from: c */
    public final long f33554c;

    /* renamed from: d */
    public C5842N f33555d;

    /* renamed from: e */
    public final Timer f33556e;

    /* renamed from: f */
    public final Object f33557f;

    /* renamed from: g */
    public final C5760E f33558g;

    /* renamed from: h */
    public final boolean f33559h;

    /* renamed from: i */
    public final boolean f33560i;

    /* renamed from: j */
    public final C6152d f33561j;

    public LifecycleWatcher(long j, boolean z, boolean z2) {
        C5760E c5760e = C5760E.f33234a;
        C6152d c6152d = C6152d.f34633a;
        this.f33552a = new AtomicLong(0L);
        this.f33553b = new AtomicBoolean(false);
        this.f33556e = new Timer(true);
        this.f33557f = new Object();
        this.f33554c = j;
        this.f33559h = z;
        this.f33560i = z2;
        this.f33558g = c5760e;
        this.f33561j = c6152d;
    }

    /* renamed from: a */
    public final void m21535a(String str) {
        if (this.f33560i) {
            C6017f c6017f = new C6017f();
            c6017f.f34146d = "navigation";
            c6017f.m21778b(str, "state");
            c6017f.f34148f = "app.lifecycle";
            c6017f.f34150h = EnumC6069n1.INFO;
            this.f33558g.m21384a(c6017f);
        }
    }

    /* renamed from: b */
    public final void m21536b() {
        synchronized (this.f33557f) {
            try {
                C5842N c5842n = this.f33555d;
                if (c5842n != null) {
                    c5842n.cancel();
                    this.f33555d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC7902Li0 interfaceC7902Li0) {
        AbstractC1526YF.m9245a(this, interfaceC7902Li0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC7902Li0 interfaceC7902Li0) {
        AbstractC1526YF.m9246b(this, interfaceC7902Li0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC7902Li0 interfaceC7902Li0) {
        AbstractC1526YF.m9247c(this, interfaceC7902Li0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC7902Li0 interfaceC7902Li0) {
        AbstractC1526YF.m9248d(this, interfaceC7902Li0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC7902Li0 interfaceC7902Li0) {
        m21536b();
        this.f33561j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5841M c5841m = new C5841M(0, this);
        C5760E c5760e = this.f33558g;
        c5760e.getClass();
        AbstractC5802S0.m21464b(c5841m);
        AtomicLong atomicLong = this.f33552a;
        long j = atomicLong.get();
        AtomicBoolean atomicBoolean = this.f33553b;
        if (j == 0 || j + this.f33554c <= jCurrentTimeMillis) {
            if (this.f33559h) {
                c5760e.mo21368E();
            }
            c5760e.mo21364A().getReplayController().start();
        } else if (!atomicBoolean.get()) {
            c5760e.mo21364A().getReplayController().resume();
        }
        atomicBoolean.set(false);
        atomicLong.set(jCurrentTimeMillis);
        m21535a(C5094ea.f31575g);
        C5829A.f33478b.m21498a(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC7902Li0 interfaceC7902Li0) {
        this.f33561j.getClass();
        this.f33552a.set(System.currentTimeMillis());
        this.f33558g.mo21364A().getReplayController().pause();
        synchronized (this.f33557f) {
            try {
                m21536b();
                if (this.f33556e != null) {
                    C5842N c5842n = new C5842N(this);
                    this.f33555d = c5842n;
                    this.f33556e.schedule(c5842n, this.f33554c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5829A.f33478b.m21498a(true);
        m21535a("background");
    }
}
