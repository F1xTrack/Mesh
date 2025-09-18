package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.android.replay.ViewTreeObserverOnDrawListenerC5960t;
import io.sentry.android.replay.viewhierarchy.AbstractC5974e;
import io.sentry.config.AbstractC6003a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.O90;
import p000.O91;

/* renamed from: io.sentry.android.core.internal.util.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class PixelCopyOnPixelCopyFinishedListenerC5888h implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a */
    public final /* synthetic */ int f33770a;

    /* renamed from: b */
    public final /* synthetic */ Object f33771b;

    /* renamed from: c */
    public final /* synthetic */ Object f33772c;

    public /* synthetic */ PixelCopyOnPixelCopyFinishedListenerC5888h(Object obj, int i, Object obj2) {
        this.f33770a = i;
        this.f33771b = obj;
        this.f33772c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        switch (this.f33770a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f33771b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f33772c;
                atomicBoolean.set(i == 0);
                countDownLatch.countDown();
                break;
            default:
                ViewTreeObserverOnDrawListenerC5960t viewTreeObserverOnDrawListenerC5960t = (ViewTreeObserverOnDrawListenerC5960t) this.f33771b;
                View view = (View) this.f33772c;
                O90.m5968f(viewTreeObserverOnDrawListenerC5960t, "this$0");
                AtomicBoolean atomicBoolean2 = viewTreeObserverOnDrawListenerC5960t.f34030n;
                C5759D1 c5759d1 = viewTreeObserverOnDrawListenerC5960t.f34018b;
                if (i == 0) {
                    if (!viewTreeObserverOnDrawListenerC5960t.f34028l.get()) {
                        AbstractC5974e abstractC5974eM21750i = AbstractC6003a.m21750i(view, null, 0, c5759d1);
                        AbstractC6003a.m21741J(view, abstractC5974eM21750i, c5759d1);
                        AbstractC6003a.m21738G(viewTreeObserverOnDrawListenerC5960t.f34020d, c5759d1, "screenshot_recorder.mask", new O91(viewTreeObserverOnDrawListenerC5960t, 27, abstractC5974eM21750i));
                        break;
                    } else {
                        c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                        atomicBoolean2.set(false);
                        break;
                    }
                } else {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
                    atomicBoolean2.set(false);
                    break;
                }
        }
    }
}
