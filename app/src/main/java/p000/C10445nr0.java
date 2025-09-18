package p000;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* renamed from: nr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10445nr0 implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ int f38558a;

    /* renamed from: b */
    public final boolean f38559b;

    /* renamed from: c */
    public final C6507nj f38560c;

    /* renamed from: d */
    public final Object f38561d;

    /* renamed from: e */
    public final Closeable f38562e;

    public C10445nr0(boolean z, int i) {
        this.f38558a = i;
        switch (i) {
            case 1:
                this.f38559b = z;
                C6507nj c6507nj = new C6507nj();
                this.f38560c = c6507nj;
                Inflater inflater = new Inflater(true);
                this.f38561d = inflater;
                this.f38562e = new C10355n80(JI1.m4274b(c6507nj), inflater);
                break;
            default:
                this.f38559b = z;
                C6507nj c6507nj2 = new C6507nj();
                this.f38560c = c6507nj2;
                Deflater deflater = new Deflater(-1, true);
                this.f38561d = deflater;
                this.f38562e = new C6813sH(c6507nj2, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f38558a) {
            case 0:
                ((C6813sH) this.f38562e).close();
                break;
            default:
                ((C10355n80) this.f38562e).close();
                break;
        }
    }
}
