package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: vP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7598vP1 implements Runnable {
    public final /* synthetic */ int a;
    public /* synthetic */ EY1 b;
    public /* synthetic */ BinderC5880mP1 c;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                BinderC5880mP1 binderC5880mP1 = this.c;
                binderC5880mP1.a.f0();
                binderC5880mP1.a.X(this.b);
                break;
            case 1:
                BinderC5880mP1 binderC5880mP12 = this.c;
                binderC5880mP12.a.f0();
                binderC5880mP12.a.T(this.b);
                break;
            default:
                BinderC5880mP1 binderC5880mP13 = this.c;
                binderC5880mP13.a.f0();
                C5716lY1 c5716lY1 = binderC5880mP13.a;
                RI1.p(c5716lY1);
                EY1 ey1 = this.b;
                Preconditions.checkNotEmpty(ey1.a);
                c5716lY1.Z(ey1);
                c5716lY1.X(ey1);
                break;
        }
    }

    public /* synthetic */ RunnableC7598vP1(BinderC5880mP1 binderC5880mP1, EY1 ey1, int i) {
        this.a = i;
        this.b = ey1;
        this.c = binderC5880mP1;
    }
}
