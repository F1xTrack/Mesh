package defpackage;

import com.my.tracker.obfuscated.f0;

/* renamed from: Zt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2028Zt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;

    public /* synthetic */ RunnableC2028Zt1(f0 f0Var, long j, float f, int i) {
        this.a = i;
        this.b = f0Var;
        this.c = j;
        this.d = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(this.c, this.d);
                break;
            case 1:
                this.b.b(this.c, this.d);
                break;
            default:
                this.b.a(this.c, this.d);
                break;
        }
    }
}
