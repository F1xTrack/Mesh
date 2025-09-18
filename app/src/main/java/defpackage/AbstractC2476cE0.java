package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* renamed from: cE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2476cE0 {
    public static final C5315jS0 a = new C5315jS0();
    public static final Object b = new Object();
    public static C0162Bv0 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC2095aE0.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C0162Bv0 b() {
        C0162Bv0 c0162Bv0 = new C0162Bv0(19);
        c = c0162Bv0;
        a.j(c0162Bv0);
        return c;
    }

    public static void c(Context context, boolean z) {
        C2286bE0 c2286bE0A;
        int i;
        if (z || c == null) {
            synchronized (b) {
                if (!z) {
                    try {
                        if (c != null) {
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
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c2286bE0A = C2286bE0.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            c2286bE0A = null;
                        }
                        if (c2286bE0A != null && c2286bE0A.c == jA && (i = c2286bE0A.b) != 2) {
                            i3 = i;
                        } else if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        C2286bE0 c2286bE0 = new C2286bE0(1, (c2286bE0A == null || c2286bE0A.b != 2 || i3 != 1 || length >= c2286bE0A.d) ? i3 : 3, jA, length2);
                        if (c2286bE0A == null || !c2286bE0A.equals(c2286bE0)) {
                            try {
                                c2286bE0.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
