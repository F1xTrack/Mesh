package p000;

import com.facebook.react.bridge.Promise;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: lp */
/* loaded from: classes2.dex */
public final class C6387lp extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public Promise f37298a;

    /* renamed from: b */
    public int f37299b;

    /* renamed from: c */
    public final /* synthetic */ Promise f37300c;

    /* renamed from: d */
    public final /* synthetic */ CameraViewModule f37301d;

    /* renamed from: e */
    public final /* synthetic */ int f37302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6387lp(int i, InterfaceC1382Vy interfaceC1382Vy, Promise promise, CameraViewModule cameraViewModule) {
        super(2, interfaceC1382Vy);
        this.f37300c = promise;
        this.f37301d = cameraViewModule;
        this.f37302e = i;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C6387lp(this.f37302e, interfaceC1382Vy, this.f37300c, this.f37301d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6387lp) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r5.f37299b
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            com.facebook.react.bridge.Promise r0 = r5.f37298a
            p000.RQ1.m7017d(r6)     // Catch: java.lang.Throwable -> Lf
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
            p000.RQ1.m7017d(r6)
            com.facebook.react.bridge.Promise r6 = r5.f37300c
            com.mrousavy.camera.react.CameraViewModule r1 = r5.f37301d
            int r3 = r5.f37302e
            r5.f37298a = r6     // Catch: java.lang.Throwable -> L39
            r5.f37299b = r2     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = com.mrousavy.camera.react.CameraViewModule.access$findCameraView(r1, r3, r5)     // Catch: java.lang.Throwable -> L39
            if (r1 != r0) goto L2d
            return r0
        L2d:
            r0 = r6
            r6 = r1
        L2f:
            gp r6 = (p000.C4140gp) r6     // Catch: java.lang.Throwable -> Lf
            p000.AbstractC9767iY0.m19058a(r6)     // Catch: java.lang.Throwable -> Lf
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
            boolean r1 = r6 instanceof p000.AbstractC6386lo
            if (r1 == 0) goto L47
            lo r6 = (p000.AbstractC6386lo) r6
            goto L4d
        L47:
            mB0 r1 = new mB0
            r1.<init>(r6)
            r6 = r1
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.f37292a
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.lang.String r2 = r6.f37293b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Throwable r2 = r6.getCause()
            java.lang.String r6 = r6.f37294c
            r0.reject(r1, r6, r2)
        L6e:
            Tf1 r6 = p000.C8313Tf1.f11463a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6387lp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
