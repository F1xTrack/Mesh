package com.huawei.hms.p015rn.availability;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Util {
    private Util() {
    }

    public static WritableMap mapToWM(Map<String, Integer> map) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            writableNativeMap.putInt(entry.getKey(), entry.getValue().intValue());
        }
        return writableNativeMap;
    }
}
