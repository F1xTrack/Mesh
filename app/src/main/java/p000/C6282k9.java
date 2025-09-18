package p000;

import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import kotlin.jvm.functions.Function2;

/* renamed from: k9 */
/* loaded from: classes2.dex */
public final class C6282k9 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ C8362Ue0 f36322a;

    /* renamed from: b */
    public final /* synthetic */ C6599p9 f36323b;

    /* renamed from: c */
    public final /* synthetic */ C7558Es0 f36324c;

    /* renamed from: d */
    public final /* synthetic */ ReadableArray f36325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6282k9(C8362Ue0 c8362Ue0, C6599p9 c6599p9, C7558Es0 c7558Es0, ReadableArray readableArray, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f36322a = c8362Ue0;
        this.f36323b = c6599p9;
        this.f36324c = c7558Es0;
        this.f36325d = readableArray;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C6282k9(this.f36322a, this.f36323b, this.f36324c, this.f36325d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6282k9 c6282k9 = (C6282k9) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2);
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        c6282k9.invokeSuspend(c8313Tf1);
        return c8313Tf1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        C6599p9 c6599p9;
        C6281k8 c6281k8;
        C8362Ue0 c8362Ue0 = this.f36322a;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        try {
            c6599p9 = this.f36323b;
            C7558Es0 c7558Es0 = this.f36324c;
        } catch (CodedException e) {
            FM1.m2585l(c8362Ue0, e);
        } catch (Throwable th) {
            FM1.m2585l(c8362Ue0, new UnexpectedException(th.toString(), th));
        }
        try {
            c6599p9.m23622e(this.f36325d, c8362Ue0);
            return C8313Tf1.f11463a;
        } finally {
        }
    }
}
