package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C2981Uf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Nd */
/* loaded from: classes2.dex */
public class C2805Nd {

    /* renamed from: a */
    private final C2500B8 f21774a;

    /* renamed from: b */
    private final C2475A8 f21775b;

    /* renamed from: c */
    private final C2730Kd f21776c;

    /* renamed from: d */
    private final C2680Id f21777d;

    public C2805Nd(Context context) {
        this(C2877Qa.m14815a(context).m14830f(), C2877Qa.m14815a(context).m14829e(), new C2529Cc(context), new C2705Jd(), new C2655Hd());
    }

    /* renamed from: a */
    public C2780Md m14644a(int i) {
        Map<Long, String> mapM16676a = this.f21774a.m16676a(i);
        Map<Long, String> mapM16676a2 = this.f21775b.m16676a(i);
        C2981Uf c2981Uf = new C2981Uf();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapM16676a;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C2981Uf.b bVarM14475a = this.f21776c.m14475a(((Long) entry.getKey()).longValue(), (String) entry.getValue());
            if (bVarM14475a != null) {
                arrayList.add(bVarM14475a);
            }
        }
        c2981Uf.f22456b = (C2981Uf.b[]) arrayList.toArray(new C2981Uf.b[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) mapM16676a2;
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C2981Uf.a aVarM14340a = this.f21777d.m14340a(((Long) entry2.getKey()).longValue(), (String) entry2.getValue());
            if (aVarM14340a != null) {
                arrayList2.add(aVarM14340a);
            }
        }
        c2981Uf.f22457c = (C2981Uf.a[]) arrayList2.toArray(new C2981Uf.a[arrayList2.size()]);
        return new C2780Md(mapM16676a.isEmpty() ? -1L : ((Long) Collections.max(linkedHashMap.keySet())).longValue(), mapM16676a2.isEmpty() ? -1L : ((Long) Collections.max(linkedHashMap2.keySet())).longValue(), c2981Uf);
    }

    public C2805Nd(C2500B8 c2500b8, C2475A8 c2475a8, C2529Cc c2529Cc, C2705Jd c2705Jd, C2655Hd c2655Hd) {
        this(c2500b8, c2475a8, new C2730Kd(c2529Cc, c2705Jd), new C2680Id(c2529Cc, c2655Hd));
    }

    public C2805Nd(C2500B8 c2500b8, C2475A8 c2475a8, C2730Kd c2730Kd, C2680Id c2680Id) {
        this.f21774a = c2500b8;
        this.f21775b = c2475a8;
        this.f21776c = c2730Kd;
        this.f21777d = c2680Id;
    }

    /* renamed from: a */
    public void m14645a(C2780Md c2780Md) {
        long j = c2780Md.f21733a;
        if (j >= 0) {
            this.f21774a.m16680c(j);
        }
        long j2 = c2780Md.f21734b;
        if (j2 >= 0) {
            this.f21775b.m16680c(j2);
        }
    }
}
