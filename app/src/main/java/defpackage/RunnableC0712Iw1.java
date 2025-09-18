package defpackage;

import com.my.tracker.obfuscated.x1;

/* renamed from: Iw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0712Iw1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;

    public /* synthetic */ RunnableC0712Iw1(x1 x1Var, int i) {
        this.a = i;
        this.b = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.a();
                break;
        }
    }
}
