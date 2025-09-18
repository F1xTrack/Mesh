package p000;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.Task;
import com.remoteconfig.RemoteConfigModule;
import com.rustorepush.RustorePushModule;
import com.rustorereview.RustoreReviewModule;
import io.invertase.firebase.perf.ReactNativeFirebasePerfModule;

/* loaded from: classes2.dex */
public final /* synthetic */ class KL0 implements InterfaceC8036Nx0, InterfaceC9179dy0, InterfaceC8296Sx0 {

    /* renamed from: a */
    public final /* synthetic */ int f6029a;

    /* renamed from: b */
    public final /* synthetic */ Promise f6030b;

    public /* synthetic */ KL0(int i, Promise promise) {
        this.f6029a = i;
        this.f6030b = promise;
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        switch (this.f6029a) {
            case 0:
                ReactNativeFirebasePerfModule.lambda$stopHttpMetric$6(this.f6030b, task);
                break;
            case 1:
                ReactNativeFirebasePerfModule.lambda$setPerformanceCollectionEnabled$0(this.f6030b, task);
                break;
            case 2:
                ReactNativeFirebasePerfModule.lambda$stopScreenTrace$4(this.f6030b, task);
                break;
            case 3:
                ReactNativeFirebasePerfModule.lambda$startHttpMetric$5(this.f6030b, task);
                break;
            default:
                ReactNativeFirebasePerfModule.lambda$startScreenTrace$3(this.f6030b, task);
                break;
        }
    }

    @Override // p000.InterfaceC8296Sx0
    public void onFailure(Throwable th) {
        switch (this.f6029a) {
            case 6:
                RemoteConfigModule.init$lambda$4(this.f6030b, th);
                break;
            case 7:
                RemoteConfigModule.getRemoteConfig$lambda$6(this.f6030b, th);
                break;
            case 8:
            case 9:
            case 12:
            case 14:
            case 17:
            case 19:
            default:
                RustoreReviewModule.requestReviewFlow$lambda$1(this.f6030b, th);
                break;
            case 10:
                RustorePushModule.sendTestNotification$lambda$11(this.f6030b, th);
                break;
            case 11:
                RustorePushModule.getToken$lambda$3(this.f6030b, th);
                break;
            case 13:
                RustorePushModule.unsubscribeFromTopic$lambda$9(this.f6030b, th);
                break;
            case 15:
                RustorePushModule.deleteToken$lambda$5(this.f6030b, th);
                break;
            case 16:
                RustorePushModule.checkPushAvailability$lambda$1(this.f6030b, th);
                break;
            case 18:
                RustorePushModule.subscribeToTopic$lambda$7(this.f6030b, th);
                break;
            case 20:
                RustoreReviewModule.launchReviewFlow$lambda$3(this.f6030b, th);
                break;
        }
    }

    @Override // p000.InterfaceC9179dy0
    public void onSuccess(Object obj) {
        switch (this.f6029a) {
            case 5:
                RemoteConfigModule.init$lambda$3(this.f6030b, (C8313Tf1) obj);
                break;
            case 8:
                RustorePushModule.getToken$lambda$2(this.f6030b, (String) obj);
                break;
            case 9:
                RustorePushModule.sendTestNotification$lambda$10(this.f6030b, (C8313Tf1) obj);
                break;
            case 12:
                RustorePushModule.unsubscribeFromTopic$lambda$8(this.f6030b, (C8313Tf1) obj);
                break;
            case 14:
                RustorePushModule.deleteToken$lambda$4(this.f6030b, (C8313Tf1) obj);
                break;
            case 17:
                RustorePushModule.subscribeToTopic$lambda$6(this.f6030b, (C8313Tf1) obj);
                break;
            default:
                RustoreReviewModule.launchReviewFlow$lambda$2(this.f6030b, (C8313Tf1) obj);
                break;
        }
    }
}
