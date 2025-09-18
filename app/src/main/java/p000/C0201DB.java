package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: DB */
/* loaded from: classes.dex */
public final class C0201DB extends AbstractC6725r9 {

    /* renamed from: k */
    public final C0317F1 f1880k;

    /* renamed from: l */
    public final Uri f1881l;

    /* renamed from: m */
    public final String[] f1882m;

    /* renamed from: n */
    public final String f1883n;

    /* renamed from: o */
    public final String[] f1884o;

    /* renamed from: p */
    public Cursor f1885p;

    /* renamed from: q */
    public C0744Lp f1886q;

    public C0201DB(Context context, Uri uri, String[] strArr, String str, String[] strArr2) {
        super(context);
        this.f1880k = new C0317F1(this);
        this.f1881l = uri;
        this.f1882m = strArr;
        this.f1883n = str;
        this.f1884o = strArr2;
    }

    @Override // p000.AbstractC6725r9
    /* renamed from: b */
    public final void mo1580b() {
        synchronized (this) {
            try {
                C0744Lp c0744Lp = this.f1886q;
                if (c0744Lp != null) {
                    c0744Lp.m5109a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC6725r9
    /* renamed from: c */
    public final void mo1581c(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f41360e) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f1885p;
        this.f1885p = cursor;
        if (this.f41358c) {
            super.mo1581c(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // p000.AbstractC6725r9
    /* renamed from: d */
    public final void mo1582d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo1582d(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f1881l);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f1882m));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f1883n);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f1884o));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f1885p);
    }

    @Override // p000.AbstractC6725r9
    /* renamed from: h */
    public final void mo1584h(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // p000.AbstractC6725r9
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Cursor mo1583g() {
        synchronized (this) {
            if (this.f41365j != null) {
                throw new C11355uy0();
            }
            this.f1886q = new C0744Lp();
        }
        try {
            ContentResolver contentResolver = this.f41357b.getContentResolver();
            Uri uri = this.f1881l;
            String[] strArr = this.f1882m;
            String str = this.f1883n;
            String[] strArr2 = this.f1884o;
            C0744Lp c0744Lp = this.f1886q;
            try {
                Cursor cursorQuery = contentResolver.query(uri, strArr, str, strArr2, null, c0744Lp != null ? (CancellationSignal) c0744Lp.m5110b() : null);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.getCount();
                        cursorQuery.registerContentObserver(this.f1880k);
                    } catch (RuntimeException e) {
                        cursorQuery.close();
                        throw e;
                    }
                }
                synchronized (this) {
                    this.f1886q = null;
                }
                return cursorQuery;
            } catch (Exception e2) {
                if (e2 instanceof OperationCanceledException) {
                    throw new C11355uy0();
                }
                throw e2;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f1886q = null;
                throw th;
            }
        }
    }
}
