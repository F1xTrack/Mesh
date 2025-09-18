package p000;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* renamed from: CQ */
/* loaded from: classes.dex */
public final class C0153CQ extends FilterOutputStream {

    /* renamed from: g */
    public static final byte[] f1356g = "Exif\u0000\u0000".getBytes(C6362lQ.f37044d);

    /* renamed from: a */
    public final C6616pQ f1357a;

    /* renamed from: b */
    public final byte[] f1358b;

    /* renamed from: c */
    public final ByteBuffer f1359c;

    /* renamed from: d */
    public int f1360d;

    /* renamed from: e */
    public int f1361e;

    /* renamed from: f */
    public int f1362f;

    public C0153CQ(ByteArrayOutputStream byteArrayOutputStream, C6616pQ c6616pQ) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.f1358b = new byte[1];
        this.f1359c = ByteBuffer.allocate(4);
        this.f1360d = 0;
        this.f1357a = c6616pQ;
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0153CQ.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte b = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f1358b;
        bArr[0] = b;
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
