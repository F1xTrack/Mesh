package p000;

import com.facebook.react.bridge.ReadableArray;
import kotlin.jvm.functions.Function2;

/* renamed from: e71, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9202e71 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public C9330f71 f26546a;

    /* renamed from: b */
    public C7558Es0 f26547b;

    /* renamed from: c */
    public C8362Ue0 f26548c;

    /* renamed from: d */
    public int f26549d;

    /* renamed from: e */
    public /* synthetic */ Object f26550e;

    /* renamed from: f */
    public final /* synthetic */ C8362Ue0 f26551f;

    /* renamed from: g */
    public final /* synthetic */ C9330f71 f26552g;

    /* renamed from: h */
    public final /* synthetic */ C7558Es0 f26553h;

    /* renamed from: i */
    public final /* synthetic */ ReadableArray f26554i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9202e71(C8362Ue0 c8362Ue0, C9330f71 c9330f71, C7558Es0 c7558Es0, ReadableArray readableArray, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f26551f = c8362Ue0;
        this.f26552g = c9330f71;
        this.f26553h = c7558Es0;
        this.f26554i = readableArray;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C9202e71 c9202e71 = new C9202e71(this.f26551f, this.f26552g, this.f26553h, this.f26554i, interfaceC1382Vy);
        c9202e71.f26550e = obj;
        return c9202e71;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9202e71) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[Catch: all -> 0x0077, CodedException -> 0x0079, TryCatch #4 {CodedException -> 0x0079, all -> 0x0077, blocks: (B:24:0x0059, B:26:0x005e, B:28:0x0062, B:35:0x0088, B:36:0x0093, B:33:0x007b, B:34:0x0085, B:13:0x002b), top: B:45:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[Catch: all -> 0x0077, CodedException -> 0x0079, TryCatch #4 {CodedException -> 0x0079, all -> 0x0077, blocks: (B:24:0x0059, B:26:0x005e, B:28:0x0062, B:35:0x0088, B:36:0x0093, B:33:0x007b, B:34:0x0085, B:13:0x002b), top: B:45:0x002b }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [i71, pZ] */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r8.f26549d
            Ue0 r2 = r8.f26551f
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 != r3) goto L1b
            Ue0 r0 = r8.f26548c
            Es0 r1 = r8.f26547b
            f71 r3 = r8.f26546a
            java.lang.Object r4 = r8.f26550e
            Lz r4 = (p000.InterfaceC0754Lz) r4
            p000.RQ1.m7017d(r9)     // Catch: java.lang.Throwable -> L19
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
            p000.RQ1.m7017d(r9)
            java.lang.Object r9 = r8.f26550e
            r4 = r9
            Lz r4 = (p000.InterfaceC0754Lz) r4
            f71 r9 = r8.f26552g     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            Es0 r1 = r8.f26553h     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            com.facebook.react.bridge.ReadableArray r5 = r8.f26554i     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            i71 r6 = r9.f27083e     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r5 = r9.m5539b(r5)     // Catch: java.lang.Throwable -> L56
            r8.f26550e = r4     // Catch: java.lang.Throwable -> L56
            r8.f26546a = r9     // Catch: java.lang.Throwable -> L56
            r8.f26547b = r1     // Catch: java.lang.Throwable -> L56
            r8.f26548c = r2     // Catch: java.lang.Throwable -> L56
            r8.f26549d = r3     // Catch: java.lang.Throwable -> L56
            java.lang.Object r3 = r6.mo300b(r4, r5, r8)     // Catch: java.lang.Throwable -> L56
            if (r3 != r0) goto L48
            return r0
        L48:
            r0 = r2
            r7 = r3
            r3 = r9
            r9 = r7
        L4c:
            boolean r4 = p000.AbstractC11432vY1.m25447d(r4)     // Catch: java.lang.Throwable -> L19
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
            boolean r0 = r9 instanceof p000.AbstractC6266ju     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            if (r0 == 0) goto L7b
            expo.modules.kotlin.exception.CodedException r0 = new expo.modules.kotlin.exception.CodedException     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            r4 = r9
            ju r4 = (p000.AbstractC6266ju) r4     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            java.lang.String r4 = r4.mo2811a()     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
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
            java.lang.String r3 = r3.f7489a     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            As0 r1 = r1.f2934b     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            java.lang.String r1 = r1.f454a     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            r9.<init>(r3, r1, r0)     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
            throw r9     // Catch: java.lang.Throwable -> L77 expo.modules.kotlin.exception.CodedException -> L79
        L94:
            expo.modules.kotlin.exception.UnexpectedException r0 = new expo.modules.kotlin.exception.UnexpectedException
            java.lang.String r1 = r9.toString()
            r0.<init>(r1, r9)
            p000.FM1.m2585l(r2, r0)
            goto La4
        La1:
            p000.FM1.m2585l(r2, r9)
        La4:
            Tf1 r9 = p000.C8313Tf1.f11463a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9202e71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
