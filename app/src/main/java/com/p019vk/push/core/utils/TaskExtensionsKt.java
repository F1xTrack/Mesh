package com.p019vk.push.core.utils;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import p000.AbstractC0377Fz;
import p000.AbstractC8418Vg0;
import p000.AbstractC9366fP1;
import p000.AbstractC9714i71;
import p000.C8313Tf1;
import p000.EnumC0817Mz;
import p000.InterfaceC0754Lz;
import p000.InterfaceC1382Vy;
import p000.InterfaceC6497nZ;
import p000.InterfaceC7124xD;
import p000.InterfaceC8088Ox0;
import p000.K81;
import p000.N02;
import p000.O90;
import p000.OS0;
import p000.PS0;
import p000.Q81;
import p000.RQ1;

@Metadata(m22266d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m22267d2 = {"T", "LLz;", "Lkotlin/Function1;", "LVy;", "LPS0;", "", "taskResult", "LQ81;", "wrapInTask", "(LLz;LnZ;)LQ81;", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TaskExtensionsKt {

    @Metadata(m22266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m22267d2 = {"T", "LK81;", "LQ81;", "LTf1;", "invoke", "(LK81;)V", "<anonymous>"}, m22268k = 3, m22269mv = {1, 7, 1})
    /* renamed from: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1 */
    public static final class C24291 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

        /* renamed from: e */
        public final /* synthetic */ InterfaceC0754Lz f20603e;

        /* renamed from: f */
        public final /* synthetic */ InterfaceC6497nZ f20604f;

        @Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m22267d2 = {"T", "LLz;", "LTf1;", "<anonymous>", "(LLz;)V"}, m22268k = 3, m22269mv = {1, 7, 1})
        @InterfaceC7124xD(m25814c = "com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1$1", m25815f = "TaskExtensions.kt", m25816l = {17}, m25817m = "invokeSuspend")
        /* renamed from: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC9714i71 implements Function2 {

            /* renamed from: a */
            public int f20605a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC6497nZ f20606b;

            /* renamed from: c */
            public final /* synthetic */ K81 f20607c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC6497nZ interfaceC6497nZ, K81 k81, InterfaceC1382Vy interfaceC1382Vy) {
                super(2, interfaceC1382Vy);
                this.f20606b = interfaceC6497nZ;
                this.f20607c = k81;
            }

            @Override // p000.AbstractC1300Uf
            public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
                return new AnonymousClass1(this.f20606b, this.f20607c, interfaceC1382Vy);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
                return ((AnonymousClass1) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
            }

            @Override // p000.AbstractC1300Uf
            public final Object invokeSuspend(Object obj) {
                EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
                int i = this.f20605a;
                if (i == 0) {
                    RQ1.m7017d(obj);
                    this.f20605a = 1;
                    obj = this.f20606b.invoke(this);
                    if (obj == enumC0817Mz) {
                        return enumC0817Mz;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                Object obj2 = ((PS0) obj).f9075a;
                boolean z = obj2 instanceof OS0;
                K81 k81 = this.f20607c;
                if (!z) {
                    k81.m4569b(obj2);
                }
                Throwable thM6365a = PS0.m6365a(obj2);
                if (thM6365a != null) {
                    k81.m4568a(thM6365a);
                }
                return C8313Tf1.f11463a;
            }

            public final Object invokeSuspend$$forInline(Object obj) {
                Object obj2 = ((PS0) this.f20606b.invoke(this)).f9075a;
                boolean z = obj2 instanceof OS0;
                K81 k81 = this.f20607c;
                if (!z) {
                    k81.m4569b(obj2);
                }
                Throwable thM6365a = PS0.m6365a(obj2);
                if (thM6365a != null) {
                    k81.m4568a(thM6365a);
                }
                return C8313Tf1.f11463a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24291(InterfaceC0754Lz interfaceC0754Lz, InterfaceC6497nZ interfaceC6497nZ) {
            super(1);
            this.f20603e = interfaceC0754Lz;
            this.f20604f = interfaceC6497nZ;
        }

        @Override // p000.InterfaceC6497nZ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((K81) obj);
            return C8313Tf1.f11463a;
        }

        public final void invoke(K81 k81) {
            O90.m5968f(k81, "$this$create");
            AbstractC9366fP1.m18230b(this.f20603e, null, new AnonymousClass1(this.f20604f, k81, null), 3);
        }
    }

    public static final <T> Q81 wrapInTask(final InterfaceC0754Lz interfaceC0754Lz, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(interfaceC0754Lz, "<this>");
        O90.m5968f(interfaceC6497nZ, "taskResult");
        C24291 c24291 = new C24291(interfaceC0754Lz, interfaceC6497nZ);
        Q81 q81 = new Q81();
        c24291.invoke((Object) new K81(q81));
        AbstractC0377Fz abstractC0377Fz = (AbstractC0377Fz) interfaceC0754Lz.mo2469b().mo937g(AbstractC0377Fz.f3499b);
        Executor executorM5506d = abstractC0377Fz != null ? N02.m5506d(abstractC0377Fz) : null;
        if (executorM5506d == null) {
            q81.m6584a(new InterfaceC8088Ox0(interfaceC0754Lz) { // from class: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$2$1
                @Override // p000.InterfaceC8088Ox0
                public final void onComplete(Throwable th) {
                }
            }, null);
        } else {
            q81.m6584a(new InterfaceC8088Ox0(interfaceC0754Lz) { // from class: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$2$2
                @Override // p000.InterfaceC8088Ox0
                public final void onComplete(Throwable th) {
                }
            }, executorM5506d);
        }
        return q81;
    }
}
