package com.yandex.varioqub.config.impl;

import android.content.Context;
import android.content.res.XmlResourceParser;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.VarioqubApi;
import com.yandex.varioqub.config.VarioqubSettings;
import com.yandex.varioqub.config.model.ConfigValue;
import defpackage.AbstractC0314Du;
import defpackage.AbstractC7209tN0;
import defpackage.AbstractC8069xu;
import defpackage.AbstractC8449zu;
import defpackage.G4;
import defpackage.InterfaceC5908mZ;
import defpackage.O90;
import defpackage.RunnableC1557Ts1;
import defpackage.RunnableC6690qf;
import defpackage.RunnableC6769r4;
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

/* loaded from: classes2.dex */
public final class B implements VarioqubApi {
    public C3267a a;
    public C3269c b;
    public t c;
    public Executor d;
    public g e;
    public VarioqubSettings f;
    public final AtomicBoolean g = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0220  */
    /* JADX WARN: Type inference failed for: r6v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.yandex.varioqub.config.impl.B r16, com.yandex.varioqub.config.OnFetchCompleteListener r17) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.varioqub.config.impl.B.a(com.yandex.varioqub.config.impl.B, com.yandex.varioqub.config.OnFetchCompleteListener):void");
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void activateConfig(InterfaceC5908mZ interfaceC5908mZ) throws JSONException {
        a();
        C3269c c3269c = this.b;
        if (c3269c == null) {
            O90.o("configFetcher");
            throw null;
        }
        c3269c.a();
        C3267a c3267a = c3269c.d;
        String str = c3269c.k;
        long j = c3269c.g;
        if (!O90.a(c3267a.e, str) && c3267a.b.getActivateEvent()) {
            c3267a.a.reportConfigChanged(new ConfigData(c3267a.e, str, j));
            m.a(str);
        }
        c3267a.e = str;
        if (c3269c.m) {
            C3267a c3267a2 = c3269c.d;
            Collection collectionValues = c3269c.h.values();
            c3267a2.getClass();
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(collectionValues));
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((ConfigValue) it.next()).getTestId()));
            }
            Set<Long> setF0 = AbstractC8069xu.f0(AbstractC8069xu.E(AbstractC8069xu.g0(arrayList), c3267a2.c));
            c3267a2.c = setF0;
            c3267a2.a.setTriggeredTestIds(setF0);
            m.a(c3267a2.c);
            C3267a c3267a3 = c3269c.d;
            String str2 = c3269c.j;
            c3267a3.d = str2;
            c3267a3.a.setExperiments(str2);
            c3269c.m = false;
        }
        t tVar = c3269c.c;
        HashMap map = new HashMap(c3269c.h);
        tVar.a();
        tVar.b = map;
        m.a(map);
        if (interfaceC5908mZ != null) {
            interfaceC5908mZ.invoke();
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void clearClientFeatures() {
        Executor executor = this.d;
        if (executor != null) {
            executor.execute(new G4(5, this));
        } else {
            O90.o("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void fetchConfig(OnFetchCompleteListener onFetchCompleteListener) {
        a();
        Executor executor = this.d;
        if (executor != null) {
            executor.execute(new RunnableC6769r4(this, 10, onFetchCompleteListener));
        } else {
            O90.o("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final Set getAllKeys() throws JSONException {
        a();
        t tVar = this.c;
        if (tVar == null) {
            O90.o("storage");
            throw null;
        }
        tVar.a();
        Set setKeySet = tVar.b.keySet();
        Set setKeySet2 = tVar.a.keySet();
        O90.f(setKeySet, "<this>");
        O90.f(setKeySet2, "other");
        Set setF0 = AbstractC8069xu.f0(setKeySet);
        AbstractC0314Du.m(setF0, setKeySet2);
        return AbstractC8069xu.g0(setF0);
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
        a();
        C3269c c3269c = this.b;
        if (c3269c != null) {
            c3269c.a();
            return c3269c.i;
        }
        O90.o("configFetcher");
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
        a();
        t tVar = this.c;
        if (tVar == null) {
            O90.o("storage");
            throw null;
        }
        tVar.a();
        ConfigValue configValue = (ConfigValue) tVar.b.get(str);
        if (configValue == null) {
            tVar.a();
            configValue = (ConfigValue) tVar.a.get(str);
        }
        if (configValue == null || configValue.getTestId() <= 0) {
            return configValue;
        }
        C3267a c3267a = this.a;
        if (c3267a == null) {
            O90.o("analyticAdapter");
            throw null;
        }
        long testId = configValue.getTestId();
        synchronized (c3267a.f) {
            c3267a.c.add(Long.valueOf(testId));
        }
        c3267a.a.setTriggeredTestIds(c3267a.c);
        m.a(c3267a.c);
        if (configValue.getValue() != null) {
            return configValue;
        }
        t tVar2 = this.c;
        if (tVar2 != null) {
            tVar2.a();
            return (ConfigValue) tVar2.a.get(str);
        }
        O90.o("storage");
        throw null;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void init(VarioqubSettings varioqubSettings, VarioqubConfigAdapter varioqubConfigAdapter, Context context) {
        if (this.g.get()) {
            return;
        }
        synchronized (this) {
            if (!this.g.get()) {
                l.b(2);
                C3267a c3267a = new C3267a(varioqubConfigAdapter, varioqubSettings);
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                t tVar = new t();
                a(varioqubSettings, c3267a, executorServiceNewSingleThreadExecutor, context, tVar, new C3269c(new i(), TimeUnit.SECONDS.toMillis(varioqubSettings.getFetchThrottleIntervalSec()), tVar, c3267a, new u()), new g(c3267a));
                l.a(2);
            }
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void putClientFeature(String str, String str2) {
        Executor executor = this.d;
        if (executor != null) {
            executor.execute(new RunnableC1557Ts1(this, str, str2, 4));
        } else {
            O90.o("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(Map map) {
        a();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(entry.getKey(), ConfigValue.INSTANCE.createInappDefault$config_release(entry.getValue().toString()));
        }
        t tVar = this.c;
        if (tVar == null) {
            O90.o("storage");
            throw null;
        }
        tVar.a = map2;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(int i, InterfaceC5908mZ interfaceC5908mZ) {
        a();
        Executor executor = this.d;
        if (executor != null) {
            executor.execute(new RunnableC6690qf(this, i, interfaceC5908mZ, 0));
        } else {
            O90.o("executor");
            throw null;
        }
    }

    public static final void a(B b, int i, InterfaceC5908mZ interfaceC5908mZ) {
        t tVar = b.c;
        if (tVar == null) {
            O90.o("storage");
            throw null;
        }
        if (i != -1) {
            Context context = AbstractC3270d.a;
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
                            if (O90.a(xml.getName(), "entry") && text.length() > 0 && text2.length() > 0) {
                                linkedHashMap.put(text, ConfigValue.INSTANCE.createInappDefault$config_release(text2));
                            }
                            name = "";
                        } else if (eventType == 4) {
                            if (O90.a(name, "key")) {
                                text = xml.getText();
                            } else if (O90.a(name, "value")) {
                                text2 = xml.getText();
                            }
                        }
                    }
                }
                tVar.a = linkedHashMap;
                if (interfaceC5908mZ != null) {
                    interfaceC5908mZ.invoke();
                    return;
                }
                return;
            }
            O90.o("appContext");
            throw null;
        }
        throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Invalid resId: "));
    }

    public static final void a(B b, String str, String str2) {
        VarioqubSettings varioqubSettings = b.f;
        if (varioqubSettings != null) {
            varioqubSettings.putClientFeature$config_release(str, str2);
        } else {
            O90.o("settings");
            throw null;
        }
    }

    public static final void a(B b) {
        VarioqubSettings varioqubSettings = b.f;
        if (varioqubSettings != null) {
            varioqubSettings.clearClientFeatures$config_release();
        } else {
            O90.o("settings");
            throw null;
        }
    }

    public final void a() {
        if (!this.g.get()) {
            throw new IllegalStateException("VarioqubConfig is not inited. Please call init() method first");
        }
    }

    public final void a(VarioqubSettings varioqubSettings, C3267a c3267a, ExecutorService executorService, Context context, t tVar, C3269c c3269c, g gVar) {
        this.f = varioqubSettings;
        this.a = c3267a;
        this.c = tVar;
        this.b = c3269c;
        this.d = executorService;
        this.e = gVar;
        AbstractC3270d.a = context.getApplicationContext();
        D.a = varioqubSettings.getUrl();
        C.a = varioqubSettings.getLogs();
        String string = m.a().getString("experiments", "");
        if (string == null) {
            string = "";
        }
        c3267a.d = string;
        c3267a.c = m.b();
        String string2 = m.a().getString("config_version", "");
        c3267a.e = string2 != null ? string2 : "";
        c3267a.a.setExperiments(c3267a.d);
        c3267a.a.setTriggeredTestIds(c3267a.c);
        this.g.set(true);
        executorService.execute(new G4(4, gVar));
    }

    public static final void a(g gVar) {
        gVar.getClass();
        l.b(3);
        C3267a c3267a = gVar.a;
        c3267a.a.requestDeviceId(new e(gVar));
        C3267a c3267a2 = gVar.a;
        c3267a2.a.requestUserId(new f(gVar));
    }
}
