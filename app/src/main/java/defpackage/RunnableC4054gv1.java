package defpackage;

import com.my.tracker.obfuscated.j2;

/* renamed from: gv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4054gv1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;

    public /* synthetic */ RunnableC4054gv1(j2 j2Var, int i) {
        this.a = i;
        this.b = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f();
                break;
            default:
                this.b.c();
                break;
        }
    }
}
