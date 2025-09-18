package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.jvm.functions.Function2;

/* renamed from: Pz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1264Pz extends AbstractC4286i71 implements Function2 {
    public C1505Tb0 a;
    public int b;
    public final /* synthetic */ C1505Tb0 c;
    public final /* synthetic */ CoroutineWorker d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1264Pz(C1505Tb0 c1505Tb0, CoroutineWorker coroutineWorker, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = c1505Tb0;
        this.d = coroutineWorker;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C1264Pz(this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1264Pz c1264Pz = (C1264Pz) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2);
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        c1264Pz.invokeSuspend(c1518Tf1);
        return c1518Tf1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.b;
        if (i == 0) {
            RQ1.d(obj);
            this.a = this.c;
            this.b = 1;
            this.d.getClass();
            throw new IllegalStateException("Not implemented");
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1505Tb0 c1505Tb0 = this.a;
        RQ1.d(obj);
        c1505Tb0.a.j(obj);
        return C1518Tf1.a;
    }
}
