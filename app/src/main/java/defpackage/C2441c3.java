package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function2;

/* renamed from: c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2441c3 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ VH b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441c3(VH vh, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = vh;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C2441c3(this.b, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2441c3) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            VH vh = this.b;
            this.a = 1;
            C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(this));
            c0767Jp.s();
            C2251b3 c2251b3 = new C2251b3(vh, c0767Jp, vh);
            C4332iN c4332iN = (C4332iN) vh.c;
            ((CopyOnWriteArrayList) c4332iN.b).add(c2251b3);
            AbstractActivityC4281i6 abstractActivityC4281i6 = (AbstractActivityC4281i6) ((WeakReference) c4332iN.c).get();
            if (abstractActivityC4281i6 != null) {
                abstractActivityC4281i6.runOnUiThread(new RunnableC6769r4(c2251b3, 1, abstractActivityC4281i6));
            }
            c0767Jp.u(new C3690f1(vh, 2, c2251b3));
            if (c0767Jp.r() == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        return C1518Tf1.a;
    }
}
