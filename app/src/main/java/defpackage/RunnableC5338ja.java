package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.ViewManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mrousavy.camera.frameprocessors.VisionCameraProxy;
import com.my.tracker.obfuscated.j2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledFuture;
import kotlin.KotlinVersion;

/* renamed from: ja */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5338ja implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC5338ja(int i, InterfaceC5870mM0 interfaceC5870mM0) {
        this.a = 9;
        this.b = i;
        this.c = interfaceC5870mM0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Activity currentActivity;
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        ScheduledFuture scheduledFuture;
        C7020sO c7020sO;
        C1776Wn1 c1854Xn1;
        switch (this.a) {
            case 0:
                C5720la c5720la = (C5720la) ((C5529ka) this.c).c;
                c5720la.getClass();
                int i = this.b;
                if (i == -3 || i == -2) {
                    if (i != -2) {
                        Q9 q9 = c5720la.d;
                        if (!(q9 != null && q9.a == 1)) {
                            c5720la.c(4);
                            return;
                        }
                    }
                    UQ uq = c5720la.c;
                    if (uq != null) {
                        XQ xq = uq.a;
                        xq.d2(0, 1, xq.J1());
                    }
                    c5720la.c(3);
                    return;
                }
                if (i == -1) {
                    UQ uq2 = c5720la.c;
                    if (uq2 != null) {
                        XQ xq2 = uq2.a;
                        xq2.d2(-1, 2, xq2.J1());
                    }
                    c5720la.a();
                    c5720la.c(1);
                    return;
                }
                if (i != 1) {
                    NX.p("Unknown focus change type: ", i);
                    return;
                }
                c5720la.c(2);
                UQ uq3 = c5720la.c;
                if (uq3 != null) {
                    XQ xq3 = uq3.a;
                    xq3.d2(1, 1, xq3.J1());
                    return;
                }
                return;
            case 1:
                C8036xj c8036xj = (C8036xj) this.c;
                int i2 = c8036xj.l;
                int i3 = this.b;
                if (i2 == i3) {
                    return;
                }
                int i4 = c8036xj.h;
                c8036xj.l = (i3 / i4) * i4;
                AbstractC0759Jm0.f("BufferedAudioStream");
                return;
            case 2:
                ((AbstractC6141nn) this.c).a(this.b);
                return;
            case 3:
                OD0 od0 = (OD0) ((C0593Hj) ((C2014Zp) this.c).b).b;
                if (od0 != null) {
                    od0.a(this.b);
                    return;
                }
                return;
            case 4:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                int i5 = this.b;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    E71 e71 = (E71) it.next();
                    if (i5 == 5) {
                        synchronized (e71.p) {
                            try {
                                if (e71.o() && e71.q != null) {
                                    E71.m();
                                    Iterator it2 = e71.q.iterator();
                                    while (it2.hasNext()) {
                                        ((AbstractC4314iH) it2.next()).a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        e71.getClass();
                    }
                }
                return;
            case 5:
                C8320zD c8320zD = (C8320zD) this.c;
                O90.f(c8320zD, "this$0");
                HashMap map = c8320zD.b;
                int i6 = this.b;
                map.remove(Integer.valueOf(i6));
                c8320zD.c.remove(Integer.valueOf(i6));
                c8320zD.invalidate();
                return;
            case 6:
                C6639qO c6639qO = (C6639qO) this.c;
                boolean z = c6639qO.j;
                C7020sO c7020sO2 = c6639qO.l;
                if (z) {
                    AbstractC0759Jm0.f(c7020sO2.a);
                    return;
                }
                switch (AbstractC8235ym.x(c7020sO2.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c7020sO2.k.offer(Integer.valueOf(this.b));
                        c7020sO2.c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1705Vq.u(c7020sO2.D)));
                }
            case 7:
                ((N20) this.c).b(this.b);
                return;
            case 8:
                C2560cg0 c2560cg0 = (C2560cg0) this.c;
                O90.f(c2560cg0, "this$0");
                ReactApplicationContext reactApplicationContext = c2560cg0.a;
                Activity currentActivity2 = reactApplicationContext.getCurrentActivity();
                int i7 = (currentActivity2 == null || (window2 = currentActivity2.getWindow()) == null || (attributes = window2.getAttributes()) == null) ? 0 : attributes.softInputMode;
                int i8 = this.b;
                if (i7 == i8 || (currentActivity = reactApplicationContext.getCurrentActivity()) == null || (window = currentActivity.getWindow()) == null) {
                    return;
                }
                window.setSoftInputMode(i8);
                return;
            case 9:
                MT1.c(this.b, "pre_rootView.onAttachedToReactInstance");
                ReactRootView reactRootView = (ReactRootView) ((InterfaceC5870mM0) this.c);
                reactRootView.getClass();
                reactRootView.h = new C0645Ia0(reactRootView);
                if (ReactFeatureFlags.dispatchPointerEvents) {
                    reactRootView.i = new C0177Ca0(reactRootView);
                    return;
                }
                return;
            case 10:
                C3954gO0 c3954gO0 = (C3954gO0) this.c;
                int i9 = c3954gO0.i0;
                int i10 = this.b;
                c3954gO0.i0 = i10;
                if (i9 == i10) {
                    AbstractC0759Jm0.f("Recorder");
                    return;
                }
                AbstractC0759Jm0.f("Recorder");
                if (i10 != 3) {
                    if (i10 != 2 || (scheduledFuture = c3954gO0.Y) == null || !scheduledFuture.cancel(false) || (c7020sO = c3954gO0.F) == null) {
                        return;
                    }
                    C3954gO0.q(c7020sO);
                    return;
                }
                if (c3954gO0.B != null) {
                    c3954gO0.Z = true;
                    C6687qe c6687qe = c3954gO0.q;
                    if (c6687qe == null || c6687qe.l) {
                        return;
                    }
                    c3954gO0.r(c6687qe, 4, null);
                    return;
                }
                C3572eO0 c3572eO0 = c3954gO0.e0;
                if (c3572eO0 != null) {
                    if (!c3572eO0.d) {
                        c3572eO0.d = true;
                        ScheduledFuture scheduledFuture2 = c3572eO0.f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            c3572eO0.f = null;
                        }
                    }
                    c3954gO0.e0 = null;
                }
                c3954gO0.u(false);
                return;
            case 11:
                ((EQ1) this.c).c(this.b);
                return;
            case 12:
                Window window3 = (Window) this.c;
                C6446pN0 c6446pN0 = new C6446pN0(window3.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    C2010Zn1 c2010Zn1 = new C2010Zn1(window3.getInsetsController(), c6446pN0);
                    c2010Zn1.d = window3;
                    c1854Xn1 = c2010Zn1;
                } else {
                    c1854Xn1 = i11 >= 26 ? new C1854Xn1(window3, c6446pN0) : new C1776Wn1(window3, c6446pN0);
                }
                int i12 = this.b;
                c1854Xn1.f(((double) 1) - (((((double) Color.blue(i12)) * 0.114d) + ((((double) Color.green(i12)) * 0.587d) + (((double) Color.red(i12)) * 0.299d))) / ((double) KotlinVersion.MAX_COMPONENT_VALUE)) < 0.5d);
                return;
            case 13:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.u(this.b, view, false);
                    return;
                }
                return;
            case 14:
                Iterator it3 = ((ArrayList) this.c).iterator();
                while (it3.hasNext()) {
                    ((ViewManager) it3.next()).onSurfaceStopped(this.b);
                }
                return;
            case 15:
                VisionCameraProxy visionCameraProxy = (VisionCameraProxy) this.c;
                O90.f(visionCameraProxy, "this$0");
                visionCameraProxy.a(this.b).setFrameProcessor$react_native_vision_camera_release(null);
                return;
            default:
                ((j2) this.c).c(this.b);
                return;
        }
    }

    public /* synthetic */ RunnableC5338ja(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
