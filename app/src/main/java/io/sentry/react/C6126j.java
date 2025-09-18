package io.sentry.react;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.C6017f;
import io.sentry.android.replay.C5926c;
import io.sentry.rrweb.AbstractC6131b;
import io.sentry.rrweb.C6130a;
import io.sentry.rrweb.C6141l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.react.j */
/* loaded from: classes2.dex */
public final class C6126j extends C5926c {
    /* renamed from: a */
    public static void m21858a(C6130a c6130a, C6017f c6017f) {
        c6130a.f34555h = c6017f.f34150h;
        ConcurrentHashMap concurrentHashMap = c6017f.f34147e;
        c6130a.f34556i = concurrentHashMap == null ? null : new ConcurrentHashMap(concurrentHashMap);
        c6130a.f34561b = c6017f.m21777a().getTime();
        c6130a.f34551d = c6017f.m21777a().getTime() / 1000.0d;
        c6130a.f34552e = "default";
    }

    @Override // io.sentry.android.replay.C5926c, io.sentry.InterfaceC5767G0
    /* renamed from: m */
    public final AbstractC6131b mo21387m(C6017f c6017f) {
        String str = c6017f.f34148f;
        String string = null;
        if (str == null || "sentry.event".equals(str) || "sentry.transaction".equals(c6017f.f34148f) || "http".equals(c6017f.f34148f)) {
            return null;
        }
        if (!"touch".equals(c6017f.f34148f)) {
            if ("navigation".equals(c6017f.f34148f)) {
                C6130a c6130a = new C6130a();
                c6130a.f34553f = c6017f.f34148f;
                m21858a(c6130a, c6017f);
                return c6130a;
            }
            if (!"xhr".equals(c6017f.f34148f)) {
                AbstractC6131b abstractC6131bMo21387m = super.mo21387m(c6017f);
                if ((abstractC6131bMo21387m instanceof C6130a) && "navigation".equals(((C6130a) abstractC6131bMo21387m).f34553f)) {
                    return null;
                }
                return abstractC6131bMo21387m;
            }
            Double d = c6017f.f34147e.get("start_timestamp") instanceof Number ? (Double) c6017f.f34147e.get("start_timestamp") : null;
            Double d2 = c6017f.f34147e.get("end_timestamp") instanceof Number ? (Double) c6017f.f34147e.get("end_timestamp") : null;
            String str2 = c6017f.f34147e.get("url") instanceof String ? (String) c6017f.f34147e.get("url") : null;
            if (d == null || d2 == null || str2 == null) {
                return null;
            }
            HashMap map = new HashMap();
            if (c6017f.f34147e.get("method") instanceof String) {
                map.put("method", c6017f.f34147e.get("method"));
            }
            if (c6017f.f34147e.get("status_code") instanceof Double) {
                Double d3 = (Double) c6017f.f34147e.get("status_code");
                if (d3.doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE) {
                    map.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(d3.intValue()));
                }
            }
            if (c6017f.f34147e.get("request_body_size") instanceof Double) {
                map.put("requestBodySize", c6017f.f34147e.get("request_body_size"));
            }
            if (c6017f.f34147e.get("response_body_size") instanceof Double) {
                map.put("responseBodySize", c6017f.f34147e.get("response_body_size"));
            }
            C6141l c6141l = new C6141l();
            c6141l.f34587d = "resource.http";
            c6141l.f34589f = d.doubleValue() / 1000.0d;
            c6141l.f34590g = d2.doubleValue() / 1000.0d;
            c6141l.f34588e = str2;
            c6141l.f34591h = new ConcurrentHashMap(map);
            return c6141l;
        }
        C6130a c6130a2 = new C6130a();
        c6130a2.f34553f = "ui.tap";
        Object obj = c6017f.f34147e.get("path");
        if (obj instanceof List) {
            List list = (List) obj;
            if (!list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                int iMin = Math.min(3, list.size() - 1);
                while (true) {
                    if (iMin < 0) {
                        string = sb.toString();
                        break;
                    }
                    Object obj2 = list.get(iMin);
                    if (!(obj2 instanceof Map)) {
                        break;
                    }
                    Map map2 = (Map) obj2;
                    Object obj3 = map2.get("name");
                    Object obj4 = map2.get("label");
                    boolean z = obj4 instanceof String;
                    if (!(obj3 instanceof String) && !z) {
                        break;
                    }
                    if (z) {
                        sb.append(obj4);
                    } else {
                        sb.append(obj3);
                    }
                    Object obj5 = map2.get("element");
                    Object obj6 = map2.get("file");
                    boolean z2 = obj5 instanceof String;
                    boolean z3 = obj6 instanceof String;
                    if (z2 && z3) {
                        sb.append('(');
                        sb.append(obj5);
                        sb.append(", ");
                        sb.append(obj6);
                        sb.append(')');
                    } else if (z2) {
                        sb.append('(');
                        sb.append(obj5);
                        sb.append(')');
                    } else if (z3) {
                        sb.append('(');
                        sb.append(obj6);
                        sb.append(')');
                    }
                    if (iMin > 0) {
                        sb.append(" > ");
                    }
                    iMin--;
                }
            }
        }
        c6130a2.f34554g = string;
        m21858a(c6130a2, c6017f);
        return c6130a2;
    }
}
