package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import com.facebook.soloader.AbstractC1937e;
import com.facebook.soloader.C1933a;
import java.io.File;
import java.io.IOException;

/* renamed from: yf */
/* loaded from: classes.dex */
public final class C7215yf extends AbstractC11064sg1 {

    /* renamed from: e */
    public final File f46376e;

    /* renamed from: f */
    public final String f46377f;

    /* renamed from: g */
    public final int f46378g;

    public C7215yf(Context context, String str, File file) {
        super(context, str);
        this.f46376e = file;
        this.f46377f = "^lib/([^/]+)/([^/]+\\.so)$";
        this.f46378g = 1;
    }

    @Override // p000.C1278UJ, p000.H21
    /* renamed from: b */
    public final String mo3242b() {
        return "BackupSoSource";
    }

    @Override // p000.AbstractC11064sg1
    /* renamed from: e */
    public final byte[] mo24767e() throws IOException {
        int i;
        Context context = this.f42548d;
        File canonicalFile = this.f46376e.getCanonicalFile();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    i = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                }
            } else {
                i = 0;
            }
            parcelObtain.writeInt(i);
            if ((this.f46378g & 1) == 0) {
                parcelObtain.writeByte((byte) 0);
                return parcelObtain.marshall();
            }
            String str = context.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile2.getPath());
            parcelObtain.writeLong(canonicalFile2.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p000.AbstractC11064sg1
    /* renamed from: g */
    public final AbstractC1937e mo18816g(boolean z) {
        return new C1933a(this, this, z);
    }
}
