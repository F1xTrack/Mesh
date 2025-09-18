package defpackage;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: Ew, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398Ew {
    public static final Pattern e;
    public static final Pattern f;
    public final HashSet a = new HashSet();
    public final Executor b;
    public final C8075xw c;
    public final C8075xw d;

    static {
        Charset.forName("UTF-8");
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public C0398Ew(Executor executor, C8075xw c8075xw, C8075xw c8075xw2) {
        this.b = executor;
        this.c = c8075xw;
        this.d = c8075xw2;
    }

    public static HashSet b(C8075xw c8075xw) {
        HashSet hashSet = new HashSet();
        C8265yw c8265ywD = c8075xw.d();
        if (c8265ywD == null) {
            return hashSet;
        }
        Iterator<String> itKeys = c8265ywD.b.keys();
        while (itKeys.hasNext()) {
            hashSet.add(itKeys.next());
        }
        return hashSet;
    }

    public final void a(C6836rQ0 c6836rQ0) {
        synchronized (this.a) {
            this.a.add(c6836rQ0);
        }
    }
}
