package io.appmetrica.analytics.impl;

import android.database.Cursor;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hn */
/* loaded from: classes2.dex */
public abstract class AbstractC5182hn {
    /* renamed from: a */
    public static boolean m20511a(Object obj) {
        return obj != null;
    }

    /* renamed from: a */
    public static void m20510a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m20509a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* renamed from: a */
    public static boolean m20512a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static boolean m20514a(Map map) {
        return map == null || map.size() == 0;
    }

    /* renamed from: a */
    public static boolean m20513a(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static BigDecimal m20508a(long j) {
        return new BigDecimal(j).divide(new BigDecimal(1000000), 6, 6);
    }

    /* renamed from: a */
    public static double m20507a(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d)) ? ConfigValue.DOUBLE_DEFAULT_VALUE : d;
    }
}
