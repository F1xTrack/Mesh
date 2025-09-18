package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class G01 {

    /* renamed from: a */
    public final String f3524a;

    /* renamed from: b */
    public final ArrayList f3525b = new ArrayList();

    /* renamed from: c */
    public Pair f3526c = new Pair("V", null);

    public G01(String str, C9108dO1 c9108dO1) {
        this.f3524a = str;
    }

    /* renamed from: a */
    public final void m2876a(String str, C7472Db0... c7472Db0Arr) {
        C8751ae1 c8751ae1;
        O90.m5968f(str, "type");
        ArrayList arrayList = this.f3525b;
        if (c7472Db0Arr.length == 0) {
            c8751ae1 = null;
        } else {
            C0702L8 c0702l8 = new C0702L8(new C4090g1(5, c7472Db0Arr));
            int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(c0702l8));
            if (iM24983b < 16) {
                iM24983b = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
            Iterator it = c0702l8.iterator();
            while (true) {
                C1780bM c1780bM = (C1780bM) it;
                if (!c1780bM.f16986b.hasNext()) {
                    break;
                }
                C9843j80 c9843j80 = (C9843j80) c1780bM.next();
                linkedHashMap.put(Integer.valueOf(c9843j80.f34932a), (C7472Db0) c9843j80.f34933b);
            }
            c8751ae1 = new C8751ae1(linkedHashMap);
        }
        arrayList.add(new Pair(str, c8751ae1));
    }

    /* renamed from: b */
    public final void m2877b(EnumC11057sd0 enumC11057sd0) {
        O90.m5968f(enumC11057sd0, "type");
        String strM24758c = enumC11057sd0.m24758c();
        O90.m5967e(strM24758c, "getDesc(...)");
        this.f3526c = new Pair(strM24758c, null);
    }

    /* renamed from: c */
    public final void m2878c(String str, C7472Db0... c7472Db0Arr) {
        O90.m5968f(str, "type");
        C0702L8 c0702l8 = new C0702L8(new C4090g1(5, c7472Db0Arr));
        int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(c0702l8));
        if (iM24983b < 16) {
            iM24983b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
        Iterator it = c0702l8.iterator();
        while (true) {
            C1780bM c1780bM = (C1780bM) it;
            if (!c1780bM.f16986b.hasNext()) {
                this.f3526c = new Pair(str, new C8751ae1(linkedHashMap));
                return;
            } else {
                C9843j80 c9843j80 = (C9843j80) c1780bM.next();
                linkedHashMap.put(Integer.valueOf(c9843j80.f34932a), (C7472Db0) c9843j80.f34933b);
            }
        }
    }
}
