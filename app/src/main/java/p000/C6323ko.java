package p000;

import androidx.camera.extensions.C1691a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.mrousavy.camera.react.CameraDevicesManager;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function2;

/* renamed from: ko */
/* loaded from: classes2.dex */
public final class C6323ko extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public CameraDevicesManager f36699a;

    /* renamed from: b */
    public int f36700b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevicesManager f36701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6323ko(CameraDevicesManager cameraDevicesManager, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f36701c = cameraDevicesManager;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C6323ko(this.f36701c, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6323ko) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        CameraDevicesManager cameraDevicesManager;
        CameraDevicesManager cameraDevicesManager2;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f36700b;
        CameraDevicesManager cameraDevicesManager3 = this.f36701c;
        try {
        } catch (Exception unused) {
            cameraDevicesManager3.sendUnavailableCamerasEvent();
        }
        if (i == 0) {
            RQ1.m7017d(obj);
            CD0 cd0 = CD0.f1253b;
            RunnableC3953dr runnableC3953drM23132a = AbstractC10384nM1.m23132a(cameraDevicesManager3.reactContext);
            ExecutorService executorService = cameraDevicesManager3.executor;
            this.f36699a = cameraDevicesManager3;
            this.f36700b = 1;
            obj = AbstractC4250iZ.m19062a(runnableC3953drM23132a, executorService, this);
            if (obj == enumC0817Mz) {
                return enumC0817Mz;
            }
            cameraDevicesManager = cameraDevicesManager3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cameraDevicesManager2 = this.f36699a;
                RQ1.m7017d(obj);
                cameraDevicesManager2.extensionsManager = (C1691a) obj;
                cameraDevicesManager3.sendAvailableDevicesChangedEvent();
                return C8313Tf1.f11463a;
            }
            cameraDevicesManager = this.f36699a;
            RQ1.m7017d(obj);
        }
        cameraDevicesManager.cameraProvider = (CD0) obj;
        ReactApplicationContext reactApplicationContext = cameraDevicesManager3.reactContext;
        CD0 cd02 = cameraDevicesManager3.cameraProvider;
        O90.m5965c(cd02);
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M9899b = C1691a.m9899b(reactApplicationContext, cd02);
        O90.m5967e(interfaceFutureC7800Jj0M9899b, "getInstanceAsync(...)");
        ExecutorService executorService2 = cameraDevicesManager3.executor;
        this.f36699a = cameraDevicesManager3;
        this.f36700b = 2;
        obj = AbstractC4250iZ.m19062a(interfaceFutureC7800Jj0M9899b, executorService2, this);
        if (obj == enumC0817Mz) {
            return enumC0817Mz;
        }
        cameraDevicesManager2 = cameraDevicesManager3;
        cameraDevicesManager2.extensionsManager = (C1691a) obj;
        cameraDevicesManager3.sendAvailableDevicesChangedEvent();
        return C8313Tf1.f11463a;
    }
}
