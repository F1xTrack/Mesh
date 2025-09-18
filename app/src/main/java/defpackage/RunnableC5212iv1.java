package defpackage;

import com.my.tracker.obfuscated.j2;

/* renamed from: iv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5212iv1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ RunnableC5212iv1(j2 j2Var, long j, int i) {
        this.a = i;
        this.b = j2Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(this.c);
                break;
            default:
                this.b.d(this.c);
                break;
        }
    }
}
