package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3006Vf;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.bf */
/* loaded from: classes2.dex */
public class C3157bf implements InterfaceC3261ff {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3261ff
    /* renamed from: a */
    public C3006Vf.d.a.b mo15119a(Integer num, String str, String str2, String str3) {
        C2956Tf[] c2956TfArr;
        C3006Vf.d.a.b bVar = new C3006Vf.d.a.b();
        if (num != null) {
            bVar.f22603d = num.intValue();
        }
        if (str != null) {
            bVar.f22604e = str;
        }
        try {
            try {
            } catch (Throwable unused) {
                c2956TfArr = new C2956Tf[]{C3196d2.m15731b(new JSONObject(str3))};
            }
        } catch (Throwable unused2) {
        }
        C2956Tf[] c2956TfArrM15733b = !TextUtils.isEmpty(str3) ? C3196d2.m15733b(new JSONArray(str3)) : null;
        c2956TfArr = c2956TfArrM15733b;
        if (c2956TfArr != null) {
            bVar.f22601b = c2956TfArr;
        }
        if (!TextUtils.isEmpty(str2)) {
            C3031Wf[] c3031WfArrM15730a = new C3031Wf[0];
            try {
                c3031WfArrM15730a = C3196d2.m15730a(new JSONArray(str2));
            } catch (Throwable unused3) {
            }
            bVar.f22602c = c3031WfArrM15730a;
        }
        return bVar;
    }
}
