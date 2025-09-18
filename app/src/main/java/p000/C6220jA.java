package p000;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: jA */
/* loaded from: classes.dex */
public final class C6220jA {

    /* renamed from: a */
    public final C0202DC f34953a;

    /* renamed from: b */
    public final C8539Xo1 f34954b;

    public C6220jA(C0202DC c0202dc, C0471HT c0471ht) {
        this.f34953a = c0202dc;
        this.f34954b = new C8539Xo1(c0471ht);
    }

    /* renamed from: a */
    public final String m21980a(String str) {
        String strSubstring;
        C8539Xo1 c8539Xo1 = this.f34954b;
        synchronized (c8539Xo1) {
            if (Objects.equals((String) c8539Xo1.f13982c, str)) {
                strSubstring = (String) c8539Xo1.f13983d;
            } else {
                C0471HT c0471ht = (C0471HT) c8539Xo1.f13981b;
                C4225iA c4225iA = C8539Xo1.f13975e;
                File file = new File((File) c0471ht.f4312d, str);
                file.mkdirs();
                List listM3439m = C0471HT.m3439m(file.listFiles(c4225iA));
                strSubstring = listM3439m.isEmpty() ? null : ((File) Collections.min(listM3439m, C8539Xo1.f13976f)).getName().substring(4);
            }
        }
        return strSubstring;
    }

    /* renamed from: b */
    public final void m21981b(String str) {
        C8539Xo1 c8539Xo1 = this.f34954b;
        synchronized (c8539Xo1) {
            if (!Objects.equals((String) c8539Xo1.f13982c, str)) {
                C0471HT c0471ht = (C0471HT) c8539Xo1.f13981b;
                String str2 = (String) c8539Xo1.f13983d;
                if (str != null && str2 != null) {
                    try {
                        c0471ht.m3450j(str, "aqs.".concat(str2)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                c8539Xo1.f13982c = str;
            }
        }
    }
}
