package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: Qw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1333Qw {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, C0675Ik0 c0675Ik0) {
        configuration.setLocales((LocaleList) c0675Ik0.a.b());
    }
}
