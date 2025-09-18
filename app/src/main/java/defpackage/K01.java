package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class K01 extends AbstractC4286i71 implements Function2 {
    public Function2 a;
    public int b;
    public final /* synthetic */ C6860rY0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K01(C6860rY0 c6860rY0, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = c6860rY0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new K01(this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((K01) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0139, code lost:
    
        r10 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013b, code lost:
    
        r10.b(r4, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0157, code lost:
    
        if (r8 == defpackage.AbstractC0281Dj.n) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0159, code lost:
    
        r4.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015c, code lost:
    
        if (r3 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015e, code lost:
    
        r3 = r7.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0163, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
    
        throw new java.lang.IllegalStateException("unexpected");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ac  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x019c -> B:95:0x019f). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K01.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
