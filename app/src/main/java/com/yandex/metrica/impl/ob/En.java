package com.yandex.metrica.impl.ob;

import defpackage.AbstractC8235ym;

/* loaded from: classes2.dex */
public class En implements Fn {
    public final int a;

    public En(int i) {
        this.a = i;
    }

    @Override // com.yandex.metrica.impl.ob.Fn
    public int a() {
        return this.a;
    }

    public String toString() {
        return AbstractC8235ym.l(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.a, '}');
    }

    public static Fn a(Fn... fnArr) {
        int iA = 0;
        for (Fn fn : fnArr) {
            if (fn != null) {
                iA = fn.a() + iA;
            }
        }
        return new En(iA);
    }
}
