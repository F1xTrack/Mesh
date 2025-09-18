package defpackage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: rp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6910rp extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ CameraViewModule b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ReadableMap d;
    public final /* synthetic */ Promise e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6910rp(int i, InterfaceC1729Vy interfaceC1729Vy, Promise promise, ReadableMap readableMap, CameraViewModule cameraViewModule) {
        super(2, interfaceC1729Vy);
        this.b = cameraViewModule;
        this.c = i;
        this.d = readableMap;
        this.e = promise;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        ReadableMap readableMap = this.d;
        return new C6910rp(this.c, interfaceC1729Vy, this.e, readableMap, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6910rp) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws C5837mB0 {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        CameraViewModule cameraViewModule = this.b;
        if (i == 0) {
            RQ1.d(obj);
            this.a = 1;
            obj = cameraViewModule.findCameraView(this.c, this);
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
        boolean zIsOnUiThread = UiThreadUtil.isOnUiThread();
        ReadableMap readableMap = this.d;
        Promise promise = this.e;
        if (zIsOnUiThread) {
            try {
                ReactApplicationContext reactApplicationContext = cameraViewModule.getReactApplicationContext();
                O90.e(reactApplicationContext, "access$getReactApplicationContext(...)");
                promise.resolve(NR1.c(c4034gp, TT1.a(reactApplicationContext, readableMap)));
            } catch (Throwable th) {
                promise.reject(th);
            }
        } else {
            UiThreadUtil.runOnUiThread(new RunnableC6720qp(cameraViewModule, readableMap, c4034gp, promise, 0));
        }
        return C1518Tf1.a;
    }
}
