package defpackage;

import android.os.Build;
import android.os.Handler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.NetInfoModule;

/* loaded from: classes2.dex */
public final class P3 {
    public final ReactApplicationContext b;
    public final NetInfoModule c;
    public Handler e;
    public final O3 a = new O3(this);
    public final GR0 d = new GR0(2, this);
    public boolean f = false;

    public P3(ReactApplicationContext reactApplicationContext, NetInfoModule netInfoModule) {
        this.b = reactApplicationContext;
        this.c = netInfoModule;
    }

    public static boolean a() {
        if (Build.MANUFACTURER.equals("Amazon")) {
            String str = Build.MODEL;
            if (str.startsWith("AF") || str.startsWith("KF")) {
                return true;
            }
        }
        return false;
    }
}
