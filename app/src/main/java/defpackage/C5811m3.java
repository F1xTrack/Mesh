package defpackage;

/* renamed from: m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5811m3 implements QD0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C5811m3(QD0 qd0, int i) {
        this.a = i;
        this.b = qd0;
    }

    @Override // defpackage.QD0
    public final void a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        switch (this.a) {
            case 0:
                ((QD0) this.b).a(new C5620l3(abstractC1516Tf, 0), rd0);
                break;
            case 1:
                O90.f(abstractC1516Tf, "consumer");
                O90.f(rd0, "context");
                ((QD0) this.b).a(new C5620l3(abstractC1516Tf, 2), rd0);
                break;
            case 2:
                ((QD0) this.b).a(new C5620l3(abstractC1516Tf, 3), rd0);
                break;
            default:
                if (((C7647vg) rd0).a.h != null) {
                    if (!c(0, abstractC1516Tf, rd0)) {
                        abstractC1516Tf.g(1, null);
                        break;
                    }
                } else {
                    abstractC1516Tf.g(1, null);
                    break;
                }
                break;
        }
    }

    public boolean c(int i, AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        InterfaceC3991ga1[] interfaceC3991ga1Arr;
        C3394dS0 c3394dS0 = ((C7647vg) rd0).a.h;
        while (true) {
            interfaceC3991ga1Arr = (InterfaceC3991ga1[]) this.b;
            if (i >= interfaceC3991ga1Arr.length) {
                i = -1;
                break;
            }
            if (interfaceC3991ga1Arr[i].b(c3394dS0)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return false;
        }
        interfaceC3991ga1Arr[i].a(new C3800fa1(this, abstractC1516Tf, rd0, i), rd0);
        return true;
    }

    public C5811m3(InterfaceC3991ga1[] interfaceC3991ga1Arr) {
        this.a = 3;
        InterfaceC3991ga1[] interfaceC3991ga1Arr2 = interfaceC3991ga1Arr;
        this.b = interfaceC3991ga1Arr2;
        int length = interfaceC3991ga1Arr2.length;
        if (length <= 0) {
            if (length < 0) {
                throw new IllegalArgumentException(AbstractC7209tN0.u(length, "negative size: "));
            }
            throw new IndexOutOfBoundsException(ML1.f("%s (%s) must be less than size (%s)", "index", 0, Integer.valueOf(length)));
        }
    }
}
