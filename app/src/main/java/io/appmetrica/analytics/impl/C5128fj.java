package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fj */
/* loaded from: classes2.dex */
public final class C5128fj implements InterfaceC4707Oa, IPluginReporter {

    /* renamed from: a */
    public final ArrayList f31692a = new ArrayList();

    /* renamed from: b */
    public volatile C5601yh f31693b;

    @Override // io.appmetrica.analytics.impl.InterfaceC4707Oa, io.appmetrica.analytics.impl.InterfaceC4778Ra
    /* renamed from: a */
    public final void mo19683a(C4671Mm c4671Mm) {
        m20394a(new C4763Qi(c4671Mm));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        m20394a(new C4978Zi());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        m20394a(new C4595Ji());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        m20394a(new C4954Yi(str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        m20394a(new C4739Pi(adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        m20394a(new C4691Ni(eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        m20394a(new C5103ej(str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        m20394a(new C5028bj(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        m20394a(new C4667Mi(revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        m20394a(new C4547Hi(th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        m20394a(new C4643Li(userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        m20394a(new C4571Ii());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        m20394a(new C5003aj());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        m20394a(new C4715Oi(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        m20394a(new C4882Vi(str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        m20394a(new C4619Ki(str));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4707Oa, io.appmetrica.analytics.impl.InterfaceC4778Ra
    /* renamed from: a */
    public final void mo19684a(C4815T c4815t) {
        m20394a(new C4930Xi(c4815t));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        m20394a(new C4906Wi(adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        m20394a(new C4523Gi(str, str2, null));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        m20394a(new C5053cj(str, str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        m20394a(new C4786Ri(pluginErrorDetails));
    }

    /* renamed from: a */
    public final synchronized void m20394a(InterfaceC4683Na interfaceC4683Na) {
        try {
            if (this.f31693b == null) {
                this.f31692a.add(interfaceC4683Na);
            } else {
                interfaceC4683Na.mo19451a(this.f31693b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        m20394a(new C4523Gi(str, str2, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        m20394a(new C5078dj(str, map));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        m20394a(new C4810Si(pluginErrorDetails, str));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        m20394a(new C4858Ui(moduleEvent));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        m20394a(new C4834Ti(str, str2, pluginErrorDetails));
    }
}
