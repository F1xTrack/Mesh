package defpackage;

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

/* loaded from: classes2.dex */
public final class C7 {
    public final C0777Js0 a;
    public final WeakReference b;
    public final C0699Is0 c;
    public final TK0 d;
    public boolean e;
    public JSIContext f;
    public final C0387Es0 g;
    public final VY h;
    public final C0542Gs i;
    public final C1339Qy j;
    public final C1339Qy k;
    public final C1339Qy l;
    public final JNIDeallocator m;
    public WeakReference n;
    public final VH o;

    public C7(InterfaceC1010Ms0 interfaceC1010Ms0, C0777Js0 c0777Js0, WeakReference weakReference) {
        O90.f(interfaceC1010Ms0, "modulesProvider");
        O90.f(c0777Js0, "legacyModuleRegistry");
        this.a = c0777Js0;
        this.b = weakReference;
        C0699Is0 c0699Is0 = new C0699Is0(new WeakReference(this));
        this.c = c0699Is0;
        TK0 tk0 = new TK0(this);
        this.d = tk0;
        C7704vz c7704vz = new C7704vz();
        c7704vz.a = this;
        this.g = new C0387Es0(c7704vz);
        this.h = new VY(this);
        C0542Gs c0542Gs = new C0542Gs();
        c0542Gs.a = new LinkedHashMap();
        this.i = c0542Gs;
        HandlerThread handlerThread = new HandlerThread("expo.modules.AsyncFunctionQueue");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        int i = AbstractC8287z20.a;
        C8097y20 c8097y20 = new C8097y20(handler, null, false);
        GK gk = GK.a;
        QF qf = QF.c;
        C6205o61 c6205o61A = GT1.a();
        qf.getClass();
        this.j = AbstractC7625vY1.a(AbstractC7803wU1.c(qf, c6205o61A).f(new C0641Hz("expo.modules.BackgroundCoroutineScope")));
        this.k = AbstractC7625vY1.a(AbstractC7803wU1.c(c8097y20, GT1.a()).f(new C0641Hz("expo.modules.AsyncFunctionQueue")));
        C8097y20 c8097y202 = AbstractC0603Hm0.a;
        C6205o61 c6205o61A2 = GT1.a();
        c8097y202.getClass();
        this.l = AbstractC7625vY1.a(AbstractC7803wU1.c(c8097y202, c6205o61A2).f(new C0641Hz("expo.modules.MainQueue")));
        this.m = new JNIDeallocator(0);
        this.o = new VH(this);
        Object obj = weakReference.get();
        if (obj == null) {
            throw new IllegalArgumentException("The app context should be created with valid react context.");
        }
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) obj;
        reactApplicationContext.addLifecycleEventListener(tk0);
        reactApplicationContext.addActivityEventListener(tk0);
        c0699Is0.q(new ZO());
        c0699Is0.q(new C6736qu0());
        Iterator it = interfaceC1010Ms0.getModulesList().iterator();
        while (it.hasNext()) {
            c0699Is0.q((AbstractC7874ws0) ((Class) it.next()).getDeclaredConstructor(null).newInstance(null));
        }
        C1016Mu0 c1016Mu0 = AbstractC7131sz.a;
        c1016Mu0.getClass();
        c1016Mu0.l(EnumC6327ol0.c, "✅ AppContext was initialized", null);
    }

    public final Activity a() {
        Object obj;
        Activity currentActivity;
        try {
            obj = this.a.a.get(C3815ff1.class);
        } catch (Exception unused) {
            obj = null;
        }
        C3815ff1 c3815ff1 = (C3815ff1) obj;
        if (c3815ff1 != null && (currentActivity = c3815ff1.a.getCurrentActivity()) != null) {
            return currentActivity;
        }
        Context contextC = c();
        ReactApplicationContext reactApplicationContext = contextC instanceof ReactApplicationContext ? (ReactApplicationContext) contextC : null;
        if (reactApplicationContext != null) {
            return reactApplicationContext.getCurrentActivity();
        }
        return null;
    }

    public final JSIContext b() {
        JSIContext jSIContext = this.f;
        if (jSIContext != null) {
            return jSIContext;
        }
        O90.o("jsiInterop");
        throw null;
    }

    public final Context c() {
        return (Context) this.b.get();
    }
}
