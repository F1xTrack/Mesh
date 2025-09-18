package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: oL0 */
/* loaded from: classes.dex */
public final class C6249oL0 extends IS0 {
    public final String a;
    public final IS0 b;
    public final ReactApplicationContext d;
    public final FileOutputStream e;
    public long c = 0;
    public boolean f = false;

    public C6249oL0(ReactApplicationContext reactApplicationContext, String str, IS0 is0, String str2, boolean z) throws IOException {
        this.d = reactApplicationContext;
        this.a = str;
        this.b = is0;
        if (str2 != null) {
            boolean z2 = !z;
            String strReplace = str2.replace("?append=true", "");
            File file = new File(strReplace);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IllegalStateException(AbstractC1705Vq.g(parentFile, "Couldn't create dir: "));
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            this.e = new FileOutputStream(new File(strReplace), z2);
        }
    }

    @Override // defpackage.IS0
    public final long o() {
        IS0 is0 = this.b;
        if (is0.o() > 2147483647L) {
            return 2147483647L;
        }
        return is0.o();
    }

    @Override // defpackage.IS0
    public final C1859Xp0 p() {
        return this.b.p();
    }

    @Override // defpackage.IS0
    public final InterfaceC0827Kj w() {
        return JI1.b(new C6058nL0(this));
    }
}
