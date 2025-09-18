package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* renamed from: aF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8701aF1 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(InterfaceC11266uF1 interfaceC11266uF1);

    void getAppInstanceId(InterfaceC11266uF1 interfaceC11266uF1);

    void getCachedAppInstanceId(InterfaceC11266uF1 interfaceC11266uF1);

    void getConditionalUserProperties(String str, String str2, InterfaceC11266uF1 interfaceC11266uF1);

    void getCurrentScreenClass(InterfaceC11266uF1 interfaceC11266uF1);

    void getCurrentScreenName(InterfaceC11266uF1 interfaceC11266uF1);

    void getGmpAppId(InterfaceC11266uF1 interfaceC11266uF1);

    void getMaxUserProperties(String str, InterfaceC11266uF1 interfaceC11266uF1);

    void getSessionId(InterfaceC11266uF1 interfaceC11266uF1);

    void getTestFlag(InterfaceC11266uF1 interfaceC11266uF1, int i);

    void getUserProperties(String str, String str2, boolean z, InterfaceC11266uF1 interfaceC11266uF1);

    void initForTests(Map map);

    void initialize(InterfaceC9197e50 interfaceC9197e50, C9092dG1 c9092dG1, long j);

    void isDataCollectionEnabled(InterfaceC11266uF1 interfaceC11266uF1);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC11266uF1 interfaceC11266uF1, long j);

    void logHealthData(int i, String str, InterfaceC9197e50 interfaceC9197e50, InterfaceC9197e50 interfaceC9197e502, InterfaceC9197e50 interfaceC9197e503);

    void onActivityCreated(InterfaceC9197e50 interfaceC9197e50, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(C11268uG1 c11268uG1, Bundle bundle, long j);

    void onActivityDestroyed(InterfaceC9197e50 interfaceC9197e50, long j);

    void onActivityDestroyedByScionActivityInfo(C11268uG1 c11268uG1, long j);

    void onActivityPaused(InterfaceC9197e50 interfaceC9197e50, long j);

    void onActivityPausedByScionActivityInfo(C11268uG1 c11268uG1, long j);

    void onActivityResumed(InterfaceC9197e50 interfaceC9197e50, long j);

    void onActivityResumedByScionActivityInfo(C11268uG1 c11268uG1, long j);

    void onActivitySaveInstanceState(InterfaceC9197e50 interfaceC9197e50, InterfaceC11266uF1 interfaceC11266uF1, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(C11268uG1 c11268uG1, InterfaceC11266uF1 interfaceC11266uF1, long j);

    void onActivityStarted(InterfaceC9197e50 interfaceC9197e50, long j);

    void onActivityStartedByScionActivityInfo(C11268uG1 c11268uG1, long j);

    void onActivityStopped(InterfaceC9197e50 interfaceC9197e50, long j);

    void onActivityStoppedByScionActivityInfo(C11268uG1 c11268uG1, long j);

    void performAction(Bundle bundle, InterfaceC11266uF1 interfaceC11266uF1, long j);

    void registerOnMeasurementEventListener(OF1 of1);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(InterfaceC11648xF1 interfaceC11648xF1);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(InterfaceC9197e50 interfaceC9197e50, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(C11268uG1 c11268uG1, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(OF1 of1);

    void setInstanceIdProvider(UF1 uf1);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, InterfaceC9197e50 interfaceC9197e50, boolean z, long j);

    void unregisterOnMeasurementEventListener(OF1 of1);
}
