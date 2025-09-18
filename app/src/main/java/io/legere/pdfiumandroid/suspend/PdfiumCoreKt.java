package io.legere.pdfiumandroid.suspend;

import android.os.ParcelFileDescriptor;
import androidx.annotation.Keep;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.util.Config;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(m22266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u000b\u0010\u000fJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u000b\u0010\u0012J$\u0010\u000b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m22267d2 = {"Lio/legere/pdfiumandroid/suspend/PdfiumCoreKt;", "", "LFz;", "dispatcher", "Lio/legere/pdfiumandroid/util/Config;", "config", "<init>", "(LFz;Lio/legere/pdfiumandroid/util/Config;)V", "Landroid/os/ParcelFileDescriptor;", "fd", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "newDocument", "(Landroid/os/ParcelFileDescriptor;LVy;)Ljava/lang/Object;", "", "password", "(Landroid/os/ParcelFileDescriptor;Ljava/lang/String;LVy;)Ljava/lang/Object;", "", "data", "([BLVy;)Ljava/lang/Object;", "([BLjava/lang/String;LVy;)Ljava/lang/Object;", "LFz;", "Lio/legere/pdfiumandroid/PdfiumCore;", "coreInternal", "Lio/legere/pdfiumandroid/PdfiumCore;", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PdfiumCoreKt {
    private final PdfiumCore coreInternal;
    private final AbstractC0377Fz dispatcher;

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "<anonymous>", "(LLz;)Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$2", m25815f = "PdfiumCoreKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$2 */
    public static final class C57442 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ ParcelFileDescriptor $fd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57442(ParcelFileDescriptor parcelFileDescriptor, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$fd = parcelFileDescriptor;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfiumCoreKt.this.new C57442(this.$fd, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57442) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new PdfDocumentKt(PdfiumCoreKt.this.coreInternal.newDocument(this.$fd), PdfiumCoreKt.this.dispatcher);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "<anonymous>", "(LLz;)Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$4", m25815f = "PdfiumCoreKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$4 */
    public static final class C57454 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ ParcelFileDescriptor $fd;
        final /* synthetic */ String $password;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57454(ParcelFileDescriptor parcelFileDescriptor, String str, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$fd = parcelFileDescriptor;
            this.$password = str;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfiumCoreKt.this.new C57454(this.$fd, this.$password, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57454) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new PdfDocumentKt(PdfiumCoreKt.this.coreInternal.newDocument(this.$fd, this.$password), PdfiumCoreKt.this.dispatcher);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "<anonymous>", "(LLz;)Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$6", m25815f = "PdfiumCoreKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$6 */
    public static final class C57466 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ byte[] $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57466(byte[] bArr, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$data = bArr;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfiumCoreKt.this.new C57466(this.$data, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57466) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new PdfDocumentKt(PdfiumCoreKt.this.coreInternal.newDocument(this.$data), PdfiumCoreKt.this.dispatcher);
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"LLz;", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "<anonymous>", "(LLz;)Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;"}, m22268k = 3, m22269mv = {2, 0, 0})
    @InterfaceC7124xD(m25814c = "io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$8", m25815f = "PdfiumCoreKt.kt", m25816l = {}, m25817m = "invokeSuspend")
    /* renamed from: io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$8 */
    public static final class C57478 extends AbstractC9714i71 implements Function2 {
        final /* synthetic */ byte[] $data;
        final /* synthetic */ String $password;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57478(byte[] bArr, String str, InterfaceC1382Vy interfaceC1382Vy) {
            super(2, interfaceC1382Vy);
            this.$data = bArr;
            this.$password = str;
        }

        @Override // p000.AbstractC1300Uf
        public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
            return PdfiumCoreKt.this.new C57478(this.$data, this.$password, interfaceC1382Vy);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
            return ((C57478) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
        }

        @Override // p000.AbstractC1300Uf
        public final Object invokeSuspend(Object obj) {
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return new PdfDocumentKt(PdfiumCoreKt.this.coreInternal.newDocument(this.$data, this.$password), PdfiumCoreKt.this.dispatcher);
        }
    }

    public PdfiumCoreKt(AbstractC0377Fz abstractC0377Fz, Config config) {
        O90.m5968f(abstractC0377Fz, "dispatcher");
        O90.m5968f(config, "config");
        this.dispatcher = abstractC0377Fz;
        this.coreInternal = new PdfiumCore(null, config, 1, null);
    }

    public final Object newDocument(ParcelFileDescriptor parcelFileDescriptor, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57442(parcelFileDescriptor, null), interfaceC1382Vy);
    }

    public final Object newDocument(ParcelFileDescriptor parcelFileDescriptor, String str, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57454(parcelFileDescriptor, str, null), interfaceC1382Vy);
    }

    public final Object newDocument(byte[] bArr, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57466(bArr, null), interfaceC1382Vy);
    }

    public /* synthetic */ PdfiumCoreKt(AbstractC0377Fz abstractC0377Fz, Config config, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            config = new Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(abstractC0377Fz, config);
    }

    public final Object newDocument(byte[] bArr, String str, InterfaceC1382Vy interfaceC1382Vy) {
        return AbstractC9366fP1.m18233e(this.dispatcher, new C57478(bArr, str, null), interfaceC1382Vy);
    }
}
