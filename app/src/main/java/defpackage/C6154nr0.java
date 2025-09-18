package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* renamed from: nr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6154nr0 implements Closeable {
    public final /* synthetic */ int a;
    public final boolean b;
    public final C6129nj c;
    public final Object d;
    public final Closeable e;

    public C6154nr0(boolean z, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = z;
                C6129nj c6129nj = new C6129nj();
                this.c = c6129nj;
                Inflater inflater = new Inflater(true);
                this.d = inflater;
                this.e = new C6019n80(JI1.b(c6129nj), inflater);
                break;
            default:
                this.b = z;
                C6129nj c6129nj2 = new C6129nj();
                this.c = c6129nj2;
                Deflater deflater = new Deflater(-1, true);
                this.d = deflater;
                this.e = new C6999sH(c6129nj2, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.a) {
            case 0:
                ((C6999sH) this.e).close();
                break;
            default:
                ((C6019n80) this.e).close();
                break;
        }
    }
}
