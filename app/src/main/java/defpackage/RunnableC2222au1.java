package defpackage;

import com.my.tracker.obfuscated.f0;

/* renamed from: au1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2222au1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ RunnableC2222au1(f0 f0Var, long j, float f, float f2, float f3, int i) {
        this.a = i;
        this.b = f0Var;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c, this.d, this.e, this.f);
                break;
            default:
                this.b.b(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
