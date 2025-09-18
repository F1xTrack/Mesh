package defpackage;

import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: r70 */
/* loaded from: classes.dex */
public final class C6779r70 {
    public static final HashSet m = new HashSet();
    public Uri a;
    public EnumC6398p70 b;
    public int c;
    public C3394dS0 d;
    public CT0 e;
    public C8110y60 f;
    public EnumC6207o70 g;
    public boolean h;
    public boolean i;
    public EnumC7179tD0 j;
    public InterfaceC6604qC0 k;
    public C0908Lk l;

    public static boolean b(Uri uri) {
        HashSet hashSet = m;
        if (hashSet != null && uri != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C6779r70 c(Uri uri) {
        C6779r70 c6779r70 = new C6779r70();
        c6779r70.a = null;
        c6779r70.b = EnumC6398p70.FULL_FETCH;
        c6779r70.c = 0;
        c6779r70.d = null;
        c6779r70.e = null;
        c6779r70.f = C8110y60.c;
        c6779r70.g = EnumC6207o70.b;
        c6779r70.h = false;
        c6779r70.i = false;
        c6779r70.j = EnumC7179tD0.c;
        c6779r70.k = null;
        c6779r70.l = null;
        uri.getClass();
        c6779r70.a = uri;
        return c6779r70;
    }

    public final C6589q70 a() {
        Uri uri = this.a;
        if (uri == null) {
            throw new C7074sg("Source must be set!");
        }
        if ("res".equals(AbstractC2374bh1.b(uri))) {
            if (!this.a.isAbsolute()) {
                throw new C7074sg("Resource URI path must be absolute.");
            }
            if (this.a.getPath().isEmpty()) {
                throw new C7074sg("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new C7074sg("Resource URI path must be a resource id.");
            }
        }
        if ("asset".equals(AbstractC2374bh1.b(this.a)) && !this.a.isAbsolute()) {
            throw new C7074sg("Asset URI path must be absolute.");
        }
        if (this.g != EnumC6207o70.c) {
            return new C6589q70(this);
        }
        throw new C7074sg("Disk cache id must be set for dynamic cache choice");
    }
}
