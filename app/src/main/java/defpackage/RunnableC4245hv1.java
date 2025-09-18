package defpackage;

import com.my.tracker.obfuscated.j2;

/* renamed from: hv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4245hv1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ RunnableC4245hv1(j2 j2Var, long j, int i, int i2) {
        this.a = i2;
        this.b = j2Var;
        this.c = j;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h(this.c, this.d);
                break;
            case 1:
                this.b.e(this.c, this.d);
                break;
            case 2:
                this.b.f(this.c, this.d);
                break;
            default:
                this.b.g(this.c, this.d);
                break;
        }
    }
}
