package p000;

import android.net.Uri;

/* renamed from: sO1 */
/* loaded from: classes.dex */
public abstract class AbstractC11028sO1 {

    /* renamed from: a */
    public static final C7119x8 f42417a = new C7119x8();

    /* renamed from: a */
    public static synchronized Uri m24733a(String str) {
        Uri uri;
        C7119x8 c7119x8 = f42417a;
        uri = (Uri) c7119x8.getOrDefault(str, null);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c7119x8.put(str, uri);
        }
        return uri;
    }
}
