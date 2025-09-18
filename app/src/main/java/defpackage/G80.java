package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class G80 implements SC {
    public final C8426zm0 a;

    public G80(C8426zm0 c8426zm0) {
        this.a = c8426zm0;
    }

    @Override // defpackage.SC
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.SC
    public final TC b(Object obj) {
        return new G10((InputStream) obj, this.a);
    }
}
