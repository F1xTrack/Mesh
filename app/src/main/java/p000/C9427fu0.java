package p000;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: fu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9427fu0 implements InterfaceC8571Ye1 {

    /* renamed from: a */
    public final /* synthetic */ int f27448a;

    /* renamed from: b */
    public final /* synthetic */ long f27449b;

    /* renamed from: c */
    public final /* synthetic */ NativeAnimatedModule f27450c;

    public /* synthetic */ C9427fu0(NativeAnimatedModule nativeAnimatedModule, long j, int i) {
        this.f27448a = i;
        this.f27450c = nativeAnimatedModule;
        this.f27449b = j;
    }

    @Override // p000.InterfaceC8571Ye1
    /* renamed from: i */
    public final void mo502i(C11856yu0 c11856yu0) {
        switch (this.f27448a) {
            case 0:
                NativeAnimatedModule nativeAnimatedModule = this.f27450c;
                nativeAnimatedModule.mPreOperations.m18885a(this.f27449b, nativeAnimatedModule.getNodesManager());
                break;
            default:
                NativeAnimatedModule nativeAnimatedModule2 = this.f27450c;
                nativeAnimatedModule2.mOperations.m18885a(this.f27449b, nativeAnimatedModule2.getNodesManager());
                break;
        }
    }
}
