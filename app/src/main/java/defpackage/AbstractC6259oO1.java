package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: oO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6259oO1 {
    public static byte a(int i) {
        int iK = k(i, 26);
        int iJ = j(i, 25) & k(i, 52);
        return (byte) (l(j(i, 51) & k(i, 62), i - 4, 0) | l(iK, i + 65, 0) | l(iJ, i + 71, 0) | l(i(i, 62), 45, 0) | l(i(i, 63), 95, 0));
    }

    public static final ReadableArray b(ReadableMap readableMap, String str) {
        if (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) {
            return null;
        }
        return readableMap.getArray(str);
    }

    public static final boolean c(ReadableMap readableMap, String str, boolean z) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? z : readableMap.getBoolean(str);
    }

    public static final double d(ReadableMap readableMap, String str) {
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return -1.0d;
        }
        return readableMap.getDouble(str);
    }

    public static final float e(ReadableMap readableMap, String str, float f) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? f : (float) readableMap.getDouble(str);
    }

    public static final int f(int i, String str, ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? i : readableMap.getInt(str);
    }

    public static final ReadableMap g(ReadableMap readableMap, String str) {
        if (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) {
            return null;
        }
        return readableMap.getMap(str);
    }

    public static final String h(ReadableMap readableMap, String str, String str2) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? str2 : readableMap.getString(str);
    }

    public static int i(int i, int i2) {
        int i3 = i ^ i2;
        return ((~i3) & (i3 - 1)) >>> 63;
    }

    public static int j(int i, int i2) {
        return (int) ((i2 - i) >>> 63);
    }

    public static int k(int i, int i2) {
        return (int) ((i - i2) >>> 63);
    }

    public static int l(int i, int i2, int i3) {
        return ((i - 1) & (i3 ^ i2)) ^ i2;
    }
}
