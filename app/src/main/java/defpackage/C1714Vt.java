package defpackage;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* renamed from: Vt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1714Vt {
    public boolean a = false;
    public C7581vK b = null;
    public final /* synthetic */ AsyncTaskC1792Wt c;

    public C1714Vt(AsyncTaskC1792Wt asyncTaskC1792Wt) {
        this.c = asyncTaskC1792Wt;
    }

    public final void a(C7581vK c7581vK) {
        AsyncTaskC1792Wt asyncTaskC1792Wt = this.c;
        if (asyncTaskC1792Wt.b) {
            this.b = c7581vK;
            if (c7581vK.b == c7581vK.c) {
                b();
            } else {
                if (this.a) {
                    return;
                }
                this.a = true;
                asyncTaskC1792Wt.d.getReactApplicationContext().runOnUiQueueThread(new GR0(7, this));
            }
        }
    }

    public final void b() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) this.c.d.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        C7581vK c7581vK = this.b;
        c7581vK.getClass();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        long j = c7581vK.b;
        long j2 = c7581vK.c;
        if (j < 2147483647L) {
            writableNativeMap.putInt("totalBytes", (int) j);
            writableNativeMap.putInt("receivedBytes", (int) j2);
        } else {
            writableNativeMap.putDouble("totalBytes", j);
            writableNativeMap.putDouble("receivedBytes", j2);
        }
        rCTDeviceEventEmitter.emit("CodePushDownloadProgress", writableNativeMap);
    }
}
