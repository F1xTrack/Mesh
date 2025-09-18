package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class WT0 extends AbstractC4286i71 implements Function2 {
    public C8416zj a;
    public int b;
    public final /* synthetic */ XT0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WT0(XT0 xt0, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = xt0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new WT0(this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WT0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x017f -> B:80:0x0182). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WT0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
