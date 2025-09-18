package p000;

import android.database.sqlite.SQLiteProgram;

/* renamed from: cZ */
/* loaded from: classes.dex */
public class C1855cZ implements E61 {

    /* renamed from: a */
    public final SQLiteProgram f17602a;

    public C1855cZ(SQLiteProgram sQLiteProgram) {
        O90.m5968f(sQLiteProgram, "delegate");
        this.f17602a = sQLiteProgram;
    }

    @Override // p000.E61
    /* renamed from: E */
    public final void mo2030E(int i, long j) {
        this.f17602a.bindLong(i, j);
    }

    @Override // p000.E61
    /* renamed from: I */
    public final void mo2031I(int i, byte[] bArr) {
        this.f17602a.bindBlob(i, bArr);
    }

    @Override // p000.E61
    /* renamed from: V */
    public final void mo2032V(int i) {
        this.f17602a.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17602a.close();
    }

    @Override // p000.E61
    /* renamed from: d */
    public final void mo2033d(int i, String str) {
        O90.m5968f(str, "value");
        this.f17602a.bindString(i, str);
    }

    @Override // p000.E61
    /* renamed from: h */
    public final void mo2034h(int i, double d) {
        this.f17602a.bindDouble(i, d);
    }
}
