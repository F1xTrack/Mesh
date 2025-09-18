package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: lv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5785lv1 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ C1173Ou1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5785lv1(C1173Ou1 c1173Ou1, InterfaceC1729Vy interfaceC1729Vy, int i) {
        super(2, interfaceC1729Vy);
        this.a = i;
        this.c = c1173Ou1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        switch (this.a) {
            case 0:
                return new C5785lv1(this.c, interfaceC1729Vy, 0);
            default:
                return new C5785lv1(this.c, interfaceC1729Vy, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj2;
        switch (this.a) {
            case 0:
                return new C5785lv1(this.c, interfaceC1729Vy, 0).invokeSuspend(C1518Tf1.a);
            default:
                return new C5785lv1(this.c, interfaceC1729Vy, 1).invokeSuspend(C1518Tf1.a);
        }
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
                int i = this.b;
                if (i == 0) {
                    RQ1.d(obj);
                    this.b = 1;
                    if (this.c.a(this) == enumC1030Mz) {
                        return enumC1030Mz;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                return C1518Tf1.a;
            default:
                EnumC1030Mz enumC1030Mz2 = EnumC1030Mz.a;
                int i2 = this.b;
                if (i2 == 0) {
                    RQ1.d(obj);
                    this.b = 1;
                    obj = C1173Ou1.b(this.c, this);
                    if (obj == enumC1030Mz2) {
                        return enumC1030Mz2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                return obj;
        }
    }
}
