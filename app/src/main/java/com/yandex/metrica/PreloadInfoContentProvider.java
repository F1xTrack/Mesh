package com.yandex.metrica;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.yandex.metrica.impl.p022ob.C2494B2;
import com.yandex.metrica.impl.p022ob.C2581Ee;
import com.yandex.metrica.impl.p022ob.C2606Fe;
import com.yandex.metrica.impl.p022ob.C2795N3;
import com.yandex.metrica.impl.p022ob.C2817O0;
import com.yandex.metrica.impl.p022ob.C2820O3;
import com.yandex.metrica.impl.p022ob.C3272g0;
import com.yandex.metrica.impl.p022ob.C3298h0;
import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a */
    public boolean f20739a = false;

    /* renamed from: b */
    public final UriMatcher f20740b = new UriMatcher(-1);

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        C2494B2.m13912b("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f20739a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f20739a) {
                    return null;
                }
                if (contentValues != null) {
                    int iMatch = this.f20740b.match(uri);
                    if (iMatch == 1) {
                        C3298h0 c3298h0 = new C3298h0(new C2581Ee(), new C2606Fe(), new C2817O0(), "preload info");
                        Context context = getContext();
                        Context applicationContext = context == null ? null : context.getApplicationContext();
                        if (applicationContext != null) {
                            c3298h0.m16025a(applicationContext, contentValues);
                        }
                    } else if (iMatch != 2) {
                        C2494B2.m13912b("Bad content provider uri: %s", uri);
                    } else {
                        C3298h0 c3298h02 = new C3298h0(new C2795N3(), new C2820O3(), new C2817O0(), "clids");
                        Context context2 = getContext();
                        Context applicationContext2 = context2 == null ? null : context2.getApplicationContext();
                        if (applicationContext2 != null) {
                            c3298h02.m16025a(applicationContext2, contentValues);
                        }
                    }
                }
                C3272g0.m15953a();
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
        UriMatcher uriMatcher = this.f20740b;
        uriMatcher.addURI(strM26232i, "preloadinfo", 1);
        uriMatcher.addURI(strM26232i, "clids", 2);
        C3272g0.m15955a(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C2494B2.m13912b("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2494B2.m13912b("Updating is not supported", new Object[0]);
        return -1;
    }
}
