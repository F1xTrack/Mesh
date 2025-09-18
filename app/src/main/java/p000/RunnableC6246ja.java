package p000;

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
import com.p018my.tracker.obfuscated.C2331j2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledFuture;
import kotlin.KotlinVersion;

/* renamed from: ja */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6246ja implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35245a;

    /* renamed from: b */
    public final /* synthetic */ int f35246b;

    /* renamed from: c */
    public final /* synthetic */ Object f35247c;

    public /* synthetic */ RunnableC6246ja(int i, InterfaceC10255mM0 interfaceC10255mM0) {
        this.f35245a = 9;
        this.f35246b = i;
        this.f35247c = interfaceC10255mM0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Activity currentActivity;
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        ScheduledFuture scheduledFuture;
        C6820sO c6820sO;
        C8485Wn1 c8537Xn1;
        switch (this.f35245a) {
            case 0:
                C6372la c6372la = (C6372la) ((C6309ka) this.f35247c).f36546c;
                c6372la.getClass();
                int i = this.f35246b;
                if (i == -3 || i == -2) {
                    if (i != -2) {
                        C1017Q9 c1017q9 = c6372la.f37158d;
                        if (!(c1017q9 != null && c1017q9.f9498a == 1)) {
                            c6372la.m22508c(4);
                            return;
                        }
                    }
                    SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ = c6372la.f37157c;
                    if (surfaceHolderCallbackC1285UQ != null) {
                        C1474XQ c1474xq = surfaceHolderCallbackC1285UQ.f11780a;
                        c1474xq.m9032d2(0, 1, c1474xq.m9013J1());
                    }
                    c6372la.m22508c(3);
                    return;
                }
                if (i == -1) {
                    SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ2 = c6372la.f37157c;
                    if (surfaceHolderCallbackC1285UQ2 != null) {
                        C1474XQ c1474xq2 = surfaceHolderCallbackC1285UQ2.f11780a;
                        c1474xq2.m9032d2(-1, 2, c1474xq2.m9013J1());
                    }
                    c6372la.m22506a();
                    c6372la.m22508c(1);
                    return;
                }
                if (i != 1) {
                    AbstractC0852NX.m5767p("Unknown focus change type: ", i);
                    return;
                }
                c6372la.m22508c(2);
                SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ3 = c6372la.f37157c;
                if (surfaceHolderCallbackC1285UQ3 != null) {
                    C1474XQ c1474xq3 = surfaceHolderCallbackC1285UQ3.f11780a;
                    c1474xq3.m9032d2(1, 1, c1474xq3.m9013J1());
                    return;
                }
                return;
            case 1:
                C7156xj c7156xj = (C7156xj) this.f35247c;
                int i2 = c7156xj.f45757l;
                int i3 = this.f35246b;
                if (i2 == i3) {
                    return;
                }
                int i4 = c7156xj.f45753h;
                c7156xj.f45757l = (i3 / i4) * i4;
                AbstractC7806Jm0.m4412f("BufferedAudioStream");
                return;
            case 2:
                ((AbstractC6511nn) this.f35247c).mo6422a(this.f35246b);
                return;
            case 3:
                OD0 od0 = (OD0) ((C0487Hj) ((C1625Zp) this.f35247c).f15140b).f4445b;
                if (od0 != null) {
                    od0.m5997a(this.f35246b);
                    return;
                }
                return;
            case 4:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f35247c;
                int i5 = this.f35246b;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    E71 e71 = (E71) it.next();
                    if (i5 == 5) {
                        synchronized (e71.f2494p) {
                            try {
                                if (e71.m2041o() && e71.f2495q != null) {
                                    E71.m2035m();
                                    Iterator it2 = e71.f2495q.iterator();
                                    while (it2.hasNext()) {
                                        ((AbstractC4232iH) it2.next()).mo6573a();
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
                C7250zD c7250zD = (C7250zD) this.f35247c;
                O90.m5968f(c7250zD, "this$0");
                HashMap map = c7250zD.f46724b;
                int i6 = this.f35246b;
                map.remove(Integer.valueOf(i6));
                c7250zD.f46725c.remove(Integer.valueOf(i6));
                c7250zD.invalidate();
                return;
            case 6:
                C6677qO c6677qO = (C6677qO) this.f35247c;
                boolean z = c6677qO.f40852j;
                C6820sO c6820sO2 = c6677qO.f40854l;
                if (z) {
                    AbstractC7806Jm0.m4412f(c6820sO2.f42391a);
                    return;
                }
                switch (AbstractC7222ym.m26247x(c6820sO2.f42390D)) {
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
                        c6820sO2.f42401k.offer(Integer.valueOf(this.f35246b));
                        c6820sO2.m24719c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1374Vq.m8602u(c6820sO2.f42390D)));
                }
            case 7:
                ((N20) this.f35247c).m5525b(this.f35246b);
                return;
            case 8:
                C9010cg0 c9010cg0 = (C9010cg0) this.f35247c;
                O90.m5968f(c9010cg0, "this$0");
                ReactApplicationContext reactApplicationContext = c9010cg0.f17682a;
                Activity currentActivity2 = reactApplicationContext.getCurrentActivity();
                int i7 = (currentActivity2 == null || (window2 = currentActivity2.getWindow()) == null || (attributes = window2.getAttributes()) == null) ? 0 : attributes.softInputMode;
                int i8 = this.f35246b;
                if (i7 == i8 || (currentActivity = reactApplicationContext.getCurrentActivity()) == null || (window = currentActivity.getWindow()) == null) {
                    return;
                }
                window.setSoftInputMode(i8);
                return;
            case 9:
                MT1.m5372c(this.f35246b, "pre_rootView.onAttachedToReactInstance");
                ReactRootView reactRootView = (ReactRootView) ((InterfaceC10255mM0) this.f35247c);
                reactRootView.getClass();
                reactRootView.f17867h = new C7730Ia0(reactRootView);
                if (ReactFeatureFlags.dispatchPointerEvents) {
                    reactRootView.f17868i = new C7418Ca0(reactRootView);
                    return;
                }
                return;
            case 10:
                C9491gO0 c9491gO0 = (C9491gO0) this.f35247c;
                int i9 = c9491gO0.f27762i0;
                int i10 = this.f35246b;
                c9491gO0.f27762i0 = i10;
                if (i9 == i10) {
                    AbstractC7806Jm0.m4412f("Recorder");
                    return;
                }
                AbstractC7806Jm0.m4412f("Recorder");
                if (i10 != 3) {
                    if (i10 != 2 || (scheduledFuture = c9491gO0.f27743Y) == null || !scheduledFuture.cancel(false) || (c6820sO = c9491gO0.f27724F) == null) {
                        return;
                    }
                    C9491gO0.m18483q(c6820sO);
                    return;
                }
                if (c9491gO0.f27720B != null) {
                    c9491gO0.f27744Z = true;
                    C6693qe c6693qe = c9491gO0.f27770q;
                    if (c6693qe == null || c6693qe.f41088l) {
                        return;
                    }
                    c9491gO0.m18503r(c6693qe, 4, null);
                    return;
                }
                C9235eO0 c9235eO0 = c9491gO0.f27754e0;
                if (c9235eO0 != null) {
                    if (!c9235eO0.f26690d) {
                        c9235eO0.f26690d = true;
                        ScheduledFuture scheduledFuture2 = c9235eO0.f26692f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            c9235eO0.f26692f = null;
                        }
                    }
                    c9491gO0.f27754e0 = null;
                }
                c9491gO0.m18506u(false);
                return;
            case 11:
                ((EQ1) this.f35247c).mo2267c(this.f35246b);
                return;
            case 12:
                Window window3 = (Window) this.f35247c;
                C10641pN0 c10641pN0 = new C10641pN0(window3.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    C8641Zn1 c8641Zn1 = new C8641Zn1(window3.getInsetsController(), c10641pN0);
                    c8641Zn1.f15132d = window3;
                    c8537Xn1 = c8641Zn1;
                } else {
                    c8537Xn1 = i11 >= 26 ? new C8537Xn1(window3, c10641pN0) : new C8485Wn1(window3, c10641pN0);
                }
                int i12 = this.f35246b;
                c8537Xn1.mo9116f(((double) 1) - (((((double) Color.blue(i12)) * 0.114d) + ((((double) Color.green(i12)) * 0.587d) + (((double) Color.red(i12)) * 0.299d))) / ((double) KotlinVersion.MAX_COMPONENT_VALUE)) < 0.5d);
                return;
            case 13:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f35247c;
                View view = (View) sideSheetBehavior.f18248p.get();
                if (view != null) {
                    sideSheetBehavior.m11250u(this.f35246b, view, false);
                    return;
                }
                return;
            case 14:
                Iterator it3 = ((ArrayList) this.f35247c).iterator();
                while (it3.hasNext()) {
                    ((ViewManager) it3.next()).onSurfaceStopped(this.f35246b);
                }
                return;
            case 15:
                VisionCameraProxy visionCameraProxy = (VisionCameraProxy) this.f35247c;
                O90.m5968f(visionCameraProxy, "this$0");
                visionCameraProxy.m12744a(this.f35246b).setFrameProcessor$react_native_vision_camera_release(null);
                return;
            default:
                ((C2331j2) this.f35247c).m13222c(this.f35246b);
                return;
        }
    }

    public /* synthetic */ RunnableC6246ja(Object obj, int i, int i2) {
        this.f35245a = i2;
        this.f35247c = obj;
        this.f35246b = i;
    }
}
