package io.legere.pdfiumandroid;

import android.graphics.RectF;
import com.yandex.varioqub.config.model.ConfigValue;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.util.ConfigKt;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 g2\u00020\u0001:\u0001gB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b \u0010!J8\u0010'\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0082 ¢\u0006\u0004\b'\u0010(J(\u0010)\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b)\u0010*J \u0010,\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b,\u0010!J \u0010.\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b.\u0010/J@\u00105\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0015H\u0082 ¢\u0006\u0004\b5\u00106J0\u0010:\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u0004\u0018\u0001072\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u0004\u0018\u0001072\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\bA\u0010@J\u0015\u0010C\u001a\u00020B2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\bF\u0010GJ-\u0010H\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u0004\u0018\u00010E2\u0006\u0010+\u001a\u00020\u0004¢\u0006\u0004\bL\u0010GJ\u001f\u0010N\u001a\u0004\u0018\u0001072\u0006\u0010M\u001a\u00020E2\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0004¢\u0006\u0004\bP\u0010QJ-\u0010U\u001a\u0004\u0018\u00010T2\u0006\u00108\u001a\u0002072\f\u00109\u001a\b\u0012\u0004\u0012\u00020S0R2\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\rH\u0016¢\u0006\u0004\bW\u0010XR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\\\u001a\u0004\b]\u0010=R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010^\u001a\u0004\b_\u0010`R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010a\u001a\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010f¨\u0006h"}, m22267d2 = {"Lio/legere/pdfiumandroid/PdfTextPage;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/PdfDocument;", "doc", "", "pageIndex", "", "pagePtr", "", "Lio/legere/pdfiumandroid/PdfDocument$PageCount;", "pageMap", "<init>", "(Lio/legere/pdfiumandroid/PdfDocument;IJLjava/util/Map;)V", "LTf1;", "nativeCloseTextPage", "(J)V", "textPagePtr", "nativeTextCountChars", "(J)I", "startIndex", "count", "", "result", "nativeTextGetText", "(JII[S)I", "", "nativeTextGetTextByteArray", "(JII[B)I", "index", "nativeTextGetUnicode", "(JI)I", "", "nativeTextGetCharBox", "(JI)[D", "", "x", "y", "xTolerance", "yTolerance", "nativeTextGetCharIndexAtPos", "(JDDDD)I", "nativeTextCountRects", "(JII)I", "rectIndex", "nativeTextGetRect", "charIndex", "nativeGetFontSize", "(JI)D", "left", "top", "right", "bottom", "arr", "nativeTextGetBoundedText", "(JDDDD[S)I", "", "findWhat", "flags", "nativeFindStart", "(JLjava/lang/String;II)J", "textPageCountChars", "()I", "length", "textPageGetTextLegacy", "(II)Ljava/lang/String;", "textPageGetText", "", "textPageGetUnicode", "(I)C", "Landroid/graphics/RectF;", "textPageGetCharBox", "(I)Landroid/graphics/RectF;", "textPageGetCharIndexAtPos", "(DDDD)I", "textPageCountRects", "(II)I", "textPageGetRect", "rect", "textPageGetBoundedText", "(Landroid/graphics/RectF;I)Ljava/lang/String;", "getFontSize", "(I)D", "", "Lio/legere/pdfiumandroid/FindFlags;", "Lio/legere/pdfiumandroid/FindResult;", "findStart", "(Ljava/lang/String;Ljava/util/Set;I)Lio/legere/pdfiumandroid/FindResult;", "close", "()V", "Lio/legere/pdfiumandroid/PdfDocument;", "getDoc", "()Lio/legere/pdfiumandroid/PdfDocument;", "I", "getPageIndex", "J", "getPagePtr", "()J", "Ljava/util/Map;", "getPageMap", "()Ljava/util/Map;", "", "isClosed", "Z", "Companion", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PdfTextPage implements Closeable {
    private static final String TAG = PdfTextPage.class.getName();
    private final PdfDocument doc;
    private boolean isClosed;
    private final int pageIndex;
    private final Map<Integer, PdfDocument.PageCount> pageMap;
    private final long pagePtr;

    public PdfTextPage(PdfDocument pdfDocument, int i, long j, Map<Integer, PdfDocument.PageCount> map) {
        O90.m5968f(pdfDocument, "doc");
        O90.m5968f(map, "pageMap");
        this.doc = pdfDocument;
        this.pageIndex = i;
        this.pagePtr = j;
        this.pageMap = map;
    }

    private final native void nativeCloseTextPage(long pagePtr);

    private final native long nativeFindStart(long textPagePtr, String findWhat, int flags, int startIndex);

    private final native double nativeGetFontSize(long pagePtr, int charIndex);

    private final native int nativeTextCountChars(long textPagePtr);

    private final native int nativeTextCountRects(long textPagePtr, int startIndex, int count);

    private final native int nativeTextGetBoundedText(long textPagePtr, double left, double top, double right, double bottom, short[] arr);

    private final native double[] nativeTextGetCharBox(long textPagePtr, int index);

    private final native int nativeTextGetCharIndexAtPos(long textPagePtr, double x, double y, double xTolerance, double yTolerance);

    private final native double[] nativeTextGetRect(long textPagePtr, int rectIndex);

    private final native int nativeTextGetText(long textPagePtr, int startIndex, int count, short[] result);

    private final native int nativeTextGetTextByteArray(long textPagePtr, int startIndex, int count, byte[] result);

    private final native int nativeTextGetUnicode(long textPagePtr, int index);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            PdfDocument.PageCount pageCount = this.pageMap.get(Integer.valueOf(this.pageIndex));
            if (pageCount != null) {
                if (pageCount.getCount() > 1) {
                    pageCount.setCount(pageCount.getCount() - 1);
                } else {
                    this.pageMap.remove(Integer.valueOf(this.pageIndex));
                    this.isClosed = true;
                    nativeCloseTextPage(this.pagePtr);
                }
            }
        }
    }

    public final FindResult findStart(String findWhat, Set<? extends FindFlags> flags, int startIndex) {
        FindResult findResult;
        O90.m5968f(findWhat, "findWhat");
        O90.m5968f(flags, "flags");
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return null;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                Iterator<T> it = flags.iterator();
                int value = 0;
                while (it.hasNext()) {
                    value |= ((FindFlags) it.next()).getValue();
                }
                findResult = new FindResult(nativeFindStart(this.pagePtr, findWhat, value, startIndex));
            } catch (Throwable th) {
                throw th;
            }
        }
        return findResult;
    }

    public final PdfDocument getDoc() {
        return this.doc;
    }

    public final double getFontSize(int charIndex) {
        double dNativeGetFontSize;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            dNativeGetFontSize = nativeGetFontSize(this.pagePtr, charIndex);
        }
        return dNativeGetFontSize;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final Map<Integer, PdfDocument.PageCount> getPageMap() {
        return this.pageMap;
    }

    public final long getPagePtr() {
        return this.pagePtr;
    }

    public final int textPageCountChars() {
        int iNativeTextCountChars;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return -1;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iNativeTextCountChars = nativeTextCountChars(this.pagePtr);
        }
        return iNativeTextCountChars;
    }

    public final int textPageCountRects(int startIndex, int count) {
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                return nativeTextCountRects(this.pagePtr, startIndex, count);
            } catch (NullPointerException e) {
                Logger logger = Logger.INSTANCE;
                String str = TAG;
                O90.m5967e(str, "TAG");
                logger.mo21355e(str, e, "mContext may be null");
                return -1;
            } catch (Exception e2) {
                Logger logger2 = Logger.INSTANCE;
                String str2 = TAG;
                O90.m5967e(str2, "TAG");
                logger2.mo21355e(str2, e2, "Exception throw from native");
                return -1;
            }
        }
    }

    public final String textPageGetBoundedText(RectF rect, int length) {
        O90.m5968f(rect, "rect");
        String str = null;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return null;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                try {
                    short[] sArr = new short[length + 1];
                    int iNativeTextGetBoundedText = nativeTextGetBoundedText(this.pagePtr, rect.left, rect.top, rect.right, rect.bottom, sArr) - 1;
                    byte[] bArr = new byte[iNativeTextGetBoundedText * 2];
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    for (int i = 0; i < iNativeTextGetBoundedText; i++) {
                        byteBufferWrap.putShort(sArr[i]);
                    }
                    Charset charset = StandardCharsets.UTF_16LE;
                    O90.m5967e(charset, "UTF_16LE");
                    str = new String(bArr, charset);
                } catch (NullPointerException e) {
                    Logger logger = Logger.INSTANCE;
                    String str2 = TAG;
                    O90.m5967e(str2, "TAG");
                    logger.mo21355e(str2, e, "mContext may be null");
                } catch (Exception e2) {
                    Logger logger2 = Logger.INSTANCE;
                    String str3 = TAG;
                    O90.m5967e(str3, "TAG");
                    logger2.mo21355e(str3, e2, "Exception throw from native");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final RectF textPageGetCharBox(int index) {
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return null;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                try {
                    double[] dArrNativeTextGetCharBox = nativeTextGetCharBox(this.pagePtr, index);
                    RectF rectF = new RectF();
                    rectF.left = (float) dArrNativeTextGetCharBox[0];
                    rectF.right = (float) dArrNativeTextGetCharBox[1];
                    rectF.bottom = (float) dArrNativeTextGetCharBox[2];
                    rectF.top = (float) dArrNativeTextGetCharBox[3];
                    return rectF;
                } catch (NullPointerException e) {
                    Logger logger = Logger.INSTANCE;
                    String str = TAG;
                    O90.m5967e(str, "TAG");
                    logger.mo21355e(str, e, "mContext may be null");
                    return null;
                }
            } catch (Exception e2) {
                Logger logger2 = Logger.INSTANCE;
                String str2 = TAG;
                O90.m5967e(str2, "TAG");
                logger2.mo21355e(str2, e2, "Exception throw from native");
                return null;
            }
        }
    }

    public final int textPageGetCharIndexAtPos(double x, double y, double xTolerance, double yTolerance) {
        int iNativeTextGetCharIndexAtPos;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return -1;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                iNativeTextGetCharIndexAtPos = nativeTextGetCharIndexAtPos(this.pagePtr, x, y, xTolerance, yTolerance);
            } catch (Exception e) {
                Logger logger = Logger.INSTANCE;
                String str = TAG;
                O90.m5967e(str, "TAG");
                logger.mo21355e(str, e, "Exception throw from native");
                return -1;
            }
        }
        return iNativeTextGetCharIndexAtPos;
    }

    public final RectF textPageGetRect(int rectIndex) {
        RectF rectF = null;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return null;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                try {
                    double[] dArrNativeTextGetRect = nativeTextGetRect(this.pagePtr, rectIndex);
                    RectF rectF2 = new RectF();
                    rectF2.left = (float) dArrNativeTextGetRect[0];
                    rectF2.top = (float) dArrNativeTextGetRect[1];
                    rectF2.right = (float) dArrNativeTextGetRect[2];
                    rectF2.bottom = (float) dArrNativeTextGetRect[3];
                    rectF = rectF2;
                } catch (NullPointerException e) {
                    Logger logger = Logger.INSTANCE;
                    String str = TAG;
                    O90.m5967e(str, "TAG");
                    logger.mo21355e(str, e, "mContext may be null");
                }
            } catch (Exception e2) {
                Logger logger2 = Logger.INSTANCE;
                String str2 = TAG;
                O90.m5967e(str2, "TAG");
                logger2.mo21355e(str2, e2, "Exception throw from native");
            }
        }
        return rectF;
    }

    public final String textPageGetText(int startIndex, int length) {
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return null;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                try {
                    byte[] bArr = new byte[length * 2];
                    if (nativeTextGetTextByteArray(this.pagePtr, startIndex, length, bArr) <= 0) {
                        return "";
                    }
                    Charset charset = StandardCharsets.UTF_16LE;
                    O90.m5967e(charset, "UTF_16LE");
                    return new String(bArr, charset);
                } catch (NullPointerException e) {
                    Logger logger = Logger.INSTANCE;
                    String str = TAG;
                    O90.m5967e(str, "TAG");
                    logger.mo21355e(str, e, "mContext may be null");
                    return null;
                }
            } catch (Exception e2) {
                Logger logger2 = Logger.INSTANCE;
                String str2 = TAG;
                O90.m5967e(str2, "TAG");
                logger2.mo21355e(str2, e2, "Exception throw from native");
                return null;
            }
        }
    }

    public final String textPageGetTextLegacy(int startIndex, int length) {
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return null;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                try {
                    short[] sArr = new short[length + 1];
                    int iNativeTextGetText = nativeTextGetText(this.pagePtr, startIndex, length, sArr);
                    if (iNativeTextGetText <= 0) {
                        return "";
                    }
                    int i = iNativeTextGetText - 1;
                    byte[] bArr = new byte[i * 2];
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    for (int i2 = 0; i2 < i; i2++) {
                        byteBufferWrap.putShort(sArr[i2]);
                    }
                    Charset charset = StandardCharsets.UTF_16LE;
                    O90.m5967e(charset, "UTF_16LE");
                    return new String(bArr, charset);
                } catch (NullPointerException e) {
                    Logger logger = Logger.INSTANCE;
                    String str = TAG;
                    O90.m5967e(str, "TAG");
                    logger.mo21355e(str, e, "mContext may be null");
                    return null;
                }
            } catch (Exception e2) {
                Logger logger2 = Logger.INSTANCE;
                String str2 = TAG;
                O90.m5967e(str2, "TAG");
                logger2.mo21355e(str2, e2, "Exception throw from native");
                return null;
            }
        }
    }

    public final char textPageGetUnicode(int index) {
        char cNativeTextGetUnicode;
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            cNativeTextGetUnicode = (char) nativeTextGetUnicode(this.pagePtr, index);
        }
        return cNativeTextGetUnicode;
    }
}
