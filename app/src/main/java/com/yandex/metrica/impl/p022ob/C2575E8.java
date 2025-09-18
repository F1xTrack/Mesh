package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.E8 */
/* loaded from: classes2.dex */
public class C2575E8 {

    /* renamed from: a */
    private final AbstractC2850P8 f21077a;

    /* renamed from: b */
    private final AbstractC2850P8 f21078b;

    /* renamed from: c */
    private final SparseArray<AbstractC2850P8> f21079c;

    /* renamed from: d */
    private final InterfaceC2600F8 f21080d;

    /* renamed from: com.yandex.metrica.impl.ob.E8$b */
    public static class b {
        /* renamed from: a */
        public C2575E8 m14036a(String str, AbstractC2850P8 abstractC2850P8, AbstractC2850P8 abstractC2850P82, SparseArray<AbstractC2850P8> sparseArray, InterfaceC2600F8 interfaceC2600F8) {
            return new C2575E8(str, abstractC2850P8, abstractC2850P82, sparseArray, interfaceC2600F8);
        }
    }

    /* renamed from: a */
    public void m14032a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f21077a.mo13851a(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void m14034b(SQLiteDatabase sQLiteDatabase) {
        try {
            InterfaceC2600F8 interfaceC2600F8 = this.f21080d;
            if (interfaceC2600F8 == null || ((C2625G8) interfaceC2600F8).m14162a(sQLiteDatabase)) {
                return;
            }
            try {
                this.f21078b.mo13851a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            this.f21077a.mo13851a(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    private C2575E8(String str, AbstractC2850P8 abstractC2850P8, AbstractC2850P8 abstractC2850P82, SparseArray<AbstractC2850P8> sparseArray, InterfaceC2600F8 interfaceC2600F8) {
        this.f21077a = abstractC2850P8;
        this.f21078b = abstractC2850P82;
        this.f21079c = sparseArray;
        this.f21080d = interfaceC2600F8;
    }

    /* renamed from: a */
    public void m14033a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            try {
                this.f21078b.mo13851a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            try {
                this.f21077a.mo13851a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: b */
    public void m14035b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        if (i2 > i) {
            for (int i3 = i + 1; i3 <= i2; i3++) {
                try {
                    AbstractC2850P8 abstractC2850P8 = this.f21079c.get(i3);
                    if (abstractC2850P8 != null) {
                        abstractC2850P8.mo13851a(sQLiteDatabase);
                    }
                } catch (Throwable unused) {
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (z || (!((C2625G8) this.f21080d).m14162a(sQLiteDatabase))) {
            try {
                this.f21078b.mo13851a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                this.f21077a.mo13851a(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
