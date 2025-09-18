package defpackage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.toast.ToastModule;
import com.huawei.hms.rn.availability.HMSAvailabilityModule;

/* renamed from: v20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7526v20 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ReactContextBaseJavaModule d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC7526v20(ToastModule toastModule, String str, int i, int i2) {
        this.d = toastModule;
        this.e = str;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((HMSAvailabilityModule) this.d).lambda$showErrorDialogFragment$1(this.b, this.c, (Promise) this.e);
                break;
            default:
                ToastModule.showWithGravity$lambda$1((ToastModule) this.d, (String) this.e, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ RunnableC7526v20(HMSAvailabilityModule hMSAvailabilityModule, int i, int i2, Promise promise) {
        this.d = hMSAvailabilityModule;
        this.b = i;
        this.c = i2;
        this.e = promise;
    }
}
