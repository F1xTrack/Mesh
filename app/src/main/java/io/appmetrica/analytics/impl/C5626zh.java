package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.zh */
/* loaded from: classes2.dex */
public class C5626zh implements InterfaceC4707Oa {

    /* renamed from: a */
    public final C5148ge f32934a = new C5148ge();

    @Override // io.appmetrica.analytics.impl.InterfaceC4707Oa, io.appmetrica.analytics.impl.InterfaceC4778Ra
    /* renamed from: a */
    public final void mo19683a(C4671Mm c4671Mm) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.f32934a;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
    }

    public void reportEvent(ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4707Oa, io.appmetrica.analytics.impl.InterfaceC4778Ra
    /* renamed from: a */
    public final void mo19684a(C4815T c4815t) {
    }

    public void reportAdRevenue(AdRevenue adRevenue, boolean z) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
    }
}
