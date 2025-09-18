package defpackage;

import com.my.tracker.obfuscated.q0;

/* renamed from: lw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5788lw1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ RunnableC5788lw1(q0 q0Var, int i) {
        this.a = i;
        this.b = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0.a(this.b);
                break;
            default:
                this.b.c();
                break;
        }
    }
}
