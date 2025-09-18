package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.V1 */
/* loaded from: classes2.dex */
public final class C4865V1 implements ProtobufConverter {

    /* renamed from: a */
    public final C4409C2 f30839a;

    public C4865V1() {
        this(new C4409C2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4937Y1 fromModel(C4841U1 c4841u1) {
        C4937Y1 c4937y1 = new C4937Y1();
        c4937y1.f31085a = new C4913X1[c4841u1.f30799a.size()];
        int i = 0;
        int i2 = 0;
        for (PermissionState permissionState : c4841u1.f30799a) {
            C4913X1[] c4913x1Arr = c4937y1.f31085a;
            C4913X1 c4913x1 = new C4913X1();
            c4913x1.f30999a = permissionState.name;
            c4913x1.f31000b = permissionState.granted;
            c4913x1Arr[i2] = c4913x1;
            i2++;
        }
        C4459E2 c4459e2 = c4841u1.f30800b;
        if (c4459e2 != null) {
            c4937y1.f31086b = this.f30839a.fromModel(c4459e2);
        }
        c4937y1.f31087c = new String[c4841u1.f30801c.size()];
        Iterator it = c4841u1.f30801c.iterator();
        while (it.hasNext()) {
            c4937y1.f31087c[i] = (String) it.next();
            i++;
        }
        return c4937y1;
    }

    public C4865V1(C4409C2 c4409c2) {
        this.f30839a = c4409c2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4841U1 toModel(C4937Y1 c4937y1) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            C4913X1[] c4913x1Arr = c4937y1.f31085a;
            if (i2 >= c4913x1Arr.length) {
                break;
            }
            C4913X1 c4913x1 = c4913x1Arr[i2];
            arrayList.add(new PermissionState(c4913x1.f30999a, c4913x1.f31000b));
            i2++;
        }
        C4889W1 c4889w1 = c4937y1.f31086b;
        C4459E2 model = c4889w1 != null ? this.f30839a.toModel(c4889w1) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c4937y1.f31087c;
            if (i < strArr.length) {
                arrayList2.add(strArr[i]);
                i++;
            } else {
                return new C4841U1(arrayList, model, arrayList2);
            }
        }
    }
}
