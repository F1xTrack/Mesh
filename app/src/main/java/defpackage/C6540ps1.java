package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: ps1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6540ps1 extends AbstractC4286i71 implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ C1155Oo1 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6540ps1(C1155Oo1 c1155Oo1, String str, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = c1155Oo1;
        this.d = str;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C6540ps1(this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C6540ps1(this.c, this.d, (InterfaceC1729Vy) obj2).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object obj2;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.b;
        C1155Oo1 c1155Oo1 = this.c;
        if (i == 0) {
            RQ1.d(obj);
            C2407bs1 c2407bs1 = (C2407bs1) c1155Oo1.a;
            this.b = 1;
            objC = c2407bs1.c(this.d, this);
            if (objC == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.a;
                RQ1.d(obj);
                return new PS0(obj2);
            }
            RQ1.d(obj);
            objC = ((PS0) obj).a;
        }
        if (!(objC instanceof OS0)) {
            C0697Ir1 c0697Ir1 = (C0697Ir1) c1155Oo1.b;
            this.a = objC;
            this.b = 2;
            if (c0697Ir1.e(this) == enumC1030Mz) {
                return enumC1030Mz;
            }
        }
        obj2 = objC;
        return new PS0(obj2);
    }
}
