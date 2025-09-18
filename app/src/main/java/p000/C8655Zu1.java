package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: Zu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8655Zu1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f15217a;

    /* renamed from: b */
    public final /* synthetic */ K81 f15218b;

    /* renamed from: c */
    public final /* synthetic */ C10326mv1 f15219c;

    /* renamed from: d */
    public final /* synthetic */ String f15220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8655Zu1(K81 k81, InterfaceC1382Vy interfaceC1382Vy, C10326mv1 c10326mv1, String str) {
        super(2, interfaceC1382Vy);
        this.f15218b = k81;
        this.f15219c = c10326mv1;
        this.f15220d = str;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C8655Zu1(this.f15218b, interfaceC1382Vy, this.f15219c, this.f15220d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C8655Zu1) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Object objM54a;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f15217a;
        if (i == 0) {
            RQ1.m7017d(obj);
            A61 a61 = this.f15219c.f37994b;
            this.f15217a = 1;
            objM54a = a61.m54a(this.f15220d, this);
            if (objM54a == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            objM54a = ((PS0) obj).f9075a;
        }
        boolean z = objM54a instanceof OS0;
        K81 k81 = this.f15218b;
        if (!z) {
            k81.m4569b(objM54a);
        }
        Throwable thM6365a = PS0.m6365a(objM54a);
        if (thM6365a != null) {
            k81.m4568a(thM6365a);
        }
        return C8313Tf1.f11463a;
    }
}
