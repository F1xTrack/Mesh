package io.legere.pdfiumandroid.suspend;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Surface;
import androidx.annotation.Keep;
import io.legere.pdfiumandroid.Logger;
import io.legere.pdfiumandroid.PdfPage;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import p000.AbstractC0377Fz;
import p000.AbstractC9366fP1;
import p000.AbstractC9714i71;
import p000.C8313Tf1;
import p000.EnumC0817Mz;
import p000.InterfaceC0754Lz;
import p000.InterfaceC1382Vy;
import p000.InterfaceC7124xD;
import p000.O90;
import p000.RQ1;

@Keep
@Metadata(m22266d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\nJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0016\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0018\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0019\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001a\u0010\nJ\u0010\u0010\u001b\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001b\u0010\nJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u001d\u0010\u000eJ:\u0010%\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b%\u0010&JL\u0010,\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)H\u0086@¢\u0006\u0004\b,\u0010-J>\u0010,\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)H\u0086@¢\u0006\u0004\b,\u00100J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0086@¢\u0006\u0004\b3\u0010\nJH\u0010;\u001a\u00020:2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u000207H\u0086@¢\u0006\u0004\b;\u0010<JH\u0010@\u001a\u00020?2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b@\u0010AJ@\u0010D\u001a\u00020C2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u0015H\u0086@¢\u0006\u0004\bD\u0010EJ@\u0010F\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020CH\u0086@¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020$H\u0016¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020)¢\u0006\u0004\bJ\u0010KR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010O¨\u0006P"}, m22267d2 = {"Lio/legere/pdfiumandroid/suspend/PdfPageKt;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/PdfPage;", "page", "LFz;", "dispatcher", "<init>", "(Lio/legere/pdfiumandroid/PdfPage;LFz;)V", "Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "openTextPage", "(LVy;)Ljava/lang/Object;", "", "screenDpi", "getPageWidth", "(ILVy;)Ljava/lang/Object;", "getPageHeight", "getPageWidthPoint", "getPageHeightPoint", "Landroid/graphics/Matrix;", "getPageMatrix", "getPageRotation", "Landroid/graphics/RectF;", "getPageCropBox", "getPageMediaBox", "getPageBleedBox", "getPageTrimBox", "getPageArtBox", "getPageBoundingBox", "Lio/legere/pdfiumandroid/util/Size;", "getPageSize", "Landroid/view/Surface;", "surface", "startX", "startY", "drawSizeX", "drawSizeY", "LTf1;", "renderPage", "(Landroid/view/Surface;IIIILVy;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "bitmap", "", "renderAnnot", "textMask", "renderPageBitmap", "(Landroid/graphics/Bitmap;IIIIZZLVy;)Ljava/lang/Object;", "matrix", "clipRect", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/RectF;ZZLVy;)Ljava/lang/Object;", "", "Lio/legere/pdfiumandroid/PdfDocument$Link;", "getPageLinks", "sizeX", "sizeY", "rotate", "", "pageX", "pageY", "Landroid/graphics/Point;", "mapPageCoordsToDevice", "(IIIIIDDLVy;)Ljava/lang/Object;", "deviceX", "deviceY", "Landroid/graphics/PointF;", "mapDeviceCoordsToPage", "(IIIIIIILVy;)Ljava/lang/Object;", "coords", "Landroid/graphics/Rect;", "mapRectToDevice", "(IIIIILandroid/graphics/RectF;LVy;)Ljava/lang/Object;", "mapRectToPage", "(IIIIILandroid/graphics/Rect;LVy;)Ljava/lang/Object;", "close", "()V", "safeClose", "()Z", "Lio/legere/pdfiumandroid/PdfPage;", "getPage", "()Lio/legere/pdfiumandroid/PdfPage;", "LFz;", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PdfPageKt implements Closeable {
    private final AbstractC0377Fz dispatcher;
    private final PdfPage page;

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/RectF;", "<anonymous>", "(LLz;)Landroid/graphics/RectF;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageArtBox$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageArtBox$2 */
    public static final class C57122 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57122(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57122(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57122) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().getPageArtBox();
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/RectF;", "<anonymous>", "(LLz;)Landroid/graphics/RectF;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageBleedBox$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageBleedBox$2 */
    public static final class C57132 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57132(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57132(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57132) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().getPageBleedBox();
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/RectF;", "<anonymous>", "(LLz;)Landroid/graphics/RectF;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageBoundingBox$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageBoundingBox$2 */
    public static final class C57142 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57142(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57142(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57142) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().getPageBoundingBox();
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/RectF;", "<anonymous>", "(LLz;)Landroid/graphics/RectF;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageCropBox$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageCropBox$2 */
    public static final class C57152 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57152(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57152(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57152) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().getPageCropBox();
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageHeight$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageHeight$2 */
    public static final class C57162 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $screenDpi;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57162(int i, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$screenDpi = i;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57162(this.$screenDpi, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57162) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Integer(PdfPageKt.this.getPage().getPageHeight(this.$screenDpi));
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageHeightPoint$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageHeightPoint$2 */
    public static final class C57172 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57172(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57172(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57172) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Integer(PdfPageKt.this.getPage().getPageHeightPoint());
        }
    }

    @Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m22267d2 = {"LLz;", "", "Lio/legere/pdfiumandroid/PdfDocument$Link;", "<anonymous>", "(LLz;)Ljava/util/List;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageLinks$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageLinks$2 */
    public static final class C57182 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57182(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57182(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57182) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().getPageLinks();
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/Matrix;", "<anonymous>", "(LLz;)Landroid/graphics/Matrix;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageMatrix$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageMatrix$2 */
    public static final class C57192 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57192(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57192(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57192) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().getPageMatrix();
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/RectF;", "<anonymous>", "(LLz;)Landroid/graphics/RectF;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageMediaBox$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageMediaBox$2 */
    public static final class C57202 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57202(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57202(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57202) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().getPageMediaBox();
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageRotation$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageRotation$2 */
    public static final class C57212 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57212(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57212(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57212) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Integer(PdfPageKt.this.getPage().getPageRotation());
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Lio/legere/pdfiumandroid/util/Size;", "<anonymous>", "(LLz;)Lio/legere/pdfiumandroid/util/Size;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageSize$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageSize$2 */
    public static final class C57222 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $screenDpi;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57222(int i, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$screenDpi = i;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57222(this.$screenDpi, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57222) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().getPageSize(this.$screenDpi);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/RectF;", "<anonymous>", "(LLz;)Landroid/graphics/RectF;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageTrimBox$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageTrimBox$2 */
    public static final class C57232 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57232(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57232(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57232) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().getPageTrimBox();
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageWidth$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageWidth$2 */
    public static final class C57242 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $screenDpi;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57242(int i, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$screenDpi = i;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57242(this.$screenDpi, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57242) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Integer(PdfPageKt.this.getPage().getPageWidth(this.$screenDpi));
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$getPageWidthPoint$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$getPageWidthPoint$2 */
    public static final class C57252 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57252(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57252(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57252) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Integer(PdfPageKt.this.getPage().getPageWidthPoint());
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/PointF;", "<anonymous>", "(LLz;)Landroid/graphics/PointF;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$mapDeviceCoordsToPage$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$mapDeviceCoordsToPage$2 */
    public static final class C57262 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $deviceX;
        final /* synthetic */ int $deviceY;
        final /* synthetic */ int $rotate;
        final /* synthetic */ int $sizeX;
        final /* synthetic */ int $sizeY;
        final /* synthetic */ int $startX;
        final /* synthetic */ int $startY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57262(int i, int i2, int i3, int i4, int i5, int i6, int i7, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$startX = i;
            this.$startY = i2;
            this.$sizeX = i3;
            this.$sizeY = i4;
            this.$rotate = i5;
            this.$deviceX = i6;
            this.$deviceY = i7;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57262(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$deviceX, this.$deviceY, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57262) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().mapDeviceCoordsToPage(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$deviceX, this.$deviceY);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/Point;", "<anonymous>", "(LLz;)Landroid/graphics/Point;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$mapPageCoordsToDevice$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$mapPageCoordsToDevice$2 */
    public static final class C57272 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ double $pageX;
        final /* synthetic */ double $pageY;
        final /* synthetic */ int $rotate;
        final /* synthetic */ int $sizeX;
        final /* synthetic */ int $sizeY;
        final /* synthetic */ int $startX;
        final /* synthetic */ int $startY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57272(int i, int i2, int i3, int i4, int i5, double d, double d2, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$startX = i;
            this.$startY = i2;
            this.$sizeX = i3;
            this.$sizeY = i4;
            this.$rotate = i5;
            this.$pageX = d;
            this.$pageY = d2;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57272(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$pageX, this.$pageY, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57272) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().mapPageCoordsToDevice(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$pageX, this.$pageY);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/Rect;", "<anonymous>", "(LLz;)Landroid/graphics/Rect;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$mapRectToDevice$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$mapRectToDevice$2 */
    public static final class C57282 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ RectF $coords;
        final /* synthetic */ int $rotate;
        final /* synthetic */ int $sizeX;
        final /* synthetic */ int $sizeY;
        final /* synthetic */ int $startX;
        final /* synthetic */ int $startY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57282(int i, int i2, int i3, int i4, int i5, RectF rectF, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$startX = i;
            this.$startY = i2;
            this.$sizeX = i3;
            this.$sizeY = i4;
            this.$rotate = i5;
            this.$coords = rectF;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57282(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$coords, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57282) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().mapRectToDevice(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$coords);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/RectF;", "<anonymous>", "(LLz;)Landroid/graphics/RectF;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$mapRectToPage$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$mapRectToPage$2 */
    public static final class C57292 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ Rect $coords;
        final /* synthetic */ int $rotate;
        final /* synthetic */ int $sizeX;
        final /* synthetic */ int $sizeY;
        final /* synthetic */ int $startX;
        final /* synthetic */ int $startY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57292(int i, int i2, int i3, int i4, int i5, Rect rect, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$startX = i;
            this.$startY = i2;
            this.$sizeX = i3;
            this.$sizeY = i4;
            this.$rotate = i5;
            this.$coords = rect;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57292(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$coords, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57292) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfPageKt.this.getPage().mapRectToPage(this.$startX, this.$startY, this.$sizeX, this.$sizeY, this.$rotate, this.$coords);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "<anonymous>", "(LLz;)Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$openTextPage$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$openTextPage$2 */
    public static final class C57302 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57302(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57302(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57302) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new PdfTextPageKt(PdfPageKt.this.getPage().openTextPage(), PdfPageKt.this.dispatcher);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "LTf1;", "<anonymous>", "(LLz;)V"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$renderPage$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$renderPage$2 */
    public static final class C57312 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $drawSizeX;
        final /* synthetic */ int $drawSizeY;
        final /* synthetic */ int $startX;
        final /* synthetic */ int $startY;
        final /* synthetic */ Surface $surface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57312(Surface surface, int i, int i2, int i3, int i4, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$surface = surface;
            this.$startX = i;
            this.$startY = i2;
            this.$drawSizeX = i3;
            this.$drawSizeY = i4;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57312(this.$surface, this.$startX, this.$startY, this.$drawSizeX, this.$drawSizeY, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57312) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            PdfPage.renderPage$default(PdfPageKt.this.getPage(), this.$surface, this.$startX, this.$startY, this.$drawSizeX, this.$drawSizeY, false, 32, null);
            return C8313Tf1.f11463a;
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "LTf1;", "<anonymous>", "(LLz;)V"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$renderPageBitmap$2", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$renderPageBitmap$2 */
    public static final class C57322 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ int $drawSizeX;
        final /* synthetic */ int $drawSizeY;
        final /* synthetic */ boolean $renderAnnot;
        final /* synthetic */ int $startX;
        final /* synthetic */ int $startY;
        final /* synthetic */ boolean $textMask;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57322(Bitmap bitmap, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$bitmap = bitmap;
            this.$startX = i;
            this.$startY = i2;
            this.$drawSizeX = i3;
            this.$drawSizeY = i4;
            this.$renderAnnot = z;
            this.$textMask = z2;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57322(this.$bitmap, this.$startX, this.$startY, this.$drawSizeX, this.$drawSizeY, this.$renderAnnot, this.$textMask, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57322) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            PdfPageKt.this.getPage().renderPageBitmap(this.$bitmap, this.$startX, this.$startY, this.$drawSizeX, this.$drawSizeY, this.$renderAnnot, this.$textMask);
            return C8313Tf1.f11463a;
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "LTf1;", "<anonymous>", "(LLz;)V"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfPageKt$renderPageBitmap$4", m25815f = "PdfPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfPageKt$renderPageBitmap$4 */
    public static final class C57334 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ RectF $clipRect;
        final /* synthetic */ Matrix $matrix;
        final /* synthetic */ boolean $renderAnnot;
        final /* synthetic */ boolean $textMask;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57334(Bitmap bitmap, Matrix matrix, RectF rectF, boolean z, boolean z2, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$bitmap = bitmap;
            this.$matrix = matrix;
            this.$clipRect = rectF;
            this.$renderAnnot = z;
            this.$textMask = z2;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfPageKt.this.new C57334(this.$bitmap, this.$matrix, this.$clipRect, this.$renderAnnot, this.$textMask, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57334) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            PdfPageKt.this.getPage().renderPageBitmap(this.$bitmap, this.$matrix, this.$clipRect, this.$renderAnnot, this.$textMask);
            return C8313Tf1.f11463a;
        }
    }

    public PdfPageKt(PdfPage pdfPage, AbstractC0377Fz abstractC0377Fz) {
        O90.m5968f(pdfPage, "page");
        O90.m5968f(abstractC0377Fz, "dispatcher");
        this.page = pdfPage;
        this.dispatcher = abstractC0377Fz;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.page.close();
    }

    public final PdfPage getPage() {
        return this.page;
    }

    public final Object getPageArtBox(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57122(null), interfaceC1382Vy);
    }

    public final Object getPageBleedBox(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57132(null), interfaceC1382Vy);
    }

    public final Object getPageBoundingBox(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57142(null), interfaceC1382Vy);
    }

    public final Object getPageCropBox(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57152(null), interfaceC1382Vy);
    }

    public final Object getPageHeight(int i, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57162(i, null), interfaceC1382Vy);
    }

    public final Object getPageHeightPoint(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57172(null), interfaceC1382Vy);
    }

    public final Object getPageLinks(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57182(null), interfaceC1382Vy);
    }

    public final Object getPageMatrix(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57192(null), interfaceC1382Vy);
    }

    public final Object getPageMediaBox(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57202(null), interfaceC1382Vy);
    }

    public final Object getPageRotation(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57212(null), interfaceC1382Vy);
    }

    public final Object getPageSize(int i, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57222(i, null), interfaceC1382Vy);
    }

    public final Object getPageTrimBox(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57232(null), interfaceC1382Vy);
    }

    public final Object getPageWidth(int i, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57242(i, null), interfaceC1382Vy);
    }

    public final Object getPageWidthPoint(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57252(null), interfaceC1382Vy);
    }

    public final Object mapDeviceCoordsToPage(int i, int i2, int i3, int i4, int i5, int i6, int i7, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57262(i, i2, i3, i4, i5, i6, i7, null), interfaceC1382Vy);
    }

    public final Object mapPageCoordsToDevice(int i, int i2, int i3, int i4, int i5, double d, double d2, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57272(i, i2, i3, i4, i5, d, d2, null), interfaceC1382Vy);
    }

    public final Object mapRectToDevice(int i, int i2, int i3, int i4, int i5, RectF rectF, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57282(i, i2, i3, i4, i5, rectF, null), interfaceC1382Vy);
    }

    public final Object mapRectToPage(int i, int i2, int i3, int i4, int i5, Rect rect, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57292(i, i2, i3, i4, i5, rect, null), interfaceC1382Vy);
    }

    public final Object openTextPage(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57302(null), interfaceC1382Vy);
    }

    public final Object renderPage(Surface surface, int i, int i2, int i3, int i4, InterfaceC1382Vy interfaceC1382Vy) {
        Object objM18233e = AbstractC9366fP1.m18233e(this.dispatcher, new C57312(surface, i, i2, i3, i4, null), interfaceC1382Vy);
        return objM18233e == EnumC0817Mz.f7418a ? objM18233e : C8313Tf1.f11463a;
    }

    public final Object renderPageBitmap(Bitmap bitmap, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC1382Vy interfaceC1382Vy) {
        Object objM18233e = AbstractC9366fP1.m18233e(this.dispatcher, new C57322(bitmap, i, i2, i3, i4, z, z2, null), interfaceC1382Vy);
        return objM18233e == EnumC0817Mz.f7418a ? objM18233e : C8313Tf1.f11463a;
    }

    public final boolean safeClose() {
        try {
            this.page.close();
            return true;
        } catch (IllegalStateException e) {
            Logger.INSTANCE.mo21355e("PdfPageKt", e, "PdfPageKt.safeClose");
            return false;
        }
    }

    public final Object renderPageBitmap(Bitmap bitmap, Matrix matrix, RectF rectF, boolean z, boolean z2, InterfaceC1382Vy interfaceC1382Vy) {
        Object objM18233e = AbstractC9366fP1.m18233e(this.dispatcher, new C57334(bitmap, matrix, rectF, z, z2, null), interfaceC1382Vy);
        return objM18233e == EnumC0817Mz.f7418a ? objM18233e : C8313Tf1.f11463a;
    }
}
