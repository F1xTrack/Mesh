package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import com.huawei.hms.support.api.entity.core.CommonCode;
import io.sentry.protocol.DebugImage;

/* renamed from: io.appmetrica.analytics.impl.rc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4836rc {
    public static final SparseArray c;
    public final String a;
    public final String b;

    static {
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new C4836rc(DebugImage.JVM, "binder"));
        sparseArray.put(5890, new C4836rc(DebugImage.JVM, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK));
        sparseArray.put(5889, new C4836rc(DebugImage.JVM, "file"));
        sparseArray.put(5897, new C4836rc("jni_native", "file"));
        sparseArray.put(5898, new C4836rc("jni_native", "file"));
    }

    public C4836rc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
