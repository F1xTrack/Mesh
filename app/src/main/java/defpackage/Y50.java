package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Y50 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final C5792ly a;
    public final Context b;
    public final String c;
    public final XU d;
    public final DC e;
    public C1276Qd f;

    public Y50(Context context, String str, XU xu, DC dc) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = xu;
        this.e = dc;
        this.a = new C5792ly();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final TU b(boolean z) {
        String str;
        if (!((Boolean) new C2085aB(0, C6846rT1.f, C2276bB.class, "isNotMainThread", "isNotMainThread()Z", 0, 2).invoke()).booleanValue()) {
            Thread.currentThread().getName();
        }
        XU xu = this.d;
        String str2 = null;
        if (z) {
            try {
                str = ((C1432Sd) AbstractC3782fU1.b(((WU) xu).e(), 10000L, TimeUnit.MILLISECONDS)).a;
            } catch (Exception unused) {
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) AbstractC3782fU1.b(((WU) xu).d(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception unused2) {
        }
        return new TU(str2, str);
    }

    public final synchronized C1276Qd c() {
        String str;
        C1276Qd c1276Qd = this.f;
        if (c1276Qd != null && (c1276Qd.b != null || !this.e.b())) {
            return this.f;
        }
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        if (this.e.b()) {
            TU tuB = b(false);
            if (tuB.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                tuB = new TU(str, null);
            }
            if (Objects.equals(tuB.a, string)) {
                this.f = new C1276Qd(sharedPreferences.getString("crashlytics.installation.id", null), tuB.a, tuB.b);
            } else {
                this.f = new C1276Qd(a(sharedPreferences, tuB.a), tuB.a, tuB.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new C1276Qd(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new C1276Qd(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        Objects.toString(this.f);
        return this.f;
    }

    public final String d() {
        String str;
        C5792ly c5792ly = this.a;
        Context context = this.b;
        synchronized (c5792ly) {
            try {
                if (c5792ly.a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c5792ly.a = installerPackageName;
                }
                str = "".equals(c5792ly.a) ? null : c5792ly.a;
            } finally {
            }
        }
        return str;
    }
}
