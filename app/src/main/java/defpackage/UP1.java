package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class UP1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ BinderC5880mP1 e;

    public /* synthetic */ UP1(BinderC5880mP1 binderC5880mP1, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = binderC5880mP1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                BinderC5880mP1 binderC5880mP1 = this.e;
                binderC5880mP1.a.f0();
                C1656Uz1 c1656Uz1 = binderC5880mP1.a.c;
                C5716lY1.w(c1656Uz1);
                return c1656Uz1.n2(this.b, this.c, this.d);
            case 1:
                BinderC5880mP1 binderC5880mP12 = this.e;
                binderC5880mP12.a.f0();
                C1656Uz1 c1656Uz12 = binderC5880mP12.a.c;
                C5716lY1.w(c1656Uz12);
                return c1656Uz12.n2(this.b, this.c, this.d);
            case 2:
                BinderC5880mP1 binderC5880mP13 = this.e;
                binderC5880mP13.a.f0();
                C1656Uz1 c1656Uz13 = binderC5880mP13.a.c;
                C5716lY1.w(c1656Uz13);
                return c1656Uz13.K1(this.b, this.c, this.d);
            default:
                BinderC5880mP1 binderC5880mP14 = this.e;
                binderC5880mP14.a.f0();
                C1656Uz1 c1656Uz14 = binderC5880mP14.a.c;
                C5716lY1.w(c1656Uz14);
                return c1656Uz14.K1(this.b, this.c, this.d);
        }
    }
}
