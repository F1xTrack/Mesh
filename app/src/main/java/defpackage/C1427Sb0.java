package defpackage;

import expo.modules.kotlin.jni.JavaCallback;

/* renamed from: Sb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1427Sb0 extends FZ implements InterfaceC6099nZ {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1427Sb0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AbstractC1583Ub0) this.receiver).k((Throwable) obj);
                return C1518Tf1.a;
            case 1:
                ((JavaCallback) this.receiver).e(obj);
                return C1518Tf1.a;
            case 2:
                ((InterfaceC7754wE0) this.receiver).resolve(obj);
                return C1518Tf1.a;
            case 3:
                String str = (String) obj;
                O90.f(str, "p0");
                return C5782lu1.j(str, (C5782lu1) this.receiver);
            case 4:
                String str2 = (String) obj;
                O90.f(str2, "p0");
                return C5782lu1.j(str2, (C5782lu1) this.receiver);
            default:
                String str3 = (String) obj;
                O90.f(str3, "p0");
                return C5782lu1.j(str3, (C5782lu1) this.receiver);
        }
    }
}
