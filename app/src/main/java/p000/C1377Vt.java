package p000;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* renamed from: Vt */
/* loaded from: classes2.dex */
public final class C1377Vt {

    /* renamed from: a */
    public boolean f12844a = false;

    /* renamed from: b */
    public C7005vK f12845b = null;

    /* renamed from: c */
    public final /* synthetic */ AsyncTaskC1440Wt f12846c;

    public C1377Vt(AsyncTaskC1440Wt asyncTaskC1440Wt) {
        this.f12846c = asyncTaskC1440Wt;
    }

    /* renamed from: a */
    public final void m8614a(C7005vK c7005vK) {
        AsyncTaskC1440Wt asyncTaskC1440Wt = this.f12846c;
        if (asyncTaskC1440Wt.f13436b) {
            this.f12845b = c7005vK;
            if (c7005vK.f44329b == c7005vK.f44330c) {
                m8615b();
            } else {
                if (this.f12844a) {
                    return;
                }
                this.f12844a = true;
                asyncTaskC1440Wt.f13438d.getReactApplicationContext().runOnUiQueueThread(new GR0(7, this));
            }
        }
    }

    /* renamed from: b */
    public final void m8615b() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) this.f12846c.f13438d.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        C7005vK c7005vK = this.f12845b;
        c7005vK.getClass();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        long j = c7005vK.f44329b;
        long j2 = c7005vK.f44330c;
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
