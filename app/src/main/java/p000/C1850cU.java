package p000;

import java.io.File;

/* renamed from: cU */
/* loaded from: classes2.dex */
public final class C1850cU extends AbstractC1603ZT {

    /* renamed from: b */
    public boolean f17532b;

    /* renamed from: c */
    public File[] f17533c;

    /* renamed from: d */
    public int f17534d;

    /* renamed from: e */
    public final /* synthetic */ C3931dU f17535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1850cU(C3931dU c3931dU, File file) {
        super(file);
        O90.m5968f(file, "rootDir");
        this.f17535e = c3931dU;
    }

    @Override // p000.AbstractC3993eU
    /* renamed from: a */
    public final File mo9751a() {
        boolean z = this.f17532b;
        File file = this.f26723a;
        C3931dU c3931dU = this.f17535e;
        if (!z) {
            c3931dU.f26121d.getClass();
            this.f17532b = true;
            return file;
        }
        File[] fileArr = this.f17533c;
        if (fileArr != null && this.f17534d >= fileArr.length) {
            c3931dU.f26121d.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f17533c = fileArrListFiles;
            if (fileArrListFiles == null) {
                c3931dU.f26121d.getClass();
            }
            File[] fileArr2 = this.f17533c;
            if (fileArr2 == null || fileArr2.length == 0) {
                c3931dU.f26121d.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f17533c;
        O90.m5965c(fileArr3);
        int i = this.f17534d;
        this.f17534d = i + 1;
        return fileArr3[i];
    }
}
