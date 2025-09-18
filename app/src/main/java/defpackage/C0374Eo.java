package defpackage;

import android.os.SystemClock;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.network.NetworkingModule;
import java.net.URL;

/* renamed from: Eo */
/* loaded from: classes.dex */
public final class C0374Eo {
    public int a;
    public long b;
    public Object c;

    public C0374Eo(Exception exc, long j) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof C2011Zo) {
            this.a = 2;
            this.c = exc;
            return;
        }
        if (!(exc instanceof C6592q80)) {
            this.a = 0;
            this.c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.c = exc;
        if (exc instanceof C1621Uo) {
            this.a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.a = 1;
        } else {
            this.a = 0;
        }
    }

    public void a(long j, long j2, boolean z) {
        long jNanoTime = System.nanoTime();
        if (z || NetworkingModule.shouldDispatch(jNanoTime, this.b)) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(this.a);
            writableArrayCreateArray.pushInt((int) j);
            writableArrayCreateArray.pushInt((int) j2);
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.c;
            if (reactApplicationContext != null) {
                reactApplicationContext.emitDeviceEvent("didSendNetworkData", writableArrayCreateArray);
            }
            this.b = jNanoTime;
        }
    }

    public C0374Eo(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }
}
