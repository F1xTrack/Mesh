package p000;

import java.io.File;

/* renamed from: aU */
/* loaded from: classes2.dex */
public final class C1667aU extends AbstractC1603ZT {

    /* renamed from: b */
    public boolean f15528b;

    /* renamed from: c */
    public File[] f15529c;

    /* renamed from: d */
    public int f15530d;

    /* renamed from: e */
    public boolean f15531e;

    /* renamed from: f */
    public final /* synthetic */ C3931dU f15532f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667aU(C3931dU c3931dU, File file) {
        super(file);
        O90.m5968f(file, "rootDir");
        this.f15532f = c3931dU;
    }

    @Override // p000.AbstractC3993eU
    /* renamed from: a */
    public final File mo9751a() {
        boolean z = this.f15531e;
        File file = this.f26723a;
        C3931dU c3931dU = this.f15532f;
        if (!z && this.f15529c == null) {
            c3931dU.f26121d.getClass();
            File[] fileArrListFiles = file.listFiles();
            this.f15529c = fileArrListFiles;
            if (fileArrListFiles == null) {
                c3931dU.f26121d.getClass();
                this.f15531e = true;
            }
        }
        File[] fileArr = this.f15529c;
        if (fileArr != null && this.f15530d < fileArr.length) {
            O90.m5965c(fileArr);
            int i = this.f15530d;
            this.f15530d = i + 1;
            return fileArr[i];
        }
        if (this.f15528b) {
            c3931dU.f26121d.getClass();
            return null;
        }
        this.f15528b = true;
        return file;
    }
}
