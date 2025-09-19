package io.legere.pdfiumandroid;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Surface;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.util.ConfigKt;
import io.legere.pdfiumandroid.util.Size;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.C0779MN;
import p000.O90;

@Metadata(m22266d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b!\u0018\u0000 \u008e\u00012\u00020\u0001:\u0002\u008e\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0015J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001dJ\r\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010\u001dJ\u0015\u0010$\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%JA\u0010/\u001a\u00020.2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100JK\u00104\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u00103\u001a\u00020,¢\u0006\u0004\b4\u00105J;\u00104\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u00103\u001a\u00020,¢\u0006\u0004\b4\u00108J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020:09¢\u0006\u0004\b;\u0010<JE\u0010D\u001a\u00020C2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@¢\u0006\u0004\bD\u0010EJE\u0010I\u001a\u00020H2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0004¢\u0006\u0004\bI\u0010JJ=\u0010M\u001a\u00020L2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u001b¢\u0006\u0004\bM\u0010NJ=\u0010O\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010K\u001a\u00020L¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020.H\u0016¢\u0006\u0004\bQ\u0010RJ\u0018\u0010S\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\bS\u0010TJ\u0018\u0010W\u001a\u00020.2\u0006\u0010V\u001a\u00020UH\u0082 ¢\u0006\u0004\bW\u0010XJ \u0010Z\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\bZ\u0010[J \u0010\\\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\\\u0010[J\u0018\u0010]\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b]\u0010^J\u0018\u0010_\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b_\u0010^J\u0018\u0010`\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b`\u0010^J\u0018\u0010b\u001a\u00020a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\bb\u0010cJ\u0018\u0010d\u001a\u00020a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\bd\u0010cJ\u0018\u0010e\u001a\u00020a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\be\u0010cJ\u0018\u0010f\u001a\u00020a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\bf\u0010cJ\u0018\u0010g\u001a\u00020a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\bg\u0010cJ\u0018\u0010h\u001a\u00020a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\bh\u0010cJ\u0018\u0010i\u001a\u00020a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\bi\u0010cJ\"\u0010l\u001a\u0004\u0018\u00010\u00042\u0006\u0010j\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\bl\u0010mJ\"\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\bo\u0010pJ\"\u0010q\u001a\u0004\u0018\u00010\u001b2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\bq\u0010rJJ\u0010u\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010s\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0082 ¢\u0006\u0004\bu\u0010vJZ\u0010w\u001a\u00020.2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010s\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u00103\u001a\u00020,H\u0082 ¢\u0006\u0004\bw\u0010xJF\u0010y\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00106\u001a\u00020a2\u0006\u00107\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u00103\u001a\u00020,H\u0082 ¢\u0006\u0004\by\u0010zJ(\u0010{\u001a\u00020#2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b{\u0010|J\u0018\u0010}\u001a\u00020U2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b}\u0010~JQ\u0010\u007f\u001a\u00020C2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@H\u0082 ¢\u0006\u0005\b\u007f\u0010\u0080\u0001JS\u0010\u0081\u0001\u001a\u00020H2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0004H\u0082 ¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\b\u0007\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u008b\u0001R\u0019\u0010\u008c\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u008f\u0001"}, m22267d2 = {"Lio/legere/pdfiumandroid/PdfPage;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/PdfDocument;", "doc", "", "pageIndex", "", "pagePtr", "", "Lio/legere/pdfiumandroid/PdfDocument$PageCount;", "pageMap", "<init>", "(Lio/legere/pdfiumandroid/PdfDocument;IJLjava/util/Map;)V", "Lio/legere/pdfiumandroid/PdfTextPage;", "openTextPage", "()Lio/legere/pdfiumandroid/PdfTextPage;", "screenDpi", "getPageWidth", "(I)I", "getPageHeight", "getPageWidthPoint", "()I", "getPageHeightPoint", "Landroid/graphics/Matrix;", "getPageMatrix", "()Landroid/graphics/Matrix;", "getPageRotation", "Landroid/graphics/RectF;", "getPageCropBox", "()Landroid/graphics/RectF;", "getPageMediaBox", "getPageBleedBox", "getPageTrimBox", "getPageArtBox", "getPageBoundingBox", "Lio/legere/pdfiumandroid/util/Size;", "getPageSize", "(I)Lio/legere/pdfiumandroid/util/Size;", "Landroid/view/Surface;", "surface", "startX", "startY", "drawSizeX", "drawSizeY", "", "renderAnnot", "LTf1;", "renderPage", "(Landroid/view/Surface;IIIIZ)V", "Landroid/graphics/Bitmap;", "bitmap", "textMask", "renderPageBitmap", "(Landroid/graphics/Bitmap;IIIIZZ)V", "matrix", "clipRect", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/RectF;ZZ)V", "", "Lio/legere/pdfiumandroid/PdfDocument$Link;", "getPageLinks", "()Ljava/util/List;", "sizeX", "sizeY", "rotate", "", "pageX", "pageY", "Landroid/graphics/Point;", "mapPageCoordsToDevice", "(IIIIIDD)Landroid/graphics/Point;", "deviceX", "deviceY", "Landroid/graphics/PointF;", "mapDeviceCoordsToPage", "(IIIIIII)Landroid/graphics/PointF;", "coords", "Landroid/graphics/Rect;", "mapRectToDevice", "(IIIIILandroid/graphics/RectF;)Landroid/graphics/Rect;", "mapRectToPage", "(IIIIILandroid/graphics/Rect;)Landroid/graphics/RectF;", "close", "()V", "nativeClosePage", "(J)V", "", "pagesPtr", "nativeClosePages", "([J)V", "dpi", "nativeGetPageWidthPixel", "(JI)I", "nativeGetPageHeightPixel", "nativeGetPageWidthPoint", "(J)I", "nativeGetPageHeightPoint", "nativeGetPageRotation", "", "nativeGetPageMediaBox", "(J)[F", "nativeGetPageCropBox", "nativeGetPageBleedBox", "nativeGetPageTrimBox", "nativeGetPageArtBox", "nativeGetPageBoundingBox", "nativeGetPageMatrix", "docPtr", "linkPtr", "nativeGetDestPageIndex", "(JJ)Ljava/lang/Integer;", "", "nativeGetLinkURI", "(JJ)Ljava/lang/String;", "nativeGetLinkRect", "(JJ)Landroid/graphics/RectF;", "drawSizeHor", "drawSizeVer", "nativeRenderPage", "(JLandroid/view/Surface;IIIIZ)V", "nativeRenderPageBitmap", "(JJLandroid/graphics/Bitmap;IIIIZZ)V", "nativeRenderPageBitmapWithMatrix", "(JLandroid/graphics/Bitmap;[FLandroid/graphics/RectF;ZZ)V", "nativeGetPageSizeByIndex", "(JII)Lio/legere/pdfiumandroid/util/Size;", "nativeGetPageLinks", "(J)[J", "nativePageCoordsToDevice", "(JIIIIIDD)Landroid/graphics/Point;", "nativeDeviceCoordsToPage", "(JIIIIIII)Landroid/graphics/PointF;", "Lio/legere/pdfiumandroid/PdfDocument;", "getDoc", "()Lio/legere/pdfiumandroid/PdfDocument;", "I", "getPageIndex", "J", "getPagePtr", "()J", "Ljava/util/Map;", "isClosed", "Z", "Companion", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PdfPage implements Closeable {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    private static final String TAG = "PdfPage";
    public static final int TOP = 1;
    private final PdfDocument doc;
    private boolean isClosed;
    private final int pageIndex;
    private final Map<Integer, PdfDocument.PageCount> pageMap;
    private final long pagePtr;

    public PdfPage(PdfDocument pdfDocument, int i, long j, Map<Integer, PdfDocument.PageCount> map) {
        O90.m5968f(pdfDocument, "doc");
        O90.m5968f(map, "pageMap");
        this.doc = pdfDocument;
        this.pageIndex = i;
        this.pagePtr = j;
        this.pageMap = map;
    }

    private final native void nativeClosePage(long pagePtr);

    private final native void nativeClosePages(long[] pagesPtr);

    private final native PointF nativeDeviceCoordsToPage(long pagePtr, int startX, int startY, int sizeX, int sizeY, int rotate, int deviceX, int deviceY);

    private final native Integer nativeGetDestPageIndex(long docPtr, long linkPtr);

    private final native RectF nativeGetLinkRect(long docPtr, long linkPtr);

    private final native String nativeGetLinkURI(long docPtr, long linkPtr);

    private final native float[] nativeGetPageArtBox(long pagePtr);

    private final native float[] nativeGetPageBleedBox(long pagePtr);

    private final native float[] nativeGetPageBoundingBox(long pagePtr);

    private final native float[] nativeGetPageCropBox(long pagePtr);

    private final native int nativeGetPageHeightPixel(long pagePtr, int dpi);

    private final native int nativeGetPageHeightPoint(long pagePtr);

    private final native long[] nativeGetPageLinks(long pagePtr);

    private final native float[] nativeGetPageMatrix(long pagePtr);

    private final native float[] nativeGetPageMediaBox(long pagePtr);

    private final native int nativeGetPageRotation(long pagePtr);

    private final native Size nativeGetPageSizeByIndex(long docPtr, int pageIndex, int dpi);

    private final native float[] nativeGetPageTrimBox(long pagePtr);

    private final native int nativeGetPageWidthPixel(long pagePtr, int dpi);

    private final native int nativeGetPageWidthPoint(long pagePtr);

    private final native Point nativePageCoordsToDevice(long pagePtr, int startX, int startY, int sizeX, int sizeY, int rotate, double pageX, double pageY);

    private final native void nativeRenderPage(long pagePtr, Surface surface, int startX, int startY, int drawSizeHor, int drawSizeVer, boolean renderAnnot);

    private final native void nativeRenderPageBitmap(long docPtr, long pagePtr, Bitmap bitmap, int startX, int startY, int drawSizeHor, int drawSizeVer, boolean renderAnnot, boolean textMask);

    public final native void nativeRenderPageBitmapWithMatrix(long pagePtr, Bitmap bitmap, float[] matrix, RectF clipRect, boolean renderAnnot, boolean textMask);

    public static /* synthetic */ void renderPage$default(PdfPage pdfPage, Surface surface, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 32) != 0) {
            z = false;
        }
        pdfPage.renderPage(surface, i, i2, i3, i4, z);
    }

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
                    nativeClosePage(this.pagePtr);
                }
            }
        }
    }

    public final PdfDocument getDoc() {
        return this.doc;
    }

    public final RectF getPageArtBox() {
        RectF rectF;
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            float[] fArrNativeGetPageArtBox = nativeGetPageArtBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageArtBox[0];
            rectF.top = fArrNativeGetPageArtBox[1];
            rectF.right = fArrNativeGetPageArtBox[2];
            rectF.bottom = fArrNativeGetPageArtBox[3];
        }
        return rectF;
    }

    public final RectF getPageBleedBox() {
        RectF rectF;
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            float[] fArrNativeGetPageBleedBox = nativeGetPageBleedBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageBleedBox[0];
            rectF.top = fArrNativeGetPageBleedBox[1];
            rectF.right = fArrNativeGetPageBleedBox[2];
            rectF.bottom = fArrNativeGetPageBleedBox[3];
        }
        return rectF;
    }

    public final RectF getPageBoundingBox() {
        RectF rectF;
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            float[] fArrNativeGetPageBoundingBox = nativeGetPageBoundingBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageBoundingBox[0];
            rectF.top = fArrNativeGetPageBoundingBox[1];
            rectF.right = fArrNativeGetPageBoundingBox[2];
            rectF.bottom = fArrNativeGetPageBoundingBox[3];
        }
        return rectF;
    }

    public final RectF getPageCropBox() {
        RectF rectF;
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            float[] fArrNativeGetPageCropBox = nativeGetPageCropBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageCropBox[0];
            rectF.top = fArrNativeGetPageCropBox[1];
            rectF.right = fArrNativeGetPageCropBox[2];
            rectF.bottom = fArrNativeGetPageCropBox[3];
        }
        return rectF;
    }

    public final int getPageHeight(int screenDpi) {
        int iNativeGetPageHeightPixel;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return -1;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iNativeGetPageHeightPixel = nativeGetPageHeightPixel(this.pagePtr, screenDpi);
        }
        return iNativeGetPageHeightPixel;
    }

    public final int getPageHeightPoint() {
        int iNativeGetPageHeightPoint;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return -1;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iNativeGetPageHeightPoint = nativeGetPageHeightPoint(this.pagePtr);
        }
        return iNativeGetPageHeightPoint;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final List<PdfDocument.Link> getPageLinks() {
        ArrayList arrayList;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return C0779MN.f7117a;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            arrayList = new ArrayList();
            for (long j : nativeGetPageLinks(this.pagePtr)) {
                Integer numNativeGetDestPageIndex = nativeGetDestPageIndex(this.doc.getMNativeDocPtr(), j);
                String strNativeGetLinkURI = nativeGetLinkURI(this.doc.getMNativeDocPtr(), j);
                RectF rectFNativeGetLinkRect = nativeGetLinkRect(this.doc.getMNativeDocPtr(), j);
                if (rectFNativeGetLinkRect != null && (numNativeGetDestPageIndex != null || strNativeGetLinkURI != null)) {
                    arrayList.add(new PdfDocument.Link(rectFNativeGetLinkRect, numNativeGetDestPageIndex, strNativeGetLinkURI));
                }
            }
        }
        return arrayList;
    }

    public final Matrix getPageMatrix() {
        Matrix matrix;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return null;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            float[] fArrNativeGetPageMatrix = nativeGetPageMatrix(this.pagePtr);
            Logger logger = Logger.INSTANCE;
            logger.mo21354d(TAG, "pageMatrix[0] = " + fArrNativeGetPageMatrix[0]);
            logger.mo21354d(TAG, "pageMatrix[1] = " + fArrNativeGetPageMatrix[1]);
            logger.mo21354d(TAG, "pageMatrix[2] = " + fArrNativeGetPageMatrix[2]);
            logger.mo21354d(TAG, "pageMatrix[3] = " + fArrNativeGetPageMatrix[3]);
            logger.mo21354d(TAG, "pageMatrix[4] = " + fArrNativeGetPageMatrix[4]);
            logger.mo21354d(TAG, "pageMatrix[5] = " + fArrNativeGetPageMatrix[5]);
            float[] fArr = {fArrNativeGetPageMatrix[0], fArrNativeGetPageMatrix[1], fArrNativeGetPageMatrix[4], fArrNativeGetPageMatrix[2], fArrNativeGetPageMatrix[3], fArrNativeGetPageMatrix[5], 0.0f, 0.0f, 1.0f};
            matrix = new Matrix();
            matrix.setValues(fArr);
        }
        return matrix;
    }

    public final RectF getPageMediaBox() {
        RectF rectF;
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            float[] fArrNativeGetPageMediaBox = nativeGetPageMediaBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageMediaBox[0];
            rectF.top = fArrNativeGetPageMediaBox[1];
            rectF.right = fArrNativeGetPageMediaBox[2];
            rectF.bottom = fArrNativeGetPageMediaBox[3];
        }
        return rectF;
    }

    public final long getPagePtr() {
        return this.pagePtr;
    }

    public final int getPageRotation() {
        int iNativeGetPageRotation;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return -1;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iNativeGetPageRotation = nativeGetPageRotation(this.pagePtr);
        }
        return iNativeGetPageRotation;
    }

    public final Size getPageSize(int screenDpi) {
        Size sizeNativeGetPageSizeByIndex;
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            sizeNativeGetPageSizeByIndex = nativeGetPageSizeByIndex(this.doc.getMNativeDocPtr(), this.pageIndex, screenDpi);
        }
        return sizeNativeGetPageSizeByIndex;
    }

    public final RectF getPageTrimBox() {
        RectF rectF;
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            float[] fArrNativeGetPageTrimBox = nativeGetPageTrimBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageTrimBox[0];
            rectF.top = fArrNativeGetPageTrimBox[1];
            rectF.right = fArrNativeGetPageTrimBox[2];
            rectF.bottom = fArrNativeGetPageTrimBox[3];
        }
        return rectF;
    }

    public final int getPageWidth(int screenDpi) {
        int iNativeGetPageWidthPixel;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return -1;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iNativeGetPageWidthPixel = nativeGetPageWidthPixel(this.pagePtr, screenDpi);
        }
        return iNativeGetPageWidthPixel;
    }

    public final int getPageWidthPoint() {
        int iNativeGetPageWidthPoint;
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return -1;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iNativeGetPageWidthPoint = nativeGetPageWidthPoint(this.pagePtr);
        }
        return iNativeGetPageWidthPoint;
    }

    public final PointF mapDeviceCoordsToPage(int startX, int startY, int sizeX, int sizeY, int rotate, int deviceX, int deviceY) {
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        return nativeDeviceCoordsToPage(this.pagePtr, startX, startY, sizeX, sizeY, rotate, deviceX, deviceY);
    }

    public final Point mapPageCoordsToDevice(int startX, int startY, int sizeX, int sizeY, int rotate, double pageX, double pageY) {
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        return nativePageCoordsToDevice(this.pagePtr, startX, startY, sizeX, sizeY, rotate, pageX, pageY);
    }

    public final Rect mapRectToDevice(int startX, int startY, int sizeX, int sizeY, int rotate, RectF coords) {
        O90.m5968f(coords, "coords");
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        Point pointMapPageCoordsToDevice = mapPageCoordsToDevice(startX, startY, sizeX, sizeY, rotate, coords.left, coords.top);
        Point pointMapPageCoordsToDevice2 = mapPageCoordsToDevice(startX, startY, sizeX, sizeY, rotate, coords.right, coords.bottom);
        return new Rect(pointMapPageCoordsToDevice.x, pointMapPageCoordsToDevice.y, pointMapPageCoordsToDevice2.x, pointMapPageCoordsToDevice2.y);
    }

    public final RectF mapRectToPage(int startX, int startY, int sizeX, int sizeY, int rotate, Rect coords) {
        O90.m5968f(coords, "coords");
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        PointF pointFMapDeviceCoordsToPage = mapDeviceCoordsToPage(startX, startY, sizeX, sizeY, rotate, coords.left, coords.top);
        PointF pointFMapDeviceCoordsToPage2 = mapDeviceCoordsToPage(startX, startY, sizeX, sizeY, rotate, coords.right, coords.bottom);
        return new RectF(pointFMapDeviceCoordsToPage.x, pointFMapDeviceCoordsToPage.y, pointFMapDeviceCoordsToPage2.x, pointFMapDeviceCoordsToPage2.y);
    }

    public final PdfTextPage openTextPage() {
        return this.doc.openTextPage(this);
    }

    public final void renderPage(Surface surface, int startX, int startY, int drawSizeX, int drawSizeY, boolean renderAnnot) {
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                nativeRenderPage(this.pagePtr, surface, startX, startY, drawSizeX, drawSizeY, renderAnnot);
            } catch (NullPointerException e) {
                Logger.INSTANCE.mo21355e(TAG, e, "mContext may be null");
            } catch (Exception e2) {
                Logger.INSTANCE.mo21355e(TAG, e2, "Exception throw from native");
            }
        }
    }

    public final void renderPageBitmap(Bitmap bitmap, int startX, int startY, int drawSizeX, int drawSizeY, boolean renderAnnot, boolean textMask) {
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return;
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            nativeRenderPageBitmap(this.doc.getMNativeDocPtr(), this.pagePtr, bitmap, startX, startY, drawSizeX, drawSizeY, renderAnnot, textMask);
        }
    }

    public final void renderPageBitmap(Bitmap bitmap, Matrix matrix, RectF clipRect, boolean renderAnnot, boolean textMask) {
        O90.m5968f(matrix, "matrix");
        O90.m5968f(clipRect, "clipRect");
        if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
            return;
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            nativeRenderPageBitmapWithMatrix(this.pagePtr, bitmap, new float[]{fArr[0], fArr[4], fArr[2], fArr[5]}, clipRect, renderAnnot, textMask);
        }
    }
}
