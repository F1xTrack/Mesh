package com.yandex.metrica.impl.ob;

import defpackage.AbstractC1705Vq;

/* renamed from: com.yandex.metrica.impl.ob.o8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2972o8 {
    public final String a;
    public final String b;

    public C2972o8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RuntimeConfig{errorEnvironment='");
        sb.append(this.a);
        sb.append("', handlerVersion='");
        return AbstractC1705Vq.l(sb, this.b, "'}");
    }
}
