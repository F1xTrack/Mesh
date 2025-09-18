package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.e2 */
/* loaded from: classes2.dex */
public class C3222e2 {
    /* renamed from: b */
    private Map<String, String> m15812b(String str) {
        HashMap map = new HashMap();
        if (str != null) {
            int iLastIndexOf = str.lastIndexOf(63);
            if (iLastIndexOf >= 0) {
                str = str.substring(iLastIndexOf + 1);
            }
            if (str.contains(ContainerUtils.KEY_VALUE_DELIMITER)) {
                for (String str2 : str.split(ContainerUtils.FIELD_DELIMITER)) {
                    int iIndexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (iIndexOf >= 0) {
                        map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                    } else {
                        map.put(str2, "");
                    }
                }
            }
        }
        return map;
    }

    /* renamed from: a */
    public C3714x0 m15813a(String str) {
        HashMap map;
        String strDecode = Uri.decode((String) ((HashMap) m15812b(str)).get("appmetrica_deep_link"));
        if (TextUtils.isEmpty(strDecode)) {
            map = null;
        } else {
            HashMap map2 = (HashMap) m15812b(strDecode);
            map = new HashMap(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                map.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        }
        return new C3714x0(strDecode, map, str);
    }
}
