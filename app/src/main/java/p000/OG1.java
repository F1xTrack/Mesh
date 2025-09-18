package p000;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class OG1 implements InterfaceC10378nJ1 {

    /* renamed from: a */
    public final /* synthetic */ int f8330a;

    public /* synthetic */ OG1(int i) {
        this.f8330a = i;
    }

    /* renamed from: a */
    public static String m6002a(ContentResolver contentResolver, String str) throws C9362fN1 {
        Uri uri = AbstractC11789yM1.f46230a;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new C9362fN1("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new C9362fN1("ContentProvider query returned null cursor");
                    }
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(1);
                        cursorQuery.close();
                        return string;
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return null;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e) {
                throw new C9362fN1("ContentProvider query failed", e);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    /* renamed from: b */
    public static HashMap m6003b(ContentResolver contentResolver, String[] strArr, GG1 gg1) throws C9362fN1 {
        Uri uri = AbstractC11789yM1.f46231b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new C9362fN1("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new C9362fN1("ContentProvider query returned null cursor");
                    }
                    HashMap map = new HashMap(cursorQuery.getCount(), 1.0f);
                    while (cursorQuery.moveToNext()) {
                        map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new C9362fN1("Cursor read incomplete (ContentProvider dead?)");
                    }
                    cursorQuery.close();
                    return map;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e) {
                throw new C9362fN1("ContentProvider query failed", e);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f8330a) {
            case 0:
                PW1.f9104b.get();
                return (String) UW1.f11849Q.m8754a();
            case 1:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11899z.m8754a()).longValue());
            default:
                TY1.f11425b.get();
                Boolean bool = (Boolean) XY1.f13848a.m8754a();
                bool.getClass();
                return bool;
        }
    }
}
