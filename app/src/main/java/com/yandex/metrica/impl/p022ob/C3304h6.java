package com.yandex.metrica.impl.p022ob;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.h6 */
/* loaded from: classes2.dex */
public class C3304h6 {

    /* renamed from: a */
    private boolean f23563a;

    /* renamed from: b */
    private Set<Integer> f23564b;

    /* renamed from: c */
    private int f23565c;

    /* renamed from: d */
    private int f23566d;

    public C3304h6() {
        this(false, 0, 0, new HashSet());
    }

    /* renamed from: a */
    public void m16030a() {
        this.f23564b = new HashSet();
        this.f23566d = 0;
    }

    /* renamed from: b */
    public Set<Integer> m16033b() {
        return this.f23564b;
    }

    /* renamed from: c */
    public int m16035c() {
        return this.f23566d;
    }

    /* renamed from: d */
    public int m16036d() {
        return this.f23565c;
    }

    /* renamed from: e */
    public boolean m16037e() {
        return this.f23563a;
    }

    public C3304h6(boolean z, int i, int i2, Set<Integer> set) {
        this.f23563a = z;
        this.f23564b = set;
        this.f23565c = i;
        this.f23566d = i2;
    }

    /* renamed from: b */
    public void m16034b(int i) {
        this.f23565c = i;
        this.f23566d = 0;
    }

    /* renamed from: a */
    public void m16032a(boolean z) {
        this.f23563a = z;
    }

    /* renamed from: a */
    public void m16031a(int i) {
        this.f23564b.add(Integer.valueOf(i));
        this.f23566d++;
    }
}
