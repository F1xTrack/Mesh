package defpackage;

/* renamed from: sX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7048sX0 extends AbstractC4286i71 implements InterfaceC6481pZ {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object[] c;
    public final /* synthetic */ AbstractC7874ws0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7048sX0(InterfaceC1729Vy interfaceC1729Vy, AbstractC7874ws0 abstractC7874ws0, int i) {
        super(3, interfaceC1729Vy);
        this.a = i;
        this.d = abstractC7874ws0;
    }

    @Override // defpackage.InterfaceC6481pZ
    public final Object b(Object obj, Object obj2, Object obj3) {
        Object[] objArr = (Object[]) obj2;
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj3;
        switch (this.a) {
            case 0:
                C7048sX0 c7048sX0 = new C7048sX0(interfaceC1729Vy, (C7621vX0) this.d, 0);
                c7048sX0.c = objArr;
                return c7048sX0.invokeSuspend(C1518Tf1.a);
            case 1:
                C7048sX0 c7048sX02 = new C7048sX0(interfaceC1729Vy, (C7621vX0) this.d, 1);
                c7048sX02.c = objArr;
                return c7048sX02.invokeSuspend(C1518Tf1.a);
            default:
                C7048sX0 c7048sX03 = new C7048sX0(interfaceC1729Vy, (C3336d9) this.d, 2);
                c7048sX03.c = objArr;
                return c7048sX03.invokeSuspend(C1518Tf1.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws defpackage.C0465Fs0, java.security.NoSuchAlgorithmException, defpackage.C1319Qr0 {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7048sX0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
