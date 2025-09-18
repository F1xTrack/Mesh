package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import defpackage.O90;
import defpackage.O91;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.android.replay.t;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        switch (this.a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                atomicBoolean.set(i == 0);
                countDownLatch.countDown();
                break;
            default:
                t tVar = (t) this.b;
                View view = (View) this.c;
                O90.f(tVar, "this$0");
                AtomicBoolean atomicBoolean2 = tVar.n;
                D1 d1 = tVar.b;
                if (i == 0) {
                    if (!tVar.l.get()) {
                        io.sentry.android.replay.viewhierarchy.e eVarI = io.sentry.config.a.i(view, null, 0, d1);
                        io.sentry.config.a.J(view, eVarI, d1);
                        io.sentry.config.a.G(tVar.d, d1, "screenshot_recorder.mask", new O91(tVar, 27, eVarI));
                        break;
                    } else {
                        d1.getLogger().k(EnumC5148n1.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                        atomicBoolean2.set(false);
                        break;
                    }
                } else {
                    d1.getLogger().k(EnumC5148n1.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
                    atomicBoolean2.set(false);
                    break;
                }
        }
    }
}
