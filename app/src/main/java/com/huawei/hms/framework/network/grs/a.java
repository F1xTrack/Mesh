package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static final String e = "a";
    private final GrsBaseInfo a;
    private com.huawei.hms.framework.network.grs.e.a b;
    private g c;
    private com.huawei.hms.framework.network.grs.e.c d;

    /* renamed from: com.huawei.hms.framework.network.grs.a$a */
    public static class C0001a implements com.huawei.hms.framework.network.grs.b {
        String a;
        Map<String, String> b;
        IQueryUrlsCallBack c;
        Context d;
        GrsBaseInfo e;
        com.huawei.hms.framework.network.grs.e.a f;

        public C0001a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.a = str;
            this.b = map;
            this.c = iQueryUrlsCallBack;
            this.d = context;
            this.e = grsBaseInfo;
            this.f = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            Map<String, String> map = this.b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(this.b).toString()));
                this.c.onCallBackSuccess(this.b);
                return;
            }
            if (this.b != null) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.a);
                this.c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> mapA = com.huawei.hms.framework.network.grs.f.b.a(this.d.getPackageName()).a(this.d, this.f, this.e, this.a, true);
            if (mapA == null || mapA.isEmpty()) {
                Logger.e(a.e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.a);
            }
            if (mapA == null) {
                mapA = new ConcurrentHashMap<>();
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
            this.c.onCallBackSuccess(mapA);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            String strJ = dVar.j();
            Map<String, String> mapA = a.a(strJ, this.a);
            if (!mapA.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
                this.c.onCallBackSuccess(mapA);
                return;
            }
            Map<String, String> map = this.b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(this.b).toString()));
                this.c.onCallBackSuccess(this.b);
                return;
            }
            if (this.b != null) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.a);
                this.c.onCallBackFail(-5);
                return;
            }
            if (!TextUtils.isEmpty(strJ)) {
                Logger.e(a.e, "The serviceName[%s] is not configured on the GRS server.", this.a);
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> mapA2 = com.huawei.hms.framework.network.grs.f.b.a(this.d.getPackageName()).a(this.d, this.f, this.e, this.a, true);
            if (mapA2 == null || mapA2.isEmpty()) {
                Logger.e(a.e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.a);
            }
            if (mapA2 == null) {
                mapA2 = new ConcurrentHashMap<>();
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(mapA2).toString()));
            this.c.onCallBackSuccess(mapA2);
        }
    }

    public static class b implements com.huawei.hms.framework.network.grs.b {
        String a;
        String b;
        IQueryUrlCallBack c;
        String d;
        Context e;
        GrsBaseInfo f;
        com.huawei.hms.framework.network.grs.e.a g;

        public b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.a = str;
            this.b = str2;
            this.c = iQueryUrlCallBack;
            this.d = str3;
            this.e = context;
            this.f = grsBaseInfo;
            this.g = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            if (!TextUtils.isEmpty(this.d)) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.a, this.b, StringUtils.anonymizeMessage(this.d));
                this.c.onCallBackSuccess(this.d);
                return;
            }
            if (!TextUtils.isEmpty(this.d)) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.a, this.b);
                this.c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String strA = com.huawei.hms.framework.network.grs.f.b.a(this.e.getPackageName()).a(this.e, this.g, this.f, this.a, this.b, true);
            if (strA == null || strA.isEmpty()) {
                Logger.e(a.e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.a, this.b);
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.a, this.b, StringUtils.anonymizeMessage(strA));
            this.c.onCallBackSuccess(strA);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            IQueryUrlCallBack iQueryUrlCallBack;
            String str;
            String strJ = dVar.j();
            Map<String, String> mapA = a.a(strJ, this.a);
            if (mapA.containsKey(this.b)) {
                String str2 = a.e;
                String str3 = this.a;
                String str4 = this.b;
                Logger.i(str2, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str3, str4, StringUtils.anonymizeMessage(mapA.get(str4)));
                iQueryUrlCallBack = this.c;
                str = mapA.get(this.b);
            } else {
                if (TextUtils.isEmpty(this.d)) {
                    if (!TextUtils.isEmpty(this.d)) {
                        Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.a, this.b);
                        this.c.onCallBackFail(-5);
                        return;
                    }
                    if (!TextUtils.isEmpty(strJ)) {
                        Logger.e(a.e, "The serviceName[%s][%s] is not configured on the GRS server.", this.a, this.b);
                    }
                    Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
                    String strA = com.huawei.hms.framework.network.grs.f.b.a(this.e.getPackageName()).a(this.e, this.g, this.f, this.a, this.b, true);
                    if (strA == null || strA.isEmpty()) {
                        Logger.e(a.e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.a, this.b);
                    }
                    Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.a, this.b, StringUtils.anonymizeMessage(strA));
                    this.c.onCallBackSuccess(strA);
                    return;
                }
                String str5 = a.e;
                String str6 = this.a;
                String str7 = this.b;
                Logger.i(str5, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", str6, str7, StringUtils.anonymizeMessage(mapA.get(str7)));
                iQueryUrlCallBack = this.c;
                str = this.d;
            }
            iQueryUrlCallBack.onCallBackSuccess(str);
        }
    }

    public a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar, g gVar, com.huawei.hms.framework.network.grs.e.c cVar) {
        this.a = grsBaseInfo;
        this.b = aVar;
        this.c = gVar;
        this.d = cVar;
    }

    public static CountryCodeBean a(Context context, boolean z) {
        return new CountryCodeBean(context, z);
    }

    public String a(Context context, String str, int i) {
        com.huawei.hms.framework.network.grs.g.d dVarA = this.c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.a, context), str, this.d, i);
        return dVarA == null ? "" : dVarA.m() ? this.b.a().a(this.a.getGrsParasKey(true, true, context), "") : dVarA.j();
    }

    public String a(String str, String str2, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String strA = a(str, bVar, context).get(str2);
        if (bVar.a() && !TextUtils.isEmpty(strA)) {
            Logger.i(e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(strA));
            return strA;
        }
        String strA2 = a(context, str, i);
        String str3 = a(strA2, str).get(str2);
        if (!TextUtils.isEmpty(str3)) {
            Logger.i(e, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            return str3;
        }
        if (TextUtils.isEmpty(strA)) {
            if (!TextUtils.isEmpty(strA2)) {
                Logger.e(e, "The serviceName[%s][%s] is not configured on the GRS server.", str, str2);
            }
            String str4 = e;
            Logger.i(str4, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File.");
            strA = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.a, str, str2, true);
            if (strA == null || strA.isEmpty()) {
                Logger.e(str4, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", str, str2);
            }
        }
        Logger.i(e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(strA));
        return strA;
    }

    public static Map<String, Map<String, String>> a(String str) throws JSONException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, a(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e2) {
            Logger.w(e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return concurrentHashMap;
        }
    }

    public Map<String, String> a(String str, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> mapA = a(str, bVar, context);
        if (bVar.a() && !mapA.isEmpty()) {
            Logger.i(e, "Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
            return mapA;
        }
        String strA = a(context, str, i);
        Map<String, String> mapA2 = a(strA, str);
        if (!mapA2.isEmpty()) {
            Logger.i(e, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapA2).toString()));
            return mapA2;
        }
        if (mapA.isEmpty()) {
            if (!TextUtils.isEmpty(strA)) {
                Logger.e(e, "The serviceName[%s] is not configured on the GRS server.", str);
            }
            String str2 = e;
            Logger.i(str2, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File.");
            mapA = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.a, str, true);
            if (mapA == null || mapA.isEmpty()) {
                Logger.e(str2, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", str);
            }
        }
        Logger.i(e, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(mapA != null ? new JSONObject(mapA).toString() : ""));
        return mapA;
    }

    private Map<String, String> a(String str, com.huawei.hms.framework.network.grs.e.b bVar, Context context) {
        Map<String, String> mapA = this.b.a(this.a, str, bVar, context);
        if (mapA != null && !mapA.isEmpty()) {
            Logger.i(e, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache");
            return mapA;
        }
        Map<String, String> mapA2 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.a, str, false);
        Logger.i(e, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File");
        return mapA2 != null ? mapA2 : new HashMap();
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w(e, "isSpExpire jsonValue from server is null.");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w(e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return map;
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.get(next).toString());
            }
            return map;
        } catch (JSONException e2) {
            Logger.w(e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return map;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                    concurrentHashMap.put(next, string);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e2) {
            Logger.w(e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return concurrentHashMap;
        }
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> mapA = a(str, bVar, context);
        if (!bVar.a()) {
            this.c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.a, context), new C0001a(str, mapA, iQueryUrlsCallBack, context, this.a, this.b), str, this.d, i);
            return;
        }
        if (mapA.isEmpty()) {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", str);
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            String str2 = e;
            Logger.i(str2, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
            Logger.i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
            iQueryUrlsCallBack.onCallBackSuccess(mapA);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (!bVar.a()) {
            this.c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.a, this.b), str, this.d, i);
        } else if (TextUtils.isEmpty(str3)) {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", str, str2);
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            iQueryUrlCallBack.onCallBackSuccess(str3);
        }
    }
}
