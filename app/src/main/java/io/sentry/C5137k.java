package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.C5157c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: io.sentry.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5137k implements InterfaceC5173u {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public C5137k(D1 d1) {
        this.a = 1;
        this.b = Collections.synchronizedMap(new WeakHashMap());
        io.sentry.config.a.D(d1, "options are required");
        this.c = d1;
    }

    @Override // io.sentry.InterfaceC5173u
    public final F1 a(F1 f1, C5185y c5185y) {
        int i = this.a;
        return f1;
    }

    public void b(V0 v0) {
        io.sentry.protocol.v vVar = (io.sentry.protocol.v) v0.b.d(io.sentry.protocol.v.class, "runtime");
        C5157c c5157c = v0.b;
        if (vVar == null) {
            c5157c.put("runtime", new io.sentry.protocol.v());
        }
        io.sentry.protocol.v vVar2 = (io.sentry.protocol.v) c5157c.d(io.sentry.protocol.v.class, "runtime");
        if (vVar2 != null && vVar2.a == null && vVar2.b == null) {
            vVar2.a = (String) this.c;
            vVar2.b = (String) this.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Throwable] */
    @Override // io.sentry.InterfaceC5173u
    public final C5133i1 c(C5133i1 c5133i1, C5185y c5185y) {
        io.sentry.protocol.s sVarB;
        String str;
        Long l;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                if (c2.class.isInstance(io.sentry.config.a.r(c5185y)) && (sVarB = c5133i1.b()) != null && (str = sVarB.a) != null && (l = sVarB.d) != null) {
                    Map map = (Map) obj;
                    Long l2 = (Long) map.get(str);
                    if (l2 != null && !l2.equals(l)) {
                        ((SentryAndroidOptions) obj2).getLogger().k(EnumC5148n1.INFO, "Event %s has been dropped due to multi-threaded deduplication", c5133i1.a);
                        c5185y.c(io.sentry.hints.e.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
                        break;
                    } else {
                        map.put(str, l);
                        break;
                    }
                }
                break;
            case 1:
                D1 d1 = (D1) obj2;
                if (d1.isEnableDeduplication()) {
                    io.sentry.exception.a aVar = c5133i1.j;
                    boolean z = aVar instanceof io.sentry.exception.a;
                    io.sentry.exception.a aVar2 = aVar;
                    if (z) {
                        aVar2 = aVar.b;
                    }
                    if (aVar2 != null) {
                        Map map2 = (Map) obj;
                        if (!map2.containsKey(aVar2)) {
                            ArrayList arrayList = new ArrayList();
                            for (Throwable cause = aVar2; cause.getCause() != null; cause = cause.getCause()) {
                                arrayList.add(cause.getCause());
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (map2.containsKey(it.next())) {
                                }
                            }
                            map2.put(aVar2, null);
                            break;
                        }
                        d1.getLogger().k(EnumC5148n1.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c5133i1.a);
                        break;
                    }
                } else {
                    d1.getLogger().k(EnumC5148n1.DEBUG, "Event deduplication is disabled.", new Object[0]);
                    break;
                }
                break;
            default:
                b(c5133i1);
                break;
        }
        return c5133i1;
    }

    @Override // io.sentry.InterfaceC5173u
    public final io.sentry.protocol.A e(io.sentry.protocol.A a, C5185y c5185y) {
        switch (this.a) {
            default:
                b(a);
            case 0:
            case 1:
                return a;
        }
    }

    public C5137k() {
        this.a = 2;
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.b = property;
        this.c = property2;
    }

    public C5137k(SentryAndroidOptions sentryAndroidOptions) {
        this.a = 0;
        this.b = Collections.synchronizedMap(new HashMap());
        this.c = sentryAndroidOptions;
    }
}
