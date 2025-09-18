package com.my.tracker.obfuscated;

import defpackage.AbstractC1705Vq;

/* loaded from: classes2.dex */
public final class i {
    final v1 a = new w1(0, -2147483648L);
    final e2 b = new g2(0);
    int c = 0;

    private String a(String str, String str2) {
        return AbstractC1705Vq.i("app state changed ", str, "-> ", str2);
    }

    public boolean b() {
        int i = this.c;
        return i == 1 || i == 0;
    }

    public boolean c() {
        return this.c == 3;
    }

    public void d(long j) {
        f(j);
    }

    public void e(long j) {
        if (this.c == 1) {
            f(j);
        }
    }

    public void f(long j) {
        long jE = j - this.a.e();
        if (y2.a()) {
            long jB = this.c == 3 ? this.b.b() : this.b.c();
            y2.a("TimeSpentCore: AppTimeManager: " + a() + "slicing app TimeSpent, " + jB + "(existed ms) + " + jE + "(add ms) = " + (jB + jE) + "(total ms), timestamp = " + j);
        }
        int i = this.c;
        if (i == 1) {
            this.b.a(jE);
        } else if (i != 3) {
            y2.a("TimeSpentCore: AppTimeManager: trying to slice app time, but now is useless background state - skip");
        } else {
            this.b.c(jE);
        }
    }

    public void g(long j) {
        f(j);
        y2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
        this.c = 0;
    }

    public void h(long j) {
        this.a.b(j);
        y2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
        this.c = 1;
    }

    public void b(long j) {
        if (this.c == 1) {
            this.a.b(j);
        }
    }

    public void c(long j) {
        this.a.b(j);
    }

    public void d() {
        y2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[FOREGROUND]"));
        this.c = 3;
    }

    public f2 a(long j) {
        y2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: start collecting app TimeSpent");
        if (this.c != 0) {
            f(j);
            this.a.b(j);
        }
        e2 e2VarM72clone = this.b.m72clone();
        this.b.g();
        y2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: collected app TimeSpent (foregroundMs = " + e2VarM72clone.b() + ", usefulBackgroundMs = " + e2VarM72clone.c() + ")");
        if (e2VarM72clone.b() == 0 && e2VarM72clone.c() == 0) {
            return null;
        }
        return e2VarM72clone;
    }

    private String a() {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 3 ? "" : "[FOREGROUND] " : "[BACKGROUND(useful)] " : "[BACKGROUND(useless)] ";
    }

    public void a(int i) {
        int i2;
        if (i == 0) {
            y2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
            i2 = 0;
        } else {
            y2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
            i2 = 1;
        }
        this.c = i2;
    }
}
