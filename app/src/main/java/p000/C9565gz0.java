package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: gz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9565gz0 {

    /* renamed from: a */
    public final Context f28137a;

    /* renamed from: b */
    public final File f28138b;

    /* renamed from: c */
    public final String f28139c;

    /* renamed from: d */
    public final File f28140d;

    public C9565gz0(Context context, String str, File file) throws IOException {
        this.f28137a = context;
        this.f28138b = file;
        this.f28139c = str;
        File fileCreateTempFile = File.createTempFile("mrousavy", str, file);
        this.f28140d = fileCreateTempFile;
        String absolutePath = file.getAbsolutePath();
        O90.m5967e(absolutePath, "getAbsolutePath(...)");
        String absolutePath2 = context.getCacheDir().getAbsolutePath();
        O90.m5967e(absolutePath2, "getAbsolutePath(...)");
        if (AbstractC11374v51.m25351p(absolutePath, absolutePath2, false)) {
            fileCreateTempFile.deleteOnExit();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9565gz0)) {
            return false;
        }
        C9565gz0 c9565gz0 = (C9565gz0) obj;
        return O90.m5963a(this.f28137a, c9565gz0.f28137a) && O90.m5963a(this.f28138b, c9565gz0.f28138b) && O90.m5963a(this.f28139c, c9565gz0.f28139c);
    }

    public final int hashCode() {
        return this.f28139c.hashCode() + ((this.f28138b.hashCode() + (this.f28137a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputFile(context=");
        sb.append(this.f28137a);
        sb.append(", directory=");
        sb.append(this.f28138b);
        sb.append(", extension=");
        return AbstractC1374Vq.m8593l(sb, this.f28139c, ")");
    }
}
