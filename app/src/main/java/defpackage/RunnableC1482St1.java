package defpackage;

import com.my.tracker.obfuscated.f0;
import java.io.IOException;
import java.util.Map;

/* renamed from: St1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1482St1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;

    public /* synthetic */ RunnableC1482St1(f0 f0Var, Map map, String str, String str2, long j, int i) {
        this.a = i;
        this.b = f0Var;
        this.c = map;
        this.d = str;
        this.e = str2;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                this.b.b(this.c, this.d, this.e, this.f);
                break;
            default:
                this.b.a(this.c, this.d, this.e, this.f);
                break;
        }
    }
}
