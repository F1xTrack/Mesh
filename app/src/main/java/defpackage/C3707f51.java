package defpackage;

import android.content.UriMatcher;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: f51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3707f51 extends AbstractC3526e9 {
    public static final UriMatcher e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // defpackage.KC
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.AbstractC3526e9
    public final void g(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    @Override // defpackage.AbstractC3526e9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(android.content.ContentResolver r4, android.net.Uri r5) throws java.io.FileNotFoundException {
        /*
            r3 = this;
            android.content.UriMatcher r0 = defpackage.C3707f51.e
            int r0 = r0.match(r5)
            r1 = 1
            if (r0 == r1) goto L19
            r2 = 3
            if (r0 == r2) goto L14
            r2 = 5
            if (r0 == r2) goto L19
            java.io.InputStream r4 = r4.openInputStream(r5)
            goto L23
        L14:
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r5, r1)
            goto L23
        L19:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r4, r5)
            if (r0 == 0) goto L32
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r0, r1)
        L23:
            if (r4 == 0) goto L26
            return r4
        L26:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r0 = "InputStream is null for "
            java.lang.String r5 = defpackage.AbstractC7209tN0.w(r0, r5)
            r4.<init>(r5)
            throw r4
        L32:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3707f51.h(android.content.ContentResolver, android.net.Uri):java.lang.Object");
    }
}
