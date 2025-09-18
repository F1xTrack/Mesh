package defpackage;

import com.my.tracker.obfuscated.f0;
import java.io.IOException;
import java.util.Map;

/* renamed from: Vt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1716Vt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC1716Vt1(f0 f0Var, String str, Object obj, long j, int i) {
        this.a = i;
        this.b = f0Var;
        this.c = str;
        this.e = obj;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                this.b.a(this.c, (Map) this.e, this.d);
                break;
            default:
                this.b.a(this.c, (String) this.e, this.d);
                break;
        }
    }
}
