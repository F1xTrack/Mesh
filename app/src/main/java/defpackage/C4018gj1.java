package defpackage;

import com.facebook.react.bridge.WritableMap;

/* renamed from: gj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4018gj1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4018gj1(boolean z, int i) {
        super(1);
        this.e = i;
        this.f = z;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                WritableMap writableMap = (WritableMap) obj;
                O90.f(writableMap, "$this$dispatch");
                writableMap.putBoolean("isBuffering", this.f);
                break;
            case 1:
                WritableMap writableMap2 = (WritableMap) obj;
                O90.f(writableMap2, "$this$dispatch");
                writableMap2.putBoolean("isVisible", this.f);
                break;
            case 2:
                WritableMap writableMap3 = (WritableMap) obj;
                O90.f(writableMap3, "$this$dispatch");
                writableMap3.putBoolean("hasAudioFocus", this.f);
                break;
            case 3:
                WritableMap writableMap4 = (WritableMap) obj;
                O90.f(writableMap4, "$this$dispatch");
                writableMap4.putBoolean("isActive", this.f);
                break;
            default:
                C6818rK0 c6818rK0 = (C6818rK0) obj;
                if (c6818rK0 != null) {
                    c6818rK0.setFullscreen(this.f);
                }
                break;
        }
        return C1518Tf1.a;
    }
}
