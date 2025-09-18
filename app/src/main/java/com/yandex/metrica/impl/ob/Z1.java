package com.yandex.metrica.impl.ob;

import defpackage.C7074sg;

/* loaded from: classes2.dex */
public class Z1 {
    private final int a;
    private final int b;
    private final int c;

    public Z1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a(Boolean bool) {
        if (bool == null) {
            return this.a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.c;
        }
        throw new C7074sg();
    }

    public final Boolean a(int i) {
        if (i == this.b) {
            return Boolean.FALSE;
        }
        if (i == this.c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
