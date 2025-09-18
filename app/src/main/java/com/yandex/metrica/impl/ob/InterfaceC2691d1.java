package com.yandex.metrica.impl.ob;

import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.ob.ResultReceiverC2939n0;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2691d1 extends InterfaceC3169w1, ResultReceiverC2939n0.a, Y0 {
    W0 a(com.yandex.metrica.u uVar);

    String a();

    void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener);

    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    void a(IIdentifierCallback iIdentifierCallback, List<String> list);

    void a(YandexMetricaConfig yandexMetricaConfig, com.yandex.metrica.y yVar);

    String c();

    void c(com.yandex.metrica.u uVar);

    C3089t1 d();
}
