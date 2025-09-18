package p000;

import com.facebook.react.bridge.WritableMap;

/* renamed from: gj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9534gj1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f27962e;

    /* renamed from: f */
    public final /* synthetic */ boolean f27963f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9534gj1(boolean z, int i) {
        super(1);
        this.f27962e = i;
        this.f27963f = z;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f27962e) {
            case 0:
                WritableMap writableMap = (WritableMap) obj;
                O90.m5968f(writableMap, "$this$dispatch");
                writableMap.putBoolean("isBuffering", this.f27963f);
                break;
            case 1:
                WritableMap writableMap2 = (WritableMap) obj;
                O90.m5968f(writableMap2, "$this$dispatch");
                writableMap2.putBoolean("isVisible", this.f27963f);
                break;
            case 2:
                WritableMap writableMap3 = (WritableMap) obj;
                O90.m5968f(writableMap3, "$this$dispatch");
                writableMap3.putBoolean("hasAudioFocus", this.f27963f);
                break;
            case 3:
                WritableMap writableMap4 = (WritableMap) obj;
                O90.m5968f(writableMap4, "$this$dispatch");
                writableMap4.putBoolean("isActive", this.f27963f);
                break;
            default:
                C10891rK0 c10891rK0 = (C10891rK0) obj;
                if (c10891rK0 != null) {
                    c10891rK0.setFullscreen(this.f27963f);
                }
                break;
        }
        return C8313Tf1.f11463a;
    }
}
