package p000;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.AbstractC1937e;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Objects;

/* renamed from: sg1 */
/* loaded from: classes.dex */
public abstract class AbstractC11064sg1 extends C1278UJ {

    /* renamed from: d */
    public final Context f42548d;

    public AbstractC11064sg1(Context context, String str) {
        super(m24765f(context, str), 1);
        this.f42548d = context;
    }

    /* renamed from: f */
    public static File m24765f(Context context, String str) {
        return new File(AbstractC11153tN0.m24914z(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str));
    }

    /* renamed from: i */
    public static void m24766i(File file, byte b, boolean z) throws IOException {
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

    @Override // p000.H21
    /* renamed from: d */
    public final void mo3244d(int i) {
        File file = this.f11729a;
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(AbstractC1374Vq.m8588g(file, "cannot mkdir: "));
        }
        if (!file.canWrite() && !file.setWritable(true)) {
            throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
        }
        C1482XY c1482xy = null;
        try {
            try {
                C1482XY c1482xyM4169d = J71.m4169d(file, new File(file, "dso_lock"));
                try {
                    Objects.toString(file);
                    O90.m5973k(2, "fb-UnpackingSoSource");
                    if (!file.canWrite() && !file.setWritable(true)) {
                        throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
                    }
                    if (!m24768h(c1482xyM4169d, i)) {
                        Objects.toString(file);
                        O90.m5973k(4, "fb-UnpackingSoSource");
                        c1482xy = c1482xyM4169d;
                    }
                    if (c1482xy != null) {
                        Objects.toString(file);
                        O90.m5973k(2, "fb-UnpackingSoSource");
                        c1482xy.close();
                    } else {
                        Objects.toString(file);
                        O90.m5973k(2, "fb-UnpackingSoSource");
                    }
                    if (!file.canWrite() || file.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    c1482xy = c1482xyM4169d;
                    if (c1482xy != null) {
                        Objects.toString(file);
                        O90.m5973k(2, "fb-UnpackingSoSource");
                        c1482xy.close();
                    } else {
                        Objects.toString(file);
                        O90.m5973k(2, "fb-UnpackingSoSource");
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

    /* renamed from: e */
    public byte[] mo24767e() {
        Parcel parcelObtain = Parcel.obtain();
        AbstractC1937e abstractC1937eMo18816g = mo18816g(false);
        try {
            AbstractC0259E6[] abstractC0259E6ArrMo11079m = abstractC1937eMo18816g.mo11079m();
            parcelObtain.writeInt(abstractC0259E6ArrMo11079m.length);
            for (AbstractC0259E6 abstractC0259E6 : abstractC0259E6ArrMo11079m) {
                parcelObtain.writeString((String) abstractC0259E6.f2473a);
                parcelObtain.writeString((String) abstractC0259E6.f2474b);
            }
            abstractC1937eMo18816g.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            try {
                abstractC1937eMo18816g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: g */
    public abstract AbstractC1937e mo18816g(boolean z);

    /* JADX WARN: Removed duplicated region for block: B:146:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x009d  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m24768h(p000.C1482XY r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11064sg1.m24768h(XY, int):boolean");
    }
}
