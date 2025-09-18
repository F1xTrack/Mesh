package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class G5 extends AbstractC3068s5 {
    public G5(C2744f4 c2744f4) {
        super(c2744f4);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        String strO = c2864k0.o();
        com.yandex.metrica.w wVarA = C2814i.a(strO);
        String strH = a().h();
        com.yandex.metrica.w wVarA2 = C2814i.a(strH);
        if (wVarA.equals(wVarA2)) {
            return true;
        }
        if (TextUtils.isEmpty(wVarA.a) && !TextUtils.isEmpty(wVarA2.a)) {
            c2864k0.e(strH);
            a(c2864k0, Qm.LOGOUT);
        } else if (!TextUtils.isEmpty(wVarA.a) && TextUtils.isEmpty(wVarA2.a)) {
            a(c2864k0, Qm.LOGIN);
        } else if (TextUtils.isEmpty(wVarA.a) || wVarA.a.equals(wVarA2.a)) {
            a(c2864k0, Qm.UPDATE);
        } else {
            a(c2864k0, Qm.SWITCH);
        }
        a().a(strO);
        return true;
    }

    private void a(C2864k0 c2864k0, Qm qm) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(NotificationConstants.ACTION, qm.toString());
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        c2864k0.f(string);
        a().r().b(c2864k0);
    }
}
