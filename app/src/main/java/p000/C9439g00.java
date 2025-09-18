package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: g00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9439g00 {

    /* renamed from: c */
    public static final Pattern f27518c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f27519a = -1;

    /* renamed from: b */
    public int f27520b = -1;

    /* renamed from: a */
    public final boolean m18375a(String str) throws NumberFormatException {
        Matcher matcher = f27518c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = AbstractC7485Dh1.f2166a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f27519a = i2;
            this.f27520b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void m18376b(C7660Gr0 c7660Gr0) {
        int i = 0;
        while (true) {
            InterfaceC7556Er0[] interfaceC7556Er0Arr = c7660Gr0.f3928a;
            if (i >= interfaceC7556Er0Arr.length) {
                return;
            }
            InterfaceC7556Er0 interfaceC7556Er0 = interfaceC7556Er0Arr[i];
            if (interfaceC7556Er0 instanceof C0938Ou) {
                C0938Ou c0938Ou = (C0938Ou) interfaceC7556Er0;
                if ("iTunSMPB".equals(c0938Ou.f8664c) && m18375a(c0938Ou.f8665d)) {
                    return;
                }
            } else if (interfaceC7556Er0 instanceof B90) {
                B90 b90 = (B90) interfaceC7556Er0;
                if ("com.apple.iTunes".equals(b90.f605b) && "iTunSMPB".equals(b90.f606c) && m18375a(b90.f607d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
