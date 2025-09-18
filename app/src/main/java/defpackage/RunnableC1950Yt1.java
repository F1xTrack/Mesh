package defpackage;

import com.my.tracker.obfuscated.f0;
import java.io.IOException;
import java.util.List;

/* renamed from: Yt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1950Yt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ List c;

    public /* synthetic */ RunnableC1950Yt1(f0 f0Var, List list, int i) {
        this.a = i;
        this.b = f0Var;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
