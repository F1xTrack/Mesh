package defpackage;

import com.vk.push.core.base.DelayedAction;
import kotlin.jvm.functions.Function2;

/* renamed from: xH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7952xH extends AbstractC4286i71 implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ DelayedAction d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7952xH(long j, DelayedAction delayedAction, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = j;
        this.d = delayedAction;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C7952xH c7952xH = new C7952xH(this.c, this.d, interfaceC1729Vy);
        c7952xH.b = obj;
        return c7952xH;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7952xH) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        InterfaceC0952Lz interfaceC0952Lz;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            InterfaceC0952Lz interfaceC0952Lz2 = (InterfaceC0952Lz) this.b;
            this.b = interfaceC0952Lz2;
            this.a = 1;
            if (AZ1.b(this.c, this) == enumC1030Mz) {
                return enumC1030Mz;
            }
            interfaceC0952Lz = interfaceC0952Lz2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0952Lz = (InterfaceC0952Lz) this.b;
            RQ1.d(obj);
        }
        M22.b(interfaceC0952Lz.b());
        if (AbstractC7625vY1.d(interfaceC0952Lz)) {
            this.d.b.invoke();
        }
        return C1518Tf1.a;
    }
}
