package defpackage;

import java.io.IOException;

/* renamed from: lK */
/* loaded from: classes2.dex */
public final class C5672lK extends FX {
    public boolean b;
    public final /* synthetic */ C6627qK c;
    public final /* synthetic */ C5863mK d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5672lK(C7357u9 c7357u9, C6627qK c6627qK, C5863mK c5863mK) {
        super(c7357u9);
        this.c = c6627qK;
        this.d = c5863mK;
    }

    @Override // defpackage.FX, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.b) {
            return;
        }
        this.b = true;
        C6627qK c6627qK = this.c;
        C5863mK c5863mK = this.d;
        synchronized (c6627qK) {
            int i = c5863mK.h - 1;
            c5863mK.h = i;
            if (i == 0 && c5863mK.f) {
                c6627qK.W(c5863mK);
            }
        }
    }
}
