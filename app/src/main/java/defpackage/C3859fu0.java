package defpackage;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: fu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3859fu0 implements InterfaceC1905Ye1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NativeAnimatedModule c;

    public /* synthetic */ C3859fu0(NativeAnimatedModule nativeAnimatedModule, long j, int i) {
        this.a = i;
        this.c = nativeAnimatedModule;
        this.b = j;
    }

    @Override // defpackage.InterfaceC1905Ye1
    public final void i(C8260yu0 c8260yu0) {
        switch (this.a) {
            case 0:
                NativeAnimatedModule nativeAnimatedModule = this.c;
                nativeAnimatedModule.mPreOperations.a(this.b, nativeAnimatedModule.getNodesManager());
                break;
            default:
                NativeAnimatedModule nativeAnimatedModule2 = this.c;
                nativeAnimatedModule2.mOperations.a(this.b, nativeAnimatedModule2.getNodesManager());
                break;
        }
    }
}
