package com.my.tracker.obfuscated;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class c extends h2 {
    public ArrayList a(long j, boolean z) {
        y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z) + "onTick: start collecting anytime TimeSpents");
        b(j, z);
        a(j);
        ArrayList arrayListA = a();
        this.b.clear();
        y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z) + "onTick: collected " + arrayListA.size() + " anytime TimeSpents");
        return arrayListA;
    }

    public void b(long j) {
        y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(false) + "updating all running anytime TimeSpents timestamps (size = " + this.a.size() + ", new timestamp = " + j + ")");
        a(j);
    }

    public void c(long j) {
        y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(true) + "updating all running anytime TimeSpents timestamps (size = " + this.a.size() + ", new timestamp = " + j + ")");
        a(j);
    }

    public void d(long j) {
        b(j, true);
    }

    public void e(long j) {
        b(j, false);
    }

    public void a(int i, long j, boolean z) {
        this.a.put(i, new w1(i, j));
        y2.c("TimeSpent: " + a(z) + "registered new anytime TimeSpent with id = " + i);
    }

    public void b(long j, boolean z) {
        y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z) + "slicing all running anytime TimeSpents (size = " + this.a.size() + ")");
        for (int i = 0; i < this.a.size(); i++) {
            a(j, (v1) this.a.valueAt(i), z);
        }
    }

    public void a(long j, v1 v1Var, boolean z) {
        e2 e2VarA = a(v1Var.a());
        long jE = j - v1Var.e();
        if (y2.a()) {
            long jB = z ? e2VarA.b() : e2VarA.c();
            y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z) + "slicing anytime TimeSpent, id = " + v1Var.a() + ", " + jB + "(existed ms) + " + jE + "(add ms) = " + (jB + jE) + "(total ms), timestamp = " + j);
        }
        if (z) {
            e2VarA.c(jE);
        } else {
            e2VarA.a(jE);
        }
    }

    public void b(int i, long j, boolean z) throws Exception {
        v1 v1Var = (v1) this.a.get(i);
        if (v1Var == null) {
            y2.c("TimeSpent: " + a(z) + "can't stop anytime TimeSpent with id = " + i + " (reason: not found)");
            throw new Exception();
        }
        a(j, v1Var, z);
        this.a.remove(i);
        y2.c("TimeSpent: " + a(z) + "stopped anytime TimeSpent, id = " + i);
    }
}
