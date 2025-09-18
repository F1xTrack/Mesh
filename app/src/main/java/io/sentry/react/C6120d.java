package io.sentry.react;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.core.app.FrameMetricsAggregator;
import com.facebook.react.bridge.ReactApplicationContext;
import com.yandex.metrica.C2460e;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.C5832D;
import io.sentry.android.core.C5847T;
import io.sentry.android.core.C5852Y;
import io.sentry.android.core.C5900p;
import io.sentry.internal.debugmeta.C6042c;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import p000.N61;

/* renamed from: io.sentry.react.d */
/* loaded from: classes2.dex */
public final class C6120d {

    /* renamed from: l */
    public static final C5847T f34519l;

    /* renamed from: m */
    public static final C5832D f34520m;

    /* renamed from: n */
    public static final Charset f34521n;

    /* renamed from: o */
    public static boolean f34522o;

    /* renamed from: a */
    public final ReactApplicationContext f34523a;

    /* renamed from: b */
    public final PackageInfo f34524b;

    /* renamed from: d */
    public boolean f34526d;

    /* renamed from: j */
    public final N61 f34532j;

    /* renamed from: k */
    public final C5852Y f34533k;

    /* renamed from: c */
    public FrameMetricsAggregator f34525c = null;

    /* renamed from: e */
    public C5900p f34527e = null;

    /* renamed from: f */
    public boolean f34528f = false;

    /* renamed from: g */
    public String f34529g = null;

    /* renamed from: h */
    public String f34530h = null;

    /* renamed from: i */
    public C2460e f34531i = null;

    static {
        C5847T c5847t = new C5847T();
        f34519l = c5847t;
        f34520m = new C5832D(c5847t);
        f34521n = Charset.forName("UTF-8");
    }

    public C6120d(ReactApplicationContext reactApplicationContext) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = null;
        try {
            packageInfo = reactApplicationContext.getPackageManager().getPackageInfo(reactApplicationContext.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            f34519l.mo21407k(EnumC6069n1.WARNING, "Error getting package info.", new Object[0]);
        }
        this.f34524b = packageInfo;
        this.f34523a = reactApplicationContext;
        this.f34532j = new N61(22, this);
        this.f34533k = new C5852Y();
    }

    /* renamed from: a */
    public final String m21855a() throws IOException {
        if (this.f34528f) {
            return this.f34529g;
        }
        this.f34528f = true;
        C5847T c5847t = f34519l;
        List listMo21789a = new C6042c(this.f34523a, c5847t).mo21789a();
        if (listMo21789a == null) {
            return null;
        }
        Iterator it = listMo21789a.iterator();
        while (it.hasNext()) {
            String property = ((Properties) it.next()).getProperty("io.sentry.ProguardUuids");
            this.f34529g = property;
            if (property != null) {
                c5847t.mo21407k(EnumC6069n1.INFO, "Proguard uuid found: " + this.f34529g, new Object[0]);
                return this.f34529g;
            }
        }
        c5847t.mo21407k(EnumC6069n1.WARNING, "No proguard uuid found in debug meta properties file!", new Object[0]);
        return null;
    }
}
