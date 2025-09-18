package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.util.SparseArray;
import com.yandex.metrica.YandexMetrica;

/* loaded from: classes2.dex */
public abstract class Q1 {

    public interface a {
        void a(Context context);
    }

    public abstract int a(C3127ue c3127ue);

    public abstract SparseArray<a> a();

    public synchronized void a(Context context) {
        try {
            C3127ue c3127ue = new C3127ue(context);
            int iA = a(c3127ue);
            int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
            if (iA != libraryApiLevel) {
                if (iA > 0 && iA < libraryApiLevel) {
                    SparseArray<a> sparseArrayA = a();
                    while (true) {
                        iA++;
                        if (iA > libraryApiLevel) {
                            break;
                        }
                        a aVar = sparseArrayA.get(iA);
                        if (aVar != null) {
                            aVar.a(context);
                        }
                    }
                }
                a(c3127ue, libraryApiLevel);
                c3127ue.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void a(C3127ue c3127ue, int i);
}
