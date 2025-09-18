package defpackage;

import com.facebook.react.bridge.Promise;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: mp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5956mp extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ CameraViewModule b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Promise d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5956mp(int i, InterfaceC1729Vy interfaceC1729Vy, Promise promise, CameraViewModule cameraViewModule) {
        super(2, interfaceC1729Vy);
        this.b = cameraViewModule;
        this.c = i;
        this.d = promise;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C5956mp(this.c, interfaceC1729Vy, this.d, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5956mp) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws C5837mB0 {
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
            AbstractC4366iY0.b(c4034gp);
            promise.resolve(null);
        } catch (Throwable th) {
            th.printStackTrace();
            AbstractC5762lo c5837mB0 = th instanceof AbstractC5762lo ? th : new C5837mB0(th);
            promise.reject(c5837mB0.a + "/" + c5837mB0.b, c5837mB0.c, c5837mB0.getCause());
        }
        return C1518Tf1.a;
    }
}
