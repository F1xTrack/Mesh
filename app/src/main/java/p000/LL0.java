package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class LL0 {

    /* renamed from: b */
    public static final LL0 f6614b = new LL0();

    /* renamed from: a */
    public SharedPreferences f6615a;

    public LL0(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f6615a = sharedPreferences;
        File file = new File(AbstractC0628Jy.m4481c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                m4956b();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    /* renamed from: a */
    public static String m4955a(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* renamed from: b */
    public synchronized void m4956b() {
        this.f6615a.edit().clear().commit();
    }

    /* renamed from: c */
    public SharedPreferences m4957c() {
        if (this.f6615a == null) {
            this.f6615a = CO1.f1354a.getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f6615a;
    }
}
