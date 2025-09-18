package defpackage;

import com.facebook.react.bridge.ReadableArray;
import kotlin.jvm.functions.Function2;

/* renamed from: e71, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3522e71 extends AbstractC4286i71 implements Function2 {
    public C3713f71 a;
    public C0387Es0 b;
    public C1592Ue0 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1592Ue0 f;
    public final /* synthetic */ C3713f71 g;
    public final /* synthetic */ C0387Es0 h;
    public final /* synthetic */ ReadableArray i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3522e71(C1592Ue0 c1592Ue0, C3713f71 c3713f71, C0387Es0 c0387Es0, ReadableArray readableArray, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.f = c1592Ue0;
        this.g = c3713f71;
        this.h = c0387Es0;
        this.i = readableArray;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C3522e71 c3522e71 = new C3522e71(this.f, this.g, this.h, this.i, interfaceC1729Vy);
        c3522e71.e = obj;
        return c3522e71;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3522e71) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[Catch: all -> 0x0077, CodedException -> 0x0079, TryCatch #4 {CodedException -> 0x0079, all -> 0x0077, blocks: (B:24:0x0059, B:26:0x005e, B:28:0x0062, B:35:0x0088, B:36:0x0093, B:33:0x007b, B:34:0x0085, B:13:0x002b), top: B:45:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[Catch: all -> 0x0077, CodedException -> 0x0079, TryCatch #4 {CodedException -> 0x0079, all -> 0x0077, blocks: (B:24:0x0059, B:26:0x005e, B:28:0x0062, B:35:0x0088, B:36:0x0093, B:33:0x007b, B:34:0x0085, B:13:0x002b), top: B:45:0x002b }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [i71, pZ] */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r8.d
            Ue0 r2 = r8.f
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 != r3) goto L1b
            Ue0 r0 = r8.c
            Es0 r1 = r8.b
            f71 r3 = r8.a
            java.lang.Object r4 = r8.e
            Lz r4 = (defpackage.InterfaceC0952Lz) r4
            defpackage.RQ1.d(r9)     // Catch: java.lang.Throwable -> L19
            goto L4c
        L19:
            r9 = move-exception
            goto L59
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            defpackage.RQ1.d(r9)
            java.lang.Object r9 = r8.e
            r4 = r9
            Lz r4 = (defpackage.InterfaceC0952Lz) r4
            f71 r9 = r8.g     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            Es0 r1 = r8.h     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            com.facebook.react.bridge.ReadableArray r5 = r8.i     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            i71 r6 = r9.e     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r5 = r9.b(r5)     // Catch: java.lang.Throwable -> L56
            r8.e = r4     // Catch: java.lang.Throwable -> L56
            r8.a = r9     // Catch: java.lang.Throwable -> L56
            r8.b = r1     // Catch: java.lang.Throwable -> L56
            r8.c = r2     // Catch: java.lang.Throwable -> L56
            r8.d = r3     // Catch: java.lang.Throwable -> L56
            java.lang.Object r3 = r6.b(r4, r5, r8)     // Catch: java.lang.Throwable -> L56
            if (r3 != r0) goto L48
            return r0
        L48:
            r0 = r2
            r7 = r3
            r3 = r9
            r9 = r7
        L4c:
            boolean r4 = defpackage.AbstractC7625vY1.d(r4)     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto La4
            r0.resolve(r9)     // Catch: java.lang.Throwable -> L19
            goto La4
        L56:
            r0 = move-exception
            r3 = r9
            r9 = r0
        L59:
            boolean r0 = r9 instanceof expo.modules.kotlin.exception.CodedException     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            if (r0 != 0) goto L85
            boolean r0 = r9 instanceof defpackage.AbstractC5398ju     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            if (r0 == 0) goto L7b
            expo.modules.kotlin.exception.CodedException r0 = new expo.modules.kotlin.exception.CodedException     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            r4 = r9
            ju r4 = (defpackage.AbstractC5398ju) r4     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            java.lang.String r5 = r9.getMessage()     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            java.lang.Throwable r9 = r9.getCause()     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            r0.<init>(r4, r5, r9)     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            goto L88
        L77:
            r9 = move-exception
            goto L94
        L79:
            r9 = move-exception
            goto La1
        L7b:
            expo.modules.kotlin.exception.UnexpectedException r0 = new expo.modules.kotlin.exception.UnexpectedException     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            r0.<init>(r4, r9)     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            goto L88
        L85:
            r0 = r9
            expo.modules.kotlin.exception.CodedException r0 = (expo.modules.kotlin.exception.CodedException) r0     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
        L88:
            k8 r9 = new k8     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            java.lang.String r3 = r3.a     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            As0 r1 = r1.b     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            java.lang.String r1 = r1.a     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            r9.<init>(r3, r1, r0)     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            throw r9     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
        L94:
            expo.modules.kotlin.exception.UnexpectedException r0 = new expo.modules.kotlin.exception.UnexpectedException
            java.lang.String r1 = r9.toString()
            r0.<init>(r1, r9)
            defpackage.FM1.l(r2, r0)
            goto La4
        La1:
            defpackage.FM1.l(r2, r9)
        La4:
            Tf1 r9 = defpackage.C1518Tf1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3522e71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
