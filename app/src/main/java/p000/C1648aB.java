package p000;

import androidx.activity.C1690a;

/* renamed from: aB */
/* loaded from: classes.dex */
public final /* synthetic */ class C1648aB extends AbstractC0351FZ implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ int f15378a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1648aB(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.f15378a = i3;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f15378a) {
            case 0:
                ((C1769bB) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                O90.m5967e(name, "threadName");
                break;
            case 1:
                ((C1769bB) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                O90.m5967e(name2, "threadName");
                break;
            case 2:
                ((C1769bB) this.receiver).getClass();
                break;
            case 3:
                break;
            case 4:
                ((C1690a) this.receiver).m9823e();
                break;
            default:
                ((C1690a) this.receiver).m9823e();
                break;
        }
        return C8313Tf1.f11463a;
    }
}
