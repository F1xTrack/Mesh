package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.Uf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class Nd {
    private final B8 a;
    private final A8 b;
    private final Kd c;
    private final Id d;

    public Nd(Context context) {
        this(Qa.a(context).f(), Qa.a(context).e(), new Cc(context), new Jd(), new Hd());
    }

    public Md a(int i) {
        Map<Long, String> mapA = this.a.a(i);
        Map<Long, String> mapA2 = this.b.a(i);
        Uf uf = new Uf();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapA;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Uf.b bVarA = this.c.a(((Long) entry.getKey()).longValue(), (String) entry.getValue());
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        uf.b = (Uf.b[]) arrayList.toArray(new Uf.b[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) mapA2;
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Uf.a aVarA = this.d.a(((Long) entry2.getKey()).longValue(), (String) entry2.getValue());
            if (aVarA != null) {
                arrayList2.add(aVarA);
            }
        }
        uf.c = (Uf.a[]) arrayList2.toArray(new Uf.a[arrayList2.size()]);
        return new Md(mapA.isEmpty() ? -1L : ((Long) Collections.max(linkedHashMap.keySet())).longValue(), mapA2.isEmpty() ? -1L : ((Long) Collections.max(linkedHashMap2.keySet())).longValue(), uf);
    }

    public Nd(B8 b8, A8 a8, Cc cc, Jd jd, Hd hd) {
        this(b8, a8, new Kd(cc, jd), new Id(cc, hd));
    }

    public Nd(B8 b8, A8 a8, Kd kd, Id id) {
        this.a = b8;
        this.b = a8;
        this.c = kd;
        this.d = id;
    }

    public void a(Md md) {
        long j = md.a;
        if (j >= 0) {
            this.a.c(j);
        }
        long j2 = md.b;
        if (j2 >= 0) {
            this.b.c(j2);
        }
    }
}
