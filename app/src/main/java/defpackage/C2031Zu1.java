package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: Zu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2031Zu1 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ K81 b;
    public final /* synthetic */ C5976mv1 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2031Zu1(K81 k81, InterfaceC1729Vy interfaceC1729Vy, C5976mv1 c5976mv1, String str) {
        super(2, interfaceC1729Vy);
        this.b = k81;
        this.c = c5976mv1;
        this.d = str;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C2031Zu1(this.b, interfaceC1729Vy, this.c, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2031Zu1) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Object objA;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            A61 a61 = this.c.b;
            this.a = 1;
            objA = a61.a(this.d, this);
            if (objA == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
            objA = ((PS0) obj).a;
        }
        boolean z = objA instanceof OS0;
        K81 k81 = this.b;
        if (!z) {
            k81.b(objA);
        }
        Throwable thA = PS0.a(objA);
        if (thA != null) {
            k81.a(thA);
        }
        return C1518Tf1.a;
    }
}
