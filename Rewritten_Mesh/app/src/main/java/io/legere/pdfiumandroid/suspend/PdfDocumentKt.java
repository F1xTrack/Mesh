package io.legere.pdfiumandroid.suspend;

import androidx.annotation.Keep;
import io.legere.pdfiumandroid.Logger;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfPage;
import io.legere.pdfiumandroid.PdfTextPage;
import io.legere.pdfiumandroid.PdfWriteCallback;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import p000.AbstractC0377Fz;
import p000.AbstractC7293zu;
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
@Metadata(m22266d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0010J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u0019\u0010\nJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015H\u0086@¢\u0006\u0004\b\u001b\u0010\nJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u000eH\u0087@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00152\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0086@¢\u0006\u0004\b \u0010\u0017J\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020#¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-¨\u0006."}, m22267d2 = {"Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/PdfDocument;", "document", "LFz;", "dispatcher", "<init>", "(Lio/legere/pdfiumandroid/PdfDocument;LFz;)V", "", "getPageCount", "(LVy;)Ljava/lang/Object;", "", "getPageCharCounts", "pageIndex", "Lio/legere/pdfiumandroid/suspend/PdfPageKt;", "openPage", "(ILVy;)Ljava/lang/Object;", "LTf1;", "deletePage", "fromIndex", "toIndex", "", "openPages", "(IILVy;)Ljava/lang/Object;", "Lio/legere/pdfiumandroid/PdfDocument$Meta;", "getDocumentMeta", "Lio/legere/pdfiumandroid/PdfDocument$Bookmark;", "getTableOfContents", "page", "Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "openTextPage", "(Lio/legere/pdfiumandroid/suspend/PdfPageKt;LVy;)Ljava/lang/Object;", "openTextPages", "Lio/legere/pdfiumandroid/PdfWriteCallback;", "callback", "", "saveAsCopy", "(Lio/legere/pdfiumandroid/PdfWriteCallback;LVy;)Ljava/lang/Object;", "close", "()V", "safeClose", "()Z", "Lio/legere/pdfiumandroid/PdfDocument;", "getDocument", "()Lio/legere/pdfiumandroid/PdfDocument;", "LFz;", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PdfDocumentKt implements Closeable {
    private final AbstractC0377Fz dispatcher;
    private final PdfDocument document;

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "LTf1;", "<anonymous>", "(LLz;)V"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$deletePage$2", m25815f = "PdfDocumentKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$deletePage$2 */
    public static final class C57022 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $pageIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57022(int i, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$pageIndex = i;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfDocumentKt.this.new C57022(this.$pageIndex, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57022) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            PdfDocumentKt.this.getDocument().deletePage(this.$pageIndex);
            return C8313Tf1.f11463a;
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Lio/legere/pdfiumandroid/PdfDocument$Meta;", "<anonymous>", "(LLz;)Lio/legere/pdfiumandroid/PdfDocument$Meta;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$getDocumentMeta$2", m25815f = "PdfDocumentKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$getDocumentMeta$2 */
    public static final class C57032 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57032(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfDocumentKt.this.new C57032(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57032) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfDocumentKt.this.getDocument().getDocumentMeta();
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)[I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$getPageCharCounts$2", m25815f = "PdfDocumentKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$getPageCharCounts$2 */
    public static final class C57042 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57042(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfDocumentKt.this.new C57042(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57042) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfDocumentKt.this.getDocument().getPageCharCounts();
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$getPageCount$2", m25815f = "PdfDocumentKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$getPageCount$2 */
    public static final class C57052 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57052(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfDocumentKt.this.new C57052(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57052) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Integer(PdfDocumentKt.this.getDocument().getPageCount());
        }
    }

    @Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m22267d2 = {"LLz;", "", "Lio/legere/pdfiumandroid/PdfDocument$Bookmark;", "<anonymous>", "(LLz;)Ljava/util/List;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$getTableOfContents$2", m25815f = "PdfDocumentKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$getTableOfContents$2 */
    public static final class C57062 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57062(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfDocumentKt.this.new C57062(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57062) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return PdfDocumentKt.this.getDocument().getTableOfContents();
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Lio/legere/pdfiumandroid/suspend/PdfPageKt;", "<anonymous>", "(LLz;)Lio/legere/pdfiumandroid/suspend/PdfPageKt;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$openPage$2", m25815f = "PdfDocumentKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$openPage$2 */
    public static final class C57072 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $pageIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57072(int i, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$pageIndex = i;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfDocumentKt.this.new C57072(this.$pageIndex, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57072) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new PdfPageKt(PdfDocumentKt.this.getDocument().openPage(this.$pageIndex), PdfDocumentKt.this.dispatcher);
        }
    }

    @Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m22267d2 = {"LLz;", "", "Lio/legere/pdfiumandroid/suspend/PdfPageKt;", "<anonymous>", "(LLz;)Ljava/util/List;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$openPages$2", m25815f = "PdfDocumentKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$openPages$2 */
    public static final class C57082 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $fromIndex;
        final /* synthetic */ int $toIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57082(int i, int i2, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$fromIndex = i;
            this.$toIndex = i2;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfDocumentKt.this.new C57082(this.$fromIndex, this.$toIndex, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57082) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            List<PdfPage> listOpenPages = PdfDocumentKt.this.getDocument().openPages(this.$fromIndex, this.$toIndex);
            PdfDocumentKt pdfDocumentKt = PdfDocumentKt.this;
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listOpenPages));
            Iterator<T> it = listOpenPages.iterator();
            while (it.hasNext()) {
                arrayList.add(new PdfPageKt((PdfPage) it.next(), pdfDocumentKt.dispatcher));
            }
            return arrayList;
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "<anonymous>", "(LLz;)Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$openTextPage$2", m25815f = "PdfDocumentKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$openTextPage$2 */
    public static final class C57092 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ PdfPageKt $page;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57092(PdfPageKt pdfPageKt, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$page = pdfPageKt;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfDocumentKt.this.new C57092(this.$page, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57092) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new PdfTextPageKt(PdfDocumentKt.this.getDocument().openTextPage(this.$page.getPage()), PdfDocumentKt.this.dispatcher);
        }
    }

    @Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m22267d2 = {"LLz;", "", "Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "<anonymous>", "(LLz;)Ljava/util/List;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$openTextPages$2", m25815f = "PdfDocumentKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$openTextPages$2 */
    public static final class C57102 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ int $fromIndex;
        final /* synthetic */ int $toIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57102(int i, int i2, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$fromIndex = i;
            this.$toIndex = i2;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfDocumentKt.this.new C57102(this.$fromIndex, this.$toIndex, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57102) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            List<PdfTextPage> listOpenTextPages = PdfDocumentKt.this.getDocument().openTextPages(this.$fromIndex, this.$toIndex);
            PdfDocumentKt pdfDocumentKt = PdfDocumentKt.this;
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listOpenTextPages));
            Iterator<T> it = listOpenTextPages.iterator();
            while (it.hasNext()) {
                arrayList.add(new PdfTextPageKt((PdfTextPage) it.next(), pdfDocumentKt.dispatcher));
            }
            return arrayList;
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)Z"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfDocumentKt$saveAsCopy$2", m25815f = "PdfDocumentKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfDocumentKt$saveAsCopy$2 */
    public static final class C57112 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ PdfWriteCallback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57112(PdfWriteCallback pdfWriteCallback, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$callback = pdfWriteCallback;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfDocumentKt.this.new C57112(this.$callback, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57112) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return Boolean.valueOf(PdfDocument.saveAsCopy$default(PdfDocumentKt.this.getDocument(), this.$callback, 0, 2, null));
        }
    }

    public PdfDocumentKt(PdfDocument pdfDocument, AbstractC0377Fz abstractC0377Fz) {
        O90.m5968f(pdfDocument, "document");
        O90.m5968f(abstractC0377Fz, "dispatcher");
        this.document = pdfDocument;
        this.dispatcher = abstractC0377Fz;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.document.close();
    }

    public final Object deletePage(int i, InterfaceC1382Vy interfaceC1382Vy) {
        Object objM18233e = AbstractC9366fP1.m18233e(this.dispatcher, new C57022(i, null), interfaceC1382Vy);
        return objM18233e == EnumC0817Mz.f7418a ? objM18233e : C8313Tf1.f11463a;
    }

    public final PdfDocument getDocument() {
        return this.document;
    }

    public final Object getDocumentMeta(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57032(null), interfaceC1382Vy);
    }

    public final Object getPageCharCounts(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57042(null), interfaceC1382Vy);
    }

    public final Object getPageCount(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57052(null), interfaceC1382Vy);
    }

    public final Object getTableOfContents(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57062(null), interfaceC1382Vy);
    }

    public final Object openPage(int i, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57072(i, null), interfaceC1382Vy);
    }

    public final Object openPages(int i, int i2, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57082(i, i2, null), interfaceC1382Vy);
    }

    public final Object openTextPage(PdfPageKt pdfPageKt, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57092(pdfPageKt, null), interfaceC1382Vy);
    }

    public final Object openTextPages(int i, int i2, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57102(i, i2, null), interfaceC1382Vy);
    }

    public final boolean safeClose() {
        try {
            this.document.close();
            return true;
        } catch (IllegalStateException e) {
            Logger.INSTANCE.mo21355e("PdfDocumentKt", e, "PdfDocumentKt.safeClose");
            return false;
        }
    }

    public final Object saveAsCopy(PdfWriteCallback pdfWriteCallback, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57112(pdfWriteCallback, null), interfaceC1382Vy);
    }
}
