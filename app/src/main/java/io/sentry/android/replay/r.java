package io.sentry.android.replay;

import android.app.Activity;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import defpackage.O90;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.L0;
import io.sentry.Q1;
import io.sentry.S1;
import io.sentry.android.core.T;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Window window = (Window) this.c;
                View view = (View) this.d;
                t tVar = (t) this.b;
                O90.f(tVar, "this$0");
                try {
                    tVar.l.set(false);
                    PixelCopy.request(window, tVar.i, new io.sentry.android.core.internal.util.h(tVar, 1, view), (Handler) tVar.c.a);
                    break;
                } catch (Throwable th) {
                    tVar.b.getLogger().d(EnumC5148n1.WARNING, "Failed to capture replay recording", th);
                    tVar.n.set(false);
                    return;
                }
            case 1:
                Runnable runnable = (Runnable) this.b;
                O90.f(runnable, "$task");
                D1 d1 = (D1) this.c;
                O90.f(d1, "$options");
                String str = (String) this.d;
                O90.f(str, "$taskName");
                try {
                    runnable.run();
                    break;
                } catch (Throwable th2) {
                    d1.getLogger().d(EnumC5148n1.ERROR, "Failed to execute task ".concat(str), th2);
                    return;
                }
            case 2:
                io.sentry.cache.h hVar = (io.sentry.cache.h) this.b;
                Q1 q1 = (Q1) this.c;
                if (q1 != null) {
                    hVar.n(q1, "trace.json");
                    break;
                } else {
                    hVar.getClass();
                    com.yandex.metrica.o oVar = ((L0) this.d).q;
                    Q1 q12 = new Q1((io.sentry.protocol.t) oVar.a, (S1) oVar.b, "default", null, null);
                    q12.i = "auto";
                    hVar.n(q12, "trace.json");
                    break;
                }
            default:
                T t = io.sentry.react.d.l;
                ((byte[][]) this.b)[0] = io.sentry.config.a.H((Activity) this.c, io.sentry.android.core.internal.util.b.b, t, io.sentry.react.d.m);
                ((CountDownLatch) this.d).countDown();
                break;
        }
    }
}
