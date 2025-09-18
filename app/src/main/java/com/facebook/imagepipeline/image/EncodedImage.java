package com.facebook.imagepipeline.image;

import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import p000.AbstractC0646KF;
import p000.AbstractC6697qi;
import p000.AbstractC7292zt;
import p000.C0739Lk;
import p000.C10976s01;
import p000.C11339uq0;
import p000.C9723iC0;
import p000.D60;
import p000.InterfaceC10608p61;
import p000.V60;

/* loaded from: classes.dex */
public class EncodedImage implements Closeable {
    public static final int DEFAULT_SAMPLE_SIZE = 1;
    public static final int UNKNOWN_HEIGHT = -1;
    public static final int UNKNOWN_ROTATION_ANGLE = -1;
    public static final int UNKNOWN_STREAM_SIZE = -1;
    public static final int UNKNOWN_WIDTH = -1;
    private static boolean sUseCachedMetadata;
    private C0739Lk mBytesRange;
    private ColorSpace mColorSpace;
    private int mExifOrientation;
    private boolean mHasParsedMetadata;
    private int mHeight;
    private D60 mImageFormat;
    private final InterfaceC10608p61 mInputStreamSupplier;
    private final AbstractC7292zt mPooledByteBufferRef;
    private int mRotationAngle;
    private int mSampleSize;
    private String mSource;
    private int mStreamSize;
    private int mWidth;

    public EncodedImage(AbstractC7292zt abstractC7292zt) {
        this.mImageFormat = D60.f1843c;
        this.mRotationAngle = -1;
        this.mExifOrientation = 0;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mSampleSize = 1;
        this.mStreamSize = -1;
        if (!AbstractC7292zt.m26565D(abstractC7292zt)) {
            throw new IllegalArgumentException();
        }
        this.mPooledByteBufferRef = abstractC7292zt.clone();
        this.mInputStreamSupplier = null;
    }

    public static EncodedImage cloneOrNull(EncodedImage encodedImage) {
        if (encodedImage != null) {
            return encodedImage.cloneOrNull();
        }
        return null;
    }

    public static void closeSafely(EncodedImage encodedImage) {
        if (encodedImage != null) {
            encodedImage.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00e5 A[EDGE_INSN: B:265:0x00e5->B:208:0x00e5 BREAK  A[LOOP:2: B:210:0x00ed->B:217:0x0100], EDGE_INSN: B:266:0x00e5->B:208:0x00e5 BREAK  A[LOOP:2: B:210:0x00ed->B:217:0x0100]] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00e7 A[Catch: IOException -> 0x0120, TryCatch #1 {IOException -> 0x0120, blocks: (B:163:0x005b, B:167:0x0067, B:170:0x0070, B:172:0x0079, B:202:0x00d6, B:206:0x00dc, B:221:0x010e, B:224:0x0115, B:227:0x011c, B:209:0x00e7, B:210:0x00ed, B:214:0x00f5, B:217:0x0100, B:189:0x00ad, B:193:0x00bd, B:197:0x00c6, B:199:0x00ce, B:201:0x00d2, B:183:0x0098), top: B:250:0x005b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void internalParseMetaData() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.image.EncodedImage.internalParseMetaData():void");
    }

    public static boolean isMetaDataAvailable(EncodedImage encodedImage) {
        return encodedImage.mRotationAngle >= 0 && encodedImage.mWidth >= 0 && encodedImage.mHeight >= 0;
    }

    private void parseMetadataIfNeeded() throws Throwable {
        if (this.mWidth < 0 || this.mHeight < 0) {
            parseMetaData();
        }
    }

    private V60 readImageMetaData() throws Throwable {
        InputStream inputStream;
        try {
            inputStream = getInputStream();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            V60 v60M24048a = AbstractC6697qi.m24048a(inputStream);
            this.mColorSpace = v60M24048a.f12354a;
            Pair pair = v60M24048a.f12355b;
            if (pair != null) {
                this.mWidth = ((Integer) pair.f36702a).intValue();
                this.mHeight = ((Integer) pair.f36703b).intValue();
            }
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            return v60M24048a;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00db  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x00d6 -> B:131:0x00d9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private kotlin.Pair<java.lang.Integer, java.lang.Integer> readWebPImageSize() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.image.EncodedImage.readWebPImageSize():kotlin.Pair");
    }

    public static void setUseCachedMetadata(boolean z) {
        sUseCachedMetadata = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC7292zt.m26569p(this.mPooledByteBufferRef);
    }

    public void copyMetaDataFrom(EncodedImage encodedImage) {
        this.mImageFormat = encodedImage.getImageFormat();
        this.mWidth = encodedImage.getWidth();
        this.mHeight = encodedImage.getHeight();
        this.mRotationAngle = encodedImage.getRotationAngle();
        this.mExifOrientation = encodedImage.getExifOrientation();
        this.mSampleSize = encodedImage.getSampleSize();
        this.mStreamSize = encodedImage.getSize();
        this.mBytesRange = encodedImage.getBytesRange();
        this.mColorSpace = encodedImage.getColorSpace();
        this.mHasParsedMetadata = encodedImage.hasParsedMetaData();
    }

    public AbstractC7292zt getByteBufferRef() {
        return AbstractC7292zt.m26568o(this.mPooledByteBufferRef);
    }

    public C0739Lk getBytesRange() {
        return this.mBytesRange;
    }

    public ColorSpace getColorSpace() throws Throwable {
        parseMetadataIfNeeded();
        return this.mColorSpace;
    }

    public int getExifOrientation() throws Throwable {
        parseMetadataIfNeeded();
        return this.mExifOrientation;
    }

    public String getFirstBytesAsHexString(int i) {
        AbstractC7292zt byteBufferRef = getByteBufferRef();
        if (byteBufferRef == null) {
            return "";
        }
        int iMin = Math.min(getSize(), i);
        byte[] bArr = new byte[iMin];
        try {
            ((C11339uq0) byteBufferRef.m26572w()).m25252o(0, bArr, 0, iMin);
            byteBufferRef.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i2 = 0; i2 < iMin; i2++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i2])));
            }
            return sb.toString();
        } catch (Throwable th) {
            byteBufferRef.close();
            throw th;
        }
    }

    public int getHeight() throws Throwable {
        parseMetadataIfNeeded();
        return this.mHeight;
    }

    public D60 getImageFormat() throws Throwable {
        parseMetadataIfNeeded();
        return this.mImageFormat;
    }

    public InputStream getInputStream() {
        InterfaceC10608p61 interfaceC10608p61 = this.mInputStreamSupplier;
        if (interfaceC10608p61 != null) {
            return (InputStream) interfaceC10608p61.get();
        }
        AbstractC7292zt abstractC7292ztM26568o = AbstractC7292zt.m26568o(this.mPooledByteBufferRef);
        if (abstractC7292ztM26568o == null) {
            return null;
        }
        try {
            return new C9723iC0((C11339uq0) abstractC7292ztM26568o.m26572w());
        } finally {
            AbstractC7292zt.m26569p(abstractC7292ztM26568o);
        }
    }

    public InputStream getInputStreamOrThrow() {
        InputStream inputStream = getInputStream();
        inputStream.getClass();
        return inputStream;
    }

    public int getRotationAngle() throws Throwable {
        parseMetadataIfNeeded();
        return this.mRotationAngle;
    }

    public int getSampleSize() {
        return this.mSampleSize;
    }

    public int getSize() {
        AbstractC7292zt abstractC7292zt = this.mPooledByteBufferRef;
        if (abstractC7292zt == null) {
            return this.mStreamSize;
        }
        abstractC7292zt.m26572w();
        return ((C11339uq0) this.mPooledByteBufferRef.m26572w()).m25253p();
    }

    public String getSource() {
        return this.mSource;
    }

    public synchronized C10976s01 getUnderlyingReferenceTestOnly() {
        AbstractC7292zt abstractC7292zt;
        abstractC7292zt = this.mPooledByteBufferRef;
        return abstractC7292zt != null ? abstractC7292zt.m26573x() : null;
    }

    public int getWidth() throws Throwable {
        parseMetadataIfNeeded();
        return this.mWidth;
    }

    public boolean hasParsedMetaData() {
        return this.mHasParsedMetadata;
    }

    public boolean isCompleteAt(int i) {
        D60 d60 = this.mImageFormat;
        if ((d60 != AbstractC0646KF.f5957a && d60 != AbstractC0646KF.f5968l) || this.mInputStreamSupplier != null) {
            return true;
        }
        this.mPooledByteBufferRef.getClass();
        C11339uq0 c11339uq0 = (C11339uq0) this.mPooledByteBufferRef.m26572w();
        return c11339uq0.m25251n(i + (-2)) == -1 && c11339uq0.m25251n(i - 1) == -39;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isValid() {
        /*
            r1 = this;
            monitor-enter(r1)
            zt r0 = r1.mPooledByteBufferRef     // Catch: java.lang.Throwable -> L10
            boolean r0 = p000.AbstractC7292zt.m26565D(r0)     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            p61 r0 = r1.mInputStreamSupplier     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.image.EncodedImage.isValid():boolean");
    }

    public void parseMetaData() throws Throwable {
        if (!sUseCachedMetadata) {
            internalParseMetaData();
        } else {
            if (this.mHasParsedMetadata) {
                return;
            }
            internalParseMetaData();
            this.mHasParsedMetadata = true;
        }
    }

    public void setBytesRange(C0739Lk c0739Lk) {
        this.mBytesRange = c0739Lk;
    }

    public void setExifOrientation(int i) {
        this.mExifOrientation = i;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setImageFormat(D60 d60) {
        this.mImageFormat = d60;
    }

    public void setRotationAngle(int i) {
        this.mRotationAngle = i;
    }

    public void setSampleSize(int i) {
        this.mSampleSize = i;
    }

    public void setSource(String str) {
        this.mSource = str;
    }

    public void setStreamSize(int i) {
        this.mStreamSize = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    public static boolean isValid(EncodedImage encodedImage) {
        return encodedImage != null && encodedImage.isValid();
    }

    public EncodedImage cloneOrNull() {
        EncodedImage encodedImage;
        InterfaceC10608p61 interfaceC10608p61 = this.mInputStreamSupplier;
        if (interfaceC10608p61 != null) {
            encodedImage = new EncodedImage(interfaceC10608p61, this.mStreamSize);
        } else {
            AbstractC7292zt abstractC7292ztM26568o = AbstractC7292zt.m26568o(this.mPooledByteBufferRef);
            if (abstractC7292ztM26568o == null) {
                encodedImage = null;
            } else {
                try {
                    encodedImage = new EncodedImage(abstractC7292ztM26568o);
                } finally {
                    AbstractC7292zt.m26569p(abstractC7292ztM26568o);
                }
            }
        }
        if (encodedImage != null) {
            encodedImage.copyMetaDataFrom(this);
        }
        return encodedImage;
    }

    public EncodedImage(InterfaceC10608p61 interfaceC10608p61) {
        this.mImageFormat = D60.f1843c;
        this.mRotationAngle = -1;
        this.mExifOrientation = 0;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mSampleSize = 1;
        this.mStreamSize = -1;
        interfaceC10608p61.getClass();
        this.mPooledByteBufferRef = null;
        this.mInputStreamSupplier = interfaceC10608p61;
    }

    public EncodedImage(InterfaceC10608p61 interfaceC10608p61, int i) {
        this(interfaceC10608p61);
        this.mStreamSize = i;
    }
}
