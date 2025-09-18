package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class WO1 {
    public static final Object g = new Object();
    public static volatile C5874mN1 h;
    public static final AtomicInteger i;
    public final VG a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    public final /* synthetic */ int f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public WO1(VG vg, String str, Object obj, int i2) {
        this.f = i2;
        vg.getClass();
        if (((Uri) vg.c) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = vg;
        this.b = str;
        this.c = obj;
    }

    public final Object a() {
        int i2 = i.get();
        if (this.d < i2) {
            synchronized (this) {
                try {
                    if (this.d < i2) {
                        C5874mN1 c5874mN1 = h;
                        AbstractC0093Ay0 abstractC0093Ay0 = C7707w.a;
                        String str = null;
                        if (c5874mN1 != null) {
                            abstractC0093Ay0 = (AbstractC0093Ay0) c5874mN1.b.get();
                            if (abstractC0093Ay0.b()) {
                                ON1 on1 = (ON1) abstractC0093Ay0.a();
                                VG vg = this.a;
                                Uri uri = (Uri) vg.c;
                                String str2 = (String) vg.e;
                                String str3 = this.b;
                                on1.getClass();
                                L01 l01 = uri != null ? (L01) on1.a.getOrDefault(uri.toString(), null) : null;
                                if (l01 != null) {
                                    if (str2 != null) {
                                        str3 = str2 + str3;
                                    }
                                    str = (String) l01.getOrDefault(str3, null);
                                }
                            }
                        }
                        QL1.g(c5874mN1 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        this.a.getClass();
                        Object objD = d(c5874mN1);
                        if (objD == null && (objD = c(c5874mN1)) == null) {
                            objD = this.c;
                        }
                        if (abstractC0093Ay0.b()) {
                            objD = str == null ? this.c : b(str);
                        }
                        this.e = objD;
                        this.d = i2;
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public final Object b(Object obj) {
        switch (this.f) {
            case 0:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!AbstractC8159yM1.c.matcher(str).matches()) {
                            if (AbstractC8159yM1.d.matcher(str).matches()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    String str2 = (String) this.a.e;
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
                    String str3 = (String) this.a.e;
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
                        String str4 = (String) this.a.e;
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

    public final Object c(C5874mN1 c5874mN1) {
        C3383dO1 c3383dO1;
        String strI;
        if (!this.a.b) {
            Context context = c5874mN1.a;
            synchronized (C3383dO1.class) {
                try {
                    if (C3383dO1.d == null) {
                        C3383dO1.d = AbstractC5486kL1.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C3383dO1(context, 0) : new C3383dO1(0);
                    }
                    c3383dO1 = C3383dO1.d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            VG vg = this.a;
            if (vg.b) {
                strI = null;
            } else {
                String str = (String) vg.d;
                strI = this.b;
                if (str == null || !str.isEmpty()) {
                    strI = AbstractC8235ym.i(str, strI);
                }
            }
            Object objB = c3383dO1.b(strI);
            if (objB != null) {
                return b(objB);
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:79|(1:81)(7:82|(1:84)(1:85)|86|(0)|95|96|97)|90|118|91|92|(1:94)|95|96|97) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.C5874mN1 r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WO1.d(mN1):java.lang.Object");
    }
}
