package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import defpackage.AbstractC7209tN0;
import defpackage.AbstractC7680vr;
import defpackage.AbstractC8235ym;
import defpackage.NX;

/* renamed from: io.appmetrica.analytics.impl.ff */
/* loaded from: classes2.dex */
public abstract class AbstractC4553ff {
    public static final String a(C4473c9 c4473c9) {
        String string;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i = c4473c9.c;
        String str = c4473c9.d;
        byte[] bArr = c4473c9.e;
        if (i == 1) {
            string = "Attribution";
        } else if (i == 2) {
            string = "Session start";
        } else if (i == 4) {
            if (str == null) {
                str = "null";
            }
            StringBuilder sb2 = new StringBuilder(str);
            if (bArr != null) {
                String str2 = new String(bArr, AbstractC7680vr.a);
                if (!TextUtils.isEmpty(str2)) {
                    sb2.append(" with value ");
                    sb2.append(str2);
                }
            }
            string = sb2.toString();
        } else if (i == 5) {
            string = "Referrer";
        } else if (i == 7) {
            string = "Session heartbeat";
        } else if (i == 13) {
            string = "The very first event";
        } else if (i == 35) {
            string = "E-Commerce";
        } else if (i == 40) {
            string = "Ad revenue (ILRD)";
        } else if (i == 42) {
            string = "External attribution";
        } else if (i == 16) {
            string = "Open";
        } else if (i == 17) {
            string = "Update";
        } else if (i == 20) {
            string = "User profile update";
        } else if (i != 21) {
            switch (i) {
                case 25:
                    string = "ANR";
                    break;
                case 26:
                    string = AbstractC8235ym.v("Crash: ", str);
                    break;
                case 27:
                    string = AbstractC8235ym.v("Error: ", str);
                    break;
                default:
                    string = AbstractC7209tN0.u(i, "type=");
                    break;
            }
        } else {
            string = "Revenue";
        }
        sb.append(string);
        return sb.toString();
    }

    public static final String a(String str, Wa wa, String str2, String str3) {
        if (!AbstractC4857s9.d.contains(Wa.a(wa.a))) {
            return null;
        }
        StringBuilder sbK = NX.k(str, ": ");
        sbK.append(wa.name());
        if (AbstractC4857s9.f.contains(wa) && !TextUtils.isEmpty(str2)) {
            sbK.append(" with name ");
            sbK.append(str2);
        }
        if (AbstractC4857s9.e.contains(wa) && !TextUtils.isEmpty(str3)) {
            sbK.append(" with value ");
            sbK.append(str3);
        }
        return sbK.toString();
    }
}
