package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.yandex.metrica.C3804w;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.G5 */
/* loaded from: classes2.dex */
public class C2622G5 extends AbstractC3589s5 {
    public C2622G5(C3250f4 c3250f4) {
        super(c3250f4);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3459n5
    /* renamed from: a */
    public boolean mo13844a(C3376k0 c3376k0) {
        String strM16245o = c3376k0.m16245o();
        C3804w c3804wM16062a = C3323i.m16062a(strM16245o);
        String strM15909h = m16718a().m15909h();
        C3804w c3804wM16062a2 = C3323i.m16062a(strM15909h);
        if (c3804wM16062a.equals(c3804wM16062a2)) {
            return true;
        }
        if (TextUtils.isEmpty(c3804wM16062a.f25529a) && !TextUtils.isEmpty(c3804wM16062a2.f25529a)) {
            c3376k0.mo15102e(strM15909h);
            m14158a(c3376k0, EnumC2889Qm.LOGOUT);
        } else if (!TextUtils.isEmpty(c3804wM16062a.f25529a) && TextUtils.isEmpty(c3804wM16062a2.f25529a)) {
            m14158a(c3376k0, EnumC2889Qm.LOGIN);
        } else if (TextUtils.isEmpty(c3804wM16062a.f25529a) || c3804wM16062a.f25529a.equals(c3804wM16062a2.f25529a)) {
            m14158a(c3376k0, EnumC2889Qm.UPDATE);
        } else {
            m14158a(c3376k0, EnumC2889Qm.SWITCH);
        }
        m16718a().m15900a(strM16245o);
        return true;
    }

    /* renamed from: a */
    private void m14158a(C3376k0 c3376k0, EnumC2889Qm enumC2889Qm) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(NotificationConstants.ACTION, enumC2889Qm.toString());
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        c3376k0.mo15103f(string);
        m16718a().m15919r().m16893b(c3376k0);
    }
}
