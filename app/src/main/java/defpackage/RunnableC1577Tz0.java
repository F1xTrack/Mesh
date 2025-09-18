package defpackage;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.os.HandlerThread;
import android.view.Choreographer;
import android.view.Surface;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.remoteconfig.RemoteConfigModule;
import com.rustorepush.RustorePushModule;
import com.rustorepush.RustorePushService;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import ru.ok.tracer.utils.SimpleFileKeyValueStorage;

/* renamed from: Tz0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1577Tz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC1577Tz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        MJ0 mj0 = (MJ0) this.b;
        synchronized (mj0.b) {
            C0481Fx1 c0481Fx1 = mj0.a;
            ChoreographerFrameCallbackC4278i5 choreographerFrameCallbackC4278i5 = mj0.c;
            c0481Fx1.getClass();
            ((Choreographer) c0481Fx1.a).postFrameCallback(choreographerFrameCallbackC4278i5);
            mj0.e = true;
        }
    }

    private final void b() {
        C7375uF c7375uF = (C7375uF) this.b;
        synchronized (((ArrayDeque) c7375uF.d)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) c7375uF.a).edit();
            String str = (String) c7375uF.b;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) c7375uF.d).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) c7375uF.c);
            }
            editorEdit.putString(str, sb.toString()).commit();
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        RV0 rv0H;
        switch (this.a) {
            case 0:
                C0393Eu0 c0393Eu0 = (C0393Eu0) this.b;
                O90.f(c0393Eu0, "$host");
                c0393Eu0.setDidSetInitialIndex(true);
                return;
            case 1:
                C2083aA0 c2083aA0 = (C2083aA0) this.b;
                O90.f(c2083aA0, "this$0");
                c2083aA0.a(false);
                return;
            case 2:
                ((C3349dD0) this.b).q();
                return;
            case 3:
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.i;
                ProcessLifecycleOwner processLifecycleOwner2 = (ProcessLifecycleOwner) this.b;
                O90.f(processLifecycleOwner2, "this$0");
                int i = processLifecycleOwner2.b;
                a aVar = processLifecycleOwner2.f;
                if (i == 0) {
                    processLifecycleOwner2.c = true;
                    aVar.e(EnumC0123Bi0.ON_PAUSE);
                }
                if (processLifecycleOwner2.a == 0 && processLifecycleOwner2.c) {
                    aVar.e(EnumC0123Bi0.ON_STOP);
                    processLifecycleOwner2.d = true;
                    return;
                }
                return;
            case 4:
                JD0 jd0 = (JD0) this.b;
                jd0.getClass();
                AbstractC0759Jm0.f("ProcessingCaptureSession");
                AbstractC3987gZ0 abstractC3987gZ0 = jd0.a;
                abstractC3987gZ0.getClass();
                AbstractC0759Jm0.f("SessionProcessorBase");
                abstractC3987gZ0.b();
                synchronized (abstractC3987gZ0.e) {
                    try {
                        Iterator it = abstractC3987gZ0.d.iterator();
                        while (it.hasNext()) {
                            ((AbstractC4314iH) it.next()).a();
                        }
                        abstractC3987gZ0.d.clear();
                        abstractC3987gZ0.a.clear();
                        abstractC3987gZ0.b.clear();
                        abstractC3987gZ0.g = -1;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                HandlerThread handlerThread = abstractC3987gZ0.c;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    abstractC3987gZ0.c = null;
                    return;
                }
                return;
            case 5:
                RNGestureHandlerModule.install$lambda$2((RNGestureHandlerModule) this.b);
                return;
            case 6:
                NH0 nh0 = ((OH0) this.b).c;
                if (nh0 == null || nh0.f != 2) {
                    return;
                }
                nh0.a(false);
                nh0.k();
                return;
            case 7:
                WH0 wh0 = (WH0) ((C1915Yi) this.b).b;
                try {
                    Class cls = WH0.f;
                    String str = (String) WH0.h.getMethod("getInstallReferrer", null).invoke(cls.getMethod("getInstallReferrer", null).invoke(wh0.b, null), null);
                    SharedPreferences.Editor editorEdit = wh0.a.edit();
                    editorEdit.putString("installReferrer", str);
                    editorEdit.apply();
                    cls.getMethod("endConnection", null).invoke(wh0.b, null);
                    return;
                } catch (Exception e) {
                    PrintStream printStream = System.err;
                    printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e.getMessage());
                    e.printStackTrace(printStream);
                    return;
                }
            case 8:
                ((AbstractC2491cJ0) this.b).g();
                return;
            case 9:
                ((C4271i3) ((InterfaceC3629eh0) this.b)).n();
                return;
            case 10:
                a();
                return;
            case 11:
                PL0 pl0 = ((VJ0) this.b).e;
                if (!pl0.e() || pl0.a() == null) {
                    return;
                }
                QK0 qk0A = pl0.a();
                UN1.b(qk0A.s, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
                qk0A.n();
                return;
            case 12:
                QK0 qk0 = (QK0) this.b;
                N8 n8 = qk0.c;
                if (n8 != null) {
                    qk0.p(n8);
                    qk0.c = null;
                    return;
                }
                return;
            case 13:
                ((PK0) this.b).a.i.getClass();
                return;
            case 14:
                ((FL0) this.b).c();
                return;
            case 15:
                C3572eO0 c3572eO0 = (C3572eO0) ((C4332iN) this.b).c;
                if (c3572eO0.d) {
                    return;
                }
                AbstractC0759Jm0.f("Recorder");
                C3954gO0 c3954gO0 = c3572eO0.g;
                Objects.toString(c3954gO0.F);
                AbstractC0759Jm0.f("Recorder");
                C6557py0 c6557py0 = c3954gO0.a0;
                c6557py0.a();
                AbstractC1500Sz1.l((InterfaceFutureC0750Jj0) c6557py0.k).d(new RunnableC1313Qp0(c3572eO0, c3572eO0.a, c3572eO0.b, 5), c3954gO0.d);
                return;
            case 16:
                C7600vQ0 c7600vQ0 = (C7600vQ0) this.b;
                GQ0 gq0 = DQ0.b;
                if (gq0 != null) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("callback", c7600vQ0.toString());
                    RemoteConfigModule remoteConfigModule = (RemoteConfigModule) gq0.b;
                    ReactApplicationContext reactApplicationContext = remoteConfigModule.getReactApplicationContext();
                    O90.e(reactApplicationContext, "access$getReactApplicationContext(...)");
                    remoteConfigModule.sendEvent(reactApplicationContext, "BACKGROUND_JOB_ERRORS", writableNativeMap);
                    return;
                }
                return;
            case 17:
                LinkedHashMap linkedHashMap = RustorePushService.l;
                NQ0 nq0 = (NQ0) this.b;
                C1016Mu0 c1016Mu0 = RustorePushService.m;
                if (c1016Mu0 != null) {
                    WritableNativeMap writableNativeMapA = AbstractC2350bZ1.a(nq0);
                    RustorePushModule rustorePushModule = (RustorePushModule) c1016Mu0.b;
                    rustorePushModule.sendEvent(rustorePushModule.reactContext, "ON_MESSAGE_RECEIVED", writableNativeMapA);
                    return;
                }
                return;
            case 18:
                LinkedHashMap linkedHashMap2 = RustorePushService.l;
                List list = (List) this.b;
                O90.f(list, "$errors");
                C1016Mu0 c1016Mu02 = RustorePushService.m;
                if (c1016Mu02 != null) {
                    String string = list.toString();
                    O90.f(string, "errors");
                    WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                    writableNativeMap2.putString("errors", string);
                    RustorePushModule rustorePushModule2 = (RustorePushModule) c1016Mu02.b;
                    ReactApplicationContext reactApplicationContext2 = rustorePushModule2.getReactApplicationContext();
                    O90.e(reactApplicationContext2, "access$getReactApplicationContext(...)");
                    rustorePushModule2.sendEvent(reactApplicationContext2, "ON_ERROR", writableNativeMap2);
                    return;
                }
                return;
            case 19:
                ((UIManagerModule) this.b).getUIImplementation().f(-1);
                return;
            case 20:
                SV0 sv0 = (SV0) this.b;
                O90.f(sv0, "this$0");
                sv0.g();
                return;
            case 21:
                ((C1693Vm) this.b).a();
                return;
            case 22:
                InterfaceC5327jW0 interfaceC5327jW0 = (InterfaceC5327jW0) this.b;
                if (interfaceC5327jW0 == null || (rv0H = interfaceC5327jW0.h()) == null) {
                    return;
                }
                rv0H.bringToFront();
                return;
            case 23:
                ((ImageReader) this.b).close();
                return;
            case 24:
                b();
                return;
            case 25:
                C1447Si c1447Si = (C1447Si) this.b;
                c1447Si.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c1447Si.e;
                C7851wk1 c7851wk1 = sideSheetBehavior.i;
                if (c7851wk1 != null && c7851wk1.g()) {
                    c1447Si.a(c1447Si.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.s(c1447Si.b);
                        return;
                    }
                    return;
                }
            case 26:
                C0644Ia c0644Ia = (C0644Ia) ((C1016Mu0) this.b).b;
                c0644Ia.q = true;
                if (c0644Ia.g == 2) {
                    c0644Ia.a();
                    return;
                }
                return;
            case 27:
                ((SimpleFileKeyValueStorage) this.b).writeMap();
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C5813m31 c5813m31 = (C5813m31) this.b;
                Surface surface = c5813m31.h;
                if (surface != null) {
                    Iterator it2 = c5813m31.a.iterator();
                    while (it2.hasNext()) {
                        ((UQ) it2.next()).a.Z1(null);
                    }
                }
                SurfaceTexture surfaceTexture = c5813m31.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                c5813m31.g = null;
                c5813m31.h = null;
                return;
            default:
                ((R31) this.b).w();
                return;
        }
    }
}
