package p000;

import com.p018my.tracker.obfuscated.C2313f0;
import java.io.IOException;

/* renamed from: Xt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8549Xt1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f14039a;

    /* renamed from: b */
    public final /* synthetic */ C2313f0 f14040b;

    public /* synthetic */ RunnableC8549Xt1(C2313f0 c2313f0, int i) {
        this.f14039a = i;
        this.f14040b = c2313f0;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f14039a) {
            case 0:
                this.f14040b.m13030f();
                break;
            default:
                this.f14040b.m13028e();
                break;
        }
    }
}
