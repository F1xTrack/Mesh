package p000;

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
public final class C9827j11 extends YZ1 {

    /* renamed from: a */
    public final /* synthetic */ int f34845a = 0;

    /* renamed from: b */
    public Context f34846b;

    /* renamed from: c */
    public Uri f34847c;

    public /* synthetic */ C9827j11() {
    }

    @Override // p000.YZ1
    /* renamed from: a */
    public final boolean mo9312a() {
        switch (this.f34845a) {
            case 0:
                Context context = this.f34846b;
                Uri uri = this.f34847c;
                if (context.checkCallingOrSelfUriPermission(uri, 1) != 0 || TextUtils.isEmpty(AbstractC8668a02.m9657f(context, uri, "mime_type"))) {
                    break;
                }
                break;
            default:
                Context context2 = this.f34846b;
                Uri uri2 = this.f34847c;
                if (context2.checkCallingOrSelfUriPermission(uri2, 1) != 0 || TextUtils.isEmpty(AbstractC8668a02.m9657f(context2, uri2, "mime_type"))) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // p000.YZ1
    /* renamed from: b */
    public final boolean mo9313b() {
        switch (this.f34845a) {
        }
        return AbstractC8668a02.m9652a(this.f34846b, this.f34847c);
    }

    @Override // p000.YZ1
    /* renamed from: c */
    public final YZ1 mo9314c(String str) throws FileNotFoundException {
        Uri uriCreateDocument;
        switch (this.f34845a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Uri uri = this.f34847c;
                Context context = this.f34846b;
                try {
                    uriCreateDocument = DocumentsContract.createDocument(context.getContentResolver(), uri, "vnd.android.document/directory", str);
                } catch (Exception unused) {
                    uriCreateDocument = null;
                }
                if (uriCreateDocument != null) {
                    return new C9827j11(context, uriCreateDocument);
                }
                return null;
        }
    }

    @Override // p000.YZ1
    /* renamed from: d */
    public final YZ1 mo9315d(String str, String str2) throws FileNotFoundException {
        Uri uriCreateDocument;
        switch (this.f34845a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Uri uri = this.f34847c;
                Context context = this.f34846b;
                try {
                    uriCreateDocument = DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
                } catch (Exception unused) {
                    uriCreateDocument = null;
                }
                if (uriCreateDocument != null) {
                    return new C9827j11(context, uriCreateDocument);
                }
                return null;
        }
    }

    @Override // p000.YZ1
    /* renamed from: e */
    public final boolean mo9316e() {
        switch (this.f34845a) {
        }
        return DocumentsContract.deleteDocument(this.f34846b.getContentResolver(), this.f34847c);
    }

    @Override // p000.YZ1
    /* renamed from: f */
    public final boolean mo9317f() {
        switch (this.f34845a) {
        }
        return AbstractC8668a02.m9654c(this.f34846b, this.f34847c);
    }

    @Override // p000.YZ1
    /* renamed from: g */
    public final String mo9318g() {
        switch (this.f34845a) {
        }
        return AbstractC8668a02.m9657f(this.f34846b, this.f34847c, "_display_name");
    }

    @Override // p000.YZ1
    /* renamed from: h */
    public final Uri mo9319h() {
        switch (this.f34845a) {
        }
        return this.f34847c;
    }

    @Override // p000.YZ1
    /* renamed from: i */
    public final boolean mo9320i() {
        switch (this.f34845a) {
        }
        return "vnd.android.document/directory".equals(AbstractC8668a02.m9657f(this.f34846b, this.f34847c, "mime_type"));
    }

    @Override // p000.YZ1
    /* renamed from: j */
    public final YZ1[] mo9321j() throws Exception {
        switch (this.f34845a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.f34846b;
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = this.f34847c;
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
                    yz1Arr[i] = new C9827j11(context, uriArr[i]);
                }
                return yz1Arr;
        }
    }

    public C9827j11(Context context, Uri uri) {
        this.f34846b = context;
        this.f34847c = uri;
    }
}
