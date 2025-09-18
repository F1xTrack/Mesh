package com.yandex.metrica.impl.p022ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.p022ob.C3132ag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.Gf */
/* loaded from: classes2.dex */
public class C2632Gf {

    /* renamed from: c */
    private static final int[] f21312c = {0, 1, 2, 3};

    /* renamed from: a */
    private final SparseArray<HashMap<String, C3132ag.a>> f21313a;

    /* renamed from: b */
    private int f21314b;

    public C2632Gf() {
        this(f21312c);
    }

    /* renamed from: a */
    public C3132ag.a m14198a(int i, String str) {
        return this.f21313a.get(i).get(str);
    }

    /* renamed from: b */
    public void m14200b() {
        this.f21314b++;
    }

    /* renamed from: c */
    public C3132ag m14201c() {
        C3132ag c3132ag = new C3132ag();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f21313a.size(); i++) {
            SparseArray<HashMap<String, C3132ag.a>> sparseArray = this.f21313a;
            Iterator<C3132ag.a> it = sparseArray.get(sparseArray.keyAt(i)).values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        c3132ag.f23051b = (C3132ag.a[]) arrayList.toArray(new C3132ag.a[arrayList.size()]);
        return c3132ag;
    }

    public C2632Gf(int[] iArr) {
        this.f21313a = new SparseArray<>();
        this.f21314b = 0;
        for (int i : iArr) {
            this.f21313a.put(i, new HashMap<>());
        }
    }

    /* renamed from: a */
    public void m14199a(C3132ag.a aVar) {
        this.f21313a.get(aVar.f23054c).put(new String(aVar.f23053b), aVar);
    }

    /* renamed from: a */
    public int m14197a() {
        return this.f21314b;
    }
}
