package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* renamed from: io.appmetrica.analytics.impl.uc */
/* loaded from: classes2.dex */
public abstract class AbstractC5496uc {
    /* renamed from: a */
    public abstract void mo20602a(int i);

    /* renamed from: a */
    public final synchronized void m21129a(Context context) {
        try {
            int iMo20603b = mo20603b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (iMo20603b != libraryApiLevel) {
                if (iMo20603b < libraryApiLevel) {
                    SparseArray sparseArrayMo20604c = mo20604c();
                    while (true) {
                        iMo20603b++;
                        if (iMo20603b > libraryApiLevel) {
                            break;
                        }
                        InterfaceC5471tc interfaceC5471tc = (InterfaceC5471tc) sparseArrayMo20604c.get(iMo20603b);
                        if (interfaceC5471tc != null) {
                            interfaceC5471tc.mo21078a(context);
                        }
                    }
                }
                mo20602a(libraryApiLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public abstract int mo20603b();

    /* renamed from: c */
    public abstract SparseArray mo20604c();

    /* renamed from: a */
    public final int m21128a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
