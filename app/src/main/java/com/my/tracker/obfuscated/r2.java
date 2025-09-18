package com.my.tracker.obfuscated;

/* loaded from: classes2.dex */
public final class r2 {
    private final long a;
    private final f2 b;
    private final f2[] c;
    private final w[] d;

    public r2(long j, f2 f2Var, f2[] f2VarArr, w[] wVarArr) {
        this.a = j;
        this.b = f2Var;
        this.c = f2VarArr;
        this.d = wVarArr;
    }

    public f2 a() {
        return this.b;
    }

    public w[] b() {
        return this.d;
    }

    public long c() {
        return this.a;
    }

    public f2[] d() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.b != null) {
            sb.append("|-----\n| ");
            sb.append(this.b);
            sb.append("\n");
        }
        f2[] f2VarArr = this.c;
        if (f2VarArr != null && f2VarArr.length > 0) {
            sb.append("|-----\n");
            for (f2 f2Var : this.c) {
                sb.append("| ");
                sb.append(f2Var);
                sb.append("\n");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        w[] wVarArr = this.d;
        if (wVarArr != null && wVarArr.length > 0) {
            sb2.append("|-----\n");
            for (w wVar : this.d) {
                sb2.append("| ");
                sb2.append(wVar);
                sb2.append("\n");
            }
        }
        return "[TimeSpentTickDTO]\n| timestamp = " + this.a + "\n" + ((Object) sb) + ((Object) sb2) + "[/TimeSpentTickDTO]\n";
    }
}
