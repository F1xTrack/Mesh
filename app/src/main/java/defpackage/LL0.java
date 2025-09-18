package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class LL0 {
    public static final LL0 b = new LL0();
    public SharedPreferences a;

    public LL0(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        File file = new File(AbstractC0794Jy.c(context), "com.google.android.gms.appid-no-backup");
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
                b();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    public static String a(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void b() {
        this.a.edit().clear().commit();
    }

    public SharedPreferences c() {
        if (this.a == null) {
            this.a = CO1.a.getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.a;
    }
}
