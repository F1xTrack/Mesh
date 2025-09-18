package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class G01 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public Pair c = new Pair("V", null);

    public G01(String str, C3383dO1 c3383dO1) {
        this.a = str;
    }

    public final void a(String str, C0258Db0... c0258Db0Arr) {
        C2174ae1 c2174ae1;
        O90.f(str, "type");
        ArrayList arrayList = this.b;
        if (c0258Db0Arr.length == 0) {
            c2174ae1 = null;
        } else {
            L8 l8 = new L8(new C3881g1(5, c0258Db0Arr));
            int iB = AbstractC7287tn0.b(AbstractC8449zu.k(l8));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            Iterator it = l8.iterator();
            while (true) {
                C2309bM c2309bM = (C2309bM) it;
                if (!c2309bM.b.hasNext()) {
                    break;
                }
                C5255j80 c5255j80 = (C5255j80) c2309bM.next();
                linkedHashMap.put(Integer.valueOf(c5255j80.a), (C0258Db0) c5255j80.b);
            }
            c2174ae1 = new C2174ae1(linkedHashMap);
        }
        arrayList.add(new Pair(str, c2174ae1));
    }

    public final void b(EnumC7066sd0 enumC7066sd0) {
        O90.f(enumC7066sd0, "type");
        String strC = enumC7066sd0.c();
        O90.e(strC, "getDesc(...)");
        this.c = new Pair(strC, null);
    }

    public final void c(String str, C0258Db0... c0258Db0Arr) {
        O90.f(str, "type");
        L8 l8 = new L8(new C3881g1(5, c0258Db0Arr));
        int iB = AbstractC7287tn0.b(AbstractC8449zu.k(l8));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it = l8.iterator();
        while (true) {
            C2309bM c2309bM = (C2309bM) it;
            if (!c2309bM.b.hasNext()) {
                this.c = new Pair(str, new C2174ae1(linkedHashMap));
                return;
            } else {
                C5255j80 c5255j80 = (C5255j80) c2309bM.next();
                linkedHashMap.put(Integer.valueOf(c5255j80.a), (C0258Db0) c5255j80.b);
            }
        }
    }
}
