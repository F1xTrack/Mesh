package p000;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class YN1 {
    /* renamed from: a */
    public static final Boolean m9276a(ReadableMap readableMap, String str) {
        O90.m5968f(readableMap, "<this>");
        if (readableMap.hasKey(str)) {
            return Boolean.valueOf(readableMap.getBoolean(str));
        }
        return null;
    }

    /* renamed from: b */
    public static void m9277b(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* renamed from: c */
    public static void m9278c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static void m9279d(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: e */
    public static void m9280e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: f */
    public static void m9281f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: g */
    public static void m9282g(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* renamed from: h */
    public static void m9283h(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: i */
    public static void m9284i(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: j */
    public static final ArrayList m9285j(ReadableMap readableMap, String str, Function2 function2) {
        O90.m5968f(readableMap, "<this>");
        ReadableArray array = readableMap.getArray(str);
        if (array == null) {
            return null;
        }
        C9461g90 c9461g90M22423h = AbstractC10132lO1.m22423h(0, array.size());
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(c9461g90M22423h));
        Iterator it = c9461g90M22423h.iterator();
        while (((C9333f90) it).f27092c) {
            arrayList.add(function2.invoke(array, Integer.valueOf(((C9333f90) it).m18193a())));
        }
        return arrayList;
    }
}
