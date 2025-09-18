package defpackage;

import com.my.tracker.obfuscated.f0;
import java.io.IOException;

/* renamed from: Ut1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1638Ut1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;

    public /* synthetic */ RunnableC1638Ut1(f0 f0Var, String str, String str2, long j, long j2, long j3, int i) {
        this.a = i;
        this.b = f0Var;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                this.b.b(this.c, this.d, this.e, this.f, this.g);
                break;
            default:
                this.b.a(this.c, this.d, this.e, this.f, this.g);
                break;
        }
    }
}
