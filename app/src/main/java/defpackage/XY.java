package defpackage;

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

/* loaded from: classes.dex */
public final class XY implements Closeable, InterfaceC3328d60 {
    public static final String[] d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] e = new String[0];
    public final /* synthetic */ int a = 3;
    public final Object b;
    public final Object c;

    public XY(C1072Nn c1072Nn, C4034gp c4034gp) throws C6526po {
        C5814m32 c5814m32C;
        this.b = c4034gp;
        ArrayList arrayList = c1072Nn.a;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 2;
            if (!it.hasNext()) {
                int iIntValue = ((Number) arrayList2.get(0)).intValue();
                int[] iArrA0 = AbstractC8069xu.a0(arrayList2);
                int[] iArrCopyOf = Arrays.copyOf(iArrA0, iArrA0.length);
                if (iArrCopyOf != null) {
                    for (int i2 : iArrCopyOf) {
                        iIntValue |= i2;
                    }
                }
                C0425Ff c0425Ff = new C0425Ff(iIntValue);
                Preconditions.checkNotNull(c0425Ff, "You must provide a valid BarcodeScannerOptions.");
                PJ1 pj1 = (PJ1) C2406bs0.c().a(PJ1.class);
                pj1.getClass();
                C6465pT1 c6465pT1 = (C6465pT1) pj1.a.g1(c0425Ff);
                Executor executor = (Executor) pj1.b.a.get();
                String str = true != IA1.c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
                synchronized (AbstractC7341u32.class) {
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
                    c5814m32C = AbstractC7341u32.c(new C4274i32(1, str, true));
                }
                this.c = new zzh(c0425Ff, c6465pT1, executor, c5814m32C);
                return;
            }
            EnumC4240hu enumC4240hu = (EnumC4240hu) it.next();
            switch (enumC4240hu.ordinal()) {
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
                    throw new C6526po("code-scanner", "code-type-not-supported", AbstractC8235ym.k("The codeType \"", enumC4240hu.a, "\" is not supported by the Code Scanner!"), null);
                default:
                    throw new C7074sg();
            }
            arrayList2.add(Integer.valueOf(i));
        }
    }

    public boolean A() {
        return ((SQLiteDatabase) this.b).inTransaction();
    }

    public boolean D() {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.b;
        O90.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public Cursor J(F61 f61) {
        Cursor cursorRawQueryWithFactory = ((SQLiteDatabase) this.b).rawQueryWithFactory(new WY(1, new C6513pj1(2, f61)), f61.m(), e, null);
        O90.e(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    public Cursor S(String str) {
        O90.f(str, SearchIntents.EXTRA_QUERY);
        return J(new C5266jC(str));
    }

    public void U() {
        ((SQLiteDatabase) this.b).setTransactionSuccessful();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                ((SQLiteDatabase) this.b).close();
                return;
            case 1:
                ((zzh) this.c).close();
                return;
            case 2:
                FileOutputStream fileOutputStream = (FileOutputStream) this.b;
                try {
                    FileLock fileLock = (FileLock) this.c;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    return;
                } finally {
                    fileOutputStream.close();
                }
            default:
                ((InputStream) this.c).close();
                return;
        }
    }

    @Override // defpackage.InterfaceC3328d60
    public void i0(C8197yZ0 c8197yZ0) throws C6526po {
        Image imageZ = c8197yZ0.b.Z();
        if (imageZ == null) {
            throw new C6526po("capture", "invalid-image-type", "Captured an Image with an invalid Image type!", null);
        }
        try {
            E80 e80A = E80.a(imageZ, c8197yZ0.e.c());
            C3892g32 c3892g32A = ((zzh) this.c).a(e80A);
            B7 b7 = new B7(19, new C3690f1(this, 5, e80A));
            ExecutorC1054Nh executorC1054Nh = Y81.a;
            c3892g32A.e(executorC1054Nh, b7);
            c3892g32A.d(executorC1054Nh, new B7(20, this));
            c3892g32A.b(new B7(21, c8197yZ0));
        } catch (Throwable unused) {
            c8197yZ0.close();
        }
    }

    public void m() {
        ((SQLiteDatabase) this.b).beginTransaction();
    }

    public void n() {
        ((SQLiteDatabase) this.b).beginTransactionNonExclusive();
    }

    public C3414dZ o(String str) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = ((SQLiteDatabase) this.b).compileStatement(str);
        O90.e(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new C3414dZ(sQLiteStatementCompileStatement);
    }

    public void p() {
        ((SQLiteDatabase) this.b).endTransaction();
    }

    public void w(String str) throws SQLException {
        O90.f(str, "sql");
        ((SQLiteDatabase) this.b).execSQL(str);
    }

    public void x(Object[] objArr) throws SQLException {
        ((SQLiteDatabase) this.b).execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public XY(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.b = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.c = fileLockLock;
        } catch (Throwable th) {
            ((FileOutputStream) this.b).close();
            throw th;
        }
    }

    public XY(SQLiteDatabase sQLiteDatabase) {
        O90.f(sQLiteDatabase, "delegate");
        this.b = sQLiteDatabase;
        this.c = sQLiteDatabase.getAttachedDbs();
    }

    public XY(E6 e6, InputStream inputStream) {
        this.b = e6;
        this.c = inputStream;
    }
}
