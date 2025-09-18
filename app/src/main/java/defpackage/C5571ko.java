package defpackage;

import androidx.camera.extensions.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.mrousavy.camera.react.CameraDevicesManager;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function2;

/* renamed from: ko, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5571ko extends AbstractC4286i71 implements Function2 {
    public CameraDevicesManager a;
    public int b;
    public final /* synthetic */ CameraDevicesManager c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5571ko(CameraDevicesManager cameraDevicesManager, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = cameraDevicesManager;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C5571ko(this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5571ko) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        CameraDevicesManager cameraDevicesManager;
        CameraDevicesManager cameraDevicesManager2;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.b;
        CameraDevicesManager cameraDevicesManager3 = this.c;
        try {
        } catch (Exception unused) {
            cameraDevicesManager3.sendUnavailableCamerasEvent();
        }
        if (i == 0) {
            RQ1.d(obj);
            CD0 cd0 = CD0.b;
            RunnableC3467dr runnableC3467drA = AbstractC6062nM1.a(cameraDevicesManager3.reactContext);
            ExecutorService executorService = cameraDevicesManager3.executor;
            this.a = cameraDevicesManager3;
            this.b = 1;
            obj = AbstractC4368iZ.a(runnableC3467drA, executorService, this);
            if (obj == enumC1030Mz) {
                return enumC1030Mz;
            }
            cameraDevicesManager = cameraDevicesManager3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cameraDevicesManager2 = this.a;
                RQ1.d(obj);
                cameraDevicesManager2.extensionsManager = (a) obj;
                cameraDevicesManager3.sendAvailableDevicesChangedEvent();
                return C1518Tf1.a;
            }
            cameraDevicesManager = this.a;
            RQ1.d(obj);
        }
        cameraDevicesManager.cameraProvider = (CD0) obj;
        ReactApplicationContext reactApplicationContext = cameraDevicesManager3.reactContext;
        CD0 cd02 = cameraDevicesManager3.cameraProvider;
        O90.c(cd02);
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0B = a.b(reactApplicationContext, cd02);
        O90.e(interfaceFutureC0750Jj0B, "getInstanceAsync(...)");
        ExecutorService executorService2 = cameraDevicesManager3.executor;
        this.a = cameraDevicesManager3;
        this.b = 2;
        obj = AbstractC4368iZ.a(interfaceFutureC0750Jj0B, executorService2, this);
        if (obj == enumC1030Mz) {
            return enumC1030Mz;
        }
        cameraDevicesManager2 = cameraDevicesManager3;
        cameraDevicesManager2.extensionsManager = (a) obj;
        cameraDevicesManager3.sendAvailableDevicesChangedEvent();
        return C1518Tf1.a;
    }
}
