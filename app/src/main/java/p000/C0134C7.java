package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: C7 */
/* loaded from: classes2.dex */
public final class C0134C7 {

    /* renamed from: a */
    public final C7818Js0 f1196a;

    /* renamed from: b */
    public final WeakReference f1197b;

    /* renamed from: c */
    public final C7766Is0 f1198c;

    /* renamed from: d */
    public final TK0 f1199d;

    /* renamed from: e */
    public boolean f1200e;

    /* renamed from: f */
    public JSIContext f1201f;

    /* renamed from: g */
    public final C7558Es0 f1202g;

    /* renamed from: h */
    public final C1356VY f1203h;

    /* renamed from: i */
    public final C0433Gs f1204i;

    /* renamed from: j */
    public final C1068Qy f1205j;

    /* renamed from: k */
    public final C1068Qy f1206k;

    /* renamed from: l */
    public final C1068Qy f1207l;

    /* renamed from: m */
    public final JNIDeallocator f1208m;

    /* renamed from: n */
    public WeakReference f1209n;

    /* renamed from: o */
    public final C1339VH f1210o;

    public C0134C7(InterfaceC7974Ms0 interfaceC7974Ms0, C7818Js0 c7818Js0, WeakReference weakReference) {
        O90.m5968f(interfaceC7974Ms0, "modulesProvider");
        O90.m5968f(c7818Js0, "legacyModuleRegistry");
        this.f1196a = c7818Js0;
        this.f1197b = weakReference;
        C7766Is0 c7766Is0 = new C7766Is0(new WeakReference(this));
        this.f1198c = c7766Is0;
        TK0 tk0 = new TK0(this);
        this.f1199d = tk0;
        C7046vz c7046vz = new C7046vz();
        c7046vz.f45149a = this;
        this.f1202g = new C7558Es0(c7046vz);
        this.f1203h = new C1356VY(this);
        C0433Gs c0433Gs = new C0433Gs();
        c0433Gs.f3933a = new LinkedHashMap();
        this.f1204i = c0433Gs;
        HandlerThread handlerThread = new HandlerThread("expo.modules.AsyncFunctionQueue");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        int i = AbstractC11874z20.f46602a;
        C11747y20 c11747y20 = new C11747y20(handler, null, false);
        C0399GK c0399gk = C0399GK.f3694a;
        ExecutorC1023QF executorC1023QF = ExecutorC1023QF.f9548c;
        C10480o61 c10480o61M3069a = GT1.m3069a();
        executorC1023QF.getClass();
        this.f1205j = AbstractC11432vY1.m25444a(AbstractC11551wU1.m25639c(executorC1023QF, c10480o61M3069a).mo936f(new C0503Hz("expo.modules.BackgroundCoroutineScope")));
        this.f1206k = AbstractC11432vY1.m25444a(AbstractC11551wU1.m25639c(c11747y20, GT1.m3069a()).mo936f(new C0503Hz("expo.modules.AsyncFunctionQueue")));
        C11747y20 c11747y202 = AbstractC7702Hm0.f4486a;
        C10480o61 c10480o61M3069a2 = GT1.m3069a();
        c11747y202.getClass();
        this.f1207l = AbstractC11432vY1.m25444a(AbstractC11551wU1.m25639c(c11747y202, c10480o61M3069a2).mo936f(new C0503Hz("expo.modules.MainQueue")));
        this.f1208m = new JNIDeallocator(0);
        this.f1210o = new C1339VH(this);
        Object obj = weakReference.get();
        if (obj == null) {
            throw new IllegalArgumentException("The app context should be created with valid react context.");
        }
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) obj;
        reactApplicationContext.addLifecycleEventListener(tk0);
        reactApplicationContext.addActivityEventListener(tk0);
        c7766Is0.m4062q(new C1598ZO());
        c7766Is0.m4062q(new C10835qu0());
        Iterator it = interfaceC7974Ms0.getModulesList().iterator();
        while (it.hasNext()) {
            c7766Is0.m4062q((AbstractC11598ws0) ((Class) it.next()).getDeclaredConstructor(null).newInstance(null));
        }
        C7978Mu0 c7978Mu0 = AbstractC6857sz.f42743a;
        c7978Mu0.getClass();
        c7978Mu0.m5475l(EnumC10561ol0.f39224c, "✅ AppContext was initialized", null);
    }

    /* renamed from: a */
    public final Activity m985a() {
        Object obj;
        Activity currentActivity;
        try {
            obj = this.f1196a.f5762a.get(C9398ff1.class);
        } catch (Exception unused) {
            obj = null;
        }
        C9398ff1 c9398ff1 = (C9398ff1) obj;
        if (c9398ff1 != null && (currentActivity = c9398ff1.f27311a.getCurrentActivity()) != null) {
            return currentActivity;
        }
        Context contextM987c = m987c();
        ReactApplicationContext reactApplicationContext = contextM987c instanceof ReactApplicationContext ? (ReactApplicationContext) contextM987c : null;
        if (reactApplicationContext != null) {
            return reactApplicationContext.getCurrentActivity();
        }
        return null;
    }

    /* renamed from: b */
    public final JSIContext m986b() {
        JSIContext jSIContext = this.f1201f;
        if (jSIContext != null) {
            return jSIContext;
        }
        O90.m5977o("jsiInterop");
        throw null;
    }

    /* renamed from: c */
    public final Context m987c() {
        return (Context) this.f1197b.get();
    }
}
