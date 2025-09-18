package defpackage;

import android.content.Context;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfiumCore;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class OF implements NF, UK {
    public InputStream a;

    public OF(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.NF
    public int a() {
        return (d() << 8) | d();
    }

    @Override // defpackage.NF
    public long c(long j) throws IOException {
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            InputStream inputStream = this.a;
            long jSkip = inputStream.skip(j2);
            if (jSkip > 0) {
                j2 -= jSkip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j2--;
            }
        }
        return j - j2;
    }

    @Override // defpackage.NF
    public short d() throws IOException {
        int i = this.a.read();
        if (i != -1) {
            return (short) i;
        }
        throw new MF();
    }

    @Override // defpackage.UK
    public PdfDocument e(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = this.a.read(bArr);
            if (-1 == i) {
                return pdfiumCore.newDocument(byteArrayOutputStream.toByteArray(), str);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    @Override // defpackage.NF
    public int f(int i, byte[] bArr) throws MF {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new MF();
        }
        return i2;
    }
}
