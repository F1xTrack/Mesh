package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: com.yandex.metrica.impl.ob.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2890l1 {
    private final Handler a;
    private final J b;
    private final RunnableC2915m1 c;

    public C2890l1(Handler handler, J j) {
        this.a = handler;
        this.b = j;
        this.c = new RunnableC2915m1(handler, j);
    }

    public void a() {
        this.a.removeCallbacks(this.c, this.b.b.b().a());
    }

    public void b() {
        a(this.a, this.b, this.c);
    }

    public static void a(Handler handler, J j, Runnable runnable) {
        handler.removeCallbacks(runnable, j.b.b().a());
        String strA = j.b.b().a();
        long jUptimeMillis = SystemClock.uptimeMillis();
        Integer asInteger = j.b.b().a.getAsInteger("CFG_SESSION_TIMEOUT");
        if (asInteger == null) {
            asInteger = 10;
        }
        handler.postAtTime(runnable, strA, jUptimeMillis + (asInteger.intValue() * 500));
    }
}
