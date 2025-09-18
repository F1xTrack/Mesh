package p000;

import android.os.Build;
import android.os.Handler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.NetInfoModule;

/* renamed from: P3 */
/* loaded from: classes2.dex */
public final class C0948P3 {

    /* renamed from: b */
    public final ReactApplicationContext f8805b;

    /* renamed from: c */
    public final NetInfoModule f8806c;

    /* renamed from: e */
    public Handler f8808e;

    /* renamed from: a */
    public final C0885O3 f8804a = new C0885O3(this);

    /* renamed from: d */
    public final GR0 f8807d = new GR0(2, this);

    /* renamed from: f */
    public boolean f8809f = false;

    public C0948P3(ReactApplicationContext reactApplicationContext, NetInfoModule netInfoModule) {
        this.f8805b = reactApplicationContext;
        this.f8806c = netInfoModule;
    }

    /* renamed from: a */
    public static boolean m6218a() {
        if (Build.MANUFACTURER.equals("Amazon")) {
            String str = Build.MODEL;
            if (str.startsWith("AF") || str.startsWith("KF")) {
                return true;
            }
        }
        return false;
    }
}
