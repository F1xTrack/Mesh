package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class YN1 {
    public static final Boolean a(ReadableMap readableMap, String str) {
        O90.f(readableMap, "<this>");
        if (readableMap.hasKey(str)) {
            return Boolean.valueOf(readableMap.getBoolean(str));
        }
        return null;
    }

    public static void b(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void g(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static final ArrayList j(ReadableMap readableMap, String str, Function2 function2) {
        O90.f(readableMap, "<this>");
        ReadableArray array = readableMap.getArray(str);
        if (array == null) {
            return null;
        }
        C3909g90 c3909g90H = AbstractC5686lO1.h(0, array.size());
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(c3909g90H));
        Iterator it = c3909g90H.iterator();
        while (((C3718f90) it).c) {
            arrayList.add(function2.invoke(array, Integer.valueOf(((C3718f90) it).a())));
        }
        return arrayList;
    }
}
