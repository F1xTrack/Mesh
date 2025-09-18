package p000;

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
public abstract class AbstractC6981ux {

    /* renamed from: a */
    public final ConnectivityManager f44035a;

    /* renamed from: b */
    public final WifiManager f44036b;

    /* renamed from: c */
    public final TelephonyManager f44037c;

    /* renamed from: d */
    public final ReactApplicationContext f44038d;

    /* renamed from: e */
    public boolean f44039e = false;

    /* renamed from: f */
    public int f44040f = 5;

    /* renamed from: g */
    public int f44041g = 0;

    /* renamed from: h */
    public boolean f44042h = false;

    /* renamed from: i */
    public Boolean f44043i;

    public AbstractC6981ux(ReactApplicationContext reactApplicationContext) {
        this.f44038d = reactApplicationContext;
        this.f44035a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f44036b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f44037c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    /* renamed from: b */
    public static String m25288b(InetAddress inetAddress) {
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.react.bridge.WritableMap m25289a(java.lang.String r15) throws java.net.SocketException {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC6981ux.m25289a(java.lang.String):com.facebook.react.bridge.WritableMap");
    }

    /* renamed from: c */
    public abstract void mo6180c();

    /* renamed from: d */
    public abstract void mo6181d();

    /* renamed from: e */
    public final void m25290e(int i, int i2, boolean z) {
        Boolean bool = this.f44043i;
        if (bool != null) {
            z = bool.booleanValue();
        }
        boolean z2 = i != this.f44040f;
        boolean z3 = i2 != this.f44041g;
        boolean z4 = z != this.f44042h;
        if (z2 || z3 || z4) {
            this.f44040f = i;
            this.f44041g = i2;
            this.f44042h = z;
            if (this.f44039e) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f44038d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", m25289a(null));
            }
        }
    }
}
