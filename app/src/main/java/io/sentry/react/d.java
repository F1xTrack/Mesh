package io.sentry.react;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.core.app.FrameMetricsAggregator;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.N61;
import io.sentry.EnumC5148n1;
import io.sentry.android.core.C5099p;
import io.sentry.android.core.D;
import io.sentry.android.core.T;
import io.sentry.android.core.Y;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* loaded from: classes2.dex */
public final class d {
    public static final T l;
    public static final D m;
    public static final Charset n;
    public static boolean o;
    public final ReactApplicationContext a;
    public final PackageInfo b;
    public boolean d;
    public final N61 j;
    public final Y k;
    public FrameMetricsAggregator c = null;
    public C5099p e = null;
    public boolean f = false;
    public String g = null;
    public String h = null;
    public com.yandex.metrica.e i = null;

    static {
        T t = new T();
        l = t;
        m = new D(t);
        n = Charset.forName("UTF-8");
    }

    public d(ReactApplicationContext reactApplicationContext) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = null;
        try {
            packageInfo = reactApplicationContext.getPackageManager().getPackageInfo(reactApplicationContext.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            l.k(EnumC5148n1.WARNING, "Error getting package info.", new Object[0]);
        }
        this.b = packageInfo;
        this.a = reactApplicationContext;
        this.j = new N61(22, this);
        this.k = new Y();
    }

    public final String a() throws IOException {
        if (this.f) {
            return this.g;
        }
        this.f = true;
        T t = l;
        List listA = new io.sentry.internal.debugmeta.c(this.a, t).a();
        if (listA == null) {
            return null;
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            String property = ((Properties) it.next()).getProperty("io.sentry.ProguardUuids");
            this.g = property;
            if (property != null) {
                t.k(EnumC5148n1.INFO, "Proguard uuid found: " + this.g, new Object[0]);
                return this.g;
            }
        }
        t.k(EnumC5148n1.WARNING, "No proguard uuid found in debug meta properties file!", new Object[0]);
        return null;
    }
}
