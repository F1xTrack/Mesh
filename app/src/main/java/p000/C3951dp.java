package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: dp */
/* loaded from: classes2.dex */
public final class C3951dp extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f26279a;

    /* renamed from: b */
    public final /* synthetic */ C4140gp f26280b;

    /* renamed from: c */
    public final /* synthetic */ long f26281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3951dp(C4140gp c4140gp, long j, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f26280b = c4140gp;
        this.f26281c = j;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C3951dp(this.f26280b, this.f26281c, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3951dp) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f26279a;
        if (i == 0) {
            RQ1.m7017d(obj);
            C4140gp c4140gp = this.f26280b;
            C0743Lo cameraSession$react_native_vision_camera_release = c4140gp.getCameraSession$react_native_vision_camera_release();
            C3889cp c3889cp = new C3889cp(c4140gp, this.f26281c);
            this.f26279a = 1;
            if (cameraSession$react_native_vision_camera_release.m5107a(c3889cp, this) == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        return C8313Tf1.f11463a;
    }
}
