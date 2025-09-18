package io.sentry;

import com.yandex.metrica.C2460e;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6108x;
import io.sentry.util.AbstractC6174g;
import io.sentry.util.C6173f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: io.sentry.I1 */
/* loaded from: classes2.dex */
public final class C5774I1 {

    /* renamed from: a */
    public final C5759D1 f33298a;

    public C5774I1(C5759D1 c5759d1, int i) {
        switch (i) {
            case 1:
                AbstractC6003a.m21735D(c5759d1, "options are required");
                this.f33298a = c5759d1;
                break;
            default:
                this.f33298a = c5759d1;
                break;
        }
    }

    /* renamed from: a */
    public ArrayList m21402a(StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    C6108x c6108x = new C6108x();
                    c6108x.f34472h = m21403b(className);
                    c6108x.f34467c = className;
                    c6108x.f34466b = stackTraceElement.getMethodName();
                    c6108x.f34465a = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        c6108x.f34468d = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    c6108x.f34474j = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(c6108x);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public Boolean m21403b(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        C5759D1 c5759d1 = this.f33298a;
        Iterator<String> it = c5759d1.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = c5759d1.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    /* renamed from: c */
    public C5820Y0 m21404c(C2460e c2460e) {
        C5824Z1 c5824z1 = (C5824Z1) c2460e.f20786a;
        C5820Y0 c5820y0 = c5824z1.f33382d;
        if (c5820y0 != null) {
            return c5820y0;
        }
        C5759D1 c5759d1 = this.f33298a;
        c5759d1.getProfilesSampler();
        Double profilesSampleRate = c5759d1.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= ((C6173f) AbstractC6174g.f34666a.get()).m21882b());
        c5759d1.getTracesSampler();
        C5820Y0 c5820y02 = c5824z1.f33464m;
        if (c5820y02 != null) {
            return c5820y02;
        }
        Double tracesSampleRate = c5759d1.getTracesSampleRate();
        Double dValueOf = Boolean.TRUE.equals(c5759d1.getEnableTracing()) ? Double.valueOf(1.0d) : null;
        if (tracesSampleRate == null) {
            tracesSampleRate = dValueOf;
        }
        Double dValueOf2 = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, c5759d1.getBackpressureMonitor().mo3999a()));
        if (dValueOf2 != null) {
            return new C5820Y0(Boolean.valueOf(dValueOf2.doubleValue() >= ((C6173f) AbstractC6174g.f34666a.get()).m21882b()), dValueOf2, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new C5820Y0(bool, null, bool, null);
    }
}
