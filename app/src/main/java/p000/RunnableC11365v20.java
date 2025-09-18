package p000;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.toast.ToastModule;
import com.huawei.hms.p015rn.availability.HMSAvailabilityModule;

/* renamed from: v20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC11365v20 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44107a = 1;

    /* renamed from: b */
    public final /* synthetic */ int f44108b;

    /* renamed from: c */
    public final /* synthetic */ int f44109c;

    /* renamed from: d */
    public final /* synthetic */ ReactContextBaseJavaModule f44110d;

    /* renamed from: e */
    public final /* synthetic */ Object f44111e;

    public /* synthetic */ RunnableC11365v20(ToastModule toastModule, String str, int i, int i2) {
        this.f44110d = toastModule;
        this.f44111e = str;
        this.f44108b = i;
        this.f44109c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44107a) {
            case 0:
                ((HMSAvailabilityModule) this.f44110d).lambda$showErrorDialogFragment$1(this.f44108b, this.f44109c, (Promise) this.f44111e);
                break;
            default:
                ToastModule.showWithGravity$lambda$1((ToastModule) this.f44110d, (String) this.f44111e, this.f44108b, this.f44109c);
                break;
        }
    }

    public /* synthetic */ RunnableC11365v20(HMSAvailabilityModule hMSAvailabilityModule, int i, int i2, Promise promise) {
        this.f44110d = hMSAvailabilityModule;
        this.f44108b = i;
        this.f44109c = i2;
        this.f44111e = promise;
    }
}
