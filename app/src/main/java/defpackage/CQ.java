package defpackage;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class CQ extends FilterOutputStream {
    public static final byte[] g = "Exif\u0000\u0000".getBytes(C5690lQ.d);
    public final C6454pQ a;
    public final byte[] b;
    public final ByteBuffer c;
    public int d;
    public int e;
    public int f;

    public CQ(ByteArrayOutputStream byteArrayOutputStream, C6454pQ c6454pQ) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.b = new byte[1];
        this.c = ByteBuffer.allocate(4);
        this.d = 0;
        this.a = c6454pQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x036d, code lost:
    
        if (r6 <= 0) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x036f, code lost:
    
        ((java.io.FilterOutputStream) r18).out.write(r19, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0374, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(byte[] r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CQ.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte b = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.b;
        bArr[0] = b;
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
