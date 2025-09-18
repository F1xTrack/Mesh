package io.sentry;

import io.sentry.config.AbstractC6003a;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.h1 */
/* loaded from: classes2.dex */
public final class C6025h1 implements InterfaceC6058l0 {

    /* renamed from: a */
    public final String f34173a;

    /* renamed from: b */
    public final String f34174b;

    /* renamed from: c */
    public final EnumC6062m1 f34175c;

    /* renamed from: d */
    public final int f34176d;

    /* renamed from: e */
    public final Callable f34177e;

    /* renamed from: f */
    public final String f34178f;

    /* renamed from: g */
    public HashMap f34179g;

    public C6025h1(EnumC6062m1 enumC6062m1, int i, String str, String str2, String str3) {
        this.f34175c = enumC6062m1;
        this.f34173a = str;
        this.f34176d = i;
        this.f34174b = str2;
        this.f34177e = null;
        this.f34178f = str3;
    }

    /* renamed from: a */
    public final int m21786a() {
        Callable callable = this.f34177e;
        if (callable == null) {
            return this.f34176d;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        String str = this.f34173a;
        if (str != null) {
            interfaceC5749A0.mo13828u("content_type").mo13811d(str);
        }
        String str2 = this.f34174b;
        if (str2 != null) {
            interfaceC5749A0.mo13828u("filename").mo13811d(str2);
        }
        interfaceC5749A0.mo13828u("type").mo13825r(iLogger, this.f34175c);
        String str3 = this.f34178f;
        if (str3 != null) {
            interfaceC5749A0.mo13828u("attachment_type").mo13811d(str3);
        }
        interfaceC5749A0.mo13828u("length").mo13809b(m21786a());
        HashMap map = this.f34179g;
        if (map != null) {
            for (String str4 : map.keySet()) {
                Object obj = this.f34179g.get(str4);
                interfaceC5749A0.mo13828u(str4);
                interfaceC5749A0.mo13825r(iLogger, obj);
            }
        }
        interfaceC5749A0.mo13817j();
    }

    public C6025h1(EnumC6062m1 enumC6062m1, Callable callable, String str, String str2, String str3) {
        AbstractC6003a.m21735D(enumC6062m1, "type is required");
        this.f34175c = enumC6062m1;
        this.f34173a = str;
        this.f34176d = -1;
        this.f34174b = str2;
        this.f34177e = callable;
        this.f34178f = str3;
    }
}
