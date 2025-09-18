package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: g00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3878g00 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = AbstractC0277Dh1.a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.a = i2;
            this.b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(C0540Gr0 c0540Gr0) {
        int i = 0;
        while (true) {
            InterfaceC0384Er0[] interfaceC0384Er0Arr = c0540Gr0.a;
            if (i >= interfaceC0384Er0Arr.length) {
                return;
            }
            InterfaceC0384Er0 interfaceC0384Er0 = interfaceC0384Er0Arr[i];
            if (interfaceC0384Er0 instanceof C1171Ou) {
                C1171Ou c1171Ou = (C1171Ou) interfaceC0384Er0;
                if ("iTunSMPB".equals(c1171Ou.c) && a(c1171Ou.d)) {
                    return;
                }
            } else if (interfaceC0384Er0 instanceof B90) {
                B90 b90 = (B90) interfaceC0384Er0;
                if ("com.apple.iTunes".equals(b90.b) && "iTunSMPB".equals(b90.c) && a(b90.d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
