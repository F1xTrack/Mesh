package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7209tN0;
import java.util.List;

/* loaded from: classes2.dex */
public class Hh {
    public final String a;
    public final List<String> b;

    public Hh(String str, List<String> list) {
        this.a = str;
        this.b = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkItem{name='");
        sb.append(this.a);
        sb.append("', classes=");
        return AbstractC7209tN0.A(sb, this.b, '}');
    }
}
