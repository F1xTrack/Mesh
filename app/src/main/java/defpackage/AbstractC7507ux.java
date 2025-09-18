package defpackage;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Iterator;
import java.util.Locale;
import kotlin.KotlinVersion;

/* renamed from: ux */
/* loaded from: classes2.dex */
public abstract class AbstractC7507ux {
    public final ConnectivityManager a;
    public final WifiManager b;
    public final TelephonyManager c;
    public final ReactApplicationContext d;
    public boolean e = false;
    public int f = 5;
    public int g = 0;
    public boolean h = false;
    public Boolean i;

    public AbstractC7507ux(ReactApplicationContext reactApplicationContext) {
        this.d = reactApplicationContext;
        this.a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    public static String b(InetAddress inetAddress) {
        short networkPrefixLength;
        Iterator<InterfaceAddress> it = NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses().iterator();
        while (true) {
            if (!it.hasNext()) {
                networkPrefixLength = 0;
                break;
            }
            InterfaceAddress next = it.next();
            if (next.getAddress().getAddress().length == 4) {
                networkPrefixLength = next.getNetworkPrefixLength();
                break;
            }
        }
        int i = (-1) << (32 - networkPrefixLength);
        Locale locale = Locale.US;
        return ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) + "." + ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) + "." + ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) + "." + (i & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.react.bridge.WritableMap a(java.lang.String r15) throws java.net.SocketException {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7507ux.a(java.lang.String):com.facebook.react.bridge.WritableMap");
    }

    public abstract void c();

    public abstract void d();

    public final void e(int i, int i2, boolean z) {
        Boolean bool = this.i;
        if (bool != null) {
            z = bool.booleanValue();
        }
        boolean z2 = i != this.f;
        boolean z3 = i2 != this.g;
        boolean z4 = z != this.h;
        if (z2 || z3 || z4) {
            this.f = i;
            this.g = i2;
            this.h = z;
            if (this.e) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a(null));
            }
        }
    }
}
