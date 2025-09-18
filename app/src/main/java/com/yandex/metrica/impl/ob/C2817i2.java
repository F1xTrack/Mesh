package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Vf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.i2 */
/* loaded from: classes2.dex */
class C2817i2 implements Bk {
    final /* synthetic */ Vf a;
    final /* synthetic */ C2841j2 b;

    public C2817i2(C2841j2 c2841j2, Vf vf) {
        this.b = c2841j2;
        this.a = vf;
    }

    @Override // com.yandex.metrica.impl.ob.Bk
    public void a(Ak ak) {
        Vf vf = this.a;
        List<C3133uk> listC = ak.c();
        if (U2.b(listC)) {
            return;
        }
        vf.e = new Vf.e[listC.size()];
        for (int i = 0; i < listC.size(); i++) {
            C3133uk c3133uk = listC.get(i);
            Vf.e[] eVarArr = vf.e;
            int i2 = C2692d2.e;
            Vf.e eVar = new Vf.e();
            if (c3133uk.b() != null) {
                eVar.b = c3133uk.b().intValue();
            }
            if (c3133uk.c() != null) {
                eVar.c = c3133uk.c().intValue();
            }
            if (!TextUtils.isEmpty(c3133uk.a())) {
                eVar.d = c3133uk.a();
            }
            eVar.e = c3133uk.d();
            eVarArr[i] = eVar;
            C2841j2 c2841j2 = this.b;
            c2841j2.x = C2639b.a(vf.e[i]) + c2841j2.x;
            C2841j2 c2841j22 = this.b;
            c2841j22.x = C2639b.c(10) + c2841j22.x;
        }
    }
}
