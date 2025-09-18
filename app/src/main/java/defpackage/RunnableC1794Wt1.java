package defpackage;

import com.my.tracker.obfuscated.f0;
import java.io.IOException;
import java.util.Map;

/* renamed from: Wt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1794Wt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ long d;

    public /* synthetic */ RunnableC1794Wt1(int i, long j, f0 f0Var, Map map) {
        this.a = i;
        this.b = f0Var;
        this.c = map;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                this.b.a(this.c, this.d);
                break;
            default:
                this.b.b(this.c, this.d);
                break;
        }
    }
}
