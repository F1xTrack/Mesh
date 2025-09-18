package io.sentry.react;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.C5122f;
import io.sentry.rrweb.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class j extends io.sentry.android.replay.c {
    public static void a(io.sentry.rrweb.a aVar, C5122f c5122f) {
        aVar.h = c5122f.h;
        ConcurrentHashMap concurrentHashMap = c5122f.e;
        aVar.i = concurrentHashMap == null ? null : new ConcurrentHashMap(concurrentHashMap);
        aVar.b = c5122f.a().getTime();
        aVar.d = c5122f.a().getTime() / 1000.0d;
        aVar.e = "default";
    }

    @Override // io.sentry.android.replay.c, io.sentry.G0
    public final io.sentry.rrweb.b m(C5122f c5122f) {
        String str = c5122f.f;
        String string = null;
        if (str == null || "sentry.event".equals(str) || "sentry.transaction".equals(c5122f.f) || "http".equals(c5122f.f)) {
            return null;
        }
        if (!"touch".equals(c5122f.f)) {
            if ("navigation".equals(c5122f.f)) {
                io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                aVar.f = c5122f.f;
                a(aVar, c5122f);
                return aVar;
            }
            if (!"xhr".equals(c5122f.f)) {
                io.sentry.rrweb.b bVarM = super.m(c5122f);
                if ((bVarM instanceof io.sentry.rrweb.a) && "navigation".equals(((io.sentry.rrweb.a) bVarM).f)) {
                    return null;
                }
                return bVarM;
            }
            Double d = c5122f.e.get("start_timestamp") instanceof Number ? (Double) c5122f.e.get("start_timestamp") : null;
            Double d2 = c5122f.e.get("end_timestamp") instanceof Number ? (Double) c5122f.e.get("end_timestamp") : null;
            String str2 = c5122f.e.get("url") instanceof String ? (String) c5122f.e.get("url") : null;
            if (d == null || d2 == null || str2 == null) {
                return null;
            }
            HashMap map = new HashMap();
            if (c5122f.e.get("method") instanceof String) {
                map.put("method", c5122f.e.get("method"));
            }
            if (c5122f.e.get("status_code") instanceof Double) {
                Double d3 = (Double) c5122f.e.get("status_code");
                if (d3.doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE) {
                    map.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(d3.intValue()));
                }
            }
            if (c5122f.e.get("request_body_size") instanceof Double) {
                map.put("requestBodySize", c5122f.e.get("request_body_size"));
            }
            if (c5122f.e.get("response_body_size") instanceof Double) {
                map.put("responseBodySize", c5122f.e.get("response_body_size"));
            }
            l lVar = new l();
            lVar.d = "resource.http";
            lVar.f = d.doubleValue() / 1000.0d;
            lVar.g = d2.doubleValue() / 1000.0d;
            lVar.e = str2;
            lVar.h = new ConcurrentHashMap(map);
            return lVar;
        }
        io.sentry.rrweb.a aVar2 = new io.sentry.rrweb.a();
        aVar2.f = "ui.tap";
        Object obj = c5122f.e.get("path");
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
        aVar2.g = string;
        a(aVar2, c5122f);
        return aVar2;
    }
}
