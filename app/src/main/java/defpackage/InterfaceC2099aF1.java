package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* renamed from: aF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2099aF1 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(InterfaceC7377uF1 interfaceC7377uF1);

    void getAppInstanceId(InterfaceC7377uF1 interfaceC7377uF1);

    void getCachedAppInstanceId(InterfaceC7377uF1 interfaceC7377uF1);

    void getConditionalUserProperties(String str, String str2, InterfaceC7377uF1 interfaceC7377uF1);

    void getCurrentScreenClass(InterfaceC7377uF1 interfaceC7377uF1);

    void getCurrentScreenName(InterfaceC7377uF1 interfaceC7377uF1);

    void getGmpAppId(InterfaceC7377uF1 interfaceC7377uF1);

    void getMaxUserProperties(String str, InterfaceC7377uF1 interfaceC7377uF1);

    void getSessionId(InterfaceC7377uF1 interfaceC7377uF1);

    void getTestFlag(InterfaceC7377uF1 interfaceC7377uF1, int i);

    void getUserProperties(String str, String str2, boolean z, InterfaceC7377uF1 interfaceC7377uF1);

    void initForTests(Map map);

    void initialize(InterfaceC3515e50 interfaceC3515e50, C3359dG1 c3359dG1, long j);

    void isDataCollectionEnabled(InterfaceC7377uF1 interfaceC7377uF1);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC7377uF1 interfaceC7377uF1, long j);

    void logHealthData(int i, String str, InterfaceC3515e50 interfaceC3515e50, InterfaceC3515e50 interfaceC3515e502, InterfaceC3515e50 interfaceC3515e503);

    void onActivityCreated(InterfaceC3515e50 interfaceC3515e50, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(C7380uG1 c7380uG1, Bundle bundle, long j);

    void onActivityDestroyed(InterfaceC3515e50 interfaceC3515e50, long j);

    void onActivityDestroyedByScionActivityInfo(C7380uG1 c7380uG1, long j);

    void onActivityPaused(InterfaceC3515e50 interfaceC3515e50, long j);

    void onActivityPausedByScionActivityInfo(C7380uG1 c7380uG1, long j);

    void onActivityResumed(InterfaceC3515e50 interfaceC3515e50, long j);

    void onActivityResumedByScionActivityInfo(C7380uG1 c7380uG1, long j);

    void onActivitySaveInstanceState(InterfaceC3515e50 interfaceC3515e50, InterfaceC7377uF1 interfaceC7377uF1, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(C7380uG1 c7380uG1, InterfaceC7377uF1 interfaceC7377uF1, long j);

    void onActivityStarted(InterfaceC3515e50 interfaceC3515e50, long j);

    void onActivityStartedByScionActivityInfo(C7380uG1 c7380uG1, long j);

    void onActivityStopped(InterfaceC3515e50 interfaceC3515e50, long j);

    void onActivityStoppedByScionActivityInfo(C7380uG1 c7380uG1, long j);

    void performAction(Bundle bundle, InterfaceC7377uF1 interfaceC7377uF1, long j);

    void registerOnMeasurementEventListener(OF1 of1);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(InterfaceC7948xF1 interfaceC7948xF1);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(InterfaceC3515e50 interfaceC3515e50, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(C7380uG1 c7380uG1, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(OF1 of1);

    void setInstanceIdProvider(UF1 uf1);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, InterfaceC3515e50 interfaceC3515e50, boolean z, long j);

    void unregisterOnMeasurementEventListener(OF1 of1);
}
