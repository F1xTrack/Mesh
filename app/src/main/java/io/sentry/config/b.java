package io.sentry.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b implements d {
    public final ArrayList a;

    public b(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // io.sentry.config.d
    public final String a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String strA = ((d) it.next()).a(str);
            if (strA != null) {
                return strA;
            }
        }
        return null;
    }

    public final Boolean b(String str) {
        String strA = a(str);
        if (strA != null) {
            return Boolean.valueOf(strA);
        }
        return null;
    }

    @Override // io.sentry.config.d
    public final Map getMap() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((d) it.next()).getMap());
        }
        return concurrentHashMap;
    }
}
