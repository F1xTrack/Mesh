package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.IReporter;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ag */
/* loaded from: classes2.dex */
public class C2483Ag implements IReporter {

    /* renamed from: b */
    static final InterfaceC3660uo<String> f20858b = new C3582ro(new C3530po("Event name"));

    /* renamed from: c */
    static final InterfaceC3660uo<String> f20859c = new C3582ro(new C3530po("Error message"));

    /* renamed from: d */
    static final InterfaceC3660uo<String> f20860d = new C3582ro(new C3530po("Error identifier"));

    /* renamed from: e */
    static final InterfaceC3660uo<Throwable> f20861e = new C3582ro(new C3556qo("Unhandled exception"));

    /* renamed from: f */
    static final InterfaceC3660uo<UserProfile> f20862f = new C3582ro(new C3556qo("User profile"));

    /* renamed from: g */
    static final InterfaceC3660uo<Revenue> f20863g = new C3582ro(new C3556qo("Revenue"));

    /* renamed from: h */
    static final InterfaceC3660uo<ECommerceEvent> f20864h = new C3582ro(new C3556qo("ECommerceEvent"));

    /* renamed from: a */
    private final C3782zg f20865a;

    public C2483Ag() {
        this(new C3782zg());
    }

    /* renamed from: a */
    public C3782zg m13862a() {
        return this.f20865a;
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this.f20865a;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        ((C3582ro) f20864h).mo14391a(eCommerceEvent);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) throws ValidationException {
        ((C3582ro) f20859c).mo14391a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) throws ValidationException {
        ((C3582ro) f20858b).mo14391a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) throws ValidationException {
        ((C3582ro) f20863g).mo14391a(revenue);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) throws ValidationException {
        ((C3582ro) f20861e).mo14391a(th);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) throws ValidationException {
        ((C3582ro) f20862f).mo14391a(userProfile);
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
    }

    public C2483Ag(C3782zg c3782zg) {
        this.f20865a = c3782zg;
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        ((C3582ro) f20860d).mo14391a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) throws ValidationException {
        ((C3582ro) f20858b).mo14391a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        ((C3582ro) f20860d).mo14391a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) throws ValidationException {
        ((C3582ro) f20858b).mo14391a(str);
    }
}
