package p000;

import java.io.IOException;

/* renamed from: lK */
/* loaded from: classes2.dex */
public final class C6356lK extends AbstractC0349FX {

    /* renamed from: b */
    public boolean f37008b;

    /* renamed from: c */
    public final /* synthetic */ C6673qK f37009c;

    /* renamed from: d */
    public final /* synthetic */ C6419mK f37010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6356lK(C6931u9 c6931u9, C6673qK c6673qK, C6419mK c6419mK) {
        super(c6931u9);
        this.f37009c = c6673qK;
        this.f37010d = c6419mK;
    }

    @Override // p000.AbstractC0349FX, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f37008b) {
            return;
        }
        this.f37008b = true;
        C6673qK c6673qK = this.f37009c;
        C6419mK c6419mK = this.f37010d;
        synchronized (c6673qK) {
            int i = c6419mK.f37634h - 1;
            c6419mK.f37634h = i;
            if (i == 0 && c6419mK.f37632f) {
                c6673qK.m23971W(c6419mK);
            }
        }
    }
}
