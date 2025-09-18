package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* renamed from: cE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8954cE0 {

    /* renamed from: a */
    public static final C9883jS0 f17380a = new C9883jS0();

    /* renamed from: b */
    public static final Object f17381b = new Object();

    /* renamed from: c */
    public static C7408Bv0 f17382c = null;

    /* renamed from: a */
    public static long m10624a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC8698aE0.m9683a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static C7408Bv0 m10625b() {
        C7408Bv0 c7408Bv0 = new C7408Bv0(19);
        f17382c = c7408Bv0;
        f17380a.m10413j(c7408Bv0);
        return f17382c;
    }

    /* renamed from: c */
    public static void m10626c(Context context, boolean z) {
        C8826bE0 c8826bE0M10435a;
        int i;
        if (z || f17382c == null) {
            synchronized (f17381b) {
                if (!z) {
                    try {
                        if (f17382c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i3 = 0;
                    boolean z2 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z3 = file2.exists() && length2 > 0;
                    try {
                        long jM10624a = m10624a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c8826bE0M10435a = C8826bE0.m10435a(file3);
                            } catch (IOException unused) {
                                m10625b();
                                return;
                            }
                        } else {
                            c8826bE0M10435a = null;
                        }
                        if (c8826bE0M10435a != null && c8826bE0M10435a.f16876c == jM10624a && (i = c8826bE0M10435a.f16875b) != 2) {
                            i3 = i;
                        } else if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        C8826bE0 c8826bE0 = new C8826bE0(1, (c8826bE0M10435a == null || c8826bE0M10435a.f16875b != 2 || i3 != 1 || length >= c8826bE0M10435a.f16877d) ? i3 : 3, jM10624a, length2);
                        if (c8826bE0M10435a == null || !c8826bE0M10435a.equals(c8826bE0)) {
                            try {
                                c8826bE0.m10436b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        m10625b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m10625b();
                        return;
                    }
                }
                m10625b();
            }
        }
    }
}
