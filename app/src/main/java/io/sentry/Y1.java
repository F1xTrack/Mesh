package io.sentry;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class Y1 implements InterfaceC5141l0 {
    public final io.sentry.protocol.t a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final io.sentry.protocol.t j;
    public ConcurrentHashMap k;

    public Y1(io.sentry.protocol.t tVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, io.sentry.protocol.t tVar2) {
        this.a = tVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = tVar2;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("trace_id").r(iLogger, this.a);
        a0.u("public_key").d(this.b);
        String str = this.c;
        if (str != null) {
            a0.u("release").d(str);
        }
        String str2 = this.d;
        if (str2 != null) {
            a0.u("environment").d(str2);
        }
        String str3 = this.e;
        if (str3 != null) {
            a0.u("user_id").d(str3);
        }
        String str4 = this.f;
        if (str4 != null) {
            a0.u("user_segment").d(str4);
        }
        String str5 = this.g;
        if (str5 != null) {
            a0.u("transaction").d(str5);
        }
        String str6 = this.h;
        if (str6 != null) {
            a0.u("sample_rate").d(str6);
        }
        String str7 = this.i;
        if (str7 != null) {
            a0.u("sampled").d(str7);
        }
        io.sentry.protocol.t tVar = this.j;
        if (tVar != null) {
            a0.u("replay_id").r(iLogger, tVar);
        }
        ConcurrentHashMap concurrentHashMap = this.k;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.k, str8, a0, str8, iLogger);
            }
        }
        a0.j();
    }
}
