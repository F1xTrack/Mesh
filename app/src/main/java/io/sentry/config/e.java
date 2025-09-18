package io.sentry.config;

import defpackage.AbstractC1705Vq;
import io.sentry.util.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes2.dex */
public final class e implements d {
    public final String a;
    public final Properties b;

    public e(String str, Properties properties) {
        this.a = str;
        a.D(properties, "properties are required");
        this.b = properties;
    }

    @Override // io.sentry.config.d
    public final String a(String str) {
        return h.b(this.b.getProperty(AbstractC1705Vq.l(new StringBuilder(), this.a, str)));
    }

    @Override // io.sentry.config.d
    public final Map getMap() {
        String strL = AbstractC1705Vq.l(new StringBuilder(), this.a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strL)) {
                    map.put(str.substring(strL.length()), h.b((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    public e(Properties properties) {
        this("", properties);
    }
}
