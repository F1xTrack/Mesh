package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Vf;
import defpackage.NX;
import io.appmetrica.analytics.reactnative.AppMetricaModule;

/* loaded from: classes2.dex */
public class Im extends Am {
    private static final int[] d = {3, 6, 4};
    private static final Im e = new Im("");

    public Im(String str) {
        super(str);
    }

    public static Im g() {
        return e;
    }

    public void a(Vf.d dVar, String str) {
        String string;
        for (Vf.d.a aVar : dVar.d) {
            if (aVar != null) {
                int[] iArr = d;
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (aVar.d == iArr[i]) {
                            StringBuilder sbK = NX.k(str, ": ");
                            if (aVar.d == 3 && TextUtils.isEmpty(aVar.e)) {
                                string = "Native crash of app";
                            } else if (aVar.d == 4) {
                                StringBuilder sb = new StringBuilder(aVar.e);
                                byte[] bArr = aVar.f;
                                if (bArr != null) {
                                    String str2 = new String(bArr);
                                    if (!TextUtils.isEmpty(str2)) {
                                        sb.append(" with value ");
                                        sb.append(str2);
                                    }
                                }
                                string = sb.toString();
                            } else {
                                string = aVar.e;
                            }
                            sbK.append(string);
                            b(sbK.toString());
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.zo
    public String b() {
        return AppMetricaModule.NAME;
    }

    public Im() {
        this("");
    }
}
