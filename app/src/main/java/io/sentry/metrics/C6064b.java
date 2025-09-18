package io.sentry.metrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: io.sentry.metrics.b */
/* loaded from: classes2.dex */
public final class C6064b {

    /* renamed from: a */
    public final HashMap f34242a = new HashMap();

    /* renamed from: a */
    public final HashMap m21839a() {
        HashMap map = new HashMap();
        synchronized (this.f34242a) {
            try {
                for (Map.Entry entry : this.f34242a.entrySet()) {
                    String str = (String) entry.getKey();
                    Objects.requireNonNull(str);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((Map) entry.getValue()).values().iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }
}
