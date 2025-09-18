package defpackage;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.Task;
import com.remoteconfig.RemoteConfigModule;
import com.rustorepush.RustorePushModule;
import com.rustorereview.RustoreReviewModule;
import io.invertase.firebase.perf.ReactNativeFirebasePerfModule;

/* loaded from: classes2.dex */
public final /* synthetic */ class KL0 implements InterfaceC1103Nx0, InterfaceC3489dy0, InterfaceC1493Sx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Promise b;

    public /* synthetic */ KL0(int i, Promise promise) {
        this.a = i;
        this.b = promise;
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        switch (this.a) {
            case 0:
                ReactNativeFirebasePerfModule.lambda$stopHttpMetric$6(this.b, task);
                break;
            case 1:
                ReactNativeFirebasePerfModule.lambda$setPerformanceCollectionEnabled$0(this.b, task);
                break;
            case 2:
                ReactNativeFirebasePerfModule.lambda$stopScreenTrace$4(this.b, task);
                break;
            case 3:
                ReactNativeFirebasePerfModule.lambda$startHttpMetric$5(this.b, task);
                break;
            default:
                ReactNativeFirebasePerfModule.lambda$startScreenTrace$3(this.b, task);
                break;
        }
    }

    @Override // defpackage.InterfaceC1493Sx0
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 6:
                RemoteConfigModule.init$lambda$4(this.b, th);
                break;
            case 7:
                RemoteConfigModule.getRemoteConfig$lambda$6(this.b, th);
                break;
            case 8:
            case 9:
            case 12:
            case 14:
            case 17:
            case 19:
            default:
                RustoreReviewModule.requestReviewFlow$lambda$1(this.b, th);
                break;
            case 10:
                RustorePushModule.sendTestNotification$lambda$11(this.b, th);
                break;
            case 11:
                RustorePushModule.getToken$lambda$3(this.b, th);
                break;
            case 13:
                RustorePushModule.unsubscribeFromTopic$lambda$9(this.b, th);
                break;
            case 15:
                RustorePushModule.deleteToken$lambda$5(this.b, th);
                break;
            case 16:
                RustorePushModule.checkPushAvailability$lambda$1(this.b, th);
                break;
            case 18:
                RustorePushModule.subscribeToTopic$lambda$7(this.b, th);
                break;
            case 20:
                RustoreReviewModule.launchReviewFlow$lambda$3(this.b, th);
                break;
        }
    }

    @Override // defpackage.InterfaceC3489dy0
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 5:
                RemoteConfigModule.init$lambda$3(this.b, (C1518Tf1) obj);
                break;
            case 8:
                RustorePushModule.getToken$lambda$2(this.b, (String) obj);
                break;
            case 9:
                RustorePushModule.sendTestNotification$lambda$10(this.b, (C1518Tf1) obj);
                break;
            case 12:
                RustorePushModule.unsubscribeFromTopic$lambda$8(this.b, (C1518Tf1) obj);
                break;
            case 14:
                RustorePushModule.deleteToken$lambda$4(this.b, (C1518Tf1) obj);
                break;
            case 17:
                RustorePushModule.subscribeToTopic$lambda$6(this.b, (C1518Tf1) obj);
                break;
            default:
                RustoreReviewModule.launchReviewFlow$lambda$2(this.b, (C1518Tf1) obj);
                break;
        }
    }
}
