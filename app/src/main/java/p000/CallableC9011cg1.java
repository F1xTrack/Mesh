package p000;

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
public final /* synthetic */ class CallableC9011cg1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f17684a;

    /* renamed from: b */
    public final /* synthetic */ int f17685b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f17686c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f17687d;

    public /* synthetic */ CallableC9011cg1(int i, Bundle bundle, Bundle bundle2, int i2) {
        this.f17684a = i2;
        this.f17685b = i;
        this.f17686c = bundle;
        this.f17687d = bundle2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        Bundle bundle = this.f17687d;
        Bundle bundle2 = this.f17686c;
        int i = this.f17685b;
        switch (this.f17684a) {
            case 0:
                SparseArray sparseArray = C9400fg1.f27323c;
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
                SparseArray sparseArray2 = C9400fg1.f27325e;
                B40 b40 = (B40) sparseArray2.get(i);
                if (bundle2.containsKey("httpResponseCode")) {
                    b40.f546a.m9630e((int) bundle2.getDouble("httpResponseCode"));
                }
                if (bundle2.containsKey("requestPayloadSize")) {
                    b40.f546a.m9631f((int) bundle2.getDouble("requestPayloadSize"));
                }
                if (bundle2.containsKey("responsePayloadSize")) {
                    b40.f546a.m9634i((int) bundle2.getDouble("responsePayloadSize"));
                }
                if (bundle2.containsKey("responseContentType")) {
                    b40.f546a.m9633h(bundle2.getString("responseContentType"));
                }
                for (String strTrim : bundle.keySet()) {
                    String string = bundle.getString(strTrim);
                    Objects.requireNonNull(string);
                    b40.getClass();
                    ConcurrentHashMap concurrentHashMap = b40.f548c;
                    C6989v4 c6989v4 = B40.f545f;
                    try {
                        strTrim = strTrim.trim();
                        string = string.trim();
                    } catch (Exception e) {
                        c6989v4.m25322c("Cannot set attribute '%s' with value '%s' (%s)", strTrim, string, e.getMessage());
                        z = false;
                    }
                    if (b40.f549d) {
                        throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
                    }
                    if (!concurrentHashMap.containsKey(strTrim) && concurrentHashMap.size() >= 5) {
                        Locale locale = Locale.ENGLISH;
                        throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
                    }
                    GA0.m2937b(strTrim, string);
                    c6989v4.m25321b("Setting attribute '%s' to %s on network request '%s'", strTrim, string, ((C8602Yu0) b40.f546a.f15212d.f40483b).m9414S());
                    z = true;
                    if (z) {
                        concurrentHashMap.put(strTrim, string);
                    }
                }
                if (!b40.f550e) {
                    long jM3946a = b40.f547b.m3946a();
                    C8654Zu0 c8654Zu0 = b40.f546a;
                    c8654Zu0.m9635j(jM3946a);
                    ConcurrentHashMap concurrentHashMap2 = b40.f548c;
                    C8498Wu0 c8498Wu0 = c8654Zu0.f15212d;
                    c8498Wu0.m23922n();
                    C8602Yu0.m9392D((C8602Yu0) c8498Wu0.f40483b).clear();
                    c8498Wu0.m23922n();
                    C8602Yu0.m9392D((C8602Yu0) c8498Wu0.f40483b).putAll(concurrentHashMap2);
                    c8654Zu0.m9628b();
                    b40.f549d = true;
                }
                sparseArray2.remove(i);
                return null;
        }
    }
}
