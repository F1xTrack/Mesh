package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: Vr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1710Vr1 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1710Vr1(Object obj, InterfaceC1729Vy interfaceC1729Vy, int i) {
        super(2, interfaceC1729Vy);
        this.a = i;
        this.d = obj;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        switch (this.a) {
            case 0:
                C1710Vr1 c1710Vr1 = new C1710Vr1((C0856Ks1) this.d, interfaceC1729Vy, 0);
                c1710Vr1.c = obj;
                return c1710Vr1;
            case 1:
                return new C1710Vr1((U41) this.c, (String) this.d, interfaceC1729Vy, 1);
            case 2:
                return new C1710Vr1((C1155Oo1) this.c, (String) this.d, interfaceC1729Vy, 2);
            case 3:
                return new C1710Vr1((C0781Jt1) this.d, interfaceC1729Vy, 3);
            default:
                return new C1710Vr1((C1722Vv1) this.d, interfaceC1729Vy, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0952Lz interfaceC0952Lz = (InterfaceC0952Lz) obj;
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj2;
        switch (this.a) {
            case 0:
                C1710Vr1 c1710Vr1 = new C1710Vr1((C0856Ks1) this.d, interfaceC1729Vy, 0);
                c1710Vr1.c = interfaceC0952Lz;
                return c1710Vr1.invokeSuspend(C1518Tf1.a);
            case 1:
                return new C1710Vr1((U41) this.c, (String) this.d, interfaceC1729Vy, 1).invokeSuspend(C1518Tf1.a);
            case 2:
                return new C1710Vr1((C1155Oo1) this.c, (String) this.d, interfaceC1729Vy, 2).invokeSuspend(C1518Tf1.a);
            case 3:
                return new C1710Vr1((C0781Jt1) this.d, interfaceC1729Vy, 3).invokeSuspend(C1518Tf1.a);
            default:
                return new C1710Vr1((C1722Vv1) this.d, interfaceC1729Vy, 4).invokeSuspend(C1518Tf1.a);
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
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1710Vr1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1710Vr1(Object obj, String str, InterfaceC1729Vy interfaceC1729Vy, int i) {
        super(2, interfaceC1729Vy);
        this.a = i;
        this.c = obj;
        this.d = str;
    }
}
