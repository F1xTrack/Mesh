package p000;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.analytics.ReactNativeFirebaseAnalyticsModule;
import io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsModule;
import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingModule;
import io.invertase.firebase.perf.ReactNativeFirebasePerfModule;

/* loaded from: classes.dex */
public final /* synthetic */ class I30 implements InterfaceC9051cy0, InterfaceC8244Rx0, InterfaceC7984Mx0, InterfaceC8036Nx0 {

    /* renamed from: a */
    public final /* synthetic */ int f4672a;

    /* renamed from: b */
    public final /* synthetic */ Promise f4673b;

    public /* synthetic */ I30(int i, Promise promise) {
        this.f4672a = i;
        this.f4673b = promise;
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        switch (this.f4672a) {
            case 8:
                ReactNativeFirebaseAnalyticsModule.lambda$getAppInstanceId$3(this.f4673b, task);
                break;
            case 9:
                ReactNativeFirebaseAnalyticsModule.lambda$setUserProperty$6(this.f4673b, task);
                break;
            case 10:
                ReactNativeFirebaseAnalyticsModule.lambda$setConsent$10(this.f4673b, task);
                break;
            case 11:
                ReactNativeFirebaseAnalyticsModule.lambda$setAnalyticsCollectionEnabled$1(this.f4673b, task);
                break;
            case 12:
                ReactNativeFirebaseAnalyticsModule.lambda$logEvent$0(this.f4673b, task);
                break;
            case 13:
                ReactNativeFirebaseAnalyticsModule.lambda$getSessionId$4(this.f4673b, task);
                break;
            case 14:
                ReactNativeFirebaseAnalyticsModule.lambda$resetAnalyticsData$8(this.f4673b, task);
                break;
            case 15:
                ReactNativeFirebaseAnalyticsModule.lambda$setDefaultEventParameters$9(this.f4673b, task);
                break;
            case 16:
                ReactNativeFirebaseAnalyticsModule.lambda$setUserProperties$7(this.f4673b, task);
                break;
            case 17:
                ReactNativeFirebaseAnalyticsModule.lambda$setSessionTimeoutDuration$2(this.f4673b, task);
                break;
            case 18:
                ReactNativeFirebaseAnalyticsModule.lambda$setUserId$5(this.f4673b, task);
                break;
            case 19:
                ReactNativeFirebaseCrashlyticsModule.lambda$checkForUnsentReports$0(this.f4673b, task);
                break;
            case 20:
                ReactNativeFirebaseMessagingModule.lambda$deleteToken$5(this.f4673b, task);
                break;
            case 21:
                ReactNativeFirebaseMessagingModule.lambda$setAutoInitEnabled$1(this.f4673b, task);
                break;
            case 22:
                ReactNativeFirebaseMessagingModule.lambda$hasPermission$7(this.f4673b, task);
                break;
            case 23:
                ReactNativeFirebaseMessagingModule.lambda$getToken$3(this.f4673b, task);
                break;
            case 24:
                ReactNativeFirebaseMessagingModule.lambda$sendMessage$9(this.f4673b, task);
                break;
            case 25:
                ReactNativeFirebaseMessagingModule.lambda$unsubscribeFromTopic$11(this.f4673b, task);
                break;
            case 26:
                ReactNativeFirebaseMessagingModule.lambda$setDeliveryMetricsExportToBigQuery$13(this.f4673b, task);
                break;
            case 27:
                ReactNativeFirebaseMessagingModule.lambda$subscribeToTopic$10(this.f4673b, task);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ReactNativeFirebasePerfModule.lambda$stopTrace$2(this.f4673b, task);
                break;
            default:
                ReactNativeFirebasePerfModule.lambda$startTrace$1(this.f4673b, task);
                break;
        }
    }

    @Override // p000.InterfaceC8244Rx0
    public void onFailure(Exception exc) {
        switch (this.f4672a) {
            case 1:
                HmsPushInstanceId.lambda$getAAID$1(this.f4673b, exc);
                break;
            default:
                HmsPushOpenDevice.lambda$getOdid$1(this.f4673b, exc);
                break;
        }
    }

    @Override // p000.InterfaceC9051cy0
    public void onSuccess(Object obj) {
        switch (this.f4672a) {
            case 0:
                HmsPushInstanceId.lambda$getAAID$0(this.f4673b, (AAIDResult) obj);
                break;
            default:
                HmsPushOpenDevice.lambda$getOdid$0(this.f4673b, (OdidResult) obj);
                break;
        }
    }

    @Override // p000.InterfaceC7984Mx0
    public void onComplete(com.huawei.hmf.tasks.Task task) {
        switch (this.f4672a) {
            case 2:
                HmsPushMessaging.lambda$unsubscribe$3(this.f4673b, (C8499Wu1) task);
                break;
            case 3:
                HmsPushMessaging.lambda$turnOnPush$0(this.f4673b, (C8499Wu1) task);
                break;
            case 4:
                HmsPushMessaging.lambda$turnOffPush$1(this.f4673b, (C8499Wu1) task);
                break;
            default:
                HmsPushMessaging.lambda$subscribe$2(this.f4673b, (C8499Wu1) task);
                break;
        }
    }
}
