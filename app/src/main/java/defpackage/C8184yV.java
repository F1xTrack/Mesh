package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: yV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8184yV extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ C8374zV b;
    public final /* synthetic */ InterfaceC0173Bz c;
    public final /* synthetic */ InterfaceC2349bZ0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8184yV(C8374zV c8374zV, InterfaceC0173Bz interfaceC0173Bz, InterfaceC2349bZ0 interfaceC2349bZ0, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c8374zV;
        this.c = interfaceC0173Bz;
        this.d = interfaceC2349bZ0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C8184yV(this.b, this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C8184yV) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8184yV.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
