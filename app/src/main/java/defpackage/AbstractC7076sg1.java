package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.e;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Objects;

/* renamed from: sg1 */
/* loaded from: classes.dex */
public abstract class AbstractC7076sg1 extends UJ {
    public final Context d;

    public AbstractC7076sg1(Context context, String str) {
        super(f(context, str), 1);
        this.d = context;
    }

    public static File f(Context context, String str) {
        return new File(AbstractC7209tN0.z(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str));
    }

    public static void i(File file, byte b, boolean z) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException unused) {
        }
    }

    @Override // defpackage.H21
    public final void d(int i) {
        File file = this.a;
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(AbstractC1705Vq.g(file, "cannot mkdir: "));
        }
        if (!file.canWrite() && !file.setWritable(true)) {
            throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
        }
        XY xy = null;
        try {
            try {
                XY xyD = J71.d(file, new File(file, "dso_lock"));
                try {
                    Objects.toString(file);
                    O90.k(2, "fb-UnpackingSoSource");
                    if (!file.canWrite() && !file.setWritable(true)) {
                        throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
                    }
                    if (!h(xyD, i)) {
                        Objects.toString(file);
                        O90.k(4, "fb-UnpackingSoSource");
                        xy = xyD;
                    }
                    if (xy != null) {
                        Objects.toString(file);
                        O90.k(2, "fb-UnpackingSoSource");
                        xy.close();
                    } else {
                        Objects.toString(file);
                        O90.k(2, "fb-UnpackingSoSource");
                    }
                    if (!file.canWrite() || file.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    xy = xyD;
                    if (xy != null) {
                        Objects.toString(file);
                        O90.k(2, "fb-UnpackingSoSource");
                        xy.close();
                    } else {
                        Objects.toString(file);
                        O90.k(2, "fb-UnpackingSoSource");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (!file.canWrite() || file.setWritable(false)) {
                throw th3;
            }
            throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
        }
    }

    public byte[] e() {
        Parcel parcelObtain = Parcel.obtain();
        e eVarG = g(false);
        try {
            E6[] e6ArrM = eVarG.m();
            parcelObtain.writeInt(e6ArrM.length);
            for (E6 e6 : e6ArrM) {
                parcelObtain.writeString((String) e6.a);
                parcelObtain.writeString((String) e6.b);
            }
            eVarG.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            try {
                eVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract e g(boolean z);

    /* JADX WARN: Removed duplicated region for block: B:146:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(defpackage.XY r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7076sg1.h(XY, int):boolean");
    }
}
