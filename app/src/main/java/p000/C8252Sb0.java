package p000;

import expo.modules.kotlin.jni.JavaCallback;

/* renamed from: Sb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8252Sb0 extends AbstractC0351FZ implements InterfaceC6497nZ {

    /* renamed from: a */
    public final /* synthetic */ int f10864a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8252Sb0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.f10864a = i3;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f10864a) {
            case 0:
                ((AbstractC8356Ub0) this.receiver).mo2435k((Throwable) obj);
                return C8313Tf1.f11463a;
            case 1:
                ((JavaCallback) this.receiver).m18098e(obj);
                return C8313Tf1.f11463a;
            case 2:
                ((InterfaceC11518wE0) this.receiver).resolve(obj);
                return C8313Tf1.f11463a;
            case 3:
                String str = (String) obj;
                O90.m5968f(str, "p0");
                return C10196lu1.m22594j(str, (C10196lu1) this.receiver);
            case 4:
                String str2 = (String) obj;
                O90.m5968f(str2, "p0");
                return C10196lu1.m22594j(str2, (C10196lu1) this.receiver);
            default:
                String str3 = (String) obj;
                O90.m5968f(str3, "p0");
                return C10196lu1.m22594j(str3, (C10196lu1) this.receiver);
        }
    }
}
