package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/* renamed from: j11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5232j11 extends YZ1 {
    public final /* synthetic */ int a = 0;
    public Context b;
    public Uri c;

    public /* synthetic */ C5232j11() {
    }

    @Override // defpackage.YZ1
    public final boolean a() {
        switch (this.a) {
            case 0:
                Context context = this.b;
                Uri uri = this.c;
                if (context.checkCallingOrSelfUriPermission(uri, 1) != 0 || TextUtils.isEmpty(AbstractC2051a02.f(context, uri, "mime_type"))) {
                    break;
                }
                break;
            default:
                Context context2 = this.b;
                Uri uri2 = this.c;
                if (context2.checkCallingOrSelfUriPermission(uri2, 1) != 0 || TextUtils.isEmpty(AbstractC2051a02.f(context2, uri2, "mime_type"))) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.YZ1
    public final boolean b() {
        switch (this.a) {
        }
        return AbstractC2051a02.a(this.b, this.c);
    }

    @Override // defpackage.YZ1
    public final YZ1 c(String str) throws FileNotFoundException {
        Uri uriCreateDocument;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Uri uri = this.c;
                Context context = this.b;
                try {
                    uriCreateDocument = DocumentsContract.createDocument(context.getContentResolver(), uri, "vnd.android.document/directory", str);
                } catch (Exception unused) {
                    uriCreateDocument = null;
                }
                if (uriCreateDocument != null) {
                    return new C5232j11(context, uriCreateDocument);
                }
                return null;
        }
    }

    @Override // defpackage.YZ1
    public final YZ1 d(String str, String str2) throws FileNotFoundException {
        Uri uriCreateDocument;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Uri uri = this.c;
                Context context = this.b;
                try {
                    uriCreateDocument = DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
                } catch (Exception unused) {
                    uriCreateDocument = null;
                }
                if (uriCreateDocument != null) {
                    return new C5232j11(context, uriCreateDocument);
                }
                return null;
        }
    }

    @Override // defpackage.YZ1
    public final boolean e() {
        switch (this.a) {
        }
        return DocumentsContract.deleteDocument(this.b.getContentResolver(), this.c);
    }

    @Override // defpackage.YZ1
    public final boolean f() {
        switch (this.a) {
        }
        return AbstractC2051a02.c(this.b, this.c);
    }

    @Override // defpackage.YZ1
    public final String g() {
        switch (this.a) {
        }
        return AbstractC2051a02.f(this.b, this.c, "_display_name");
    }

    @Override // defpackage.YZ1
    public final Uri h() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.YZ1
    public final boolean i() {
        switch (this.a) {
        }
        return "vnd.android.document/directory".equals(AbstractC2051a02.f(this.b, this.c, "mime_type"));
    }

    @Override // defpackage.YZ1
    public final YZ1[] j() throws Exception {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.b;
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = this.c;
                Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
                ArrayList arrayList = new ArrayList();
                Cursor cursorQuery = null;
                try {
                    try {
                        try {
                            cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                            while (cursorQuery.moveToNext()) {
                                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(0)));
                            }
                            try {
                                cursorQuery.close();
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        } catch (Throwable th) {
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (RuntimeException e2) {
                                    throw e2;
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e3.toString();
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (RuntimeException e4) {
                                throw e4;
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
                Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                YZ1[] yz1Arr = new YZ1[uriArr.length];
                for (int i = 0; i < uriArr.length; i++) {
                    yz1Arr[i] = new C5232j11(context, uriArr[i]);
                }
                return yz1Arr;
        }
    }

    public C5232j11(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }
}
