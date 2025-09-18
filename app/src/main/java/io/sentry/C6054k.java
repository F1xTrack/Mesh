package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC6003a;
import io.sentry.exception.C6015a;
import io.sentry.hints.EnumC6030e;
import io.sentry.protocol.C6078A;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6103s;
import io.sentry.protocol.C6106v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: io.sentry.k */
/* loaded from: classes2.dex */
public final class C6054k implements InterfaceC6165u {

    /* renamed from: a */
    public final /* synthetic */ int f34217a;

    /* renamed from: b */
    public final Object f34218b;

    /* renamed from: c */
    public final Object f34219c;

    public C6054k(C5759D1 c5759d1) {
        this.f34217a = 1;
        this.f34218b = Collections.synchronizedMap(new WeakHashMap());
        AbstractC6003a.m21735D(c5759d1, "options are required");
        this.f34219c = c5759d1;
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: a */
    public final C5765F1 mo21517a(C5765F1 c5765f1, C6193y c6193y) {
        int i = this.f34217a;
        return c5765f1;
    }

    /* renamed from: b */
    public void m21800b(AbstractC5811V0 abstractC5811V0) {
        C6106v c6106v = (C6106v) abstractC5811V0.f33417b.m21852d(C6106v.class, "runtime");
        C6087c c6087c = abstractC5811V0.f33417b;
        if (c6106v == null) {
            c6087c.put("runtime", new C6106v());
        }
        C6106v c6106v2 = (C6106v) c6087c.m21852d(C6106v.class, "runtime");
        if (c6106v2 != null && c6106v2.f34447a == null && c6106v2.f34448b == null) {
            c6106v2.f34447a = (String) this.f34219c;
            c6106v2.f34448b = (String) this.f34218b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Throwable] */
    @Override // io.sentry.InterfaceC6165u
    /* renamed from: c */
    public final C6039i1 mo21519c(C6039i1 c6039i1, C6193y c6193y) {
        C6103s c6103sM21787b;
        String str;
        Long l;
        Object obj = this.f34218b;
        Object obj2 = this.f34219c;
        switch (this.f34217a) {
            case 0:
                if (C5988c2.class.isInstance(AbstractC6003a.m21758r(c6193y)) && (c6103sM21787b = c6039i1.m21787b()) != null && (str = c6103sM21787b.f34435a) != null && (l = c6103sM21787b.f34438d) != null) {
                    Map map = (Map) obj;
                    Long l2 = (Long) map.get(str);
                    if (l2 != null && !l2.equals(l)) {
                        ((SentryAndroidOptions) obj2).getLogger().mo21407k(EnumC6069n1.INFO, "Event %s has been dropped due to multi-threaded deduplication", c6039i1.f33416a);
                        c6193y.m21928c(EnumC6030e.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
                        break;
                    } else {
                        map.put(str, l);
                        break;
                    }
                }
                break;
            case 1:
                C5759D1 c5759d1 = (C5759D1) obj2;
                if (c5759d1.isEnableDeduplication()) {
                    C6015a c6015a = c6039i1.f33425j;
                    boolean z = c6015a instanceof C6015a;
                    C6015a c6015a2 = c6015a;
                    if (z) {
                        c6015a2 = c6015a.f34140b;
                    }
                    if (c6015a2 != null) {
                        Map map2 = (Map) obj;
                        if (!map2.containsKey(c6015a2)) {
                            ArrayList arrayList = new ArrayList();
                            for (Throwable cause = c6015a2; cause.getCause() != null; cause = cause.getCause()) {
                                arrayList.add(cause.getCause());
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (map2.containsKey(it.next())) {
                                }
                            }
                            map2.put(c6015a2, null);
                            break;
                        }
                        c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c6039i1.f33416a);
                        break;
                    }
                } else {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Event deduplication is disabled.", new Object[0]);
                    break;
                }
                break;
            default:
                m21800b(c6039i1);
                break;
        }
        return c6039i1;
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: e */
    public final C6078A mo21521e(C6078A c6078a, C6193y c6193y) {
        switch (this.f34217a) {
            default:
                m21800b(c6078a);
            case 0:
            case 1:
                return c6078a;
        }
    }

    public C6054k() {
        this.f34217a = 2;
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.f34218b = property;
        this.f34219c = property2;
    }

    public C6054k(SentryAndroidOptions sentryAndroidOptions) {
        this.f34217a = 0;
        this.f34218b = Collections.synchronizedMap(new HashMap());
        this.f34219c = sentryAndroidOptions;
    }
}
