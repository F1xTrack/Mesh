package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class OG1 implements InterfaceC6053nJ1 {
    public final /* synthetic */ int a;

    public /* synthetic */ OG1(int i) {
        this.a = i;
    }

    public static String a(ContentResolver contentResolver, String str) throws C3761fN1 {
        Uri uri = AbstractC8159yM1.a;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new C3761fN1("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new C3761fN1("ContentProvider query returned null cursor");
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
                throw new C3761fN1("ContentProvider query failed", e);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public static HashMap b(ContentResolver contentResolver, String[] strArr, GG1 gg1) throws C3761fN1 {
        Uri uri = AbstractC8159yM1.b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new C3761fN1("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new C3761fN1("ContentProvider query returned null cursor");
                    }
                    HashMap map = new HashMap(cursorQuery.getCount(), 1.0f);
                    while (cursorQuery.moveToNext()) {
                        map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new C3761fN1("Cursor read incomplete (ContentProvider dead?)");
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
                throw new C3761fN1("ContentProvider query failed", e);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 0:
                PW1.b.get();
                return (String) UW1.Q.a();
            case 1:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.z.a()).longValue());
            default:
                TY1.b.get();
                Boolean bool = (Boolean) XY1.a.a();
                bool.getClass();
                return bool;
        }
    }
}
