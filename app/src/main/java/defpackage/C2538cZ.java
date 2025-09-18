package defpackage;

import android.database.sqlite.SQLiteProgram;

/* renamed from: cZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2538cZ implements E61 {
    public final SQLiteProgram a;

    public C2538cZ(SQLiteProgram sQLiteProgram) {
        O90.f(sQLiteProgram, "delegate");
        this.a = sQLiteProgram;
    }

    @Override // defpackage.E61
    public final void E(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.E61
    public final void I(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.E61
    public final void V(int i) {
        this.a.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.E61
    public final void d(int i, String str) {
        O90.f(str, "value");
        this.a.bindString(i, str);
    }

    @Override // defpackage.E61
    public final void h(int i, double d) {
        this.a.bindDouble(i, d);
    }
}
