package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: Ou0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8082Ou0 extends AbstractC6981ux {

    /* renamed from: j */
    public final C8030Nu0 f8666j;

    /* renamed from: k */
    public Network f8667k;

    /* renamed from: l */
    public NetworkCapabilities f8668l;

    public C8082Ou0(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f8667k = null;
        this.f8668l = null;
        this.f8666j = new C8030Nu0(0, this);
    }

    @Override // p000.AbstractC6981ux
    /* renamed from: c */
    public final void mo6180c() {
        ConnectivityManager connectivityManager = this.f44035a;
        try {
            this.f8667k = connectivityManager.getActiveNetwork();
            m6182f(0);
            connectivityManager.registerDefaultNetworkCallback(this.f8666j);
        } catch (SecurityException unused) {
        }
    }

    @Override // p000.AbstractC6981ux
    /* renamed from: d */
    public final void mo6181d() {
        try {
            this.f44035a.unregisterNetworkCallback(this.f8666j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    /* renamed from: f */
    public final void m6182f(int i) {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0204DE(26, this), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6183g() {
        /*
            r11 = this;
            android.net.Network r0 = r11.f8667k
            android.net.NetworkCapabilities r1 = r11.f8668l
            r2 = 4
            r3 = 0
            if (r1 == 0) goto La3
            r4 = 2
            boolean r5 = r1.hasTransport(r4)
            r6 = 3
            r7 = 1
            if (r5 == 0) goto L13
            r5 = r7
            goto L35
        L13:
            boolean r5 = r1.hasTransport(r3)
            if (r5 == 0) goto L1b
            r5 = r4
            goto L35
        L1b:
            boolean r5 = r1.hasTransport(r6)
            if (r5 == 0) goto L23
            r5 = r6
            goto L35
        L23:
            boolean r5 = r1.hasTransport(r7)
            if (r5 == 0) goto L2b
            r5 = 6
            goto L35
        L2b:
            boolean r5 = r1.hasTransport(r2)
            if (r5 == 0) goto L34
            r5 = 8
            goto L35
        L34:
            r5 = 5
        L35:
            r8 = 0
            if (r0 == 0) goto L3e
            android.net.ConnectivityManager r9 = r11.f44035a     // Catch: java.lang.SecurityException -> L3e
            android.net.NetworkInfo r8 = r9.getNetworkInfo(r0)     // Catch: java.lang.SecurityException -> L3e
        L3e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 < r10) goto L4c
            r9 = 21
            boolean r9 = r1.hasCapability(r9)
            r9 = r9 ^ r7
            goto L5f
        L4c:
            if (r0 == 0) goto L5e
            if (r8 == 0) goto L5e
            android.net.NetworkInfo$DetailedState r9 = r8.getDetailedState()
            android.net.NetworkInfo$DetailedState r10 = android.net.NetworkInfo.DetailedState.CONNECTED
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L5e
            r9 = r7
            goto L5f
        L5e:
            r9 = r3
        L5f:
            r10 = 12
            boolean r10 = r1.hasCapability(r10)
            if (r10 == 0) goto L73
            r10 = 16
            boolean r10 = r1.hasCapability(r10)
            if (r10 == 0) goto L73
            if (r9 != 0) goto L73
            r9 = r7
            goto L74
        L73:
            r9 = r3
        L74:
            boolean r10 = r1.hasTransport(r2)
            if (r10 == 0) goto L85
            if (r9 == 0) goto L84
            int r1 = r1.getLinkDownstreamBandwidthKbps()
            if (r1 == 0) goto L84
            r9 = r7
            goto L85
        L84:
            r9 = r3
        L85:
            if (r0 == 0) goto La1
            if (r5 != r4) goto La1
            if (r9 == 0) goto La1
            if (r8 != 0) goto L8f
        L8d:
            r2 = r3
            goto La0
        L8f:
            int r0 = r8.getSubtype()
            r1 = 20
            if (r0 == r1) goto La0
            switch(r0) {
                case 1: goto L9f;
                case 2: goto L9f;
                case 3: goto L9d;
                case 4: goto L9f;
                case 5: goto L9d;
                case 6: goto L9d;
                case 7: goto L9f;
                case 8: goto L9d;
                case 9: goto L9d;
                case 10: goto L9d;
                case 11: goto L9f;
                case 12: goto L9d;
                case 13: goto L9b;
                case 14: goto L9d;
                case 15: goto L9b;
                default: goto L9a;
            }
        L9a:
            goto L8d
        L9b:
            r2 = r6
            goto La0
        L9d:
            r2 = r4
            goto La0
        L9f:
            r2 = r7
        La0:
            r3 = r2
        La1:
            r2 = r5
            goto La4
        La3:
            r9 = r3
        La4:
            r11.m25290e(r2, r3, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8082Ou0.m6183g():void");
    }
}
