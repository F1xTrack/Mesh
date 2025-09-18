package p000;

import android.os.HandlerThread;

/* renamed from: y9 */
/* loaded from: classes.dex */
public final /* synthetic */ class C7183y9 implements InterfaceC10736q61 {

    /* renamed from: a */
    public final /* synthetic */ int f46103a;

    /* renamed from: b */
    public final /* synthetic */ int f46104b;

    public /* synthetic */ C7183y9(int i, int i2) {
        this.f46103a = i2;
        this.f46104b = i;
    }

    @Override // p000.InterfaceC10736q61
    public final Object get() {
        switch (this.f46103a) {
            case 0:
                return new HandlerThread(C1396WB.m8705g(this.f46104b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C1396WB.m8705g(this.f46104b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
