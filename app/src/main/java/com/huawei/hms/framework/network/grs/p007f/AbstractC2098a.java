package com.huawei.hms.framework.network.grs.p007f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.local.model.C2123a;
import com.huawei.hms.framework.network.grs.local.model.C2124b;
import com.huawei.hms.framework.network.grs.local.model.C2125c;
import com.huawei.hms.framework.network.grs.local.model.C2126d;
import com.huawei.hms.framework.network.grs.p006e.C2095a;
import com.huawei.hms.framework.network.grs.p011h.C2118c;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.f.a */
/* loaded from: classes.dex */
public abstract class AbstractC2098a {

    /* renamed from: a */
    protected C2123a f19035a;

    /* renamed from: b */
    protected List<C2124b> f19036b;

    /* renamed from: c */
    protected boolean f19037c = false;

    /* renamed from: d */
    protected boolean f19038d = false;

    /* renamed from: e */
    protected Set<String> f19039e = new HashSet(16);

    /* renamed from: b */
    private int m11749b(String str, Context context) {
        if (m11750g(C2118c.m11866a(str, context)) != 0) {
            return -1;
        }
        Logger.m11686i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str);
        return 0;
    }

    /* renamed from: g */
    private int m11750g(String str) {
        int iMo11762c;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (this.f19038d && (iMo11762c = mo11762c(str)) != 0) {
            return iMo11762c;
        }
        int iMo11759b = mo11759b(str);
        return iMo11759b != 0 ? iMo11759b : mo11766f(str);
    }

    /* renamed from: h */
    private int m11751h(String str) {
        List<C2124b> list;
        int iM11764d;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return (!this.f19038d || !((list = this.f19036b) == null || list.isEmpty()) || (iM11764d = m11764d(str)) == 0) ? m11765e(str) : iM11764d;
    }

    /* renamed from: a */
    public int m11752a(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(GrsApp.getInstance().getBrand("/"));
        sb.append(str);
        return m11749b(sb.toString(), context) != 0 ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo11759b(String str);

    /* renamed from: c */
    public abstract int mo11762c(String str);

    /* renamed from: c */
    public boolean m11763c() {
        return this.f19037c;
    }

    /* renamed from: d */
    public int m11764d(String str) throws JSONException {
        JSONArray jSONArray;
        this.f19036b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.m11682e("AbstractLocalManager", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            this.f19036b.addAll(m11756a(jSONArray));
            return 0;
        } catch (JSONException e) {
            Logger.m11691w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    /* renamed from: e */
    public int m11765e(String str) {
        try {
            m11761b(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e) {
            Logger.m11691w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    /* renamed from: f */
    public abstract int mo11766f(String str);

    /* renamed from: a */
    public C2123a m11753a() {
        return this.f19035a;
    }

    /* renamed from: b */
    public Set<String> m11760b() {
        return this.f19039e;
    }

    /* renamed from: a */
    public String m11754a(Context context, C2095a c2095a, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        Map<String, String> mapM11757a = m11757a(context, c2095a, grsBaseInfo, str, z);
        if (mapM11757a != null) {
            return mapM11757a.get(str2);
        }
        Logger.m11691w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0065 A[PHI: r13
  0x0065: PHI (r13v5 java.lang.String) = (r13v0 java.lang.String), (r13v1 java.lang.String) binds: [B:78:0x0063, B:81:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ca A[PHI: r8
  0x00ca: PHI (r8v10 java.lang.String) = (r8v8 java.lang.String), (r8v9 java.lang.String) binds: [B:94:0x00c8, B:97:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m11761b(org.json.JSONArray r18) throws org.json.JSONException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Lf8
            int r4 = r18.length()
            if (r4 != 0) goto L10
            goto Lf8
        L10:
            r4 = r2
        L11:
            int r5 = r18.length()
            if (r4 >= r5) goto Lf8
            org.json.JSONObject r5 = r1.getJSONObject(r4)
            com.huawei.hms.framework.network.grs.local.model.c r6 = new com.huawei.hms.framework.network.grs.local.model.c
            r6.<init>()
            java.lang.String r7 = "name"
            java.lang.String r7 = r5.getString(r7)
            r6.m11892b(r7)
            java.util.Set<java.lang.String> r8 = r0.f19039e
            boolean r8 = r8.contains(r7)
            if (r8 != 0) goto Lf5
            java.util.Set<java.lang.String> r8 = r0.f19039e
            r8.add(r7)
            boolean r8 = r0.f19038d
            if (r8 == 0) goto Lf5
            java.lang.String r8 = "routeBy"
            java.lang.String r8 = r5.getString(r8)
            r6.m11893c(r8)
            java.lang.String r8 = "servings"
            org.json.JSONArray r8 = r5.getJSONArray(r8)
            r9 = r2
        L4a:
            int r10 = r8.length()
            java.lang.String r11 = "AbstractLocalManager"
            if (r9 >= r10) goto Lc2
            java.lang.Object r10 = r8.get(r9)
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            com.huawei.hms.framework.network.grs.local.model.d r12 = new com.huawei.hms.framework.network.grs.local.model.d
            r12.<init>()
            java.lang.String r13 = "countryOrAreaGroup"
            boolean r14 = r10.has(r13)
            if (r14 == 0) goto L6a
        L65:
            java.lang.String r11 = r10.getString(r13)
            goto L7e
        L6a:
            java.lang.String r13 = "countryGroup"
            boolean r14 = r10.has(r13)
            if (r14 == 0) goto L73
            goto L65
        L73:
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r2] = r7
            java.lang.String r14 = "maybe this service{%s} routeBy is unconditional."
            com.huawei.hms.framework.common.Logger.m11688v(r11, r14, r13)
            java.lang.String r11 = "no-country"
        L7e:
            r12.m11895a(r11)
            java.lang.String r11 = "addresses"
            org.json.JSONObject r10 = r10.getJSONObject(r11)
            java.util.concurrent.ConcurrentHashMap r11 = new java.util.concurrent.ConcurrentHashMap
            r13 = 16
            r11.<init>(r13)
            java.util.Iterator r13 = r10.keys()
        L92:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lb6
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = r10.getString(r14)
            boolean r16 = android.text.TextUtils.isEmpty(r14)
            if (r16 != 0) goto L92
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L92
            java.lang.String r15 = r10.getString(r14)
            r11.put(r14, r15)
            goto L92
        Lb6:
            r12.m11896a(r11)
            java.lang.String r10 = r12.m11897b()
            r6.m11889a(r10, r12)
            int r9 = r9 + r3
            goto L4a
        Lc2:
            java.lang.String r8 = "countryOrAreaGroups"
            boolean r9 = r5.has(r8)
            if (r9 == 0) goto Ld3
        Lca:
            org.json.JSONArray r5 = r5.getJSONArray(r8)
            java.util.List r5 = r0.m11756a(r5)
            goto Le2
        Ld3:
            java.lang.String r8 = "countryGroups"
            boolean r9 = r5.has(r8)
            if (r9 == 0) goto Ldc
            goto Lca
        Ldc:
            java.lang.String r5 = "service use default countryOrAreaGroup"
            com.huawei.hms.framework.common.Logger.m11685i(r11, r5)
            r5 = 0
        Le2:
            r6.m11890a(r5)
            com.huawei.hms.framework.network.grs.local.model.a r5 = r0.f19035a
            if (r5 != 0) goto Lf0
            com.huawei.hms.framework.network.grs.local.model.a r5 = new com.huawei.hms.framework.network.grs.local.model.a
            r5.<init>()
            r0.f19035a = r5
        Lf0:
            com.huawei.hms.framework.network.grs.local.model.a r5 = r0.f19035a
            r5.m11879a(r7, r6)
        Lf5:
            int r4 = r4 + r3
            goto L11
        Lf8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p007f.AbstractC2098a.m11761b(org.json.JSONArray):void");
    }

    /* renamed from: a */
    public String m11755a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("no_route_country".equals(str)) {
            return "no-country";
        }
        List<C2124b> list = this.f19036b;
        if (list != null && !list.isEmpty()) {
            for (C2124b c2124b : this.f19036b) {
                if (c2124b.m11881a().contains(str)) {
                    return c2124b.m11884b();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C2124b> m11756a(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C2124b c2124b = new C2124b();
                c2124b.m11885b(jSONObject.getString(NotificationConstants.f19487ID));
                c2124b.m11886c(jSONObject.getString("name"));
                c2124b.m11882a(jSONObject.getString("description"));
                if (jSONObject.has("countriesOrAreas")) {
                    jSONArray2 = jSONObject.getJSONArray("countriesOrAreas");
                } else if (jSONObject.has("countries")) {
                    jSONArray2 = jSONObject.getJSONArray("countries");
                } else {
                    Logger.m11689w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    jSONArray2 = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray2 != null && jSONArray2.length() != 0) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        hashSet.add((String) jSONArray2.get(i2));
                    }
                    c2124b.m11883a(hashSet);
                    arrayList.add(c2124b);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.m11691w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public Map<String, String> m11757a(Context context, C2095a c2095a, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        C2123a c2123a = this.f19035a;
        if (c2123a == null) {
            Logger.m11689w("AbstractLocalManager", "application data is null.");
            return null;
        }
        C2125c c2125cM11876a = c2123a.m11876a(str);
        if (c2125cM11876a == null) {
            Logger.m11691w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String strM11776b = C2102e.m11776b(context, c2095a, c2125cM11876a.m11891b(), grsBaseInfo, z);
        if (strM11776b == null) {
            Logger.m11691w("AbstractLocalManager", "country not found by routeby in local config{%s}", c2125cM11876a.m11891b());
            return null;
        }
        List<C2124b> listM11888a = c2125cM11876a.m11888a();
        C2126d c2126dM11887a = c2125cM11876a.m11887a((listM11888a == null || listM11888a.size() == 0) ? m11755a(strM11776b) : m11748a(listM11888a, grsBaseInfo, strM11776b).get(strM11776b));
        if (c2126dM11887a == null) {
            return null;
        }
        return c2126dM11887a.m11894a();
    }

    /* renamed from: a */
    private Map<String, String> m11748a(List<C2124b> list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        for (C2124b c2124b : list) {
            if (c2124b.m11881a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), c2124b.m11884b());
            }
            if (c2124b.m11881a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), c2124b.m11884b());
            }
            if (c2124b.m11881a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), c2124b.m11884b());
            }
            if (c2124b.m11881a().contains(str)) {
                Logger.m11687v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, c2124b.m11884b());
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    public void m11758a(Context context, List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            Logger.m11680d("AbstractLocalManager", "getBatchLoadSdkSuccessFlag file:" + str);
            if (TextUtils.isEmpty(str) || !Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str)) {
                Logger.m11686i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, skipped.", str);
            } else {
                if (m11751h(C2118c.m11866a(GrsApp.getInstance().getBrand("/") + str, context)) == 0) {
                    Logger.m11686i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, sucess.", str);
                } else {
                    Logger.m11686i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, failure.", str);
                }
            }
        }
    }
}
