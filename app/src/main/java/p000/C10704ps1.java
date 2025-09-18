package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: ps1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10704ps1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public Object f40424a;

    /* renamed from: b */
    public int f40425b;

    /* renamed from: c */
    public final /* synthetic */ C8071Oo1 f40426c;

    /* renamed from: d */
    public final /* synthetic */ String f40427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10704ps1(C8071Oo1 c8071Oo1, String str, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f40426c = c8071Oo1;
        this.f40427d = str;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C10704ps1(this.f40426c, this.f40427d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C10704ps1(this.f40426c, this.f40427d, (InterfaceC1382Vy) obj2).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Object objM10535c;
        Object obj2;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f40425b;
        C8071Oo1 c8071Oo1 = this.f40426c;
        if (i == 0) {
            RQ1.m7017d(obj);
            C8907bs1 c8907bs1 = (C8907bs1) c8071Oo1.f8627a;
            this.f40425b = 1;
            objM10535c = c8907bs1.m10535c(this.f40427d, this);
            if (objM10535c == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f40424a;
                RQ1.m7017d(obj);
                return new PS0(obj2);
            }
            RQ1.m7017d(obj);
            objM10535c = ((PS0) obj).f9075a;
        }
        if (!(objM10535c instanceof OS0)) {
            C7765Ir1 c7765Ir1 = (C7765Ir1) c8071Oo1.f8628b;
            this.f40424a = objM10535c;
            this.f40425b = 2;
            if (c7765Ir1.m4054e(this) == enumC0817Mz) {
                return enumC0817Mz;
            }
        }
        obj2 = objM10535c;
        return new PS0(obj2);
    }
}
