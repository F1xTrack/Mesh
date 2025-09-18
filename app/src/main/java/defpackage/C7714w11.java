package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: w11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7714w11 extends AbstractC4286i71 implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ I11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7714w11(I11 i11, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = i11;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C7714w11 c7714w11 = new C7714w11(this.c, interfaceC1729Vy);
        c7714w11.b = obj;
        return c7714w11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7714w11) create((InterfaceC6853rW) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
            return c1518Tf1;
        }
        RQ1.d(obj);
        InterfaceC6853rW interfaceC6853rW = (InterfaceC6853rW) this.b;
        I11 i11 = this.c;
        AbstractC8295z41 abstractC8295z41 = (AbstractC8295z41) i11.f.e();
        if (!(abstractC8295z41 instanceof AC)) {
            i11.h.B(new C6569q11(abstractC8295z41));
        }
        C7332u11 c7332u11 = new C7332u11(abstractC8295z41, null);
        this.a = 1;
        i11.f.collect(new C7997xW(new SO0(), new C7307tu(2, interfaceC6853rW), c7332u11), this);
        return enumC1030Mz;
    }
}
