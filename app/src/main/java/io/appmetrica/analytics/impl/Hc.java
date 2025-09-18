package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Hc extends K2 {
    public final String b;

    public Hc(String str, InterfaceC4940vk interfaceC4940vk) {
        super(interfaceC4940vk);
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.K2
    public final String a(String str) {
        return str + '-' + this.b;
    }
}
