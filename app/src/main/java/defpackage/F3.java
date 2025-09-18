package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class F3 extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ F3() {
        this.a = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F3.handleMessage(android.os.Message):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F3(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F3(InterfaceC0173Bz interfaceC0173Bz) {
        super(Looper.getMainLooper());
        this.a = 5;
        this.b = interfaceC0173Bz;
    }
}
