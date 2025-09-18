package com.facebook.react.bridge;

import com.facebook.yoga.YogaValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public class DimensionPropConverter {
    public static YogaValue getDimension(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return new YogaValue(((Double) obj).floatValue(), 2);
        }
        if (!(obj instanceof String)) {
            throw new JSApplicationCausedNativeException("DimensionValue: the value must be a number or string.");
        }
        String str = (String) obj;
        if (StringUtils.UNDEFINED.equals(str)) {
            return YogaValue.f17999c;
        }
        if ("auto".equals(str)) {
            return YogaValue.f18000d;
        }
        return str.endsWith("%") ? new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), 3) : new YogaValue(Float.parseFloat(str), 2);
    }
}
