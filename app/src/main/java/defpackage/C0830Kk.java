package defpackage;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* renamed from: Kk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0830Kk {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;
    public final Serializable d;

    public /* synthetic */ C0830Kk(String str, String str2, Serializable serializable, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = serializable;
    }

    public final InputStream a() {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) this.d;
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                return new ByteArrayInputStream(bArr);
            default:
                File file = (File) this.d;
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
