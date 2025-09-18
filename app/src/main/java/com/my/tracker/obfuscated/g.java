package com.my.tracker.obfuscated;

import defpackage.AbstractC7209tN0;

/* loaded from: classes2.dex */
public final class g {
    public final String a;
    public final long b;

    public g(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppSetIdData{id='");
        sb.append(this.a);
        sb.append("', scope=");
        return AbstractC7209tN0.y(sb, this.b, '}');
    }
}
