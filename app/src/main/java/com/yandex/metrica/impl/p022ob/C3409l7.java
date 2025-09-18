package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.l7 */
/* loaded from: classes2.dex */
public final class C3409l7 {

    /* renamed from: a */
    private final String f24178a;

    /* renamed from: b */
    private final String f24179b;

    /* renamed from: c */
    private final Integer f24180c;

    /* renamed from: d */
    private final Integer f24181d;

    /* renamed from: e */
    private final String f24182e;

    /* renamed from: f */
    private final Boolean f24183f;

    public C3409l7(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f24178a = str;
        this.f24179b = str2;
        this.f24180c = num;
        this.f24181d = num2;
        this.f24182e = str3;
        this.f24183f = bool;
    }

    /* renamed from: a */
    public final String m16380a() {
        return this.f24178a;
    }

    /* renamed from: b */
    public final Integer m16381b() {
        return this.f24181d;
    }

    /* renamed from: c */
    public final String m16382c() {
        return this.f24179b;
    }

    /* renamed from: d */
    public final Integer m16383d() {
        return this.f24180c;
    }

    /* renamed from: e */
    public final String m16384e() {
        return this.f24182e;
    }

    /* renamed from: f */
    public final Boolean m16385f() {
        return this.f24183f;
    }

    public C3409l7(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
