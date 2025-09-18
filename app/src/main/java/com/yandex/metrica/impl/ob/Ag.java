package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IReporter;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

/* loaded from: classes2.dex */
public class Ag implements IReporter {
    static final uo<String> b = new ro(new po("Event name"));
    static final uo<String> c = new ro(new po("Error message"));
    static final uo<String> d = new ro(new po("Error identifier"));
    static final uo<Throwable> e = new ro(new qo("Unhandled exception"));
    static final uo<UserProfile> f = new ro(new qo("User profile"));
    static final uo<Revenue> g = new ro(new qo("Revenue"));
    static final uo<ECommerceEvent> h = new ro(new qo("ECommerceEvent"));
    private final C3259zg a;

    public Ag() {
        this(new C3259zg());
    }

    public C3259zg a() {
        return this.a;
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this.a;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        ((ro) h).a(eCommerceEvent);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) throws ValidationException {
        ((ro) c).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) throws ValidationException {
        ((ro) b).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) throws ValidationException {
        ((ro) g).a(revenue);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) throws ValidationException {
        ((ro) e).a(th);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) throws ValidationException {
        ((ro) f).a(userProfile);
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

    public Ag(C3259zg c3259zg) {
        this.a = c3259zg;
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        ((ro) d).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) throws ValidationException {
        ((ro) b).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        ((ro) d).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) throws ValidationException {
        ((ro) b).a(str);
    }
}
