package p000;

import java.util.concurrent.Callable;

/* renamed from: Vx1 */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC8453Vx1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f12886a;

    /* renamed from: b */
    public /* synthetic */ PA1 f12887b;

    public /* synthetic */ CallableC8453Vx1(int i) {
        this.f12886a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f12886a) {
            case 0:
                C1339VH c1339vh = this.f12887b.f8882d;
                UR1 ur1 = new UR1("internal.registerCallback");
                ur1.f11790d = c1339vh;
                return ur1;
            default:
                return new UR1(this.f12887b.f8881c);
        }
    }
}
