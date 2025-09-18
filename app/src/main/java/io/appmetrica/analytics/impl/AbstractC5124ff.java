package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import p000.AbstractC0852NX;
import p000.AbstractC11153tN0;
import p000.AbstractC7038vr;
import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.ff */
/* loaded from: classes2.dex */
public abstract class AbstractC5124ff {
    /* renamed from: a */
    public static final String m20388a(C5043c9 c5043c9) {
        String string;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i = c5043c9.f31393c;
        String str = c5043c9.f31394d;
        byte[] bArr = c5043c9.f31395e;
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
                String str2 = new String(bArr, AbstractC7038vr.f44561a);
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
                    string = AbstractC7222ym.m26245v("Crash: ", str);
                    break;
                case 27:
                    string = AbstractC7222ym.m26245v("Error: ", str);
                    break;
                default:
                    string = AbstractC11153tN0.m24909u(i, "type=");
                    break;
            }
        } else {
            string = "Revenue";
        }
        sb.append(string);
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m20389a(String str, EnumC4898Wa enumC4898Wa, String str2, String str3) {
        if (!AbstractC5443s9.f32556d.contains(EnumC4898Wa.m19946a(enumC4898Wa.f30974a))) {
            return null;
        }
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, ": ");
        sbM5762k.append(enumC4898Wa.name());
        if (AbstractC5443s9.f32558f.contains(enumC4898Wa) && !TextUtils.isEmpty(str2)) {
            sbM5762k.append(" with name ");
            sbM5762k.append(str2);
        }
        if (AbstractC5443s9.f32557e.contains(enumC4898Wa) && !TextUtils.isEmpty(str3)) {
            sbM5762k.append(" with value ");
            sbM5762k.append(str3);
        }
        return sbM5762k.toString();
    }
}
