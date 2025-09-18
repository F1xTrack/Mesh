package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Mj */
/* loaded from: classes2.dex */
class C2786Mj implements InterfaceC3016W0 {

    /* renamed from: a */
    private final C2761Lj f21752a = new C2761Lj();

    /* renamed from: a */
    public void mo14375a(C3227e7 c3227e7) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0
    /* renamed from: b */
    public void mo14381b() {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0, com.yandex.metrica.InterfaceC3800s
    /* renamed from: d */
    public void mo13935d(String str, String str2) {
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this.f21752a;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) {
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
    }

    /* renamed from: a */
    public void mo14377a(C3513p7 c3513p7) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0, com.yandex.metrica.InterfaceC3800s
    /* renamed from: b */
    public void mo13934b(String str, String str2) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0
    /* renamed from: a */
    public void mo14379a(String str, JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) {
    }
}
