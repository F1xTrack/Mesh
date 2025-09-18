package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Y50 {

    /* renamed from: g */
    public static final Pattern f14149g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    public static final String f14150h = Pattern.quote("/");

    /* renamed from: a */
    public final C6396ly f14151a;

    /* renamed from: b */
    public final Context f14152b;

    /* renamed from: c */
    public final String f14153c;

    /* renamed from: d */
    public final InterfaceC1478XU f14154d;

    /* renamed from: e */
    public final C0202DC f14155e;

    /* renamed from: f */
    public C1047Qd f14156f;

    public Y50(Context context, String str, InterfaceC1478XU interfaceC1478XU, C0202DC c0202dc) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f14152b = context;
        this.f14153c = str;
        this.f14154d = interfaceC1478XU;
        this.f14155e = c0202dc;
        this.f14151a = new C6396ly();
    }

    /* renamed from: a */
    public final synchronized String m9217a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f14149g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* renamed from: b */
    public final C1226TU m9218b(boolean z) {
        String str;
        if (!((Boolean) new C1648aB(0, C10910rT1.f41674f, C1769bB.class, "isNotMainThread", "isNotMainThread()Z", 0, 2).invoke()).booleanValue()) {
            Thread.currentThread().getName();
        }
        InterfaceC1478XU interfaceC1478XU = this.f14154d;
        String str2 = null;
        if (z) {
            try {
                str = ((C1172Sd) AbstractC9376fU1.m18241b(((C1415WU) interfaceC1478XU).m8790e(), 10000L, TimeUnit.MILLISECONDS)).f10878a;
            } catch (Exception unused) {
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) AbstractC9376fU1.m18241b(((C1415WU) interfaceC1478XU).m8789d(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception unused2) {
        }
        return new C1226TU(str2, str);
    }

    /* renamed from: c */
    public final synchronized C1047Qd m9219c() {
        String str;
        C1047Qd c1047Qd = this.f14156f;
        if (c1047Qd != null && (c1047Qd.f9703b != null || !this.f14155e.m1590b())) {
            return this.f14156f;
        }
        SharedPreferences sharedPreferences = this.f14152b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        if (this.f14155e.m1590b()) {
            C1226TU c1226tuM9218b = m9218b(false);
            if (c1226tuM9218b.f11394a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                c1226tuM9218b = new C1226TU(str, null);
            }
            if (Objects.equals(c1226tuM9218b.f11394a, string)) {
                this.f14156f = new C1047Qd(sharedPreferences.getString("crashlytics.installation.id", null), c1226tuM9218b.f11394a, c1226tuM9218b.f11395b);
            } else {
                this.f14156f = new C1047Qd(m9217a(sharedPreferences, c1226tuM9218b.f11394a), c1226tuM9218b.f11394a, c1226tuM9218b.f11395b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f14156f = new C1047Qd(m9217a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f14156f = new C1047Qd(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        Objects.toString(this.f14156f);
        return this.f14156f;
    }

    /* renamed from: d */
    public final String m9220d() {
        String str;
        C6396ly c6396ly = this.f14151a;
        Context context = this.f14152b;
        synchronized (c6396ly) {
            try {
                if (c6396ly.f37369a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c6396ly.f37369a = installerPackageName;
                }
                str = "".equals(c6396ly.f37369a) ? null : c6396ly.f37369a;
            } finally {
            }
        }
        return str;
    }
}
