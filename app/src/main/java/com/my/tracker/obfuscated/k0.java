package com.my.tracker.obfuscated;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class k0 extends h2 {
    public ArrayList a(long j, boolean z) {
        y2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(z) + "onTick: start collecting foreground TimeSpents");
        if (z) {
            f(j);
            a(j);
        }
        ArrayList arrayListA = a();
        this.b.clear();
        y2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(z) + "onTick: collected " + arrayListA.size() + " foreground TimeSpents");
        return arrayListA;
    }

    public void b(long j) {
    }

    public void c(long j) {
        y2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "updating all running foreground TimeSpents timestamps (size = " + this.a.size() + ", new timestamp = " + j + ")");
        a(j);
    }

    public void d(long j) {
        f(j);
    }

    public void e(long j) {
    }

    public void f(long j) {
        y2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "slicing all running foreground TimeSpents (size = " + this.a.size() + ")");
        for (int i = 0; i < this.a.size(); i++) {
            a(j, (v1) this.a.valueAt(i));
        }
    }

    public void a(int i, long j, boolean z) {
        if (!z) {
            j = -2147483648L;
        }
        this.a.put(i, new w1(i, j));
        y2.c("TimeSpent: " + a(z) + "registered new foreground TimeSpent with id = " + i);
    }

    public void b(int i, long j, boolean z) throws Exception {
        v1 v1Var = (v1) this.a.get(i);
        if (v1Var == null) {
            y2.c("TimeSpent: " + a(z) + " can't stop foreground TimeSpent with id = " + i + " (reason: not found)");
            throw new Exception();
        }
        if (z) {
            a(j, v1Var);
        }
        this.a.remove(i);
        y2.c("TimeSpent: " + a(z) + "stopped foreground TimeSpent, id = " + i);
    }

    public void a(long j, v1 v1Var) {
        e2 e2VarA = a(v1Var.a());
        long jE = j - v1Var.e();
        if (y2.a()) {
            long jB = e2VarA.b();
            y2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "slicing foreground TimeSpent, id = " + v1Var.a() + ", " + jB + "(existed ms) + " + jE + "(add ms) = " + (jB + jE) + "(total ms), timestamp = " + j);
        }
        e2VarA.c(jE);
    }
}
