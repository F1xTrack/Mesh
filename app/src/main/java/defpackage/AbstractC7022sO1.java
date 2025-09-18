package defpackage;

import android.net.Uri;

/* renamed from: sO1 */
/* loaded from: classes.dex */
public abstract class AbstractC7022sO1 {
    public static final C7925x8 a = new C7925x8();

    public static synchronized Uri a(String str) {
        Uri uri;
        C7925x8 c7925x8 = a;
        uri = (Uri) c7925x8.getOrDefault(str, null);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c7925x8.put(str, uri);
        }
        return uri;
    }
}
