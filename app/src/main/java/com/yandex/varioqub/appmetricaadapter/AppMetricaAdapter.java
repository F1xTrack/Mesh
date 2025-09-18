package com.yandex.varioqub.appmetricaadapter;

import android.app.Activity;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.impl.AbstractC3854j;
import com.yandex.varioqub.appmetricaadapter.impl.C3847c;
import com.yandex.varioqub.appmetricaadapter.impl.C3850f;
import com.yandex.varioqub.appmetricaadapter.impl.C3853i;
import com.yandex.varioqub.appmetricaadapter.impl.C3855k;
import com.yandex.varioqub.appmetricaadapter.impl.InterfaceC3848d;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import p000.AbstractC7167xu;
import p000.C1156SN;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m22267d2 = {"Lcom/yandex/varioqub/appmetricaadapter/AppMetricaAdapter;", "Lcom/yandex/varioqub/analyticadapter/VarioqubConfigAdapter;", "Companion", "appmetrica-adapter_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class AppMetricaAdapter implements VarioqubConfigAdapter {

    /* renamed from: a */
    public final Activity f25556a;

    /* renamed from: b */
    public final InterfaceC3848d f25557b;

    /* renamed from: c */
    public String f25558c;

    /* renamed from: d */
    public Set f25559d;

    /* renamed from: e */
    public final String f25560e;

    @Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m22267d2 = {"Lcom/yandex/varioqub/appmetricaadapter/AppMetricaAdapter$Companion;", "", "", "CONFIG_CHANGED_EVENT_NAME", "Ljava/lang/String;", "VARIOQUB_EXTRAS_KEY", "appmetrica-adapter_release"}, m22268k = 1, m22269mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public AppMetricaAdapter(Activity activity) {
        Class<?> cls;
        InterfaceC3848d c3853i;
        this.f25556a = activity;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("io.appmetrica.analytics.AppMetrica", false, AbstractC3854j.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            c3853i = new C3847c();
        } else {
            try {
                cls2 = Class.forName("com.yandex.metrica.YandexMetrica", false, AbstractC3854j.class.getClassLoader());
            } catch (Throwable unused2) {
            }
            c3853i = cls2 != null ? new C3853i() : new C3850f();
        }
        this.f25557b = c3853i;
        this.f25558c = "";
        this.f25559d = C1156SN.f10705a;
        this.f25560e = "AppMetricaAdapter";
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    /* renamed from: getAdapterName, reason: from getter */
    public final String getF25560e() {
        return this.f25560e;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void reportConfigChanged(ConfigData configData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", Long.valueOf(configData.getConfigLoadTimestamp()));
        this.f25557b.mo17382c(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestDeviceId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f25557b.mo17381b(this.f25556a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestUserId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f25557b.mo17379a(this.f25556a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setExperiments(String str) {
        this.f25558c = str;
        Objects.toString(this.f25559d);
        C3855k c3855k = new C3855k();
        c3855k.f25565o = this.f25558c;
        c3855k.f25566p = AbstractC7167xu.m25983c0(this.f25559d);
        this.f25557b.mo17380a(MessageNano.toByteArray(c3855k));
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setTriggeredTestIds(Set set) {
        Objects.toString(set);
        Set setM25987g0 = AbstractC7167xu.m25987g0(set);
        this.f25559d = setM25987g0;
        Objects.toString(setM25987g0);
        C3855k c3855k = new C3855k();
        c3855k.f25565o = this.f25558c;
        c3855k.f25566p = AbstractC7167xu.m25983c0(this.f25559d);
        this.f25557b.mo17380a(MessageNano.toByteArray(c3855k));
    }
}
