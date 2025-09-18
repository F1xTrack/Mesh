package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.yandex.metrica.impl.ob.C2982oi;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.r5 */
/* loaded from: classes2.dex */
public class C3043r5 extends AbstractC3068s5 {
    public C3043r5(C2744f4 c2744f4) {
        super(c2744f4);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        String strP = c2864k0.p();
        if (TextUtils.isEmpty(strP)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strP);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            a().w().l();
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            c2864k0.a(Boolean.TRUE);
            a().w().k();
            a().C();
            a().j().a();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean a(String str) {
        Object obj;
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C2982oi c2982oiB = a().v().b();
                    for (String str2 : queryParameter.split(ContainerUtils.FIELD_DELIMITER)) {
                        int iIndexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                        if (iIndexOf >= 0) {
                            String strDecode = Uri.decode(str2.substring(0, iIndexOf));
                            String strDecode2 = Uri.decode(str2.substring(iIndexOf + 1));
                            if ("reattribution".equals(strDecode) && "1".equals(strDecode2)) {
                                return true;
                            }
                            if (c2982oiB != null) {
                                for (Pair<String, C2982oi.a> pair : c2982oiB.a) {
                                    if (U2.a(pair.first, strDecode) && ((obj = pair.second) == null || ((C2982oi.a) obj).a.equals(strDecode2))) {
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
