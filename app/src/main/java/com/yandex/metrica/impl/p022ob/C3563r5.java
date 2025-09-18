package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.yandex.metrica.impl.p022ob.C3498oi;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.r5 */
/* loaded from: classes2.dex */
public class C3563r5 extends AbstractC3589s5 {
    public C3563r5(C3250f4 c3250f4) {
        super(c3250f4);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3459n5
    /* renamed from: a */
    public boolean mo13844a(C3376k0 c3376k0) {
        String strM16246p = c3376k0.m16246p();
        if (TextUtils.isEmpty(strM16246p)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM16246p);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            m16718a().m15923w().m14300l();
            if (!m16652a(jSONObject.optString("link"))) {
                return false;
            }
            c3376k0.m16225a(Boolean.TRUE);
            m16718a().m15923w().m14299k();
            m16718a().m15896C();
            m16718a().m15911j().m15981a();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m16652a(String str) {
        Object obj;
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C3498oi c3498oiM14876b = m16718a().m15922v().m14876b();
                    for (String str2 : queryParameter.split(ContainerUtils.FIELD_DELIMITER)) {
                        int iIndexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                        if (iIndexOf >= 0) {
                            String strDecode = Uri.decode(str2.substring(0, iIndexOf));
                            String strDecode2 = Uri.decode(str2.substring(iIndexOf + 1));
                            if ("reattribution".equals(strDecode) && "1".equals(strDecode2)) {
                                return true;
                            }
                            if (c3498oiM14876b != null) {
                                for (Pair<String, C3498oi.a> pair : c3498oiM14876b.f24393a) {
                                    if (C2968U2.m15245a(pair.first, strDecode) && ((obj = pair.second) == null || ((C3498oi.a) obj).f24394a.equals(strDecode2))) {
                                        return true;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
