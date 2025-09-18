package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: iF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4310iF1 extends AbstractC6555px1 implements InterfaceC2099aF1 {
    @Override // defpackage.InterfaceC2099aF1
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        L(23, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC6032nC1.c(parcelG, bundle);
        L(9, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void clearMeasurementEnabled(long j) {
        Parcel parcelG = G();
        parcelG.writeLong(j);
        L(43, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        L(24, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void generateEventId(InterfaceC7377uF1 interfaceC7377uF1) {
        Parcel parcelG = G();
        AbstractC6032nC1.b(parcelG, interfaceC7377uF1);
        L(22, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void getAppInstanceId(InterfaceC7377uF1 interfaceC7377uF1) {
        Parcel parcelG = G();
        AbstractC6032nC1.b(parcelG, interfaceC7377uF1);
        L(20, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void getCachedAppInstanceId(InterfaceC7377uF1 interfaceC7377uF1) {
        Parcel parcelG = G();
        AbstractC6032nC1.b(parcelG, interfaceC7377uF1);
        L(19, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void getConditionalUserProperties(String str, String str2, InterfaceC7377uF1 interfaceC7377uF1) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC6032nC1.b(parcelG, interfaceC7377uF1);
        L(10, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void getCurrentScreenClass(InterfaceC7377uF1 interfaceC7377uF1) {
        Parcel parcelG = G();
        AbstractC6032nC1.b(parcelG, interfaceC7377uF1);
        L(17, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void getCurrentScreenName(InterfaceC7377uF1 interfaceC7377uF1) {
        Parcel parcelG = G();
        AbstractC6032nC1.b(parcelG, interfaceC7377uF1);
        L(16, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void getGmpAppId(InterfaceC7377uF1 interfaceC7377uF1) {
        Parcel parcelG = G();
        AbstractC6032nC1.b(parcelG, interfaceC7377uF1);
        L(21, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void getMaxUserProperties(String str, InterfaceC7377uF1 interfaceC7377uF1) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        AbstractC6032nC1.b(parcelG, interfaceC7377uF1);
        L(6, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void getSessionId(InterfaceC7377uF1 interfaceC7377uF1) {
        Parcel parcelG = G();
        AbstractC6032nC1.b(parcelG, interfaceC7377uF1);
        L(46, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC7377uF1 interfaceC7377uF1) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        ClassLoader classLoader = AbstractC6032nC1.a;
        parcelG.writeInt(z ? 1 : 0);
        AbstractC6032nC1.b(parcelG, interfaceC7377uF1);
        L(5, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void initialize(InterfaceC3515e50 interfaceC3515e50, C3359dG1 c3359dG1, long j) {
        Parcel parcelG = G();
        AbstractC6032nC1.b(parcelG, interfaceC3515e50);
        AbstractC6032nC1.c(parcelG, c3359dG1);
        parcelG.writeLong(j);
        L(1, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC6032nC1.c(parcelG, bundle);
        parcelG.writeInt(z ? 1 : 0);
        parcelG.writeInt(1);
        parcelG.writeLong(j);
        L(2, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void logHealthData(int i, String str, InterfaceC3515e50 interfaceC3515e50, InterfaceC3515e50 interfaceC3515e502, InterfaceC3515e50 interfaceC3515e503) {
        Parcel parcelG = G();
        parcelG.writeInt(5);
        parcelG.writeString(str);
        AbstractC6032nC1.b(parcelG, interfaceC3515e50);
        AbstractC6032nC1.b(parcelG, interfaceC3515e502);
        AbstractC6032nC1.b(parcelG, interfaceC3515e503);
        L(33, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void onActivityCreatedByScionActivityInfo(C7380uG1 c7380uG1, Bundle bundle, long j) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c7380uG1);
        AbstractC6032nC1.c(parcelG, bundle);
        parcelG.writeLong(j);
        L(53, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void onActivityDestroyedByScionActivityInfo(C7380uG1 c7380uG1, long j) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c7380uG1);
        parcelG.writeLong(j);
        L(54, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void onActivityPausedByScionActivityInfo(C7380uG1 c7380uG1, long j) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c7380uG1);
        parcelG.writeLong(j);
        L(55, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void onActivityResumedByScionActivityInfo(C7380uG1 c7380uG1, long j) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c7380uG1);
        parcelG.writeLong(j);
        L(56, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void onActivitySaveInstanceStateByScionActivityInfo(C7380uG1 c7380uG1, InterfaceC7377uF1 interfaceC7377uF1, long j) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c7380uG1);
        AbstractC6032nC1.b(parcelG, interfaceC7377uF1);
        parcelG.writeLong(j);
        L(57, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void onActivityStartedByScionActivityInfo(C7380uG1 c7380uG1, long j) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c7380uG1);
        parcelG.writeLong(j);
        L(51, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void onActivityStoppedByScionActivityInfo(C7380uG1 c7380uG1, long j) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c7380uG1);
        parcelG.writeLong(j);
        L(52, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void registerOnMeasurementEventListener(OF1 of1) {
        Parcel parcelG = G();
        AbstractC6032nC1.b(parcelG, of1);
        L(35, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void resetAnalyticsData(long j) {
        Parcel parcelG = G();
        parcelG.writeLong(j);
        L(12, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void retrieveAndUploadBatches(InterfaceC7948xF1 interfaceC7948xF1) {
        Parcel parcelG = G();
        AbstractC6032nC1.b(parcelG, interfaceC7948xF1);
        L(58, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, bundle);
        parcelG.writeLong(j);
        L(8, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, bundle);
        parcelG.writeLong(j);
        L(45, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void setCurrentScreenByScionActivityInfo(C7380uG1 c7380uG1, String str, String str2, long j) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, c7380uG1);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeLong(j);
        L(50, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelG = G();
        ClassLoader classLoader = AbstractC6032nC1.a;
        parcelG.writeInt(z ? 1 : 0);
        L(39, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelG = G();
        AbstractC6032nC1.c(parcelG, bundle);
        L(42, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelG = G();
        ClassLoader classLoader = AbstractC6032nC1.a;
        parcelG.writeInt(z ? 1 : 0);
        parcelG.writeLong(j);
        L(11, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void setSessionTimeoutDuration(long j) {
        Parcel parcelG = G();
        parcelG.writeLong(j);
        L(14, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void setUserId(String str, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        L(7, parcelG);
    }

    @Override // defpackage.InterfaceC2099aF1
    public final void setUserProperty(String str, String str2, InterfaceC3515e50 interfaceC3515e50, boolean z, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC6032nC1.b(parcelG, interfaceC3515e50);
        parcelG.writeInt(z ? 1 : 0);
        parcelG.writeLong(j);
        L(4, parcelG);
    }
}
