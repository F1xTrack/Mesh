package p000;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class FL0 {

    /* renamed from: g */
    public static final FL0 f3159g = new FL0();

    /* renamed from: d */
    public ReactContext f3163d;

    /* renamed from: f */
    public int f3165f;

    /* renamed from: a */
    public final ArrayList f3160a = new ArrayList();

    /* renamed from: b */
    public final Handler f3161b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final HashMap f3162c = new HashMap();

    /* renamed from: e */
    public Boolean f3164e = Boolean.FALSE;

    /* renamed from: a */
    public final boolean m2579a(EL0 el0) {
        ReactContext reactContext;
        if (this.f3164e.booleanValue() && (reactContext = this.f3163d) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f3163d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + el0.f2642a, el0.f2643b);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m2580b(EL0 el0) {
        this.f3161b.post(new MD0(this, 13, el0));
    }

    /* renamed from: c */
    public final void m2581c() {
        synchronized (this.f3162c) {
            try {
                Iterator it = new ArrayList(this.f3160a).iterator();
                while (it.hasNext()) {
                    EL0 el0 = (EL0) it.next();
                    if (this.f3162c.containsKey(el0.f2642a)) {
                        this.f3160a.remove(el0);
                        m2580b(el0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
