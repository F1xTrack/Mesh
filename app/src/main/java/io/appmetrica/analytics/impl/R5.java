package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes2.dex */
public class R5 extends BaseRequestConfig {
    public String a;
    public String b;
    public C4583gl c;

    public final String b() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.a + "', mAppSystem='" + this.b + "', startupState=" + this.c + '}';
    }

    public final String a() {
        return this.a;
    }
}
