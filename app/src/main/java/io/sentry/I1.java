package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class I1 {
    public final D1 a;

    public I1(D1 d1, int i) {
        switch (i) {
            case 1:
                io.sentry.config.a.D(d1, "options are required");
                this.a = d1;
                break;
            default:
                this.a = d1;
                break;
        }
    }

    public ArrayList a(StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.x xVar = new io.sentry.protocol.x();
                    xVar.h = b(className);
                    xVar.c = className;
                    xVar.b = stackTraceElement.getMethodName();
                    xVar.a = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        xVar.d = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    xVar.j = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(xVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean b(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        D1 d1 = this.a;
        Iterator<String> it = d1.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = d1.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public Y0 c(com.yandex.metrica.e eVar) {
        Z1 z1 = (Z1) eVar.a;
        Y0 y0 = z1.d;
        if (y0 != null) {
            return y0;
        }
        D1 d1 = this.a;
        d1.getProfilesSampler();
        Double profilesSampleRate = d1.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= ((io.sentry.util.f) io.sentry.util.g.a.get()).b());
        d1.getTracesSampler();
        Y0 y02 = z1.m;
        if (y02 != null) {
            return y02;
        }
        Double tracesSampleRate = d1.getTracesSampleRate();
        Double dValueOf = Boolean.TRUE.equals(d1.getEnableTracing()) ? Double.valueOf(1.0d) : null;
        if (tracesSampleRate == null) {
            tracesSampleRate = dValueOf;
        }
        Double dValueOf2 = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, d1.getBackpressureMonitor().a()));
        if (dValueOf2 != null) {
            return new Y0(Boolean.valueOf(dValueOf2.doubleValue() >= ((io.sentry.util.f) io.sentry.util.g.a.get()).b()), dValueOf2, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new Y0(bool, null, bool, null);
    }
}
