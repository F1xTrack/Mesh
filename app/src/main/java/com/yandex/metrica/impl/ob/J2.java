package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C3162vj;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class J2 implements S1<C3162vj> {
    private final C3132uj a;
    private final C2650ba b;

    public J2() {
        this(new C3132uj(), new C2650ba());
    }

    @Override // com.yandex.metrica.impl.ob.S1
    public C3162vj a(int i, byte[] bArr, Map map) {
        if (200 == i) {
            List list = (List) map.get("Content-Encoding");
            if (!U2.b(list) && "encrypted".equals(list.get(0))) {
                bArr = this.b.a(bArr, "hBnBQbZrmjPXEWVJ");
            }
            if (bArr != null) {
                C3162vj c3162vjA = this.a.a(bArr);
                if (C3162vj.a.OK == c3162vjA.z()) {
                    return c3162vjA;
                }
            }
        }
        return null;
    }

    public J2(C3132uj c3132uj, C2650ba c2650ba) {
        this.a = c3132uj;
        this.b = c2650ba;
    }
}
