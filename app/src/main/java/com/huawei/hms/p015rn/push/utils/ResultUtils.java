package com.huawei.hms.p015rn.push.utils;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;
import com.huawei.hms.p015rn.push.constants.Core;
import com.huawei.hms.p015rn.push.constants.ResultCode;

/* loaded from: classes.dex */
public class ResultUtils {
    private ResultUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static void handleResult(boolean z, Object obj, Promise promise) {
        handleResult(z, obj, promise, "0");
    }

    public static void handleResult(boolean z, Object obj, Promise promise, String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        MapUtils.put(writableNativeMap, Core.Event.Result.RESULT_CODE, str);
        MapUtils.put(writableNativeMap, "result", obj);
        if (z) {
            promise.resolve(writableNativeMap);
        } else {
            promise.reject(ResultCode.RESULT_FAILURE, (String) obj);
        }
    }
}
