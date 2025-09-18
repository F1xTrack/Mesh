package p000;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: np */
/* loaded from: classes2.dex */
public final class C6513np extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f38545a;

    /* renamed from: b */
    public final /* synthetic */ CameraViewModule f38546b;

    /* renamed from: c */
    public final /* synthetic */ int f38547c;

    /* renamed from: d */
    public final /* synthetic */ ReadableMap f38548d;

    /* renamed from: e */
    public final /* synthetic */ Callback f38549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6513np(CameraViewModule cameraViewModule, int i, ReadableMap readableMap, Callback callback, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f38546b = cameraViewModule;
        this.f38547c = i;
        this.f38548d = readableMap;
        this.f38549e = callback;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C6513np(this.f38546b, this.f38547c, this.f38548d, this.f38549e, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6513np) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws C10233mB0 {
        Callback callback = this.f38549e;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f38545a;
        CameraViewModule cameraViewModule = this.f38546b;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f38545a = 1;
            obj = cameraViewModule.findCameraView(this.f38547c, this);
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
        try {
            ReactApplicationContext reactApplicationContext = cameraViewModule.getReactApplicationContext();
            O90.m5967e(reactApplicationContext, "access$getReactApplicationContext(...)");
            AbstractC9767iY0.m19060c(c4140gp, AbstractC8977cP1.m10692a(reactApplicationContext, this.f38548d), callback);
        } catch (AbstractC6386lo e) {
            callback.invoke(null, AbstractC11416vQ1.m25421e(8, e.f37292a + "/" + e.f37293b, e.f37294c, e));
        } catch (Throwable th) {
            callback.invoke(null, AbstractC11416vQ1.m25421e(8, "capture/unknown", "An unknown error occurred while trying to start a video recording! " + th.getMessage(), th));
        }
        return C8313Tf1.f11463a;
    }
}
