package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.sentry.protocol.DebugImage;

/* renamed from: io.appmetrica.analytics.impl.rc */
/* loaded from: classes2.dex */
public final class C5421rc {

    /* renamed from: c */
    public static final SparseArray f32505c;

    /* renamed from: a */
    public final String f32506a;

    /* renamed from: b */
    public final String f32507b;

    static {
        SparseArray sparseArray = new SparseArray();
        f32505c = sparseArray;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new C5421rc(DebugImage.JVM, "binder"));
        sparseArray.put(5890, new C5421rc(DebugImage.JVM, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK));
        sparseArray.put(5889, new C5421rc(DebugImage.JVM, "file"));
        sparseArray.put(5897, new C5421rc("jni_native", "file"));
        sparseArray.put(5898, new C5421rc("jni_native", "file"));
    }

    public C5421rc(String str, String str2) {
        this.f32506a = str;
        this.f32507b = str2;
    }
}
