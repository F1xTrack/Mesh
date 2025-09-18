package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;

@KeepForSdk
/* loaded from: classes.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(StringBuilder sb, HashMap<String, String> map) {
        sb.append("{");
        boolean z = true;
        for (String str : map.keySet()) {
            if (!z) {
                sb.append(StringUtils.COMMA);
            }
            String str2 = map.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
