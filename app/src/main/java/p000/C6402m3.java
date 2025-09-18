package p000;

/* renamed from: m3 */
/* loaded from: classes.dex */
public final class C6402m3 implements QD0 {

    /* renamed from: a */
    public final /* synthetic */ int f37432a;

    /* renamed from: b */
    public final Object f37433b;

    public /* synthetic */ C6402m3(QD0 qd0, int i) {
        this.f37432a = i;
        this.f37433b = qd0;
    }

    @Override // p000.QD0
    /* renamed from: a */
    public final void mo312a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        switch (this.f37432a) {
            case 0:
                ((QD0) this.f37433b).mo312a(new C6339l3(abstractC1237Tf, 0), rd0);
                break;
            case 1:
                O90.m5968f(abstractC1237Tf, "consumer");
                O90.m5968f(rd0, "context");
                ((QD0) this.f37433b).mo312a(new C6339l3(abstractC1237Tf, 2), rd0);
                break;
            case 2:
                ((QD0) this.f37433b).mo312a(new C6339l3(abstractC1237Tf, 3), rd0);
                break;
            default:
                if (((C7027vg) rd0).f44473a.f40615h != null) {
                    if (!m22645c(0, abstractC1237Tf, rd0)) {
                        abstractC1237Tf.m7719g(1, null);
                        break;
                    }
                } else {
                    abstractC1237Tf.m7719g(1, null);
                    break;
                }
                break;
        }
    }

    /* renamed from: c */
    public boolean m22645c(int i, AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        InterfaceC9516ga1[] interfaceC9516ga1Arr;
        C9115dS0 c9115dS0 = ((C7027vg) rd0).f44473a.f40615h;
        while (true) {
            interfaceC9516ga1Arr = (InterfaceC9516ga1[]) this.f37433b;
            if (i >= interfaceC9516ga1Arr.length) {
                i = -1;
                break;
            }
            if (interfaceC9516ga1Arr[i].mo313b(c9115dS0)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return false;
        }
        interfaceC9516ga1Arr[i].mo312a(new C9388fa1(this, abstractC1237Tf, rd0, i), rd0);
        return true;
    }

    public C6402m3(InterfaceC9516ga1[] interfaceC9516ga1Arr) {
        this.f37432a = 3;
        InterfaceC9516ga1[] interfaceC9516ga1Arr2 = interfaceC9516ga1Arr;
        this.f37433b = interfaceC9516ga1Arr2;
        int length = interfaceC9516ga1Arr2.length;
        if (length <= 0) {
            if (length < 0) {
                throw new IllegalArgumentException(AbstractC11153tN0.m24909u(length, "negative size: "));
            }
            throw new IndexOutOfBoundsException(ML1.m5339f("%s (%s) must be less than size (%s)", "index", 0, Integer.valueOf(length)));
        }
    }
}
