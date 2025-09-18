package p000;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class WO1 {

    /* renamed from: g */
    public static final Object f13159g = new Object();

    /* renamed from: h */
    public static volatile C10258mN1 f13160h;

    /* renamed from: i */
    public static final AtomicInteger f13161i;

    /* renamed from: a */
    public final C1338VG f13162a;

    /* renamed from: b */
    public final String f13163b;

    /* renamed from: c */
    public final Object f13164c;

    /* renamed from: d */
    public volatile int f13165d = -1;

    /* renamed from: e */
    public volatile Object f13166e;

    /* renamed from: f */
    public final /* synthetic */ int f13167f;

    static {
        new AtomicReference();
        f13161i = new AtomicInteger();
    }

    public WO1(C1338VG c1338vg, String str, Object obj, int i) {
        this.f13167f = i;
        c1338vg.getClass();
        if (((Uri) c1338vg.f12475c) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f13162a = c1338vg;
        this.f13163b = str;
        this.f13164c = obj;
    }

    /* renamed from: a */
    public final Object m8754a() {
        int i = f13161i.get();
        if (this.f13165d < i) {
            synchronized (this) {
                try {
                    if (this.f13165d < i) {
                        C10258mN1 c10258mN1 = f13160h;
                        AbstractC7362Ay0 abstractC7362Ay0 = C7047w.f44631a;
                        String str = null;
                        if (c10258mN1 != null) {
                            abstractC7362Ay0 = (AbstractC7362Ay0) c10258mN1.f37659b.get();
                            if (abstractC7362Ay0.mo420b()) {
                                ON1 on1 = (ON1) abstractC7362Ay0.mo419a();
                                C1338VG c1338vg = this.f13162a;
                                Uri uri = (Uri) c1338vg.f12475c;
                                String str2 = (String) c1338vg.f12477e;
                                String str3 = this.f13163b;
                                on1.getClass();
                                L01 l01 = uri != null ? (L01) on1.f8405a.getOrDefault(uri.toString(), null) : null;
                                if (l01 != null) {
                                    if (str2 != null) {
                                        str3 = str2 + str3;
                                    }
                                    str = (String) l01.getOrDefault(str3, null);
                                }
                            }
                        }
                        QL1.m6671g(c10258mN1 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        this.f13162a.getClass();
                        Object objM8757d = m8757d(c10258mN1);
                        if (objM8757d == null && (objM8757d = m8756c(c10258mN1)) == null) {
                            objM8757d = this.f13164c;
                        }
                        if (abstractC7362Ay0.mo420b()) {
                            objM8757d = str == null ? this.f13164c : m8755b(str);
                        }
                        this.f13166e = objM8757d;
                        this.f13165d = i;
                    }
                } finally {
                }
            }
        }
        return this.f13166e;
    }

    /* renamed from: b */
    public final Object m8755b(Object obj) {
        switch (this.f13167f) {
            case 0:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!AbstractC11789yM1.f46232c.matcher(str).matches()) {
                            if (AbstractC11789yM1.f46233d.matcher(str).matches()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    String str2 = (String) this.f13162a.f12477e;
                    if (str2 != null) {
                        str2.isEmpty();
                    }
                    String.valueOf(obj);
                    break;
                } else {
                    break;
                }
            case 1:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    String str3 = (String) this.f13162a.f12477e;
                    if (str3 != null) {
                        str3.isEmpty();
                    }
                    String.valueOf(obj);
                    break;
                } else {
                    break;
                }
            case 2:
                if (obj instanceof String) {
                    break;
                }
                break;
            default:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        String str4 = (String) this.f13162a.f12477e;
                        if (str4 != null) {
                            str4.isEmpty();
                        }
                        String.valueOf(obj);
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return null;
    }

    /* renamed from: c */
    public final Object m8756c(C10258mN1 c10258mN1) {
        C9108dO1 c9108dO1;
        String strM26232i;
        if (!this.f13162a.f12474b) {
            Context context = c10258mN1.f37658a;
            synchronized (C9108dO1.class) {
                try {
                    if (C9108dO1.f26009d == null) {
                        C9108dO1.f26009d = AbstractC9998kL1.m22191a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C9108dO1(context, 0) : new C9108dO1(0);
                    }
                    c9108dO1 = C9108dO1.f26009d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C1338VG c1338vg = this.f13162a;
            if (c1338vg.f12474b) {
                strM26232i = null;
            } else {
                String str = (String) c1338vg.f12476d;
                strM26232i = this.f13163b;
                if (str == null || !str.isEmpty()) {
                    strM26232i = AbstractC7222ym.m26232i(str, strM26232i);
                }
            }
            Object objMo4301b = c9108dO1.mo4301b(strM26232i);
            if (objMo4301b != null) {
                return m8755b(objMo4301b);
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:79|(1:81)(7:82|(1:84)(1:85)|86|(0)|95|96|97)|90|118|91|92|(1:94)|95|96|97) */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8757d(p000.C10258mN1 r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.WO1.m8757d(mN1):java.lang.Object");
    }
}
