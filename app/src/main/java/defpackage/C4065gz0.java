package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: gz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4065gz0 {
    public final Context a;
    public final File b;
    public final String c;
    public final File d;

    public C4065gz0(Context context, String str, File file) throws IOException {
        this.a = context;
        this.b = file;
        this.c = str;
        File fileCreateTempFile = File.createTempFile("mrousavy", str, file);
        this.d = fileCreateTempFile;
        String absolutePath = file.getAbsolutePath();
        O90.e(absolutePath, "getAbsolutePath(...)");
        String absolutePath2 = context.getCacheDir().getAbsolutePath();
        O90.e(absolutePath2, "getAbsolutePath(...)");
        if (AbstractC7538v51.p(absolutePath, absolutePath2, false)) {
            fileCreateTempFile.deleteOnExit();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4065gz0)) {
            return false;
        }
        C4065gz0 c4065gz0 = (C4065gz0) obj;
        return O90.a(this.a, c4065gz0.a) && O90.a(this.b, c4065gz0.b) && O90.a(this.c, c4065gz0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputFile(context=");
        sb.append(this.a);
        sb.append(", directory=");
        sb.append(this.b);
        sb.append(", extension=");
        return AbstractC1705Vq.l(sb, this.c, ")");
    }
}
