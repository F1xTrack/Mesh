package p000;

import android.content.Context;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfiumCore;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: OF */
/* loaded from: classes.dex */
public final class C0897OF implements InterfaceC0834NF, InterfaceC1279UK {

    /* renamed from: a */
    public InputStream f8325a;

    public C0897OF(InputStream inputStream) {
        this.f8325a = inputStream;
    }

    @Override // p000.InterfaceC0834NF
    /* renamed from: a */
    public int mo4932a() {
        return (mo4935d() << 8) | mo4935d();
    }

    @Override // p000.InterfaceC0834NF
    /* renamed from: c */
    public long mo4934c(long j) throws IOException {
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            InputStream inputStream = this.f8325a;
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

    @Override // p000.InterfaceC0834NF
    /* renamed from: d */
    public short mo4935d() throws IOException {
        int i = this.f8325a.read();
        if (i != -1) {
            return (short) i;
        }
        throw new C0771MF();
    }

    @Override // p000.InterfaceC1279UK
    /* renamed from: e */
    public PdfDocument mo6000e(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = this.f8325a.read(bArr);
            if (-1 == i) {
                return pdfiumCore.newDocument(byteArrayOutputStream.toByteArray(), str);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    @Override // p000.InterfaceC0834NF
    /* renamed from: f */
    public int mo4936f(int i, byte[] bArr) throws C0771MF {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = this.f8325a.read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C0771MF();
        }
        return i2;
    }
}
