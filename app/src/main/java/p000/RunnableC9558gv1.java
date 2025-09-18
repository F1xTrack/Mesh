package p000;

import com.p018my.tracker.obfuscated.C2331j2;

/* renamed from: gv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9558gv1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f28089a;

    /* renamed from: b */
    public final /* synthetic */ C2331j2 f28090b;

    public /* synthetic */ RunnableC9558gv1(C2331j2 c2331j2, int i) {
        this.f28089a = i;
        this.f28090b = c2331j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28089a) {
            case 0:
                this.f28090b.m13256f();
                break;
            default:
                this.f28090b.m13251c();
                break;
        }
    }
}
