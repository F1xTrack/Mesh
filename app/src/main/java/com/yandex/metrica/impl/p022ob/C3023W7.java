package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p021ac.NativeCrashesHelper;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.W7 */
/* loaded from: classes2.dex */
public class C3023W7 implements InterfaceC2923S7 {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: a */
    public String mo15107a() {
        return "YandexMetricaNativeCrashes";
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: b */
    public void mo15111b() {
        NativeCrashesHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: c */
    public String mo15112c() {
        return "YandexMetricaNativeModule";
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: a */
    public void mo15108a(String str) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: a */
    public void mo15109a(String str, String str2, String str3) {
        NativeCrashesHelper.setUpNativeUncaughtExceptionHandler(str2);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: a */
    public void mo15110a(boolean z) {
        NativeCrashesHelper.logsEnabled(z);
    }
}
