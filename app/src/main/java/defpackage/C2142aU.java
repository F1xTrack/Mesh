package defpackage;

import java.io.File;

/* renamed from: aU, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2142aU extends ZT {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ C3399dU f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2142aU(C3399dU c3399dU, File file) {
        super(file);
        O90.f(file, "rootDir");
        this.f = c3399dU;
    }

    @Override // defpackage.AbstractC3589eU
    public final File a() {
        boolean z = this.e;
        File file = this.a;
        C3399dU c3399dU = this.f;
        if (!z && this.c == null) {
            c3399dU.d.getClass();
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                c3399dU.d.getClass();
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d < fileArr.length) {
            O90.c(fileArr);
            int i = this.d;
            this.d = i + 1;
            return fileArr[i];
        }
        if (this.b) {
            c3399dU.d.getClass();
            return null;
        }
        this.b = true;
        return file;
    }
}
