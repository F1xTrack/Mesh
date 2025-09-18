package io.sentry;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.h1 */
/* loaded from: classes2.dex */
public final class C5130h1 implements InterfaceC5141l0 {
    public final String a;
    public final String b;
    public final EnumC5145m1 c;
    public final int d;
    public final Callable e;
    public final String f;
    public HashMap g;

    public C5130h1(EnumC5145m1 enumC5145m1, int i, String str, String str2, String str3) {
        this.c = enumC5145m1;
        this.a = str;
        this.d = i;
        this.b = str2;
        this.e = null;
        this.f = str3;
    }

    public final int a() {
        Callable callable = this.e;
        if (callable == null) {
            return this.d;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        String str = this.a;
        if (str != null) {
            a0.u("content_type").d(str);
        }
        String str2 = this.b;
        if (str2 != null) {
            a0.u("filename").d(str2);
        }
        a0.u("type").r(iLogger, this.c);
        String str3 = this.f;
        if (str3 != null) {
            a0.u("attachment_type").d(str3);
        }
        a0.u("length").b(a());
        HashMap map = this.g;
        if (map != null) {
            for (String str4 : map.keySet()) {
                Object obj = this.g.get(str4);
                a0.u(str4);
                a0.r(iLogger, obj);
            }
        }
        a0.j();
    }

    public C5130h1(EnumC5145m1 enumC5145m1, Callable callable, String str, String str2, String str3) {
        io.sentry.config.a.D(enumC5145m1, "type is required");
        this.c = enumC5145m1;
        this.a = str;
        this.d = -1;
        this.b = str2;
        this.e = callable;
        this.f = str3;
    }
}
