package defpackage;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.analytics.ReactNativeFirebaseAnalyticsModule;
import io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsModule;
import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingModule;
import io.invertase.firebase.perf.ReactNativeFirebasePerfModule;

/* loaded from: classes.dex */
public final /* synthetic */ class I30 implements InterfaceC3299cy0, InterfaceC1415Rx0, InterfaceC1025Mx0, InterfaceC1103Nx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Promise b;

    public /* synthetic */ I30(int i, Promise promise) {
        this.a = i;
        this.b = promise;
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        switch (this.a) {
            case 8:
                ReactNativeFirebaseAnalyticsModule.lambda$getAppInstanceId$3(this.b, task);
                break;
            case 9:
                ReactNativeFirebaseAnalyticsModule.lambda$setUserProperty$6(this.b, task);
                break;
            case 10:
                ReactNativeFirebaseAnalyticsModule.lambda$setConsent$10(this.b, task);
                break;
            case 11:
                ReactNativeFirebaseAnalyticsModule.lambda$setAnalyticsCollectionEnabled$1(this.b, task);
                break;
            case 12:
                ReactNativeFirebaseAnalyticsModule.lambda$logEvent$0(this.b, task);
                break;
            case 13:
                ReactNativeFirebaseAnalyticsModule.lambda$getSessionId$4(this.b, task);
                break;
            case 14:
                ReactNativeFirebaseAnalyticsModule.lambda$resetAnalyticsData$8(this.b, task);
                break;
            case 15:
                ReactNativeFirebaseAnalyticsModule.lambda$setDefaultEventParameters$9(this.b, task);
                break;
            case 16:
                ReactNativeFirebaseAnalyticsModule.lambda$setUserProperties$7(this.b, task);
                break;
            case 17:
                ReactNativeFirebaseAnalyticsModule.lambda$setSessionTimeoutDuration$2(this.b, task);
                break;
            case 18:
                ReactNativeFirebaseAnalyticsModule.lambda$setUserId$5(this.b, task);
                break;
            case 19:
                ReactNativeFirebaseCrashlyticsModule.lambda$checkForUnsentReports$0(this.b, task);
                break;
            case 20:
                ReactNativeFirebaseMessagingModule.lambda$deleteToken$5(this.b, task);
                break;
            case 21:
                ReactNativeFirebaseMessagingModule.lambda$setAutoInitEnabled$1(this.b, task);
                break;
            case 22:
                ReactNativeFirebaseMessagingModule.lambda$hasPermission$7(this.b, task);
                break;
            case 23:
                ReactNativeFirebaseMessagingModule.lambda$getToken$3(this.b, task);
                break;
            case 24:
                ReactNativeFirebaseMessagingModule.lambda$sendMessage$9(this.b, task);
                break;
            case 25:
                ReactNativeFirebaseMessagingModule.lambda$unsubscribeFromTopic$11(this.b, task);
                break;
            case 26:
                ReactNativeFirebaseMessagingModule.lambda$setDeliveryMetricsExportToBigQuery$13(this.b, task);
                break;
            case 27:
                ReactNativeFirebaseMessagingModule.lambda$subscribeToTopic$10(this.b, task);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ReactNativeFirebasePerfModule.lambda$stopTrace$2(this.b, task);
                break;
            default:
                ReactNativeFirebasePerfModule.lambda$startTrace$1(this.b, task);
                break;
        }
    }

    @Override // defpackage.InterfaceC1415Rx0
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 1:
                HmsPushInstanceId.lambda$getAAID$1(this.b, exc);
                break;
            default:
                HmsPushOpenDevice.lambda$getOdid$1(this.b, exc);
                break;
        }
    }

    @Override // defpackage.InterfaceC3299cy0
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                HmsPushInstanceId.lambda$getAAID$0(this.b, (AAIDResult) obj);
                break;
            default:
                HmsPushOpenDevice.lambda$getOdid$0(this.b, (OdidResult) obj);
                break;
        }
    }

    @Override // defpackage.InterfaceC1025Mx0
    public void onComplete(com.huawei.hmf.tasks.Task task) {
        switch (this.a) {
            case 2:
                HmsPushMessaging.lambda$unsubscribe$3(this.b, (C1797Wu1) task);
                break;
            case 3:
                HmsPushMessaging.lambda$turnOnPush$0(this.b, (C1797Wu1) task);
                break;
            case 4:
                HmsPushMessaging.lambda$turnOffPush$1(this.b, (C1797Wu1) task);
                break;
            default:
                HmsPushMessaging.lambda$subscribe$2(this.b, (C1797Wu1) task);
                break;
        }
    }
}
