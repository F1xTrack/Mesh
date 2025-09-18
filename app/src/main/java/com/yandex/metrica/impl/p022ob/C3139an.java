package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.an */
/* loaded from: classes2.dex */
public class C3139an {

    /* renamed from: a */
    private final ReentrantLock f23072a;

    /* renamed from: b */
    private final C3165bn f23073b;

    public C3139an(Context context, String str) {
        this(new ReentrantLock(), new C3165bn(context, str));
    }

    /* renamed from: a */
    public void m15622a() throws Throwable {
        this.f23072a.lock();
        this.f23073b.m15695a();
    }

    /* renamed from: b */
    public void m15623b() {
        this.f23073b.m15696b();
        this.f23072a.unlock();
    }

    /* renamed from: c */
    public void m15624c() {
        this.f23073b.m15697c();
        this.f23072a.unlock();
    }

    public C3139an(ReentrantLock reentrantLock, C3165bn c3165bn) {
        this.f23072a = reentrantLock;
        this.f23073b = c3165bn;
    }
}
