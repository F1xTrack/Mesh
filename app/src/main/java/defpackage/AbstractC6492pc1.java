package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: pc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6492pc1 {
    public static final C6987sD a = new C6987sD(8);

    public static double a(ReadableMap readableMap, String str) {
        double d;
        boolean z = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            d = Float.parseFloat(string);
        } else {
            d = readableMap.getDouble(str);
        }
        return z ? d : (d * 3.141592653589793d) / 180;
    }

    public static double b(String str, double d) {
        try {
            return str.endsWith("%") ? (Double.parseDouble(str.substring(0, str.length() - 1)) * d) / 100.0d : Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            AbstractC3393dS.p("ReactNative");
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
    }

    public static void c(ReadableArray readableArray, double[] dArr, float f, float f2, ReadableArray readableArray2, boolean z) {
        float[] fArr;
        int i;
        double dB;
        double[] dArr2 = (double[]) a.get();
        AbstractC1500Sz1.o(dArr);
        if (readableArray2 == null || (f2 == 0.0f && f == 0.0f)) {
            fArr = null;
        } else {
            float f3 = f / 2.0f;
            float f4 = f2 / 2.0f;
            float[] fArr2 = new float[3];
            fArr2[0] = f3;
            fArr2[1] = f4;
            fArr2[2] = 0.0f;
            int i2 = 0;
            while (i2 < readableArray2.size() && i2 < 3) {
                int i3 = AbstractC6301oc1.a[readableArray2.getType(i2).ordinal()];
                if (i3 == 1) {
                    fArr2[i2] = (float) readableArray2.getDouble(i2);
                } else if (i3 == 2 && z) {
                    String string = readableArray2.getString(i2);
                    if (string.endsWith("%")) {
                        fArr2[i2] = ((i2 == 0 ? f : f2) * Float.parseFloat(string.substring(0, string.length() - 1))) / 100.0f;
                    }
                }
                i2++;
            }
            fArr = new float[]{(-f3) + fArr2[0], (-f4) + fArr2[1], fArr2[2]};
        }
        if (fArr != null) {
            AbstractC1500Sz1.o(dArr2);
            AbstractC1500Sz1.c(dArr2, fArr[0], fArr[1], fArr[2]);
            AbstractC1500Sz1.j(dArr, dArr, dArr2);
        }
        int i4 = 16;
        if (readableArray.size() == 16 && readableArray.getType(0) == ReadableType.Number) {
            AbstractC1500Sz1.o(dArr2);
            for (int i5 = 0; i5 < readableArray.size(); i5++) {
                dArr2[i5] = readableArray.getDouble(i5);
            }
            AbstractC1500Sz1.j(dArr, dArr, dArr2);
        } else {
            int size = readableArray.size();
            int i6 = 0;
            while (i6 < size) {
                ReadableMap map = readableArray.getMap(i6);
                String strNextKey = map.keySetIterator().nextKey();
                AbstractC1500Sz1.o(dArr2);
                if ("matrix".equals(strNextKey)) {
                    ReadableArray array = map.getArray(strNextKey);
                    for (int i7 = 0; i7 < i4; i7++) {
                        dArr2[i7] = array.getDouble(i7);
                    }
                } else if ("perspective".equals(strNextKey)) {
                    dArr2[11] = (-1) / map.getDouble(strNextKey);
                } else if ("rotateX".equals(strNextKey)) {
                    double dA = a(map, strNextKey);
                    dArr2[5] = Math.cos(dA);
                    dArr2[6] = Math.sin(dA);
                    dArr2[9] = -Math.sin(dA);
                    dArr2[10] = Math.cos(dA);
                } else if ("rotateY".equals(strNextKey)) {
                    double dA2 = a(map, strNextKey);
                    dArr2[0] = Math.cos(dA2);
                    dArr2[2] = -Math.sin(dA2);
                    dArr2[8] = Math.sin(dA2);
                    dArr2[10] = Math.cos(dA2);
                } else if ("rotate".equals(strNextKey) || "rotateZ".equals(strNextKey)) {
                    i = i6;
                    double dA3 = a(map, strNextKey);
                    dArr2[0] = Math.cos(dA3);
                    dArr2[1] = Math.sin(dA3);
                    dArr2[4] = -Math.sin(dA3);
                    dArr2[5] = Math.cos(dA3);
                    AbstractC1500Sz1.j(dArr, dArr, dArr2);
                    i6 = i + 1;
                    i4 = 16;
                } else if ("scale".equals(strNextKey)) {
                    double d = map.getDouble(strNextKey);
                    dArr2[0] = d;
                    dArr2[5] = d;
                } else if ("scaleX".equals(strNextKey)) {
                    dArr2[0] = map.getDouble(strNextKey);
                } else if ("scaleY".equals(strNextKey)) {
                    dArr2[5] = map.getDouble(strNextKey);
                } else {
                    if ("translate".equals(strNextKey)) {
                        ReadableArray array2 = map.getArray(strNextKey);
                        ReadableType type = array2.getType(0);
                        ReadableType readableType = ReadableType.String;
                        if (type == readableType && z) {
                            i = i6;
                            dB = b(array2.getString(0), f);
                        } else {
                            i = i6;
                            dB = array2.getDouble(0);
                        }
                        AbstractC1500Sz1.c(dArr2, dB, (array2.getType(1) == readableType && z) ? b(array2.getString(1), f2) : array2.getDouble(1), array2.size() > 2 ? array2.getDouble(2) : ConfigValue.DOUBLE_DEFAULT_VALUE);
                    } else {
                        i = i6;
                        if ("translateX".equals(strNextKey)) {
                            dArr2[12] = (map.getType(strNextKey) == ReadableType.String && z) ? b(map.getString(strNextKey), f) : map.getDouble(strNextKey);
                            dArr2[13] = 0.0d;
                        } else if ("translateY".equals(strNextKey)) {
                            double dB2 = (map.getType(strNextKey) == ReadableType.String && z) ? b(map.getString(strNextKey), f2) : map.getDouble(strNextKey);
                            dArr2[12] = 0.0d;
                            dArr2[13] = dB2;
                        } else if ("skewX".equals(strNextKey)) {
                            dArr2[4] = Math.tan(a(map, strNextKey));
                        } else if ("skewY".equals(strNextKey)) {
                            dArr2[1] = Math.tan(a(map, strNextKey));
                        } else {
                            AbstractC3393dS.p("ReactNative");
                        }
                    }
                    AbstractC1500Sz1.j(dArr, dArr, dArr2);
                    i6 = i + 1;
                    i4 = 16;
                }
                i = i6;
                AbstractC1500Sz1.j(dArr, dArr, dArr2);
                i6 = i + 1;
                i4 = 16;
            }
        }
        if (fArr != null) {
            AbstractC1500Sz1.o(dArr2);
            AbstractC1500Sz1.c(dArr2, -fArr[0], -fArr[1], -fArr[2]);
            AbstractC1500Sz1.j(dArr, dArr, dArr2);
        }
    }
}
