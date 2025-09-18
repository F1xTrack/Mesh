package io.legere.pdfiumandroid;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.view.Surface;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.util.Config;
import io.legere.pdfiumandroid.util.ConfigKt;
import io.legere.pdfiumandroid.util.InitLock;
import io.legere.pdfiumandroid.util.Size;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC7167xu;
import p000.AbstractC8729aT1;
import p000.C7492Dl0;
import p000.O90;
import p000.RunnableC0004A3;

@Metadata(m22266d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 v2\u00020\u0001:\u0001vB\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000b\u0010\u0013J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b#\u0010\"J\u001f\u0010%\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b)\u0010(J\u001f\u0010*\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b*\u0010+J1\u0010.\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001eH\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b3\u0010+J\u001f\u00104\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b4\u0010+J]\u0010>\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001e2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;H\u0007¢\u0006\u0004\b>\u0010?J)\u0010A\u001a\u0004\u0018\u00010$2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\u001eH\u0007¢\u0006\u0004\bA\u0010BJ1\u0010E\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020\u001eH\u0007¢\u0006\u0004\bE\u0010FJO\u0010L\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020JH\u0007¢\u0006\u0004\bL\u0010MJ/\u0010O\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010N\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001eH\u0007¢\u0006\u0004\bO\u0010PJ-\u0010#\u001a\b\u0012\u0004\u0012\u00020 0S2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020\u001eH\u0007¢\u0006\u0004\b#\u0010TJ\u001f\u0010U\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u001eH\u0007¢\u0006\u0004\bU\u0010+J\u001f\u0010V\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u001eH\u0007¢\u0006\u0004\bV\u0010+J\u001f\u0010X\u001a\u00020W2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u001eH\u0007¢\u0006\u0004\bX\u0010YJS\u0010\\\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\n2\b\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001e2\b\b\u0002\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b\\\u0010]JS\u0010>\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001e2\b\b\u0002\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b>\u0010^J%\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b`\u0010aJW\u0010f\u001a\u00020e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020bH\u0007¢\u0006\u0004\bf\u0010gJO\u0010h\u001a\u00020J2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020$H\u0007¢\u0006\u0004\bh\u0010iJ\"\u0010j\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082 ¢\u0006\u0004\bj\u0010kJ$\u0010l\u001a\u00020 2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082 ¢\u0006\u0004\bl\u0010mJ\u001a\u0010o\u001a\u0004\u0018\u00010$2\u0006\u0010n\u001a\u00020 H\u0082 ¢\u0006\u0004\bo\u0010pR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010q\u001a\u0004\br\u0010sR\u0014\u0010t\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006w"}, m22267d2 = {"Lio/legere/pdfiumandroid/PdfiumCore;", "", "Landroid/content/Context;", "context", "Lio/legere/pdfiumandroid/util/Config;", "config", "<init>", "(Landroid/content/Context;Lio/legere/pdfiumandroid/util/Config;)V", "Landroid/os/ParcelFileDescriptor;", "fd", "Lio/legere/pdfiumandroid/PdfDocument;", "newDocument", "(Landroid/os/ParcelFileDescriptor;)Lio/legere/pdfiumandroid/PdfDocument;", "parcelFileDescriptor", "", "password", "(Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)Lio/legere/pdfiumandroid/PdfDocument;", "", "data", "([B)Lio/legere/pdfiumandroid/PdfDocument;", "([BLjava/lang/String;)Lio/legere/pdfiumandroid/PdfDocument;", "pdfDocument", "LTf1;", "getPageCount", "(Lio/legere/pdfiumandroid/PdfDocument;)V", "closeDocument", "", "Lio/legere/pdfiumandroid/PdfDocument$Bookmark;", "getTableOfContents", "(Lio/legere/pdfiumandroid/PdfDocument;)Ljava/util/List;", "", "pageIndex", "", "openTextPage", "(Lio/legere/pdfiumandroid/PdfDocument;I)J", "openPage", "Landroid/graphics/RectF;", "getPageMediaBox", "(Lio/legere/pdfiumandroid/PdfDocument;I)Landroid/graphics/RectF;", "closePage", "(Lio/legere/pdfiumandroid/PdfDocument;I)V", "closeTextPage", "textPageCountChars", "(Lio/legere/pdfiumandroid/PdfDocument;I)I", "start", "count", "textPageGetText", "(Lio/legere/pdfiumandroid/PdfDocument;III)Ljava/lang/String;", "Lio/legere/pdfiumandroid/PdfDocument$Meta;", "getDocumentMeta", "(Lio/legere/pdfiumandroid/PdfDocument;)Lio/legere/pdfiumandroid/PdfDocument$Meta;", "getPageWidthPoint", "getPageHeightPoint", "Landroid/graphics/Bitmap;", "bitmap", "startX", "startY", "drawSizeX", "drawSizeY", "", "renderAnnot", "textMask", "renderPageBitmap", "(Lio/legere/pdfiumandroid/PdfDocument;Landroid/graphics/Bitmap;IIIIIZZ)V", "index", "textPageGetRect", "(Lio/legere/pdfiumandroid/PdfDocument;II)Landroid/graphics/RectF;", "sourceRect", "size", "textPageGetBoundedText", "(Lio/legere/pdfiumandroid/PdfDocument;ILandroid/graphics/RectF;I)Ljava/lang/String;", "sizeX", "sizeY", "rotate", "Landroid/graphics/Rect;", "coords", "mapRectToPage", "(Lio/legere/pdfiumandroid/PdfDocument;IIIIIILandroid/graphics/Rect;)Landroid/graphics/RectF;", "startIndex", "textPageCountRects", "(Lio/legere/pdfiumandroid/PdfDocument;III)I", "fromIndex", "toIndex", "", "(Lio/legere/pdfiumandroid/PdfDocument;II)[Ljava/lang/Long;", "getPageWidth", "getPageHeight", "Lio/legere/pdfiumandroid/util/Size;", "getPageSize", "(Lio/legere/pdfiumandroid/PdfDocument;I)Lio/legere/pdfiumandroid/util/Size;", "Landroid/view/Surface;", "surface", "renderPage", "(Lio/legere/pdfiumandroid/PdfDocument;Landroid/view/Surface;IIIIIZ)V", "(Lio/legere/pdfiumandroid/PdfDocument;Landroid/graphics/Bitmap;IIIIIZ)V", "Lio/legere/pdfiumandroid/PdfDocument$Link;", "getPageLinks", "(Lio/legere/pdfiumandroid/PdfDocument;I)Ljava/util/List;", "", "pageX", "pageY", "Landroid/graphics/Point;", "mapPageCoordsToDevice", "(Lio/legere/pdfiumandroid/PdfDocument;IIIIIIDD)Landroid/graphics/Point;", "mapRectToDevice", "(Lio/legere/pdfiumandroid/PdfDocument;IIIIIILandroid/graphics/RectF;)Landroid/graphics/Rect;", "nativeOpenDocument", "(ILjava/lang/String;)J", "nativeOpenMemDocument", "([BLjava/lang/String;)J", "linkPtr", "nativeGetLinkRect", "(J)Landroid/graphics/RectF;", "Lio/legere/pdfiumandroid/util/Config;", "getConfig", "()Lio/legere/pdfiumandroid/util/Config;", "mCurrentDpi", "I", "Companion", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PdfiumCore {
    private final Config config;
    private final int mCurrentDpi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = PdfiumCore.class.getName();
    private static final Object lock = new Object();
    private static final InitLock isReady = new InitLock();

    @Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m22267d2 = {"Lio/legere/pdfiumandroid/PdfiumCore$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "lock", "getLock", "()Ljava/lang/Object;", "isReady", "Lio/legere/pdfiumandroid/util/InitLock;", "()Lio/legere/pdfiumandroid/util/InitLock;", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object getLock() {
            return PdfiumCore.lock;
        }

        public final InitLock isReady() {
            return PdfiumCore.isReady;
        }

        private Companion() {
        }
    }

    static {
        new Thread(new RunnableC0004A3(4)).start();
    }

    public PdfiumCore() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$28() {
        synchronized (lock) {
            try {
                System.loadLibrary("pdfium");
                System.loadLibrary("pdfiumandroid");
                isReady.markReady();
            } catch (UnsatisfiedLinkError e) {
                Logger logger = Logger.INSTANCE;
                String str = TAG;
                O90.m5967e(str, "TAG");
                logger.mo21355e(str, e, "Native libraries failed to load");
            }
        }
    }

    private final native RectF nativeGetLinkRect(long linkPtr);

    private final native long nativeOpenDocument(int fd, String password);

    private final native long nativeOpenMemDocument(byte[] data, String password);

    public final void closeDocument(PdfDocument pdfDocument) {
        O90.m5968f(pdfDocument, "pdfDocument");
        pdfDocument.close();
    }

    public final void closePage(PdfDocument pdfDocument, int pageIndex) {
        O90.m5968f(pdfDocument, "pdfDocument");
    }

    public final void closeTextPage(PdfDocument pdfDocument, int pageIndex) {
        O90.m5968f(pdfDocument, "pdfDocument");
    }

    public final Config getConfig() {
        return this.config;
    }

    public final PdfDocument.Meta getDocumentMeta(PdfDocument pdfDocument) {
        O90.m5968f(pdfDocument, "pdfDocument");
        return pdfDocument.getDocumentMeta();
    }

    public final void getPageCount(PdfDocument pdfDocument) {
        O90.m5968f(pdfDocument, "pdfDocument");
        pdfDocument.getPageCount();
    }

    public final int getPageHeight(PdfDocument pdfDocument, int index) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(index);
        try {
            int pageHeight = pdfPageOpenPage.getPageHeight(this.mCurrentDpi);
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
            return pageHeight;
        } finally {
        }
    }

    public final int getPageHeightPoint(PdfDocument pdfDocument, int pageIndex) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            int pageHeightPoint = pdfPageOpenPage.getPageHeightPoint();
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
            return pageHeightPoint;
        } finally {
        }
    }

    public final List<PdfDocument.Link> getPageLinks(PdfDocument pdfDocument, int pageIndex) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            List<PdfDocument.Link> pageLinks = pdfPageOpenPage.getPageLinks();
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
            return pageLinks;
        } finally {
        }
    }

    public final RectF getPageMediaBox(PdfDocument pdfDocument, int pageIndex) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            RectF pageMediaBox = pdfPageOpenPage.getPageMediaBox();
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
            return pageMediaBox;
        } finally {
        }
    }

    public final Size getPageSize(PdfDocument pdfDocument, int index) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(index);
        try {
            Size pageSize = pdfPageOpenPage.getPageSize(this.mCurrentDpi);
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
            return pageSize;
        } finally {
        }
    }

    public final int getPageWidth(PdfDocument pdfDocument, int index) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(index);
        try {
            int pageWidth = pdfPageOpenPage.getPageWidth(this.mCurrentDpi);
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
            return pageWidth;
        } finally {
        }
    }

    public final int getPageWidthPoint(PdfDocument pdfDocument, int pageIndex) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            int pageWidthPoint = pdfPageOpenPage.getPageWidthPoint();
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
            return pageWidthPoint;
        } finally {
        }
    }

    public final List<PdfDocument.Bookmark> getTableOfContents(PdfDocument pdfDocument) {
        O90.m5968f(pdfDocument, "pdfDocument");
        return pdfDocument.getTableOfContents();
    }

    public final Point mapPageCoordsToDevice(PdfDocument pdfDocument, int pageIndex, int startX, int startY, int sizeX, int sizeY, int rotate, double pageX, double pageY) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            Point pointMapPageCoordsToDevice = pdfPageOpenPage.mapPageCoordsToDevice(startX, startY, sizeX, sizeY, rotate, pageX, pageY);
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
            return pointMapPageCoordsToDevice;
        } finally {
        }
    }

    public final Rect mapRectToDevice(PdfDocument pdfDocument, int pageIndex, int startX, int startY, int sizeX, int sizeY, int rotate, RectF coords) {
        O90.m5968f(pdfDocument, "pdfDocument");
        O90.m5968f(coords, "coords");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            Rect rectMapRectToDevice = pdfPageOpenPage.mapRectToDevice(startX, startY, sizeX, sizeY, rotate, coords);
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
            return rectMapRectToDevice;
        } finally {
        }
    }

    public final RectF mapRectToPage(PdfDocument pdfDocument, int pageIndex, int startX, int startY, int sizeX, int sizeY, int rotate, Rect coords) {
        O90.m5968f(pdfDocument, "pdfDocument");
        O90.m5968f(coords, "coords");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            RectF rectFMapRectToPage = pdfPageOpenPage.mapRectToPage(startX, startY, sizeX, sizeY, rotate, coords);
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
            return rectFMapRectToPage;
        } finally {
        }
    }

    public final PdfDocument newDocument(ParcelFileDescriptor fd) throws IOException {
        O90.m5968f(fd, "fd");
        return newDocument(fd, (String) null);
    }

    public final long openPage(PdfDocument pdfDocument, int pageIndex) {
        O90.m5968f(pdfDocument, "pdfDocument");
        return pageIndex;
    }

    public final long openTextPage(PdfDocument pdfDocument, int pageIndex) {
        O90.m5968f(pdfDocument, "pdfDocument");
        return pageIndex;
    }

    public final void renderPage(PdfDocument pdfDocument, Surface surface, int pageIndex, int startX, int startY, int drawSizeX, int drawSizeY, boolean renderAnnot) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            pdfPageOpenPage.renderPage(surface, startX, startY, drawSizeX, drawSizeY, false);
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
        } finally {
        }
    }

    public final void renderPageBitmap(PdfDocument pdfDocument, Bitmap bitmap, int pageIndex, int startX, int startY, int drawSizeX, int drawSizeY, boolean renderAnnot, boolean textMask) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            pdfPageOpenPage.renderPageBitmap(bitmap, startX, startY, drawSizeX, drawSizeY, renderAnnot, textMask);
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
        } finally {
        }
    }

    public final int textPageCountChars(PdfDocument pdfDocument, int pageIndex) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfTextPage pdfTextPageOpenTextPage = pdfPageOpenPage.openTextPage();
            try {
                int iTextPageCountChars = pdfTextPageOpenTextPage.textPageCountChars();
                AbstractC8729aT1.m9749a(pdfTextPageOpenTextPage, null);
                AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
                return iTextPageCountChars;
            } finally {
            }
        } finally {
        }
    }

    public final int textPageCountRects(PdfDocument pdfDocument, int pageIndex, int startIndex, int count) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfTextPage pdfTextPageOpenTextPage = pdfPageOpenPage.openTextPage();
            try {
                int iTextPageCountRects = pdfTextPageOpenTextPage.textPageCountRects(startIndex, count);
                AbstractC8729aT1.m9749a(pdfTextPageOpenTextPage, null);
                AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
                return iTextPageCountRects;
            } finally {
            }
        } finally {
        }
    }

    public final String textPageGetBoundedText(PdfDocument pdfDocument, int pageIndex, RectF sourceRect, int size) {
        O90.m5968f(pdfDocument, "pdfDocument");
        O90.m5968f(sourceRect, "sourceRect");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfTextPage pdfTextPageOpenTextPage = pdfPageOpenPage.openTextPage();
            try {
                String strTextPageGetBoundedText = pdfTextPageOpenTextPage.textPageGetBoundedText(sourceRect, size);
                AbstractC8729aT1.m9749a(pdfTextPageOpenTextPage, null);
                AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
                return strTextPageGetBoundedText;
            } finally {
            }
        } finally {
        }
    }

    public final RectF textPageGetRect(PdfDocument pdfDocument, int pageIndex, int index) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfTextPage pdfTextPageOpenTextPage = pdfPageOpenPage.openTextPage();
            try {
                RectF rectFTextPageGetRect = pdfTextPageOpenTextPage.textPageGetRect(index);
                AbstractC8729aT1.m9749a(pdfTextPageOpenTextPage, null);
                AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
                return rectFTextPageGetRect;
            } finally {
            }
        } finally {
        }
    }

    public final String textPageGetText(PdfDocument pdfDocument, int pageIndex, int start, int count) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfTextPage pdfTextPageOpenTextPage = pdfPageOpenPage.openTextPage();
            try {
                String strTextPageGetText = pdfTextPageOpenTextPage.textPageGetText(start, count);
                AbstractC8729aT1.m9749a(pdfTextPageOpenTextPage, null);
                AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
                return strTextPageGetText;
            } finally {
            }
        } finally {
        }
    }

    public PdfiumCore(Context context, Config config) {
        Resources resources;
        DisplayMetrics displayMetrics;
        O90.m5968f(config, "config");
        this.config = config;
        ConfigKt.setPdfiumConfig(config);
        Logger logger = Logger.INSTANCE;
        logger.setLogger(config.getLogger());
        String str = TAG;
        O90.m5967e(str, "TAG");
        logger.mo21354d(str, "Starting PdfiumAndroid ");
        this.mCurrentDpi = (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? -1 : displayMetrics.densityDpi;
        isReady.waitForReady();
    }

    public final PdfDocument newDocument(ParcelFileDescriptor parcelFileDescriptor, String password) throws IOException {
        PdfDocument pdfDocument;
        O90.m5968f(parcelFileDescriptor, "parcelFileDescriptor");
        synchronized (lock) {
            pdfDocument = new PdfDocument(nativeOpenDocument(parcelFileDescriptor.getFd(), password));
            pdfDocument.setParcelFileDescriptor(parcelFileDescriptor);
        }
        return pdfDocument;
    }

    public final Long[] openPage(PdfDocument pdfDocument, int fromIndex, int toIndex) {
        O90.m5968f(pdfDocument, "pdfDocument");
        return (Long[]) AbstractC7167xu.m25982b0(new C7492Dl0(fromIndex, toIndex)).toArray(new Long[0]);
    }

    public final void renderPageBitmap(PdfDocument pdfDocument, Bitmap bitmap, int pageIndex, int startX, int startY, int drawSizeX, int drawSizeY, boolean renderAnnot) {
        O90.m5968f(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            pdfPageOpenPage.renderPageBitmap(bitmap, startX, startY, drawSizeX, drawSizeY, (64 & 32) != 0 ? false : renderAnnot, (64 & 64) != 0 ? false : false);
            AbstractC8729aT1.m9749a(pdfPageOpenPage, null);
        } finally {
        }
    }

    public final PdfDocument newDocument(byte[] data) throws IOException {
        return newDocument(data, (String) null);
    }

    public final PdfDocument newDocument(byte[] data, String password) throws IOException {
        PdfDocument pdfDocument;
        synchronized (lock) {
            pdfDocument = new PdfDocument(nativeOpenMemDocument(data, password));
            pdfDocument.setParcelFileDescriptor(null);
        }
        return pdfDocument;
    }

    public /* synthetic */ PdfiumCore(Context context, Config config, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context, (i & 2) != 0 ? new Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : config);
    }
}
