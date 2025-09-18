package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3006Vf;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import p000.AbstractC0852NX;

/* renamed from: com.yandex.metrica.impl.ob.Im */
/* loaded from: classes2.dex */
public class C2689Im extends AbstractC2489Am {

    /* renamed from: d */
    private static final int[] f21456d = {3, 6, 4};

    /* renamed from: e */
    private static final C2689Im f21457e = new C2689Im("");

    public C2689Im(String str) {
        super(str);
    }

    /* renamed from: g */
    public static C2689Im m14369g() {
        return f21457e;
    }

    /* renamed from: a */
    public void m14370a(C3006Vf.d dVar, String str) {
        String string;
        for (C3006Vf.d.a aVar : dVar.f22573d) {
            if (aVar != null) {
                int[] iArr = f21456d;
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (aVar.f22577d == iArr[i]) {
                            StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, ": ");
                            if (aVar.f22577d == 3 && TextUtils.isEmpty(aVar.f22578e)) {
                                string = "Native crash of app";
                            } else if (aVar.f22577d == 4) {
                                StringBuilder sb = new StringBuilder(aVar.f22578e);
                                byte[] bArr = aVar.f22579f;
                                if (bArr != null) {
                                    String str2 = new String(bArr);
                                    if (!TextUtils.isEmpty(str2)) {
                                        sb.append(" with value ");
                                        sb.append(str2);
                                    }
                                }
                                string = sb.toString();
                            } else {
                                string = aVar.f22578e;
                            }
                            sbM5762k.append(string);
                            m17366b(sbM5762k.toString());
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3790zo
    /* renamed from: b */
    public String mo14371b() {
        return AppMetricaModule.NAME;
    }

    public C2689Im() {
        this("");
    }
}
