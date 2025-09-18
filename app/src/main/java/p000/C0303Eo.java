package p000;

import android.os.SystemClock;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.network.NetworkingModule;
import java.net.URL;

/* renamed from: Eo */
/* loaded from: classes.dex */
public final class C0303Eo {

    /* renamed from: a */
    public int f2907a;

    /* renamed from: b */
    public long f2908b;

    /* renamed from: c */
    public Object f2909c;

    public C0303Eo(Exception exc, long j) {
        this.f2908b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof C1624Zo) {
            this.f2907a = 2;
            this.f2909c = exc;
            return;
        }
        if (!(exc instanceof C10739q80)) {
            this.f2907a = 0;
            this.f2909c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.f2909c = exc;
        if (exc instanceof C1309Uo) {
            this.f2907a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.f2907a = 1;
        } else {
            this.f2907a = 0;
        }
    }

    /* renamed from: a */
    public void m2422a(long j, long j2, boolean z) {
        long jNanoTime = System.nanoTime();
        if (z || NetworkingModule.shouldDispatch(jNanoTime, this.f2908b)) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(this.f2907a);
            writableArrayCreateArray.pushInt((int) j);
            writableArrayCreateArray.pushInt((int) j2);
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f2909c;
            if (reactApplicationContext != null) {
                reactApplicationContext.emitDeviceEvent("didSendNetworkData", writableArrayCreateArray);
            }
            this.f2908b = jNanoTime;
        }
    }

    public C0303Eo(int i, URL url, long j) {
        this.f2907a = i;
        this.f2909c = url;
        this.f2908b = j;
    }
}
