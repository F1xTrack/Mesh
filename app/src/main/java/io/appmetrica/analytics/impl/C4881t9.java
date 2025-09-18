package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: io.appmetrica.analytics.impl.t9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4881t9 {
    public final ReentrantLock a;
    public final V9 b;

    public C4881t9(Context context, String str) {
        this(new ReentrantLock(), new V9(context, str));
    }

    public final void a() {
        this.a.lock();
        this.b.a();
    }

    public final void b() {
        this.b.b();
        this.a.unlock();
    }

    public final void c() {
        V9 v9 = this.b;
        synchronized (v9) {
            v9.b();
            v9.a.delete();
        }
        this.a.unlock();
    }

    public C4881t9(ReentrantLock reentrantLock, V9 v9) {
        this.a = reentrantLock;
        this.b = v9;
    }
}
