package defpackage;

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

/* renamed from: xp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8054xp {
    public static final Object o = new Object();
    public static final SparseArray p = new SparseArray();
    public final C8434zp c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public C6520pm g;
    public C3383dO1 h;
    public C5568kn i;
    public final WS0 j;
    public final C0599Hl k;
    public final Integer n;
    public final C7375uF a = new C7375uF(3, false);
    public final Object b = new Object();
    public int l = 1;
    public InterfaceFutureC0750Jj0 m = F70.c;

    public C8054xp(ReactContext reactContext, AbstractC0435Fi0 abstractC0435Fi0) {
        ComponentCallbacks2 componentCallbacks2;
        InterfaceC8244yp interfaceC8244yp;
        String string;
        Object objW;
        Bundle bundle;
        Object objW2;
        Object objW3;
        WS0 c0568Ha1;
        Context contextF = AbstractC3782fU1.f(reactContext);
        while (true) {
            if (!(contextF instanceof ContextWrapper)) {
                componentCallbacks2 = null;
                break;
            } else {
                if (contextF instanceof Application) {
                    componentCallbacks2 = (Application) contextF;
                    break;
                }
                contextF = ((ContextWrapper) contextF).getBaseContext();
            }
        }
        if (componentCallbacks2 instanceof InterfaceC8244yp) {
            interfaceC8244yp = (InterfaceC8244yp) componentCallbacks2;
        } else {
            try {
                Context contextF2 = AbstractC3782fU1.f(reactContext);
                Bundle bundle2 = contextF2.getPackageManager().getServiceInfo(new ComponentName(contextF2, (Class<?>) MetadataHolderService.class), 640).metaData;
                string = bundle2 != null ? bundle2.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
                AbstractC0759Jm0.f("CameraX");
            }
            if (string == null) {
                AbstractC0759Jm0.f("CameraX");
                interfaceC8244yp = null;
            } else {
                interfaceC8244yp = (InterfaceC8244yp) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
        }
        if (interfaceC8244yp == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        C8434zp cameraXConfig = interfaceC8244yp.getCameraXConfig();
        this.c = cameraXConfig;
        try {
            objW = cameraXConfig.a.w(C8434zp.k);
        } catch (IllegalArgumentException unused2) {
            objW = null;
        }
        DG0 dg0A = (DG0) objW;
        if (dg0A != null) {
            dg0A.toString();
            AbstractC0759Jm0.f("CameraX");
        } else {
            try {
                bundle = reactContext.getPackageManager().getServiceInfo(new ComponentName(reactContext, (Class<?>) GG0.class), 640).metaData;
            } catch (PackageManager.NameNotFoundException unused3) {
                AbstractC0759Jm0.f("QuirkSettingsLoader");
            }
            if (bundle == null) {
                AbstractC0759Jm0.f("QuirkSettingsLoader");
                dg0A = null;
                Objects.toString(dg0A);
                AbstractC0759Jm0.f("CameraX");
            } else {
                dg0A = HG0.a(reactContext, bundle);
                Objects.toString(dg0A);
                AbstractC0759Jm0.f("CameraX");
            }
        }
        if (dg0A == null) {
            dg0A = FG0.b;
            Objects.toString(dg0A);
            AbstractC0759Jm0.f("CameraX");
        }
        FG0.c.a.e(dg0A);
        try {
            objW2 = this.c.a.w(C8434zp.e);
        } catch (IllegalArgumentException unused4) {
            objW2 = null;
        }
        Executor executor = (Executor) objW2;
        try {
            objW3 = this.c.a.w(C8434zp.f);
        } catch (IllegalArgumentException unused5) {
            objW3 = null;
        }
        Handler handler = (Handler) objW3;
        this.d = executor == null ? new ExecutorC6144no() : executor;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f = handlerThread;
            handlerThread.start();
            this.e = H12.a(handlerThread.getLooper());
        } else {
            this.f = null;
            this.e = handler;
        }
        C8434zp c8434zp = this.c;
        C0572Hc c0572Hc = C8434zp.g;
        c8434zp.getClass();
        Integer num = (Integer) ((C0873Ky0) c8434zp.getConfig()).q(c0572Hc, null);
        this.n = num;
        synchronized (o) {
            try {
                if (num != null) {
                    AbstractC3377dM1.f(num.intValue(), 3, 6, "minLogLevel");
                    SparseArray sparseArray = p;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + ((Integer) sparseArray.get(num.intValue())).intValue() : 1));
                    f();
                }
            } finally {
            }
        }
        C8434zp c8434zp2 = this.c;
        c8434zp2.getClass();
        C0572Hc c0572Hc2 = C8434zp.j;
        Object objW4 = WS0.a;
        try {
            objW4 = c8434zp2.a.w(c0572Hc2);
        } catch (IllegalArgumentException unused6) {
        }
        WS0 ws0 = (WS0) objW4;
        Objects.requireNonNull(ws0);
        long jA = ws0.a();
        if (ws0 instanceof C0530Go) {
            switch (((C0530Go) ws0).b) {
                case 0:
                    c0568Ha1 = new C0530Go(jA, 0);
                    break;
                default:
                    c0568Ha1 = new C0530Go(jA, 1);
                    break;
            }
        } else {
            c0568Ha1 = new C0568Ha1(jA, ws0);
        }
        this.j = c0568Ha1;
        this.k = c(reactContext);
    }

    public static void a(Integer num) {
        synchronized (o) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = p;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f() {
        SparseArray sparseArray = p;
        if (sparseArray.size() == 0) {
            AbstractC0759Jm0.f = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            AbstractC0759Jm0.f = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            AbstractC0759Jm0.f = 4;
        } else if (sparseArray.get(5) != null) {
            AbstractC0759Jm0.f = 5;
        } else if (sparseArray.get(6) != null) {
            AbstractC0759Jm0.f = 6;
        }
    }

    public final C6520pm b() {
        C6520pm c6520pm = this.g;
        if (c6520pm != null) {
            return c6520pm;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public final C0599Hl c(ReactContext reactContext) {
        C0599Hl c0599HlB;
        synchronized (this.b) {
            boolean z = true;
            if (this.l != 1) {
                z = false;
            }
            AbstractC3377dM1.i(z, "CameraX.initInternal() should only be called once per instance");
            this.l = 2;
            c0599HlB = AbstractC8171yQ1.b(new C0515Gj(this, 4, reactContext));
        }
        return c0599HlB;
    }

    public final void d() {
        synchronized (this.b) {
            this.l = 4;
        }
    }

    public final InterfaceFutureC0750Jj0 e() {
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0;
        synchronized (this.b) {
            try {
                this.e.removeCallbacksAndMessages("retry_token");
                int iX = AbstractC8235ym.x(this.l);
                if (iX == 0) {
                    this.l = 5;
                    interfaceFutureC0750Jj0 = F70.c;
                } else {
                    if (iX == 1) {
                        throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                    }
                    if (iX == 2 || iX == 3) {
                        this.l = 5;
                        a(this.n);
                        this.m = AbstractC8171yQ1.b(new B7(15, this));
                    }
                    interfaceFutureC0750Jj0 = this.m;
                }
            } finally {
            }
        }
        return interfaceFutureC0750Jj0;
    }
}
