package p000;

import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: oL0 */
/* loaded from: classes.dex */
public final class C10509oL0 extends IS0 {

    /* renamed from: a */
    public final String f38958a;

    /* renamed from: b */
    public final IS0 f38959b;

    /* renamed from: d */
    public final ReactApplicationContext f38961d;

    /* renamed from: e */
    public final FileOutputStream f38962e;

    /* renamed from: c */
    public long f38960c = 0;

    /* renamed from: f */
    public boolean f38963f = false;

    public C10509oL0(ReactApplicationContext reactApplicationContext, String str, IS0 is0, String str2, boolean z) throws IOException {
        this.f38961d = reactApplicationContext;
        this.f38958a = str;
        this.f38959b = is0;
        if (str2 != null) {
            boolean z2 = !z;
            String strReplace = str2.replace("?append=true", "");
            File file = new File(strReplace);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IllegalStateException(AbstractC1374Vq.m8588g(parentFile, "Couldn't create dir: "));
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            this.f38962e = new FileOutputStream(new File(strReplace), z2);
        }
    }

    @Override // p000.IS0
    /* renamed from: o */
    public final long mo3383o() {
        IS0 is0 = this.f38959b;
        if (is0.mo3383o() > 2147483647L) {
            return 2147483647L;
        }
        return is0.mo3383o();
    }

    @Override // p000.IS0
    /* renamed from: p */
    public final C8540Xp0 mo3384p() {
        return this.f38959b.mo3384p();
    }

    @Override // p000.IS0
    /* renamed from: w */
    public final InterfaceC0676Kj mo3385w() {
        return JI1.m4274b(new C10381nL0(this));
    }
}
