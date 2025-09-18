package com.vk.push.core.utils;

import defpackage.AbstractC0485Fz;
import defpackage.AbstractC1676Vg0;
import defpackage.AbstractC3767fP1;
import defpackage.AbstractC4286i71;
import defpackage.C1518Tf1;
import defpackage.EnumC1030Mz;
import defpackage.InterfaceC0952Lz;
import defpackage.InterfaceC1181Ox0;
import defpackage.InterfaceC1729Vy;
import defpackage.InterfaceC6099nZ;
import defpackage.InterfaceC7940xD;
import defpackage.K81;
import defpackage.N02;
import defpackage.O90;
import defpackage.OS0;
import defpackage.PS0;
import defpackage.Q81;
import defpackage.RQ1;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"T", "LLz;", "Lkotlin/Function1;", "LVy;", "LPS0;", "", "taskResult", "LQ81;", "wrapInTask", "(LLz;LnZ;)LQ81;", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TaskExtensionsKt {

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LK81;", "LQ81;", "LTf1;", "invoke", "(LK81;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
        public final /* synthetic */ InterfaceC0952Lz e;
        public final /* synthetic */ InterfaceC6099nZ f;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LLz;", "LTf1;", "<anonymous>", "(LLz;)V"}, k = 3, mv = {1, 7, 1})
        @InterfaceC7940xD(c = "com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1$1", f = "TaskExtensions.kt", l = {17}, m = "invokeSuspend")
        /* renamed from: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00051 extends AbstractC4286i71 implements Function2 {
            public int a;
            public final /* synthetic */ InterfaceC6099nZ b;
            public final /* synthetic */ K81 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00051(InterfaceC6099nZ interfaceC6099nZ, K81 k81, InterfaceC1729Vy interfaceC1729Vy) {
                super(2, interfaceC1729Vy);
                this.b = interfaceC6099nZ;
                this.c = k81;
            }

            @Override // defpackage.AbstractC1594Uf
            public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
                return new C00051(this.b, this.c, interfaceC1729Vy);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC0952Lz interfaceC0952Lz, InterfaceC1729Vy interfaceC1729Vy) {
                return ((C00051) create(interfaceC0952Lz, interfaceC1729Vy)).invokeSuspend(C1518Tf1.a);
            }

            @Override // defpackage.AbstractC1594Uf
            public final Object invokeSuspend(Object obj) {
                EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
                int i = this.a;
                if (i == 0) {
                    RQ1.d(obj);
                    this.a = 1;
                    obj = this.b.invoke(this);
                    if (obj == enumC1030Mz) {
                        return enumC1030Mz;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                Object obj2 = ((PS0) obj).a;
                boolean z = obj2 instanceof OS0;
                K81 k81 = this.c;
                if (!z) {
                    k81.b(obj2);
                }
                Throwable thA = PS0.a(obj2);
                if (thA != null) {
                    k81.a(thA);
                }
                return C1518Tf1.a;
            }

            public final Object invokeSuspend$$forInline(Object obj) {
                Object obj2 = ((PS0) this.b.invoke(this)).a;
                boolean z = obj2 instanceof OS0;
                K81 k81 = this.c;
                if (!z) {
                    k81.b(obj2);
                }
                Throwable thA = PS0.a(obj2);
                if (thA != null) {
                    k81.a(thA);
                }
                return C1518Tf1.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC0952Lz interfaceC0952Lz, InterfaceC6099nZ interfaceC6099nZ) {
            super(1);
            this.e = interfaceC0952Lz;
            this.f = interfaceC6099nZ;
        }

        @Override // defpackage.InterfaceC6099nZ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((K81) obj);
            return C1518Tf1.a;
        }

        public final void invoke(K81 k81) {
            O90.f(k81, "$this$create");
            AbstractC3767fP1.b(this.e, null, new C00051(this.f, k81, null), 3);
        }
    }

    public static final <T> Q81 wrapInTask(final InterfaceC0952Lz interfaceC0952Lz, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(interfaceC0952Lz, "<this>");
        O90.f(interfaceC6099nZ, "taskResult");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC0952Lz, interfaceC6099nZ);
        Q81 q81 = new Q81();
        anonymousClass1.invoke((Object) new K81(q81));
        AbstractC0485Fz abstractC0485Fz = (AbstractC0485Fz) interfaceC0952Lz.b().g(AbstractC0485Fz.b);
        Executor executorD = abstractC0485Fz != null ? N02.d(abstractC0485Fz) : null;
        if (executorD == null) {
            q81.a(new InterfaceC1181Ox0(interfaceC0952Lz) { // from class: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$2$1
                @Override // defpackage.InterfaceC1181Ox0
                public final void onComplete(Throwable th) {
                }
            }, null);
        } else {
            q81.a(new InterfaceC1181Ox0(interfaceC0952Lz) { // from class: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$2$2
                @Override // defpackage.InterfaceC1181Ox0
                public final void onComplete(Throwable th) {
                }
            }, executorD);
        }
        return q81;
    }
}
