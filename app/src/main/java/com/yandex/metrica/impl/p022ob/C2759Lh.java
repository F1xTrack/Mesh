package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.yandex.metrica.impl.p022ob.C3144b2;
import com.yandex.metrica.impl.p022ob.C3418lg;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Lh */
/* loaded from: classes2.dex */
public class C2759Lh {

    /* renamed from: a */
    private static final Map<C3418lg.e.b.a, String> f21657a = Collections.unmodifiableMap(new a());

    /* renamed from: b */
    private static final Map<C3144b2.d, String> f21658b = Collections.unmodifiableMap(new b());

    /* renamed from: com.yandex.metrica.impl.ob.Lh$a */
    public class a extends HashMap<C3418lg.e.b.a, String> {
        public a() {
            put(C3418lg.e.b.a.COMPLETE, "complete");
            put(C3418lg.e.b.a.ERROR, "error");
            put(C3418lg.e.b.a.OFFLINE, "offline");
            put(C3418lg.e.b.a.INCOMPATIBLE_NETWORK_TYPE, "incompatible_network_type");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Lh$b */
    public class b extends HashMap<C3144b2.d, String> {
        public b() {
            put(C3144b2.d.WIFI, "wifi");
            put(C3144b2.d.CELL, "cell");
            put(C3144b2.d.OFFLINE, "offline");
            put(C3144b2.d.UNDEFINED, StringUtils.UNDEFINED);
        }
    }

    /* renamed from: a */
    public String m14542a(C3418lg.e.b bVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(NotificationConstants.f19487ID, bVar.m16414d().f24209a);
            jSONObject.putOpt("url", bVar.m16414d().f24210b);
            jSONObject.putOpt("status", f21657a.get(bVar.m16418h()));
            jSONObject.putOpt("code", bVar.m16416f());
            if (!C2968U2.m15246a(bVar.m16415e())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.m16415e(), 0));
            } else if (!C2968U2.m15246a(bVar.m16412b())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.m16412b(), 0));
            }
            jSONObject.putOpt("headers", m14541a(bVar.m16417g()));
            Throwable thM16413c = bVar.m16413c();
            if (thM16413c != null) {
                str = thM16413c.toString() + "\n" + Log.getStackTraceString(thM16413c);
            } else {
                str = null;
            }
            jSONObject.putOpt("error", str);
            jSONObject.putOpt("network_type", f21658b.get(bVar.m16406a()));
            return jSONObject.toString();
        } catch (Throwable th) {
            return th.toString();
        }
    }

    /* renamed from: a */
    private JSONObject m14541a(Map<String, List<String>> map) throws JSONException {
        if (C2968U2.m15250b(map)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!C2968U2.m15249b(entry.getValue())) {
                List<String> value = entry.getValue();
                if (value.size() > 10) {
                    ArrayList arrayList = new ArrayList(10);
                    for (int i = 0; i < 10; i++) {
                        arrayList.add(value.get(i));
                    }
                    value = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : value) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList2.add(C2968U2.m15232a(str, 100));
                    }
                }
                jSONObject.putOpt(key, TextUtils.join(StringUtils.COMMA, arrayList2));
            }
        }
        return jSONObject;
    }
}
