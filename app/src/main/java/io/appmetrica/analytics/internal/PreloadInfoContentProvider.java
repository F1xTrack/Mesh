package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC4510G5;
import io.appmetrica.analytics.impl.AbstractC5527vi;
import io.appmetrica.analytics.impl.C4508G3;
import io.appmetrica.analytics.impl.C4532H3;
import io.appmetrica.analytics.impl.C4534H5;
import io.appmetrica.analytics.impl.C5019ba;
import io.appmetrica.analytics.impl.C5573xe;
import io.appmetrica.analytics.impl.C5598ye;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;
import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a */
    private boolean f32949a = false;

    /* renamed from: b */
    private final UriMatcher f32950b = new UriMatcher(-1);

    /* renamed from: a */
    private void m21259a(C4534H5 c4534h5, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object objInvoke = c4534h5.f30236a.invoke(contentValues);
                if (objInvoke != null) {
                    c4534h5.f30238c.m20167b(applicationContext);
                    if (((Boolean) c4534h5.f30237b.invoke(objInvoke)).booleanValue()) {
                        AbstractC5527vi.m21161a("Successfully saved " + c4534h5.f30239d, new Object[0]);
                    } else {
                        AbstractC5527vi.m21161a("Did not save " + c4534h5.f30239d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        AbstractC5527vi.m21161a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f32949a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f32949a) {
                    return null;
                }
                if (contentValues != null) {
                    int iMatch = this.f32950b.match(uri);
                    if (iMatch == 1) {
                        m21259a(new C4534H5(new C5573xe(), new C5598ye(), C5019ba.f31313d, "preload info"), contentValues);
                    } else if (iMatch != 2) {
                        AbstractC5527vi.m21161a("Bad content provider uri.", new Object[0]);
                    } else {
                        m21259a(new C4534H5(new C4508G3(), new C4532H3(), C5019ba.f31313d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = AbstractC4510G5.f30161a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String strM26232i = AbstractC7222ym.m26232i(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.f32950b.addURI(strM26232i, "preloadinfo", 1);
        this.f32950b.addURI(strM26232i, "clids", 2);
        AbstractC4510G5.f30161a = new CountDownLatch(1);
        AbstractC4510G5.f30162b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC5527vi.m21161a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC5527vi.m21161a("Updating is not supported", new Object[0]);
        return -1;
    }
}
