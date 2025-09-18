package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.f;
import androidx.fragment.app.v;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.reanimated.layoutReanimation.SharedTransitionManager;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tracer.profiler.systrace.SystraceProfiler$onStart$traceListener$1;
import ru.vvdev.yamap.RNYamapModule;

/* loaded from: classes.dex */
public final /* synthetic */ class MD0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ MD0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        FL0 fl0 = (FL0) this.b;
        EL0 el0 = (EL0) this.c;
        synchronized (fl0.c) {
            try {
                if (!fl0.c.containsKey(el0.a) || !fl0.a(el0)) {
                    fl0.a.add(el0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                WR0 wr0 = ((OD0) this.b).h;
                DV1.a();
                if (wr0.g) {
                    return;
                }
                AbstractC3377dM1.i(wr0.c.b.isDone(), "onImageCaptured() must be called before onFinalResult()");
                wr0.a();
                C7730w60 c7730w60 = (C7730w60) this.c;
                DV1.a();
                C1357Re c1357Re = wr0.a;
                c1357Re.c.execute(new MD0(c1357Re, 28, c7730w60));
                return;
            case 1:
                ((PD0) this.b).a((C0376Eo1) this.c, false);
                return;
            case 2:
                ((ProfileInstallerInitializer) this.b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? ZD0.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC6585q6((Context) this.c, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 3:
                C6419pE0 c6419pE0 = (C6419pE0) this.b;
                Q50 q50 = c6419pE0.r;
                CX0 cx0 = (CX0) this.c;
                c6419pE0.z = q50 == null ? cx0 : new C4004gf(-9223372036854775807L);
                c6419pE0.A = cx0.k();
                if (!c6419pE0.G && cx0.k() == -9223372036854775807L) {
                    z = true;
                }
                c6419pE0.B = z;
                c6419pE0.C = z ? 7 : 1;
                if (c6419pE0.v) {
                    c6419pE0.g.w(c6419pE0.A, cx0.e(), c6419pE0.B);
                    return;
                } else {
                    c6419pE0.y();
                    return;
                }
            case 4:
                Context context = (Context) this.c;
                WH0 wh0 = (WH0) this.b;
                wh0.getClass();
                try {
                    Class cls = WH0.f;
                    Object objInvoke = cls.getMethod("newBuilder", Context.class).invoke(null, context);
                    wh0.b = objInvoke.getClass().getMethod("build", null).invoke(objInvoke, null);
                    Class<?> cls2 = WH0.g;
                    wh0.c = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new C1915Yi(1, wh0));
                    cls.getMethod("startConnection", cls2).invoke(wh0.b, wh0.c);
                    return;
                } catch (Exception e) {
                    PrintStream printStream = System.err;
                    printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e.getMessage());
                    e.printStackTrace(printStream);
                    return;
                }
            case 5:
                RNYamapModule.init$lambda$0((String) this.b, (Promise) this.c);
                return;
            case 6:
                RNYamapModule.setLocale$lambda$1((String) this.b, (Callback) this.c);
                return;
            case 7:
                MJ0 mj0 = (MJ0) this.b;
                mj0.getClass();
                ((C3759fN) ((InterfaceC1162Or) this.c)).getClass();
                UiThreadUtil.assertOnUiThread();
                mj0.a = new C0481Fx1(2);
                return;
            case 8:
                QK0 qk0 = (QK0) this.b;
                N8 n8 = (N8) this.c;
                qk0.getClass();
                ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
                synchronized (qk0.t) {
                    while (qk0.t.booleanValue()) {
                        try {
                            qk0.t.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                qk0.s = true;
                try {
                    Process.setThreadPriority(-4);
                    ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
                    BridgeReactContext bridgeReactContextC = qk0.c(((JavaScriptExecutorFactory) n8.b).create(), (JSBundleLoader) n8.c);
                    try {
                        qk0.d = null;
                        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                        RunnableC1577Tz0 runnableC1577Tz0 = new RunnableC1577Tz0(12, qk0);
                        bridgeReactContextC.runOnNativeModulesQueueThread(new MD0(qk0, 9, bridgeReactContextC));
                        UiThreadUtil.runOnUiThread(runnableC1577Tz0);
                        return;
                    } catch (Exception e2) {
                        qk0.i.handleException(e2);
                        return;
                    }
                } catch (Exception e3) {
                    qk0.s = false;
                    qk0.d = null;
                    qk0.i.handleException(e3);
                    return;
                }
            case 9:
                BridgeReactContext bridgeReactContext = (BridgeReactContext) this.c;
                QK0 qk02 = (QK0) this.b;
                qk02.getClass();
                try {
                    qk02.q(bridgeReactContext);
                    return;
                } catch (Exception e4) {
                    qk02.i.handleException(e4);
                    return;
                }
            case 10:
                QK0 qk03 = (QK0) ((C1562Tu0) this.b).b;
                qk03.i.getClass();
                ((YI) this.c).b.edit().putBoolean("remote_js_debug", false).apply();
                qk03.m();
                return;
            case 11:
                FL0 fl0 = (FL0) this.b;
                fl0.e = (Boolean) this.c;
                fl0.c();
                return;
            case 12:
                FL0 fl02 = (FL0) this.b;
                fl02.d = (ReactContext) this.c;
                fl02.c();
                return;
            case 13:
                a();
                return;
            case 14:
                ((ReanimatedModule) this.b).lambda$initialize$3((UIManagerModule) this.c);
                return;
            case 15:
                ((ReanimatedModule) this.b).lambda$initialize$4((ReactApplicationContext) this.c);
                return;
            case 16:
                ((ExecutorC5715lY0) this.b).execute((Runnable) this.c);
                return;
            case 17:
                ((C6687qe) this.b).j.b((AbstractC1062Nj1) this.c);
                return;
            case 18:
                C5885mR0 c5885mR0 = (C5885mR0) this.b;
                c5885mR0.getClass();
                try {
                    C2362bd1.a().d.a(c5885mR0.h.a.b(EnumC7370uD0.c), 1);
                } catch (Exception unused2) {
                }
                ((CountDownLatch) this.c).countDown();
                return;
            case 19:
                ((EQ1) this.b).d((Typeface) this.c);
                return;
            case 20:
                ((SharedTransitionManager) this.b).lambda$finishSharedAnimation$1((ViewParent) this.c);
                return;
            case 21:
                f fVar = (f) this.b;
                O90.f(fVar, "this$0");
                v vVar = (v) this.c;
                fVar.b.remove(vVar);
                fVar.c.remove(vVar);
                return;
            case 22:
                C5813m31 c5813m31 = (C5813m31) this.b;
                SurfaceTexture surfaceTexture = c5813m31.g;
                Surface surface = c5813m31.h;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.c;
                Surface surface2 = new Surface(surfaceTexture2);
                c5813m31.g = surfaceTexture2;
                c5813m31.h = surface2;
                Iterator it = c5813m31.a.iterator();
                while (it.hasNext()) {
                    ((UQ) it.next()).a.Z1(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 23:
                P41 p41 = (P41) this.b;
                O90.f(p41, "this$0");
                String str = (String) this.c;
                O90.f(str, "$style");
                C2204ao1 c2204ao1A = p41.a();
                if (c2204ao1A == null) {
                    return;
                }
                c2204ao1A.a.g(str.equals("dark-content"));
                return;
            case 24:
                ((SurfaceMountingManager) this.b).lambda$addRootView$0((View) this.c);
                return;
            case 25:
                T61 t61 = (T61) this.b;
                t61.getClass();
                ((InterfaceC6556py) ((AtomicReference) this.c).get()).b(new C0890Le(t61));
                return;
            case 26:
                SystraceProfiler$onStart$traceListener$1.onStart$lambda$0((Thread) this.b, (Runnable) this.c);
                return;
            case 27:
                ((C7737w81) this.b).e.remove((WR0) this.c);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C2226aw c2226aw = ((C1357Re) this.b).d;
                if (c2226aw == null) {
                    throw new IllegalStateException("One and only one callback is allowed.");
                }
                C7730w60 c7730w602 = (C7730w60) this.c;
                C0767Jp c0767Jp = (C0767Jp) c2226aw.e;
                if (c0767Jp.isActive()) {
                    c0767Jp.resumeWith(RQ1.b(c7730w602));
                    return;
                }
                return;
            default:
                C2226aw c2226aw2 = ((C1357Re) this.b).d;
                Objects.requireNonNull(c2226aw2);
                Objects.requireNonNull((C0396Ev0) this.c);
                C0767Jp c0767Jp2 = (C0767Jp) c2226aw2.e;
                if (c0767Jp2.isActive()) {
                    URI uri = ((File) c2226aw2.f).toURI();
                    O90.e(uri, "toURI(...)");
                    c0767Jp2.resumeWith(new ZA0(uri, (C1135Oi) ((VH) c2226aw2.g).c));
                    return;
                }
                return;
        }
    }
}
