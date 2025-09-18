package p000;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import com.facebook.react.bridge.ReactContext;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: xp */
/* loaded from: classes.dex */
public final class C7162xp {

    /* renamed from: o */
    public static final Object f45800o = new Object();

    /* renamed from: p */
    public static final SparseArray f45801p = new SparseArray();

    /* renamed from: c */
    public final C7288zp f45804c;

    /* renamed from: d */
    public final Executor f45805d;

    /* renamed from: e */
    public final Handler f45806e;

    /* renamed from: f */
    public final HandlerThread f45807f;

    /* renamed from: g */
    public C6638pm f45808g;

    /* renamed from: h */
    public C9108dO1 f45809h;

    /* renamed from: i */
    public C6322kn f45810i;

    /* renamed from: j */
    public final WS0 f45811j;

    /* renamed from: k */
    public final C0489Hl f45812k;

    /* renamed from: n */
    public final Integer f45815n;

    /* renamed from: a */
    public final C6937uF f45802a = new C6937uF(3, false);

    /* renamed from: b */
    public final Object f45803b = new Object();

    /* renamed from: l */
    public int f45813l = 1;

    /* renamed from: m */
    public InterfaceFutureC7800Jj0 f45814m = F70.f3069c;

    public C7162xp(ReactContext reactContext, AbstractC7590Fi0 abstractC7590Fi0) {
        ComponentCallbacks2 componentCallbacks2;
        InterfaceC7225yp interfaceC7225yp;
        String string;
        Object objMo4794w;
        Bundle bundle;
        Object objMo4794w2;
        Object objMo4794w3;
        WS0 c7679Ha1;
        Context contextM18245f = AbstractC9376fU1.m18245f(reactContext);
        while (true) {
            if (!(contextM18245f instanceof ContextWrapper)) {
                componentCallbacks2 = null;
                break;
            } else {
                if (contextM18245f instanceof Application) {
                    componentCallbacks2 = (Application) contextM18245f;
                    break;
                }
                contextM18245f = ((ContextWrapper) contextM18245f).getBaseContext();
            }
        }
        if (componentCallbacks2 instanceof InterfaceC7225yp) {
            interfaceC7225yp = (InterfaceC7225yp) componentCallbacks2;
        } else {
            try {
                Context contextM18245f2 = AbstractC9376fU1.m18245f(reactContext);
                Bundle bundle2 = contextM18245f2.getPackageManager().getServiceInfo(new ComponentName(contextM18245f2, (Class<?>) MetadataHolderService.class), 640).metaData;
                string = bundle2 != null ? bundle2.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
                AbstractC7806Jm0.m4412f("CameraX");
            }
            if (string == null) {
                AbstractC7806Jm0.m4412f("CameraX");
                interfaceC7225yp = null;
            } else {
                interfaceC7225yp = (InterfaceC7225yp) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
        }
        if (interfaceC7225yp == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        C7288zp cameraXConfig = interfaceC7225yp.getCameraXConfig();
        this.f45804c = cameraXConfig;
        try {
            objMo4794w = cameraXConfig.f47023a.mo4794w(C7288zp.f47022k);
        } catch (IllegalArgumentException unused2) {
            objMo4794w = null;
        }
        DG0 dg0M3338a = (DG0) objMo4794w;
        if (dg0M3338a != null) {
            dg0M3338a.toString();
            AbstractC7806Jm0.m4412f("CameraX");
        } else {
            try {
                bundle = reactContext.getPackageManager().getServiceInfo(new ComponentName(reactContext, (Class<?>) GG0.class), 640).metaData;
            } catch (PackageManager.NameNotFoundException unused3) {
                AbstractC7806Jm0.m4412f("QuirkSettingsLoader");
            }
            if (bundle == null) {
                AbstractC7806Jm0.m4412f("QuirkSettingsLoader");
                dg0M3338a = null;
                Objects.toString(dg0M3338a);
                AbstractC7806Jm0.m4412f("CameraX");
            } else {
                dg0M3338a = HG0.m3338a(reactContext, bundle);
                Objects.toString(dg0M3338a);
                AbstractC7806Jm0.m4412f("CameraX");
            }
        }
        if (dg0M3338a == null) {
            dg0M3338a = FG0.f3134b;
            Objects.toString(dg0M3338a);
            AbstractC7806Jm0.m4412f("CameraX");
        }
        FG0.f3135c.f3136a.m4389e(dg0M3338a);
        try {
            objMo4794w2 = this.f45804c.f47023a.mo4794w(C7288zp.f47016e);
        } catch (IllegalArgumentException unused4) {
            objMo4794w2 = null;
        }
        Executor executor = (Executor) objMo4794w2;
        try {
            objMo4794w3 = this.f45804c.f47023a.mo4794w(C7288zp.f47017f);
        } catch (IllegalArgumentException unused5) {
            objMo4794w3 = null;
        }
        Handler handler = (Handler) objMo4794w3;
        this.f45805d = executor == null ? new ExecutorC6512no() : executor;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f45807f = handlerThread;
            handlerThread.start();
            this.f45806e = H12.m3240a(handlerThread.getLooper());
        } else {
            this.f45807f = null;
            this.f45806e = handler;
        }
        C7288zp c7288zp = this.f45804c;
        C0480Hc c0480Hc = C7288zp.f47018g;
        c7288zp.getClass();
        Integer num = (Integer) ((C7882Ky0) c7288zp.getConfig()).mo4792q(c0480Hc, null);
        this.f45815n = num;
        synchronized (f45800o) {
            try {
                if (num != null) {
                    AbstractC9104dM1.m17547f(num.intValue(), 3, 6, "minLogLevel");
                    SparseArray sparseArray = f45801p;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + ((Integer) sparseArray.get(num.intValue())).intValue() : 1));
                    m25941f();
                }
            } finally {
            }
        }
        C7288zp c7288zp2 = this.f45804c;
        c7288zp2.getClass();
        C0480Hc c0480Hc2 = C7288zp.f47021j;
        Object objMo4794w4 = WS0.f13193a;
        try {
            objMo4794w4 = c7288zp2.f47023a.mo4794w(c0480Hc2);
        } catch (IllegalArgumentException unused6) {
        }
        WS0 ws0 = (WS0) objMo4794w4;
        Objects.requireNonNull(ws0);
        long jMo2782a = ws0.mo2782a();
        if (ws0 instanceof C0429Go) {
            switch (((C0429Go) ws0).f3905b) {
                case 0:
                    c7679Ha1 = new C0429Go(jMo2782a, 0);
                    break;
                default:
                    c7679Ha1 = new C0429Go(jMo2782a, 1);
                    break;
            }
        } else {
            c7679Ha1 = new C7679Ha1(jMo2782a, ws0);
        }
        this.f45811j = c7679Ha1;
        this.f45812k = m25943c(reactContext);
    }

    /* renamed from: a */
    public static void m25940a(Integer num) {
        synchronized (f45800o) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f45801p;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                m25941f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public static void m25941f() {
        SparseArray sparseArray = f45801p;
        if (sparseArray.size() == 0) {
            AbstractC7806Jm0.f5692f = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            AbstractC7806Jm0.f5692f = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            AbstractC7806Jm0.f5692f = 4;
        } else if (sparseArray.get(5) != null) {
            AbstractC7806Jm0.f5692f = 5;
        } else if (sparseArray.get(6) != null) {
            AbstractC7806Jm0.f5692f = 6;
        }
    }

    /* renamed from: b */
    public final C6638pm m25942b() {
        C6638pm c6638pm = this.f45808g;
        if (c6638pm != null) {
            return c6638pm;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: c */
    public final C0489Hl m25943c(ReactContext reactContext) {
        C0489Hl c0489HlM26149b;
        synchronized (this.f45803b) {
            boolean z = true;
            if (this.f45813l != 1) {
                z = false;
            }
            AbstractC9104dM1.m17550i(z, "CameraX.initInternal() should only be called once per instance");
            this.f45813l = 2;
            c0489HlM26149b = AbstractC11797yQ1.m26149b(new C0424Gj(this, 4, reactContext));
        }
        return c0489HlM26149b;
    }

    /* renamed from: d */
    public final void m25944d() {
        synchronized (this.f45803b) {
            this.f45813l = 4;
        }
    }

    /* renamed from: e */
    public final InterfaceFutureC7800Jj0 m25945e() {
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0;
        synchronized (this.f45803b) {
            try {
                this.f45806e.removeCallbacksAndMessages("retry_token");
                int iM26247x = AbstractC7222ym.m26247x(this.f45813l);
                if (iM26247x == 0) {
                    this.f45813l = 5;
                    interfaceFutureC7800Jj0 = F70.f3069c;
                } else {
                    if (iM26247x == 1) {
                        throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                    }
                    if (iM26247x == 2 || iM26247x == 3) {
                        this.f45813l = 5;
                        m25940a(this.f45815n);
                        this.f45814m = AbstractC11797yQ1.m26149b(new C0071B7(15, this));
                    }
                    interfaceFutureC7800Jj0 = this.f45814m;
                }
            } finally {
            }
        }
        return interfaceFutureC7800Jj0;
    }
}
