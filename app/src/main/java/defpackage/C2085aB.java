package defpackage;

import androidx.activity.a;

/* renamed from: aB */
/* loaded from: classes.dex */
public final /* synthetic */ class C2085aB extends FZ implements InterfaceC5908mZ {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2085aB(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((C2276bB) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                O90.e(name, "threadName");
                break;
            case 1:
                ((C2276bB) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                O90.e(name2, "threadName");
                break;
            case 2:
                ((C2276bB) this.receiver).getClass();
                break;
            case 3:
                break;
            case 4:
                ((a) this.receiver).e();
                break;
            default:
                ((a) this.receiver).e();
                break;
        }
        return C1518Tf1.a;
    }
}
