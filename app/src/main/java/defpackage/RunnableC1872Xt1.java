package defpackage;

import com.my.tracker.obfuscated.f0;
import java.io.IOException;

/* renamed from: Xt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1872Xt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ RunnableC1872Xt1(f0 f0Var, int i) {
        this.a = i;
        this.b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                this.b.f();
                break;
            default:
                this.b.e();
                break;
        }
    }
}
