package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;
import com.yandex.metrica.impl.ob.C2727ec;
import com.yandex.metrica.impl.ob.C2840j1;
import defpackage.InterfaceC0703It1;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2842j3 implements InterfaceC2666c1 {
    private final Context a;
    private final Handler b;
    private final Z c;
    private final C2727ec d;
    private final InterfaceExecutorC3086sn e;
    private final C f;
    private volatile P1 g;
    private AbstractC2772g7 h;
    private final InterfaceC0703It1 i;
    private final C3015q1 j;
    private boolean k;

    public C2842j3(Context context, C3037qn c3037qn) {
        this(context.getApplicationContext(), c3037qn.b(), c3037qn.a());
    }

    private void e() {
        if (!C2840j1.a("com.yandex.metrica.CounterConfiguration")) {
            throw new C2840j1.a("\nClass com.yandex.metrica.CounterConfiguration isn't found.\nPerhaps this is due to obfuscation.\nIf you build your application with ProGuard,\nyou need to keep the Metrica for Apps.\nPlease try to use the following lines of code:\n##########################################\n-keep class com.yandex.metrica.** { *; }\n-dontwarn com.yandex.metrica.**\n##########################################");
        }
        ((C3061rn) this.e).execute(new Em(this.a));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public synchronized void a(com.yandex.metrica.y yVar, Y0 y0) {
        try {
            if (!this.k) {
                Boolean bool = yVar.crashReporting;
                Boolean bool2 = Boolean.TRUE;
                if (bool == null) {
                    bool = bool2;
                }
                if (bool.booleanValue() && this.g == null) {
                    C3160vh c3160vh = new C3160vh(this.i);
                    C2871k7 c2871k7 = new C2871k7(this.a, new S2(y0, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C2768g3(this), (com.yandex.metrica.r) null);
                    C2871k7 c2871k72 = new C2871k7(this.a, new S2(y0, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), new C2793h3(this), (com.yandex.metrica.r) null);
                    if (this.h == null) {
                        this.h = new C2871k7(this.a, new C3039r1(y0, yVar), new C2818i3(this), (com.yandex.metrica.r) null);
                    }
                    this.g = new P1(Thread.getDefaultUncaughtExceptionHandler(), Arrays.asList(c3160vh, c2871k7, c2871k72, this.h), Y.g().j(), new C3(), new E3());
                    Thread.setDefaultUncaughtExceptionHandler(this.g);
                }
                Boolean bool3 = yVar.appOpenTrackingEnabled;
                if (bool3 != null) {
                    bool2 = bool3;
                }
                if (bool2.booleanValue()) {
                    this.f.a();
                }
                this.k = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public InterfaceExecutorC3086sn b() {
        return this.e;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public Handler c() {
        return this.b;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public InterfaceC2901lc d() {
        return this.d;
    }

    private C2842j3(Context context, C3061rn c3061rn, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(context, new C2727ec(new C2727ec.c(), new C2727ec.e(), new C2727ec.e(), c3061rn, "Client"), c3061rn, new Z(), new C(interfaceExecutorC3086sn), new C3210xh(), new C3015q1());
    }

    public C2842j3(Context context, C2727ec c2727ec, C3061rn c3061rn, Z z, C c, C3210xh c3210xh, C3015q1 c3015q1) {
        this.k = false;
        this.a = context;
        this.e = c3061rn;
        this.f = c;
        this.j = c3015q1;
        Am.a(context);
        B2.b();
        this.d = c2727ec;
        c2727ec.c(context);
        this.b = c3061rn.a();
        this.c = z;
        z.a();
        this.i = c3210xh.a(context);
        e();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public void a(Map<String, Object> map) {
        this.j.a(map);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public C a() {
        return this.f;
    }
}
