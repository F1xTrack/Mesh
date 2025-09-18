package io.sentry.android.replay;

import android.app.Activity;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.yandex.metrica.C3796o;
import io.sentry.C5759D1;
import io.sentry.C5782L0;
import io.sentry.C5798Q1;
import io.sentry.C5803S1;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.C5847T;
import io.sentry.android.core.internal.util.C5882b;
import io.sentry.android.core.internal.util.PixelCopyOnPixelCopyFinishedListenerC5888h;
import io.sentry.cache.C5996h;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6104t;
import io.sentry.react.C6120d;
import java.util.concurrent.CountDownLatch;
import p000.O90;

/* renamed from: io.sentry.android.replay.r */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5958r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f34011a;

    /* renamed from: b */
    public final /* synthetic */ Object f34012b;

    /* renamed from: c */
    public final /* synthetic */ Object f34013c;

    /* renamed from: d */
    public final /* synthetic */ Object f34014d;

    public /* synthetic */ RunnableC5958r(Object obj, Object obj2, Object obj3, int i) {
        this.f34011a = i;
        this.f34012b = obj;
        this.f34013c = obj2;
        this.f34014d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34011a) {
            case 0:
                Window window = (Window) this.f34013c;
                View view = (View) this.f34014d;
                ViewTreeObserverOnDrawListenerC5960t viewTreeObserverOnDrawListenerC5960t = (ViewTreeObserverOnDrawListenerC5960t) this.f34012b;
                O90.m5968f(viewTreeObserverOnDrawListenerC5960t, "this$0");
                try {
                    viewTreeObserverOnDrawListenerC5960t.f34028l.set(false);
                    PixelCopy.request(window, viewTreeObserverOnDrawListenerC5960t.f34025i, new PixelCopyOnPixelCopyFinishedListenerC5888h(viewTreeObserverOnDrawListenerC5960t, 1, view), (Handler) viewTreeObserverOnDrawListenerC5960t.f34019c.f20786a);
                    break;
                } catch (Throwable th) {
                    viewTreeObserverOnDrawListenerC5960t.f34018b.getLogger().mo21406d(EnumC6069n1.WARNING, "Failed to capture replay recording", th);
                    viewTreeObserverOnDrawListenerC5960t.f34030n.set(false);
                    return;
                }
            case 1:
                Runnable runnable = (Runnable) this.f34012b;
                O90.m5968f(runnable, "$task");
                C5759D1 c5759d1 = (C5759D1) this.f34013c;
                O90.m5968f(c5759d1, "$options");
                String str = (String) this.f34014d;
                O90.m5968f(str, "$taskName");
                try {
                    runnable.run();
                    break;
                } catch (Throwable th2) {
                    c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to execute task ".concat(str), th2);
                    return;
                }
            case 2:
                C5996h c5996h = (C5996h) this.f34012b;
                C5798Q1 c5798q1 = (C5798Q1) this.f34013c;
                if (c5798q1 != null) {
                    c5996h.m21718n(c5798q1, "trace.json");
                    break;
                } else {
                    c5996h.getClass();
                    C3796o c3796o = ((C5782L0) this.f34014d).f33321q;
                    C5798Q1 c5798q12 = new C5798Q1((C6104t) c3796o.f25478a, (C5803S1) c3796o.f25479b, "default", null, null);
                    c5798q12.f33387i = "auto";
                    c5996h.m21718n(c5798q12, "trace.json");
                    break;
                }
            default:
                C5847T c5847t = C6120d.f34519l;
                ((byte[][]) this.f34012b)[0] = AbstractC6003a.m21739H((Activity) this.f34013c, C5882b.f33751b, c5847t, C6120d.f34520m);
                ((CountDownLatch) this.f34014d).countDown();
                break;
        }
    }
}
