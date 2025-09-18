package p000;

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
import androidx.fragment.app.C1724f;
import androidx.fragment.app.C1740v;
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
import ru.p031ok.tracer.profiler.systrace.SystraceProfiler$onStart$traceListener$1;
import ru.vvdev.yamap.RNYamapModule;

/* loaded from: classes.dex */
public final /* synthetic */ class MD0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7038a;

    /* renamed from: b */
    public final /* synthetic */ Object f7039b;

    /* renamed from: c */
    public final /* synthetic */ Object f7040c;

    public /* synthetic */ MD0(Object obj, int i, Object obj2) {
        this.f7038a = i;
        this.f7039b = obj;
        this.f7040c = obj2;
    }

    /* renamed from: a */
    private final void m5284a() {
        FL0 fl0 = (FL0) this.f7039b;
        EL0 el0 = (EL0) this.f7040c;
        synchronized (fl0.f3162c) {
            try {
                if (!fl0.f3162c.containsKey(el0.f2642a) || !fl0.m2579a(el0)) {
                    fl0.f3160a.add(el0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.f7038a) {
            case 0:
                WR0 wr0 = ((OD0) this.f7039b).f8311h;
                DV1.m1716a();
                if (wr0.f13185g) {
                    return;
                }
                AbstractC9104dM1.m17550i(wr0.f13181c.f4484b.isDone(), "onImageCaptured() must be called before onFinalResult()");
                wr0.m8760a();
                C11502w60 c11502w60 = (C11502w60) this.f7040c;
                DV1.m1716a();
                C1110Re c1110Re = wr0.f13179a;
                c1110Re.f10349c.execute(new MD0(c1110Re, 28, c11502w60));
                return;
            case 1:
                ((PD0) this.f7039b).mo4902a((C7551Eo1) this.f7040c, false);
                return;
            case 2:
                ((ProfileInstallerInitializer) this.f7039b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? ZD0.m9508a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC6659q6((Context) this.f7040c, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 3:
                C10623pE0 c10623pE0 = (C10623pE0) this.f7039b;
                Q50 q50 = c10623pE0.f39947r;
                CX0 cx0 = (CX0) this.f7040c;
                c10623pE0.f39955z = q50 == null ? cx0 : new C4130gf(-9223372036854775807L);
                c10623pE0.f39917A = cx0.mo415k();
                if (!c10623pE0.f39923G && cx0.mo415k() == -9223372036854775807L) {
                    z = true;
                }
                c10623pE0.f39918B = z;
                c10623pE0.f39919C = z ? 7 : 1;
                if (c10623pE0.f39951v) {
                    c10623pE0.f39936g.m24682w(c10623pE0.f39917A, cx0.mo413e(), c10623pE0.f39918B);
                    return;
                } else {
                    c10623pE0.m23659y();
                    return;
                }
            case 4:
                Context context = (Context) this.f7040c;
                WH0 wh0 = (WH0) this.f7039b;
                wh0.getClass();
                try {
                    Class cls = WH0.f13117f;
                    Object objInvoke = cls.getMethod("newBuilder", Context.class).invoke(null, context);
                    wh0.f13121b = objInvoke.getClass().getMethod("build", null).invoke(objInvoke, null);
                    Class<?> cls2 = WH0.f13118g;
                    wh0.f13122c = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new C1555Yi(1, wh0));
                    cls.getMethod("startConnection", cls2).invoke(wh0.f13121b, wh0.f13122c);
                    return;
                } catch (Exception e) {
                    PrintStream printStream = System.err;
                    printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e.getMessage());
                    e.printStackTrace(printStream);
                    return;
                }
            case 5:
                RNYamapModule.init$lambda$0((String) this.f7039b, (Promise) this.f7040c);
                return;
            case 6:
                RNYamapModule.setLocale$lambda$1((String) this.f7039b, (Callback) this.f7040c);
                return;
            case 7:
                MJ0 mj0 = (MJ0) this.f7039b;
                mj0.getClass();
                ((C4049fN) ((InterfaceC0935Or) this.f7040c)).getClass();
                UiThreadUtil.assertOnUiThread();
                mj0.f7090a = new C7621Fx1(2);
                return;
            case 8:
                QK0 qk0 = (QK0) this.f7039b;
                C0827N8 c0827n8 = (C0827N8) this.f7040c;
                qk0.getClass();
                ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
                synchronized (qk0.f9584t) {
                    while (qk0.f9584t.booleanValue()) {
                        try {
                            qk0.f9584t.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                qk0.f9583s = true;
                try {
                    Process.setThreadPriority(-4);
                    ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
                    BridgeReactContext bridgeReactContextM6634c = qk0.m6634c(((JavaScriptExecutorFactory) c0827n8.f7523b).create(), (JSBundleLoader) c0827n8.f7524c);
                    try {
                        qk0.f9568d = null;
                        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                        RunnableC8352Tz0 runnableC8352Tz0 = new RunnableC8352Tz0(12, qk0);
                        bridgeReactContextM6634c.runOnNativeModulesQueueThread(new MD0(qk0, 9, bridgeReactContextM6634c));
                        UiThreadUtil.runOnUiThread(runnableC8352Tz0);
                        return;
                    } catch (Exception e2) {
                        qk0.f9573i.handleException(e2);
                        return;
                    }
                } catch (Exception e3) {
                    qk0.f9583s = false;
                    qk0.f9568d = null;
                    qk0.f9573i.handleException(e3);
                    return;
                }
            case 9:
                BridgeReactContext bridgeReactContext = (BridgeReactContext) this.f7040c;
                QK0 qk02 = (QK0) this.f7039b;
                qk02.getClass();
                try {
                    qk02.m6646q(bridgeReactContext);
                    return;
                } catch (Exception e4) {
                    qk02.f9573i.handleException(e4);
                    return;
                }
            case 10:
                QK0 qk03 = (QK0) ((C8342Tu0) this.f7039b).f11590b;
                qk03.f9573i.getClass();
                ((SharedPreferencesOnSharedPreferenceChangeListenerC1529YI) this.f7040c).f14227b.edit().putBoolean("remote_js_debug", false).apply();
                qk03.m6642m();
                return;
            case 11:
                FL0 fl0 = (FL0) this.f7039b;
                fl0.f3164e = (Boolean) this.f7040c;
                fl0.m2581c();
                return;
            case 12:
                FL0 fl02 = (FL0) this.f7039b;
                fl02.f3163d = (ReactContext) this.f7040c;
                fl02.m2581c();
                return;
            case 13:
                m5284a();
                return;
            case 14:
                ((ReanimatedModule) this.f7039b).lambda$initialize$3((UIManagerModule) this.f7040c);
                return;
            case 15:
                ((ReanimatedModule) this.f7039b).lambda$initialize$4((ReactApplicationContext) this.f7040c);
                return;
            case 16:
                ((ExecutorC10151lY0) this.f7039b).execute((Runnable) this.f7040c);
                return;
            case 17:
                ((C6693qe) this.f7039b).f41086j.mo3020b((AbstractC8009Nj1) this.f7040c);
                return;
            case 18:
                C10265mR0 c10265mR0 = (C10265mR0) this.f7039b;
                c10265mR0.getClass();
                try {
                    C8877bd1.m10475a().f17105d.m9335a(c10265mR0.f37705h.f12655a.m7708b(EnumC11261uD0.f43596c), 1);
                } catch (Exception unused2) {
                }
                ((CountDownLatch) this.f7040c).countDown();
                return;
            case 19:
                ((EQ1) this.f7039b).mo2268d((Typeface) this.f7040c);
                return;
            case 20:
                ((SharedTransitionManager) this.f7039b).lambda$finishSharedAnimation$1((ViewParent) this.f7040c);
                return;
            case 21:
                C1724f c1724f = (C1724f) this.f7039b;
                O90.m5968f(c1724f, "this$0");
                C1740v c1740v = (C1740v) this.f7040c;
                c1724f.f16184b.remove(c1740v);
                c1724f.f16185c.remove(c1740v);
                return;
            case 22:
                C10217m31 c10217m31 = (C10217m31) this.f7039b;
                SurfaceTexture surfaceTexture = c10217m31.f37443g;
                Surface surface = c10217m31.f37444h;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.f7040c;
                Surface surface2 = new Surface(surfaceTexture2);
                c10217m31.f37443g = surfaceTexture2;
                c10217m31.f37444h = surface2;
                Iterator it = c10217m31.f37437a.iterator();
                while (it.hasNext()) {
                    ((SurfaceHolderCallbackC1285UQ) it.next()).f11780a.m9028Z1(surface2);
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
                P41 p41 = (P41) this.f7039b;
                O90.m5968f(p41, "this$0");
                String str = (String) this.f7040c;
                O90.m5968f(str, "$style");
                C8771ao1 c8771ao1M6225a = p41.m6225a();
                if (c8771ao1M6225a == null) {
                    return;
                }
                c8771ao1M6225a.f16606a.mo8863g(str.equals("dark-content"));
                return;
            case 24:
                ((SurfaceMountingManager) this.f7039b).lambda$addRootView$0((View) this.f7040c);
                return;
            case 25:
                T61 t61 = (T61) this.f7039b;
                t61.getClass();
                ((InterfaceC6650py) ((AtomicReference) this.f7040c).get()).mo3020b(new C0733Le(t61));
                return;
            case 26:
                SystraceProfiler$onStart$traceListener$1.onStart$lambda$0((Thread) this.f7039b, (Runnable) this.f7040c);
                return;
            case 27:
                ((C11507w81) this.f7039b).f44696e.remove((WR0) this.f7040c);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C1753aw c1753aw = ((C1110Re) this.f7039b).f10350d;
                if (c1753aw == null) {
                    throw new IllegalStateException("One and only one callback is allowed.");
                }
                C11502w60 c11502w602 = (C11502w60) this.f7040c;
                C0619Jp c0619Jp = (C0619Jp) c1753aw.f16685e;
                if (c0619Jp.isActive()) {
                    c0619Jp.resumeWith(RQ1.m7015b(c11502w602));
                    return;
                }
                return;
            default:
                C1753aw c1753aw2 = ((C1110Re) this.f7039b).f10350d;
                Objects.requireNonNull(c1753aw2);
                Objects.requireNonNull((C7564Ev0) this.f7040c);
                C0619Jp c0619Jp2 = (C0619Jp) c1753aw2.f16685e;
                if (c0619Jp2.isActive()) {
                    URI uri = ((File) c1753aw2.f16686f).toURI();
                    O90.m5967e(uri, "toURI(...)");
                    c0619Jp2.resumeWith(new ZA0(uri, (C0926Oi) ((C1339VH) c1753aw2.f16687g).f12487c));
                    return;
                }
                return;
        }
    }
}
