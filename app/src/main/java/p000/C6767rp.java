package p000;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: rp */
/* loaded from: classes2.dex */
public final class C6767rp extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f41919a;

    /* renamed from: b */
    public final /* synthetic */ CameraViewModule f41920b;

    /* renamed from: c */
    public final /* synthetic */ int f41921c;

    /* renamed from: d */
    public final /* synthetic */ ReadableMap f41922d;

    /* renamed from: e */
    public final /* synthetic */ Promise f41923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6767rp(int i, InterfaceC1382Vy interfaceC1382Vy, Promise promise, ReadableMap readableMap, CameraViewModule cameraViewModule) {
        super(2, interfaceC1382Vy);
        this.f41920b = cameraViewModule;
        this.f41921c = i;
        this.f41922d = readableMap;
        this.f41923e = promise;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        ReadableMap readableMap = this.f41922d;
        return new C6767rp(this.f41921c, interfaceC1382Vy, this.f41923e, readableMap, this.f41920b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6767rp) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws C10233mB0 {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f41919a;
        CameraViewModule cameraViewModule = this.f41920b;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f41919a = 1;
            obj = cameraViewModule.findCameraView(this.f41921c, this);
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
        boolean zIsOnUiThread = UiThreadUtil.isOnUiThread();
        ReadableMap readableMap = this.f41922d;
        Promise promise = this.f41923e;
        if (zIsOnUiThread) {
            try {
                ReactApplicationContext reactApplicationContext = cameraViewModule.getReactApplicationContext();
                O90.m5967e(reactApplicationContext, "access$getReactApplicationContext(...)");
                promise.resolve(NR1.m5690c(c4140gp, TT1.m7695a(reactApplicationContext, readableMap)));
            } catch (Throwable th) {
                promise.reject(th);
            }
        } else {
            UiThreadUtil.runOnUiThread(new RunnableC6704qp(cameraViewModule, readableMap, c4140gp, promise, 0));
        }
        return C8313Tf1.f11463a;
    }
}
