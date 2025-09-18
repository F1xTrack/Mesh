package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: F3 */
/* loaded from: classes.dex */
public final class HandlerC0319F3 extends Handler {

    /* renamed from: a */
    public final /* synthetic */ int f3038a;

    /* renamed from: b */
    public Object f3039b;

    public /* synthetic */ HandlerC0319F3() {
        this.f3038a = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:331:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:391:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r13) throws android.media.MediaCodec.CryptoException {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.HandlerC0319F3.handleMessage(android.os.Message):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0319F3(Object obj, Looper looper, int i) {
        super(looper);
        this.f3038a = i;
        this.f3039b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0319F3(InterfaceC0125Bz interfaceC0125Bz) {
        super(Looper.getMainLooper());
        this.f3038a = 5;
        this.f3039b = interfaceC0125Bz;
    }
}
