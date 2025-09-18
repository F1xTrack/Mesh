package p000;

import com.facebook.react.bridge.Promise;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: mp */
/* loaded from: classes2.dex */
public final class C6450mp extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f37947a;

    /* renamed from: b */
    public final /* synthetic */ CameraViewModule f37948b;

    /* renamed from: c */
    public final /* synthetic */ int f37949c;

    /* renamed from: d */
    public final /* synthetic */ Promise f37950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6450mp(int i, InterfaceC1382Vy interfaceC1382Vy, Promise promise, CameraViewModule cameraViewModule) {
        super(2, interfaceC1382Vy);
        this.f37948b = cameraViewModule;
        this.f37949c = i;
        this.f37950d = promise;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C6450mp(this.f37949c, interfaceC1382Vy, this.f37950d, this.f37948b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6450mp) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws C10233mB0 {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f37947a;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f37947a = 1;
            obj = this.f37948b.findCameraView(this.f37949c, this);
            if (obj == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        C4140gp c4140gp = (C4140gp) obj;
        Promise promise = this.f37950d;
        try {
            AbstractC9767iY0.m19059b(c4140gp);
            promise.resolve(null);
        } catch (Throwable th) {
            th.printStackTrace();
            AbstractC6386lo c10233mB0 = th instanceof AbstractC6386lo ? th : new C10233mB0(th);
            promise.reject(c10233mB0.f37292a + "/" + c10233mB0.f37293b, c10233mB0.f37294c, c10233mB0.getCause());
        }
        return C8313Tf1.f11463a;
    }
}
