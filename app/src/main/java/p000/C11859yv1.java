package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: yv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11859yv1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f46537a;

    /* renamed from: b */
    public final /* synthetic */ K81 f46538b;

    /* renamed from: c */
    public final /* synthetic */ C10326mv1 f46539c;

    /* renamed from: d */
    public final /* synthetic */ String f46540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11859yv1(K81 k81, InterfaceC1382Vy interfaceC1382Vy, C10326mv1 c10326mv1, String str) {
        super(2, interfaceC1382Vy);
        this.f46538b = k81;
        this.f46539c = c10326mv1;
        this.f46540d = str;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C11859yv1(this.f46538b, interfaceC1382Vy, this.f46539c, this.f46540d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11859yv1) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Object objM23042c;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f46537a;
        if (i == 0) {
            RQ1.m7017d(obj);
            C10339n11 c10339n11 = this.f46539c.f37995c;
            this.f46537a = 1;
            objM23042c = c10339n11.m23042c(this.f46540d, this);
            if (objM23042c == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            objM23042c = ((PS0) obj).f9075a;
        }
        boolean z = objM23042c instanceof OS0;
        K81 k81 = this.f46538b;
        if (!z) {
            k81.m4569b(objM23042c);
        }
        Throwable thM6365a = PS0.m6365a(objM23042c);
        if (thM6365a != null) {
            k81.m4568a(thM6365a);
        }
        return C8313Tf1.f11463a;
    }
}
