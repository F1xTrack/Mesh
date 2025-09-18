package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import com.huawei.hms.framework.network.grs.p006e.C2095a;
import com.huawei.hms.framework.network.grs.p006e.C2096b;
import com.huawei.hms.framework.network.grs.p006e.C2097c;
import com.huawei.hms.framework.network.grs.p007f.C2099b;
import com.huawei.hms.framework.network.grs.p008g.C2106d;
import com.huawei.hms.framework.network.grs.p008g.C2109g;
import com.huawei.hms.framework.network.grs.p008g.p010j.C2114c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.a */
/* loaded from: classes.dex */
public class C2091a {

    /* renamed from: e */
    private static final String f18991e = "a";

    /* renamed from: a */
    private final GrsBaseInfo f18992a;

    /* renamed from: b */
    private C2095a f18993b;

    /* renamed from: c */
    private C2109g f18994c;

    /* renamed from: d */
    private C2097c f18995d;

    /* renamed from: com.huawei.hms.framework.network.grs.a$a */
    public static class a implements InterfaceC2092b {

        /* renamed from: a */
        String f18996a;

        /* renamed from: b */
        Map<String, String> f18997b;

        /* renamed from: c */
        IQueryUrlsCallBack f18998c;

        /* renamed from: d */
        Context f18999d;

        /* renamed from: e */
        GrsBaseInfo f19000e;

        /* renamed from: f */
        C2095a f19001f;

        public a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, C2095a c2095a) {
            this.f18996a = str;
            this.f18997b = map;
            this.f18998c = iQueryUrlsCallBack;
            this.f18999d = context;
            this.f19000e = grsBaseInfo;
            this.f19001f = c2095a;
        }

        @Override // com.huawei.hms.framework.network.grs.InterfaceC2092b
        /* renamed from: a */
        public void mo11703a() {
            Map<String, String> map = this.f18997b;
            if (map != null && !map.isEmpty()) {
                Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f18996a, StringUtils.anonymizeMessage(new JSONObject(this.f18997b).toString()));
                this.f18998c.onCallBackSuccess(this.f18997b);
                return;
            }
            if (this.f18997b != null) {
                Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f18996a);
                this.f18998c.onCallBackFail(-3);
                return;
            }
            Logger.m11685i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> mapM11771a = C2099b.m11767a(this.f18999d.getPackageName()).m11771a(this.f18999d, this.f19001f, this.f19000e, this.f18996a, true);
            if (mapM11771a == null || mapM11771a.isEmpty()) {
                Logger.m11684e(C2091a.f18991e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f18996a);
            }
            if (mapM11771a == null) {
                mapM11771a = new ConcurrentHashMap<>();
            }
            Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f18996a, StringUtils.anonymizeMessage(new JSONObject(mapM11771a).toString()));
            this.f18998c.onCallBackSuccess(mapM11771a);
        }

        @Override // com.huawei.hms.framework.network.grs.InterfaceC2092b
        /* renamed from: a */
        public void mo11704a(C2106d c2106d) {
            String strM11823j = c2106d.m11823j();
            Map<String, String> mapM11696a = C2091a.m11696a(strM11823j, this.f18996a);
            if (!mapM11696a.isEmpty()) {
                Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", this.f18996a, StringUtils.anonymizeMessage(new JSONObject(mapM11696a).toString()));
                this.f18998c.onCallBackSuccess(mapM11696a);
                return;
            }
            Map<String, String> map = this.f18997b;
            if (map != null && !map.isEmpty()) {
                Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s", this.f18996a, StringUtils.anonymizeMessage(new JSONObject(this.f18997b).toString()));
                this.f18998c.onCallBackSuccess(this.f18997b);
                return;
            }
            if (this.f18997b != null) {
                Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f18996a);
                this.f18998c.onCallBackFail(-5);
                return;
            }
            if (!TextUtils.isEmpty(strM11823j)) {
                Logger.m11684e(C2091a.f18991e, "The serviceName[%s] is not configured on the GRS server.", this.f18996a);
            }
            Logger.m11685i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> mapM11771a = C2099b.m11767a(this.f18999d.getPackageName()).m11771a(this.f18999d, this.f19001f, this.f19000e, this.f18996a, true);
            if (mapM11771a == null || mapM11771a.isEmpty()) {
                Logger.m11684e(C2091a.f18991e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f18996a);
            }
            if (mapM11771a == null) {
                mapM11771a = new ConcurrentHashMap<>();
            }
            Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f18996a, StringUtils.anonymizeMessage(new JSONObject(mapM11771a).toString()));
            this.f18998c.onCallBackSuccess(mapM11771a);
        }
    }

    /* renamed from: com.huawei.hms.framework.network.grs.a$b */
    public static class b implements InterfaceC2092b {

        /* renamed from: a */
        String f19002a;

        /* renamed from: b */
        String f19003b;

        /* renamed from: c */
        IQueryUrlCallBack f19004c;

        /* renamed from: d */
        String f19005d;

        /* renamed from: e */
        Context f19006e;

        /* renamed from: f */
        GrsBaseInfo f19007f;

        /* renamed from: g */
        C2095a f19008g;

        public b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, C2095a c2095a) {
            this.f19002a = str;
            this.f19003b = str2;
            this.f19004c = iQueryUrlCallBack;
            this.f19005d = str3;
            this.f19006e = context;
            this.f19007f = grsBaseInfo;
            this.f19008g = c2095a;
        }

        @Override // com.huawei.hms.framework.network.grs.InterfaceC2092b
        /* renamed from: a */
        public void mo11703a() {
            if (!TextUtils.isEmpty(this.f19005d)) {
                Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f19002a, this.f19003b, StringUtils.anonymizeMessage(this.f19005d));
                this.f19004c.onCallBackSuccess(this.f19005d);
                return;
            }
            if (!TextUtils.isEmpty(this.f19005d)) {
                Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f19002a, this.f19003b);
                this.f19004c.onCallBackFail(-3);
                return;
            }
            Logger.m11685i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String strM11770a = C2099b.m11767a(this.f19006e.getPackageName()).m11770a(this.f19006e, this.f19008g, this.f19007f, this.f19002a, this.f19003b, true);
            if (strM11770a == null || strM11770a.isEmpty()) {
                Logger.m11684e(C2091a.f18991e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f19002a, this.f19003b);
            }
            Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f19002a, this.f19003b, StringUtils.anonymizeMessage(strM11770a));
            this.f19004c.onCallBackSuccess(strM11770a);
        }

        @Override // com.huawei.hms.framework.network.grs.InterfaceC2092b
        /* renamed from: a */
        public void mo11704a(C2106d c2106d) {
            IQueryUrlCallBack iQueryUrlCallBack;
            String str;
            String strM11823j = c2106d.m11823j();
            Map<String, String> mapM11696a = C2091a.m11696a(strM11823j, this.f19002a);
            if (mapM11696a.containsKey(this.f19003b)) {
                String str2 = C2091a.f18991e;
                String str3 = this.f19002a;
                String str4 = this.f19003b;
                Logger.m11686i(str2, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str3, str4, StringUtils.anonymizeMessage(mapM11696a.get(str4)));
                iQueryUrlCallBack = this.f19004c;
                str = mapM11696a.get(this.f19003b);
            } else {
                if (TextUtils.isEmpty(this.f19005d)) {
                    if (!TextUtils.isEmpty(this.f19005d)) {
                        Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f19002a, this.f19003b);
                        this.f19004c.onCallBackFail(-5);
                        return;
                    }
                    if (!TextUtils.isEmpty(strM11823j)) {
                        Logger.m11684e(C2091a.f18991e, "The serviceName[%s][%s] is not configured on the GRS server.", this.f19002a, this.f19003b);
                    }
                    Logger.m11685i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
                    String strM11770a = C2099b.m11767a(this.f19006e.getPackageName()).m11770a(this.f19006e, this.f19008g, this.f19007f, this.f19002a, this.f19003b, true);
                    if (strM11770a == null || strM11770a.isEmpty()) {
                        Logger.m11684e(C2091a.f18991e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f19002a, this.f19003b);
                    }
                    Logger.m11686i(C2091a.f18991e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f19002a, this.f19003b, StringUtils.anonymizeMessage(strM11770a));
                    this.f19004c.onCallBackSuccess(strM11770a);
                    return;
                }
                String str5 = C2091a.f18991e;
                String str6 = this.f19002a;
                String str7 = this.f19003b;
                Logger.m11686i(str5, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", str6, str7, StringUtils.anonymizeMessage(mapM11696a.get(str7)));
                iQueryUrlCallBack = this.f19004c;
                str = this.f19005d;
            }
            iQueryUrlCallBack.onCallBackSuccess(str);
        }
    }

    public C2091a(GrsBaseInfo grsBaseInfo, C2095a c2095a, C2109g c2109g, C2097c c2097c) {
        this.f18992a = grsBaseInfo;
        this.f18993b = c2095a;
        this.f18994c = c2109g;
        this.f18995d = c2097c;
    }

    /* renamed from: a */
    public static CountryCodeBean m11692a(Context context, boolean z) {
        return new CountryCodeBean(context, z);
    }

    /* renamed from: a */
    public String m11698a(Context context, String str, int i) {
        C2106d c2106dM11836a = this.f18994c.m11836a(new C2114c(this.f18992a, context), str, this.f18995d, i);
        return c2106dM11836a == null ? "" : c2106dM11836a.m11826m() ? this.f18993b.m11733a().m11743a(this.f18992a.getGrsParasKey(true, true, context), "") : c2106dM11836a.m11823j();
    }

    /* renamed from: a */
    public String m11699a(String str, String str2, Context context, int i) {
        C2096b c2096b = new C2096b();
        String strM11770a = m11695a(str, c2096b, context).get(str2);
        if (c2096b.m11741a() && !TextUtils.isEmpty(strM11770a)) {
            Logger.m11686i(f18991e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(strM11770a));
            return strM11770a;
        }
        String strM11698a = m11698a(context, str, i);
        String str3 = m11696a(strM11698a, str).get(str2);
        if (!TextUtils.isEmpty(str3)) {
            Logger.m11686i(f18991e, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            return str3;
        }
        if (TextUtils.isEmpty(strM11770a)) {
            if (!TextUtils.isEmpty(strM11698a)) {
                Logger.m11684e(f18991e, "The serviceName[%s][%s] is not configured on the GRS server.", str, str2);
            }
            String str4 = f18991e;
            Logger.m11685i(str4, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File.");
            strM11770a = C2099b.m11767a(context.getPackageName()).m11770a(context, this.f18993b, this.f18992a, str, str2, true);
            if (strM11770a == null || strM11770a.isEmpty()) {
                Logger.m11684e(str4, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", str, str2);
            }
        }
        Logger.m11686i(f18991e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(strM11770a));
        return strM11770a;
    }

    /* renamed from: a */
    public static Map<String, Map<String, String>> m11694a(String str) throws JSONException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.m11687v(f18991e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, m11697a(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e) {
            Logger.m11691w(f18991e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            return concurrentHashMap;
        }
    }

    /* renamed from: a */
    public Map<String, String> m11700a(String str, Context context, int i) {
        C2096b c2096b = new C2096b();
        Map<String, String> mapM11695a = m11695a(str, c2096b, context);
        if (c2096b.m11741a() && !mapM11695a.isEmpty()) {
            Logger.m11686i(f18991e, "Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapM11695a).toString()));
            return mapM11695a;
        }
        String strM11698a = m11698a(context, str, i);
        Map<String, String> mapM11696a = m11696a(strM11698a, str);
        if (!mapM11696a.isEmpty()) {
            Logger.m11686i(f18991e, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapM11696a).toString()));
            return mapM11696a;
        }
        if (mapM11695a.isEmpty()) {
            if (!TextUtils.isEmpty(strM11698a)) {
                Logger.m11684e(f18991e, "The serviceName[%s] is not configured on the GRS server.", str);
            }
            String str2 = f18991e;
            Logger.m11685i(str2, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File.");
            mapM11695a = C2099b.m11767a(context.getPackageName()).m11771a(context, this.f18993b, this.f18992a, str, true);
            if (mapM11695a == null || mapM11695a.isEmpty()) {
                Logger.m11684e(str2, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", str);
            }
        }
        Logger.m11686i(f18991e, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(mapM11695a != null ? new JSONObject(mapM11695a).toString() : ""));
        return mapM11695a;
    }

    /* renamed from: a */
    private Map<String, String> m11695a(String str, C2096b c2096b, Context context) {
        Map<String, String> mapM11734a = this.f18993b.m11734a(this.f18992a, str, c2096b, context);
        if (mapM11734a != null && !mapM11734a.isEmpty()) {
            Logger.m11685i(f18991e, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache");
            return mapM11734a;
        }
        Map<String, String> mapM11771a = C2099b.m11767a(context.getPackageName()).m11771a(context, this.f18993b, this.f18992a, str, false);
        Logger.m11685i(f18991e, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File");
        return mapM11771a != null ? mapM11771a : new HashMap();
    }

    /* renamed from: a */
    public static Map<String, String> m11696a(String str, String str2) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.m11689w(f18991e, "isSpExpire jsonValue from server is null.");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.m11691w(f18991e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return map;
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.get(next).toString());
            }
            return map;
        } catch (JSONException e) {
            Logger.m11691w(f18991e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            return map;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m11697a(JSONObject jSONObject) {
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
        } catch (JSONException e) {
            Logger.m11691w(f18991e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            return concurrentHashMap;
        }
    }

    /* renamed from: a */
    public void m11701a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, int i) {
        C2096b c2096b = new C2096b();
        Map<String, String> mapM11695a = m11695a(str, c2096b, context);
        if (!c2096b.m11741a()) {
            this.f18994c.m11838a(new C2114c(this.f18992a, context), new a(str, mapM11695a, iQueryUrlsCallBack, context, this.f18992a, this.f18993b), str, this.f18995d, i);
            return;
        }
        if (mapM11695a.isEmpty()) {
            Logger.m11686i(f18991e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", str);
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            String str2 = f18991e;
            Logger.m11686i(str2, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapM11695a).toString()));
            Logger.m11686i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(mapM11695a).toString()));
            iQueryUrlsCallBack.onCallBackSuccess(mapM11695a);
        }
    }

    /* renamed from: a */
    public void m11702a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context, int i) {
        C2096b c2096b = new C2096b();
        String str3 = m11695a(str, c2096b, context).get(str2);
        if (!c2096b.m11741a()) {
            this.f18994c.m11838a(new C2114c(this.f18992a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.f18992a, this.f18993b), str, this.f18995d, i);
        } else if (TextUtils.isEmpty(str3)) {
            Logger.m11686i(f18991e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", str, str2);
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            Logger.m11686i(f18991e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            iQueryUrlCallBack.onCallBackSuccess(str3);
        }
    }
}
