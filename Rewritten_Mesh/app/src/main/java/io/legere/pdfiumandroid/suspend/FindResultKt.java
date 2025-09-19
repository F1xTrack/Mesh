package io.legere.pdfiumandroid.suspend;

import io.legere.pdfiumandroid.FindResult;
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

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000e\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, m22267d2 = {"Lio/legere/pdfiumandroid/suspend/FindResultKt;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/FindResult;", "findResult", "LFz;", "dispatcher", "<init>", "(Lio/legere/pdfiumandroid/FindResult;LFz;)V", "", "findNext", "(LVy;)Ljava/lang/Object;", "findPrev", "", "getSchResultIndex", "getSchCount", "LTf1;", "closeFind", "close", "()V", "Lio/legere/pdfiumandroid/FindResult;", "LFz;", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class FindResultKt implements Closeable {
    private final AbstractC0377Fz dispatcher;
    private final FindResult findResult;

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "LTf1;", "<anonymous>", "(LLz;)V"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.FindResultKt$closeFind$2", m25815f = "FindResultKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.FindResultKt$closeFind$2 */
    public static final class C56972 extends AbstractC9714i71 implements Function2 {
        int label;

        public C56972(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return FindResultKt.this.new C56972(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C56972) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            FindResultKt.this.findResult.closeFind();
            return C8313Tf1.f11463a;
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)Z"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.FindResultKt$findNext$2", m25815f = "FindResultKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.FindResultKt$findNext$2 */
    public static final class C56982 extends AbstractC9714i71 implements Function2 {
        int label;

        public C56982(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return FindResultKt.this.new C56982(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C56982) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return Boolean.valueOf(FindResultKt.this.findResult.findNext());
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)Z"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.FindResultKt$findPrev$2", m25815f = "FindResultKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.FindResultKt$findPrev$2 */
    public static final class C56992 extends AbstractC9714i71 implements Function2 {
        int label;

        public C56992(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return FindResultKt.this.new C56992(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C56992) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return Boolean.valueOf(FindResultKt.this.findResult.findPrev());
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.FindResultKt$getSchCount$2", m25815f = "FindResultKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.FindResultKt$getSchCount$2 */
    public static final class C57002 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57002(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return FindResultKt.this.new C57002(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57002) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Integer(FindResultKt.this.findResult.getSchCount());
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "", "<anonymous>", "(LLz;)I"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.FindResultKt$getSchResultIndex$2", m25815f = "FindResultKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.FindResultKt$getSchResultIndex$2 */
    public static final class C57012 extends AbstractC9714i71 implements Function2 {
        int label;

        public C57012(InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return FindResultKt.this.new C57012(interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57012) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new Integer(FindResultKt.this.findResult.getSchResultIndex());
        }
    }

    public FindResultKt(FindResult findResult, AbstractC0377Fz abstractC0377Fz) {
        O90.m5968f(findResult, "findResult");
        O90.m5968f(abstractC0377Fz, "dispatcher");
        this.findResult = findResult;
        this.dispatcher = abstractC0377Fz;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.findResult.closeFind();
    }

    public final Object closeFind(InterfaceC1382Vy interfaceC1382Vy) {
        Object objM18233e = AbstractC9366fP1.m18233e(this.dispatcher, new C56972(null), interfaceC1382Vy);
        return objM18233e == EnumC0817Mz.f7418a ? objM18233e : C8313Tf1.f11463a;
    }

    public final Object findNext(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C56982(null), interfaceC1382Vy);
    }

    public final Object findPrev(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C56992(null), interfaceC1382Vy);
    }

    public final Object getSchCount(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57002(null), interfaceC1382Vy);
    }

    public final Object getSchResultIndex(InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57012(null), interfaceC1382Vy);
    }
}
