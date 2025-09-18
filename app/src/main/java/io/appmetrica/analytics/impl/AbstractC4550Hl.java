package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Hl */
/* loaded from: classes2.dex */
public abstract class AbstractC4550Hl {
    /* renamed from: a */
    public static String m19475a(Map map) {
        if (AbstractC5182hn.m20514a(map)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append((String) entry.getValue());
            sb.append(StringUtils.COMMA);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: b */
    public static HashMap m19478b(Map map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!TextUtils.isEmpty(str) && !str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER) && !str.contains(StringUtils.COMMA) && !str.contains(ContainerUtils.FIELD_DELIMITER)) {
                    String str2 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str2) && ParseUtils.parseLong(str2, -1L) != -1) {
                        map2.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        return map2;
    }

    /* renamed from: a */
    public static HashMap m19476a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(StringUtils.COMMA)) {
                int iIndexOf = str2.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                if (iIndexOf != -1) {
                    map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                }
            }
        }
        return map;
    }

    /* renamed from: a */
    public static boolean m19477a(HashMap map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            try {
                Integer.parseInt((String) ((Map.Entry) it.next()).getValue());
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }
}
