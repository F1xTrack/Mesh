package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: dp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3461dp extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ C4034gp b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3461dp(C4034gp c4034gp, long j, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c4034gp;
        this.c = j;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C3461dp(this.b, this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3461dp) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            C4034gp c4034gp = this.b;
            C0920Lo cameraSession$react_native_vision_camera_release = c4034gp.getCameraSession$react_native_vision_camera_release();
            C3271cp c3271cp = new C3271cp(c4034gp, this.c);
            this.a = 1;
            if (cameraSession$react_native_vision_camera_release.a(c3271cp, this) == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        return C1518Tf1.a;
    }
}
