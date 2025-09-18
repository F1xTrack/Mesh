package com.my.tracker.obfuscated;

/* loaded from: classes2.dex */
public abstract class s2 {
    public static boolean a(r2 r2Var) {
        f2 f2VarA = r2Var.a();
        if (f2VarA != null && f2VarA.b() > 0) {
            return true;
        }
        f2[] f2VarArrD = r2Var.d();
        if (f2VarArrD != null && f2VarArrD.length > 0) {
            return true;
        }
        w[] wVarArrB = r2Var.b();
        return wVarArrB != null && wVarArrB.length > 0;
    }

    private static boolean b(r2 r2Var) {
        f2 f2VarA = r2Var.a();
        if (f2VarA == null) {
            return true;
        }
        return !(((f2VarA.c() > 0L ? 1 : (f2VarA.c() == 0L ? 0 : -1)) > 0) && (r2Var.d() == null || r2Var.d().length == 0)) && f2VarA.a() == 0;
    }

    public static boolean c(r2 r2Var) {
        if (a(r2Var.c())) {
            return b(r2Var);
        }
        return false;
    }

    private static boolean a(long j) {
        if (j > 0) {
            return true;
        }
        y2.a("TimeSpentTickDtoValidator: dto timestamp should be > 0, actual = " + j);
        return false;
    }
}
