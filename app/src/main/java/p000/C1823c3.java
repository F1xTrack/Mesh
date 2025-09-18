package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function2;

/* renamed from: c3 */
/* loaded from: classes2.dex */
public final class C1823c3 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f17268a;

    /* renamed from: b */
    public final /* synthetic */ C1339VH f17269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823c3(C1339VH c1339vh, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f17269b = c1339vh;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C1823c3(this.f17269b, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1823c3) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f17268a;
        if (i == 0) {
            RQ1.m7017d(obj);
            C1339VH c1339vh = this.f17269b;
            this.f17268a = 1;
            C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(this));
            c0619Jp.m4439s();
            C1761b3 c1761b3 = new C1761b3(c1339vh, c0619Jp, c1339vh);
            C4238iN c4238iN = (C4238iN) c1339vh.f12487c;
            ((CopyOnWriteArrayList) c4238iN.f29113b).add(c1761b3);
            AbstractActivityC4221i6 abstractActivityC4221i6 = (AbstractActivityC4221i6) ((WeakReference) c4238iN.f29114c).get();
            if (abstractActivityC4221i6 != null) {
                abstractActivityC4221i6.runOnUiThread(new RunnableC6720r4(c1761b3, 1, abstractActivityC4221i6));
            }
            c0619Jp.m4441u(new C4027f1(c1339vh, 2, c1761b3));
            if (c0619Jp.m4438r() == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        return C8313Tf1.f11463a;
    }
}
