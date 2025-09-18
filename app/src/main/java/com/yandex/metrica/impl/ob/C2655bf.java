package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Vf;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.bf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2655bf implements InterfaceC2755ff {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2755ff
    public Vf.d.a.b a(Integer num, String str, String str2, String str3) {
        Tf[] tfArr;
        Vf.d.a.b bVar = new Vf.d.a.b();
        if (num != null) {
            bVar.d = num.intValue();
        }
        if (str != null) {
            bVar.e = str;
        }
        try {
            try {
            } catch (Throwable unused) {
                tfArr = new Tf[]{C2692d2.b(new JSONObject(str3))};
            }
        } catch (Throwable unused2) {
        }
        Tf[] tfArrB = !TextUtils.isEmpty(str3) ? C2692d2.b(new JSONArray(str3)) : null;
        tfArr = tfArrB;
        if (tfArr != null) {
            bVar.b = tfArr;
        }
        if (!TextUtils.isEmpty(str2)) {
            Wf[] wfArrA = new Wf[0];
            try {
                wfArrA = C2692d2.a(new JSONArray(str2));
            } catch (Throwable unused3) {
            }
            bVar.c = wfArrA;
        }
        return bVar;
    }
}
