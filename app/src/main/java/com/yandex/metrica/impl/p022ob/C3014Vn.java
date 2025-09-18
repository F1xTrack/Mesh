package com.yandex.metrica.impl.p022ob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Vn */
/* loaded from: classes2.dex */
public class C3014Vn extends AbstractC2914Rn {

    /* renamed from: b */
    private final C2989Un f22664b;

    /* renamed from: c */
    private final C2989Un f22665c;

    /* renamed from: d */
    private Comparator<Map.Entry<String, String>> f22666d;

    /* renamed from: com.yandex.metrica.impl.ob.Vn$a */
    public class a implements Comparator<Map.Entry<String, String>> {
        public a(C3014Vn c3014Vn) {
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            String value = entry.getValue();
            String value2 = entry2.getValue();
            int length = C2819O2.m14689c(value).length;
            int length2 = C2819O2.m14689c(value2).length;
            if (length < length2) {
                return -1;
            }
            return length == length2 ? 0 : 1;
        }
    }

    public C3014Vn(int i, int i2, int i3) {
        this(i, new C2989Un(i2), new C2989Un(i3));
    }

    public C3014Vn(int i, C2989Un c2989Un, C2989Un c2989Un2) {
        super(i);
        this.f22666d = new a(this);
        this.f22664b = c2989Un;
        this.f22665c = c2989Un2;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2914Rn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2890Qn<Map<String, String>, C2665Hn> mo15090a(Map<String, String> map) {
        HashMap map2;
        int iMo14051a;
        int i = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.f22666d);
            int length = entryArr.length;
            iMo14051a = 0;
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            while (i < length) {
                Map.Entry entry = entryArr[i];
                C2890Qn<String, InterfaceC2615Fn> c2890QnMo15090a = this.f22664b.mo15090a((String) entry.getKey());
                C2890Qn<String, InterfaceC2615Fn> c2890QnMo15090a2 = this.f22665c.mo15090a((String) entry.getValue());
                int length2 = C2819O2.m14689c((String) entry.getKey()).length + C2819O2.m14689c((String) entry.getValue()).length;
                int length3 = C2819O2.m14689c(c2890QnMo15090a.f22084a).length + C2819O2.m14689c(c2890QnMo15090a2.f22084a).length;
                if (z || length3 + i3 > m15089a()) {
                    i2++;
                    iMo14051a += length2;
                    z = true;
                } else {
                    iMo14051a = c2890QnMo15090a2.f22085b.mo14051a() + c2890QnMo15090a.f22085b.mo14051a() + iMo14051a;
                    int length4 = C2819O2.m14689c(c2890QnMo15090a.f22084a).length + C2819O2.m14689c(c2890QnMo15090a2.f22084a).length + i3;
                    map2.put(c2890QnMo15090a.f22084a, c2890QnMo15090a2.f22084a);
                    i3 = length4;
                }
                i++;
            }
            i = i2;
        } else {
            map2 = null;
            iMo14051a = 0;
        }
        return new C2890Qn<>(map2, new C2665Hn(i, iMo14051a));
    }
}
