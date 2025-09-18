package com.huawei.hms.framework.network.grs.p008g.p009i;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.p008g.p010j.C2115d;
import com.huawei.hms.framework.network.grs.p011h.C2118c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.g.i.a */
/* loaded from: classes.dex */
public class C2111a {

    /* renamed from: a */
    private static final String f19101a = "a";

    /* renamed from: b */
    private static C2115d f19102b;

    /* renamed from: c */
    private static final Object f19103c = new Object();

    /* renamed from: a */
    public static synchronized C2115d m11842a(Context context) {
        synchronized (f19103c) {
            C2115d c2115d = f19102b;
            if (c2115d != null) {
                return c2115d;
            }
            String strM11866a = C2118c.m11866a(GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json", context);
            ArrayList arrayList = null;
            if (TextUtils.isEmpty(strM11866a)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(strM11866a).getJSONObject("grs_server");
                JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                if (jSONArray != null && jSONArray.length() > 0) {
                    arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.get(i).toString());
                    }
                }
                C2115d c2115d2 = new C2115d();
                f19102b = c2115d2;
                c2115d2.m11855a(arrayList);
                f19102b.m11854a(jSONObject.getString("grs_query_endpoint_2.0"));
                f19102b.m11853a(jSONObject.getInt("grs_query_timeout"));
            } catch (JSONException e) {
                Logger.m11691w(f19101a, "getGrsServerBean catch JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            }
            return f19102b;
        }
    }
}
