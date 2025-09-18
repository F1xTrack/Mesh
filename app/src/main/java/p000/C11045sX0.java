package p000;

/* renamed from: sX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11045sX0 extends AbstractC9714i71 implements InterfaceC6625pZ {

    /* renamed from: a */
    public final /* synthetic */ int f42475a;

    /* renamed from: b */
    public int f42476b;

    /* renamed from: c */
    public /* synthetic */ Object[] f42477c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC11598ws0 f42478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11045sX0(InterfaceC1382Vy interfaceC1382Vy, AbstractC11598ws0 abstractC11598ws0, int i) {
        super(3, interfaceC1382Vy);
        this.f42475a = i;
        this.f42478d = abstractC11598ws0;
    }

    @Override // p000.InterfaceC6625pZ
    /* renamed from: b */
    public final Object mo300b(Object obj, Object obj2, Object obj3) {
        Object[] objArr = (Object[]) obj2;
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj3;
        switch (this.f42475a) {
            case 0:
                C11045sX0 c11045sX0 = new C11045sX0(interfaceC1382Vy, (C11429vX0) this.f42478d, 0);
                c11045sX0.f42477c = objArr;
                return c11045sX0.invokeSuspend(C8313Tf1.f11463a);
            case 1:
                C11045sX0 c11045sX02 = new C11045sX0(interfaceC1382Vy, (C11429vX0) this.f42478d, 1);
                c11045sX02.f42477c = objArr;
                return c11045sX02.invokeSuspend(C8313Tf1.f11463a);
            default:
                C11045sX0 c11045sX03 = new C11045sX0(interfaceC1382Vy, (C3910d9) this.f42478d, 2);
                c11045sX03.f42477c = objArr;
                return c11045sX03.invokeSuspend(C8313Tf1.f11463a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws p000.C7610Fs0, java.security.NoSuchAlgorithmException, p000.C8180Qr0 {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11045sX0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
