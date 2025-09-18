package defpackage;

import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import kotlin.jvm.functions.Function2;

/* renamed from: k9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5448k9 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ C1592Ue0 a;
    public final /* synthetic */ C6403p9 b;
    public final /* synthetic */ C0387Es0 c;
    public final /* synthetic */ ReadableArray d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5448k9(C1592Ue0 c1592Ue0, C6403p9 c6403p9, C0387Es0 c0387Es0, ReadableArray readableArray, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.a = c1592Ue0;
        this.b = c6403p9;
        this.c = c0387Es0;
        this.d = readableArray;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C5448k9(this.a, this.b, this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C5448k9 c5448k9 = (C5448k9) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2);
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        c5448k9.invokeSuspend(c1518Tf1);
        return c1518Tf1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        C6403p9 c6403p9;
        C5445k8 c5445k8;
        C1592Ue0 c1592Ue0 = this.a;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        try {
            c6403p9 = this.b;
            C0387Es0 c0387Es0 = this.c;
        } catch (CodedException e) {
            FM1.l(c1592Ue0, e);
        } catch (Throwable th) {
            FM1.l(c1592Ue0, new UnexpectedException(th.toString(), th));
        }
        try {
            c6403p9.e(this.d, c1592Ue0);
            return C1518Tf1.a;
        } finally {
        }
    }
}
