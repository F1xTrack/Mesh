package defpackage;

import javax.crypto.Cipher;
import kotlin.jvm.functions.Function2;

/* renamed from: ab, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2163ab extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ C6846rT1 b;
    public final /* synthetic */ Cipher c;
    public final /* synthetic */ X11 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2163ab(C6846rT1 c6846rT1, Cipher cipher, X11 x11, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c6846rT1;
        this.c = cipher;
        this.d = x11;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C2163ab(this.b, this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2163ab) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        X11 x11 = this.d;
        try {
            if (i == 0) {
                RQ1.d(obj);
                C6846rT1 c6846rT1 = this.b;
                Cipher cipher = this.c;
                this.a = 1;
                obj = c6846rT1.m(cipher, this);
                if (obj == enumC1030Mz) {
                    return enumC1030Mz;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.d(obj);
            }
            C0665Ih c0665Ih = (C0665Ih) obj;
            if (c0665Ih != null) {
                return c0665Ih;
            }
            throw new C1891Ya("Couldn't get the authentication result");
        } finally {
            x11.b = false;
        }
    }
}
