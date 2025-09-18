package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.ob.C2631ag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class Gf {
    private static final int[] c = {0, 1, 2, 3};
    private final SparseArray<HashMap<String, C2631ag.a>> a;
    private int b;

    public Gf() {
        this(c);
    }

    public C2631ag.a a(int i, String str) {
        return this.a.get(i).get(str);
    }

    public void b() {
        this.b++;
    }

    public C2631ag c() {
        C2631ag c2631ag = new C2631ag();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            SparseArray<HashMap<String, C2631ag.a>> sparseArray = this.a;
            Iterator<C2631ag.a> it = sparseArray.get(sparseArray.keyAt(i)).values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        c2631ag.b = (C2631ag.a[]) arrayList.toArray(new C2631ag.a[arrayList.size()]);
        return c2631ag;
    }

    public Gf(int[] iArr) {
        this.a = new SparseArray<>();
        this.b = 0;
        for (int i : iArr) {
            this.a.put(i, new HashMap<>());
        }
    }

    public void a(C2631ag.a aVar) {
        this.a.get(aVar.c).put(new String(aVar.b), aVar);
    }

    public int a() {
        return this.b;
    }
}
