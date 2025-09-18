package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.an, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2638an {
    private final ReentrantLock a;
    private final C2663bn b;

    public C2638an(Context context, String str) {
        this(new ReentrantLock(), new C2663bn(context, str));
    }

    public void a() throws Throwable {
        this.a.lock();
        this.b.a();
    }

    public void b() {
        this.b.b();
        this.a.unlock();
    }

    public void c() {
        this.b.c();
        this.a.unlock();
    }

    public C2638an(ReentrantLock reentrantLock, C2663bn c2663bn) {
        this.a = reentrantLock;
        this.b = c2663bn;
    }
}
