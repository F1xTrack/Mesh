package defpackage;

import com.facebook.react.bridge.Promise;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: jp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5383jp extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ CameraViewModule b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Promise d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5383jp(int i, InterfaceC1729Vy interfaceC1729Vy, Promise promise, CameraViewModule cameraViewModule) {
        super(2, interfaceC1729Vy);
        this.b = cameraViewModule;
        this.c = i;
        this.d = promise;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C5383jp(this.c, interfaceC1729Vy, this.d, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5383jp) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws C5837mB0 {
        C0920Lo cameraSession$react_native_vision_camera_release;
        C4145hO0 c4145hO0;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            this.a = 1;
            obj = this.b.findCameraView(this.c, this);
            if (obj == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        C4034gp c4034gp = (C4034gp) obj;
        Promise promise = this.d;
        try {
            O90.f(c4034gp, "<this>");
            cameraSession$react_native_vision_camera_release = c4034gp.getCameraSession$react_native_vision_camera_release();
            O90.f(cameraSession$react_native_vision_camera_release, "<this>");
            cameraSession$react_native_vision_camera_release.s = true;
            c4145hO0 = cameraSession$react_native_vision_camera_release.r;
        } catch (Throwable th) {
            th.printStackTrace();
            AbstractC5762lo c5837mB0 = th instanceof AbstractC5762lo ? th : new C5837mB0(th);
            promise.reject(c5837mB0.a + "/" + c5837mB0.b, c5837mB0.c, c5837mB0.getCause());
        }
        if (c4145hO0 == null) {
            throw new C6526po(27, false);
        }
        c4145hO0.close();
        cameraSession$react_native_vision_camera_release.r = null;
        promise.resolve(null);
        return C1518Tf1.a;
    }
}
