package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3006Vf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.i2 */
/* loaded from: classes2.dex */
class C3326i2 implements InterfaceC2512Bk {

    /* renamed from: a */
    final /* synthetic */ C3006Vf f23622a;

    /* renamed from: b */
    final /* synthetic */ C3352j2 f23623b;

    public C3326i2(C3352j2 c3352j2, C3006Vf c3006Vf) {
        this.f23623b = c3352j2;
        this.f23622a = c3006Vf;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2512Bk
    /* renamed from: a */
    public void mo859a(C2487Ak c2487Ak) {
        C3006Vf c3006Vf = this.f23622a;
        List<C3656uk> listM13870c = c2487Ak.m13870c();
        if (C2968U2.m15249b(listM13870c)) {
            return;
        }
        c3006Vf.f22540e = new C3006Vf.e[listM13870c.size()];
        for (int i = 0; i < listM13870c.size(); i++) {
            C3656uk c3656uk = listM13870c.get(i);
            C3006Vf.e[] eVarArr = c3006Vf.f22540e;
            int i2 = C3196d2.f23206e;
            C3006Vf.e eVar = new C3006Vf.e();
            if (c3656uk.m16933b() != null) {
                eVar.f22609b = c3656uk.m16933b().intValue();
            }
            if (c3656uk.m16934c() != null) {
                eVar.f22610c = c3656uk.m16934c().intValue();
            }
            if (!TextUtils.isEmpty(c3656uk.m16932a())) {
                eVar.f22611d = c3656uk.m16932a();
            }
            eVar.f22612e = c3656uk.m16935d();
            eVarArr[i] = eVar;
            C3352j2 c3352j2 = this.f23623b;
            c3352j2.f23685x = C3141b.m15635a(c3006Vf.f22540e[i]) + c3352j2.f23685x;
            C3352j2 c3352j22 = this.f23623b;
            c3352j22.f23685x = C3141b.m15641c(10) + c3352j22.f23685x;
        }
    }
}
