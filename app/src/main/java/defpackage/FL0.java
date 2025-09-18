package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class FL0 {
    public static final FL0 g = new FL0();
    public ReactContext d;
    public int f;
    public final ArrayList a = new ArrayList();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final HashMap c = new HashMap();
    public Boolean e = Boolean.FALSE;

    public final boolean a(EL0 el0) {
        ReactContext reactContext;
        if (this.e.booleanValue() && (reactContext = this.d) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + el0.a, el0.b);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void b(EL0 el0) {
        this.b.post(new MD0(this, 13, el0));
    }

    public final void c() {
        synchronized (this.c) {
            try {
                Iterator it = new ArrayList(this.a).iterator();
                while (it.hasNext()) {
                    EL0 el0 = (EL0) it.next();
                    if (this.c.containsKey(el0.a)) {
                        this.a.remove(el0);
                        b(el0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
