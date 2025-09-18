package defpackage;

import java.util.concurrent.Callable;

/* renamed from: Vx1 */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC1728Vx1 implements Callable {
    public final /* synthetic */ int a;
    public /* synthetic */ PA1 b;

    public /* synthetic */ CallableC1728Vx1(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                VH vh = this.b.d;
                UR1 ur1 = new UR1("internal.registerCallback");
                ur1.d = vh;
                return ur1;
            default:
                return new UR1(this.b.c);
        }
    }
}
