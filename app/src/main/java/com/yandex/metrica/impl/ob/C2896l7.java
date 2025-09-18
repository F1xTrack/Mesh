package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.l7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2896l7 {
    private final String a;
    private final String b;
    private final Integer c;
    private final Integer d;
    private final String e;
    private final Boolean f;

    public C2896l7(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
        this.e = str3;
        this.f = bool;
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final Integer d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public final Boolean f() {
        return this.f;
    }

    public C2896l7(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
