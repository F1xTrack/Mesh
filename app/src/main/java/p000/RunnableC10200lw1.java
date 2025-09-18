package p000;

import com.p018my.tracker.obfuscated.C2357q0;

/* renamed from: lw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC10200lw1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f37366a;

    /* renamed from: b */
    public final /* synthetic */ C2357q0 f37367b;

    public /* synthetic */ RunnableC10200lw1(C2357q0 c2357q0, int i) {
        this.f37366a = i;
        this.f37367b = c2357q0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37366a) {
            case 0:
                C2357q0.m13394a(this.f37367b);
                break;
            default:
                this.f37367b.m13398c();
                break;
        }
    }
}
