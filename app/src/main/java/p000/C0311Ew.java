package p000;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: Ew */
/* loaded from: classes.dex */
public final class C0311Ew {

    /* renamed from: e */
    public static final Pattern f2971e;

    /* renamed from: f */
    public static final Pattern f2972f;

    /* renamed from: a */
    public final HashSet f2973a = new HashSet();

    /* renamed from: b */
    public final Executor f2974b;

    /* renamed from: c */
    public final C7169xw f2975c;

    /* renamed from: d */
    public final C7169xw f2976d;

    static {
        Charset.forName("UTF-8");
        f2971e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f2972f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public C0311Ew(Executor executor, C7169xw c7169xw, C7169xw c7169xw2) {
        this.f2974b = executor;
        this.f2975c = c7169xw;
        this.f2976d = c7169xw2;
    }

    /* renamed from: b */
    public static HashSet m2456b(C7169xw c7169xw) {
        HashSet hashSet = new HashSet();
        C7232yw c7232ywM26006d = c7169xw.m26006d();
        if (c7232ywM26006d == null) {
            return hashSet;
        }
        Iterator<String> itKeys = c7232ywM26006d.f46543b.keys();
        while (itKeys.hasNext()) {
            hashSet.add(itKeys.next());
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void m2457a(C10903rQ0 c10903rQ0) {
        synchronized (this.f2973a) {
            this.f2973a.add(c10903rQ0);
        }
    }
}
