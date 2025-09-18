package p000;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.os.HandlerThread;
import android.view.Choreographer;
import android.view.Surface;
import androidx.lifecycle.C1742a;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.huawei.hms.adapter.internal.AvailableCode;
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
import ru.p031ok.tracer.utils.SimpleFileKeyValueStorage;

/* renamed from: Tz0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8352Tz0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f11608a;

    /* renamed from: b */
    public final /* synthetic */ Object f11609b;

    public /* synthetic */ RunnableC8352Tz0(int i, Object obj) {
        this.f11608a = i;
        this.f11609b = obj;
    }

    /* renamed from: a */
    private final void m7833a() {
        MJ0 mj0 = (MJ0) this.f11609b;
        synchronized (mj0.f7091b) {
            C7621Fx1 c7621Fx1 = mj0.f7090a;
            ChoreographerFrameCallbackC4220i5 choreographerFrameCallbackC4220i5 = mj0.f7092c;
            c7621Fx1.getClass();
            ((Choreographer) c7621Fx1.f3494a).postFrameCallback(choreographerFrameCallbackC4220i5);
            mj0.f7094e = true;
        }
    }

    /* renamed from: b */
    private final void m7834b() {
        C6937uF c6937uF = (C6937uF) this.f11609b;
        synchronized (((ArrayDeque) c6937uF.f43619d)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) c6937uF.f43616a).edit();
            String str = (String) c6937uF.f43617b;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) c6937uF.f43619d).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) c6937uF.f43618c);
            }
            editorEdit.putString(str, sb.toString()).commit();
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        RV0 rv0Mo13727h;
        switch (this.f11608a) {
            case 0:
                C7562Eu0 c7562Eu0 = (C7562Eu0) this.f11609b;
                O90.m5968f(c7562Eu0, "$host");
                c7562Eu0.setDidSetInitialIndex(true);
                return;
            case 1:
                C8690aA0 c8690aA0 = (C8690aA0) this.f11609b;
                O90.m5968f(c8690aA0, "this$0");
                c8690aA0.mo721a(false);
                return;
            case 2:
                ((C9085dD0) this.f11609b).m18284q();
                return;
            case 3:
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f16292i;
                ProcessLifecycleOwner processLifecycleOwner2 = (ProcessLifecycleOwner) this.f11609b;
                O90.m5968f(processLifecycleOwner2, "this$0");
                int i = processLifecycleOwner2.f16294b;
                C1742a c1742a = processLifecycleOwner2.f16298f;
                if (i == 0) {
                    processLifecycleOwner2.f16295c = true;
                    c1742a.m10126e(EnumC7382Bi0.ON_PAUSE);
                }
                if (processLifecycleOwner2.f16293a == 0 && processLifecycleOwner2.f16295c) {
                    c1742a.m10126e(EnumC7382Bi0.ON_STOP);
                    processLifecycleOwner2.f16296d = true;
                    return;
                }
                return;
            case 4:
                JD0 jd0 = (JD0) this.f11609b;
                jd0.getClass();
                AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
                AbstractC9513gZ0 abstractC9513gZ0 = jd0.f5384a;
                abstractC9513gZ0.getClass();
                AbstractC7806Jm0.m4412f("SessionProcessorBase");
                abstractC9513gZ0.mo9910b();
                synchronized (abstractC9513gZ0.f27846e) {
                    try {
                        Iterator it = abstractC9513gZ0.f27845d.iterator();
                        while (it.hasNext()) {
                            ((AbstractC4232iH) it.next()).mo6573a();
                        }
                        abstractC9513gZ0.f27845d.clear();
                        abstractC9513gZ0.f27842a.clear();
                        abstractC9513gZ0.f27843b.clear();
                        abstractC9513gZ0.f27848g = -1;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                HandlerThread handlerThread = abstractC9513gZ0.f27844c;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    abstractC9513gZ0.f27844c = null;
                    return;
                }
                return;
            case 5:
                RNGestureHandlerModule.install$lambda$2((RNGestureHandlerModule) this.f11609b);
                return;
            case 6:
                NH0 nh0 = ((OH0) this.f11609b).f8339c;
                if (nh0 == null || nh0.f9905f != 2) {
                    return;
                }
                nh0.mo721a(false);
                nh0.m6862k();
                return;
            case 7:
                WH0 wh0 = (WH0) ((C1555Yi) this.f11609b).f14458b;
                try {
                    Class cls = WH0.f13117f;
                    String str = (String) WH0.f13119h.getMethod("getInstallReferrer", null).invoke(cls.getMethod("getInstallReferrer", null).invoke(wh0.f13121b, null), null);
                    SharedPreferences.Editor editorEdit = wh0.f13120a.edit();
                    editorEdit.putString("installReferrer", str);
                    editorEdit.apply();
                    cls.getMethod("endConnection", null).invoke(wh0.f13121b, null);
                    return;
                } catch (Exception e) {
                    PrintStream printStream = System.err;
                    printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e.getMessage());
                    e.printStackTrace(printStream);
                    return;
                }
            case 8:
                ((AbstractC8964cJ0) this.f11609b).mo10667g();
                return;
            case 9:
                ((C4218i3) ((InterfaceC9273eh0) this.f11609b)).m18949n();
                return;
            case 10:
                m7833a();
                return;
            case 11:
                PL0 pl0 = ((VJ0) this.f11609b).f12516e;
                if (!pl0.m6305e() || pl0.m6302a() == null) {
                    return;
                }
                QK0 qk0M6302a = pl0.m6302a();
                UN1.m7998b(qk0M6302a.f9583s, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
                qk0M6302a.m6643n();
                return;
            case 12:
                QK0 qk0 = (QK0) this.f11609b;
                C0827N8 c0827n8 = qk0.f9567c;
                if (c0827n8 != null) {
                    qk0.m6645p(c0827n8);
                    qk0.f9567c = null;
                    return;
                }
                return;
            case 13:
                ((PK0) this.f11609b).f8997a.f9573i.getClass();
                return;
            case 14:
                ((FL0) this.f11609b).m2581c();
                return;
            case 15:
                C9235eO0 c9235eO0 = (C9235eO0) ((C4238iN) this.f11609b).f29114c;
                if (c9235eO0.f26690d) {
                    return;
                }
                AbstractC7806Jm0.m4412f("Recorder");
                C9491gO0 c9491gO0 = c9235eO0.f26693g;
                Objects.toString(c9491gO0.f27724F);
                AbstractC7806Jm0.m4412f("Recorder");
                C10715py0 c10715py0 = c9491gO0.f27746a0;
                c10715py0.m23906a();
                AbstractC8301Sz1.m7489l((InterfaceFutureC7800Jj0) c10715py0.f40471k).mo2494d(new RunnableC8176Qp0(c9235eO0, c9235eO0.f26687a, c9235eO0.f26688b, 5), c9491gO0.f27751d);
                return;
            case 16:
                C11415vQ0 c11415vQ0 = (C11415vQ0) this.f11609b;
                GQ0 gq0 = DQ0.f2012b;
                if (gq0 != null) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("callback", c11415vQ0.toString());
                    RemoteConfigModule remoteConfigModule = (RemoteConfigModule) gq0.f3735b;
                    ReactApplicationContext reactApplicationContext = remoteConfigModule.getReactApplicationContext();
                    O90.m5967e(reactApplicationContext, "access$getReactApplicationContext(...)");
                    remoteConfigModule.sendEvent(reactApplicationContext, "BACKGROUND_JOB_ERRORS", writableNativeMap);
                    return;
                }
                return;
            case 17:
                LinkedHashMap linkedHashMap = RustorePushService.f20245l;
                NQ0 nq0 = (NQ0) this.f11609b;
                C7978Mu0 c7978Mu0 = RustorePushService.f20246m;
                if (c7978Mu0 != null) {
                    WritableNativeMap writableNativeMapM10459a = AbstractC8869bZ1.m10459a(nq0);
                    RustorePushModule rustorePushModule = (RustorePushModule) c7978Mu0.f7393b;
                    rustorePushModule.sendEvent(rustorePushModule.reactContext, "ON_MESSAGE_RECEIVED", writableNativeMapM10459a);
                    return;
                }
                return;
            case 18:
                LinkedHashMap linkedHashMap2 = RustorePushService.f20245l;
                List list = (List) this.f11609b;
                O90.m5968f(list, "$errors");
                C7978Mu0 c7978Mu02 = RustorePushService.f20246m;
                if (c7978Mu02 != null) {
                    String string = list.toString();
                    O90.m5968f(string, "errors");
                    WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                    writableNativeMap2.putString("errors", string);
                    RustorePushModule rustorePushModule2 = (RustorePushModule) c7978Mu02.f7393b;
                    ReactApplicationContext reactApplicationContext2 = rustorePushModule2.getReactApplicationContext();
                    O90.m5967e(reactApplicationContext2, "access$getReactApplicationContext(...)");
                    rustorePushModule2.sendEvent(reactApplicationContext2, "ON_ERROR", writableNativeMap2);
                    return;
                }
                return;
            case 19:
                ((UIManagerModule) this.f11609b).getUIImplementation().m9570f(-1);
                return;
            case 20:
                SV0 sv0 = (SV0) this.f11609b;
                O90.m5968f(sv0, "this$0");
                sv0.m7381g();
                return;
            case 21:
                ((C1370Vm) this.f11609b).m8543a();
                return;
            case 22:
                InterfaceC9891jW0 interfaceC9891jW0 = (InterfaceC9891jW0) this.f11609b;
                if (interfaceC9891jW0 == null || (rv0Mo13727h = interfaceC9891jW0.mo13727h()) == null) {
                    return;
                }
                rv0Mo13727h.bringToFront();
                return;
            case 23:
                ((ImageReader) this.f11609b).close();
                return;
            case 24:
                m7834b();
                return;
            case 25:
                C1177Si c1177Si = (C1177Si) this.f11609b;
                c1177Si.f10914c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c1177Si.f10916e;
                C11583wk1 c11583wk1 = sideSheetBehavior.f18241i;
                if (c11583wk1 != null && c11583wk1.m25681g()) {
                    c1177Si.m7419a(c1177Si.f10913b);
                    return;
                } else {
                    if (sideSheetBehavior.f18240h == 2) {
                        sideSheetBehavior.m11248s(c1177Si.f10913b);
                        return;
                    }
                    return;
                }
            case 26:
                C0541Ia c0541Ia = (C0541Ia) ((C7978Mu0) this.f11609b).f7393b;
                c0541Ia.f5009q = true;
                if (c0541Ia.f4999g == 2) {
                    c0541Ia.m3938a();
                    return;
                }
                return;
            case 27:
                ((SimpleFileKeyValueStorage) this.f11609b).writeMap();
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C10217m31 c10217m31 = (C10217m31) this.f11609b;
                Surface surface = c10217m31.f37444h;
                if (surface != null) {
                    Iterator it2 = c10217m31.f37437a.iterator();
                    while (it2.hasNext()) {
                        ((SurfaceHolderCallbackC1285UQ) it2.next()).f11780a.m9028Z1(null);
                    }
                }
                SurfaceTexture surfaceTexture = c10217m31.f37443g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                c10217m31.f37443g = null;
                c10217m31.f37444h = null;
                return;
            default:
                ((R31) this.f11609b).m6891w();
                return;
        }
    }
}
