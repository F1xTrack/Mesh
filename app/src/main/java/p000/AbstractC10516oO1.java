package p000;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: oO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10516oO1 {
    /* renamed from: a */
    public static byte m23376a(int i) {
        int iM23386k = m23386k(i, 26);
        int iM23385j = m23385j(i, 25) & m23386k(i, 52);
        return (byte) (m23387l(m23385j(i, 51) & m23386k(i, 62), i - 4, 0) | m23387l(iM23386k, i + 65, 0) | m23387l(iM23385j, i + 71, 0) | m23387l(m23384i(i, 62), 45, 0) | m23387l(m23384i(i, 63), 95, 0));
    }

    /* renamed from: b */
    public static final ReadableArray m23377b(ReadableMap readableMap, String str) {
        if (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) {
            return null;
        }
        return readableMap.getArray(str);
    }

    /* renamed from: c */
    public static final boolean m23378c(ReadableMap readableMap, String str, boolean z) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? z : readableMap.getBoolean(str);
    }

    /* renamed from: d */
    public static final double m23379d(ReadableMap readableMap, String str) {
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return -1.0d;
        }
        return readableMap.getDouble(str);
    }

    /* renamed from: e */
    public static final float m23380e(ReadableMap readableMap, String str, float f) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? f : (float) readableMap.getDouble(str);
    }

    /* renamed from: f */
    public static final int m23381f(int i, String str, ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? i : readableMap.getInt(str);
    }

    /* renamed from: g */
    public static final ReadableMap m23382g(ReadableMap readableMap, String str) {
        if (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) {
            return null;
        }
        return readableMap.getMap(str);
    }

    /* renamed from: h */
    public static final String m23383h(ReadableMap readableMap, String str, String str2) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? str2 : readableMap.getString(str);
    }

    /* renamed from: i */
    public static int m23384i(int i, int i2) {
        int i3 = i ^ i2;
        return ((~i3) & (i3 - 1)) >>> 63;
    }

    /* renamed from: j */
    public static int m23385j(int i, int i2) {
        return (int) ((i2 - i) >>> 63);
    }

    /* renamed from: k */
    public static int m23386k(int i, int i2) {
        return (int) ((i - i2) >>> 63);
    }

    /* renamed from: l */
    public static int m23387l(int i, int i2, int i3) {
        return ((i - 1) & (i3 ^ i2)) ^ i2;
    }
}
