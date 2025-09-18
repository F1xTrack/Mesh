package defpackage;

import expo.modules.kotlin.jni.PromiseImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: d71, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3332d71 extends AbstractC4286i71 implements Function2 {
    public C3713f71 a;
    public String b;
    public PromiseImpl c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ PromiseImpl f;
    public final /* synthetic */ C3713f71 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Object[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3332d71(PromiseImpl promiseImpl, C3713f71 c3713f71, String str, Object[] objArr, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.f = promiseImpl;
        this.g = c3713f71;
        this.h = str;
        this.i = objArr;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C3332d71 c3332d71 = new C3332d71(this.f, this.g, this.h, this.i, interfaceC1729Vy);
        c3332d71.e = obj;
        return c3332d71;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3332d71) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:24:0x005b, B:26:0x0060, B:28:0x0064, B:33:0x0088, B:34:0x008f, B:31:0x007b, B:32:0x0085, B:13:0x002b), top: B:51:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:24:0x005b, B:26:0x0060, B:28:0x0064, B:33:0x0088, B:34:0x008f, B:31:0x007b, B:32:0x0085, B:13:0x002b), top: B:51:0x002b }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [i71, pZ] */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r9.d
            expo.modules.kotlin.jni.PromiseImpl r2 = r9.f
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 != r3) goto L1b
            expo.modules.kotlin.jni.PromiseImpl r0 = r9.c
            java.lang.String r1 = r9.b
            f71 r3 = r9.a
            java.lang.Object r4 = r9.e
            Lz r4 = (defpackage.InterfaceC0952Lz) r4
            defpackage.RQ1.d(r10)     // Catch: java.lang.Throwable -> L19
            goto L4d
        L19:
            r10 = move-exception
            goto L5b
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            defpackage.RQ1.d(r10)
            java.lang.Object r10 = r9.e
            r4 = r10
            Lz r4 = (defpackage.InterfaceC0952Lz) r4
            f71 r10 = r9.g     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = r9.h     // Catch: java.lang.Throwable -> L79
            java.lang.Object[] r5 = r9.i     // Catch: java.lang.Throwable -> L79
            i71 r6 = r10.e     // Catch: java.lang.Throwable -> L58
            r7 = 0
            java.lang.Object[] r5 = r10.c(r5, r7)     // Catch: java.lang.Throwable -> L58
            r9.e = r4     // Catch: java.lang.Throwable -> L58
            r9.a = r10     // Catch: java.lang.Throwable -> L58
            r9.b = r1     // Catch: java.lang.Throwable -> L58
            r9.c = r2     // Catch: java.lang.Throwable -> L58
            r9.d = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r3 = r6.b(r4, r5, r9)     // Catch: java.lang.Throwable -> L58
            if (r3 != r0) goto L49
            return r0
        L49:
            r0 = r2
            r8 = r3
            r3 = r10
            r10 = r8
        L4d:
            boolean r4 = defpackage.AbstractC7625vY1.d(r4)     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto Lc2
            r0.resolve(r10)     // Catch: java.lang.Throwable -> L19
            goto Lc2
        L58:
            r0 = move-exception
            r3 = r10
            r10 = r0
        L5b:
            boolean r0 = r10 instanceof expo.modules.kotlin.exception.CodedException     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L85
            boolean r0 = r10 instanceof defpackage.AbstractC5398ju     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L7b
            expo.modules.kotlin.exception.CodedException r0 = new expo.modules.kotlin.exception.CodedException     // Catch: java.lang.Throwable -> L79
            r4 = r10
            ju r4 = (defpackage.AbstractC5398ju) r4     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = r10.getMessage()     // Catch: java.lang.Throwable -> L79
            java.lang.Throwable r10 = r10.getCause()     // Catch: java.lang.Throwable -> L79
            r0.<init>(r4, r5, r10)     // Catch: java.lang.Throwable -> L79
            goto L88
        L79:
            r10 = move-exception
            goto L90
        L7b:
            expo.modules.kotlin.exception.UnexpectedException r0 = new expo.modules.kotlin.exception.UnexpectedException     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> L79
            r0.<init>(r4, r10)     // Catch: java.lang.Throwable -> L79
            goto L88
        L85:
            r0 = r10
            expo.modules.kotlin.exception.CodedException r0 = (expo.modules.kotlin.exception.CodedException) r0     // Catch: java.lang.Throwable -> L79
        L88:
            k8 r10 = new k8     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r3.a     // Catch: java.lang.Throwable -> L79
            r10.<init>(r3, r1, r0)     // Catch: java.lang.Throwable -> L79
            throw r10     // Catch: java.lang.Throwable -> L79
        L90:
            boolean r0 = r2.a
            if (r0 != 0) goto Lc5
            boolean r0 = r10 instanceof expo.modules.kotlin.exception.CodedException
            if (r0 == 0) goto L9b
            expo.modules.kotlin.exception.CodedException r10 = (expo.modules.kotlin.exception.CodedException) r10
            goto Lbf
        L9b:
            boolean r0 = r10 instanceof defpackage.AbstractC5398ju
            if (r0 == 0) goto Lb5
            expo.modules.kotlin.exception.CodedException r0 = new expo.modules.kotlin.exception.CodedException
            r1 = r10
            ju r1 = (defpackage.AbstractC5398ju) r1
            java.lang.String r1 = r1.a()
            java.lang.String r3 = r10.getMessage()
            java.lang.Throwable r10 = r10.getCause()
            r0.<init>(r1, r3, r10)
        Lb3:
            r10 = r0
            goto Lbf
        Lb5:
            expo.modules.kotlin.exception.UnexpectedException r0 = new expo.modules.kotlin.exception.UnexpectedException
            java.lang.String r1 = r10.toString()
            r0.<init>(r1, r10)
            goto Lb3
        Lbf:
            defpackage.FM1.l(r2, r10)
        Lc2:
            Tf1 r10 = defpackage.C1518Tf1.a
            return r10
        Lc5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3332d71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
