package defpackage;

import java.io.File;

/* renamed from: cU, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2523cU extends ZT {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ C3399dU e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2523cU(C3399dU c3399dU, File file) {
        super(file);
        O90.f(file, "rootDir");
        this.e = c3399dU;
    }

    @Override // defpackage.AbstractC3589eU
    public final File a() {
        boolean z = this.b;
        File file = this.a;
        C3399dU c3399dU = this.e;
        if (!z) {
            c3399dU.d.getClass();
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            c3399dU.d.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                c3399dU.d.getClass();
            }
            File[] fileArr2 = this.c;
            if (fileArr2 == null || fileArr2.length == 0) {
                c3399dU.d.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.c;
        O90.c(fileArr3);
        int i = this.d;
        this.d = i + 1;
        return fileArr3[i];
    }
}
