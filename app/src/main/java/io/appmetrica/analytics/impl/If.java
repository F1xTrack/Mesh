package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class If {
    public static H7 a(String str) {
        HashMap map;
        String strDecode = Uri.decode((String) b(str).get("appmetrica_deep_link"));
        if (TextUtils.isEmpty(strDecode)) {
            map = null;
        } else {
            HashMap mapB = b(strDecode);
            map = new HashMap(mapB.size());
            for (Map.Entry entry : mapB.entrySet()) {
                map.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        }
        return new H7(strDecode, map, str);
    }

    public static HashMap b(String str) {
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
}
