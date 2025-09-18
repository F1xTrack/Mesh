package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4739na extends J2 {
    public final InterfaceC4811qa b;

    public C4739na(int i) {
        this(i, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public C4739na(int i, InterfaceC4811qa interfaceC4811qa) {
        super(i);
        this.b = interfaceC4811qa;
    }

    @Override // io.appmetrica.analytics.impl.J2, io.appmetrica.analytics.impl.InterfaceC4811qa
    public final Im a(List<Object> list) {
        int iB;
        int i = 0;
        if (list == null || (list.size() <= this.a && this.b == null)) {
            iB = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iB = 0;
            int i2 = 0;
            for (Object obj : list) {
                if (i2 < this.a) {
                    InterfaceC4811qa interfaceC4811qa = this.b;
                    if (interfaceC4811qa != null) {
                        Im imA = interfaceC4811qa.a(obj);
                        Object obj2 = imA.a;
                        iB += imA.b.getBytesTruncated();
                        hn.a(obj, imA.a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i++;
                    iB += b(obj);
                }
                i2++;
            }
            list = arrayList;
        }
        return new Im(list, new B4(i, iB));
    }

    public final InterfaceC4811qa b() {
        return this.b;
    }
}
