package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Ek */
/* loaded from: classes2.dex */
public final class C4477Ek {

    /* renamed from: a */
    public final String f30105a;

    /* renamed from: b */
    public final String f30106b;

    /* renamed from: c */
    public final Integer f30107c;

    /* renamed from: d */
    public final Integer f30108d;

    /* renamed from: e */
    public final String f30109e;

    /* renamed from: f */
    public final Boolean f30110f;

    public C4477Ek(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f30105a = str;
        this.f30106b = str2;
        this.f30107c = num;
        this.f30108d = num2;
        this.f30109e = str3;
        this.f30110f = bool;
    }

    public C4477Ek(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
