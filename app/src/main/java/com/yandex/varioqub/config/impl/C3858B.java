package com.yandex.varioqub.config.impl;

import android.content.Context;
import android.content.res.XmlResourceParser;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.VarioqubApi;
import com.yandex.varioqub.config.VarioqubSettings;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import p000.AbstractC0246Du;
import p000.AbstractC11153tN0;
import p000.AbstractC7167xu;
import p000.AbstractC7293zu;
import p000.InterfaceC6434mZ;
import p000.O90;
import p000.RunnableC0383G4;
import p000.RunnableC6694qf;
import p000.RunnableC6720r4;
import p000.RunnableC8339Ts1;

/* renamed from: com.yandex.varioqub.config.impl.B */
/* loaded from: classes2.dex */
public final class C3858B implements VarioqubApi {

    /* renamed from: a */
    public C3861a f25583a;

    /* renamed from: b */
    public C3863c f25584b;

    /* renamed from: c */
    public C3880t f25585c;

    /* renamed from: d */
    public Executor f25586d;

    /* renamed from: e */
    public C3867g f25587e;

    /* renamed from: f */
    public VarioqubSettings f25588f;

    /* renamed from: g */
    public final AtomicBoolean f25589g = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0220  */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m17385a(com.yandex.varioqub.config.impl.C3858B r16, com.yandex.varioqub.config.OnFetchCompleteListener r17) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.varioqub.config.impl.C3858B.m17385a(com.yandex.varioqub.config.impl.B, com.yandex.varioqub.config.OnFetchCompleteListener):void");
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void activateConfig(InterfaceC6434mZ interfaceC6434mZ) throws JSONException {
        m17388a();
        C3863c c3863c = this.f25584b;
        if (c3863c == null) {
            O90.m5977o("configFetcher");
            throw null;
        }
        c3863c.m17395a();
        C3861a c3861a = c3863c.f25601d;
        String str = c3863c.f25608k;
        long j = c3863c.f25604g;
        if (!O90.m5963a(c3861a.f25596e, str) && c3861a.f25593b.getActivateEvent()) {
            c3861a.f25592a.reportConfigChanged(new ConfigData(c3861a.f25596e, str, j));
            AbstractC3873m.m17402a(str);
        }
        c3861a.f25596e = str;
        if (c3863c.f25610m) {
            C3861a c3861a2 = c3863c.f25601d;
            Collection collectionValues = c3863c.f25605h.values();
            c3861a2.getClass();
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(collectionValues));
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((ConfigValue) it.next()).getTestId()));
            }
            Set<Long> setM25986f0 = AbstractC7167xu.m25986f0(AbstractC7167xu.m25959E(AbstractC7167xu.m25987g0(arrayList), c3861a2.f25594c));
            c3861a2.f25594c = setM25986f0;
            c3861a2.f25592a.setTriggeredTestIds(setM25986f0);
            AbstractC3873m.m17404a(c3861a2.f25594c);
            C3861a c3861a3 = c3863c.f25601d;
            String str2 = c3863c.f25607j;
            c3861a3.f25595d = str2;
            c3861a3.f25592a.setExperiments(str2);
            c3863c.f25610m = false;
        }
        C3880t c3880t = c3863c.f25600c;
        HashMap map = new HashMap(c3863c.f25605h);
        c3880t.m17418a();
        c3880t.f25659b = map;
        AbstractC3873m.m17403a(map);
        if (interfaceC6434mZ != null) {
            interfaceC6434mZ.invoke();
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void clearClientFeatures() {
        Executor executor = this.f25586d;
        if (executor != null) {
            executor.execute(new RunnableC0383G4(5, this));
        } else {
            O90.m5977o("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void fetchConfig(OnFetchCompleteListener onFetchCompleteListener) {
        m17388a();
        Executor executor = this.f25586d;
        if (executor != null) {
            executor.execute(new RunnableC6720r4(this, 10, onFetchCompleteListener));
        } else {
            O90.m5977o("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final Set getAllKeys() throws JSONException {
        m17388a();
        C3880t c3880t = this.f25585c;
        if (c3880t == null) {
            O90.m5977o("storage");
            throw null;
        }
        c3880t.m17418a();
        Set setKeySet = c3880t.f25659b.keySet();
        Set setKeySet2 = c3880t.f25658a.keySet();
        O90.m5968f(setKeySet, "<this>");
        O90.m5968f(setKeySet2, "other");
        Set setM25986f0 = AbstractC7167xu.m25986f0(setKeySet);
        AbstractC0246Du.m1920m(setM25986f0, setKeySet2);
        return AbstractC7167xu.m25987g0(setM25986f0);
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final boolean getBoolean(String str, boolean z) throws JSONException {
        ConfigValue value = getValue(str);
        return value != null ? value.asBoolean() : z;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final double getDouble(String str, double d) throws JSONException {
        ConfigValue value = getValue(str);
        return value != null ? value.asDouble() : d;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final String getId() throws JSONException {
        m17388a();
        C3863c c3863c = this.f25584b;
        if (c3863c != null) {
            c3863c.m17395a();
            return c3863c.f25606i;
        }
        O90.m5977o("configFetcher");
        throw null;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final long getLong(String str, long j) throws JSONException {
        ConfigValue value = getValue(str);
        return value != null ? value.asLong() : j;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final String getString(String str, String str2) throws JSONException {
        String strAsString;
        ConfigValue value = getValue(str);
        return (value == null || (strAsString = value.asString()) == null) ? str2 : strAsString;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final ConfigValue getValue(String str) throws JSONException {
        m17388a();
        C3880t c3880t = this.f25585c;
        if (c3880t == null) {
            O90.m5977o("storage");
            throw null;
        }
        c3880t.m17418a();
        ConfigValue configValue = (ConfigValue) c3880t.f25659b.get(str);
        if (configValue == null) {
            c3880t.m17418a();
            configValue = (ConfigValue) c3880t.f25658a.get(str);
        }
        if (configValue == null || configValue.getTestId() <= 0) {
            return configValue;
        }
        C3861a c3861a = this.f25583a;
        if (c3861a == null) {
            O90.m5977o("analyticAdapter");
            throw null;
        }
        long testId = configValue.getTestId();
        synchronized (c3861a.f25597f) {
            c3861a.f25594c.add(Long.valueOf(testId));
        }
        c3861a.f25592a.setTriggeredTestIds(c3861a.f25594c);
        AbstractC3873m.m17404a(c3861a.f25594c);
        if (configValue.getValue() != null) {
            return configValue;
        }
        C3880t c3880t2 = this.f25585c;
        if (c3880t2 != null) {
            c3880t2.m17418a();
            return (ConfigValue) c3880t2.f25658a.get(str);
        }
        O90.m5977o("storage");
        throw null;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void init(VarioqubSettings varioqubSettings, VarioqubConfigAdapter varioqubConfigAdapter, Context context) {
        if (this.f25589g.get()) {
            return;
        }
        synchronized (this) {
            if (!this.f25589g.get()) {
                AbstractC3872l.m17399b(2);
                C3861a c3861a = new C3861a(varioqubConfigAdapter, varioqubSettings);
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                C3880t c3880t = new C3880t();
                m17389a(varioqubSettings, c3861a, executorServiceNewSingleThreadExecutor, context, c3880t, new C3863c(new C3869i(), TimeUnit.SECONDS.toMillis(varioqubSettings.getFetchThrottleIntervalSec()), c3880t, c3861a, new C3881u()), new C3867g(c3861a));
                AbstractC3872l.m17398a(2);
            }
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void putClientFeature(String str, String str2) {
        Executor executor = this.f25586d;
        if (executor != null) {
            executor.execute(new RunnableC8339Ts1(this, str, str2, 4));
        } else {
            O90.m5977o("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(Map map) {
        m17388a();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(entry.getKey(), ConfigValue.INSTANCE.createInappDefault$config_release(entry.getValue().toString()));
        }
        C3880t c3880t = this.f25585c;
        if (c3880t == null) {
            O90.m5977o("storage");
            throw null;
        }
        c3880t.f25658a = map2;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(int i, InterfaceC6434mZ interfaceC6434mZ) {
        m17388a();
        Executor executor = this.f25586d;
        if (executor != null) {
            executor.execute(new RunnableC6694qf(this, i, interfaceC6434mZ, 0));
        } else {
            O90.m5977o("executor");
            throw null;
        }
    }

    /* renamed from: a */
    public static final void m17384a(C3858B c3858b, int i, InterfaceC6434mZ interfaceC6434mZ) {
        C3880t c3880t = c3858b.f25585c;
        if (c3880t == null) {
            O90.m5977o("storage");
            throw null;
        }
        if (i != -1) {
            Context context = AbstractC3864d.f25611a;
            if (context != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (context.getResources() != null) {
                    XmlResourceParser xml = context.getResources().getXml(i);
                    String text = "";
                    String name = text;
                    String text2 = name;
                    while (xml.next() != 1) {
                        int eventType = xml.getEventType();
                        if (eventType == 2) {
                            name = xml.getName();
                        } else if (eventType == 3) {
                            if (O90.m5963a(xml.getName(), "entry") && text.length() > 0 && text2.length() > 0) {
                                linkedHashMap.put(text, ConfigValue.INSTANCE.createInappDefault$config_release(text2));
                            }
                            name = "";
                        } else if (eventType == 4) {
                            if (O90.m5963a(name, "key")) {
                                text = xml.getText();
                            } else if (O90.m5963a(name, "value")) {
                                text2 = xml.getText();
                            }
                        }
                    }
                }
                c3880t.f25658a = linkedHashMap;
                if (interfaceC6434mZ != null) {
                    interfaceC6434mZ.invoke();
                    return;
                }
                return;
            }
            O90.m5977o("appContext");
            throw null;
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Invalid resId: "));
    }

    /* renamed from: a */
    public static final void m17386a(C3858B c3858b, String str, String str2) {
        VarioqubSettings varioqubSettings = c3858b.f25588f;
        if (varioqubSettings != null) {
            varioqubSettings.putClientFeature$config_release(str, str2);
        } else {
            O90.m5977o("settings");
            throw null;
        }
    }

    /* renamed from: a */
    public static final void m17383a(C3858B c3858b) {
        VarioqubSettings varioqubSettings = c3858b.f25588f;
        if (varioqubSettings != null) {
            varioqubSettings.clearClientFeatures$config_release();
        } else {
            O90.m5977o("settings");
            throw null;
        }
    }

    /* renamed from: a */
    public final void m17388a() {
        if (!this.f25589g.get()) {
            throw new IllegalStateException("VarioqubConfig is not inited. Please call init() method first");
        }
    }

    /* renamed from: a */
    public final void m17389a(VarioqubSettings varioqubSettings, C3861a c3861a, ExecutorService executorService, Context context, C3880t c3880t, C3863c c3863c, C3867g c3867g) {
        this.f25588f = varioqubSettings;
        this.f25583a = c3861a;
        this.f25585c = c3880t;
        this.f25584b = c3863c;
        this.f25586d = executorService;
        this.f25587e = c3867g;
        AbstractC3864d.f25611a = context.getApplicationContext();
        AbstractC3860D.f25591a = varioqubSettings.getUrl();
        AbstractC3859C.f25590a = varioqubSettings.getLogs();
        String string = AbstractC3873m.m17400a().getString("experiments", "");
        if (string == null) {
            string = "";
        }
        c3861a.f25595d = string;
        c3861a.f25594c = AbstractC3873m.m17406b();
        String string2 = AbstractC3873m.m17400a().getString("config_version", "");
        c3861a.f25596e = string2 != null ? string2 : "";
        c3861a.f25592a.setExperiments(c3861a.f25595d);
        c3861a.f25592a.setTriggeredTestIds(c3861a.f25594c);
        this.f25589g.set(true);
        executorService.execute(new RunnableC0383G4(4, c3867g));
    }

    /* renamed from: a */
    public static final void m17387a(C3867g c3867g) {
        c3867g.getClass();
        AbstractC3872l.m17399b(3);
        C3861a c3861a = c3867g.f25614a;
        c3861a.f25592a.requestDeviceId(new C3865e(c3867g));
        C3861a c3861a2 = c3867g.f25614a;
        c3861a2.f25592a.requestUserId(new C3866f(c3867g));
    }
}
