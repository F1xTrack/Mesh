package p000;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: kp */
/* loaded from: classes2.dex */
public final class C6324kp extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public Promise f36704a;

    /* renamed from: b */
    public int f36705b;

    /* renamed from: c */
    public final /* synthetic */ CameraViewModule f36706c;

    /* renamed from: d */
    public final /* synthetic */ int f36707d;

    /* renamed from: e */
    public final /* synthetic */ Promise f36708e;

    /* renamed from: f */
    public final /* synthetic */ ReadableMap f36709f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6324kp(int i, InterfaceC1382Vy interfaceC1382Vy, Promise promise, ReadableMap readableMap, CameraViewModule cameraViewModule) {
        super(2, interfaceC1382Vy);
        this.f36706c = cameraViewModule;
        this.f36707d = i;
        this.f36708e = promise;
        this.f36709f = readableMap;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C6324kp(this.f36707d, interfaceC1382Vy, this.f36708e, this.f36709f, this.f36706c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6324kp) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(7:6|35|7|22|23|33|34)(2:11|12))(1:13))(2:14|(1:16))|17|37|18|(1:20)(5:21|22|23|33|34)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws p000.C10233mB0 {
        /*
            r4 = this;
            Mz r0 = p000.EnumC0817Mz.f7418a
            int r1 = r4.f36705b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            com.facebook.react.bridge.Promise r0 = r4.f36704a
            p000.RQ1.m7017d(r5)     // Catch: java.lang.Throwable -> L12
            goto L42
        L12:
            r5 = move-exception
            goto L4b
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1c:
            p000.RQ1.m7017d(r5)
            goto L30
        L20:
            p000.RQ1.m7017d(r5)
            r4.f36705b = r3
            com.mrousavy.camera.react.CameraViewModule r5 = r4.f36706c
            int r1 = r4.f36707d
            java.lang.Object r5 = com.mrousavy.camera.react.CameraViewModule.access$findCameraView(r5, r1, r4)
            if (r5 != r0) goto L30
            return r0
        L30:
            gp r5 = (p000.C4140gp) r5
            com.facebook.react.bridge.Promise r1 = r4.f36708e
            com.facebook.react.bridge.ReadableMap r3 = r4.f36709f
            r4.f36704a = r1     // Catch: java.lang.Throwable -> L49
            r4.f36705b = r2     // Catch: java.lang.Throwable -> L49
            java.lang.Object r5 = p000.HR1.m3424a(r5, r3, r4)     // Catch: java.lang.Throwable -> L49
            if (r5 != r0) goto L41
            return r0
        L41:
            r0 = r1
        L42:
            r5 = 0
            r0.resolve(r5)     // Catch: java.lang.Throwable -> L12
            goto L7c
        L47:
            r0 = r1
            goto L4b
        L49:
            r5 = move-exception
            goto L47
        L4b:
            r5.printStackTrace()
            boolean r1 = r5 instanceof p000.AbstractC6386lo
            if (r1 == 0) goto L55
            lo r5 = (p000.AbstractC6386lo) r5
            goto L5b
        L55:
            mB0 r1 = new mB0
            r1.<init>(r5)
            r5 = r1
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.f37292a
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.lang.String r2 = r5.f37293b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Throwable r2 = r5.getCause()
            java.lang.String r5 = r5.f37294c
            r0.reject(r1, r5, r2)
        L7c:
            Tf1 r5 = p000.C8313Tf1.f11463a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6324kp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
