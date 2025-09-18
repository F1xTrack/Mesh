package com.yandex.metrica.impl.p022ob;

import android.location.Location;
import android.os.Bundle;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C3802u;
import com.yandex.metrica.C3806y;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Pj */
/* loaded from: classes2.dex */
public class C2861Pj implements InterfaceC3195d1 {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public String mo14792a() {
        return null;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: b */
    public void mo14493b(boolean z) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: c */
    public String mo14798c() {
        return null;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: d */
    public C3611t1 mo14800d() {
        return new C3611t1(new C2736Kj());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    public void setStatisticsSending(boolean z) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    public void setUserProfileID(String str) {
    }

    @Override // com.yandex.metrica.impl.p022ob.ResultReceiverC3454n0.a
    /* renamed from: a */
    public void mo14366a(int i, Bundle bundle) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3066Y0
    /* renamed from: b */
    public InterfaceC3041X0 mo14670b() {
        return new C2811Nj();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: c */
    public void mo14799c(C3802u c3802u) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: a */
    public void mo14483a(Location location) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: c */
    public void mo14385c(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public void mo14793a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public void mo14794a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public void mo14795a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public void mo14797a(YandexMetricaConfig yandexMetricaConfig, C3806y c3806y) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: a */
    public void mo14490a(boolean z) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public InterfaceC3016W0 mo14791a(C3802u c3802u) {
        return new C2786Mj();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public void mo14796a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        iIdentifierCallback.onRequestError(IIdentifierCallback.Reason.UNKNOWN);
    }
}
