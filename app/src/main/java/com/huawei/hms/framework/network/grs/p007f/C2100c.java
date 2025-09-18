package com.huawei.hms.framework.network.grs.p007f;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.local.model.C2123a;
import com.huawei.hms.framework.network.grs.local.model.C2124b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.f.c */
/* loaded from: classes.dex */
public class C2100c extends AbstractC2098a {
    public C2100c(Context context, boolean z) {
        this.f19038d = z;
        if (m11752a("grs_sdk_global_route_config.json", context) == 0) {
            this.f19037c = true;
        }
    }

    /* renamed from: a */
    public List<C2124b> m11774a(JSONArray jSONArray, JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? new ArrayList() : m11773a(jSONObject);
    }

    @Override // com.huawei.hms.framework.network.grs.p007f.AbstractC2098a
    /* renamed from: b */
    public int mo11759b(String str) throws JSONException {
        this.f19035a = new C2123a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("application");
            String string = jSONObject.getString("name");
            long j = jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f19035a.m11880b(string);
            this.f19035a.m11878a(j);
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (JSONException e) {
            Logger.m11691w("LocalManagerV1", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.p007f.AbstractC2098a
    /* renamed from: c */
    public int mo11762c(String str) throws JSONException {
        JSONObject jSONObject;
        this.f19036b = new ArrayList(16);
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("countryOrAreaGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryOrAreaGroups");
            } else if (jSONObject2.has("countryGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryGroups");
            } else {
                Logger.m11682e("LocalManagerV1", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONObject = null;
            }
            if (jSONObject == null) {
                return -1;
            }
            if (jSONObject.length() != 0) {
                this.f19036b.addAll(m11773a(jSONObject));
            }
            return 0;
        } catch (JSONException e) {
            Logger.m11691w("LocalManagerV1", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x010f A[Catch: JSONException -> 0x0072, TryCatch #0 {JSONException -> 0x0072, blocks: (B:71:0x000c, B:72:0x001d, B:74:0x0023, B:76:0x0039, B:78:0x0042, B:79:0x0056, B:81:0x005c, B:83:0x006d, B:92:0x0089, B:93:0x009f, B:95:0x00a5, B:97:0x00b9, B:99:0x00bf, B:101:0x00d0, B:86:0x0075, B:88:0x007b, B:90:0x0082, B:102:0x00e4, B:104:0x00ef, B:108:0x00fe, B:110:0x0108, B:112:0x010f, B:113:0x0116, B:105:0x00f4, B:107:0x00fa, B:109:0x0103), top: B:119:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a5 A[Catch: JSONException -> 0x0072, TryCatch #0 {JSONException -> 0x0072, blocks: (B:71:0x000c, B:72:0x001d, B:74:0x0023, B:76:0x0039, B:78:0x0042, B:79:0x0056, B:81:0x005c, B:83:0x006d, B:92:0x0089, B:93:0x009f, B:95:0x00a5, B:97:0x00b9, B:99:0x00bf, B:101:0x00d0, B:86:0x0075, B:88:0x007b, B:90:0x0082, B:102:0x00e4, B:104:0x00ef, B:108:0x00fe, B:110:0x0108, B:112:0x010f, B:113:0x0116, B:105:0x00f4, B:107:0x00fa, B:109:0x0103), top: B:119:0x000c }] */
    @Override // com.huawei.hms.framework.network.grs.p007f.AbstractC2098a
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo11766f(java.lang.String r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p007f.C2100c.mo11766f(java.lang.String):int");
    }

    /* renamed from: a */
    private List<C2124b> m11773a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C2124b c2124b = new C2124b();
                c2124b.m11885b(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                c2124b.m11886c(jSONObject2.getString("name"));
                c2124b.m11882a(jSONObject2.getString("description"));
                if (jSONObject2.has("countriesOrAreas")) {
                    jSONArray = jSONObject2.getJSONArray("countriesOrAreas");
                } else if (jSONObject2.has("countries")) {
                    jSONArray = jSONObject2.getJSONArray("countries");
                } else {
                    Logger.m11689w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    jSONArray = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray != null && jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        hashSet.add((String) jSONArray.get(i));
                    }
                    c2124b.m11883a(hashSet);
                    arrayList.add(c2124b);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.m11691w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return new ArrayList();
        }
    }
}
