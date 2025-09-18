package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C10925rb0;
import p000.C8774aq0;
import p000.ChoreographerFrameCallbackC11053sb0;
import p000.ChoreographerFrameCallbackC4220i5;
import p000.InterfaceC0965PK;
import p000.InterfaceC1839cJ;
import p000.MJ0;
import p000.N20;
import p000.O20;
import p000.RunnableC10797qb0;
import p000.RunnableC1267U8;

/* loaded from: classes.dex */
public final class JavaTimerManager implements LifecycleEventListener, O20 {

    /* renamed from: a */
    public final ReactApplicationContext f17923a;

    /* renamed from: b */
    public final TimingModule f17924b;

    /* renamed from: c */
    public final MJ0 f17925c;

    /* renamed from: d */
    public final InterfaceC1839cJ f17926d;

    /* renamed from: m */
    public RunnableC10797qb0 f17935m;

    /* renamed from: e */
    public final Object f17927e = new Object();

    /* renamed from: f */
    public final Object f17928f = new Object();

    /* renamed from: i */
    public final AtomicBoolean f17931i = new AtomicBoolean(true);

    /* renamed from: j */
    public final AtomicBoolean f17932j = new AtomicBoolean(false);

    /* renamed from: k */
    public final ChoreographerFrameCallbackC11053sb0 f17933k = new ChoreographerFrameCallbackC11053sb0(this);

    /* renamed from: l */
    public final ChoreographerFrameCallbackC4220i5 f17934l = new ChoreographerFrameCallbackC4220i5(1, this);

    /* renamed from: n */
    public boolean f17936n = false;

    /* renamed from: o */
    public boolean f17937o = false;

    /* renamed from: p */
    public boolean f17938p = false;

    /* renamed from: g */
    public final PriorityQueue f17929g = new PriorityQueue(11, new C8774aq0(12));

    /* renamed from: h */
    public final SparseArray f17930h = new SparseArray();

    public JavaTimerManager(ReactApplicationContext reactApplicationContext, TimingModule timingModule, MJ0 mj0, InterfaceC1839cJ interfaceC1839cJ) {
        this.f17923a = reactApplicationContext;
        this.f17924b = timingModule;
        this.f17925c = mj0;
        this.f17926d = interfaceC1839cJ;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    /* renamed from: a */
    public final void m11005a() {
        N20 n20M5523c = N20.m5523c(this.f17923a);
        if (this.f17936n && this.f17931i.get() && n20M5523c.f7472d.size() <= 0) {
            this.f17925c.m5306d(4, this.f17933k);
            this.f17936n = false;
        }
    }

    /* renamed from: b */
    public final void m11006b() {
        if (!this.f17931i.get() || this.f17932j.get()) {
            return;
        }
        m11005a();
    }

    @InterfaceC0965PK
    public void createTimer(int i, long j, boolean z) {
        C10925rb0 c10925rb0 = new C10925rb0((System.nanoTime() / 1000000) + j, i, (int) j, z);
        synchronized (this.f17927e) {
            this.f17929g.add(c10925rb0);
            this.f17930h.put(i, c10925rb0);
        }
    }

    @InterfaceC0965PK
    public void deleteTimer(int i) {
        synchronized (this.f17927e) {
            try {
                C10925rb0 c10925rb0 = (C10925rb0) this.f17930h.get(i);
                if (c10925rb0 == null) {
                    return;
                }
                this.f17930h.remove(i);
                this.f17929g.remove(c10925rb0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.O20
    public final void onHeadlessJsTaskFinish(int i) {
        if (N20.m5523c(this.f17923a).f7472d.size() > 0) {
            return;
        }
        this.f17932j.set(false);
        m11005a();
        m11006b();
    }

    @Override // p000.O20
    public final void onHeadlessJsTaskStart(int i) {
        if (this.f17932j.getAndSet(true)) {
            return;
        }
        if (!this.f17936n) {
            this.f17925c.m5305c(4, this.f17933k);
            this.f17936n = true;
        }
        synchronized (this.f17928f) {
            if (this.f17938p && !this.f17937o) {
                this.f17925c.m5305c(5, this.f17934l);
                this.f17937o = true;
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        m11005a();
        m11006b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        this.f17931i.set(true);
        m11005a();
        m11006b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        this.f17931i.set(false);
        if (!this.f17936n) {
            this.f17925c.m5305c(4, this.f17933k);
            this.f17936n = true;
        }
        synchronized (this.f17928f) {
            if (this.f17938p && !this.f17937o) {
                this.f17925c.m5305c(5, this.f17934l);
                this.f17937o = true;
            }
        }
    }

    @InterfaceC0965PK
    public void setSendIdleEvents(boolean z) {
        synchronized (this.f17928f) {
            this.f17938p = z;
        }
        UiThreadUtil.runOnUiThread(new RunnableC1267U8(this, z, 1));
    }
}
