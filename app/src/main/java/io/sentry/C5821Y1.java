package io.sentry;

import io.sentry.protocol.C6104t;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.Y1 */
/* loaded from: classes2.dex */
public final class C5821Y1 implements InterfaceC6058l0 {

    /* renamed from: a */
    public final C6104t f33445a;

    /* renamed from: b */
    public final String f33446b;

    /* renamed from: c */
    public final String f33447c;

    /* renamed from: d */
    public final String f33448d;

    /* renamed from: e */
    public final String f33449e;

    /* renamed from: f */
    public final String f33450f;

    /* renamed from: g */
    public final String f33451g;

    /* renamed from: h */
    public final String f33452h;

    /* renamed from: i */
    public final String f33453i;

    /* renamed from: j */
    public final C6104t f33454j;

    /* renamed from: k */
    public ConcurrentHashMap f33455k;

    public C5821Y1(C6104t c6104t, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C6104t c6104t2) {
        this.f33445a = c6104t;
        this.f33446b = str;
        this.f33447c = str2;
        this.f33448d = str3;
        this.f33449e = str4;
        this.f33450f = str5;
        this.f33451g = str6;
        this.f33452h = str7;
        this.f33453i = str8;
        this.f33454j = c6104t2;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("trace_id").mo13825r(iLogger, this.f33445a);
        interfaceC5749A0.mo13828u("public_key").mo13811d(this.f33446b);
        String str = this.f33447c;
        if (str != null) {
            interfaceC5749A0.mo13828u("release").mo13811d(str);
        }
        String str2 = this.f33448d;
        if (str2 != null) {
            interfaceC5749A0.mo13828u("environment").mo13811d(str2);
        }
        String str3 = this.f33449e;
        if (str3 != null) {
            interfaceC5749A0.mo13828u("user_id").mo13811d(str3);
        }
        String str4 = this.f33450f;
        if (str4 != null) {
            interfaceC5749A0.mo13828u("user_segment").mo13811d(str4);
        }
        String str5 = this.f33451g;
        if (str5 != null) {
            interfaceC5749A0.mo13828u("transaction").mo13811d(str5);
        }
        String str6 = this.f33452h;
        if (str6 != null) {
            interfaceC5749A0.mo13828u("sample_rate").mo13811d(str6);
        }
        String str7 = this.f33453i;
        if (str7 != null) {
            interfaceC5749A0.mo13828u("sampled").mo13811d(str7);
        }
        C6104t c6104t = this.f33454j;
        if (c6104t != null) {
            interfaceC5749A0.mo13828u("replay_id").mo13825r(iLogger, c6104t);
        }
        ConcurrentHashMap concurrentHashMap = this.f33455k;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f33455k, str8, interfaceC5749A0, str8, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
