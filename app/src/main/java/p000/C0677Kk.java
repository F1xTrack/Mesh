package p000;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* renamed from: Kk */
/* loaded from: classes.dex */
public final class C0677Kk {

    /* renamed from: a */
    public final /* synthetic */ int f6266a;

    /* renamed from: b */
    public final String f6267b;

    /* renamed from: c */
    public final String f6268c;

    /* renamed from: d */
    public final Serializable f6269d;

    public /* synthetic */ C0677Kk(String str, String str2, Serializable serializable, int i) {
        this.f6266a = i;
        this.f6267b = str;
        this.f6268c = str2;
        this.f6269d = serializable;
    }

    /* renamed from: a */
    public final InputStream m4710a() {
        switch (this.f6266a) {
            case 0:
                byte[] bArr = (byte[]) this.f6269d;
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                return new ByteArrayInputStream(bArr);
            default:
                File file = (File) this.f6269d;
                if (!file.exists() || !file.isFile()) {
                    return null;
                }
                try {
                    return new FileInputStream(file);
                } catch (FileNotFoundException unused) {
                    return null;
                }
        }
    }
}
