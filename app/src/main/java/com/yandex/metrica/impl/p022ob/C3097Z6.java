package com.yandex.metrica.impl.p022ob;

import android.util.SparseArray;
import com.huawei.hms.support.api.entity.core.CommonCode;
import io.sentry.protocol.DebugImage;

/* renamed from: com.yandex.metrica.impl.ob.Z6 */
/* loaded from: classes2.dex */
public class C3097Z6 {

    /* renamed from: c */
    private static SparseArray<C3097Z6> f22935c;

    /* renamed from: a */
    public final String f22936a;

    /* renamed from: b */
    public final String f22937b;

    static {
        SparseArray<C3097Z6> sparseArray = new SparseArray<>();
        f22935c = sparseArray;
        sparseArray.put(EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED.m16250b(), new C3097Z6(DebugImage.JVM, "binder"));
        f22935c.put(EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.m16250b(), new C3097Z6(DebugImage.JVM, "binder"));
        f22935c.put(EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.m16250b(), new C3097Z6(DebugImage.JVM, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK));
        f22935c.put(EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.m16250b(), new C3097Z6(DebugImage.JVM, "file"));
        f22935c.put(EnumC3377k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH.m16250b(), new C3097Z6("jni_native", "file"));
        f22935c.put(EnumC3377k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF.m16250b(), new C3097Z6("jni_native", "file"));
        f22935c.put(EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH.m16250b(), new C3097Z6("jni_native", "file"));
        f22935c.put(EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF.m16250b(), new C3097Z6("jni_native", "file"));
        f22935c.put(EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF.m16250b(), new C3097Z6("jni_native", "file"));
        f22935c.put(EnumC3377k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF.m16250b(), new C3097Z6("jni_native", "binder"));
    }

    private C3097Z6(String str, String str2) {
        this.f22936a = str;
        this.f22937b = str2;
    }

    /* renamed from: a */
    public static C3097Z6 m15537a(int i) {
        return f22935c.get(i);
    }
}
