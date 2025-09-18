package p000;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.media.Image;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.barcode.internal.zzh;
import com.huawei.hms.actions.SearchIntents;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: XY */
/* loaded from: classes.dex */
public final class C1482XY implements Closeable, InterfaceC9071d60 {

    /* renamed from: d */
    public static final String[] f13841d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: e */
    public static final String[] f13842e = new String[0];

    /* renamed from: a */
    public final /* synthetic */ int f13843a = 3;

    /* renamed from: b */
    public final Object f13844b;

    /* renamed from: c */
    public final Object f13845c;

    public C1482XY(C0868Nn c0868Nn, C4140gp c4140gp) throws C6640po {
        C10218m32 c10218m32M25100c;
        this.f13844b = c4140gp;
        ArrayList arrayList = c0868Nn.f7994a;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 2;
            if (!it.hasNext()) {
                int iIntValue = ((Number) arrayList2.get(0)).intValue();
                int[] iArrM25981a0 = AbstractC7167xu.m25981a0(arrayList2);
                int[] iArrCopyOf = Arrays.copyOf(iArrM25981a0, iArrM25981a0.length);
                if (iArrCopyOf != null) {
                    for (int i2 : iArrCopyOf) {
                        iIntValue |= i2;
                    }
                }
                C0357Ff c0357Ff = new C0357Ff(iIntValue);
                Preconditions.checkNotNull(c0357Ff, "You must provide a valid BarcodeScannerOptions.");
                PJ1 pj1 = (PJ1) C8906bs0.m10530c().m10532a(PJ1.class);
                pj1.getClass();
                C10654pT1 c10654pT1 = (C10654pT1) pj1.f8995a.m7838g1(c0357Ff);
                Executor executor = (Executor) pj1.f8996b.f28415a.get();
                String str = true != IA1.m3779c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
                synchronized (AbstractC11242u32.class) {
                    byte b = (byte) (((byte) 1) | 2);
                    if (b != 3) {
                        StringBuilder sb = new StringBuilder();
                        if ((b & 1) == 0) {
                            sb.append(" enableFirelog");
                        }
                        if ((b & 2) == 0) {
                            sb.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    c10218m32M25100c = AbstractC11242u32.m25100c(new C9706i32(1, str, true));
                }
                this.f13845c = new zzh(c0357Ff, c10654pT1, executor, c10218m32M25100c);
                return;
            }
            EnumC4208hu enumC4208hu = (EnumC4208hu) it.next();
            switch (enumC4208hu.ordinal()) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 8;
                    break;
                case 4:
                    i = 32;
                    break;
                case 5:
                    i = 64;
                    break;
                case 6:
                    i = 128;
                    break;
                case 7:
                    i = 1024;
                    break;
                case 8:
                    i = 512;
                    break;
                case 9:
                    i = 256;
                    break;
                case 10:
                    i = 2048;
                    break;
                case 11:
                    i = 4096;
                    break;
                case 12:
                    i = 16;
                    break;
                case 13:
                    throw new C6640po("code-scanner", "code-type-not-supported", AbstractC7222ym.m26234k("The codeType \"", enumC4208hu.f28668a, "\" is not supported by the Code Scanner!"), null);
                default:
                    throw new C6838sg();
            }
            arrayList2.add(Integer.valueOf(i));
        }
    }

    /* renamed from: A */
    public boolean m9072A() {
        return ((SQLiteDatabase) this.f13844b).inTransaction();
    }

    /* renamed from: D */
    public boolean m9073D() {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f13844b;
        O90.m5968f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    /* renamed from: J */
    public Cursor m9074J(F61 f61) {
        Cursor cursorRawQueryWithFactory = ((SQLiteDatabase) this.f13844b).rawQueryWithFactory(new C1419WY(1, new C10686pj1(2, f61)), f61.mo2492m(), f13842e, null);
        O90.m5967e(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    /* renamed from: S */
    public Cursor m9075S(String str) {
        O90.m5968f(str, SearchIntents.EXTRA_QUERY);
        return m9074J(new C6222jC(str));
    }

    /* renamed from: U */
    public void m9076U() {
        ((SQLiteDatabase) this.f13844b).setTransactionSuccessful();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f13843a) {
            case 0:
                ((SQLiteDatabase) this.f13844b).close();
                return;
            case 1:
                ((zzh) this.f13845c).close();
                return;
            case 2:
                FileOutputStream fileOutputStream = (FileOutputStream) this.f13844b;
                try {
                    FileLock fileLock = (FileLock) this.f13845c;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    return;
                } finally {
                    fileOutputStream.close();
                }
            default:
                ((InputStream) this.f13845c).close();
                return;
        }
    }

    @Override // p000.InterfaceC9071d60
    /* renamed from: i0 */
    public void mo2076i0(C11814yZ0 c11814yZ0) throws C6640po {
        Image imageMo18404Z = c11814yZ0.f46285b.mo18404Z();
        if (imageMo18404Z == null) {
            throw new C6640po("capture", "invalid-image-type", "Captured an Image with an invalid Image type!", null);
        }
        try {
            E80 e80M2053a = E80.m2053a(imageMo18404Z, c11814yZ0.f46308e.mo4565c());
            C9450g32 c9450g32M11354a = ((zzh) this.f13845c).m11354a(e80M2053a);
            C0071B7 c0071b7 = new C0071B7(19, new C4027f1(this, 5, e80M2053a));
            ExecutorC0862Nh executorC0862Nh = Y81.f14171a;
            c9450g32M11354a.mo11138e(executorC0862Nh, c0071b7);
            c9450g32M11354a.mo11137d(executorC0862Nh, new C0071B7(20, this));
            c9450g32M11354a.mo11135b(new C0071B7(21, c11814yZ0));
        } catch (Throwable unused) {
            c11814yZ0.close();
        }
    }

    /* renamed from: m */
    public void m9077m() {
        ((SQLiteDatabase) this.f13844b).beginTransaction();
    }

    /* renamed from: n */
    public void m9078n() {
        ((SQLiteDatabase) this.f13844b).beginTransactionNonExclusive();
    }

    /* renamed from: o */
    public C3936dZ m9079o(String str) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = ((SQLiteDatabase) this.f13844b).compileStatement(str);
        O90.m5967e(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new C3936dZ(sQLiteStatementCompileStatement);
    }

    /* renamed from: p */
    public void m9080p() {
        ((SQLiteDatabase) this.f13844b).endTransaction();
    }

    /* renamed from: w */
    public void m9081w(String str) throws SQLException {
        O90.m5968f(str, "sql");
        ((SQLiteDatabase) this.f13844b).execSQL(str);
    }

    /* renamed from: x */
    public void m9082x(Object[] objArr) throws SQLException {
        ((SQLiteDatabase) this.f13844b).execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public C1482XY(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f13844b = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.f13845c = fileLockLock;
        } catch (Throwable th) {
            ((FileOutputStream) this.f13844b).close();
            throw th;
        }
    }

    public C1482XY(SQLiteDatabase sQLiteDatabase) {
        O90.m5968f(sQLiteDatabase, "delegate");
        this.f13844b = sQLiteDatabase;
        this.f13845c = sQLiteDatabase.getAttachedDbs();
    }

    public C1482XY(AbstractC0259E6 abstractC0259E6, InputStream inputStream) {
        this.f13844b = abstractC0259E6;
        this.f13845c = inputStream;
    }
}
