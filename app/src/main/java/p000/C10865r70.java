package p000;

import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: r70 */
/* loaded from: classes.dex */
public final class C10865r70 {

    /* renamed from: m */
    public static final HashSet f41337m = new HashSet();

    /* renamed from: a */
    public Uri f41338a;

    /* renamed from: b */
    public EnumC10609p70 f41339b;

    /* renamed from: c */
    public int f41340c;

    /* renamed from: d */
    public C9115dS0 f41341d;

    /* renamed from: e */
    public CT0 f41342e;

    /* renamed from: f */
    public C11756y60 f41343f;

    /* renamed from: g */
    public EnumC10481o70 f41344g;

    /* renamed from: h */
    public boolean f41345h;

    /* renamed from: i */
    public boolean f41346i;

    /* renamed from: j */
    public EnumC11133tD0 f41347j;

    /* renamed from: k */
    public InterfaceC10747qC0 f41348k;

    /* renamed from: l */
    public C0739Lk f41349l;

    /* renamed from: b */
    public static boolean m24159b(Uri uri) {
        HashSet hashSet = f41337m;
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

    /* renamed from: c */
    public static C10865r70 m24160c(Uri uri) {
        C10865r70 c10865r70 = new C10865r70();
        c10865r70.f41338a = null;
        c10865r70.f41339b = EnumC10609p70.FULL_FETCH;
        c10865r70.f41340c = 0;
        c10865r70.f41341d = null;
        c10865r70.f41342e = null;
        c10865r70.f41343f = C11756y60.f46087c;
        c10865r70.f41344g = EnumC10481o70.f38819b;
        c10865r70.f41345h = false;
        c10865r70.f41346i = false;
        c10865r70.f41347j = EnumC11133tD0.f42955c;
        c10865r70.f41348k = null;
        c10865r70.f41349l = null;
        uri.getClass();
        c10865r70.f41338a = uri;
        return c10865r70;
    }

    /* renamed from: a */
    public final C10737q70 m24161a() {
        Uri uri = this.f41338a;
        if (uri == null) {
            throw new C6838sg("Source must be set!");
        }
        if ("res".equals(AbstractC8885bh1.m10481b(uri))) {
            if (!this.f41338a.isAbsolute()) {
                throw new C6838sg("Resource URI path must be absolute.");
            }
            if (this.f41338a.getPath().isEmpty()) {
                throw new C6838sg("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f41338a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new C6838sg("Resource URI path must be a resource id.");
            }
        }
        if ("asset".equals(AbstractC8885bh1.m10481b(this.f41338a)) && !this.f41338a.isAbsolute()) {
            throw new C6838sg("Asset URI path must be absolute.");
        }
        if (this.f41344g != EnumC10481o70.f38820c) {
            return new C10737q70(this);
        }
        throw new C6838sg("Disk cache id must be set for dynamic cache choice");
    }
}
