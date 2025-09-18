package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.firebase.perf.metrics.Trace;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: cg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC2561cg1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ CallableC2561cg1(int i, Bundle bundle, Bundle bundle2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = bundle;
        this.d = bundle2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        Bundle bundle = this.d;
        Bundle bundle2 = this.c;
        int i = this.b;
        switch (this.a) {
            case 0:
                SparseArray sparseArray = C3818fg1.c;
                Trace trace = (Trace) sparseArray.get(i);
                Set<String> setKeySet = bundle2.keySet();
                Set<String> setKeySet2 = bundle.keySet();
                for (String str : setKeySet) {
                    ((Double) bundle2.get(str)).doubleValue();
                    trace.putMetric(str, r9.intValue());
                }
                for (String str2 : setKeySet2) {
                    Object obj = bundle.get(str2);
                    Objects.requireNonNull(obj);
                    trace.putAttribute(str2, (String) obj);
                }
                trace.stop();
                sparseArray.remove(i);
                return null;
            default:
                SparseArray sparseArray2 = C3818fg1.e;
                B40 b40 = (B40) sparseArray2.get(i);
                if (bundle2.containsKey("httpResponseCode")) {
                    b40.a.e((int) bundle2.getDouble("httpResponseCode"));
                }
                if (bundle2.containsKey("requestPayloadSize")) {
                    b40.a.f((int) bundle2.getDouble("requestPayloadSize"));
                }
                if (bundle2.containsKey("responsePayloadSize")) {
                    b40.a.i((int) bundle2.getDouble("responsePayloadSize"));
                }
                if (bundle2.containsKey("responseContentType")) {
                    b40.a.h(bundle2.getString("responseContentType"));
                }
                for (String strTrim : bundle.keySet()) {
                    String string = bundle.getString(strTrim);
                    Objects.requireNonNull(string);
                    b40.getClass();
                    ConcurrentHashMap concurrentHashMap = b40.c;
                    C7533v4 c7533v4 = B40.f;
                    try {
                        strTrim = strTrim.trim();
                        string = string.trim();
                    } catch (Exception e) {
                        c7533v4.c("Cannot set attribute '%s' with value '%s' (%s)", strTrim, string, e.getMessage());
                        z = false;
                    }
                    if (b40.d) {
                        throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
                    }
                    if (!concurrentHashMap.containsKey(strTrim) && concurrentHashMap.size() >= 5) {
                        Locale locale = Locale.ENGLISH;
                        throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
                    }
                    GA0.b(strTrim, string);
                    c7533v4.b("Setting attribute '%s' to %s on network request '%s'", strTrim, string, ((C1952Yu0) b40.a.d.b).S());
                    z = true;
                    if (z) {
                        concurrentHashMap.put(strTrim, string);
                    }
                }
                if (!b40.e) {
                    long jA = b40.b.a();
                    C2030Zu0 c2030Zu0 = b40.a;
                    c2030Zu0.j(jA);
                    ConcurrentHashMap concurrentHashMap2 = b40.c;
                    C1796Wu0 c1796Wu0 = c2030Zu0.d;
                    c1796Wu0.n();
                    C1952Yu0.D((C1952Yu0) c1796Wu0.b).clear();
                    c1796Wu0.n();
                    C1952Yu0.D((C1952Yu0) c1796Wu0.b).putAll(concurrentHashMap2);
                    c2030Zu0.b();
                    b40.d = true;
                }
                sparseArray2.remove(i);
                return null;
        }
    }
}
