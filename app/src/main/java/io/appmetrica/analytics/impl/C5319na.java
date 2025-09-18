package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.na */
/* loaded from: classes2.dex */
public class C5319na extends AbstractC4579J2 {

    /* renamed from: b */
    public final InterfaceC5394qa f32268b;

    public C5319na(int i) {
        this(i, null);
    }

    /* renamed from: b */
    public int mo19686b(Object obj) {
        return 0;
    }

    public C5319na(int i, InterfaceC5394qa interfaceC5394qa) {
        super(i);
        this.f32268b = interfaceC5394qa;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4579J2, io.appmetrica.analytics.impl.InterfaceC5394qa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4575Im mo19520a(List<Object> list) {
        int iMo19686b;
        int i = 0;
        if (list == null || (list.size() <= this.f30329a && this.f32268b == null)) {
            iMo19686b = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iMo19686b = 0;
            int i2 = 0;
            for (Object obj : list) {
                if (i2 < this.f30329a) {
                    InterfaceC5394qa interfaceC5394qa = this.f32268b;
                    if (interfaceC5394qa != null) {
                        C4575Im c4575ImMo19520a = interfaceC5394qa.mo19520a(obj);
                        Object obj2 = c4575ImMo19520a.f30323a;
                        iMo19686b += c4575ImMo19520a.f30324b.getBytesTruncated();
                        AbstractC5182hn.m20512a(obj, c4575ImMo19520a.f30323a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i++;
                    iMo19686b += mo19686b(obj);
                }
                i2++;
            }
            list = arrayList;
        }
        return new C4575Im(list, new C4386B4(i, iMo19686b));
    }

    /* renamed from: b */
    public final InterfaceC5394qa m20817b() {
        return this.f32268b;
    }
}
