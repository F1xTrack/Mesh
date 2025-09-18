package io.appmetrica.analytics.impl;

import defpackage.C7074sg;

/* loaded from: classes2.dex */
public abstract class Hd {
    public final int a = -1;
    public final int b = 0;
    public final int c = 1;

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
