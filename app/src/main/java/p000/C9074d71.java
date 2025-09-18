package p000;

import expo.modules.kotlin.jni.PromiseImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: d71, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9074d71 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public C9330f71 f25824a;

    /* renamed from: b */
    public String f25825b;

    /* renamed from: c */
    public PromiseImpl f25826c;

    /* renamed from: d */
    public int f25827d;

    /* renamed from: e */
    public /* synthetic */ Object f25828e;

    /* renamed from: f */
    public final /* synthetic */ PromiseImpl f25829f;

    /* renamed from: g */
    public final /* synthetic */ C9330f71 f25830g;

    /* renamed from: h */
    public final /* synthetic */ String f25831h;

    /* renamed from: i */
    public final /* synthetic */ Object[] f25832i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9074d71(PromiseImpl promiseImpl, C9330f71 c9330f71, String str, Object[] objArr, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f25829f = promiseImpl;
        this.f25830g = c9330f71;
        this.f25831h = str;
        this.f25832i = objArr;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C9074d71 c9074d71 = new C9074d71(this.f25829f, this.f25830g, this.f25831h, this.f25832i, interfaceC1382Vy);
        c9074d71.f25828e = obj;
        return c9074d71;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9074d71) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:24:0x005b, B:26:0x0060, B:28:0x0064, B:33:0x0088, B:34:0x008f, B:31:0x007b, B:32:0x0085, B:13:0x002b), top: B:51:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:24:0x005b, B:26:0x0060, B:28:0x0064, B:33:0x0088, B:34:0x008f, B:31:0x007b, B:32:0x0085, B:13:0x002b), top: B:51:0x002b }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [i71, pZ] */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r9.f25827d
            expo.modules.kotlin.jni.PromiseImpl r2 = r9.f25829f
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 != r3) goto L1b
            expo.modules.kotlin.jni.PromiseImpl r0 = r9.f25826c
            java.lang.String r1 = r9.f25825b
            f71 r3 = r9.f25824a
            java.lang.Object r4 = r9.f25828e
            Lz r4 = (p000.InterfaceC0754Lz) r4
            p000.RQ1.m7017d(r10)     // Catch: java.lang.Throwable -> L19
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
            p000.RQ1.m7017d(r10)
            java.lang.Object r10 = r9.f25828e
            r4 = r10
            Lz r4 = (p000.InterfaceC0754Lz) r4
            f71 r10 = r9.f25830g     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = r9.f25831h     // Catch: java.lang.Throwable -> L79
            java.lang.Object[] r5 = r9.f25832i     // Catch: java.lang.Throwable -> L79
            i71 r6 = r10.f27083e     // Catch: java.lang.Throwable -> L58
            r7 = 0
            java.lang.Object[] r5 = r10.m5540c(r5, r7)     // Catch: java.lang.Throwable -> L58
            r9.f25828e = r4     // Catch: java.lang.Throwable -> L58
            r9.f25824a = r10     // Catch: java.lang.Throwable -> L58
            r9.f25825b = r1     // Catch: java.lang.Throwable -> L58
            r9.f25826c = r2     // Catch: java.lang.Throwable -> L58
            r9.f25827d = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r3 = r6.mo300b(r4, r5, r9)     // Catch: java.lang.Throwable -> L58
            if (r3 != r0) goto L49
            return r0
        L49:
            r0 = r2
            r8 = r3
            r3 = r10
            r10 = r8
        L4d:
            boolean r4 = p000.AbstractC11432vY1.m25447d(r4)     // Catch: java.lang.Throwable -> L19
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
            boolean r0 = r10 instanceof p000.AbstractC6266ju     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L7b
            expo.modules.kotlin.exception.CodedException r0 = new expo.modules.kotlin.exception.CodedException     // Catch: java.lang.Throwable -> L79
            r4 = r10
            ju r4 = (p000.AbstractC6266ju) r4     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r4.mo2811a()     // Catch: java.lang.Throwable -> L79
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
            java.lang.String r3 = r3.f7489a     // Catch: java.lang.Throwable -> L79
            r10.<init>(r3, r1, r0)     // Catch: java.lang.Throwable -> L79
            throw r10     // Catch: java.lang.Throwable -> L79
        L90:
            boolean r0 = r2.f26961a
            if (r0 != 0) goto Lc5
            boolean r0 = r10 instanceof expo.modules.kotlin.exception.CodedException
            if (r0 == 0) goto L9b
            expo.modules.kotlin.exception.CodedException r10 = (expo.modules.kotlin.exception.CodedException) r10
            goto Lbf
        L9b:
            boolean r0 = r10 instanceof p000.AbstractC6266ju
            if (r0 == 0) goto Lb5
            expo.modules.kotlin.exception.CodedException r0 = new expo.modules.kotlin.exception.CodedException
            r1 = r10
            ju r1 = (p000.AbstractC6266ju) r1
            java.lang.String r1 = r1.mo2811a()
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
            p000.FM1.m2585l(r2, r10)
        Lc2:
            Tf1 r10 = p000.C8313Tf1.f11463a
            return r10
        Lc5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9074d71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
