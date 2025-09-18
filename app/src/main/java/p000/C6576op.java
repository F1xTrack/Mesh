package p000;

import com.facebook.react.bridge.Promise;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: op */
/* loaded from: classes2.dex */
public final class C6576op extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f39283a;

    /* renamed from: b */
    public final /* synthetic */ CameraViewModule f39284b;

    /* renamed from: c */
    public final /* synthetic */ int f39285c;

    /* renamed from: d */
    public final /* synthetic */ Promise f39286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6576op(int i, InterfaceC1382Vy interfaceC1382Vy, Promise promise, CameraViewModule cameraViewModule) {
        super(2, interfaceC1382Vy);
        this.f39284b = cameraViewModule;
        this.f39285c = i;
        this.f39286d = promise;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C6576op(this.f39285c, interfaceC1382Vy, this.f39286d, this.f39284b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6576op) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws C10233mB0 {
        C0743Lo cameraSession$react_native_vision_camera_release;
        C9619hO0 c9619hO0;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f39283a;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f39283a = 1;
            obj = this.f39284b.findCameraView(this.f39285c, this);
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
        Promise promise = this.f39286d;
        try {
            O90.m5968f(c4140gp, "<this>");
            cameraSession$react_native_vision_camera_release = c4140gp.getCameraSession$react_native_vision_camera_release();
            O90.m5968f(cameraSession$react_native_vision_camera_release, "<this>");
            c9619hO0 = cameraSession$react_native_vision_camera_release.f6873r;
        } catch (Throwable th) {
            th.printStackTrace();
            AbstractC6386lo c10233mB0 = th instanceof AbstractC6386lo ? th : new C10233mB0(th);
            promise.reject(c10233mB0.f37292a + "/" + c10233mB0.f37293b, c10233mB0.f37294c, c10233mB0.getCause());
        }
        if (c9619hO0 == null) {
            throw new C6640po(27, false);
        }
        c9619hO0.close();
        cameraSession$react_native_vision_camera_release.f6873r = null;
        promise.resolve(null);
        return C8313Tf1.f11463a;
    }
}
