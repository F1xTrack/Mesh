package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class DB extends AbstractC6784r9 {
    public final F1 k;
    public final Uri l;
    public final String[] m;
    public final String n;
    public final String[] o;
    public Cursor p;
    public C0923Lp q;

    public DB(Context context, Uri uri, String[] strArr, String str, String[] strArr2) {
        super(context);
        this.k = new F1(this);
        this.l = uri;
        this.m = strArr;
        this.n = str;
        this.o = strArr2;
    }

    @Override // defpackage.AbstractC6784r9
    public final void b() {
        synchronized (this) {
            try {
                C0923Lp c0923Lp = this.q;
                if (c0923Lp != null) {
                    c0923Lp.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC6784r9
    public final void c(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.e) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.p;
        this.p = cursor;
        if (this.c) {
            super.c(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // defpackage.AbstractC6784r9
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.d(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.l);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.m));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.o));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.p);
    }

    @Override // defpackage.AbstractC6784r9
    public final void h(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // defpackage.AbstractC6784r9
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Cursor g() {
        synchronized (this) {
            if (this.j != null) {
                throw new C7511uy0();
            }
            this.q = new C0923Lp();
        }
        try {
            ContentResolver contentResolver = this.b.getContentResolver();
            Uri uri = this.l;
            String[] strArr = this.m;
            String str = this.n;
            String[] strArr2 = this.o;
            C0923Lp c0923Lp = this.q;
            try {
                Cursor cursorQuery = contentResolver.query(uri, strArr, str, strArr2, null, c0923Lp != null ? (CancellationSignal) c0923Lp.b() : null);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.getCount();
                        cursorQuery.registerContentObserver(this.k);
                    } catch (RuntimeException e) {
                        cursorQuery.close();
                        throw e;
                    }
                }
                synchronized (this) {
                    this.q = null;
                }
                return cursorQuery;
            } catch (Exception e2) {
                if (e2 instanceof OperationCanceledException) {
                    throw new C7511uy0();
                }
                throw e2;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.q = null;
                throw th;
            }
        }
    }
}
