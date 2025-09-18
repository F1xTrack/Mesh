package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* renamed from: io.appmetrica.analytics.impl.uc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4908uc {
    public abstract void a(int i);

    public final synchronized void a(Context context) {
        try {
            int iB = b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (iB != libraryApiLevel) {
                if (iB < libraryApiLevel) {
                    SparseArray sparseArrayC = c();
                    while (true) {
                        iB++;
                        if (iB > libraryApiLevel) {
                            break;
                        }
                        InterfaceC4884tc interfaceC4884tc = (InterfaceC4884tc) sparseArrayC.get(iB);
                        if (interfaceC4884tc != null) {
                            interfaceC4884tc.a(context);
                        }
                    }
                }
                a(libraryApiLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract int b();

    public abstract SparseArray c();

    public final int a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
