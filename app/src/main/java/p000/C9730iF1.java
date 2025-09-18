package p000;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: iF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9730iF1 extends AbstractC10714px1 implements InterfaceC8701aF1 {
    @Override // p000.InterfaceC8701aF1
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        parcelM23898G.writeLong(j);
        m23903L(23, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        parcelM23898G.writeString(str2);
        AbstractC10364nC1.m23102c(parcelM23898G, bundle);
        m23903L(9, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void clearMeasurementEnabled(long j) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeLong(j);
        m23903L(43, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        parcelM23898G.writeLong(j);
        m23903L(24, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void generateEventId(InterfaceC11266uF1 interfaceC11266uF1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11266uF1);
        m23903L(22, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void getAppInstanceId(InterfaceC11266uF1 interfaceC11266uF1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11266uF1);
        m23903L(20, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void getCachedAppInstanceId(InterfaceC11266uF1 interfaceC11266uF1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11266uF1);
        m23903L(19, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void getConditionalUserProperties(String str, String str2, InterfaceC11266uF1 interfaceC11266uF1) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        parcelM23898G.writeString(str2);
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11266uF1);
        m23903L(10, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void getCurrentScreenClass(InterfaceC11266uF1 interfaceC11266uF1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11266uF1);
        m23903L(17, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void getCurrentScreenName(InterfaceC11266uF1 interfaceC11266uF1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11266uF1);
        m23903L(16, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void getGmpAppId(InterfaceC11266uF1 interfaceC11266uF1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11266uF1);
        m23903L(21, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void getMaxUserProperties(String str, InterfaceC11266uF1 interfaceC11266uF1) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11266uF1);
        m23903L(6, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void getSessionId(InterfaceC11266uF1 interfaceC11266uF1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11266uF1);
        m23903L(46, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC11266uF1 interfaceC11266uF1) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        parcelM23898G.writeString(str2);
        ClassLoader classLoader = AbstractC10364nC1.f38178a;
        parcelM23898G.writeInt(z ? 1 : 0);
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11266uF1);
        m23903L(5, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void initialize(InterfaceC9197e50 interfaceC9197e50, C9092dG1 c9092dG1, long j) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC9197e50);
        AbstractC10364nC1.m23102c(parcelM23898G, c9092dG1);
        parcelM23898G.writeLong(j);
        m23903L(1, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        parcelM23898G.writeString(str2);
        AbstractC10364nC1.m23102c(parcelM23898G, bundle);
        parcelM23898G.writeInt(z ? 1 : 0);
        parcelM23898G.writeInt(1);
        parcelM23898G.writeLong(j);
        m23903L(2, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void logHealthData(int i, String str, InterfaceC9197e50 interfaceC9197e50, InterfaceC9197e50 interfaceC9197e502, InterfaceC9197e50 interfaceC9197e503) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeInt(5);
        parcelM23898G.writeString(str);
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC9197e50);
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC9197e502);
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC9197e503);
        m23903L(33, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void onActivityCreatedByScionActivityInfo(C11268uG1 c11268uG1, Bundle bundle, long j) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c11268uG1);
        AbstractC10364nC1.m23102c(parcelM23898G, bundle);
        parcelM23898G.writeLong(j);
        m23903L(53, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void onActivityDestroyedByScionActivityInfo(C11268uG1 c11268uG1, long j) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c11268uG1);
        parcelM23898G.writeLong(j);
        m23903L(54, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void onActivityPausedByScionActivityInfo(C11268uG1 c11268uG1, long j) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c11268uG1);
        parcelM23898G.writeLong(j);
        m23903L(55, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void onActivityResumedByScionActivityInfo(C11268uG1 c11268uG1, long j) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c11268uG1);
        parcelM23898G.writeLong(j);
        m23903L(56, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void onActivitySaveInstanceStateByScionActivityInfo(C11268uG1 c11268uG1, InterfaceC11266uF1 interfaceC11266uF1, long j) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c11268uG1);
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11266uF1);
        parcelM23898G.writeLong(j);
        m23903L(57, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void onActivityStartedByScionActivityInfo(C11268uG1 c11268uG1, long j) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c11268uG1);
        parcelM23898G.writeLong(j);
        m23903L(51, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void onActivityStoppedByScionActivityInfo(C11268uG1 c11268uG1, long j) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c11268uG1);
        parcelM23898G.writeLong(j);
        m23903L(52, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void registerOnMeasurementEventListener(OF1 of1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23101b(parcelM23898G, of1);
        m23903L(35, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void resetAnalyticsData(long j) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeLong(j);
        m23903L(12, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void retrieveAndUploadBatches(InterfaceC11648xF1 interfaceC11648xF1) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC11648xF1);
        m23903L(58, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, bundle);
        parcelM23898G.writeLong(j);
        m23903L(8, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, bundle);
        parcelM23898G.writeLong(j);
        m23903L(45, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void setCurrentScreenByScionActivityInfo(C11268uG1 c11268uG1, String str, String str2, long j) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, c11268uG1);
        parcelM23898G.writeString(str);
        parcelM23898G.writeString(str2);
        parcelM23898G.writeLong(j);
        m23903L(50, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelM23898G = m23898G();
        ClassLoader classLoader = AbstractC10364nC1.f38178a;
        parcelM23898G.writeInt(z ? 1 : 0);
        m23903L(39, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelM23898G = m23898G();
        AbstractC10364nC1.m23102c(parcelM23898G, bundle);
        m23903L(42, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelM23898G = m23898G();
        ClassLoader classLoader = AbstractC10364nC1.f38178a;
        parcelM23898G.writeInt(z ? 1 : 0);
        parcelM23898G.writeLong(j);
        m23903L(11, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void setSessionTimeoutDuration(long j) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeLong(j);
        m23903L(14, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void setUserId(String str, long j) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        parcelM23898G.writeLong(j);
        m23903L(7, parcelM23898G);
    }

    @Override // p000.InterfaceC8701aF1
    public final void setUserProperty(String str, String str2, InterfaceC9197e50 interfaceC9197e50, boolean z, long j) {
        Parcel parcelM23898G = m23898G();
        parcelM23898G.writeString(str);
        parcelM23898G.writeString(str2);
        AbstractC10364nC1.m23101b(parcelM23898G, interfaceC9197e50);
        parcelM23898G.writeInt(z ? 1 : 0);
        parcelM23898G.writeLong(j);
        m23903L(4, parcelM23898G);
    }
}
