package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.h6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2796h6 {
    private boolean a;
    private Set<Integer> b;
    private int c;
    private int d;

    public C2796h6() {
        this(false, 0, 0, new HashSet());
    }

    public void a() {
        this.b = new HashSet();
        this.d = 0;
    }

    public Set<Integer> b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }

    public boolean e() {
        return this.a;
    }

    public C2796h6(boolean z, int i, int i2, Set<Integer> set) {
        this.a = z;
        this.b = set;
        this.c = i;
        this.d = i2;
    }

    public void b(int i) {
        this.c = i;
        this.d = 0;
    }

    public void a(boolean z) {
        this.a = z;
    }

    public void a(int i) {
        this.b.add(Integer.valueOf(i));
        this.d++;
    }
}
