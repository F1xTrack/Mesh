package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: lv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10198lv1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ int f37362a;

    /* renamed from: b */
    public int f37363b;

    /* renamed from: c */
    public final /* synthetic */ C8083Ou1 f37364c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10198lv1(C8083Ou1 c8083Ou1, InterfaceC1382Vy interfaceC1382Vy, int i) {
        super(2, interfaceC1382Vy);
        this.f37362a = i;
        this.f37364c = c8083Ou1;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f37362a) {
            case 0:
                return new C10198lv1(this.f37364c, interfaceC1382Vy, 0);
            default:
                return new C10198lv1(this.f37364c, interfaceC1382Vy, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj2;
        switch (this.f37362a) {
            case 0:
                return new C10198lv1(this.f37364c, interfaceC1382Vy, 0).invokeSuspend(C8313Tf1.f11463a);
            default:
                return new C10198lv1(this.f37364c, interfaceC1382Vy, 1).invokeSuspend(C8313Tf1.f11463a);
        }
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        switch (this.f37362a) {
            case 0:
                EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
                int i = this.f37363b;
                if (i == 0) {
                    RQ1.m7017d(obj);
                    this.f37363b = 1;
                    if (this.f37364c.m6185a(this) == enumC0817Mz) {
                        return enumC0817Mz;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                return C8313Tf1.f11463a;
            default:
                EnumC0817Mz enumC0817Mz2 = EnumC0817Mz.f7418a;
                int i2 = this.f37363b;
                if (i2 == 0) {
                    RQ1.m7017d(obj);
                    this.f37363b = 1;
                    obj = C8083Ou1.m6184b(this.f37364c, this);
                    if (obj == enumC0817Mz2) {
                        return enumC0817Mz2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                return obj;
        }
    }
}
