package com.yandex.metrica.impl.ob;

import defpackage.AbstractC8235ym;

/* loaded from: classes2.dex */
public class Kn {
    private final Nn a;
    private final Nn b;
    private final Gn c;
    private final Im d;
    private final String e;

    public Kn(int i, int i2, int i3, String str, Im im) {
        this(new Gn(i), new Nn(i2, AbstractC8235ym.i(str, "map key"), im), new Nn(i3, AbstractC8235ym.i(str, "map value"), im), str, im);
    }

    public Gn a() {
        return this.c;
    }

    public Nn b() {
        return this.a;
    }

    public Nn c() {
        return this.b;
    }

    public void a(String str) {
        if (this.d.c()) {
            this.d.c("The %s has reached the limit of %d items. Item with key %s will be ignored", this.e, Integer.valueOf(this.c.a()), str);
        }
    }

    public Kn(Gn gn, Nn nn, Nn nn2, String str, Im im) {
        this.c = gn;
        this.a = nn;
        this.b = nn2;
        this.e = str;
        this.d = im;
    }
}
