package io.sentry.config;

import io.sentry.util.AbstractC6175h;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p000.AbstractC1374Vq;

/* renamed from: io.sentry.config.e */
/* loaded from: classes2.dex */
public final class C6007e implements InterfaceC6006d {

    /* renamed from: a */
    public final String f34123a;

    /* renamed from: b */
    public final Properties f34124b;

    public C6007e(String str, Properties properties) {
        this.f34123a = str;
        AbstractC6003a.m21735D(properties, "properties are required");
        this.f34124b = properties;
    }

    @Override // io.sentry.config.InterfaceC6006d
    /* renamed from: a */
    public final String mo21768a(String str) {
        return AbstractC6175h.m21884b(this.f34124b.getProperty(AbstractC1374Vq.m8593l(new StringBuilder(), this.f34123a, str)));
    }

    @Override // io.sentry.config.InterfaceC6006d
    public final Map getMap() {
        String strM8593l = AbstractC1374Vq.m8593l(new StringBuilder(), this.f34123a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f34124b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strM8593l)) {
                    map.put(str.substring(strM8593l.length()), AbstractC6175h.m21884b((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    public C6007e(Properties properties) {
        this("", properties);
    }
}
