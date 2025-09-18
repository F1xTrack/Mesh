package defpackage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: pp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6529pp extends AbstractC4286i71 implements Function2 {
    public Promise a;
    public int b;
    public final /* synthetic */ CameraViewModule c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Promise e;
    public final /* synthetic */ ReadableMap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6529pp(int i, InterfaceC1729Vy interfaceC1729Vy, Promise promise, ReadableMap readableMap, CameraViewModule cameraViewModule) {
        super(2, interfaceC1729Vy);
        this.c = cameraViewModule;
        this.d = i;
        this.e = promise;
        this.f = readableMap;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C6529pp(this.d, interfaceC1729Vy, this.e, this.f, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6529pp) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(6:6|34|7|22|32|33)(2:11|12))(1:13))(2:14|(1:16))|17|36|18|(1:20)(4:21|22|32|33)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws defpackage.C5837mB0 {
        /*
            r4 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r4.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            com.facebook.react.bridge.Promise r0 = r4.a
            defpackage.RQ1.d(r5)     // Catch: java.lang.Throwable -> L12
            goto L42
        L12:
            r5 = move-exception
            goto L4a
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1c:
            defpackage.RQ1.d(r5)
            goto L30
        L20:
            defpackage.RQ1.d(r5)
            r4.b = r3
            com.mrousavy.camera.react.CameraViewModule r5 = r4.c
            int r1 = r4.d
            java.lang.Object r5 = com.mrousavy.camera.react.CameraViewModule.access$findCameraView(r5, r1, r4)
            if (r5 != r0) goto L30
            return r0
        L30:
            gp r5 = (defpackage.C4034gp) r5
            com.facebook.react.bridge.Promise r1 = r4.e
            com.facebook.react.bridge.ReadableMap r3 = r4.f
            r4.a = r1     // Catch: java.lang.Throwable -> L48
            r4.b = r2     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = defpackage.LR1.b(r5, r3, r4)     // Catch: java.lang.Throwable -> L48
            if (r5 != r0) goto L41
            return r0
        L41:
            r0 = r1
        L42:
            r0.resolve(r5)     // Catch: java.lang.Throwable -> L12
            goto L7b
        L46:
            r0 = r1
            goto L4a
        L48:
            r5 = move-exception
            goto L46
        L4a:
            r5.printStackTrace()
            boolean r1 = r5 instanceof defpackage.AbstractC5762lo
            if (r1 == 0) goto L54
            lo r5 = (defpackage.AbstractC5762lo) r5
            goto L5a
        L54:
            mB0 r1 = new mB0
            r1.<init>(r5)
            r5 = r1
        L5a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.a
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.lang.String r2 = r5.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Throwable r2 = r5.getCause()
            java.lang.String r5 = r5.c
            r0.reject(r1, r5, r2)
        L7b:
            Tf1 r5 = defpackage.C1518Tf1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6529pp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
