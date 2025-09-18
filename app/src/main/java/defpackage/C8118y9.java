package defpackage;

import android.os.HandlerThread;

/* renamed from: y9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8118y9 implements InterfaceC6587q61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ C8118y9(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.InterfaceC6587q61
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(WB.g(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(WB.g(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
