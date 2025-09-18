package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: Vr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8441Vr1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ int f12835a;

    /* renamed from: b */
    public int f12836b;

    /* renamed from: c */
    public Object f12837c;

    /* renamed from: d */
    public final /* synthetic */ Object f12838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8441Vr1(Object obj, InterfaceC1382Vy interfaceC1382Vy, int i) {
        super(2, interfaceC1382Vy);
        this.f12835a = i;
        this.f12838d = obj;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f12835a) {
            case 0:
                C8441Vr1 c8441Vr1 = new C8441Vr1((C7871Ks1) this.f12838d, interfaceC1382Vy, 0);
                c8441Vr1.f12837c = obj;
                return c8441Vr1;
            case 1:
                return new C8441Vr1((U41) this.f12837c, (String) this.f12838d, interfaceC1382Vy, 1);
            case 2:
                return new C8441Vr1((C8071Oo1) this.f12837c, (String) this.f12838d, interfaceC1382Vy, 2);
            case 3:
                return new C8441Vr1((C7821Jt1) this.f12838d, interfaceC1382Vy, 3);
            default:
                return new C8441Vr1((C8449Vv1) this.f12838d, interfaceC1382Vy, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0754Lz interfaceC0754Lz = (InterfaceC0754Lz) obj;
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj2;
        switch (this.f12835a) {
            case 0:
                C8441Vr1 c8441Vr1 = new C8441Vr1((C7871Ks1) this.f12838d, interfaceC1382Vy, 0);
                c8441Vr1.f12837c = interfaceC0754Lz;
                return c8441Vr1.invokeSuspend(C8313Tf1.f11463a);
            case 1:
                return new C8441Vr1((U41) this.f12837c, (String) this.f12838d, interfaceC1382Vy, 1).invokeSuspend(C8313Tf1.f11463a);
            case 2:
                return new C8441Vr1((C8071Oo1) this.f12837c, (String) this.f12838d, interfaceC1382Vy, 2).invokeSuspend(C8313Tf1.f11463a);
            case 3:
                return new C8441Vr1((C7821Jt1) this.f12838d, interfaceC1382Vy, 3).invokeSuspend(C8313Tf1.f11463a);
            default:
                return new C8441Vr1((C8449Vv1) this.f12838d, interfaceC1382Vy, 4).invokeSuspend(C8313Tf1.f11463a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x042a A[LOOP:1: B:168:0x0424->B:170:0x042a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020b  */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8441Vr1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8441Vr1(Object obj, String str, InterfaceC1382Vy interfaceC1382Vy, int i) {
        super(2, interfaceC1382Vy);
        this.f12835a = i;
        this.f12837c = obj;
        this.f12838d = str;
    }
}
