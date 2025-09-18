package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: io.appmetrica.analytics.impl.t9 */
/* loaded from: classes2.dex */
public final class C5468t9 {

    /* renamed from: a */
    public final ReentrantLock f32625a;

    /* renamed from: b */
    public final C4873V9 f32626b;

    public C5468t9(Context context, String str) {
        this(new ReentrantLock(), new C4873V9(context, str));
    }

    /* renamed from: a */
    public final void m21075a() {
        this.f32625a.lock();
        this.f32626b.m19915a();
    }

    /* renamed from: b */
    public final void m21076b() {
        this.f32626b.m19916b();
        this.f32625a.unlock();
    }

    /* renamed from: c */
    public final void m21077c() {
        C4873V9 c4873v9 = this.f32626b;
        synchronized (c4873v9) {
            c4873v9.m19916b();
            c4873v9.f30851a.delete();
        }
        this.f32625a.unlock();
    }

    public C5468t9(ReentrantLock reentrantLock, C4873V9 c4873v9) {
        this.f32625a = reentrantLock;
        this.f32626b = c4873v9;
    }
}
