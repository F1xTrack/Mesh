package defpackage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.mrousavy.camera.react.CameraViewModule;
import kotlin.jvm.functions.Function2;

/* renamed from: np, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6147np extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ CameraViewModule b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ReadableMap d;
    public final /* synthetic */ Callback e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6147np(CameraViewModule cameraViewModule, int i, ReadableMap readableMap, Callback callback, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = cameraViewModule;
        this.c = i;
        this.d = readableMap;
        this.e = callback;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C6147np(this.b, this.c, this.d, this.e, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6147np) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws C5837mB0 {
        Callback callback = this.e;
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
        try {
            ReactApplicationContext reactApplicationContext = cameraViewModule.getReactApplicationContext();
            O90.e(reactApplicationContext, "access$getReactApplicationContext(...)");
            AbstractC4366iY0.c(c4034gp, AbstractC2510cP1.a(reactApplicationContext, this.d), callback);
        } catch (AbstractC5762lo e) {
            callback.invoke(null, AbstractC7601vQ1.e(8, e.a + "/" + e.b, e.c, e));
        } catch (Throwable th) {
            callback.invoke(null, AbstractC7601vQ1.e(8, "capture/unknown", "An unknown error occurred while trying to start a video recording! " + th.getMessage(), th));
        }
        return C1518Tf1.a;
    }
}
