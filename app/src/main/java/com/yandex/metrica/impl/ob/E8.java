package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

/* loaded from: classes2.dex */
public class E8 {
    private final P8 a;
    private final P8 b;
    private final SparseArray<P8> c;
    private final F8 d;

    public static class b {
        public E8 a(String str, P8 p8, P8 p82, SparseArray<P8> sparseArray, F8 f8) {
            return new E8(str, p8, p82, sparseArray, f8);
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.a.a(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    public void b(SQLiteDatabase sQLiteDatabase) {
        try {
            F8 f8 = this.d;
            if (f8 == null || ((G8) f8).a(sQLiteDatabase)) {
                return;
            }
            try {
                this.b.a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            this.a.a(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    private E8(String str, P8 p8, P8 p82, SparseArray<P8> sparseArray, F8 f8) {
        this.a = p8;
        this.b = p82;
        this.c = sparseArray;
        this.d = f8;
    }

    public void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            try {
                this.b.a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            try {
                this.a.a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
        }
    }

    public void b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        if (i2 > i) {
            for (int i3 = i + 1; i3 <= i2; i3++) {
                try {
                    P8 p8 = this.c.get(i3);
                    if (p8 != null) {
                        p8.a(sQLiteDatabase);
                    }
                } catch (Throwable unused) {
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (z || (!((G8) this.d).a(sQLiteDatabase))) {
            try {
                this.b.a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                this.a.a(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
