package defpackage;

import com.facebook.react.bridge.Promise;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: lp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5765lp extends AbstractC4286i71 implements Function2 {
    public Promise a;
    public int b;
    public final /* synthetic */ Promise c;
    public final /* synthetic */ CameraViewModule d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5765lp(int i, InterfaceC1729Vy interfaceC1729Vy, Promise promise, CameraViewModule cameraViewModule) {
        super(2, interfaceC1729Vy);
        this.c = promise;
        this.d = cameraViewModule;
        this.e = i;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C5765lp(this.e, interfaceC1729Vy, this.c, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5765lp) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            com.facebook.react.bridge.Promise r0 = r5.a
            defpackage.RQ1.d(r6)     // Catch: java.lang.Throwable -> Lf
            goto L2f
        Lf:
            r6 = move-exception
            goto L3d
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            defpackage.RQ1.d(r6)
            com.facebook.react.bridge.Promise r6 = r5.c
            com.mrousavy.camera.react.CameraViewModule r1 = r5.d
            int r3 = r5.e
            r5.a = r6     // Catch: java.lang.Throwable -> L39
            r5.b = r2     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = com.mrousavy.camera.react.CameraViewModule.access$findCameraView(r1, r3, r5)     // Catch: java.lang.Throwable -> L39
            if (r1 != r0) goto L2d
            return r0
        L2d:
            r0 = r6
            r6 = r1
        L2f:
            gp r6 = (defpackage.C4034gp) r6     // Catch: java.lang.Throwable -> Lf
            defpackage.AbstractC4366iY0.a(r6)     // Catch: java.lang.Throwable -> Lf
            r6 = 0
            r0.resolve(r6)     // Catch: java.lang.Throwable -> Lf
            goto L6e
        L39:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L3d:
            r6.printStackTrace()
            boolean r1 = r6 instanceof defpackage.AbstractC5762lo
            if (r1 == 0) goto L47
            lo r6 = (defpackage.AbstractC5762lo) r6
            goto L4d
        L47:
            mB0 r1 = new mB0
            r1.<init>(r6)
            r6 = r1
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.a
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.lang.String r2 = r6.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Throwable r2 = r6.getCause()
            java.lang.String r6 = r6.c
            r0.reject(r1, r6, r2)
        L6e:
            Tf1 r6 = defpackage.C1518Tf1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5765lp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
