package io.sentry.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.config.b */
/* loaded from: classes2.dex */
public final class C6004b implements InterfaceC6006d {

    /* renamed from: a */
    public final ArrayList f34122a;

    public C6004b(ArrayList arrayList) {
        this.f34122a = arrayList;
    }

    @Override // io.sentry.config.InterfaceC6006d
    /* renamed from: a */
    public final String mo21768a(String str) {
        Iterator it = this.f34122a.iterator();
        while (it.hasNext()) {
            String strMo21768a = ((InterfaceC6006d) it.next()).mo21768a(str);
            if (strMo21768a != null) {
                return strMo21768a;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final Boolean m21769b(String str) {
        String strMo21768a = mo21768a(str);
        if (strMo21768a != null) {
            return Boolean.valueOf(strMo21768a);
        }
        return null;
    }

    @Override // io.sentry.config.InterfaceC6006d
    public final Map getMap() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.f34122a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((InterfaceC6006d) it.next()).getMap());
        }
        return concurrentHashMap;
    }
}
