package io.legere.pdfiumandroid.suspend;

import android.graphics.RectF;
import androidx.annotation.Keep;
import io.legere.pdfiumandroid.FindFlags;
import io.legere.pdfiumandroid.FindResult;
import io.legere.pdfiumandroid.Logger;
import io.legere.pdfiumandroid.PdfTextPage;
import java.io.Closeable;
import java.util.Set;
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
@Metadata(m22266d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0015\u0010\u0013J0\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u001e\u0010\u000fJ\u001a\u0010 \u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\bH\u0086@¢\u0006\u0004\b \u0010\u0013J\"\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\bH\u0086@¢\u0006\u0004\b%\u0010\u0013J0\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010&\u001a\u00020\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106¨\u00067"}, m22267d2 = {"Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/PdfTextPage;", "page", "LFz;", "dispatcher", "<init>", "(Lio/legere/pdfiumandroid/PdfTextPage;LFz;)V", "", "textPageCountChars", "(LVy;)Ljava/lang/Object;", "startIndex", "length", "", "textPageGetText", "(IILVy;)Ljava/lang/Object;", "index", "", "textPageGetUnicode", "(ILVy;)Ljava/lang/Object;", "Landroid/graphics/RectF;", "textPageGetCharBox", "", "x", "y", "xTolerance", "yTolerance", "textPageGetCharIndexAtPos", "(DDDDLVy;)Ljava/lang/Object;", "count", "textPageCountRects", "rectIndex", "textPageGetRect", "rect", "textPageGetBoundedText", "(Landroid/graphics/RectF;ILVy;)Ljava/lang/Object;", "charIndex", "getFontSize", "findWhat", "", "Lio/legere/pdfiumandroid/FindFlags;", "flags", "Lio/legere/pdfiumandroid/suspend/FindResultKt;", "findStart", "(Ljava/lang/String;Ljava/util/Set;ILVy;)Ljava/lang/Object;", "LTf1;", "close", "()V", "", "safeClose", "()Z", "Lio/legere/pdfiumandroid/PdfTextPage;", "getPage", "()Lio/legere/pdfiumandroid/PdfTextPage;", "LFz;", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PdfTextPageKt implements Closeable {
    private final AbstractC0377Fz dispatcher;
    private final PdfTextPage page;

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Lio/legere/pdfiumandroid/suspend/FindResultKt;", "<anonymous>", "(LLz;)Lio/legere/pdfiumandroid/suspend/FindResultKt;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$findStart$2", m25815f = "PdfTextPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$findStart$2 */
    public static final class C57342 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ String $findWhat;
        final /* synthetic */ Set<FindFlags> $flags;
        final /* synthetic */ int $startIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C57342(String str, Set<? extends FindFlags> set, int i, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$findWhat = str;
            this.$flags = set;
            this.$startIndex = i;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfTextPageKt.this.new C57342(this.$findWhat, this.$flags, this.$startIndex, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57342) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            FindResult findResultFindStart = PdfTextPageKt.this.getPage().findStart(this.$findWhat, this.$flags, this.$startIndex);
            if (findResultFindStart == null) {
                return null;
            }
            return new FindResultKt(findResultFindStart, PdfTextPageKt.this.dispatcher);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)D"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$getFontSize$2", m25815f = "PdfTextPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$getFontSize$2 */
    public static final class C57352 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $charIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57352(int i, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$charIndex = i;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfTextPageKt.this.new C57352(this.$charIndex, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57352) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Double(PdfTextPageKt.this.getPage().getFontSize(this.$charIndex));
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageCountChars$2", m25815f = "PdfTextPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageCountChars$2 */
    public static final class C57362 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57362(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfTextPageKt.this.new C57362(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57362) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Integer(PdfTextPageKt.this.getPage().textPageCountChars());
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageCountRects$2", m25815f = "PdfTextPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageCountRects$2 */
    public static final class C57372 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $count;
        final /* synthetic */ int $startIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57372(int i, int i2, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$startIndex = i;
            this.$count = i2;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfTextPageKt.this.new C57372(this.$startIndex, this.$count, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57372) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Integer(PdfTextPageKt.this.getPage().textPageCountRects(this.$startIndex, this.$count));
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)Ljava/lang/String;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetBoundedText$2", m25815f = "PdfTextPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetBoundedText$2 */
    public static final class C57382 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $length;
        final /* synthetic */ RectF $rect;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57382(RectF rectF, int i, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$rect = rectF;
            this.$length = i;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfTextPageKt.this.new C57382(this.$rect, this.$length, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57382) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfTextPageKt.this.getPage().textPageGetBoundedText(this.$rect, this.$length);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/RectF;", "<anonymous>", "(LLz;)Landroid/graphics/RectF;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetCharBox$2", m25815f = "PdfTextPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetCharBox$2 */
    public static final class C57392 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57392(int i, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$index = i;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfTextPageKt.this.new C57392(this.$index, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57392) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfTextPageKt.this.getPage().textPageGetCharBox(this.$index);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetCharIndexAtPos$2", m25815f = "PdfTextPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetCharIndexAtPos$2 */
    public static final class C57402 extends AbstractC9714i71 implements Function2 {

        /* renamed from: $x */
        final /* synthetic */ double f33201$x;
        final /* synthetic */ double $xTolerance;

        /* renamed from: $y */
        final /* synthetic */ double f33202$y;
        final /* synthetic */ double $yTolerance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57402(double d, double d2, double d3, double d4, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.f33201$x = d;
            this.f33202$y = d2;
            this.$xTolerance = d3;
            this.$yTolerance = d4;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfTextPageKt.this.new C57402(this.f33201$x, this.f33202$y, this.$xTolerance, this.$yTolerance, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57402) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Integer(PdfTextPageKt.this.getPage().textPageGetCharIndexAtPos(this.f33201$x, this.f33202$y, this.$xTolerance, this.$yTolerance));
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Landroid/graphics/RectF;", "<anonymous>", "(LLz;)Landroid/graphics/RectF;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetRect$2", m25815f = "PdfTextPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetRect$2 */
    public static final class C57412 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $rectIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57412(int i, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$rectIndex = i;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfTextPageKt.this.new C57412(this.$rectIndex, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57412) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfTextPageKt.this.getPage().textPageGetRect(this.$rectIndex);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)Ljava/lang/String;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetText$2", m25815f = "PdfTextPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetText$2 */
    public static final class C57422 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $length;
        final /* synthetic */ int $startIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57422(int i, int i2, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$startIndex = i;
            this.$length = i2;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfTextPageKt.this.new C57422(this.$startIndex, this.$length, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57422) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfTextPageKt.this.getPage().textPageGetText(this.$startIndex, this.$length);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)C"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetUnicode$2", m25815f = "PdfTextPageKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfTextPageKt$textPageGetUnicode$2 */
    public static final class C57432 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57432(int i, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$index = i;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfTextPageKt.this.new C57432(this.$index, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57432) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Character(PdfTextPageKt.this.getPage().textPageGetUnicode(this.$index));
        }
    }

    public PdfTextPageKt(PdfTextPage pdfTextPage, AbstractC0377Fz abstractC0377Fz) {
        O90.m5968f(pdfTextPage, "page");
        O90.m5968f(abstractC0377Fz, "dispatcher");
        this.page = pdfTextPage;
        this.dispatcher = abstractC0377Fz;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.page.close();
    }

    public final Object findStart(String str, Set<? extends FindFlags> set, int i, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57342(str, set, i, null), interfaceC1382Vy);
    }

    public final Object getFontSize(int i, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57352(i, null), interfaceC1382Vy);
    }

    public final PdfTextPage getPage() {
        return this.page;
    }

    public final boolean safeClose() {
        try {
            this.page.close();
            return true;
        } catch (IllegalStateException e) {
            Logger.INSTANCE.mo21355e("PdfTextPageKt", e, "PdfTextPageKt.safeClose");
            return false;
        }
    }

    public final Object textPageCountChars(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57362(null), interfaceC1382Vy);
    }

    public final Object textPageCountRects(int i, int i2, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57372(i, i2, null), interfaceC1382Vy);
    }

    public final Object textPageGetBoundedText(RectF rectF, int i, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57382(rectF, i, null), interfaceC1382Vy);
    }

    public final Object textPageGetCharBox(int i, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57392(i, null), interfaceC1382Vy);
    }

    public final Object textPageGetCharIndexAtPos(double d, double d2, double d3, double d4, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57402(d, d2, d3, d4, null), interfaceC1382Vy);
    }

    public final Object textPageGetRect(int i, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57412(i, null), interfaceC1382Vy);
    }

    public final Object textPageGetText(int i, int i2, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57422(i, i2, null), interfaceC1382Vy);
    }

    public final Object textPageGetUnicode(int i, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57432(i, null), interfaceC1382Vy);
    }
}
