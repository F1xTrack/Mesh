package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import com.huawei.hms.support.api.entity.core.CommonCode;
import io.sentry.protocol.DebugImage;

/* loaded from: classes2.dex */
public class Z6 {
    private static SparseArray<Z6> c;
    public final String a;
    public final String b;

    static {
        SparseArray<Z6> sparseArray = new SparseArray<>();
        c = sparseArray;
        sparseArray.put(EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED.b(), new Z6(DebugImage.JVM, "binder"));
        c.put(EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), new Z6(DebugImage.JVM, "binder"));
        c.put(EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b(), new Z6(DebugImage.JVM, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK));
        c.put(EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b(), new Z6(DebugImage.JVM, "file"));
        c.put(EnumC2865k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH.b(), new Z6("jni_native", "file"));
        c.put(EnumC2865k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF.b(), new Z6("jni_native", "file"));
        c.put(EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH.b(), new Z6("jni_native", "file"));
        c.put(EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF.b(), new Z6("jni_native", "file"));
        c.put(EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF.b(), new Z6("jni_native", "file"));
        c.put(EnumC2865k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF.b(), new Z6("jni_native", "binder"));
    }

    private Z6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static Z6 a(int i) {
        return c.get(i);
    }
}
