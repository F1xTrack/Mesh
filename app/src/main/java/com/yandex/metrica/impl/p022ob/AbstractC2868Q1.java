package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.util.SparseArray;
import com.yandex.metrica.YandexMetrica;

/* renamed from: com.yandex.metrica.impl.ob.Q1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2868Q1 {

    /* renamed from: com.yandex.metrica.impl.ob.Q1$a */
    public interface a {
        /* renamed from: a */
        void mo14155a(Context context);
    }

    /* renamed from: a */
    public abstract int mo14152a(C3650ue c3650ue);

    /* renamed from: a */
    public abstract SparseArray<a> mo14153a();

    /* renamed from: a */
    public synchronized void m14807a(Context context) {
        try {
            C3650ue c3650ue = new C3650ue(context);
            int iMo14152a = mo14152a(c3650ue);
            int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
            if (iMo14152a != libraryApiLevel) {
                if (iMo14152a > 0 && iMo14152a < libraryApiLevel) {
                    SparseArray<a> sparseArrayMo14153a = mo14153a();
                    while (true) {
                        iMo14152a++;
                        if (iMo14152a > libraryApiLevel) {
                            break;
                        }
                        a aVar = sparseArrayMo14153a.get(iMo14152a);
                        if (aVar != null) {
                            aVar.mo14155a(context);
                        }
                    }
                }
                mo14154a(c3650ue, libraryApiLevel);
                c3650ue.m16690b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public abstract void mo14154a(C3650ue c3650ue, int i);
}
