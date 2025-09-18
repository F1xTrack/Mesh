package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: jA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5260jA {
    public final DC a;
    public final C1857Xo1 b;

    public C5260jA(DC dc, HT ht) {
        this.a = dc;
        this.b = new C1857Xo1(ht);
    }

    public final String a(String str) {
        String strSubstring;
        C1857Xo1 c1857Xo1 = this.b;
        synchronized (c1857Xo1) {
            if (Objects.equals((String) c1857Xo1.c, str)) {
                strSubstring = (String) c1857Xo1.d;
            } else {
                HT ht = (HT) c1857Xo1.b;
                C4293iA c4293iA = C1857Xo1.e;
                File file = new File((File) ht.d, str);
                file.mkdirs();
                List listM = HT.m(file.listFiles(c4293iA));
                strSubstring = listM.isEmpty() ? null : ((File) Collections.min(listM, C1857Xo1.f)).getName().substring(4);
            }
        }
        return strSubstring;
    }

    public final void b(String str) {
        C1857Xo1 c1857Xo1 = this.b;
        synchronized (c1857Xo1) {
            if (!Objects.equals((String) c1857Xo1.c, str)) {
                HT ht = (HT) c1857Xo1.b;
                String str2 = (String) c1857Xo1.d;
                if (str != null && str2 != null) {
                    try {
                        ht.j(str, "aqs.".concat(str2)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                c1857Xo1.c = str;
            }
        }
    }
}
